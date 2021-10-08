package com.usa.G22.reto3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AcademicInfo {
    @Id
    private Long id;

    @Column
    private String instituition;
}
