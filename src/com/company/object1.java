package com.company;

import java.util.ArrayList;
import java.util.Date;

// 面向对象和面向过程的区别，面对过程注重实现的步骤、细节，面向过程用方法来实现
// 打印数组，格式为[1,2,3,4,5]
// 快捷键
public class object1 {
  public object1() {}

  public static void main(String[] args) {
    System.out.println("hello");
    System.out.println();
    // region Description
    System.out.println("hello");
    // endregion
    //        alt + enter
    Date date = new Date();
    String sw = new String();
    int a2 = 3;
    int b = 4;
    int c = a2 + b;
    System.out.println();
    ArrayList arrayList = new ArrayList();
    arrayList.add(3, 'a');
    mentods222(a2);
    // alt + shift + r
    printA();
  }

  public static void printA() {
    for (int i = 0; i < 9; i++) {
      //
      i += 1;
      System.out.println(i);
    }
  }

  public static void mentods222(int a) {
    int c = 2 * a;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
