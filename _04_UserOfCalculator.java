package chap06_method;

import java.util.Scanner;

import chap06_method.calc.CompleteCalculator;

public class _04_UserOfCalculator {

	public static void main(String[] args) {
		
		CompleteCalculator cCalc = new CompleteCalculator() ;
		
		int result ; 
		
		double dResult; 
		
		int num1 , num2 ;

		Scanner sc = new Scanner( System.in ) ;
		
		System.out.println( "num1변수에 숫자를 입력하세요." );
		
		num1 = sc.nextInt();	
		
		System.out.println( "num2변수에 숫자를 입력하세요." );
		
		num2 = sc.nextInt();
		
		result = cCalc.add( num1 , num2 );
		
		System.out.println( num1 + " + " + num2 + " = " + result );
		
		result = cCalc.sub(num1, num2);
				
		System.out.println( num1 + " - " + num2 + " = " + result );
		
		result = cCalc.mul(num1, num2);
				
		System.out.println( num1 + " * " + num2 + " = " + result );
		
		dResult = cCalc.div(num1, num2) ;
		
		System.out.println( num1 + " / " + num2 + " = " + dResult );
		
		dResult = cCalc.mod(num1, num2) ;
		
		System.out.println( num1 + " % " + num2 + " = " + dResult );
		
		
		
		
		
	}

}
