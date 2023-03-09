package oops;

import java.util.Scanner;//user define

public class Array_Average {//main class
public static void main(String[] args) {//main method
	int average=0;//local variable
	System.out.println("enter the element");
	Scanner sc= new Scanner(System.in);//taking input from user
	int n= sc.nextInt();//size of array
	System.out.println("enter the element");
	for(int i=0;i<n;i++) {
		int arr[]= new int[n];//declaration
		 arr[i]=sc.nextInt();
		 average=average+arr[i];
		}
	 average=average/n;
	 System.out.println("average of giving number: "+average);
}
}
