package com.itheima.utils;

import com.itheima.bean.Person;
import com.itheima.bean.Student;
import com.itheima.bean.Teacher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    // 定义一个静态变量,用来记录学生的编号,初始值为0
    public static int sid = 0;

    // 定义一个静态变量,用来记录教室的编号,初始值为0
    public static int tid = 0;

    /**
     * 定义一个方法,根据生日计算年龄
     *
     * @param birthday 生日
     * @return 返回年龄
     */
    public static int birthdayToAge(String birthday) {
        // 1.创建SimpleDateFormat对象,指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 2.把字符串类型的生日转换为Date类型的生日
        Date birthdayDate = null;
        try {
            birthdayDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 3.获取当前日历对象
        Calendar cal = Calendar.getInstance();

        // 4.使用日历对象调用setTime方法设置日期,把日历对象表示的时间修改为出生日期的时间
        cal.setTime(birthdayDate);

        // 5.获取出生日期的年,月,日
        int birthdayYear = cal.get(Calendar.YEAR);
        int birthdayMonth = cal.get(Calendar.MONTH);
        int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);

        // 6.获取当前日历对象
        Calendar nowCal = Calendar.getInstance();

        // 7.判断出生日期的日历对象是否在当前日历对象之后,如果是,就直接返回-1作为标识
        if (cal.after(nowCal)) {
            return -1;
        }

        // 8.获取当前日期的年,月,日
        int nowYear = nowCal.get(Calendar.YEAR);
        int nowMonth = nowCal.get(Calendar.MONTH);
        int nowDay = nowCal.get(Calendar.DAY_OF_MONTH);

        // 9.年份相减,得到初步年龄
        int age = nowYear - birthdayYear;

        // 10.判断是否过生日,如果没有过生日,那么初步年龄-1,得到真实年龄;如果过生日了,初步年龄就是真实年龄
        // 如果月份没到,说明没有过生日
        if (birthdayMonth > nowMonth) {
            age--;
        }

        // 如果月份到了,但日期没到,说明没有过生日
        if (birthdayMonth == nowMonth) {
            if (birthdayDay > nowDay) {
                age--;
            }
        }

        // 11.返回初步年龄---真实年龄
        return age;
    }

    /**
     * 按照指定格式打印Person对象的信息
     *
     * @param p
     */
    public static void printPerson(Person p) {
        System.out.println("********************************************************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t年龄\t\t描述");
        System.out.println(p.getId() + "\t\t\t" + p.getName() + "\t\t" + p.getSex() + "\t\t" + p.getBirthday() + "\t\t" + p.getAge() + "\t\t\t" + p.show());
        System.out.println("********************************************************************************************");
    }

    // 需求: 参数接收的ArrayList集合泛型可以是Teacher类型,Student类型,Person类任意子类对象类型

    /**
     * 按照指定格式打印ArrayList集合元素
     * @param list
     */
    public static void printArrayList(ArrayList list) {// 不写泛型,表示该ArrayList集合变量,可以接收任意ArrayList集合对象(无论泛型是什么都可以接收)
        // 以下2行代码会编译报错,因为泛型不存在多态,而且这里也不是多态
        //ArrayList<Person> list1 = new ArrayList<Student>();
        //ArrayList<Person> list2 = new ArrayList<Teacher>();

        System.out.println("********************************************************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t年龄\t\t描述");
        for (Object obj : list) {
            // 向下转型
            /*if (obj instanceof Student) {
                Student stu = (Student) obj;
                System.out.println(stu.getId() + "\t\t\t" + stu.getName() + "\t\t" + stu.getSex() + "\t\t" + stu.getBirthday() + "\t\t" + stu.getAge() + "\t\t\t" + stu.show());
            }


            if (obj instanceof Teacher) {
                Teacher tea = (Teacher) obj;
                System.out.println(tea.getId() + "\t\t\t" + tea.getName() + "\t\t" + tea.getSex() + "\t\t" + tea.getBirthday() + "\t\t" + tea.getAge() + "\t\t\t" + tea.show());
            }*/
            Person p = (Person) obj;
            // 按照指定格式打印集合元素的所有属性值
            System.out.println(p.getId() + "\t\t\t" + p.getName() + "\t\t" + p.getSex() + "\t\t" + p.getBirthday() + "\t\t" + p.getAge() + "\t\t\t" + p.show());


        }
        System.out.println("********************************************************************************************");
    }


}
