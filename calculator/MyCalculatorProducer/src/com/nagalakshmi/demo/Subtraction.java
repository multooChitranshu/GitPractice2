package com.nagalakshmi.demo;

public class Subtraction implements Operator{
	private int op1,op2;

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	@Override
	public int perform() {
		return op1-op2;
	}


}
