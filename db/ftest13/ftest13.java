import java.util.Scanner;

class ftest13{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
	example_ftest13(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest13(int a, int b){
        //Write your function here
	if(a>100)
	    return;
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println("1");
	    //break; //
	case 2:
	    System.out.println("2");
	    break;
	case 3:
	    System.out.println("3");
	    return;
	default:
	    System.out.println("def");
	}
	System.console();	
	System.console();
        return;
    }
}
