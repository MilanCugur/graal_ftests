import java.util.Scanner;

class ftest9{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest9(sc.nextInt());

        return;
    }

    private static void example_ftest9(int a){
        //Write your function here
	int i = 0;
	do{
	    System.out.println(i);
	    i += 1;
	}while(i<=a);
	System.console();
        return;
    }

}
