package se331com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import se331com.rest.entity.Event;
import se331com.rest.service.EventService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {
    @Autowired
    EventService eventService;

    //get the maven web dependency
    @GetMapping("event")
    public ResponseEntity<?> getEventLists(@RequestParam(value = "_limit",required = false)
                                           Integer perpage
    ,@RequestParam(value = "_limit",required = false) Integer page
    ){
        List<Event> output = null;
        Integer eventSize = eventService.getEventSize();
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count",String.valueOf(eventSize));
        try {
            output = eventService.getEvents(perpage, page);
            return new ResponseEntity<>(output,responseHeader,HttpStatus.OK);
        }catch (IndexOutOfBoundsException ex){
            return new ResponseEntity<>(output,responseHeader,HttpStatus.OK);
        }
    }
    @GetMapping("event/{id}")
    public ResponseEntity<?> getEvent(@PathVariable("id") Long id){
        Event output = eventService.getEvent(id);
        if(output != null ){
            return ResponseEntity.ok(output);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The given id is not found");
        }
    }
}
