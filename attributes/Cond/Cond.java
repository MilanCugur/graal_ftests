import java.util.Scanner;

public class Cond{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
	example1(sc.nextInt());
    }

    private static int example1(int a){
	if(a>78)
	    System.console();
	else
	    System.out.println();
	System.out.print("dsfsd");
	return a;
    }
    
    private static int example(int a, int b, int c){
	System.out.println("Start..");
	int tmp = 11;
	if(a>b){
	    switch(c){
	    case 1:
		tmp += b;
		break;
	    case 2:
		tmp *= b;
		break;
	    default:
		if(c>b)
		    tmp = 9;
		else
		    tmp = 7;
	    }
	}else{
	    int i = 0;
	    while(i<a){
		if(tmp>b)
		    tmp -= c;
		else
		    tmp += a;
	    }
	}
	return tmp;
    }
}
