import java.util.Scanner;

class ftest11{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest11(sc.nextInt());

        return;
    }

    private static void example_ftest11(int a){
        //Write your function here
	try{
	    if(a<923)
		throw new Exception();
	}catch(Exception e){
	    System.out.println("Exception is here!");
	    e.printStackTrace();
	}
	System.console();
        return;
    }

}
