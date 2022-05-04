package org.projectstests.expensesharingcalculation.repository;

import org.projectstests.expensesharingcalculation.models.GenericEntity;
import org.springframework.data.repository.CrudRepository;

interface GenericRepository extends CrudRepository<GenericEntity, Long> {
}
