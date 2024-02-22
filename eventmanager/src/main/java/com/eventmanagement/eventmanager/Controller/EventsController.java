package com.eventmanagement.eventmanager.Controller;

import com.eventmanagement.eventmanager.Entity.Events;
import com.eventmanagement.eventmanager.Service.EventsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
public class EventsController {

    private EventsService eventsService;

    public ResponseEntity<List<Events>> getAllEvents(){
        return  ResponseEntity.status(HttpStatus.OK).body(eventsService.getEvents());
    }
}
