import java.util.Scanner;

class ftest36{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	Integer i = sc.nextInt();
	example_ftest36(i);
	System.out.println(i);
	
        return;
    }

    private static void example_ftest36(Integer i){
        //Write your function here
	synchronized(ftest36.class){
	    i += 100;
	}
	System.console();
        return;
    }

}
