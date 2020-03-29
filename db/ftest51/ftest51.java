import java.util.Scanner;

class ftest51{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest51(sc.nextInt(), sc.nextInt());

        return;
    }
    
    private static void example_ftest51(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	}else{
	    System.out.print("else brabch");
	    System.out.println();
	}

	System.console();
	System.console();
        return;
    }

}
