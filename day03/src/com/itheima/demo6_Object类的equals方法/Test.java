package com.itheima.demo6_Object类的equals方法;

public class Test {
    public static void main(String[] args) {
        /*
            Object类的equals方法:
                public boolean equals(Object obj);判断两个对象是否相等
                返回:通过==运算符比较两个对象地址值是否相同的布尔结果
            注意:
                开发中,如果2个同类型对象的所有属性值相等,往往就认为这是2个相等的对象
                如果开发中,要比较2个对象是否相等,就可以重写equals方法--->alt+insert-->equals and hashCode
         */
        // 创建Person类的对象
        Person p1 = new Person(null, 18);
        Person p2 = new Person("张三", 18);

        // 没有重写equals方法时:
        // 使用Person对象调用equals方法--->因为Person类继承了Object类,所以也拥有了Object类的equals方法
        //boolean res1 = p1.equals(p2);// 比较的是2个对象的地址值
        //System.out.println(p1 == p2);// false
        //System.out.println("res1 = " + res1);// res1 = false

        //重写equals方法时:
        boolean res2 = p1.equals(p2);
        System.out.println(p1 == p2);// false
        System.out.println("res2 = " + res2);// true
    }
}
