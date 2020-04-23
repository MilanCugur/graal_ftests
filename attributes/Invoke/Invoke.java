import java.util.Scanner;
import java.lang.Math;

public class Invoke {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static double example(int a, int b, int c){
	System.out.println("Start..");
	double tmp = 11.0;
	if(a>b){
	    System.console();
	    tmp += c;
	}else{
	    int i = 0;
	    while(i<a){
		System.out.println(i);
	    }
	    System.console();
	    tmp += Math.log(c);
	}
	return tmp;
    }
}
