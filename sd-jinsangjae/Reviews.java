//import java.util.ArrayList;
//import java.util.List;
//
//public class Reviews {
//	List<String> reviews;
//	
//	public Reviews() {
//		this.reviews =new ArrayList<>();
//	}
//	public List<String> show() {
//		for(int i=0;i<reviews.size();i++)
//			System.out.println(reviews.get(i));
//		
//		return reviews;
//	}
//	
//	public void write(String str) {
//		reviews.add(str);
//	}
//}


import java.util.ArrayList;
import java.util.List;

public class Reviews {
	List<String> reviews;
	
	public Reviews() {
		this.reviews =new ArrayList<>();
	}
	public List<String> show() {
		
		if(reviews.size()==0)
		{
			System.out.println("아직 리뷰가 존재하지 않습니다.");
			return reviews;
		}
		for(int i=0;i<reviews.size();i++)
			System.out.println(reviews.get(i));
		return reviews;
	}
	
	public void write(String str) {
		reviews.add(str);
	}
}
