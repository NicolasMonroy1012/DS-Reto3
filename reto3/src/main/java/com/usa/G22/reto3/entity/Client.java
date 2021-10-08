package com.usa.G22.reto3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client {
    @Id
    public long id;

    @Column
    public String name;

    @Column
    public String email;

    @OneToMany
    private List<AcademicInfo> academicInfoList;
}
