package ru.netology4_1.task_2;

public class Box<K,T> {
    private K key;
    private T obj;

    public Box(K key, T obj){
        this.key = key;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
