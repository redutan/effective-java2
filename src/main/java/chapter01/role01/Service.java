package chapter01.role01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 정적 팩토리 메서드의 세번째 장점은 생성자와는 달리 반환값 타입의 하위 타입 객체를 반환할 수 있다는 것이다.
 * p.12 서비스 제공자 인터페이스의 대략적인 모습
 */
/**
 * 서비스 인터페이스
 */
public interface Service {
    // 서비스에 대한 고유한 메서드가 이 자리에 온다
}

/**
 * 서비스 제공자 인터페이스
 */
interface Provider {
    Service newservice();
}

/**
 * 서비스 등록과 접근에 사용되는 객체 생성 불가능 클래스
 */
class Services {

    // 객체 생성 방지 (규칙 4)
    private Services() { }

    // 서비스 이름과 서비스 간 대응관계 보관
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<dev>";

    /**
     * 제공자 등록 API
     * @param p
     */
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    private static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    /**
     * 서비스 접근 API
     * @return
     */
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException(
                    "No provider registered with name : " + name);
        }
        return p.newservice();
    }
}



