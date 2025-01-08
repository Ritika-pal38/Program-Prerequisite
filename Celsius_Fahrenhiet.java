import java.util.Scanner;
public class Celsiustofahrenheit{
        public static void main(String[]args){
		         
				double celsius, fahrenhiet;
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the temperature:");
                celsius = sc.nextDouble();
				fahrenhiet = (celsius*9/5) +32;
				System.out.println("The value of temperature in fahrenhiet:"+fahrenhiet);
			    
				sc.close();
}