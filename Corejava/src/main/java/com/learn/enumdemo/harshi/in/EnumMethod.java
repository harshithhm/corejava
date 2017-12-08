package com.learn.enumdemo.harshi.in;

public enum EnumMethod {
ADD,
MINUS,
MULTIPLIER,
DIVIDER;
double getcalucation(double x,double y){
	switch (this) {
	case ADD:
		return x+y;
	case MINUS:
		return x-y;
	case MULTIPLIER:
		return x*y;
	case DIVIDER:
		return x/y;
	default:
		throw new AssertionError("Unknown operations"+this);
	}
}
}
