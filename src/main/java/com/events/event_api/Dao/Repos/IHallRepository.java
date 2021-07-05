package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Hall;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHallRepository extends JpaRepository<Hall,Long> {
    @EntityGraph(value = "hallGraph")
    List<Hall> findAll();
}
