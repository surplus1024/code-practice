package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  xy
 * @date    2021-04-10 16:44:18
 * @desc    可观察的
 */
public class WechatServer implements Observerable {

    private List<Observer> observerList;   // 存储订阅该公众号的observer<观察者 人>
    private String message;

    public WechatServer() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void cancleObserver(Observer o) {
        observerList.remove(o);
    }

    /***
     * 通知每一个订阅者 接收消息.
     */
    @Override
    public void notifynObserver() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = observerList.get(i);
            observer.update(message);
        }
    }


    /***
     * 公众号每次推的消息
     */
    public void setInfoMsg(String msg){
        this.message = msg;
        System.out.println("微信公众号推送消息: " + msg);
        // 消息来临   通知每一个订阅者
        notifynObserver();
    }
}
