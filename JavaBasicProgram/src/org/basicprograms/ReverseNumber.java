package org.basicprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();  //123
		int rev=0;
		while(no!=0) {
			
			rev=rev*10+no%10;  //3 =>0+3=>3,, 12=>3*10=30+2=>32   ,32*10=>320 +1 =>321
			no=no/10;    //12 =>3 is eliminated  ,2 ,1
			
		}
		System.out.println(rev);

}
}