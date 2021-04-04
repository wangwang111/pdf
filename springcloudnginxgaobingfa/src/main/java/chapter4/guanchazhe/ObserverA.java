package chapter4.guanchazhe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverA implements Observer {
    //观察者状态
    private String observerState;

    @Override
    public void update(String newState) {
        //更新观察者状态，让它与主题的状态一致
        observerState = newState;
        log.info("观察者的当前状态为：" + observerState);
    }
}
