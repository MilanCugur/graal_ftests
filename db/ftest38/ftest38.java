import java.util.Scanner;

class ftest38{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest38(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest38(int a, int b){	
	switch(a){  
	case 1:
	    System.out.println(); // B1, B2
	case 2:  // B3
	    System.console();  // B4, B5
	case 3:  // B6
	    System.out.print("cse3");  // B7, B8
	default:  // B9
	    System.out.println("def");  // B10, B11
	}
    }
}
// Integer Switch parsed sons:
// [case 1]: B1, B2, B4, B5, B7, B8 
// [case 2]: B3, B4, B5, B7, B8
// [case 3]: B6, B7, B8
// [default: ]: B9

// Blocks B10, B11 weren't added to the sons
// Syntax should be added to all four sons, but:
// * Make learning easier,
// * Does not affect the probability distribution
// * There is certainly everything that comes after the
// whole switch - it is impossible to separate
// => Therefore it was not added to the sons
