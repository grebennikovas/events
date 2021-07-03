package com.events.event_api.Dao.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name= "campaign", schema = "sc_event")
public class Campaign {
    @Id
    @Column(name="campaign_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="campaign_start",nullable = false)
    Timestamp start;
    @Column(name="campaign_end")
    Timestamp end;
    @ManyToOne
    @JoinColumn(name = "performer_id",nullable = false)
    Performer performer;
}
