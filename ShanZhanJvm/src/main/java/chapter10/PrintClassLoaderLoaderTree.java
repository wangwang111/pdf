package chapter10;

/**
 * @author WangShaoShuai
 * @date 2021/04/09
 */
public class PrintClassLoaderLoaderTree {

    public static void main(String[] args) {
//        ClassLoader classLoader = PrintClassLoaderLoaderTree.class.getClassLoader();
        ClassLoader classLoader = String.class.getClassLoader();
        while (classLoader != null) {
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
    }
}
