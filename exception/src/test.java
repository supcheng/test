import javax.security.auth.login.LoginException;

public class test {
    public static void main(String[] args) {
        User user=new User();
        try {
            user.login();
        } catch (LoginError loginError) {
            loginError.printStackTrace();
        } catch (FreezeError freezeError) {
            freezeError.printStackTrace();
        }
    }
}
