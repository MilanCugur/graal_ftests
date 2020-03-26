import java.util.Scanner;

class ftest40{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest40(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest40(int a, int b){

	switch(a){  // B0
	case 1:
	    System.out.println();  // B1, B2
	case 2: // B3
	    System.console(); // B4, B5
	    break;
	default:
	    System.out.println("def"); // B6, B7
	    return;
	}
	
    }
    
}
