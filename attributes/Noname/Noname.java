import java.util.Scanner;

public class Noname {

    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b, int c) throws Exception {
	System.console();

	if(c<0)
	    return 0;
	
	System.console();

	if(b>c)
	    return a;
	
	assert a>b : "Maybe";

	assert false : "Sure";

	return a-b*c;
    }
}
