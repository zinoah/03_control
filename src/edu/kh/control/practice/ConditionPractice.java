package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		
		//키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		//짝수가 아니면 “홀수입니다.“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int num2 = num % 2;
		String result;
		
		if(num < 0) {
			result ="양수만 입력해주세요.";
		}else { 
			if(num2 == 0) {
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
			
		}
		System.out.println(result);
	}
	
	public void practice2() {
		/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int	eng = sc.nextInt();
		System.out.print("수학 : ");
		int	math = sc.nextInt();
		
		int sum = kor + eng + math ;
		double aver = sum / 3.0;
		String result ;
		
		if(kor < 40 || eng < 40 || math < 40 ) {
			result = "불합격입니다.";
		}else {
			if(aver > 60) {
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("합계 : " + sum);
				System.out.printf("평균 : %.1f\n" , aver);
				result = "축하합니다, 합격입니다!";
				
			}else {
				result = "불합격입니다.";
			}
			
		}
		
		System.out.println(result);
	}
	
	public void practice3() {
		//1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		//잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		
		Scanner sc = new  Scanner(System.in);
		System.out.print(" 1~12 사이의 정수입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println( month + "월은 31일까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println( month + "월은 30일까지 있습니다.");
			break;
		case 2: 
			System.out.println( month + "월은 28일까지 있습니다.");
			break;
		default :
			System.out.println( month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice4() {
		
		/*키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		저체중/정상체중/과체중/비만을 출력하세요.

		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		BMI가 30이상일 경우 고도 비만

		[실행 화면]
		키(m)를 입력해 주세요 : 1.65
		몸무게(kg)를 입력해 주세요 : 58.4
		BMI 지수 : 21.45087235996327
		정상체중*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 키(m)를 입력해 주세요 : ");
		double height  = sc.nextDouble();
		System.out.print(" 몸무게(kg)를 입력해 주세요 : ");
		double weight  = sc.nextDouble();
		double bmi = weight / (height * height);
		String result;
		
		if(bmi > 30) {
			System.out.println(" BMI 지수 : " + bmi);
			result = "고도비만";
		}else if(bmi >= 25) {
			System.out.println(" BMI 지수 : " + bmi);
			result = "비만";
		}else if(bmi >= 23) {
			System.out.println(" BMI 지수 : " + bmi);
			result = "과체중";
		}else if(bmi >= 18.5) {
			System.out.println(" BMI 지수 : " + bmi);
			result = "정상체중";
		}else {
			System.out.println(" BMI 지수 : " + bmi);
			result = "저체중";
		}
		System.out.println(result);
	}
	
	public void practice5() {
		
		/*중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		
		double mid2 = mid * 0.2;
		double fin2 = fin * 0.3;
		double hw2 = hw * 0.3;
		double att2 = 20 * 0.3;
		double att3 = 20 - att2;
		
		double sum = mid2 + fin2 + hw2 + att;
		String result ;
		if(att <= att3) {
			System.out.println("================= 결과 =================");
			result = "Fail " + ("[출석 횟수 부족" + "(" + att +"/20]");
		}else {
			if(sum >= 70) {
				System.out.println("================= 결과 =================");
				System.out.println("중간 고사 점수(20) : " + mid2);
				System.out.println("기말 고사 점수(30) : " + fin2);
				System.out.println("과제 점수    (30) : " + hw2);
				System.out.println("출석 점수    (20) : " + att);
				System.out.println("총점 : " + sum);
				result = "PASS";
			}else{
				System.out.println("================= 결과 =================");
				System.out.println("중간 고사 점수(20) : " + mid2);
				System.out.println("기말 고사 점수(30) : " + fin2);
				System.out.println("과제 점수    (30) : " + hw2);
				System.out.println("출석 점수    (20) : " + att);
				System.out.println("총점 : " + sum);
				result = "Fail [점수 미달]";
			}
		}
		System.out.println(result);	
	}
}
