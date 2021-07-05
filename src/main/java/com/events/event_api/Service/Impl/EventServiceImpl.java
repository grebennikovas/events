package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.Event;
import com.events.event_api.Dao.Repos.IEventRepository;
import com.events.event_api.Service.Interface.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements IEventService {
    @Autowired
    IEventRepository eventRepository;
    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event getById(long id) {
        return eventRepository.getById(id);
    }
}
