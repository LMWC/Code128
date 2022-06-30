package com.itheima.demo4_异常传递的过程;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int element = getElement(arr,3);
        System.out.println("element = " + element);
    }

    public static int getElement(int[] arr,int index){
        int element = arr[index];// 底层自动有:  throw new ArrayIndexOutOfBoundsException("异常信息");
        return element;
    }
}
