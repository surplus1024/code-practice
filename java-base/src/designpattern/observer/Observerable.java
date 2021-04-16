package designpattern.observer;
/**
 * @author  xy
 * @date    2021-04-10 16:42:05
 * @desc    // 定义抽象可观察者. 公众号一般会有 订阅,取消订阅,以及通知提醒功能.
 */
public interface Observerable {

    /***
     * 注册事件
     */
    void registerObserver(Observer o);

    /***
     * 取消事件
     */
    void cancleObserver(Observer o);

    /***
     * 更新事件   发送一条推送通知
     */
    void notifynObserver();
}