package main.java.com.teamwork.netdisc.test;
import org.junit.Test;

public class addusertesting {
    @Test
    public void addUser(){
        String username = "testing";
        String password = "12345";
        String email = "abc";

        main.java.com.teamwork.netdisc.model.UserBeanCl ubc = new main.java.com.teamwork.netdisc.model.UserBeanCl();
        ubc.addUser(username,password,email);

    }
}
