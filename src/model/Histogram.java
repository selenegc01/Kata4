package model;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Histogram<T> {
    
    public final Map<T, Integer> map;

    public Histogram() {
        this.map =  new HashMap<T, Integer>();
    }
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){    
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}
