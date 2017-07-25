
public class FunctionCalling {

	public static void main(String[] args) {
		functionFirst();
		functionSecond();
		functionTwice();
	}
	public static void functionFirst(){
		System.out.println("Hello World");
	}
	public static void functionSecond(){
		for(int i=0; i<=1; i++)
			functionFirst();	
	}
	public static int functionTwice(){
		functionSecond();
		return 0;
	}
	
}
