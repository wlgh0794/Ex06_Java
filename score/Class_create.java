package chap06_method.score;

import chap06_method.score.Score; // [ 폴더명.스크립트이름 ]

public class Class_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 100 , 30, 50 } ;
		
		Score sc = new Score() ;
		 
		double Data = sc.getAvgScore( arr.clone() ) ;
		
		System.out.println( Data );
		
	}

}
