import java.util.Scanner;

class ftest72{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest72(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest72(int a, int b, int c){
        //Write your function here
	switch(a){
	case 0:
	    System.console();
	case 1:
	    System.out.print("1");
	case 2:
	    System.out.println("2");
	case 3:
		System.console();
		break;
	default:
	    return;
	}
	System.console();
	System.console();
        return;
    }

}
