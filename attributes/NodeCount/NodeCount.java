import java.util.Scanner;

public class NodeCount{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b){
	System.out.println("Start..");
	int tmp = 11;
	if(a>b){
	    tmp += a;
	    System.console();
	}else{
	    tmp *= b;
	}
	return tmp;
    }
}
