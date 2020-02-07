package com.company.oop1.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Service;

@UiController("oop1_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
public class ServiceEdit extends StandardEditor<Service> {
}