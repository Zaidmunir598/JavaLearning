class Box
{
	double width,height,depth;
	Box(double w,double h,double d);
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
	 public class TrioBox
	{
		public static void main(String Args[])
		{
			double a;
			Box obj1=new Box(2,3,4);
			Box obj2=new Box(2.5,5,6.5);
			a = obj.volume();
			System.out.println(a);
		}
	}
}