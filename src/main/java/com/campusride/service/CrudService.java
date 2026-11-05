package com.campusride.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.model.BaseEntity;

// Generic CRUD logic shared by all services (keeps the code short)
public abstract class CrudService<T extends BaseEntity> {

    protected final JpaRepository<T, Long> repo;

    protected CrudService(JpaRepository<T, Long> repo) {
        this.repo = repo;
    }

    public List<T> findAll() {
        return repo.findAll();
    }

    public T findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource " + id + " not found"));
    }

    public T create(T entity) {
        entity.setId(null);
        return repo.save(entity);
    }

    public T update(Long id, T entity) {
        findById(id); // throws 404 if missing
        entity.setId(id);
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.delete(findById(id));
    }
}
