package com.company.oop1.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.City;

@UiController("oop1_City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("citiesTable")
@LoadDataBeforeShow
public class CityBrowse extends StandardLookup<City> {
}