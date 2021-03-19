package kz.lab5.passwordprotection.rest;

import kz.lab5.passwordprotection.model.Picture;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class MainRestController {

    public String rightSideOfPassword = "RightSideOfPassword";

    public String pictureUrl = "https://s3-us-west-2.amazonaws.com/uw-s3-cdn/wp-content/uploads/sites/6/2017/11/04133712/waterfall.jpg";

    @PostMapping(value="/accessing")
    public ResponseEntity<?> accessing(@RequestBody String password) {
        if(password.contains(rightSideOfPassword)) {
            System.out.println("password is right");
            Picture picture = new Picture(pictureUrl);
            return new ResponseEntity<>(picture, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().body("Access refused!");
    }
}
