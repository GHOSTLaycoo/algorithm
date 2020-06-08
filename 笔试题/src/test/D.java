package test;

import java.util.Date;

/**
 * @author GHOSTLaycoo
 * @date 2020/3/10 0010 - 下午 16:25
 */
public class D {
    private String id;
    private String status;
    private Date date;

    public D(A a) {
        this.id = a.getId();
        this.status = a.getBs().get(a.getBs().size()-1).getStatus();
        this.date = a.getBs().get(a.getBs().size()-1).getCreateDate();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
