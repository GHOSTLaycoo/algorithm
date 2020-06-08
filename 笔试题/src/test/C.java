package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author GHOSTLaycoo
 * @date 2020/3/10 0010 - 下午 16:24
 */
public class C {
    private static List<D> getActivityInfoOfNew(List<A> data) {
        List<D> securityActivityInfos = new ArrayList<>();
        data.forEach(s->{
            s.getBs().sort(Comparator.comparing(o->o.getCreateDate(),Comparator.nullsFirst(Date::compareTo)));
            D securityActivityInfo = new D(s);
            securityActivityInfos.add(securityActivityInfo);
        });
        return securityActivityInfos;
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        String str = "2016/1/5 12:12:12";
        String str1 = "2018/1/5 12:12:12";
        String str2 = "2017/1/5 12:12:12";
        Date de = null;
        Date c = null;
        Date e1 = null;
        try {
             de = sdf.parse(str);
             c = sdf.parse(str1);
             e1 = sdf.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<B> b =  new ArrayList<>();
        B b1 = new B();
        b1.setCreateDate(de);
        b1.setStatus("0");
        B b2 = new B();
        b2.setCreateDate(c);
        b2.setStatus("1");
        B b3 = new B();
        b3.setCreateDate(e1);
        b3.setStatus("2");
        B b4= new B();
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);
        for (B d1 : b) {
            System.out.println(d1.getCreateDate()+":"+d1.getStatus());
        }
        List<A> a =  new ArrayList<>();
        A a1 = new A();
        a1.setId("1");
        a1.setName("a");
        a1.setBs(b);

        A a2 = new A();
        a2.setId("2");
        a2.setName("b");
        a2.setBs(b);

        a.add(a1);
        a.add(a2);

        List<D> activityInfoOfNew = getActivityInfoOfNew(a);

        for (D d : activityInfoOfNew) {
            System.out.println(d.getDate()+":"+d.getId()+":"+d.getStatus());
        }
    }
}
