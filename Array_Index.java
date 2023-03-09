import java.util.Scanner;//for user 

public class Array_Index {
public static void main(String[] args) {
	System.out.println("enter the element");
	Scanner sc= new Scanner(System.in);//taking input from user
int n= sc.nextInt();//size of array
	int arr[]= new int[n];
	System.out.println("enter the values of array:");
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the element which the index  you want:");
	int e=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==e) {
				System.out.println("index is: "+i);
			}
		}
		
	}
}
