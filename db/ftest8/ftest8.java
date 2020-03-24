import java.util.Scanner;

class ftest8{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest8(sc.nextInt());

        return;
    }

    private static void example_ftest8(int a){
        //Write your function here
	for(int i=0; i<a; i++){
	    System.out.println(i);
	    i += 1;
	}
	System.console();
        return;
    }

}
