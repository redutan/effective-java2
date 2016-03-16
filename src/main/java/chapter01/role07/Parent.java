package chapter01.role07;

/**
 * Created by redutan on 2016. 1. 30..
 */
public class Parent {

    public static void main(final String[] args) throws Exception {
        doIt();
        System.gc();
        Thread.sleep(5000); //  5 sec sleep
    }

    @SuppressWarnings("unused")
    // 이 객체는 바깥 객체(Parent)를 종료 시키는 역할만 한다.
    private final Object guardian = new Object() {
        @Override
        protected void finalize() {
            doFinalize();
        }
    };

    private void doFinalize() {
        System.out.println("Finalize of class Parent");
    }

    public static void doIt() {
        Child c = new Child();
        System.out.println(c);
    }

}

class Child extends Parent {

    // Note, Child class does not call super.finalize()
    @Override
    protected void finalize() {
        System.out.println("Finalize of class Child");
    }

}