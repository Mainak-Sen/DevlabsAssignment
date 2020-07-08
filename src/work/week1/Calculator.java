package work.week1;

public class Calculator {
	
static int a;
static int b;

public Calculator(int a,int b){
	this.a=a;
	this.b=b;
}

public static int add() {
	
	return a+b;
}

public int subtraction() {
	
	return a-b;
}

public int mul() {
	
	return a*b;
}
public static  int div() {
	
	return a/b;
}

}
