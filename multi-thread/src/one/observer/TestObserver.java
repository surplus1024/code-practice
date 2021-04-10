package one.observer;

import org.junit.Test;

public class TestObserver {

    @Test
    public void Test(){
        WechatServer server = new WechatServer();
        Observer zhangsan  = new UserObserverable("zhangsan");
        Observer lisi = new UserObserverable("lisi");
        Observer wangwu = new UserObserverable("wangwu");
        server.registerObserver(lisi);
        server.registerObserver(wangwu);
        server.registerObserver(zhangsan);
        server.setInfoMsg("PHP是世上最好的语言");

        server.cancleObserver(lisi);  // 这里取消了订阅
        server.setInfoMsg("flutter 重磅来袭!!");
    }
}
