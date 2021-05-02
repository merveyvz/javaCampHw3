public class UserManager {

    public void signIn(User user) {
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Giriş Yapıldı");
    }

}
