package designpattern.decorator;
/**
 * @author  xy
 * @date 2021-04-15 16:27:15
 * @desc 装饰一
 */
public class DecoratorTwo extends Decorator {
    public DecoratorTwo(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("Two：找到一件D&G。。");
    }

    public void findTheTarget() {
        System.out.println("Two：在Map上找到神秘花园和城堡。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }
}
