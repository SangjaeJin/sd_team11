import java.util.ArrayList;
import java.util.List;

public class Reviews {
	List<String> reviews;
	
	public Reviews() {
		this.reviews =new ArrayList<>();
	}
	public void show() {
		
		if(reviews.size()==0)
		{
			System.out.println("아직 리뷰가 존재하지 않습니다.");
			return ;
		}
		for(int i=0;i<reviews.size();i++)
			System.out.println(reviews.get(i));
	}
	
	public void write(String str) {
		reviews.add(str);
	}
}
