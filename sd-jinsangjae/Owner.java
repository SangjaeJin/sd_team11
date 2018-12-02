
public class Owner extends Person{
	public Owner(String id,String pwd) {
		super( id, pwd);
	}
	
	public String getId() {
		return super.getId();
	}
	
	public String getPwd() {
		return super.getPwd();
	}
}
