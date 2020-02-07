package com.company.oop1.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Employee;

@UiController("oop1_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}