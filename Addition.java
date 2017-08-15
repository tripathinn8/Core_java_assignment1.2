
import java.util.*;

public class Addition
{
public void AddNumbers(int a, int b)
{
	while(b!=0)
	{
		int carry= (a&b);
		a=a^b;
		b=carry<<1;
	}
	System.out.println("The sum is"+ " " + a);
}
	public static void main(String[] args) 
	{
		Addition obj = new Addition();
		obj.AddNumbers(10,10);

	}

}
