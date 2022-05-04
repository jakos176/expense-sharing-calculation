package org.projectstests.expensesharingcalculation.controllers;

import org.projectstests.expensesharingcalculation.models.GenericEntity;
import org.projectstests.expensesharingcalculation.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericController<T extends GenericEntity, R extends IGenericService<T>> {

    public final R genericService;

    @Autowired
    public GenericController(R service) {
        this.genericService = service;
    }
}
