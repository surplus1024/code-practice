package one.publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  xy
 * @date    2021-04-10 16:09:00
 * @desc    新闻主题
 */
public class NewsSubject implements Subject {

    private String content;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish() { // 通知观察者
        observers.forEach(observer -> observer.update(this));
    }
}
