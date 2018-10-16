
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
			if(oldStr.charAt(i) == 'a' ||oldStr.charAt(i) == 'e' ||oldStr.charAt(i) == 'i' || oldStr.charAt(i) == 'o' || oldStr.charAt(i) == 'u' )
				newStr = newStr + "*";
			else
				newStr = newStr + (int)(oldStr.charAt(i));
		return newStr;
		
	}
	
	
	//reverse
	
}
