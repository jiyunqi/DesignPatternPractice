package jyq.singleton;

/**
 * 单例模式
 * 应用场合：只需要一个就足够的
 * 作用：保证整个应用程序中的某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 * 区别：饿汉模式特点是加载类比较慢，但运行时获取对象的速度比较快，线程安全
 *      懒汉模式特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 */
public class Singleton {

    /* 饿汉模式：

    //1.构造方法私有化，不允许外部直接创建
    private Singleton(){

    }

    //2.创建类的唯一实例
    private static Singleton instance = new Singleton();

    //3.提供一个用于获取实例的方法
    public static Singleton getInstance(){
        return instance;
    }
    */


    /* 懒汉模式：

    private Singleton(){

    }

    //
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    */
}
