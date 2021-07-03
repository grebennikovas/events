package com.events.event_api.Dao.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "sc_event")
public class City {
    @Id
    @Column(name="city_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "city_name",nullable = false)
    String name;
}
