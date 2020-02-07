package com.company.oop1.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Company;

@UiController("oop1_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}