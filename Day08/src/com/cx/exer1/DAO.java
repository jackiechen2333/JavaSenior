package com.cx.exer1;

import java.text.CollationElementIterator;
import java.util.*;

/**
 * @Author cx
 * @Date 2023/02/08/17:20
 */
public class DAO<T> {

    private Map<String, T> map = new HashMap<>();

    //保存T类型的对象到Map成员变量中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //从map 中获取id 对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //替换map 中key为id的内容,改为entity对象
    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    //返回map 中存放的所有T对象
    public List<T> list() {
        ArrayList<T> arrayList = new ArrayList<>();
        Collection<T> collection = map.values();
        for(T e: collection){
            arrayList.add(e);
        }
        return arrayList;
    }

    //删除指定id对象
    public void delete(String id) {
    }

}
