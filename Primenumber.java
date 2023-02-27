package Ashwani;

public class Primenumber {//main class
public static void main(String[] args) {//main method
	int n=150;//local  variable
	for(int i=1;i<=150;i++) {//first for loop between 1 to 150
			int count=0;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			count ++;
		}
	}
		if(count==0) {
			System.out.println(i);
		}
   }
  }
 }
