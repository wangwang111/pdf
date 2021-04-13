package chapter10;

/**
 * @author WangShaoShuai
 * @date 2021/04/12
 *
 */
public class HelloLoader {

    public void print() {
        System.out.println("I am in app ClassLoader");
    }

    public static void main(String[] args) {
        System.out.println(HelloLoader.class.getClassLoader());
    }
}
