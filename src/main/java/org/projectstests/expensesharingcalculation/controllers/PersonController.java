package org.projectstests.expensesharingcalculation.controllers;

import org.projectstests.expensesharingcalculation.models.Person;
import org.projectstests.expensesharingcalculation.services.PersonService;

public class PersonController extends GenericController<Person, PersonService> {

    public PersonController(PersonService service) {
        super(service);
    }
}
