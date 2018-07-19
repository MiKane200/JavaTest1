package com.hand;

import java.util.*;

public class MapToSortedMapFactory implements CaculatorFactory {

    @Override
    public MyMap caculate(MyMap mymap) {
        Map<Integer, int[]> map = mymap.getMap();
        for (Integer key:map.keySet()) {

            int[] arr = map.get(key);
            //排序数组
            for(int i=0;i<arr.length;i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = arr[i];
                    }
                }
            }
            map.put(key,arr);
        }
        mymap.setMap(map);
        return mymap;
    }
}
