package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHallRepository extends JpaRepository<Hall,Long> {
}
