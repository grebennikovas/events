package com.events.event_api.Dao.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(schema = "sc_event")
@NamedEntityGraphs({
        @NamedEntityGraph(
                name = "bidGraph",
                attributeNodes = {
                        @NamedAttributeNode(value="member"),
                        @NamedAttributeNode(value="campaign"),
                        @NamedAttributeNode(value="city"),
                }
        )
})
public class Bid {
    @Id
    @Column(name="bid_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "bid_price",nullable = false)
    int price;
    @Column(name = "bid_date",nullable = false)
    Date date;
    @ManyToOne
    @JoinColumn(name = "member_id",nullable = false)
    Member member;
    @ManyToOne
    @JoinColumn(name = "campaign_id",nullable = false)
    Campaign campaign;
    @ManyToOne
    @JoinColumn(name = "city_id",nullable = false)
    City city;
}
