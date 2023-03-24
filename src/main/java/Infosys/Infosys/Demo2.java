package Infosys.Infosys;

public class Demo2 {

	public static void main(String[] args) 
	{
		
		
		String str="swapnil a java";
		String [] b=str.split(" ");
		String z="";
		for(String a:b)
		{
			
			for(int i=a.length()-1;i>=0;i--)
			{
				z=z+a.charAt(i);
				
				
			}
			z=z+" ";
			
			
		}
		System.out.println(z);
	}

}
