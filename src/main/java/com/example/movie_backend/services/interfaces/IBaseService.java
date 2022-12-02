package com.example.movie_backend.services.interfaces;

import java.util.List;

public interface IBaseService<T, ID> {
    T create(T entity);

    T update(ID id, T entity);

    T getById(ID id);

    List<T> getList();

    boolean deleteById(ID id);
}
