package module3;

public class CountofAlphaNumericSpacesSpecial {
static int countNumeric;
static int countAlpha;
static int countSpace;
static int countSpecial;
	public static void main(String[] args) {
	String a = "auto123eee 567576rr@#$";
	char[]c1= a.toCharArray();
	//System.out.println(c1);
	for(int i =0;i<a.length();i++) 
	{
		
	boolean b1=	Character.isDigit(c1[i]);
	if(b1==true) 
	{
		
		countNumeric++;
	}
	boolean b2=	Character.isAlphabetic(c1[i]);
	if(b2==true) 
	{
		countAlpha++;
	}
	
		boolean b3=	Character.isWhitespace(c1[i]);
		if(b3==true) 
		{
			countSpace++;
	}
		if(!b1 && !b2 && !b3) {
			countSpecial++;
		}
	}
	
	System.out.println(countNumeric);
	System.out.println(countAlpha);
	System.out.println(countSpace);
	System.out.println(countSpecial);
}
}

