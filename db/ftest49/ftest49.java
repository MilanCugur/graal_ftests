import java.util.Scanner;

class ftest49{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest49(sc.nextInt(), sc.nextInt());

        return;
    }
    
    private static void example_ftest49(int a, int b){
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
	    System.out.print("Epilog");
	}else{
	    System.out.print("else brabch");
	    System.out.println();
	}

	System.console();
	System.console();
        return;
    }

}
