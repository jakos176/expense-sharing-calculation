package org.projectstests.expensesharingcalculation.services;

import org.projectstests.expensesharingcalculation.models.GenericEntity;
import org.projectstests.expensesharingcalculation.repository.GenericRepository;

import java.util.List;

public class GenericService<T extends GenericEntity, R extends GenericRepository<T>> implements IGenericService<T> {

    private final R genericRepository;

    public GenericService(R repository) {
        this.genericRepository = repository;
    }

    public List<T> findAll() {
        return (List<T>) genericRepository.findAll();
    }

    @Override
    public T findById(Long id) {
        return null;
    }

    @Override
    public T add(T entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public T update(Long id, T entity) {
        return null;
    }
}
