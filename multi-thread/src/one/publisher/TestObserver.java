package one.publisher;

import org.junit.Test;
/**
 * @author  xy
 * @date    2021-04-10 16:36:15
 * @desc    订阅发布模式
 */
public class TestObserver {
    /**
     * 应用场景
     * 创建一个订单主题
     * 创建一个观察者来订阅这个订单主题
     * 当订单状态有变化时，通过订单主题发布这个订单
     * 这时候只要订阅了这个订单主题的观察者就能收到消息，然后就可以处理这个状态有变化的订单了
     */

    @Test
    public void test(){
        // 创建主题对象
        WeatherSubject weatherSubject = new WeatherSubject();
        NewsSubject newsSubject = new NewsSubject();

        // 给主题赋值
        weatherSubject.setContent("我是一条天气消息");
        newsSubject.setContent("我是一条新闻消息");

        // 创建订阅者
        ConcreteObserver user1 = new ConcreteObserver("user1");
        // 订阅newsSubject
        user1.subscribe(newsSubject);

        ConcreteObserver user2 = new ConcreteObserver("user2");
        // 订阅newsSubject和weatherSubject
        user2.subscribe(weatherSubject);
        user2.subscribe(newsSubject);

        ConcreteObserver user3 = new ConcreteObserver("user3");
        // 订阅weatherSubject
        user3.subscribe(weatherSubject);

        // user2 取消订阅newsSubject
        user2.unsubscribe(newsSubject);

        // 发布消息
        weatherSubject.publish();
        newsSubject.publish();
    }
}
