package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("Customer")
@Table(name = "OOP1_CUSTOMER")
@Entity(name = "oop1_Customer")
@NamePattern("%s|name")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -257778814127055355L;

    @Column(name = "NAME", length = 50)
    protected String name;

    @Column(name = "PHONE")
    protected Integer phone;

    @Column(name = "EMAIL", length = 50)
    protected String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_SHOP_ID")
    protected WorkShop workShop;

    public WorkShop getWorkShop() {
        return workShop;
    }

    public void setWorkShop(WorkShop workShop) {
        this.workShop = workShop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}