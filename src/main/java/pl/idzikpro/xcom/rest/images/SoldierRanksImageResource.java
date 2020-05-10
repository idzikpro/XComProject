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
@RequestMapping(AlienConstans.RANK_IMAGES)
@CrossOrigin
public class SoldierRanksImageResource {

    @RequestMapping(value = "/{rank}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getImageRank(@PathVariable String rank) throws IOException {
        ClassPathResource imgFile;
        if (ImageList.getSoldierList().contains(rank)) {
            imgFile = new ClassPathResource("static/ranks/" + rank + ".gif");
        } else {
            imgFile = new ClassPathResource("static/ranks/rookie.gif");
        }

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}

