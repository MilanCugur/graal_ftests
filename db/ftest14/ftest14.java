import java.util.Scanner;

class ftest14{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest14(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest14(int a, int b, int c){
        //Write your function here
        // composite if
        if (a > b) {
            if (a > c) {
                System.console();
            } else {
                System.console();
            }
            System.console(); // join together
        } else {
	    System.out.println();
            if (b > c) {
                System.console();
            } else {
                System.console();
            } // not join together
	}
        return;
    }

}
