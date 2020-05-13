package pl.idzikpro.xcom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikpro.xcom.url.AlienConstans;
import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.mappers.CraftResultToCraftEntityMapper;
import pl.idzikpro.xcom.repository.CraftRepository;
import pl.idzikpro.xcom.tools.CraftService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.CRAFT_V1)
@CrossOrigin
public class CraftResource {
    @Autowired
    CraftRepository craftRepository;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CraftEntity>> getCrafts() {
        List<CraftEntity> craftList = craftRepository.findAll();
        return new ResponseEntity<>(craftList, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CraftEntity> getCraftById(
            @PathVariable Integer id
    ) {
        Optional<CraftEntity> craftEntityOptional = craftRepository.findById(id);
        if (craftEntityOptional.isPresent()) return new ResponseEntity<>(craftEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<CraftEntity> addCraft(
            @RequestBody CraftEntity craftEntity) {
//        CraftEntity result= CraftResultToCraftEntityConverter.convert(craftEntity, craftEntity);
        return new ResponseEntity<>(craftRepository.save(craftEntity), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<CraftEntity> updateShip(
            @PathVariable Integer id,
            @RequestBody CraftEntity craftEntity) {
        Optional<CraftEntity> craftResult = craftRepository.findById(id);
        if (craftResult.isPresent()) {
            CraftEntity result= CraftResultToCraftEntityMapper.convert(craftEntity, craftResult.get());
            craftRepository.save(craftResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "random", method = RequestMethod.POST)
    public ResponseEntity<CraftEntity> addCraftByName(
            @RequestParam String name
    ) {
        CraftEntity craftEntity = CraftService.addCraft(name);
//        CraftEntity result= CraftResultToCraftEntityConverter.convert(craftEntity, craftEntity);
        return new ResponseEntity<>(craftRepository.save(craftEntity), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<CraftEntity> deleteShip(
            @PathVariable Integer id) {
        Optional<CraftEntity> craftResult = craftRepository.findById(id);
        if (craftResult.isPresent()) {
            craftRepository.delete(craftResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "",method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAllCraft(){
        craftRepository.deleteAll();
        return new ResponseEntity(HttpStatus.OK);
    }
}
