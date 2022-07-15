import java.util.HashMap;

public class IDandPassword {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassword() {

        loginInfo.put("NMKrastev", "12345");
        loginInfo.put("Niki", "qwerty");
        loginInfo.put("Krastev", "54321");
        loginInfo.put("Niko", "qwerty123");
    }

    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
