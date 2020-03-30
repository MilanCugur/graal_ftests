import java.util.Scanner;

class ftest70{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest70(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest70(int a, int b, int c){
        //Write your function here
	if(a>b){
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
	    case 11:
		System.console();
	    case 4:
		System.out.print("4");
	    case 5:
		System.out.println("5");
	    case 6:
		System.out.println("6");
		break;
	    default:
		return;
	    }
	}else
	    System.out.println();
	System.console();
	System.console();
        return;
    }

}
