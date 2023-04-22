/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.igoforpassion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author w
 */
public class profileServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
       PrintWriter out = res.getWriter();
       res.setContentType("text/html");
       
       RequestDispatcher rd = req.getRequestDispatcher("link.html");
       rd.include(req, res);
       
       Cookie c[] =req.getCookies();
       
        if (c!= null) {
            String name = c[0].getValue();
            
            if (!name.equals("")|| name != null) {
                
                out.println("wellcome "+ name);
                
            }else{
            out.println("login please");
            RequestDispatcher r = req.getRequestDispatcher("login.html");
            r.include(req, res);
            }
            
        }
    }

   
}
