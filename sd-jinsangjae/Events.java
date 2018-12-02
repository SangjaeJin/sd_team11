import java.util.ArrayList;
import java.util.List;

public class Events {
	List<String> events ;
	
	public Events() {
		this.events =new ArrayList<>();
	}
	public void show() {
		for(int i=0;i<events.size();i++)
			System.out.println(events.get(i));
	}
	
	public void write(String str) {
			events.add(str);
	}
	
	
}
