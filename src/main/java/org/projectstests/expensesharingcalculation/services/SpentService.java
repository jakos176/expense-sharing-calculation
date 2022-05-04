package org.projectstests.expensesharingcalculation.services;

import org.projectstests.expensesharingcalculation.models.Spent;
import org.projectstests.expensesharingcalculation.repository.SpentRepository;
import org.springframework.stereotype.Service;

@Service
public class SpentService extends GenericService<Spent, SpentRepository> {

    public SpentService(SpentRepository repository) {
        super(repository);
    }
}
