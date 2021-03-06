package pl.idzikpro.xcom.rest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikpro.xcom.url.AlienConstans;
import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.mappers.AlienResultToAlienEntityMapper;
import pl.idzikpro.xcom.repository.AlienRepository;
import pl.idzikpro.xcom.tools.AlienService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.ALIEN_V1)
@CrossOrigin
public class AlienResource {
    @Autowired
    AlienRepository alienRepository;

    @ApiOperation(value = "find all aliens", notes = "the method find all aliens stored in database")
    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<AlienEntity>> getAliens() {
        List<AlienEntity> alienList = alienRepository.findAll();
        return new ResponseEntity<>(alienList, HttpStatus.OK);
    }

    @ApiOperation(value = "find alien by id", notes = "the method find alien by id")
    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AlienEntity> getAlienById(
            @ApiParam(value = "unique id of alien") @PathVariable String id
    ) {
        Optional<AlienEntity> alienEntityOptional = alienRepository.findById(Integer.valueOf(id));
        if (alienEntityOptional.isPresent()) return new ResponseEntity<>(alienEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<AlienEntity> addAlien(
            @RequestBody AlienEntity alienEntity) {
        AlienEntity newAlien = new AlienEntity();
        return new ResponseEntity<>(alienRepository.save(alienEntity), HttpStatus.OK);
    }

    @RequestMapping(path = "random", method = RequestMethod.POST)
    public ResponseEntity<AlienEntity> addRandomAlien(
            @RequestParam String race,
            @RequestParam String rank
    ) {
        AlienEntity alienEntity = AlienService.addAlien(race, rank);
        return new ResponseEntity<>(alienRepository.save(alienEntity), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<AlienEntity> updateAlien(
            @PathVariable Integer id,
            @RequestBody AlienEntity alienEntity) {
        Optional<AlienEntity> alienResult = alienRepository.findById(id);
        if (alienResult.isPresent()) {
            alienRepository.save(AlienResultToAlienEntityMapper.convert(alienEntity, alienResult.get()));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<AlienEntity> deleteAlien(
            @PathVariable Integer id) {
        Optional<AlienEntity> alienResult = alienRepository.findById(id);
        if (alienResult.isPresent()) {
            alienRepository.delete(alienResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAllAliens() {
        alienRepository.deleteAll();
        return new ResponseEntity(HttpStatus.OK);
    }
}