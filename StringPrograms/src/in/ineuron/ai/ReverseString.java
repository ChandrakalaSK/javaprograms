package in.ineuron.ai;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="hi";
		String str1 = "";
		char ch;
		System.out.println("Original string:"+ str);
		for(int i = 0;i<str.length();i++)
		{
			ch = str.charAt(i);
			str1 =ch+str1;
		}
		
		System.out.println("Reversed word:"+str1);
	}

}
