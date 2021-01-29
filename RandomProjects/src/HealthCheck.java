import java.util.Scanner;

public class HealthCheck {
    
    public static void main(String args[]) {
        System.out.println("press 1 if you are a kid (0-19) \npress 2 if you are an adult(20-55) \npress 3 if you are old (56+) \n");
        Scanner inp1 = new Scanner(System.in); //given
        int age = inp1.nextInt(); //read
        
        System.out.println("Enter your weight in kg (eg: 60 , 80)");
        Scanner inp2 = new Scanner(System.in); //given
        float weight = inp2.nextFloat(); //read
        
        System.out.println("Enter your height in inches (eg: 60 , 72)");
        Scanner inp3 = new Scanner(System.in); //given
        float height = inp3.nextFloat(); //read
        
        float ratio = (height/weight);
        
        switch (age)
        {
            case 1:
                if (ratio >= 0.9 && ratio <= 1.3 )
                {
                    System.out.println("optimum health");
                }
                else if ((ratio <= 0.9 && ratio >= 1.3)&&(ratio >= 0.8999999 && ratio <= 1.30000000001))
                {
                    System.out.println("moderate health");
                }
                else 
                {
                    System.out.println("poor health");
                }
                break;
            case 2:
                if (ratio >= 0.75 && ratio <= 1.45 )
                {
                    System.out.println("optimum health");
                }
                else if ((ratio <= 0.75 && ratio >= 1.45)&&(ratio >= 0.749999999 && ratio <= 1.450000001))
                {
                    System.out.println("moderate health");
                }
                else 
                {
                    System.out.println("poor health");
                }
                break;
            case 3:
                if (ratio >= 0.6 && ratio <= 1.6 )
                {
                    System.out.println("optimum health");
                }
                else if ((ratio <= 0.6 && ratio >= 1.6)&&(ratio >= 0.5999999 && ratio <= 1.60000000001))
                {
                    System.out.println("moderate health");
                }
                else 
                {
                    System.out.println("poor health");
                }
                break;
        }
        inp1.close();
        inp2.close();
        inp3.close();
    }
}