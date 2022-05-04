package org.projectstests.expensesharingcalculation.services;

import org.projectstests.expensesharingcalculation.models.GenericEntity;

import java.util.List;

public interface IGenericService<T extends GenericEntity> {

    List<T> findAll();

    T findById(Long id);

    T add(T entity);

    void delete(Long id);

    T update(Long id, T entity);

}