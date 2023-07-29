package sruthi;

public class Pen {
	int price;
	String brand;
	String color;
	public Pen(String brand,String color,int price)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
	public static void main(String[] args)
	{
		Pen p=new Pen("tecnotip","blue",10);
		Pen q=new Pen("renolds","red",20);
		System.out.println(p);
		System.out.println(q);
	}
	
//	public String toString()
//	{
//		
//		return brand+" "+color+" "+price;
//	}

}
