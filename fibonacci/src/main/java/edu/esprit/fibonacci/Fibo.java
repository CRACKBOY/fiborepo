package edu.esprit.fibonacci;

public class Fibo {

	public Fibo() {
		// TODO Auto-generated constructor stub
	}
	public int process(int n){
		if (n<2)
			return n ;
		else
			return process(n-1)+process(n-2);		
	}

}
