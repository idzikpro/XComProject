package pl.idzikpro.xcom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikpro.xcom.url.AlienConstans;
import pl.idzikpro.xcom.tools.ImageList;

import java.io.IOException;

@RestController
@RequestMapping(AlienConstans.ARMOUR_IMAGES)
@CrossOrigin
public class ArmourImageResource {

    @RequestMapping(value = "/{armour}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getSoldierArmour(
            @PathVariable String armour) throws IOException {
        ClassPathResource imgFile;

        if (ImageList.getArmourList().contains(armour)) {
            imgFile = new ClassPathResource("static/armours/" + armour + ".gif");
        } else {
            imgFile = new ClassPathResource("static/armours/no-armour.gif");
        }

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}