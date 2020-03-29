import java.util.Scanner;

class ftest53{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest53(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest53(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
	    case 2:
		System.out.println("2");
	    case 3:
		System.out.println("3");
		break;
	    case 4:
		throw new Exception();
	    default:
		throw new Exception();
	    }
	    System.out.println();
	    System.out.println();
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

}
