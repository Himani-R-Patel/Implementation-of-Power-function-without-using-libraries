import java.awt.Color;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Represents User Interface Class which provides the main window to the user to enter 
 * the values for x and y.
 * @author Himani Patel
 * @version 1.0
 */

public class View {

  private JFrame frmSoen;
  private final JLabel lblFunction = new 
      JLabel("Function 9 : Calculate Power Function \r\nf(x,y) = x ^ y");
  private JTextField textFieldX;
  private JTextField textFieldY;
  private JTextField answer;
  
  
  /**
   * Launch the Application.
   * @param args arguments to be passed
   */
  
  public static void main(String[] args) {
    
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
              View window = new View();
              window.frmSoen.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
    });
  }
  
  
  /**
   * Initializes the contents of the frame of User Interface.
   */
  
  private void initialize() {
    frmSoen = new JFrame();
    frmSoen.setTitle("SOEN6011");
    
    answer = new JTextField();
    answer.setBackground(Color.WHITE);
    answer.setHorizontalAlignment(SwingConstants.LEFT);
    answer.setEditable(false);
    answer.setBounds(120, 199, 330, 35);
    answer.setColumns(10);
    frmSoen.addWindowListener(new WindowAdapter() {       
        public void windowOpened(WindowEvent e) {
            answer.requestFocus();              
        }       
    }); 
    frmSoen.getContentPane().add(answer);       
    frmSoen.setBounds(100, 100, 550, 350);
    frmSoen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmSoen.getContentPane().setLayout(null);
    
    lblFunction.setBounds(38, 22, 363, 18);
    lblFunction.setFont(new Font("Rockwell", Font.BOLD, 14));
    frmSoen.getContentPane().add(lblFunction);
    
    textFieldX = new JTextField();
    textFieldX.setText("Enter X");
    
    textFieldX.addFocusListener(new FocusAdapter()  {
        @Override
        public void focusGained(FocusEvent e)  {           
            textFieldX.setText("");
        }
        
        @Override
        public void focusLost(FocusEvent e) {
          if (textFieldX.getText().trim().length() == 0) {
            textFieldX.setText("Enter X");
            }
        }
    });
    
    textFieldX.setHorizontalAlignment(SwingConstants.CENTER);
    textFieldX.setToolTipText("");
    textFieldX.setBounds(120, 72, 120, 35);
    frmSoen.getContentPane().add(textFieldX);
    textFieldX.setColumns(10);
    
    textFieldY = new JTextField();
    
    textFieldY.addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
        
            textFieldY.setText("");
        }
        
        public void focusLost(FocusEvent e) {
            
        if (textFieldY.getText().trim().length() == 0) {
          textFieldY.setText("Enter Y");
            }
        }           
    });
    
    textFieldY.setText("Enter Y");
    textFieldY.setHorizontalAlignment(SwingConstants.CENTER);
    textFieldY.setToolTipText("");
    textFieldY.setBounds(280, 72, 120, 35);
    frmSoen.getContentPane().add(textFieldY);
    textFieldY.setColumns(10);
    
    
    JLabel lblAnswer = new JLabel("Answer : ");
    lblAnswer.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 13));
    lblAnswer.setBounds(50, 209, 65, 14);
    frmSoen.getContentPane().add(lblAnswer);
    
    JButton btnCalculate = new JButton("Calculate");
    btnCalculate.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
    
    btnCalculate.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          Controller c = new Controller();

          double x = Double.parseDouble(textFieldX.getText());
          double y = Double.parseDouble(textFieldY.getText());
          
          try {
            if (x == 0 && y == 0) {
              throw new Exception();
            }
            } catch (Exception e2) {
              JOptionPane.showMessageDialog(frmSoen, "The result is undefined since it's result"
                   + " is not universally " + "decided of either 0 or 1","Undefined Result",
                   JOptionPane.ERROR_MESSAGE);
            }
            
              
          try {
            if (x == 0 && y < 0) {
              throw new Exception();
            }
          } catch (Exception e2) {
            JOptionPane.showMessageDialog(frmSoen, "The result is infinity since it is divided "
                + "by zero error",
                "Infinity Result",JOptionPane.ERROR_MESSAGE);
          }
                   
                                  
          try {                       
            if (x < 0) {
                if (y % 1 == 0) {                     
                  double result = c.calculatePowerForReal(x, y);                                  
                  answer.setText(" " + result);                                   
                } else {
                throw new Exception();                                    
                }                             
              } else {
                double result = c.calculatePowerForReal(x, y);                             
                answer.setText(" " + result);
              }
          } catch (Exception e1) {               
            JOptionPane.showMessageDialog(frmSoen, "Please Enter positive value of X and integer " 
                + "value of Y","Invalid Input", JOptionPane.ERROR_MESSAGE);             
          }   
      }
    });

    btnCalculate.setBounds(60, 141, 89, 30);
    frmSoen.getContentPane().add(btnCalculate);
    
    JButton btnReset = new JButton("Reset");
    btnReset.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            textFieldX.setText("Enter X");
            textFieldY.setText("Enter Y");
            answer.setText("");
        }
    });
    
    btnReset.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
    btnReset.setBounds(160, 141, 89, 30);
    frmSoen.getContentPane().add(btnReset);
  }
	
  /**
   * Creates the Application.
   */
  
  public View() {
    initialize();
  }

}

