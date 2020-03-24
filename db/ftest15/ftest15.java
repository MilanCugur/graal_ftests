import java.util.Scanner;

class ftest15{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest15(sc.nextInt(), sc.nextInt(), sc.nextInt());

        return;
    }

    private static void example_ftest15(int a, int b, int c){
        //Write your function here
	// composite if with exit
        if (a > b) {
            if (a > c) {
                System.console();
            } else {
                System.console();
            }
            System.console(); // join together
        } else {
            if (b > c) {
		return;
            } else {
                System.console();
            } // not join together
        }
        return;
    }

}
