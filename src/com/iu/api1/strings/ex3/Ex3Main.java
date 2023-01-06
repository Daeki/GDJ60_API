package com.iu.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");
		WeatherData weatherData = new WeatherData();
		WeatherDTO [] datas = weatherData.init();
		
		for(int i=0;i<datas.length;i++) {
			System.out.println(datas[i].getCity());
			System.out.println(datas[i].getStatus());
		}
		
		
		System.out.println("finish");

	}

}
