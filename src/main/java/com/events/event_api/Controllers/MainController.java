package com.events.event_api.Controllers;

import com.events.event_api.Dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MainController {

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ResponseEntity<Response<String>> getIndex(){
        return new ResponseEntity<>(new Response<>("","first string of project"), HttpStatus.OK);
    }
}
