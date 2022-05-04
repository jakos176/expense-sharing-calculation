package org.projectstests.expensesharingcalculation.services;

import org.projectstests.expensesharingcalculation.models.Person;
import org.projectstests.expensesharingcalculation.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<Person, PersonRepository> {

    public PersonService(PersonRepository repository) {
        super(repository);
    }
}
