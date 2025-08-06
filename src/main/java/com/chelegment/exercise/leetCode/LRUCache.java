package com.chelegment.exercise.leetCode;


import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

class LRUCache {

    int capacity = 1;
    HashMap<Integer, Pair<Integer, AtomicInteger>> cache = new HashMap<>();

    public LRUCache(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        }
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Pair<Integer, AtomicInteger> integerAtomicIntegerPair = cache.get(key);
            integerAtomicIntegerPair.second.set(0);
            incrementAll();
            return integerAtomicIntegerPair.first;

        }
        return -1;
    }

    public void incrementAll(){
        for(Pair<Integer,AtomicInteger> pair:cache.values()){
            pair.second.incrementAndGet();
        }
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Pair<Integer, AtomicInteger> integerAtomicIntegerPair = cache.get(key);
            incrementAll();
            integerAtomicIntegerPair.second.set(0);
            cache.put(key, new Pair<>(value, integerAtomicIntegerPair.second));
            return;
        }
        if (cache.size() >= capacity) {
            Integer max = null;
            Integer maxKey = null;
            for (Integer i : cache.keySet()) {
                Pair<Integer, AtomicInteger> integerAtomicIntegerPair = cache.get(i);
                if (max == null) {
                    maxKey = i;
                    max = integerAtomicIntegerPair.second.get();
                } else {
                    if (integerAtomicIntegerPair.second.get() > max) {
                        maxKey = i;
                        max = integerAtomicIntegerPair.second.get();
                    }
                }
            }
            cache.remove(maxKey);
        }
        cache.put(key, new Pair<>(value, new AtomicInteger(0)));
        incrementAll();
    }

    static class Pair<T, K> {
        T first;
        K second;

        public Pair(T first, K second) {
            this.first = first;
            this.second = second;
        }
    }


    public static void main(String[] args) {
        LRUCacheCorrect lruCache = new LRUCacheCorrect(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
//        lruCache.put(4, 4);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(3));
//        System.out.println(lruCache.get(4));
//        ["LRUCache","put","put","get","put","get","put","get","get","get"]
//[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]

//["LRUCache","put","put","put","put","get","get"]
//[[2],[2,1],[1,1],[2,3],[4,1],[1],[2]]

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */