import java.util.Scanner;

class ftest55{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest55(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest55(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		return;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		System.out.print("3");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
	    default:
		System.out.println("3");
		break;
	    }
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

}
