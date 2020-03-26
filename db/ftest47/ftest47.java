import java.util.Scanner;

class ftest47{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest47(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest47(int a, int b){
        //Write your function here
	switch(a){
	case 13:
	case -13:
	case 324:
	case 123:
	case 232:
	    System.out.print("1");
	case 26:
	    System.out.print("2");
	    break;
	case 45:
	    System.console();
	default:
	    System.console();
	    return;
	}
	if(a>b)
	    System.out.println("a>b");
	else
	    System.out.println("a<=b");
	System.console();
        return;
    }

}
