import java.util.Scanner;

class ftest68{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest68(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest68(int a, int b){
        //Write your function here
	System.console();
	System.console();
	if(a>b){
	    switch(a){
	    case 1:
		for(int i=0; i<b; i++)
		    System.out.println(i);
		System.out.print("loop end");
	    case 2:
		System.console();
	    case 3:
		System.out.println();
	    break;
	    default:
		System.out.print("def.");
		return;
	    }
	}else
	    System.out.println();
	System.console();
	System.console();
        return;
    }

}
