package cn.thoughtworks.springsecurity.model;

public class JwtUser {


    private String userName;
    private Integer id;

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getId() {
        return id;
    }
}
