
public class UserManager {

	public void add(User user) {
	
	System.out.println("Kayd�n�z olu�turuldu" + user.firstName + user.lastName);
	
	
}
	
	public void delete(User user) {
		System.out.println("Kayd�n�z silindi" + user.firstName + user.lastName);
	}
	
	public void update(User user) {
		System.out.println("Kayd�n�z g�ncellendi"+ user.firstName + user.lastName);
	}
}
