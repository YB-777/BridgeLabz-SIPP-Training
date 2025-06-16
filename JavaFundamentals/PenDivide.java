public class PenDivide
{
	public static void main(String[] args)
	{
         int pen = 14, students = 3;
         int penPerStudent = (int)(pen/students);
	 int remainingPen =  pen%students;
	    System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainingPen);
	}
}
