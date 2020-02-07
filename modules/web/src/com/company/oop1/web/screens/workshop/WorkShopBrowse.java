package com.company.oop1.web.screens.workshop;

import com.haulmont.cuba.gui.screen.*;
import com.company.oop1.entity.WorkShop;

@UiController("oop1_WorkShop.browse")
@UiDescriptor("work-shop-browse.xml")
@LookupComponent("workShopsTable")
@LoadDataBeforeShow
public class WorkShopBrowse extends StandardLookup<WorkShop> {
}