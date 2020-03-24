import java.util.Scanner;

class ftest18{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest18(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest18(int a, int b, int c){
        //Write your function here
	System.console();
	System.console();
	
	if(a>c){ 
	    switch (c) {  
	    case 21: 
		return;
	    case 3:
		System.out.println("3");
		break;
	    default:
		System.console();
		break;
	    }
	    System.out.println("breaking prtln");
	    if(a>b)
		System.out.println("a>b");
	    else
		System.out.println("a<=b");
	    System.console();
	}else
	    System.out.println("else branch");
	
	System.out.println("ending branch");
	System.console();
        return;
    }

}
