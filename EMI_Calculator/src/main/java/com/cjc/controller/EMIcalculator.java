package com.cjc.controller;
import java.util.Scanner;

public class EMIcalculator {
	public static void main(String[] args) {
		
		
		        Scanner a = new Scanner(System.in);
		         
		        double principal, rate, time, emi;
		  
		        System.out.print("Enter Principal Loan Amount: ");
		        principal = a.nextFloat();
		      
		        System.out.print("Enter Interest rate: ");
		        rate = a.nextFloat();
		      
		        System.out.print("Enter Tenure in Months: ");
		        time = a.nextFloat();
		      
		        rate=rate/(12*100); 
		     
		      
		      
		        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		      
		        System.out.print("Monthly EMI is= "+emi+"\n");
		                 
		    }
	

}
