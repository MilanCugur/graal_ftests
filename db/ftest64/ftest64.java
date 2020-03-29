import java.util.Scanner;

class ftest64{

    public static void main(String args[]){
        // Method call
	Scanner sc = new Scanner(System.in);
        example_ftest64(sc.nextInt(), sc.nextInt());
	
        return;
    }

    private static void example_ftest64(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    return;
	case 2:
	    for(int i=0; i<b; i++)
		System.out.println(i);
	    break;
	case 3:
	    int i = 0;
	    while(i<a){
		System.out.println(i);
		i+=1;
	    }
	    break;
	}
	System.console();
	System.console();
		    
        return;
    }

}
