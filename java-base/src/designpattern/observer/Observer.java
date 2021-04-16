package designpattern.observer;
/**
 * @author  xy
 * @date    2021-04-10 16:42:59
 * @desc    观察者
 */
public interface Observer {
    /***
     * 定义一个update 方法,当被观察者<微信公众号> 发布事件的时候,会执行该方法.
     * @param message
     */
    void update(String message);
}