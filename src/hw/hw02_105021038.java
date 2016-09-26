package hw;
import java.util.Scanner;
public class hw02_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入身高\n輸入性別");
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int p=scn.nextInt();
if (p==1){ 
System.out.println((a-80)*0.7);
}else if(p==2){
		System.out.println((a-70)-0.6);
	}
	}

}
