package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event,Long> {
}
