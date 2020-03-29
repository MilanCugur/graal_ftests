import java.util.Scanner;
 
class ftest62{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest62(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest62(int a, int b) throws Exception {
        //Write your function here
	System.console();
	System.console();

	switch(a){
	case 1:
	    System.out.println();
	    switch(b){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		return;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.println();
	    break;
	case 2:
	    System.console();
	    break;
	case 3:
	    return;
	case 4:
	    throw new Exception();
	case 5:
	    throw new Exception();
	default:
	    System.out.print("def");
	}
	
	System.console();
	System.console();
        return;
    }

}

