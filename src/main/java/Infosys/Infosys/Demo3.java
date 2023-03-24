
package Infosys.Infosys;

public class Demo3 {

	public static void main(String[] args)
	{
		
		String str="swapnil";
		
		String l=str.substring(0,1).toUpperCase()+(str.substring(1,7));
		
		
		for(int i=l.length()-1;i>=0;i--)
		{
			
			System.out.print(l.charAt(i));
		}

	}

}
