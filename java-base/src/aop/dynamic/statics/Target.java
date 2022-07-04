package aop.dynamic.statics;

/**
 * @author：xy
 */
public class Target implements AbstractInterface {
    @Override
    public void buyHouse() {
        System.out.println("Target: target object bought a hourse");
    }
}
