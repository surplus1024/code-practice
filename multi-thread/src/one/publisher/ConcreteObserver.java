package one.publisher;

public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subject subject) {
        subject.attach(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subject.detach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.name + "订阅的内容： " + subject.getContent());
    }
}
