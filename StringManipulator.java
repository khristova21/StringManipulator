
public class StringManipulator
{

	private String newStr;
	
	public StringManipulator() 
	{
		newStr = "";
	}
	
	//methods
	//noVowels, all vowels replaced with * 
	public String noVowels(String oldStr)
	{
		for(int i = 0; i< oldStr.length(); i++ )
			if(oldStr.charAt(i) == 'a' ||oldStr.charAt(i) == 'A' || oldStr.charAt(i) == 'e' || oldStr.charAt(i) == 'E' ||oldStr.charAt(i) == 'i' || oldStr.charAt(i) == 'I' || oldStr.charAt(i) == 'o' || oldStr.charAt(i) == 'O' || oldStr.charAt(i) == 'u' || oldStr.charAt(i) == 'U' )
				newStr = newStr + "*";
			else
				newStr = newStr + (oldStr.charAt(i));
		return newStr;
		
	}
	
	
	//reverse
	public String reverse(String oldStr)
	{
		int len = oldStr.length()-1;
		for(int i = 0; i< oldStr.length(); i++)
			newStr = newStr + (oldStr.charAt(len-i));
		return newStr;
		
	}
	
}
