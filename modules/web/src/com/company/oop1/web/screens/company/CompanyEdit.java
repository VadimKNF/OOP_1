package com.company.oop1.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Company;

@UiController("oop1_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}