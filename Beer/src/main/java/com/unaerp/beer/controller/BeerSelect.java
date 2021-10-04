package com.exemple.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io;

public class BeerSelect extends HttpServlet{
  public vois doPost(HttpServletRequest request, HttpServletResponse response) throws IOExeption, ServletExeption{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("beer selection advice");
    String c = request.gerParameter("color");
    out.println("got beer color");
  }
}