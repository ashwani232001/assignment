package Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Assignment_IO {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	System.out.println("Press 1 if you want to write the file");
	System.out.println("Press 2 if you want to read the file");
	int a= sc.nextInt();
	if(a/2==0) {
		try {
			FileOutputStream f= new FileOutputStream("E:\\java_io\\inputchar.txt");	
			String s1="welcome to the coding world";
			byte b[]=s1.getBytes();
			//converting string into byte array
					f.write(b);//to show the statement
					f.close();
					System.out.println("program executed properly");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	else {
		try {
		FileInputStream f= new FileInputStream("E:\\java_io\\inputchar.txt");//source path
		int i;
		while((i=f.read())!=-1){
			System.out.print((char)i);//convert in into character
		}
		f.close();
		
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
	}
}
