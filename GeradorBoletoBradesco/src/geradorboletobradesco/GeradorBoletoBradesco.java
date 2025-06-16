package geradorboletobradesco;
import javax.swing.JTextField;
public class GeradorBoletoBradesco {
    
    public static void main(String[] args) {
        Login LoginFrame = new Login(); 
        LoginFrame.setVisible(true);
        LoginFrame.pack(); 
        LoginFrame.setLocationRelativeTo(null);
        
        JTextField myField = new JTextField();

        String currentText = myField.getText();
    }
    
}
