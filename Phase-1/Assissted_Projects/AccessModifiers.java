package assistedpro2;
import assisstedpro2.*;

//Access modifiers are public
public class AccessModifiers 
{
	public static void main(String[] args) 
	{
		System.out.println("Default access modifier.");
		DefaultAccessModifier dam=new DefaultAccessModifier();
		dam.show();//default
		PrivateAccessModifier pam=new PrivateAccessModifier();
		pam.walk();//private
		}
	

}
