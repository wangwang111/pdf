package chapter10;

/**
 * @author WangShaoShuai
 * @date 2021/04/12
 *
 * -Xbootclasspath/a:D:/tmp
 */
public class FindClassOrder {

    public static void main(String[] args) {
        HelloLoader helloLoader = new HelloLoader();
        System.out.println(helloLoader.getClass().getClassLoader());
        helloLoader.print();
    }
}
