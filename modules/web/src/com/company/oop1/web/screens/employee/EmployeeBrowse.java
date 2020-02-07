package com.company.oop1.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Employee;

@UiController("oop1_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}