package designpattern.decorator;
/**
 * @author  xy
 * @date 2021-04-15 16:27:15
 * @desc 装饰一
 */
public class DecoratorOne extends Decorator {
    public DecoratorOne(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("One: 去衣柜找找看。。");
    }

    public void findPlaceOnMap() {
        System.out.println("One: 在Map上找找。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findPlaceOnMap();
    }
}
