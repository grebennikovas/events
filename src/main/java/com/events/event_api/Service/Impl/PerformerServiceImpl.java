package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.Performer;
import com.events.event_api.Dao.Repos.IPerformerRepository;
import com.events.event_api.Service.Interface.IPerformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformerServiceImpl implements IPerformerService {
    @Autowired
    IPerformerRepository performerRepos;

    @Override
    public List<Performer> getAll() {
        return performerRepos.findAll();
    }

    @Override
    public Performer getById(long id) {
        return performerRepos.getById(id);
    }
}
