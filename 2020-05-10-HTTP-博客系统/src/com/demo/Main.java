package com.demo;

import com.peixinchen.User;

public class Main {
    public static void main(String[] args) {
        String password = "123321";

        String encrypted = User.encrypted(password);
        System.out.println(encrypted);
    }
}
