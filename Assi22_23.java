package ExceptionHandling;

public class Assi22_23 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];                     //ArrayIndexOutOfBounds Exception
            arr[7] = 15;
            System.out.println(arr[7]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            String s1 = "Ashwani";                        //number format Exception
            int n = Integer.parseInt(s1);
            System.out.println(n);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            int m = 50/0;                         //Arithmetic Exception
        System.out.println(m);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block Exceute");
        }

    }
}
