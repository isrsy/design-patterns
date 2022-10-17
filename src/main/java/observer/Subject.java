package observer;

import java.util.ArrayList;
import java.util.List;

import factoryabstract.Obj;

/**
 * 抽象目标
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }
    
    // 通知观察者方法
    abstract void notifyObserver();
}
