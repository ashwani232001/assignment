public class Expressions {               //create class
public static void main(String[] args) {        //main method
	int n=(101+0)/3;              
	double m=3.0e-6*1000000.1;
	boolean o=true&&true,
			p=false&&true,
			q=(false&&false)||(true&&true),
			r=(false||false)&&(true&&true);
	//print the output as a question
	System.out.println("((101+0)/3)-> "+n);
	System.out.println("(3.0e-6*1000000.1)-> "+m);
	System.out.println("(true&&true)-> "+o);
	System.out.println("(false&&true)-> "+p);
	System.out.println("((false&&false)||(true&&true))-> "+q);
	System.out.println("(false||false)&&(true&&true)-> "+r);
	
}
}
