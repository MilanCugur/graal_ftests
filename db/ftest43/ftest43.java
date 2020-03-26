import java.util.Scanner;

class ftest43{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest43(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest43(int a, int b) throws Exception {
        //Write your function here
	System.console();
	System.console();

	if(a>b)
	    System.out.println();

	System.console();
	System.console();
	
	switch(a){
	case 1:
	    for(int i=0; i<b; i++)
		System.out.println(i);
	case 2:
	    System.console();
	case 3:
	    throw new Exception();
	default:
	    System.out.println("def");
	}
	System.console();
	System.console();
	
        return;
    }

}
