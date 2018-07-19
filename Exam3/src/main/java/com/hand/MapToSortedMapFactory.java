package com.hand;

import java.util.*;

public class MapToSortedMapFactory implements CaculatorFactory {

    @Override
    public MyMap caculate(MyMap mymap) {
        Map<Integer, ArrayList> map = mymap.getMap();
        for (Integer key:map.keySet()) {

            ArrayList arr = map.get(key);
            //排序数组
            for(int i=0;i<arr.size();i++) {
                for (int j = 0; j < arr.size(); j++) {
                    int ii = (Integer) arr.get(i);
                    int jj = (Integer) arr.get(j);
                    if (ii>jj) {
                        int temp = ii;
                        arr.set(i,jj);
                        arr.set(j,temp);
                    }
                }
            }
            map.put(key,arr);
        }
        mymap.setMap(map);
        return mymap;
    }
}
