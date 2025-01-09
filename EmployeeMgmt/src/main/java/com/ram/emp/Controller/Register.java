package com.ram.emp.Controller;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ram.emp.model.DAOImpl.EmployeeDAOImpl;
import com.ram.emp.model.entity.Employee;

public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            int mobile = Integer.parseInt(req.getParameter("mobile"));
            String address = req.getParameter("address");
            String password = req.getParameter("password");

            Employee emp = new Employee(name, email, address, mobile, password);
            EmployeeDAOImpl empDao = new EmployeeDAOImpl();

            empDao.insertEmployee(emp);
            resp.getWriter().println("Form submitted successfully!");
        } catch (Exception e) {
            resp.getWriter().println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
