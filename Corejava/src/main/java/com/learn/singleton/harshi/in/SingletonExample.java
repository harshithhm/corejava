package com.learn.singleton.harshi.in;

public class SingletonExample {
private static SingletonExample example=null;
public static SingletonExample getSingletonExample() {
	if (example==null) {
		System.out.println("exceuting once");
	 example=new SingletonExample();
	}
	return example;
}
}
