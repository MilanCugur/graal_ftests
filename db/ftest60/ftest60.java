import java.util.Scanner;
 
class ftest60{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest60(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest60(int a, int b){
        //Write your function here
	System.console();
	System.console();

	switch(a){
	case 1:
	    System.out.println();
	    switch(b){
	    case 0:
		return;
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.println();
	    break;
	case 2:
	    System.console();
	    break;
	default:
	    System.out.print("def");
	}
	
	System.console();
	System.console();
        return;
    }

}
