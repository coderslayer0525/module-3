package com.example.server_time.service;

import com.example.server_time.entity.Sinhvien;
import com.example.server_time.repository.SinhvienRepository;

import java.util.List;

public class SinhvienService implements ISinhvienService {
   private SinhvienRepository sinhvienRepository = new SinhvienRepository();
   @Override
   public List<Sinhvien> findAll() {
      return sinhvienRepository.findAll();
   }

   @Override
   public Sinhvien findById(Long id) {
      return null;
   }

   @Override
   public boolean save(Sinhvien sinhvien) {
      return false;
   }

   @Override
   public boolean update(Sinhvien sinhvien) {
      return false;
   }

   @Override
   public void delete(Long id) {

   }
}
