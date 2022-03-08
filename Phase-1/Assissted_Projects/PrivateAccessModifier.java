package assistedpro2;

public class PrivateAccessModifier
{
	
	private void run()
	{
		System.out.println("using Private access modifier.");
		System.out.println("runs 100cm. in 15sec");
	}
	public void walk()
	{
		System.out.println("Walk daily 3km.");
		this.run();
	}

}
