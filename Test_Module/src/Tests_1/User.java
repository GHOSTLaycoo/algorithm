package Tests_1;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/11 0011 - 下午 14:49
 */
public class User {
    private Integer userId;
    private String name;
    private int age;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(Integer userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}
