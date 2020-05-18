package pl.idzikpro.xcom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikpro.xcom.url.AlienConstans;
import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.mappers.ShipResultToShipEntityMapper;
import pl.idzikpro.xcom.repository.AlienRepository;
import pl.idzikpro.xcom.repository.ShipRepository;
import pl.idzikpro.xcom.tools.ShipService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.SHIP_V1)
@CrossOrigin
public class ShipResource {
    @Autowired
    ShipRepository shipRepository;

    @Autowired
    AlienRepository alienRepository;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ShipEntity>> getShips() {
        List<ShipEntity> shipList = shipRepository.findAll();
        return new ResponseEntity<>(shipList, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ShipEntity> getShipById(
            @PathVariable Integer id
    ) {
        Optional<ShipEntity> shipEntityOptional = shipRepository.findById(id);
        if (shipEntityOptional.isPresent()) return new ResponseEntity<>(shipEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<ShipEntity> addShip(
            @RequestBody ShipEntity shipEntity) {
        ShipEntity result = ShipResultToShipEntityMapper.convert(shipEntity, shipEntity);
        return new ResponseEntity<>(shipRepository.save(result), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ShipEntity> updateShip(
            @PathVariable Integer id,
            @RequestBody ShipEntity shipEntity) {
        Optional<ShipEntity> shipResult = shipRepository.findById(id);
        if (shipResult.isPresent()) {
            ShipEntity result = ShipResultToShipEntityMapper.convert(shipEntity, shipResult.get());
            shipRepository.save(result);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<ShipEntity> deleteShip(
            @PathVariable Integer id) {
        Optional<ShipEntity> shipResult = shipRepository.findById(id);
        if (shipResult.isPresent()) {
            shipRepository.delete(shipResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAllShips() {
        shipRepository.deleteAll();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(path = "random", method = RequestMethod.POST)
    public ResponseEntity<ShipEntity> addShipByName(
            @RequestParam String name
    ) {
        ShipEntity shipEntity = ShipService.addShip(name);
        // ShipEntity result= ShipResultToShipEntityConverter.convert(shipEntity, shipEntity);
        return new ResponseEntity<>(shipRepository.save(shipEntity), HttpStatus.OK);
    }

    @RequestMapping(path = "random", method = RequestMethod.PUT)
    public ResponseEntity<ShipEntity> addAlienToShip(
            @RequestParam int alienId,
            @RequestParam int shipId) {
        Optional<AlienEntity> alienEntityOptional = alienRepository.findById(alienId);
        Optional<ShipEntity> shipEntityOptional = shipRepository.findById(shipId);
        if (alienEntityOptional.isPresent() && shipEntityOptional.isPresent()) {
            alienEntityOptional.get().setShip(shipEntityOptional.get());
            shipEntityOptional.get().addAlienToList(alienEntityOptional.get());
            alienRepository.save(alienEntityOptional.get());
            shipRepository.save(shipEntityOptional.get());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}