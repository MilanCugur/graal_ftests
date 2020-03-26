
class ftest33{

    public static void main(String args[]){
        // Method call
        example_ftest33();

        return;
    }

    private static void example_ftest33(){
        //Write your function here
	String s1 = "Graal VM ORacle Project: Parse Important Features";
	int x = 32;
	String s2 = s1 + " " + x;
	String s3 = s2.substring(13,24);
	String s4 = "Matf bg ac rs";
	String s5 = s2 + s4;
		
	System.out.println("s1: " + s1);
	System.out.println("s2: " + s2);
	System.out.println("s3: " + s3);
	System.out.println("s4: " + s4);
	System.out.println("s5: " + s5);
	
	int a = 4;
	int b = 9;
	String s6 = a + b + "total";
	String s7 = "total " + a + b;
	String s8 = " " + a + b + "total";
	System.out.println("s6: " + s6);
	System.out.println("s7: " + s7);
	System.out.println("s8: " + s8);
        return;
    }
    
}
