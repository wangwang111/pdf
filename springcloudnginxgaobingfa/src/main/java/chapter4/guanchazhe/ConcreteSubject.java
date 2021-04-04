package chapter4.guanchazhe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteSubject extends Subject {

    private String state; //保持主题的状态

    public void change(String newState) {
        state = newState;
        log.info( "change state :" + newState);
        //状态发生改变，通知观察者
        notifyObservers(newState);
    }
}
