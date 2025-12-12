package com.example.server_time.service;

import java.util.List;

public interface IService<T> {
   List<T> findAll();
   T findById(Long id);
   boolean save(T t);
   boolean update(T t);
   void delete(Long id);
}
