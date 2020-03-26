import java.util.Scanner;

class ftest41{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest41(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest41(int a, int b){

	switch(a){  // B0
	case 1:
	    System.out.println();  // B1, B2
	    break;
	case 2: // B3
	    break;
	default:
	    System.out.println("def");  // B4, B7
	    return;
	}
	System.console();  // B4, B5
    }
    
}
