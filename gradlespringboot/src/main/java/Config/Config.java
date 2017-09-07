package Config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user",locations = "classpath:Config/config.properties")
public class Config {
    private String userName;
    private String userPassWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
}
