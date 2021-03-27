package com.company;
// 数组返回两个值
public class Arraydemo1 {
  public static void main(String[] args) {
    // write your c ode here
    int[] result = calculate(10, 30, 40);
    System.out.println(result[0]);
    System.out.println(result[1]);
  }

  public static int[] calculate(int a, int b, int c) {
    int sum = a + b + c;
    int avg = sum / 3;
    int[] array = {sum, avg};
    return array;
  }
}
