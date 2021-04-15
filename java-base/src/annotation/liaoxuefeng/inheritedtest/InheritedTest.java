package annotation.liaoxuefeng.inheritedtest;

import java.lang.annotation.Annotation;

public class InheritedTest {
    public static void main(String[] args) {
        Class<Son> son = Son.class;
        Annotation annotations = son.getAnnotation(MyTestAnnotation.class);
    }
}
@MyTestAnnotation
class Father {}

class Son extends Father {}
