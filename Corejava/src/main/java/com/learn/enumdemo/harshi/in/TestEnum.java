package com.learn.enumdemo.harshi.in;

public class TestEnum {

    public static void main(String[] args) {

		//enum valueOf + uppercase
        EnumMethod op = EnumMethod.valueOf("ADD");
        System.out.println(op.getcalucation(10, 3));

    }
}