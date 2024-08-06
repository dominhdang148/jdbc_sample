package org.dominhdang.DAO;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    T getByID(int id);

    List<T> getAll();

    void add(T t);

    void update(T t);

    void delete(T t);
}
