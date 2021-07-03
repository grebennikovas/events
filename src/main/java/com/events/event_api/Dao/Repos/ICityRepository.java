package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City,Long> {
}
