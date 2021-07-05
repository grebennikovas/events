package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedEntityGraph;

@NamedEntityGraph
public interface IBidRepository extends JpaRepository<Bid,Long> {
}
