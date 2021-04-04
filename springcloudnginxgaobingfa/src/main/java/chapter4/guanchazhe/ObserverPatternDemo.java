package chapter4.guanchazhe;

/**
 * 观察者模式
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        //第一步：创建主题
        ConcreteSubject mConcreteSubject = new ConcreteSubject();
        //第二步：创建观察者
        Observer observerA = new ObserverA();
        Observer ObserverB = new ObserverA();
        //第三步：主题订阅
        mConcreteSubject.add(observerA);
        mConcreteSubject.add(ObserverB);
        //第四步：主题状态变更
        mConcreteSubject.change("倒计时结束，开始秒杀");
    }
}