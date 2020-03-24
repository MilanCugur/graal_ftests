import java.util.Scanner;

class ftest3{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest3(sc.nextDouble());

        return;
    }

    private static void example_ftest3(double a){
        //Write your function here
	if(a>0.5)
	    System.console();
	System.out.println("line 1");
	System.out.println("line 2");
	System.out.println("line 3");
	System.out.println("line 4");
	
        return;
    }

}
