package libingjietest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Cat class
 *
 * @author lbj
 * @date 17-12-13
 */
public class Cat extends Animal {

    private String barkBark;

    public String getBarkBark() {
        return barkBark;
    }

    public void setBarkBark(String barkBark) {
        this.barkBark = barkBark;
    }

    public static void main(String[] args) throws ParseException {
        Cat cat = new Cat();
        cat.setAge(1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date today = simpleDateFormat.parse("2017-12-13");
        cat.setBirthday(today);
        cat.setSex(true);
        cat.setName("dudu");
        cat.setBarkBark("miao..miao..");
        cat.setUuid("0001");


        System.out.println(cat.getBarkBark());
        System.out.println(cat.toString());

        Dog dog = new Dog();
        dog.setAge(3);
        dog.setBirthday(new Date());
        dog.setSex(true);
        dog.setName("Nunu");
        dog.setHobbit("peepee");
        dog.setUuid("02");

        System.out.println(dog.getHobbit());
        System.out.println(dog.toString());
    }
}
