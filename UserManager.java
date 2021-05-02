
public class UserManager {

	public void add(User user) {
	
	System.out.println("Kaydýnýz oluþturuldu" + user.firstName + user.lastName);
	
	
}
	
	public void delete(User user) {
		System.out.println("Kaydýnýz silindi" + user.firstName + user.lastName);
	}
	
	public void update(User user) {
		System.out.println("Kaydýnýz güncellendi"+ user.firstName + user.lastName);
	}
}
