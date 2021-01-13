package com.company;

/**
 * @author cheng
 */
public class Main {

    /**
     *
     * @param args
     */
    static {
        System.out.println("out");
        new supern() {
            @Override
            public void say() {
                System.out.println("hello");
            }
        };
    }
    public static void main(String[] args) {
//        int t=5;
//        int[] a={1,2,34,5};
//        flag:for (int i=0;i<t;i++){
//            for (int j=0;j<t;j++){
//                System.out.println(i+":"+j);
//                if (j == 5) {
//                    continue;
//                }
//                break flag;
//            }
//        }
//        /*
//
//
//         */
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a);
//        }
//        for (int i = a.length - 1; i >= 0; i--) {
//            System.out.println(123);
//        }
//
        boy boy = new boy();
        System.out.println("mian");
    }
}
