package com.example.server_time.controller;

import com.example.server_time.service.ISinhvienService;
import com.example.server_time.service.SinhvienService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/sinhvien", name = "sinhvienController")
public class SinhvienServlet extends HttpServlet {

   private ISinhvienService sinhvienService = new SinhvienService();
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
      req.setAttribute("sinhviens", sinhvienService.findAll());
      req.getRequestDispatcher("/WEB-INF/sinhvien/list.jsp").forward(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");

   }
}