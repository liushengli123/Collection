package collection;

import java.util.Vector;

public class ListTest {
    /*list集合：存储有序可重复的一个一个的对象
    * arraylist:作为list的主要实现类  线程不安全的，异步方式，效率高  底层使用数组存储
    *               jdk1.7中：arraylist默认底层创建一个长度为10的数组，当超过10时会扩容为原来的1.5倍容量，并且将原来的数据复制到新的数组中
    *                    总结：建议开发中使用带参的构造器Arraylist list=new ArrayList(10);
    *               jdk1.8中: 底层并没有创建数组，而是造了一个{}，当第一次调用add时，底层才创建了一个长度为10的数组
    *           小结：jdk8相当于延迟了数组的创建，节省了内存空间
    * linkedlist:底层使用双向链表存储，对于频繁的插入、删除效率比arraylist高  内部通过节点node prev next来实现数据对象的插入、删除
    * vector:作为最古老的实现类  线程安全的，同步方式，效率低  底层使用数组存储 相对于arraylist都创建一个长度为10的数组，主要区别在于扩容为原来的2倍
    *  常见方法：
    * 增 add(Object obj)
    * 删 remove(int index)/remove(Object obj)  例如：remove(2)/remove(new Integer(2))
    * 改 set(int index,Object obj)
    * 查 get(int index)
    * 插 add(int index,Object obj)
    * 长度 size
    * 遍历 三种方式 1、Iterator迭代器
    *            2、增强for循环
    *            3、普通循环
    *   */

}
