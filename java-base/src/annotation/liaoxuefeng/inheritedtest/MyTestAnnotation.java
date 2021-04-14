package annotation.liaoxuefeng.inheritedtest;

import java.lang.annotation.*;

/**
 * @author  xy
 * @date 2021-04-14 14:15:08
 * @desc 注解继承测试
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyTestAnnotation {

}
