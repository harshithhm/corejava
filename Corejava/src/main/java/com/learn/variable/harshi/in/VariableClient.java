package com.learn.variable.harshi.in;

public class VariableClient {
	public static void main(String[] args) {
		VariableDemo demo=new VariableDemo();	
		VariableDemo demo1=new VariableDemo();	
		VariableDemo.setStaticVariable("values set");
		demo.setStaticVariable("ststicblocintialised");
		demo1.setStaticVariable("ststicblocintialised11111");
		demo.setInstanceVariable("instanceblocintialised");
		demo1.setInstanceVariable("instanceblocintialised1111");
		demo1.setStaticVariable("ststicblocintialised11111");
		System.out.println(demo.getStaticVariable());
		System.out.println(demo1.getStaticVariable());
		System.out.println(demo.getInstanceVariable());
		System.out.println(demo1.getInstanceVariable());
	/*System.out.println(VariableDemo.getStaticVariable());
	VariableDemo.setStaticVariable("sfdsafdsvgdsvg");
	System.out.println(VariableDemo.getStaticVariable());*/
	}


}
