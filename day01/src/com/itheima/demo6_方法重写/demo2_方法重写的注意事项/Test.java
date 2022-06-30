package com.itheima.demo6_方法重写.demo2_方法重写的注意事项;

class Fu{
    public void method(){
        System.out.println("Fu method...");
    }
}

class Zi extends Fu{
    @Override
    public void method(){
        System.out.println("Zi method...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            - 方法重写是发生在父子类之间的关系。
            - 子类方法重写父类方法，返回值类型、方法名和参数列表都要一模一样。
            - 使用场景:父类的方法,子类有不同的实现,那么子类就需要重写父类的该方法
            - 子类方法重写父类方法，必须要保证权限大于等于父类权限。
                  访问权限从大到小:  public >  protected  > (默认) > private
            - 使用@Override注解，检验是否重写成功，重写注解校验！
              - 建议重写方法都加上这个注解，一方面可以提高代码的可读性，一方面可以防止重写出错！
              使用场景：当子类方法的功能实现和父类不一样的时候，那么子类就可以重写该方法
         */
    }
}
