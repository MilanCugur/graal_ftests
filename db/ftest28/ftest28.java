import java.util.Scanner;

class ftest28{

    public static void main(String args[]) throws Exception{
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest28(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest28(int a, int b, int c) throws Exception{
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	    if(i>c)
		throw new Exception();
	    System.console();
	}
	System.out.println("End");
        return;
    }

}
