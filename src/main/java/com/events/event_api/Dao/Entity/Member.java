package com.events.event_api.Dao.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(schema = "sc_event")
public class Member {
    @Id
    @Column(name="member_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="first_name",nullable = false)
    String firstName;
    @Column(name="last_name",nullable = false)
    String lastName;
    @Column(name="middle_name",nullable = true)
    String middleName;
    @Column(name="email",nullable = false)
    String email;
    @Column(name="phone",nullable = false)
    Long phone;
    @Column(name="sms_notice",nullable = false)
    boolean smsNotice;
    @Column(name="email_notice",nullable = false)
    boolean emailNotice;
    @Column(name="birthday",nullable = false)
    Date birthday;
}
