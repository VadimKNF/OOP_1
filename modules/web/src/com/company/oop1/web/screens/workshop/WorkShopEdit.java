package com.company.oop1.web.screens.workshop;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.WorkShop;

@UiController("oop1_WorkShop.edit")
@UiDescriptor("work-shop-edit.xml")
@EditedEntityContainer("workShopDc")
@LoadDataBeforeShow
public class WorkShopEdit extends StandardEditor<WorkShop> {
}