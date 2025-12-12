package com.example.server_time.entity;

import java.time.LocalDate;

public class Sinhvien {
   private Integer id;
   private String name;
   private LocalDate dob;
   private Float score;

   public Sinhvien() {
   }

   public Sinhvien(Integer id, String name, LocalDate dob, Float score) {
      this.id = id;
      this.name = name;
      this.dob = dob;
      this.score = score;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public LocalDate getDob() {
      return dob;
   }

   public void setDob(LocalDate dob) {
      this.dob = dob;
   }

   public Float getScore() {
      return score;
   }

   public void setScore(Float score) {
      this.score = score;
   }
}
