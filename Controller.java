import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Represents the controller to handle out the calculation of the power
 * function.
 * @author Himani Patel
 * @version 1.0
 */

public class Controller {
  
  
  /**
   * Calculates the factorial for the given number.
   * @param number This is a given number.
   * @return factorial This is the factorial of the given number.
   */
  
  public double calculateFactorial(double number)  {
    if (number <= 1) {
      return 1;
    }  else {
      return (number * calculateFactorial(number - 1));     
    }
  }

  
  /**
   * Calculates the power for only whole numbers.
   * @param x This is a base.
   * @param y This is a exponent
   * @return power This is the power x raised to the power of y
   */
  
  public double calculatePowerForInteger(double x,double y) {
 
    double power = 1;
    for (int i = 1; i <= y; i++)  {
      power = power * x;
    }
    return power;
  }
  
  
  /**
   * Calculates the Natural log for the given number.
   * @param number This is a given number.
   * @return ans This is the natural log of given number.
   */

  public double calculateNaturalLog(double number) {
    double ans = 0;
    double base = (number - 1) / (number + 1);
    for (int i = 1; i <= 125; i++) {
      double exponent = 2 * i - 1;
      ans += (1 / exponent) * (calculatePowerForInteger(base,exponent));
    }
    return 2 * ans;           
  }

  
  /**
   * Calculates the power for any user given numbers.
   * @param x This is a base.
   * @param y This is a exponent.
   * @return answer This is the power x raised to the power of y.
   */

  public double calculatePowerForReal(double x,double y) {
    double answer = 0;
    double logValue;
  

    if (x < 0) {
      logValue = calculateNaturalLog(x * (-1));
    } else {
      logValue = calculateNaturalLog(x);
    }
    if (x == 0 && y > 0) {
      return answer;
    }
    
    for (int i = 0; i <= 125; i++) {
      double numerator = calculatePowerForInteger((y * logValue),i);
      double denominator = calculateFactorial(i);
      answer = answer + (numerator / denominator);
    } 
    
    try {
      DecimalFormat df = new DecimalFormat(".##########");
      answer = Double.parseDouble(df.format(answer));
    } catch (NumberFormatException e)
    {
      
    }
    
    if (x < 0 && y % 2 != 0) {
      return answer * (-1);
    } else {
      return answer;
    }
  }

  
  /**
   * Calls the method for computing the power of any real number.
   * Prints the result of the x raised to the power of y.
   * @param args arguments to be passed.
   */
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    
    Controller c = new Controller();
    double answer = c.calculatePowerForReal(x, y);
    
    System.out.println(answer);
  }

}
