package StringTopic;

public class OccCount {
    public static void main(String[] args) {
        String s="Happiestmind";
        int count=1;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    ch[j]='0';
                 
                }
                else if(ch[i]!='0')
                {
                	
                     System.out.println(ch[i]+""+count);
                     count=1;
                     break;
                  
                }
            }
           
        }
    }

}
