package com.orkun.utility;

import java.util.List;
import java.util.Optional;

public interface IService <T, ID>
{
    T save(T t);
    Iterable<T> saveAll(Iterable<T> entities);
    T update(T t);
    void delete(T t);
    void deleteById(ID id);
    Optional<T> findByID(ID id);
    List<T> findAll();

}
