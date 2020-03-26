import java.util.Scanner;

class ftest6{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest6(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest6(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.println();
	case 2:
	    System.console();
	    break;
	case 3:
	    System.out.println("3");
	    return;
	default:
	    System.out.println("def");
	}
	System.console();	
	System.console();
        return;
    }
}
