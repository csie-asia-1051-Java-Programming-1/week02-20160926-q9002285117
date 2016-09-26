package hw;

import java.util.Scanner;

public class hw03_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入西元年");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
	if (a%400==0){
		System.out.println("閏年");
	}
	else if(a%100==0){
		System.out.println("平年");
	}
	else if(a%4==0){
		System.out.println("閏年");
	}
}}
