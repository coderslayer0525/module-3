package com.example.server_time.repository;

import com.example.server_time.entity.Sinhvien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SinhvienRepository {
   private static List<Sinhvien> sinhviens = new ArrayList<>();

   static {
      sinhviens.add(new Sinhvien(1, "Sinh", LocalDate.parse("2000-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 1.0f));
      sinhviens.add(new Sinhvien(1, "Minh", LocalDate.parse("2000-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 2.0f));
      sinhviens.add(new Sinhvien(1, "TRi", LocalDate.parse("2000-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 3.0f));

   }

   public List<Sinhvien> findAll() {
      return sinhviens;
   }
}