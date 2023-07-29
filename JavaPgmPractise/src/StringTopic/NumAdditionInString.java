package StringTopic;

public class NumAdditionInString {

	public static void main(String[] args) {
		String s="123abc98";
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
			    //int num=Character.getNumericValue(ch[i]);
				int num=ch[i]-48;
				//System.out.println(num);
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}
}
