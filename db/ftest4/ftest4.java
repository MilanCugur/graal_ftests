import java.util.Scanner;

class ftest4{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest4(sc.nextInt());

        return;
    }

    private static void example_ftest4(int a){
        //Write your function here
	if(a>5)
	    return;
	System.out.println("line 1");
	System.out.println("line 2");
	System.out.println("line 3");
	System.out.println("line 4");

        return;
    }

}
