package chapter01.role03;

import java.lang.reflect.Constructor;

/**
 * 리플렉션 기능을 통해 private 생성자를 호출할 수 있음
 * @author myeongju.jung
 */
public class PrivateInvoker {
    public static void main(String[] args) throws Exception {
        // 리플렉션과 setAccessible메서드를 통해 private로 선언된 생성자의 호출 권한을 획득한다.
        Constructor<?> con = Private.class.getDeclaredConstructors()[0];
        con.setAccessible(true);
        Private p = (Private) con.newInstance();
    }
}

class Private {
    private Private() {
        System.out.println("Hello");
    }
}
