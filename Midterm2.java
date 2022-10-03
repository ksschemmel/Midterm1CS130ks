import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Midterm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat n = NumberFormat.getCurrencyInstance();
		NumberFormat Percent = NumberFormat.getPercentInstance();
		NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
		Scanner scan = new Scanner(System.in);
		double n2 = .06;
		System.out.println("the tax rate of Kentucky is: " + Percent.format(n2));
		double value = 40;
		System.out.println("I have spent " +n1.format(value) + " last week for food purchase");
		
		
	}

}
