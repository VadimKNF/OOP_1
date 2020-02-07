package com.company.oop1.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.Individual;

@UiController("oop1_Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
@LoadDataBeforeShow
public class IndividualEdit extends StandardEditor<Individual> {
}