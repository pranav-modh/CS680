package edu.umb.cs680.hw06.SecurityJob;

public class LoggedOut implements State {

    private static LoggedOut instance = null;

    private static SecurityContext ctx;

    private LoggedOut() { }

    public static LoggedOut getInstance() {
        if(instance == null) {
            instance = new LoggedOut();
        }
        return instance;
    }

    @Override
    public void login(SecurityContext ctx, String pwd) {
        if (Authenticator.authenticate(ctx, pwd)){
            ctx.changeState(LoggedIn.getInstance());
        }else{
            throw new Error("Wrong Password");
        }
    }

    @Override
    public void logout(SecurityContext ctx) {
        System.out.println("LogOut Successfully.");
    }

    public static void main(String[] args){}
}
