package hw;

import java.util.Scanner;
public class hw01_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("小明拿到多少錢\n蘋果幾個\n柳丁幾個\n桃子幾個");
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int a1=scn.nextInt();
		int a2=scn.nextInt();
		int a3=scn.nextInt();
		int p=a1*15+a2*20+a3*30;
		if( p<=N){
			System.out.println("50元有"+(N-p)/50+"個");
	        System.out.println("5元有"+((N-p)%50)/5+"個");	
	       System.out.println("1元有"+(N-p)%5+"個");
		}else{
				System.out.println("0");
			}
		
	}

}
