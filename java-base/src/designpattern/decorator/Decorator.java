package designpattern.decorator;
/**
 * @author  xy
 * @date 2021-04-15 15:26:59
 * @desc 装饰者
 */
public abstract class Decorator implements Human {
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    public void walkToWhere() {
        human.walkToWhere();
    }
}
