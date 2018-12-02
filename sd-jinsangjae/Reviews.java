import java.util.ArrayList;
import java.util.List;

public class Reviews {
	List<String> reviews;
	
	public Reviews() {
		this.reviews =new ArrayList<>();
	}
	public void show() {
		for(int i=0;i<reviews.size();i++)
			System.out.println(reviews.get(i));
	}
	
	public void write(String str) {
		reviews.add(str);
	}
}
