import java.util.Scanner;
import java.io.File;

class fastftest {
    public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int i = sc.nextInt();
	int[] list ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        example_ftest1(-3);
	example_ftest2(a, b, c);
        example_ftest3(sc.nextDouble());
        example_ftest4(sc.nextInt());
	example_ftest5(sc.nextInt(), sc.nextInt());
	example_ftest6(sc.nextInt(), sc.nextInt());
        example_ftest7(sc.nextInt());
        example_ftest8(sc.nextInt());
        example_ftest9(sc.nextInt());
        example_ftest10(sc.nextInt());
        example_ftest11(sc.nextInt());
	example_ftest12(sc.nextInt());
	example_ftest13(sc.nextInt(), sc.nextInt());
        example_ftest14(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest15(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest16(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest17(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest18(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest19(sc.nextInt(), sc.nextInt());
        example_ftest20(sc.nextInt(), sc.nextInt());
        example_ftest21(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest22(sc.nextInt(), sc.nextInt());
        example_ftest23(sc.nextInt(), sc.nextInt());
        example_ftest24(sc.nextInt(), sc.nextInt());
        example_ftest25(sc.nextInt(), sc.nextInt());
        example_ftest26(sc.nextInt(), sc.nextInt());
        example_ftest27(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest28(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest29(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest30(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest31(sc.nextInt(), sc.nextInt(), sc.nextInt());
	int sum = example_ftest32(list);
        example_ftest33();
        example_ftest34(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest35();
	example_ftest36(i);
        example_ftest37();
	example_ftest38(sc.nextInt(), sc.nextInt());
	example_ftest39(sc.nextInt(), sc.nextInt());
	example_ftest40(sc.nextInt(), sc.nextInt());
	example_ftest41(sc.nextInt(), sc.nextInt());
        example_ftest42(a, b, c);
        example_ftest43(sc.nextInt(), sc.nextInt());
        example_ftest44(sc.nextInt(), sc.nextInt());
        example_ftest45(sc.nextInt(), sc.nextInt());
        example_ftest46(sc.nextInt(), sc.nextInt());
        example_ftest47(sc.nextInt(), sc.nextInt());
	example_ftest48a(sc.nextInt());
        example_ftest48b(sc.nextInt());
        example_ftest49(sc.nextInt(), sc.nextInt());
        example_ftest50(sc.nextInt(), sc.nextInt());
        example_ftest51(sc.nextInt(), sc.nextInt());
        example_ftest52(sc.nextInt(), sc.nextInt());
        example_ftest53(sc.nextInt(), sc.nextInt());
        example_ftest54(sc.nextInt(), sc.nextInt());
        example_ftest55(sc.nextInt(), sc.nextInt());
        example_ftest56(sc.nextInt(), sc.nextInt());
        example_ftest57(sc.nextInt(), sc.nextInt());
        example_ftest58(sc.nextInt(), sc.nextInt());
        example_ftest59(sc.nextInt(), sc.nextInt());
        example_ftest60(sc.nextInt(), sc.nextInt());
        example_ftest61(sc.nextInt(), sc.nextInt());
        example_ftest62(sc.nextInt(), sc.nextInt());
        example_ftest63(sc.nextInt(), sc.nextInt());
        example_ftest64(sc.nextInt(), sc.nextInt());
        example_ftest65(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int k = example_ftest66(-3);
        example_ftest67(sc.nextInt(), sc.nextInt());
        example_ftest68(sc.nextInt(), sc.nextInt());
        example_ftest69(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest70(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest71(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest72(sc.nextInt(), sc.nextInt(), sc.nextInt());
        example_ftest73();
	return;
    }
    
    private static void example_ftest1(int a){
        //Write your function here
	if(a>0)
	    System.out.println("+");
	else
	    System.out.println("-");
        return;
    }

    private static void example_ftest2(int a, int b, int c) {
	System.out.println("a?b");
	if(a>b && b>c)
	    System.out.println("a>b>c");
	else if(a>c && c>b)
	    System.out.println("a>c>b");
	else if(b>a && a>c)
	    System.out.println("b>a>c");
	else if(b>c && c>a)
	    System.out.println("b>c>a");
	else if(c>a && a>b)
		    System.out.println("c>a>b");
	else if(c>b && b>a)
	    System.out.println("c>b>a");
	else
	    System.out.println("We have == variables.");
    }

    private static void example_ftest3(double a){
        //Write your function here
	if(a>0.5)
	    System.console();
	System.out.println("line 1");
	System.out.println("line 2");
	System.out.println("line 3");
	System.out.println("line 4");
        return;
    }

    private static void example_ftest4(int a){
        //Write your function here
	if(a>5)
	    return;
	System.out.println("line 1");
	System.out.println("line 2");
	System.out.println("line 3");
	System.out.println("line 4");
        return;
    }

    private static void example_ftest5(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.println("1");
	    break;
	case 2:
	    System.out.println("2");
	    break;
	default:
	    System.out.println("def");
	}
	System.console();
        return;
    }

    private static void example_ftest6(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.println();
	case 2:
	    System.console();
	    break;
	case 3:
	    System.out.println("3");
	    return;
	default:
	    System.out.println("def");
	}
	System.console();	
	System.console();
        return;
    }

    private static void example_ftest7(int a){
        //Write your function here
	int i = 0;
	while(i<a){
	    System.out.println(i);
	    i += 1;
	}
	System.console();
        return;
    }

    private static void example_ftest8(int a){
        //Write your function here
	for(int i=0; i<a; i++){
	    System.out.println(i);
	    i += 1;
	}
	System.console();
        return;
    }

    private static void example_ftest9(int a){
        //Write your function here
	int i = 0;
	do{
	    System.out.println(i);
	    i += 1;
	}while(i<=a);
	System.console();
        return;
    }

    private static void example_ftest10(int a) throws Exception{
        //Write your function here
	if(a>100)
	    throw new Exception();
	System.console();
	System.console();
        return;
    }

    private static void example_ftest11(int a){
        //Write your function here
	try{
	    if(a<923)
		throw new Exception();
	}catch(Exception e){
	    System.out.println("Exception is here!");
	    e.printStackTrace();
	}
	System.console();
        return;
    }

    private static void example_ftest12(int a){
        //Write your function here
	switch(a){
	case 1:
	    System.out.println("1");
	case 2:
	    System.console();
	    break;
	case 3:
	    System.out.println("5");
	case 4:
	    System.console();
	    break;
	default:
	    System.err.println("sdfsd");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest13(int a, int b){
        //Write your function here
	if(a>100)
	    return;
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println("1");
	    //break; //
	case 2:
	    System.out.println("2");
	    break;
	case 3:
	    System.out.println("3");
	    return;
	default:
	    System.out.println("def");
	}
	System.console();	
	System.console();
        return;
    }

    private static void example_ftest14(int a, int b, int c){
        //Write your function here
        // composite if
        if (a > b) {
            if (a > c) {
                System.console();
            } else {
                System.console();
            }
            System.console(); // join together
        } else {
	    System.out.println();
            if (b > c) {
                System.console();
            } else {
                System.console();
            } // not join together
	}
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

    private static void example_ftest16(int a, int b, int c){
        //Write your function here
	if(a>b)
	    System.console();
	System.out.println("dummy");
	System.out.println("dummy");
       	if(a>b){
	    System.out.println("path to Control Split block");
	    System.console();
	    if(b>c)
		System.out.println("b>c");
	    else
		System.out.println("b<=c");
	}else{
	    System.out.println("dsfsdf");
	    if(a>c)
		System.out.println("a>c");
	    else
		System.out.println("a<=c");
	    System.out.println("breaking println");
	    if(a+b<c)
		System.out.println("a+b<c");
	    else
		System.out.println("??");
	}		
 	System.console();
	System.console();
        return;
    }

    private static void example_ftest17(int a, int b, int c){
        //Write your function here
	System.console();
	System.console();
	switch(c){
	case 3:
	    return;
	case 4:
	    if(a>b)
		System.out.println("1");
	    else
		System.out.println("2");
	    System.out.println("merge");
	    break;
	default:
	    if(b<=c)
		System.out.println("3");
	    else
		System.out.println("4");
	    break;
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest18(int a, int b, int c){
        //Write your function here
	System.console();
	System.console();
	if(a>c){ 
	    switch (c) {  
	    case 21: 
		return;
	    case 3:
		System.out.println("3");
		break;
	    default:
		System.console();
		break;
	    }
	    System.out.println("breaking prtln");
	    if(a>b)
		System.out.println("a>b");
	    else
		System.out.println("a<=b");
	    System.console();
	}else
	    System.out.println("else branch");
	System.out.println("ending branch");
	System.console();
        return;
    }

    private static void example_ftest19(int a, int b){
        //Write your function here
	System.out.println("begin");
	System.console();
        // simple loop
        int i = 0;
        while (i < a) {
            System.console();
	    if(a>b)
		System.out.println("a>b");
	    else
		System.out.println("!(a>b)");
	    System.console();
            i += 1;
        }
	System.out.println("end");
	System.console();
        return;
    }

    private static void example_ftest20(int a, int b){
        //Write your function here
	System.console();
	for(int i=0; i<a; i++){
	    System.out.println(i);
	    for(int j=0; j<b; j++){
		System.out.println(j);
	    }
	    System.console();
	}
	System.console();
        return;
    }

    private static void example_ftest21(int a, int b, int c){
        //Write your function here
	System.console();
	for(int i=0; i<a; i++)
	    for(int j=0; j<b; j++)
		for(int k=0; k<c; k++){
		    System.out.println(i);
		    System.out.println(j);
		    System.out.println(k);
		}
	System.console();
        return;
    }

    private static void example_ftest22(int a, int b){
        //Write your function here
	System.console();
	if(a<b){
	    for(int i=0; i<a; i++)
		System.out.println(i);
	}else{
	    for(int i=100; i>=b; i--)
		System.out.println(i);
	}
	System.console();
        return;
    }

    private static void example_ftest23(int a, int b){
        //Write your function here
	if(a<b)
	    return;
	System.out.println("Begin");
	int i = 0;
	while(i<a){
	    System.out.println(i);
	    i += 1;
	}
	System.out.println("End");
        return;
    }

    private static void example_ftest24(int a, int b){
        //Write your function here
	if(a<b)
	    return;
	System.out.println("Begin");
	int i = 0;
	do{
	    System.out.println(i);
	    i += 1;
	}while(i<a);
	System.out.println("End");
        return;
    }

    private static void example_ftest25(int a, int b){
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	}
	System.out.println("End");
        return;
    }

    private static void example_ftest26(int a, int b){
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		continue;
	    System.console();
	}
	System.out.println("End");
        return;
    }

    private static void example_ftest27(int a, int b, int c){
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	    if(i>c)
		break;
	    System.console();
	}
	System.out.println("End");
        return;
    }

    private static void example_ftest28(int a, int b, int c) throws Exception{
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	    if(i>c)
		throw new Exception();
	    System.console();
	}
	System.out.println("End");
        return;
    }

    private static void example_ftest29(int a, int b, int c) {
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		break;
	    System.console();
	    if(i>c)
		continue;
	    System.console();
	}
	System.out.println("End");
        return;
    }

    private static void example_ftest30(int a, int b, int c) throws Exception{
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>c)
		throw new Exception();
	    System.console();
	}
	System.out.println("End");
    }

    private static void example_ftest31(int a, int b, int c) throws Exception{
        //Write your function here
	System.out.println("Begin");
	for(int i=0; i<a; i++){
	    System.console();
	    if(i>b)
		throw new Exception();
	    System.out.println("body");
	    if(i>c)
		throw new Exception();
	    System.console();
	}
	System.out.println("End");
        return;
    }

    private static int example_ftest32(int [] list){
        //Write your function here
	int total = 0;
	for(int val : list) {
	    total += val;
	}
	return total;
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

    private static void example_ftest34(int a, int b, int c){
        //Write your function here
	assert c>a && c<b : "c must be in range [a,..,b]";
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

    private static void example_ftest36(Integer i){
        //Write your function here
	synchronized(fastftest.class){
	    i += 100;
	}
	System.console();
        return;
    }

    private static void example_ftest37() throws Exception {
        //Write your function here
	Runnable sharedRunnableInstance = new Runnable(){
		public void run() {
		    // stuff here
		}
	    };
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
        thread1.start();
        thread2.start();
        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate
	System.console();
	System.console();
        return;
    }

    private static void example_ftest38(int a, int b){	
	switch(a){  
	case 1:
	    System.out.println(); // B1, B2
	case 2:  // B3
	    System.console();  // B4, B5
	case 3:  // B6
	    System.out.print("cse3");  // B7, B8
	default:  // B9
	    System.out.println("def");  // B10, B11
	}
    }

    private static void example_ftest39(int a, int b){
	if(a*a<b*9)
	    return;
	switch(a){  
	case 1:
	    System.out.println(); 
	case 2: 
	    System.console();
	case 3:
	    System.out.print("cse3");
	default:
	    System.out.println("def");
	}
	if(a>b)
	    System.console();
	else
	    System.out.println("tail");
    }

    private static void example_ftest40(int a, int b){
	switch(a){  // B0
	case 1:
	    System.out.println();  // B1, B2
	case 2: // B3
	    System.console(); // B4, B5
	    break;
	default:
	    System.out.println("def"); // B6, B7
	    return;
	}
    }

    private static void example_ftest41(int a, int b){
	switch(a){  // B0
	case 1:
	    System.out.println();  // B1, B2
	    break;
	case 2: // B3
	    break;
	default:
	    System.out.println("def");  // B4, B7
	    return;
	}
	System.console();  // B4, B5
    }

    private static void example_ftest42(int a, int b, int c) throws Exception {
	System.console();
	System.console();
	if(a>b+c)
	    return;
	switch(b){
	case 1:
	    System.out.println("1");
	    break;
	case 2:
	    System.out.println("2");
	    break;
	case 3:
	    System.console();
	    throw new Exception("ex1");
	case 4:
	    System.out.println("4");
	    throw new Exception("ex2");
	default:
	    System.out.println("default");
	}
	System.console();
	System.console();
    }

    private static void example_ftest43(int a, int b) throws Exception {
        //Write your function here
	System.console();
	System.console();
	if(a>b)
	    System.out.println();
	System.console();
	System.console();
	switch(a){
	case 1:
	    for(int i=0; i<b; i++)
		System.out.println(i);
	case 2:
	    System.console();
	case 3:
	    throw new Exception();
	default:
	    System.out.println("def");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest44(int a, int b){
        //Write your function here
	if(a>b){
	    System.console();
	    return;
	}
	switch(a){
	case 1:
	    System.out.println();
	case 2:
	    System.console();
	    return;
	case 3:
	    System.out.print("case3");
	case 4:
	    System.out.println();
	default:
	    System.console();
	}
	System.out.println("epilog");
	System.out.println("epilog");
        return;
    }

    private static void example_ftest45(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.print("1");
	    break;
	case 2:
	    System.out.print("2");
	    break;
	case 3:
	    System.out.print("3");
	    break;
	case 4:
	    System.console();
	    return;
	default:
	    System.console();
	    return;
	}
	if(a>b)
	    System.out.println("a>b");
	else
	    System.out.println("a<=b");
	System.console();
        return;
    }

    private static void example_ftest46(int a, int b){
        //Write your function here
	switch(a){
	case 1:
	    System.out.print("1");
	    break;
	case 2:
	    System.out.print("2");
	    break;
	case 3:
	    System.out.print("3");
	    break;
	case 4:
	    System.console();
	default:
	    System.console();
	    return;
	}
	if(a>b)
	    System.out.println("a>b");
	else
	    System.out.println("a<=b");
	System.console();
        return;
    }

    private static void example_ftest47(int a, int b){
        //Write your function here
	switch(a){
	case 13:
	case -13:
	case 324:
	case 123:
	case 232:
	    System.out.print("1");
	case 26:
	    System.out.print("2");
	    break;
	case 45:
	    System.console();
	default:
	    System.console();
	    return;
	}
	if(a>b)
	    System.out.println("a>b");
	else
	    System.out.println("a<=b");
	System.console();
        return;
    }

    private static void example_ftest48a(int a){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 10:
	    System.out.println("a==10 switch");
	}
	System.console();
	System.console();
	System.console();
	System.console();
	if(a==10)
	    System.out.println("a==10 if");
	System.console();
	System.console();
    }
    
    private static void example_ftest48b(int a){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 10:
	    System.out.println("a==10 switch");
	    break;
	default:
	    System.out.println("a!=10 if");
	}
	System.console();
	System.console();
	System.console();
	System.console();
	if(a==10)
	    System.out.println("a==10 if");
	else
	    System.out.println("a!=10 if");
	System.console();
	System.console();
    }

    private static void example_ftest49(int a, int b){
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.print("Epilog");
	}else{
	    System.out.print("else brabch");
	    System.out.println();
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest50(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		throw new Exception();
	    case 4:
		throw new Exception();
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.print("Epilog");
	}else{
	    System.out.print("else brabch");
	    System.out.println();
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest51(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	}else{
	    System.out.print("else brabch");
	    System.out.println();
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest52(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		throw new Exception();
	    case 4:
		throw new Exception();
	    default:
		System.out.println("def");
		break;
	    }
	}else{
	    System.out.print("else brabch");
	    System.out.println();
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest53(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
	    case 2:
		System.out.println("2");
	    case 3:
		System.out.println("3");
		break;
	    case 4:
		throw new Exception();
	    default:
		throw new Exception();
	    }
	    System.out.println();
	    System.out.println();
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest54(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
	    case 2:
		System.out.println("2");
	    default:
		System.out.println("3");
		break;
	    }
	    System.out.println();
	    System.out.println();
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest55(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
		return;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		System.out.print("3");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
	    default:
		System.out.println("3");
		break;
	    }
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest56(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
	    case 2:
		System.out.println("2");
	    case 5:
		System.console();
		break;
	    case 3:
		System.out.print("3");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
		break;
	    case 4:
		System.out.println("4");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
		break;		   
	    default:
		System.out.println("3");
		break;
	    }
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest57(int a, int b) throws Exception {
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.println("1");
	    case 2:
		System.out.println("2");
	    case 5:
		System.console();
		break;
	    case 3:
		System.out.print("3");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
		break;
	    case 4:
		System.out.println("4");
		if(a>b)
		    System.out.println();
		else
		    System.out.print("else");
		break;		   
	    default:
		System.out.println("3");
		return;
	    }
	}else{
	    System.out.print("else branch");
	    System.out.print("else branch");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest58(int a, int b){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println();
	case 2:
	    System.out.print("case 2a");
	    System.out.print("case 2b");
	    break;
	case 3:
	    System.console();
	    return;
	case 4:
	    System.out.println("4");
	    break;
	default:
	    System.console();
	    switch(b){
	    case 1:
		System.out.println("b1");
		break;
	    case 2:
		System.out.println("b2");
		break;
	    case 3:
		System.out.println("b3");
		break;
	    default:
		System.console();
		return;
	    }
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest59(int a, int b){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println();
	    switch(b){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.println();
	    break;
	case 2:
	    System.console();
	    break;
	default:
	    System.out.print("def");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest60(int a, int b){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println();
	    switch(b){
	    case 0:
		return;
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.println();
	    break;
	case 2:
	    System.console();
	    break;
	default:
	    System.out.print("def");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest61(int a, int b) throws Exception {
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println();
	    switch(b){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.println();
	    break;
	case 2:
	    System.console();
	    break;
	case 3:
	    return;
	case 4:
	    throw new Exception();
	default:
	    System.out.print("def");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest62(int a, int b) throws Exception {
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    System.out.println();
	    switch(b){
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		return;
	    default:
		System.out.println("def");
		break;
	    }
	    System.out.println();
	    break;
	case 2:
	    System.console();
	    break;
	case 3:
	    return;
	case 4:
	    throw new Exception();
	case 5:
	    throw new Exception();
	default:
	    System.out.print("def");
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest63(int a, int b){
        //Write your function here
	if(a>b){
	    System.console();
	    switch(a){
	    case 1:
		System.out.println("1");
		return;
	    case 2:
		System.out.println("2");
	    case 3:
		System.out.println("3");
		break;
	    }
	    switch(b){
	    case 1:
		System.out.print("1");
		break;
	    case 2:
		System.out.print("2");
	    case 3:
		System.out.print("3");
		break;
	    default:
		System.console();
		return;
	    }
	    System.console();
	    System.console();
	}else{
	    System.out.print("else v1");
	    System.out.print("else v2");
	}
	System.console();
	System.console();
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

    private static void example_ftest65(int a, int b, int c){
        //Write your function here
	System.console();
	System.console();
	if(a>0)
	    if(b>0)
		if(c<0)
		    System.out.println("entered");
	System.console();
	System.console();
        return;
    }

    private static int example_ftest66(int a){
        //Write your function here
	System.out.println("start:");
	int i = a;
	if(a>0)
	    i++;
	else
	    i--;
	System.out.println("end:");
        return i;
    }

    private static void example_ftest67(int a, int b){
        //Write your function here
	System.console();
	System.console();
	switch(a){
	case 1:
	    for(int i=0; i<b; i++)
		System.out.println(i);
	case 2:
	    System.out.println();
	    break;
	default:
	    System.out.print("def.");
	    return;
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest68(int a, int b){
        //Write your function here
	System.console();
	System.console();
	if(a>b){
	    switch(a){
	    case 1:
		for(int i=0; i<b; i++)
		    System.out.println(i);
		System.out.print("loop end");
	    case 2:
		System.console();
	    case 3:
		System.out.println();
	    break;
	    default:
		System.out.print("def.");
		return;
	    }
	}else
	    System.out.println();
	System.console();
	System.console();
        return;
    }

    private static void example_ftest69(int a, int b, int c){
        //Write your function here
	if(a>b){
	    switch(a){
	    case 1:
		System.out.print("1");
	    case 2:
		System.out.println("2");
	    case 3:
		System.console();
		break;
	    case 4:
		System.out.print("4");
	    case 5:
		System.out.println("5");
	    case 6:
		System.out.println("6");
		break;
	    default:
		return;
	    }
	}else
	    System.out.println();
	System.console();
	System.console();
        return;
    }

    private static void example_ftest70(int a, int b, int c){
        //Write your function here
	if(a>b){
	    switch(a){
	    case 0:
		System.console();
	    case 1:
		System.out.print("1");
	    case 2:
		System.out.println("2");
	    case 3:
		System.console();
		break;
	    case 11:
		System.console();
	    case 4:
		System.out.print("4");
	    case 5:
		System.out.println("5");
	    case 6:
		System.out.println("6");
		break;
	    default:
		return;
	    }
	}else
	    System.out.println();
	System.console();
	System.console();
        return;
    }

    private static void example_ftest71(int a, int b, int c){
        //Write your function here
	if(a>b){
	    switch(a){
	    case 0:
		System.console();
	    case 1:
		System.out.print("1");
	    case 2:
		System.out.println("2");
	    case 3:
		System.console();
		break;
	    default:
		return;
	    }
	}else
	    System.out.println();
	System.console();
	System.console();
        return;
    }

    private static void example_ftest72(int a, int b, int c){
        //Write your function here
	switch(a){
	case 0:
	    System.console();
	case 1:
	    System.out.print("1");
	case 2:
	    System.out.println("2");
	case 3:
		System.console();
		break;
	default:
	    return;
	}
	System.console();
	System.console();
        return;
    }

    private static void example_ftest73(){
        //Write your function here
        return;
    }
}
