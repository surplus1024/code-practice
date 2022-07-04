package aop.dynamic.statics;

/**
 * @author：xy
 */
public class Proxy implements AbstractInterface {

    private Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void buyHouse() {
        System.out.println("Proxy: proxy object help me to find hourse");
        target.buyHouse();
        System.out.println("Proxy: proxy object bought house");
    }
}
