import java.util.Scanner;

class Tmp{
    public int a;
    public int b;

    public Tmp(){
	this.a = 0;
	this.b = 0;
    }
    
    public Tmp(int a, int b){
	this.a = a;
	this.b = b;
    }
    @Override
    public String toString(){
	return "("+this.a+", "+this.b+")";
    }
}

class StaticInstanceLoadStore {
    static int s = 123;
    
    public static void main(String args[]) throws Exception {
        // Method call
	Scanner sc = new Scanner(System.in);
        example(sc.nextInt(), sc.nextInt());

        return;
    }

    private static int example(int v1, int v2) throws Exception {
	System.console();

	if(v1>v2){
	    Tmp q = new Tmp(v1, v2);
	    v1 *= q.a;
	    v1 -= q.b;
	}else{
	    s += v2;
	    v1 -= s;
	}

	System.out.println(v1);
	return v1;
    }
}
