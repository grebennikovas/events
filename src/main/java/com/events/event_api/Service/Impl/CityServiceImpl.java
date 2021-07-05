package com.events.event_api.Service.Impl;

import com.events.event_api.Dao.Entity.City;
import com.events.event_api.Dao.Repos.ICityRepository;
import com.events.event_api.Service.Interface.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    ICityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City getById(long id) {
        return cityRepository.getById(id);
    }
}
