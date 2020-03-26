import java.util.Scanner;

class ftest44{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest44(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest44(int a, int b){
        //Write your function here
	if(a>b){
	    System.console();
	    return;
	}

	switch(a){
	case 1:
	    System.out.println();
	case 2:
	    System.console();
	    return;
	case 3:
	    System.out.print("case3");
	case 4:
	    System.out.println();
	default:
	    System.console();
	}

	System.out.println("epilog");
	System.out.println("epilog");
        return;
    }

}
