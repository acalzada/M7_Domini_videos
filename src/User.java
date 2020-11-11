import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class User {
	
	String name;
	String surname;
	String password;
	Date signUp_date;
	ArrayList<Video> videosList;
	
	public User(String name, String surname, String password){
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.signUp_date = Calendar.getInstance().getTime();
		this.videosList = new ArrayList<Video>();
	}
	
	public void createVideo() throws MissingBasicInfo {
		
		String url = getMandatoryInfo.getInfo("Please enter the url for the video.");
		String title = getMandatoryInfo.getInfo("Please enter the title for the video.");
		String tagsInput = getMandatoryInfo.getInfo("Please enter tags separated by comma for the video.");
		
		String[] tagArray = tagsInput.trim().split(",");
		ArrayList<String> tags = new ArrayList<String>(Arrays.asList(tagArray));
		
		this.videosList.add(new Video(url, title, tags));
		
	}
	
	public String toString() {
		String info = "User info:\n" +
					  "---------\n" +
					  "name: '" + this.name + "'\n" +
					  "surname: '" + this.surname + "'\n" +
					  "password: '" + this.password + "'\n" + 
					  "registered: '" + this.signUp_date +"'\n\n" +
					  "Videos from user: \n" +
					  "----------------\n\n" +
					  this.showVideos();
		return info;
	}
	
	public String showVideos() {
		String videos = "";
		
		for(Video video : this.videosList) {
			videos = videos + video.toString();
			videos = videos + "- - - -\n";
		}
		
		return videos;
	}
	
}
