import java.util.Scanner;

class ftest46{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest46(sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest46(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.print("1");
	    break;
	case 2:
	    System.out.print("2");
	    break;
	case 3:
	    System.out.print("3");
	    break;
	case 4:
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
