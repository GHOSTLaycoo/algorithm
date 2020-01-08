package Tests_1;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/13 0013 - 下午 16:03
 */
public class Teacher<T> {
    private T user;
    private Boolean flag;


    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Teacher(T user, Boolean flag) {
        this.user = user;
        this.flag = flag;
    }
}
