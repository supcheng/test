public class User {
    public void login() throws LoginError, FreezeError {
        if (4<3){
            throw new LoginError("错误");

        }
        if (5>3){
            throw new FreezeError("冻结");

        }
    }
}
