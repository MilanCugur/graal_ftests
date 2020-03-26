import java.io.File;
import java.util.Scanner;

class ftest35{

    public static void main(String args[]) throws Exception {
        // Method call
        example_ftest35();

        return;
    }

    private static void example_ftest35() throws Exception {
        //Write your function here
	File f = new File("example.txt");
	Scanner sc;
	sc = new Scanner(f);
	while(sc.hasNext()) {
                String word = sc.next();
		System.out.print(word);
	}
        return;
    }

}
