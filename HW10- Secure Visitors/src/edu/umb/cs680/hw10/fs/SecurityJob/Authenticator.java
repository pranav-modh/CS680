package edu.umb.cs680.hw10.fs.SecurityJob;

public class Authenticator {

    public static Boolean authenticate(SecurityContext ctx, String pwd){
        if (ctx.getUser().getPass() == pwd){
            return true;
        }else{return false;}
    }

    public static void main(String[] args){}

}
