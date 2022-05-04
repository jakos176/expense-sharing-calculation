package org.projectstests.expensesharingcalculation.controllers;

import org.projectstests.expensesharingcalculation.models.Spent;
import org.projectstests.expensesharingcalculation.services.SpentService;

public class SpentController extends GenericController<Spent, SpentService> {

    public SpentController(SpentService service) {
        super(service);
    }
}
