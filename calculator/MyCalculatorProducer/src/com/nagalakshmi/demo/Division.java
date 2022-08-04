package com.nagalakshmi.demo;

public class Division implements Operator{
	private int op1,op2;
	

	public void setOp1(int op1) {
		this.op1 = op1;
	}


	public void setOp2(int op2) {
		this.op2 = op2;
	}


	@Override
	public int perform()  {
		int x=0;
		try {
			
			 x= op1/op2;
		}
		catch (Exception e) {
			System.out.println("exception occured :"+e);
		}
		
		return x;
	}


}
