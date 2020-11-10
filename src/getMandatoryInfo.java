import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class getMandatoryInfo {
	
	
	public static String getInfo(String message) {
		String answer = "";
		
		while( answer.isEmpty() ) {
			answer = JOptionPane.showInputDialog(null, message);
		}
		return answer;
	}
	
	
	
	public static String getPassword() {
		JPasswordField pass = new JPasswordField(10);
		String password="";
	    
		do{
	    	JOptionPane.showConfirmDialog(null, pass,"Enter Password",JOptionPane.OK_CANCEL_OPTION);
	    	password = new String(pass.getPassword());
	    }while(password.isEmpty());	
	    
	    return password;
	}
}
