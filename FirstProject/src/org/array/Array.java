package org.array;

public class Array {

	public static void main(String[] args) {
		//Array
		char b[]= {'A','E','I','O'};
		
		String s[]= {"Ragavi","Padmasini","Parkavi","Kumeresan","Prasanth"};
		
		int a[]=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[1]);
		System.out.println(a.length);
		
		System.out.println(b.length);
		System.out.println(s.length);
		
		System.out.println("\n Array1");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("\n Array2");
		for(int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}
		
		System.out.println("\n Array3");
		for(int j=4;j>=0;j--) {//reverse order
			System.out.println(s[j]);
		}
		//Enchanced loop
		System.out.println("\n Enchanced Loop");
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("\n String Array");
		for(String j:s) {
			System.out.println(j);
		}
		System.out.println("\n Char Array");
		for(char c:b) {
			System.out.println(c);
		}
		
		//get 2,3 position particular value from array
		for(int i=0;i<s.length;i=i+2) {
			
			System.out.println(s[i]);
		}
		
		int mark[]= {90,99,100,94,94};
		int sum=0;
		int count=0;
		for(int i=0;i<mark.length;i++) {
			//if(mark[i]==94)
				//System.out.println(i+1);//get value position =3
				//System.out.println(i); //get index position of 100=2
			//System.out.println(mark[i]); //100

			//calculate sum of marks
				sum=sum+mark[i];
				if(mark[i]==94)
				count++;
		}
		
		System.out.println("No of Count Marks:" +count);
		System.out.println("Total Marks" +sum);
		
		//find the maximum value of no
		int sub[]= {55,87,93,75,68};
		int max=0;
		int i=0;
		while(i<sub.length) {
			if(sub[i]>max)
			max=sub[i];
			i++;
		}
		
		System.out.println("Maximum Value:"+max);
		
		//multi dimensional Array
		int mul[][]= {{1,2,3,4,5},{6,7,8,9}};
		for(int k=0;k<mul.length;k++) {
			for(int l=0;l<mul[k].length;l++) {
				System.out.println(mul[k][l]);
			}
		}
		
		String str[][]= {{"Rt","ty"},{"df","hg"}};
		for(int m=0;m<str.length;m++) {
			for(int n=0;n<str[m].length;n++) {
				System.out.println(str[m][n]);
			}
		}
		
		//Reverse String
	String z="Ragavi";
	String y="";
		for(int t=0;t<z.length();t++) {
			y=z.charAt(t)+y;
			System.out.println(y);
		}
		
		
	}
	 
	
	
	
	
	

}
