import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	example(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    private static int example(int a, int b, int c){
	System.out.println("Start..");
	int tmp = 11;
	if(a>b){
	    for(int i=0; i<a; i++){
		for(int j=0; j<b; j++){
		    for(int k=0; k<c; k++){
			tmp += a;
		    }
		}
	    }
	}else{
	    int i = 0;
	    while(i<a){
		tmp -= c;
	    }
	    System.console();
	    do{
		tmp += b;
	    }while(tmp<c);
	}
	return tmp;
    }
}
