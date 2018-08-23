class Abc
{
	static String Inst;
    String myName; //non-static member is also called instance variable
	public static void main(String args[]) 
	{
		Inst="Chitkara";
		Abc a=new Abc();//non-static members can't be accessed without objects
		a.myName="xxx";
		System.out.println("College" +Inst);

		
		System.out.println("My name " +a.myName);//static members can access static variables only
	}
}