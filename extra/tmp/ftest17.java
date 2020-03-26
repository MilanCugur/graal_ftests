import java.util.Scanner;

class ftest17{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest17(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest17(int a, int b, int c){
        //Write your function here
	System.console();
	System.console();
	
	switch(c){
	case 3:
	    return;
	case 4:
	    if(a>b)
		System.out.println("1");
	    else
		System.out.println("2");
	    System.out.println("merge");
	    break;
	default:
	    if(b<=c)
		System.out.println("3");
	    else
		System.out.println("4");
	    break;
	}
	
	System.console();
	System.console();
	
        return;
    }
}
