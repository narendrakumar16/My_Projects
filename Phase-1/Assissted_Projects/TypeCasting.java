package AssistedPro1;

public class TypeCasting {

	public static void main(String[] args) 
	{
		System.out.println("Implicit TypeCasting");
		char c='a';
		System.out.println("value of c "+c);
		int i=c;
		System.out.println("value of i "+i);
		long l=c;
		System.out.println("vlalue of l "+l);
		float f=c;
		System.out.println("value of f "+f);
		double d=c;
		System.out.println("value of d "+d);
		System.out.println("Explicit TypeCasting");
		float j=66.6f;
		System.out.println(" Before explicit Typecasting value of j "+j);
		int a=(int)j;//we have some loss of data by conversion of higher to lower datatypes
		System.out.println("value of a "+a);
		char b=(char)j;//it returns ASCII values for the Float values
		System.out.println("value of b "+b);
		
		

	}

}
