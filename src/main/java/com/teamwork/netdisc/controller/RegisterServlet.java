package main.java.com.teamwork.netdisc.controller;

import main.java.com.teamwork.netdisc.model.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        UserBean newuser = new UserBean(username, password, email);
        System.out.println(newuser.toString());
        main.java.com.teamwork.netdisc.model.UserBeanCl ubc = new main.java.com.teamwork.netdisc.model.UserBeanCl();
        ubc.addUser(username,password,email);

    }
}
