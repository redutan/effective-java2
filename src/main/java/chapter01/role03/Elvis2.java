package chapter01.role03;

/**
 * 정적 팩터리를 이용한 싱글턴
 * @author myeongju.jung
 */
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
        //...
    }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        //...
    }
}
