import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;


/*****************************************************************
Represents the test class to test controller class.
To test the power function and other sub-functions.

@author Himani Patel
@version 1.0
*****************************************************************/
public class ControllerTest 
{
  
        Controller c = new Controller();
    
        
        /*****************************************************************
        Tests the factorial function.
        
        *****************************************************************/      
        @Test
        public void testCalculateFactorial() 
        {
          double result = c.calculateFactorial(5);
          assertEquals(new BigDecimal(120.0),new BigDecimal(result));    
        }
        
        
        /*****************************************************************
        Tests the Power function for integer.
        
        *****************************************************************/     
        @Test
        public void testCalculatePowerForInteger() 
        {         
          double result = c.calculatePowerForReal(2,2);
          assertEquals(new BigDecimal(4.0),new BigDecimal(result));
          
        }
      
        
        /*****************************************************************
        Tests the natural log function.
        
        *****************************************************************/
        @Test
        public void testCalculateNaturalLog() 
        {           
          double result = c.calculateNaturalLog(5);
          assertEquals(new BigDecimal(1.6094379124341003),new BigDecimal(result));
          
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR3) -> x is Zero , y is Positive.
               
        *****************************************************************/
        @Test
        public void testCalculatePowerForZero() 
        {
          double result1 = c.calculatePowerForReal(0, 5);
          assertEquals(new BigDecimal(0.0),new BigDecimal(result1));
          
          double result2 = c.calculatePowerForReal(0, 5.5);
          assertEquals(new BigDecimal(0.0),new BigDecimal(result2));
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR4) -> x is Negative, y is Zero.
               
        *****************************************************************/    
        @Test
        public void testCalculatePowerForNegativeZero() 
        {         
          double result1 = c.calculatePowerForReal(-2, 0);
          assertEquals(new BigDecimal(1.0),new BigDecimal(result1));
          
          double result2 = c.calculatePowerForReal(-2.2, 0);
          assertEquals(new BigDecimal(1.0),new BigDecimal(result2));
           
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR5) -> x is Negative, y is Odd 
        Negative.
               
        *****************************************************************/    
        @Test
        public void testCalculatePowerForNegativeOdd() 
        {
          double result1 = c.calculatePowerForReal(-2, -5);
          assertEquals(new BigDecimal(-0.03125),new BigDecimal(result1));
          
          double result2 = c.calculatePowerForReal(-2.2, -5);
          assertEquals(new BigDecimal(-0.0194037913),new BigDecimal(result2));
             
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR6) -> x is Negative, y is Even
        Negative.
               
        *****************************************************************/ 
        @Test
        public void testCalculatePowerForNegativeEven() 
        {         
          double result1 = c.calculatePowerForReal(-2, -4);
          assertEquals(new BigDecimal(0.0625),new BigDecimal(result1));
               
          double result2 = c.calculatePowerForReal(-2.2, -4);
          assertEquals(new BigDecimal( 0.042688341),new BigDecimal(result2));
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR7) -> x is Negative, y is Odd 
        Positive.
               
        *****************************************************************/ 
        @Test
        public void testCalculatePowerForPositiveOdd() 
        {         
          double result1 = c.calculatePowerForReal(-2, 5);
          assertEquals(new BigDecimal(-32.0),new BigDecimal(result1));
            
          double result2 = c.calculatePowerForReal(-2.2, 5);
          assertEquals(new BigDecimal(-51.53632),new BigDecimal(result2));
         
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR8) -> x is Negative, y is Even 
        Positive.
               
        *****************************************************************/ 
        @Test
        public void testCalculatePowerForPositiveEven() 
        {
          double result1 = c.calculatePowerForReal(-2, 4);
          assertEquals(new BigDecimal(16.0),new BigDecimal(result1));
          
          double result2 = c.calculatePowerForReal(-2.2, 4);
          assertEquals(new BigDecimal(23.4256),new BigDecimal(result2));
  
        }
              
        
        /*****************************************************************
        Tests the functional requirement (FR9) -> x is Positive, y is Zero.
               
        *****************************************************************/
        @Test
        public void testCalculatePowerForPositiveZero() 
        {
          double result1 = c.calculatePowerForReal(5, 0);
          assertEquals(new BigDecimal(1.0),new BigDecimal(result1));
          
          double result2 = c.calculatePowerForReal(5.5, 0);
          assertEquals(new BigDecimal(1.0),new BigDecimal(result2));
  
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR10) -> x is Positive, y is Negative.
               
        *****************************************************************/
        @Test
        public void testCalculatePowerForPositiveNegative() 
        {         
          double result1 = c.calculatePowerForReal(5, -3);
          assertEquals(new BigDecimal(0.008),new BigDecimal(result1));
  
          double result2 = c.calculatePowerForReal(5, -3.3);
          assertEquals(new BigDecimal(0.0049362709),new BigDecimal(result2));
          
          double result3 = c.calculatePowerForReal(5.5, -3.3);
          assertEquals(new BigDecimal(0.0036041522),new BigDecimal(result3));
          
          double result6 = c.calculatePowerForReal(5.5, -3);
          assertEquals(new BigDecimal(0.0060105184),new BigDecimal(result6));
          
        }
        
        
        /*****************************************************************
        Tests the functional requirement (FR11) -> x is Positive, y is Positive.
               
        *****************************************************************/
        @Test
        public void testCalculatePowerForPositivePositive() 
        {
          double result1 = c.calculatePowerForReal(5, 3);
          assertEquals(new BigDecimal(125.0),new BigDecimal(result1));

          double result2 = c.calculatePowerForReal(5, 3.3);
          assertEquals(new BigDecimal(202.5820745866),new BigDecimal(result2));
          
          double result3 = c.calculatePowerForReal(5.5, 3.3);
          assertEquals(new BigDecimal(277.4577597233),new BigDecimal(result3));
 
          double result4 = c.calculatePowerForReal(5.5, 3);
          assertEquals(new BigDecimal(166.375),new BigDecimal(result4));
       
        }
        


}
