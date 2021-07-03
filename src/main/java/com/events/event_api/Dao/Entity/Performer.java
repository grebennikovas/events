package com.events.event_api.Dao.Entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
@Data
@Entity
@Table(name= "performer", schema = "sc_event")
public class Performer {
    @Id
    @Column(name="performer_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="performer_name",nullable = false)
    String name;
    @Column(name="performer_url")
    String url;
}
