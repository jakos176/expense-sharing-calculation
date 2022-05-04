package org.projectstests.expensesharingcalculation.repository;

import org.projectstests.expensesharingcalculation.models.GenericEntity;
import org.springframework.data.repository.CrudRepository;

public interface GenericRepository<T extends GenericEntity> extends CrudRepository<GenericEntity, Long> {
}
