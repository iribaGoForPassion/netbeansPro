/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.igoforpassion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author w
 */
public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
     res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String names = req.getParameter("uname");
         String pass = req.getParameter("pass");
         
         
         RequestDispatcher rd = req.getRequestDispatcher("link.html");
         rd.include(req,res);
         
         if (names.equals("session") && pass.equals("admin")) {
           Cookie ck = new Cookie("uname",names);
           res.addCookie(ck);
           out.println("you are in...");
            RequestDispatcher d = req.getRequestDispatcher("profileServlet");
         d.forward(req, res);
        }
         else{
             out.println("wrong pass");
           RequestDispatcher r = req.getRequestDispatcher("index.html");
         r.forward(req, res);
             
         }
    }

  

}
