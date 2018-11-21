/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nicolasreyalonso
 */
public class Histogram<T> {
    private final Map<T,Integer> map;

    public Histogram() {
        this.map = new HashMap<T, Integer>();
    }
    
    
    public Integer get(T key){
        return map.get(key);
    }
    public Set <T> keySet(){
        return map.keySet();
    }
    public void increment(T key){
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}
