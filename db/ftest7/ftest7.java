import java.util.Scanner;

class ftest7{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest7(sc.nextInt());

        return;
    }

    private static void example_ftest7(int a){
        //Write your function here
	int i = 0;
	while(i<a){
	    System.out.println(i);
	    i += 1;
	}
	System.console();
        return;
    }

}
