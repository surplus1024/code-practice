package one.publisher;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {

    private String content;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
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
    public void publish() {
        observers.forEach(observer -> observer.update(this));
    }
}
