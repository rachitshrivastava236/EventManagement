package com.eventmanagement.eventmanager.Service;

import com.eventmanagement.eventmanager.Entity.Events;
import com.eventmanagement.eventmanager.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsServiceImpl implements EventsService{

    @Autowired
    private EventRepository eventRepository;
    @Override
    public List<Events> getEvents(Events events) {
        List<Events> list = eventRepository.findAll();
        return list;
    }
}
