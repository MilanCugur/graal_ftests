import java.util.Scanner;

class ftest58{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest58(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest58(int a, int b){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println();
	case 2:
	    System.out.print("case 2a");
	    System.out.print("case 2b");
	    break;
	case 3:
	    System.console();
	    return;
	case 4:
	    System.out.println("4");
	    break;
	default:
	    System.console();
	    switch(b){
	    case 1:
		System.out.println("b1");
		break;
	    case 2:
		System.out.println("b2");
		break;
	    case 3:
		System.out.println("b3");
		break;
	    default:
		System.console();
		return;
	    }
	}
	System.console();
	System.console();
        return;
    }

}
