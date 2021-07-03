package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Performer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerformerRepository extends JpaRepository<Performer, Long> {
}