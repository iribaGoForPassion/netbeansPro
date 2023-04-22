/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.igoforpassion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author w
 */
public class logoutServlet extends HttpServlet {


  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
      PrintWriter out = res.getWriter();
      res.setContentType("text/html");
      
      Cookie c = new Cookie("uname","");
      c.setMaxAge(0);
      res.addCookie(c);
      
      out.println("you are logged out");
    }

  
   
}
