package com.iu.api1.wrappers.ex1;

public class JuminCheck {
	
	
	//check1
	//주민등록번호를 받아서
	//남자인지 여자인지 출력
	public void check1(String jumin) {
		//991223-1234567
		//jumin.charAt(7)
		String check = jumin.substring(7, 8);
		int c = Integer.parseInt(check);
		
		if(c%2==1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
//		if(c==1 || c==3) {
//			
//		}else {
//			
//		}
		
//		if(check.equals("1") || check.equals("3")) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		
	}
	
	//check2
	//주민등록번호를 받아서
	//나이를 계산해서 출력
	//3-5 : 봄
	//6-8 : 여름
	//9-11: 가을
	//12-2: 겨울
	public void check2(String jumin) {
		//991223-1234567
		//1. 나이계산
		String y = jumin.substring(0, 2);//99
		String check = jumin.substring(7, 8);
		int year=1900;
		//String year="19"
		if(check.equals("3") || check.equals("5")) {
			year=2000;
			//year="20"
		}
		
		
		year = year+Integer.parseInt(y);//99
		int age = 2023-year;
		System.out.println("Age : "+age);
		
		//2. 계절 출력
		String m = jumin.substring(2, 4);//12
		int month = Integer.parseInt(m);
		if(month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>=6 && month<=8) {
			System.out.println("여름");
		}else if(month>=9 && month<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
	}
	

}
