package com.company.oop1.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.City;

@UiController("oop1_City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
@LoadDataBeforeShow
public class CityEdit extends StandardEditor<City> {
}