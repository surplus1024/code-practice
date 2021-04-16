package designpattern.decorator;
/**
 * @author  xy
 * @date 2021-04-15 16:07:43
 * @desc 被装饰者
 * 装饰者模式测试
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里呢。。");
    }

    public static void main(String[] args) {
        Human person = new Person();
//        Decorator decorator = new DecoratorTwo(new DecoratorOne(new DecoratorZero(person)));
        Decorator decorator = new DecoratorTwo(person);
        decorator.wearClothes();
        decorator.walkToWhere();
        /**
         * 穿什么呢。。
         * zero: 进房子。。
         * One: 去衣柜找找看。。
         * Two：找到一件D&G。。
         * 去哪里呢。。
         * zero: book room find map
         * One: 在Map上找找。。
         * Two：在Map上找到神秘花园和城堡。。
         */
        /**
         * interface Human {}
         * class Person implements Human
         * abstract Decorator implements Human (){}
         * DecoratorZero extends Decorator (){}
         * 使用
         * Human p = new Person();
         * Decorator decorator = new DecoratorZero(new Person); // 装饰过的人
         */
    }
}
