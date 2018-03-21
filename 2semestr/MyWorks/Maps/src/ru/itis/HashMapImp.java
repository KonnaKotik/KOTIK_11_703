package ru.itis;


import java.util.LinkedList;

public class HashMapImp<K, V> implements Map<K, V> {

    private LinkedList<Variable>[] map;

    public HashMapImp() {
        map = new LinkedList[10];
    }

    @Override
    public void put(K key, V value) {
        int position = Math.abs(key.hashCode() % 10);
        boolean f = false;
        Variable variableNew = new Variable(key,value);
        if (map[position] == null) {
            LinkedList<Variable> list = new LinkedList<>();
            list.add(variableNew);
            map[position] = list;
        } else {
            for(int j = 0; j < map[position].size(); j++ ) {
                    Variable variable = map[position].get(j);
                    if (variable.getKey().equals(variableNew.getKey())) {
                        map[position].set(j, variableNew);
                        f = true;
                    }
            }
            if(!f) {
                map[position].add(variableNew);
            }
        }
    }

    @Override
    public V get(K key) {
        V value = null;
        int position = Math.abs(key.hashCode() % 10);
        if (map[position] == null) return null;
        else {
            for(int i = 0; i < map[position].size(); i++){
                Variable variable = map[position].get(i);
                if(key.equals(variable.getKey())){
                    value =(V) variable.getValue();
                }
            }
        }

        return value ;
    }



}
