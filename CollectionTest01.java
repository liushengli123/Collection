package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest01 {
    @Test
    public void test(){
        //collection集合的使用
        Collection collection=new ArrayList();
        collection.add(1);
        collection.add(new String("tom"));
        collection.add(false);
        collection.add(new Person("jerry",20));
        Boolean result=collection.contains(1);
        System.out.println(result);
        Boolean result1=collection.contains(new String("jerry"));
        System.out.println(result1);
        Collection coll= Arrays.asList(1);
        System.out.println(collection.containsAll(coll));
        //迭代器：专门用来遍历集合的接口
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            //next()指针下移，并将指针对应的集合元素返回
            System.out.println(iterator.next());
        }
        //此时会一直打印第一个元素：因为每执行一次迭代器方法指针都会重新指向第一个位置
        while(collection.iterator().hasNext()){
            System.out.println(collection.iterator().next());
        }
        //使用foreach(增强for循环)遍历集合for(集合对象中的元素的类型 局部变量:集合对象)
        for (Object obj:collection
             ) {
            System.out.println(obj);
        }
    }
}
