package com.events.event_api.Dao.Repos;

import com.events.event_api.Dao.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMemberRepository extends JpaRepository<Member,Long> {
}
