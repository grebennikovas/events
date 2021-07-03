package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Campaign;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICampaignRepository extends JpaRepository<Campaign,Long> {

    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "performer"
            }
    )
    List<Campaign> findAll();
}
