package libingjietest;

/**
 * Dog class
 *
 * @author lbj
 * @date 17-12-13
 */
public class Dog extends Animal{
    private String hobbit;

    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }

    @Override
    public String toString() {
        String a ;
        a = "I'm "+this.getName()+" I like "+hobbit+"";
        return a;
    }
}
