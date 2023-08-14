/*
多行注释
*/

/**
文档注释
@author shkstart
@version v1.0

假装是第一个程序！

*/
public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello world!");//注释不会被编译
    }
}

class Dog{
    public static void main (String[] args) {
        System.out.println("Hello Dog");
/*
注释不会被编译
*/
    }
}