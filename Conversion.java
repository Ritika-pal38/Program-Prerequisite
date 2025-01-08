import java.util.*
    class Conversion_km_m{
	   public static void main(String[]args){
	        int kilometer = 0;
			double miles = 0.0;
			Scanner sc = new Scanner(System.in);
			kilometer = sc.nextInt();
			miles = kilometer*0.621371;
			
			System.out.println("Value in miles is:"+miles);
			
			sc.close();
			}
		}