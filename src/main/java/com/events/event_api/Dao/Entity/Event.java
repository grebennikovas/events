package com.events.event_api.Dao.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(schema = "sc_event")
public class Event {
    @Id
    @Column(name="event_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "event_name",nullable = false)
    String name;
    @Column(name = "event_date",nullable = false)
    Date date;
    @Column(name = "age_limit",nullable = false)
    int ageLimit;
    @ManyToOne
    @JoinColumn(name = "campaign_id",nullable = false)
    Campaign campaign;
    @ManyToOne
    @JoinColumn(name = "hall_id",nullable = false)
    Hall hall;
}
