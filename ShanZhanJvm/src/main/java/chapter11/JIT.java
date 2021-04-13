package chapter11;

/**
 * @author WangShaoShuai
 * @date 2021/04/13
 *
 * -Xint：解释执行    1906 ms
 * -Xcomp：编译执行   113 ms
 * -Xmixed：混合模式  267 ms
 */
public class JIT {

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            calcpi();
        }
        long e = System.currentTimeMillis();
        System.out.println("spend: " + (e - b) + " ms");
    }

    public static double calcpi() {
        double re = 0;
        for (int i = 0; i < 10000; i++) {
            re += ((i & 1) == 0? - 1:1) * 1.0 / (2 * i - 1);
        }
        return re * 4;
    }
}
