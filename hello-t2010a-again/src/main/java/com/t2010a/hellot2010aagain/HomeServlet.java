package com.t2010a.hellot2010aagain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        //xử lí logic
        //xử lí, lấy dữ liệu ở database
        req.setAttribute("firstName",firstName);
        req.setAttribute("lastName",lastName);
        req.getRequestDispatcher("/home.jsp").forward(req,resp);
    }
}