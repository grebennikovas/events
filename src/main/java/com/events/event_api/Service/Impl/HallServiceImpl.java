package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.Hall;
import com.events.event_api.Dao.Repos.IHallRepository;
import com.events.event_api.Service.Interface.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallServiceImpl implements IHallService {
    @Autowired
    IHallRepository hallRepository;
    @Override
    public List<Hall> getAll() {
        return hallRepository.findAll();
    }

    @Override
    public Hall getById(long id) {
        return hallRepository.getById(id);
    }
}
