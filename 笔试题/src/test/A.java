package test;

import java.util.List;

/**
 * @author GHOSTLaycoo
 * @date 2020/3/10 0010 - 下午 16:23
 */
public class A {
    private String id;
    private String name;
    private List<B> bs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<B> getBs() {
        return bs;
    }

    public void setBs(List<B> bs) {
        this.bs = bs;
    }
}
