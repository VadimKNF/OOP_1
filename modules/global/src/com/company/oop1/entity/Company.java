package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("Company")
@NamePattern("%s|name")
@Table(name = "OOP1_COMPANY")
@Entity(name = "oop1_Company")
public class Company extends Customer {

    @NotNull
    @Column(name = "INN")
    protected Integer inn;

    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }
}
