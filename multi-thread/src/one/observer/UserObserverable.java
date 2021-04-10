package one.observer;

public class UserObserverable implements Observer{
    private String name;

    public UserObserverable(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " 订阅者接收到消息:"+message);
    }
}