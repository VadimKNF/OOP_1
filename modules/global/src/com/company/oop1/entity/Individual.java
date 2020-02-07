package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@DiscriminatorValue("INDIVIDUAL")
@Entity(name = "oop1_Individual")
@Table(name = "OOP1_INDIVIDUAL")
@NamePattern("%s|id")
public class Individual extends Customer {

    @NotNull
    @Column(name = "PASSPORT_NO")
    protected Integer passportNo;

    public Integer getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(Integer passportNo) {
        this.passportNo = passportNo;
    }
}
