package sruthi;

public class Student {
	String name;
	int id;
	float per;
	
	public Student(String name,int id,float per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
	}
	public static void main(String[] args) {
		Student s=new Student("Johnsy",101,85);
		Student s1=new Student("Johnsy",101,75);
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
	
//    public boolean equals(Student ob)
//    {
//    	if(this.id==ob.id)
//    		return true;
//    	else
//    		return false;
//    }
    
    public boolean equals(Student ob)
    {
    	if(this.name==ob.name && this.id==ob.id )
    		return true;
    	else
    		return false;
    }
    
    
//    public boolean equals(Student ob)
//    {
//    	if(this.name==ob.name)
//    		return true;
//    	else
//    		return false;
//    }

}
