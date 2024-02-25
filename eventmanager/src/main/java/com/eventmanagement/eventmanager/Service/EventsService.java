package com.eventmanagement.eventmanager.Service;


import com.eventmanagement.eventmanager.Entity.Events;

import java.util.List;

public interface EventsService {

    public List<Events> getEvents();

    public void createEvent(Events event);

}
