import java.util.Scanner;

class ftest67{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest67(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest67(int a, int b){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    for(int i=0; i<b; i++)
		System.out.println(i);
	case 2:
	    System.out.println();
	    break;
	default:
	    System.out.print("def.");
	    return;
	}
	System.console();
	System.console();
        return;
    }

}
