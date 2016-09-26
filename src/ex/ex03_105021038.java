package ex;

/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021038 傅琬鈞
 */

import java.util.Scanner;

public class ex03_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入時間");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
int p=(c*60+d)-(a*60+b);
		int x, y,z;
		if (p <= 120 && p >= 30) {
			x = (p / 30) * 30;
			System.out.println(x);
		} else {
			if (p <= 240 && p >= 120) {
				y = 120 + ((p - 120) / 30) * 40;
				System.out.println(y);
			} else {
				if(p>=240){
				z=120+160+ ((p-240) / 30) * 60;
				System.out.println(z);
			}
			}
			
			}
		}	
	}
