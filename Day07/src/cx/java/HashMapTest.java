package cx.java;

import org.junit.Test;

import java.util.*;

/**
 * @Author cx
 * @Date 2023/02/07/22:02
 */
public class HashMapTest {

    @Test
    public void test(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,1234);
        map.put("BB",56);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        Collection values = map.values();
        for (Object o : values){
            System.out.println(o);
        }

        System.out.println();
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object o = iterator1.next();
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + "--->" + entry.getValue());

        }
        System.out.println();
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "===" + value);
        }



    }

}
