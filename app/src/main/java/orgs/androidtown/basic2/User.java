package orgs.androidtown.basic2;

/**
 * Created by Jisang on 2017-10-31.
 */

public class User {
    public String id;
    public String token;
    public String email;

    public User(){
        // default for firebase realtime database
    }

    public User(String id, String token, String email){
        this.id = id;
        this.token = token;
        this.email = email;
    }
}

