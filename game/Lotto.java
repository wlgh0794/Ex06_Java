package chap06_method.game;

import java.util.Random;

public class Lotto {
	
	void Lotto()
	{
		System.out.println( "생성자 호출" );
	}
	
	// ################################
	
	// 1. ( 1 ~ 45 )까지 숫자 중 랜덤 값 7개를 저장해서
	// 배열로 리턴하는 메소드 generateLottoArray를 구현하세요.
	
	public int[] generateLottoArray()
	{
		
		int num_list[] = new int[ 7 ] ;
		
		Random iRandomVal = new Random() ;
		
		System.out.print( "Input 데이터 : " );
		
		for ( int i = 0 ; i < num_list.length ; i++ )
		{
			int num = iRandomVal.nextInt( 45 ) + 1 ;
			
			// 중복확인
			if ( isDuplicated( num_list , i ) == true )
			{
				
				i-- ;
				
			}
			else if ( isDuplicated( num_list , i ) == false )
			{
				num_list[ i ] = num ;
				
				System.out.print( num_list[ i ]  + "  ");
				
				
			}
			
		}
		
		return  num_list ;
	}
	
	
	
	// ################################
	
	// 2 . 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드를
	// isDuplicated를 구현하세요.
	// 리턴 타입 → boolean 타입 : 
	// 중복이 됐으면 ture 리턴
	// 중복이 없으면 false 리턴
	
	public boolean isDuplicated( int arr[] , int index )
	{
		boolean result ;
		
		for ( int i = 0 ; i < index ; i++ )
		{
			if ( arr[ index ] == arr[ i ] )
			{
				System.out.println( " 데이터가 중복되었습니다. " );
				
				result = true ;
				
				return result ;
			}
			
		}

		return false ;
	}
	
	
	
	
	
	
	
	
	// ################################
	
	
	
	
	
	
}
