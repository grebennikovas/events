package com.events.event_api.Controllers;

import com.events.event_api.Dao.Entity.Campaign;
import com.events.event_api.Dao.Entity.Performer;
import com.events.event_api.Dto.Response;
import com.events.event_api.Service.Interface.ICampaignService;
import com.events.event_api.Service.Interface.IPerformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class MainController {
    @Autowired
    IPerformerService performerService;
    @Autowired
    ICampaignService campaignService;

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ResponseEntity<Response<String>> getIndex(){
        return new ResponseEntity<>(new Response<>("","first string of project"), HttpStatus.OK);
    }

    @RequestMapping(value="/performer", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Performer>>> getPerformer(){
        return new ResponseEntity<>(new Response<>("",performerService.getAll()), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Campaign>>> getCampaign(){
        return new ResponseEntity<>(new Response<>("",campaignService.getAll()), HttpStatus.OK);
    }
}
