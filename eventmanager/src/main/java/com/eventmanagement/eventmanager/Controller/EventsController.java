package com.eventmanagement.eventmanager.Controller;

import com.eventmanagement.eventmanager.Entity.Events;
import com.eventmanagement.eventmanager.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
public class EventsController {

    @Autowired
    private EventsService eventsService;

    @GetMapping(path = "/getAllEvents")
    public ResponseEntity<List<Events>> getAllEvents(){
        return  ResponseEntity.status(HttpStatus.OK).body(eventsService.getEvents());
    }

    @PostMapping(path = "/createEvent")
    public ResponseEntity<?> createUser(@RequestBody Events event){
        System.out.println(event.getEventName());
        eventsService.createEvent(event);
        return ResponseEntity.status(HttpStatus.CREATED).body("New Event Created : " + event.getEventId());
    }
}
