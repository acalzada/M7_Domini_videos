import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		
		String name, surname, password;
	    
		int createUser = JOptionPane.showConfirmDialog(null, "Do you want to create your user?","M7 - Video Domain", JOptionPane.YES_NO_OPTION);
		User user;
		
		if( createUser == 0 )
		{
			try {
			    name = getMandatoryInfo.getInfo("Please enter your name.");
			    surname = getMandatoryInfo.getInfo("Please enter your surname.");
			    password = getMandatoryInfo.getPassword();
			    
			    user = new User(name, surname, password);
			    
			    int addMoreVideos;
			    do{
			    	user.createVideo();
			    	addMoreVideos = JOptionPane.showConfirmDialog(null, "Do you want to create more videos?","M7 - Video Domain", JOptionPane.YES_NO_OPTION);
			    	
			    }while(addMoreVideos == JOptionPane.YES_OPTION);
			    
			    
			    System.out.println(user.toString());
			    
			}catch(MissingBasicInfo err) {
				final ImageIcon icon = new ImageIcon("images/alert.png");
				JOptionPane.showMessageDialog(null, "All requested information is mandatory.\nProgram will be terminated.","No collaboration", JOptionPane.INFORMATION_MESSAGE, icon);
				System.out.println("EXCEPTION INFORMATION for M7 - Domini Video\n");
				err.printStackTrace();
			}
		}
		
		final ImageIcon icon = new ImageIcon("images/byebye-1.jpg");
		
	    JOptionPane.showMessageDialog(null, "Sayonara Baby!!", "bye bye", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
	
	

}
