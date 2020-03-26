import java.util.Scanner;

class ftest48{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest48b(sc.nextInt());
	example_ftest48a(sc.nextInt());

        return;
    }

    private static void example_ftest48a(int a){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 10:
	    System.out.println("a==10 switch");
	}
	System.console();
	System.console();
	
	System.console();
	System.console();
	if(a==10)
	    System.out.println("a==10 if");
	System.console();
	System.console();
    }

    private static void example_ftest48b(int a){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 10:
	    System.out.println("a==10 switch");
	    break;
	default:
	    System.out.println("a!=10 if");
	}
	System.console();
	System.console();
	
	System.console();
	System.console();
	if(a==10)
	    System.out.println("a==10 if");
	else
	    System.out.println("a!=10 if");
	System.console();
	System.console();
    }
}
