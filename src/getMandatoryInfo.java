import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class getMandatoryInfo {
	
	
	public static String getInfo(String message) throws MissingBasicInfo {
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, message);
		
		if (answer == null || answer.isEmpty()) throw new MissingBasicInfo("All parameters are mandatory to proceed.");
		
		return answer;
	}
	
	
	
	public static String getPassword() throws MissingBasicInfo {
		JPasswordField pass = new JPasswordField(10);
		String password="";
		
		String[] options = {"OK", "Cancel"};
	    JOptionPane.showOptionDialog(null, pass,"Enter Password",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
	    password = new String(pass.getPassword());
	    
	    if(password.isEmpty()) throw new MissingBasicInfo("All parameters are mandatory to proceed.");
	    
	    return password;
	}
}
