import java.util.ArrayList;

public class Video {
	String url;
	String title;
	ArrayList<String> tags;
	
	public Video(String url, String title, ArrayList<String> tags) {
		this.url = url;
		this.title = title;
		this.tags = tags;
	}
	
	public Video(String url, String title, String tag) {
		this.url = url;
		this.title = title;
		this.tags.add(tag);
	}
	
	public String toString() {
		String info = "url: '" + this.url + "'\n" + 
					  "title: '" + this.title + "'\n" +
					  "tags: ";
		for(String tag : tags) {
			info = info + "'" + tag + "', ";
		}
		info = info.substring(0, info.length()-2);
		info = info + "\n";
		
		return info;
	}
}
