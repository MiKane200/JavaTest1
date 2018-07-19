package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*使用工厂模式，创建一个接口类和两个实现类（2分）
        创建一个工厂，生成基于给定信息的实体类的对象。（1分）
        在main 函数中，通过上面的工厂获取到唯一的类。（1分）
        两个实现类分别使用java 8 的Stream 和其他方式（4分）
        实现功能 （4分*/
        CaculatorFactory listTo = new ListToMapFactory();
        CaculatorFactory mapTo = new MapToSortedMapFactory();

        MyMap myMap = MyMap.getInstance();
        MyMap myMap2 = listTo.caculate(myMap);
        mapTo.caculate(myMap2);
    }
}
