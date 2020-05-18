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
@RequestMapping(AlienConstans.SHIP_IMAGES)
@CrossOrigin
public class ShipImageResource {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getShipImage(
            @PathVariable String name
    ) throws IOException {
        ClassPathResource imgFile;
        if (ImageList.getShipList().contains(name)) {
            imgFile = new ClassPathResource("static/ships/" + name + ".jpg");
        } else {
            imgFile = new ClassPathResource("static/ships/terror-ship-2.jpg");
        }

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}