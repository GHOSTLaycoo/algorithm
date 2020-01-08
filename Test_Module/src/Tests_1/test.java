package Tests_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/13 0013 - 上午 8:44
 */
public class test {
    public static void main(String[] args) {
        List<Teacher<User>> T = new ArrayList<>();
        T.add(new Teacher<>(new User(1,"a",1),true));
        T.add(new Teacher<>(new User(3,"b",3),true));
        T.add(new Teacher<>(new User(2,"c",2),true));
        T.add(new Teacher<>(new User(0,"d",0),true));
        T.add(new Teacher<>(new User(null,"d",0),true));
        T.add(new Teacher<>(new User(null,"d",0),null));

       /* Collections.sort(T, new Comparator<Teacher<User>>() {
            @Override
            public int compare(Teacher<User> o1, Teacher<User> o2) {
                return o2.getUser().getUserId()-o1.getUser().getUserId();
            }
        });*/


    //    Collections.sort(T, Comparator.nullsLast(Comparator.comparing(o->o.getUser().getUserId())));
        T.sort(Comparator.comparing(o->o.getUser().getUserId(),Comparator.nullsLast(Integer::compareTo)));
        for (Teacher<User> userTeacher : T) {
            System.out.println(userTeacher.getUser().getUserId());
        }
        // List<User> collect = users.stream().sorted(Comparator.comparing(User::getUserId)).collect(Collectors.toList());



    }
}
