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
@RequestMapping(AlienConstans.ALIEN_IMAGES)
@CrossOrigin
public class AlienImageResource {

    @RequestMapping(value = "/{race}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getAlienImage(@PathVariable String race) throws IOException {
        ClassPathResource imgFile;
        if (ImageList.getAlienList().contains(race)) {
            imgFile = new ClassPathResource("static/aliens/" + race + ".png");
        } else {
            imgFile = new ClassPathResource("static/aliens/sectoid.png");
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}