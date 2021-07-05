package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.Bid;
import com.events.event_api.Dao.Repos.IBidRepository;
import com.events.event_api.Service.Interface.IBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BidServiceImpl implements IBidService {
    @Autowired
    IBidRepository bidRepository;
    @Override
    public List<Bid> getAll() {
        return bidRepository.findAll();
    }

    @Override
    public Bid getById(long id) {
        return bidRepository.getById(id);
    }
}
