package StringTopic;

import java.util.HashMap;

public class RemoveDuplicateUsingMap {

	public static void main(String[] args) {
		int[] a= {1,3,5,2,8,9,10};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==11)
				{
					if(map.containsKey(a[i])==false)
					{
						if(map.containsValue(a[i])==false)
						{
							map.put(a[i], a[j]);
						}

					}
				}
			}
		}
		System.out.println(map);

	}

}
