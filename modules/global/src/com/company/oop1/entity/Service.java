package com.company.oop1.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|employee")
@Table(name = "OOP1_SERVICE")
@Entity(name = "oop1_Service")
public class Service extends StandardEntity {
    private static final long serialVersionUID = 5212911261758256571L;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "service")
    protected List<WorkShop> workShop;

    public List<WorkShop> getWorkShop() {
        return workShop;
    }

    public void setWorkShop(List<WorkShop> workShop) {
        this.workShop = workShop;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_ID")
    protected Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}