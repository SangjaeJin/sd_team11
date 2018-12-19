//import java.util.ArrayList;
//import java.util.List;
//
//public class Events {
//	List<String> events ;
//	
//	public Events() {
//		this.events =new ArrayList<>();
//	}
//	public List<String> show() {
//		for(int i=0;i<events.size();i++)
//			System.out.println(events.get(i));
//		
//		return events;
//	}
//	
//	public void write(String str) {
//			events.add(str);
//	}
//	
//	
//}


import java.util.ArrayList;
import java.util.List;

public class Events {
	List<String> events ;
	
	public Events() {
		this.events =new ArrayList<>();
	}
	public List<String> show() {
		if(events.size()==0)
		{
			System.out.println("이벤트가 없습니다.");
			return events;
		}
		for(int i=0;i<events.size();i++)
			System.out.println(events.get(i));
		
		return events;
	}
	
	public void write(String str) {
			events.add(str);
	}
	
	
}
