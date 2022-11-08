package com.gl.balancedbracket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BalancedBracket {
	
public static void main(String[] args) {
	
	
	Scanner input = new Scanner (System.in);
	
	
	int i=0;
	//String bracket [] = new String [];
	ArrayList brackets = new ArrayList();
	Iterator itr = brackets.iterator();  
	
	System.out.println("Enter the bracket string; press  key 'e' to stop entering the brackets");
	String s;
	while (!(s=input.next()).equals("e")) {
		brackets.add(s);			
	}
	//print
	System.out.print("Input String is ");
	for (i=0; i< brackets.size(); i++ ) {
		System.out.print(brackets.get(i));
		
		
	}
	//logic to compare brackets
		int size = brackets.size(); //10
		
		if (size % 2 ==1)
			System.out.println("This is an Unbalanced String");
		else
		{
		int medleft = (size -1) /2; //4
		int medrigt = medleft+1; //4
		//System.out.println(medrigt);
		
		//for (int j=0; j<=medleft; j++)
		//int j=0;
		while (medleft >= 0)
		{
			//brackets(j);
			
		if ((brackets.get(medleft).equals("(" ) &&  !brackets.get(medrigt).equals(")") )
				||
				(brackets.get(medleft).equals("{" ) &&  !brackets.get(medrigt).equals("}") )
				||
				(brackets.get(medleft).equals("[" ) &&  !brackets.get(medrigt).equals("]") )
				||
				(brackets.get(medleft).equals(")"))	
				||
				(brackets.get(medleft).equals("}"))	
				||
				(brackets.get(medleft).equals("]"))	
				)
			
			
				{
				System.out.println("\n This is an Unbalanced String");
				break;
				}
		
		medleft--;
		medrigt++;
		if (medleft<0)
					System.out.println("\n This is a Balanced String");
				
		}
		}
	
	}
//	for (i=0; i<=arr.length; i++)
	//bracket = [{()}]
	
	
	
}


