import java.util.Scanner;

class ftest27{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest27(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest27(int a, int b, int c){
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	    if(i>c)
		break;
	    System.console();
	}
	System.out.println("End");
        return;
    }

}
