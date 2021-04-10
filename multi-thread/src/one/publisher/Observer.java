package one.publisher;

/**
 * @author xy
 * @date   2021-04-10 16:05:09
 * @desc   订阅者接口
 */
public interface Observer {
    public abstract void subscribe(Subject subject ); // 订阅主题

    public abstract void unsubscribe(Subject subject); // 取消订阅主题

    void update(Subject subject); // 处理主题消息
}
