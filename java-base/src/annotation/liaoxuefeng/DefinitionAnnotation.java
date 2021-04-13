package annotation.liaoxuefeng;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author  xy
 * @date 2021-04-13 17:22:06
 * @desc 定义注解,元注解：target、retention、repeatable、inherit
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefinitionAnnotation {
    int type() default 0;
    String level() default "info";
    String grade() default "";
}
// 注解的使用
@DefinitionAnnotation(type = 1,level = "info",grade="")
class Cat {

}
