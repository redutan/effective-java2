package chapter02.role09;

import java.util.HashMap;
import java.util.Map;

public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + " : " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    // hashCode 메서드가 없으면 문제가 발생한다.
    // public int hashcode() {... 구현이 없음

    public static void main(String[] args) throws Exception {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        String s = m.get(new PhoneNumber(707, 867, 5309));

        // s = Jenny가 출력될 거 같지만 null이 출력됨
        System.out.println("s = " + s);

        /*
        그 이유는
         */
    }
}
