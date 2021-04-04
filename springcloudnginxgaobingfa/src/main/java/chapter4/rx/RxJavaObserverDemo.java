package chapter4.rx;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

@Slf4j
public class RxJavaObserverDemo {

    /**
     *演示RxJava中的Observer模式

    public void rxJavaBaseUse() {
        //被观察者（主题）
        Observable observable = Observable.create(
                new Action1<Emitter<String>>() {
                    @Override
                    public void call(Emitter<String> emitter) {
                        emitter.onNext("apple");
                        emitter.onNext("banana");
                        emitter.onNext("pear");
                        emitter.onCompleted();
                    }
                },Emitter.BackpressureMode.NONE);
        //订阅者（观察者）
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                log.info("onNext: {}", s);
            }
            @Override
            public void onCompleted() {
                log.info("onCompleted");
            }
            @Override
            public void onError(Throwable e) {
                log.info("onError");
            }
        };
        //订阅：Observable与Subscriber之间依然通过subscribe()进行关联
        observable.subscribe(subscriber);
    }
     */
}
