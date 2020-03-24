import java.util.Scanner;

class ftest31{

    public static void main(String args[]) throws Exception{
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest31(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest31(int a, int b, int c) throws Exception{
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		throw new Exception();
	    System.out.println("body");
	    if(i>c)
		throw new Exception();
	    System.console();
	}
	System.out.println("End");
        return;
    }

}
