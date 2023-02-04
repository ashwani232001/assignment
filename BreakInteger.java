public class BreakInteger {    // create class
public static void main(String[] args) {   //main method
	int n=123456;      // takes a input  as a integer
	int a= n/100000%10,       
			b= n/10000%10,
			c= n/1000%10,
			d= n/100%10,
			e= n/10%10,
			f= n%10;
	// print the output
	System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
}
}
