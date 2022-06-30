package com.itheima.demo5_throw关键字;

public class Test {
    public static void main(String[] args) {
        /*
            throw关键字:
                作用：在方法内部，抛出一个描述问题的异常对象，并结束当前方法的执行
                格式：throw new 异常类名(参数);

         */
        int[] arr = {10, 20, 30};
        int element = getElement(arr, 3);
        System.out.println("element = " + element);
    }

    public static int getElement(int[] arr, int index) {
        //int element = arr[index];// 底层自动有:  throw new ArrayIndexOutOfBoundsException("异常信息");
        // 模拟
        if (index < 0 || index > arr.length - 1) {
            // 索引不存在,就要产生异常--->创建异常对象,封装异常信息
            throw new ArrayIndexOutOfBoundsException(index + "索引不存在");// 产生异常对象,并结束方法

        } else {
            int element = arr[index];
            return element;
        }

    }
}
