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
@RequestMapping(AlienConstans.CRAFT_IMAGES)
@CrossOrigin
public class CraftImageResource {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getShipImage(
            @PathVariable String name
    ) throws IOException {
        ClassPathResource imgFile;
        if (ImageList.getCraftlist().contains(name)) {
            imgFile = new ClassPathResource("static/craft/" + name + ".png");
        } else {
            imgFile = new ClassPathResource("static/craft/skyranger-3.png");
        }

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}