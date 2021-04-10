package one.publisher;

/**
 * @Author  xy
 * @Date    2021-04-10 15:41:12
 * @Desc    主题接口
 */
public interface Subject {
    public static final int num = 10;

    public abstract void setContent(String content);// 设置主题内容

    String  getContent(); // 获取主题内容

    void attach(Observer observer); // 添加订阅者

    void detach(Observer observer); // 删除订阅者

    void publish(); // 发布消息
}
