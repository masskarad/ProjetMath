package formule;

public class Analyseur
{

	public void analyse(char[] p_formule)
	{
		int parentheses = 0;
		
		for (int i = 0; i<p_formule.length; i++)
		{
			if (p_formule[i]=='(')
				parentheses++;
			if (p_formule[i]==')')
				parentheses--;
			if (parentheses==1)
			{
				
			}
		}
	}

	public static void main(String[] args)
	{
		char[] test = "(t|r)".toCharArray();
		
	}
}
