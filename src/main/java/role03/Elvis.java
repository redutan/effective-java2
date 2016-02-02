package role03;

/**
 * public final 필드를 이용한 싱글턴
 * @author myeongju.jung
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        //...
    }

    public void leaveTheBuilding() {
        //...
    }
}
