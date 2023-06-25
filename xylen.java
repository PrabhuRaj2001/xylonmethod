package sample;
import java.util.*;
public class prabhu {
	
	static int a=12;

	public static void main(String[] args) throws Exception {
		
		int xylen=21133;
		int last=xylen%10;
		xylen=xylen/10;
		int sum=0;
		while(xylen>9)
		{
			sum=sum+(xylen%10);
			xylen=xylen/10;
		}
		if(sum==xylen+last)
		{
			System.out.println("It is xylon");
		}
		else
		{
			System.out.println("It is not xylon");
		}
		
	}