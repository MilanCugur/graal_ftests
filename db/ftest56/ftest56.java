import java.util.Scanner;

class ftest56{

    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest56(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest56(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
	    case 2:
		System.out.println("2");
	    case 5:
		System.console();
		break;
	    case 3:
		System.out.print("3");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
		break;
	    case 4:
		System.out.println("4");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
		break;		   
	    default:
		System.out.println("3");
		break;
	    }
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

}
