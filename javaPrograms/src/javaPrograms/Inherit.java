package javaPrograms;

class shape{

	protected double l;
	shape(double l){
		this.l=l;
	}
}
class square extends shape{
	square(double l){
		super(1);
	}
	void area(){
		System.out.println("Area of square is: "+l*l);
	}
}
class Rectangle extends square{
	private double b;
	Rectangle(double x,double y){
		super(x);
		b=y;
	}
	void area(){
		System.out.println("Area of Rectangle is:"+l*b);
	}
}
public  class Inherit{
	public static void main(String args[]){
		square s=new square(5.5);
		s.area();
		Rectangle r=new Rectangle(5.5,6);
		r.area();
	}
}