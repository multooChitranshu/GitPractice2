package com.nagalakshmi.demo;

public class Multiplication implements Operator{
	private int op1,op2;
	

	public Multiplication(int op1, int op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}



	@Override
	public int perform() {
		return op1*op2;
	}


}
