package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "OOP1_CITY")
@Entity(name = "oop1_City")
public class City extends StandardEntity {
    private static final long serialVersionUID = 287472316321265319L;


    @NotNull
    @Column(name = "NAME", nullable = false, length = 50)
    protected String name;

    @Column(name = "PHONE_CODE")
    protected Integer phoneCode;

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}