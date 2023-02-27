package objectandclass;
class Manager1{//main class
	int IncremenSalry() {//parent class method overloaded
		return 20000;
	}}
class Devloper extends Manager1 {
	int IncremenSalry() {//child class method overloaded  
		return 10000;
	}}
class  Employee1 extends Manager1 {
int IncremenSalry() {//child class method overloaded
	return 15000;
}}
public class Runtimepolymorph {//main class
	public static void main(String[] args) {//main method
		Manager1 m;
		m=new Devloper();
		System.out.println("Developer salary"+m.IncremenSalry());
	}}
