package com.events.event_api.Service.Interface;

import com.events.event_api.Dao.Entity.Performer;

import java.util.List;

public interface IPerformerService {
    List<Performer> getAll();
    Performer getById(long id);
}
