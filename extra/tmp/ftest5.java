import java.util.Scanner;

class ftest5{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest5(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest5(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.println("1");
	    break;
	case 2:
	    System.out.println("2");
	    break;
	default:
	    System.out.println("def");
	}
	System.console();
        return;
    }

}
