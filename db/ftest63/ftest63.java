import java.util.Scanner;

class ftest63{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest63(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest63(int a, int b){
        //Write your function here
	if(a>b){
	    System.console();
	    switch(a){
	    case 1:
		System.out.println("1");
		return;
	    case 2:
		System.out.println("2");
	    case 3:
		System.out.println("3");
		break;
	    }
	    switch(b){
	    case 1:
		System.out.print("1");
		break;
	    case 2:
		System.out.print("2");
	    case 3:
		System.out.print("3");
		break;
	    default:
		System.console();
		return;
	    }
	    System.console();
	    System.console();
	}else{
	    System.out.print("else v1");
	    System.out.print("else v2");
	}
	     
	System.console();
	System.console();
	
        return;
    }

}
