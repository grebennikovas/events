package com.events.event_api.Dao.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "sc_event")
public class Hall {
    @Id
    @Column(name="hall_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "hall_name",nullable = false)
    String name;
    @Column(name = "hall_url")
    String url;
    @Column(name = "capacity")
    int capacity;
    @ManyToOne
    @JoinColumn(name = "city_id",nullable = false)
    City city;
}
