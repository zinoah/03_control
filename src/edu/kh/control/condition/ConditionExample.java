package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { //기능 정의용 클래스
	public void ex1() {
		//if 문
		//- 조건식이 true 일 때만 코드 수행
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true 일 때 수행될 코드
		 * }
		 * 
		 * 
		 * if-else 문
		 * - 조건식 결과과 true면 if문,
		 * false면 else 구문이 수행됨 .
		 * 
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * 
		 *  	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input>0) {
			System.out.println("양수 입니다.");
			
		} else {
			System.out.println("양수가 아닙니다.");
		}
		/*if(input<=0) {
			System.out.println("양수가 아닙니다.");
		}*/
	}
	
	public void ex2() {
		//홀짝검사
		//입력받은 값이 홀인지 짝인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(0== input % 2) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
			
	}
	
	public void ex3() {
		// 달(month)를 입력받아 해달달에 맞는 계절 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season;
		//봄: 3, 4, 5
		//여름: 6, 7, 8
		//가을: 9, 10, 11
		//겨울: 12, 1, 2
		
		if(month == 3 || month == 4 || month == 5 ) {
			season = "봄";
		} else if(month >= 6 && month <= 8 ) {
			season = "여름";
		} else if(month >=9 && month <=11) {
			season = "가을";
		} else if (month == 12 || month == 1 || month ==2 ){
			season = "겨울";
		} else {
			season = "해당하는 계절 없음 ";
		}
			System.out.println(season);
	}
}
