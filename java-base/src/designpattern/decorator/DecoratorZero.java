package designpattern.decorator;
/**
 * @author  xy
 * @date 2021-04-15 16:27:15
 * @desc 装饰一
 */
public class DecoratorZero extends Decorator {
    public DecoratorZero(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("zero: 进房子。。");
    }
    public void findMap() {
        System.out.println("zero: book room find map");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
