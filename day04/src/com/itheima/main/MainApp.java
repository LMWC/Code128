package com.itheima.main;

import com.itheima.bean.Student;
import com.itheima.bean.Teacher;
import com.itheima.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // 定义一个ArrayList集合,限制集合元素的类型为Student
        ArrayList<Student> stuList = new ArrayList<>();
        // 定义一个ArrayList集合,限制集合元素的类型为Teacher
        ArrayList<Teacher> teaList = new ArrayList<>();

        // 循环生成一级菜单
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.学生信息管理        2.教师信息管理        3.系统退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择菜单:");
            int op = sc.nextInt();
            // 根据选择菜单,进入对应的功能
            switch (op) {
                case 1:
                    // 进入学生信息管理
                    studentManage(stuList);
                    break;
                case 2:
                    // 进入教师信息管理
                    teacherManage(teaList);
                    break;
                case 3:
                    // 系统退出
                    System.out.println("谢谢使用,欢迎下次再来!");
                    System.exit(0);
                default:
                    System.out.println("输入有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 学生信息管理
     *
     * @param stuList
     */
    private static void studentManage(ArrayList<Student> stuList) {
        // 循环生成二级菜单
        while (true) {
            // 显示二级菜单
            System.out.println("---------------------------------------");
            System.out.println("1.添加学生  2.查询学生  3.修改学生  4.删除学生  5.返回");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入功能序号:");
            int op = sc.nextInt();
            // 根据选择菜单,进入对应的功能
            switch (op) {
                case 1:
                    // 添加学生
                    addStudent(stuList);
                    break;
                case 2:
                    // 查询学生
                    selectStudent(stuList);
                    break;
                case 3:
                    // 修改学生
                    updateStudent(stuList);
                    break;
                case 4:
                    // 删除学生
                    deleteStudent(stuList);
                    break;
                case 5:
                    // 返回到一级菜单
                    return;// 结束当前方法
                default:
                    System.out.println("输入有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 删除学生
     *
     * @param stuList
     */
    private static void deleteStudent(ArrayList<Student> stuList) {
        // 1.输入要删除的学生编号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生编号:");
        int id = sc.nextInt();

        // 2.循环遍历集合,查询要修改的学生编号
        for (int i = 0; i < stuList.size(); i++) {
            // 3.在循环中,获取集合元素
            Student stu = stuList.get(i);
            // 4.判断遍历出来的学生对象的编号和要删除的学生编号是否一致
            if (stu.getId() == id) {
                // 找到了要删除的学生对象---进行删除
                // 显示要删除的学生信息
                System.out.println("【要删除的学生信息】:");
                Utils.printPerson(stu);

                while (true) {
                    // 确认删除的功能
                    System.out.println("请确认释放删除,y表示删除,n表示取消删除(忽略大小写):");
                    String confirm = sc.next();

                    // 判断用户输入的信息
                    if ("y".equalsIgnoreCase(confirm)) {
                        // 删除元素
                        stuList.remove(i);
                        // 删除完了,,打印提示信息
                        System.out.println("【删除结果】:恭喜您,删除成功!");
                        break;
                    } else if ("n".equalsIgnoreCase(confirm)) {
                        System.out.println("【删除结果】:取消删除!");
                        break;
                    } else {
                        System.out.println("输入有误,请重新输入!");
                    }
                }

                // 结束循环,结束方法
                return;
            }
        }

        // 5.来到这里,说明要删除的学生编号不存在
        System.out.println("【删除结果】:没有找到id为" + id + "的学生,删除失败!");
    }

    /**
     * 修改学生
     *
     * @param stuList
     */
    private static void updateStudent(ArrayList<Student> stuList) {
        // 1.输入要修改的学生编号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生编号:");
        int id = sc.nextInt();

        //2.循环遍历集合,查询要修改的学生编号
        for (int i = 0; i < stuList.size(); i++) {
            // 3.获取集合元素
            Student stu = stuList.get(i);
            // 4.判断遍历出来的学生对象的编号和要修改的学生编号是否一致
            if (stu.getId() == id) {
                // 找到了要修改的学生对象---进行修改
                System.out.println("请输入新的姓名,保留原值请输入0:");
                String name = sc.next();
                System.out.println("请输入新的性别,保留原值请输入0:");
                String sex = sc.next();
                System.out.println("请输入新的出生日期,保留原值请输入0:");
                String birthday = sc.next();

                //  判断输入的值
                if (!"0".equals(name)) {
                    // 输入的姓名不为0,要修改
                    stu.setName(name);
                }

                if (!"0".equals(sex)) {
                    // 输入的性别不为0,要修改
                    stu.setSex(sex);
                }

                if (!"0".equals(birthday)) {
                    // 输入的生日不为0,要修改
                    stu.setBirthday(birthday);
                    // 修改生日,就要一起修改年龄
                    stu.setAge(Utils.birthdayToAge(birthday));
                }

                // 打印提示信息
                System.out.println("【修改结果】:恭喜您,修改成功!");
                // 修改完了之后,就结束循环,结束方法
                return;
            }
        }

        // 5.来到这里,说明要修改的学生编号不存在
        System.out.println("【修改结果】:没有找到id为" + id + "的学生,修改失败!");

    }

    /**
     * 查询学生
     *
     * @param stuList
     */
    private static void selectStudent(ArrayList<Student> stuList) {
        // 1.如果集合中没有学生对象,就显示提示信息,结束方法
        if (stuList.size() == 0) {
            System.out.println("【查询结果】:没有学生信息,请添加学生信息再来查询!");
            return;
        }

        // 2.如果集合中有学生对象,按照指定格式打印输出
        Utils.printArrayList(stuList);

    }

    /**
     * 添加学生
     *
     * @param stuList
     */
    private static void addStudent(ArrayList<Student> stuList) {
        // 输入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入性别:");
        String sex = sc.next();
        System.out.println("请输入出生日期,格式为yyyy-MM-dd:");
        String birthday = sc.next();

        // 创建学生对象
        Student stu = new Student();

        // 把输入的学生信息赋值给学生对象的属性
        Utils.sid++;
        stu.setId(Utils.sid);
        stu.setName(name);
        stu.setSex(sex);
        stu.setBirthday(birthday);
        stu.setAge(Utils.birthdayToAge(birthday));

        // 把学生对象添加到集合中
        stuList.add(stu);

        // 显示添加成功信息
        System.out.println("【添加结果】:添加学生信息成功!");

    }

    /**
     * 教师信息管理
     *
     * @param teaList
     */
    private static void teacherManage(ArrayList<Teacher> teaList) {
        // 循环生成二级菜单
        while (true) {
            // 显示二级菜单
            System.out.println("---------------------------------------");
            System.out.println("1.添加教师  2.查询教师  3.修改教师  4.删除教师  5.返回");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入功能序号:");
            int op = sc.nextInt();
            // 根据选择菜单,进入对应的功能
            switch (op) {
                case 1:
                    // 添加教师
                    addTeacher(teaList);
                    break;
                case 2:
                    // 查询教师
                    selectTeacher(teaList);
                    break;
                case 3:
                    // 修改教师
                    updateTeacher(teaList);
                    break;
                case 4:
                    // 删除教师
                    deleteTeacher(teaList);
                    break;
                case 5:
                    // 返回到一级菜单
                    return;// 结束当前方法
                default:
                    System.out.println("输入有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 删除教师
     * @param teaList
     */
    private static void deleteTeacher(ArrayList<Teacher> teaList) {
        // 1.输入要删除的教师编号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的教师编号:");
        int id = sc.nextInt();

        // 2.循环遍历集合,查询要修改的教师编号
        for (int i = 0; i < teaList.size(); i++) {
            // 3.在循环中,获取集合元素
            Teacher tea = teaList.get(i);
            // 4.判断遍历出来的教师对象的编号和要删除的教师编号是否一致
            if (tea.getId() == id) {
                // 找到了要删除的教师对象---进行删除
                // 显示要删除的教师信息
                System.out.println("【要删除的教师信息】:");
                Utils.printPerson(tea);

                while (true) {
                    // 确认删除的功能
                    System.out.println("请确认释放删除,y表示删除,n表示取消删除(忽略大小写):");
                    String confirm = sc.next();

                    // 判断用户输入的信息
                    if ("y".equalsIgnoreCase(confirm)) {
                        // 删除元素
                        teaList.remove(i);
                        // 删除完了,,打印提示信息
                        System.out.println("【删除结果】:恭喜您,删除成功!");
                        break;
                    } else if ("n".equalsIgnoreCase(confirm)) {
                        System.out.println("【删除结果】:取消删除!");
                        break;
                    } else {
                        System.out.println("输入有误,请重新输入!");
                    }
                }

                // 结束循环,结束方法
                return;
            }
        }

        // 5.来到这里,说明要删除的教师编号不存在
        System.out.println("【删除结果】:没有找到id为" + id + "的教师,删除失败!");
    }

    /**
     * 修改教师
     * @param teaList
     */
    private static void updateTeacher(ArrayList<Teacher> teaList) {
        // 1.输入要修改的教师编号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的教师编号:");
        int id = sc.nextInt();

        //2.循环遍历集合,查询要修改的教师编号
        for (int i = 0; i < teaList.size(); i++) {
            // 3.获取集合元素
            Teacher tea = teaList.get(i);
            // 4.判断遍历出来的教师对象的编号和要修改的教师编号是否一致
            if (tea.getId() == id) {
                // 找到了要修改的教师对象---进行修改
                System.out.println("请输入新的姓名,保留原值请输入0:");
                String name = sc.next();
                System.out.println("请输入新的性别,保留原值请输入0:");
                String sex = sc.next();
                System.out.println("请输入新的出生日期,保留原值请输入0:");
                String birthday = sc.next();

                //  判断输入的值
                if (!"0".equals(name)) {
                    // 输入的姓名不为0,要修改
                    tea.setName(name);
                }

                if (!"0".equals(sex)) {
                    // 输入的性别不为0,要修改
                    tea.setSex(sex);
                }

                if (!"0".equals(birthday)) {
                    // 输入的生日不为0,要修改
                    tea.setBirthday(birthday);
                    // 修改生日,就要一起修改年龄
                    tea.setAge(Utils.birthdayToAge(birthday));
                }

                // 打印提示信息
                System.out.println("【修改结果】:恭喜您,修改成功!");
                // 修改完了之后,就结束循环,结束方法
                return;
            }
        }

        // 5.来到这里,说明要修改的教师编号不存在
        System.out.println("【修改结果】:没有找到id为" + id + "的学生,修改失败!");

    }

    /**
     * 查询教师
     * @param teaList
     */
    private static void selectTeacher(ArrayList<Teacher> teaList) {
        // 1.如果集合中没有教师对象,就显示提示信息,结束方法
        if (teaList.size() == 0) {
            System.out.println("【查询结果】:没有教师信息,请添加教师信息再来查询!");
            return;
        }

        // 2.如果集合中有教师对象,按照指定格式打印输出
        Utils.printArrayList(teaList);

    }

    /**
     * 添加教师
     * @param teaList
     */
    private static void addTeacher(ArrayList<Teacher> teaList) {
        // 输入教师信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入性别:");
        String sex = sc.next();
        System.out.println("请输入出生日期,格式为yyyy-MM-dd:");
        String birthday = sc.next();

        // 创建教师对象
        Teacher tea = new Teacher();

        // 把输入的教师信息赋值给教师对象的属性
        Utils.tid++;
        tea.setId(Utils.tid);
        tea.setName(name);
        tea.setSex(sex);
        tea.setBirthday(birthday);
        tea.setAge(Utils.birthdayToAge(birthday));

        // 把教师对象添加到集合中
        teaList.add(tea);

        // 显示添加成功信息
        System.out.println("【添加结果】:添加教师信息成功!");

    }


}
