package thread;
public class ThreadQues  extends Thread {
public void run(){
    System.out.println("Odd");
        for (int i = 1; i <= 100; i++) {
        if (i%2!=0){
        System.out.print(i+ " ");
        }
        }
}
static class Even extends Thread{
    public void run() {
        try {
            System.out.println("Even");
            for (int i = 2; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}



    public static void main(String[] args)  {
        ThreadQues t1 = new ThreadQues();
        Even t = new Even();
        t.start();
        try {
            t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        t1.start();


    }
}
