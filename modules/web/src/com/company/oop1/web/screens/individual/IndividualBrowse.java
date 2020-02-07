package com.company.oop1.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Individual;

@UiController("oop1_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {
}