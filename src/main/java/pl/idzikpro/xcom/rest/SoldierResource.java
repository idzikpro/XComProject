package pl.idzikpro.xcom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikpro.xcom.tools.SoldierNameService;
import pl.idzikpro.xcom.url.AlienConstans;
import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.mappers.SoldierResultToSoldierEntityMapper;
import pl.idzikpro.xcom.repository.SoldierRepository;
import pl.idzikpro.xcom.tools.SoldierService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.SOLDIER_V1)
@CrossOrigin
public class SoldierResource {
    @Autowired
    SoldierRepository soldierRepository;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<SoldierEntity>> getSoldiers() {
        SoldierNameService.showNames();
        List<SoldierEntity> alienList = soldierRepository.findAll();
        return new ResponseEntity<>(alienList, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SoldierEntity> getSoldierById(
            @PathVariable Integer id
    ) {
        Optional<SoldierEntity> soldierEntityOptional = soldierRepository.findById(id);
        if (soldierEntityOptional.isPresent()) return new ResponseEntity<>(soldierEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<SoldierEntity> addSoldier(
            @RequestBody SoldierEntity soldierEntity) {
        SoldierEntity newSoldier = new SoldierEntity();
        return new ResponseEntity<>(soldierRepository.save(new SoldierResultToSoldierEntityMapper().convert(soldierEntity, newSoldier)), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<SoldierEntity> updateSoldier(
            @PathVariable Integer id,
            @RequestBody SoldierEntity soldierEntity) {
        Optional<SoldierEntity> soldierResult = soldierRepository.findById(id);
        if (soldierResult.isPresent()) {
            soldierRepository.save(new SoldierResultToSoldierEntityMapper().convert(soldierEntity, soldierResult.get()));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<SoldierEntity> deleteSoldier(
            @PathVariable Integer id) {
        Optional<SoldierEntity> soldierResult = soldierRepository.findById(id);
        if (soldierResult.isPresent()) {
            SoldierNameService.addOneNameToList(soldierResult.get().getName(), soldierResult.get().getNationality());
            soldierRepository.delete(soldierResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAllSoldiers() {
        soldierRepository.deleteAll();
        SoldierNameService.deleteNames();
        String names[] = {"american", "british", "french", "german", "japanese", "russian"};
        for (String name : names
        ) {
            SoldierNameService.fillNames(name);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(path = "random", method = RequestMethod.POST)
    public ResponseEntity<SoldierEntity> addSoldierByRank(
            @RequestParam String rank
    ) {

        SoldierEntity soldierEntity = SoldierService.addRandomSoldier(rank);
        SoldierEntity result = new SoldierResultToSoldierEntityMapper().convert(soldierEntity, soldierEntity);
        return new ResponseEntity<>(soldierRepository.save(result), HttpStatus.OK);
    }
}