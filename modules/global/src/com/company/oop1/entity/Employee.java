package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;


@NamePattern("%s|firstName")
@Table(name = "OOP1_EMPLOYEE")
@Entity(name = "oop1_Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -853247596786129053L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 30)
    protected String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false, length = 30)
    protected String lastName;

    @Column(name = "BIRTH_DATE")
    protected LocalDate birthDate;

    @Column(name = "EMAIL", length = 30)
    protected String email;

    @NotNull
    @Column(name = "SALARY", nullable = false)
    protected BigDecimal salary;

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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}