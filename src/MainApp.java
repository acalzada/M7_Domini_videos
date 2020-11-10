import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		
		String name, surname, password;
	    
		int createUser = JOptionPane.showConfirmDialog(null, "Do you want to create your user?","M7 - Video Domain", JOptionPane.YES_NO_OPTION);
		User user;
		
		if( createUser == 0 )
		{
		    name = "Angel"; //getMandatoryInfo.getInfo("Please enter your name.");
		    surname = "Calzada"; //getMandatoryInfo.getInfo("Please enter your surname.");
		    password = "1234"; //getMandatoryInfo.getPassword();
		    
		    user = new User(name, surname, password);
		    
		    user.createVideo();
		    user.createVideo();
		    user.createVideo();
		    
		    System.out.println(user.showVideos());
		}
		

		
	    JOptionPane.showMessageDialog(null, "Sayonara Baby!!");
	}
	
	
	

}
