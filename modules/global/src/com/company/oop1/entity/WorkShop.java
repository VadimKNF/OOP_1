package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "OOP1_WORK_SHOP")
@Entity(name = "oop1_WorkShop")
public class WorkShop extends StandardEntity {
    private static final long serialVersionUID = -3585493915365684306L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 30)
    protected String name;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    protected Integer phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID")
    protected City city;

    @Column(name = "ADDRESS")
    protected String address;

    @OneToMany(mappedBy = "workShop")
    protected List<Employee> employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    protected Service service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_SHOP_ID")
    protected WorkShop workShop;

    @OneToMany(mappedBy = "workShop")
    protected List<WorkShop> customer;

    public List<WorkShop> getCustomer() {
        return customer;
    }

    public void setCustomer(List<WorkShop> customer) {
        this.customer = customer;
    }

    public WorkShop getWorkShop() {
        return workShop;
    }

    public void setWorkShop(WorkShop workShop) {
        this.workShop = workShop;
    }


    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }


    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}