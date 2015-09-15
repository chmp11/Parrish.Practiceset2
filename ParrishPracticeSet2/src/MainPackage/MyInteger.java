package MainPackage;

public class MyInteger {
	private int value;
	MyInteger(int value){
		this.value=value;
	}	
	int getMyInteger(){
		return value;
	}
	//creates the instances of isEvan isOdd isPrime
	public boolean isEven(){
		return ((value%2)==0);
	}
	public boolean isOdd(){
		return ((value%2)!=0);
	}
	public boolean isPrime(){
		int n=(value-1);
		while (n>2){
			if (value%n==0){
				return (false);
			}
			else{
				n=n--;
			}
		}
		return (true);
	}
	//Creates static methods isEven isOdd isPrime with int parameter
	public static boolean isEven(int value){
		return (((value)%2)==0);
	}
	public static boolean isOdd(int value){
		return (((value)%2)!=0);
	}
	public static boolean isPrime(int value){
		int n=(value-1);
		while (n>2){
			if (value%n==0){
				return (false);
			}
			else{
				n=n--;
			}
		}
		return (true);
	}
	//Creates static method with my integer that use an instance of isEven, etc
	public static boolean isEven(MyInteger number){
		return number.isEven();
		}
	public static boolean isOdd(MyInteger number){
		return number.isOdd();
		}
	public static boolean isPrime(MyInteger number){
		return number.isPrime();
		}
	public boolean equals(int number){
		return (number==value);
	}
	public boolean equals(MyInteger number){
		return(value==number.getMyInteger());
	}
	public static int parseInt(char[] c){
		String n=new String(c);
		return Integer.parseInt(n);
	}
	public static int parseInt(String str){
		return Integer.parseInt(str);
	}
	
}
