package com.hand;

import java.util.*;

public class ListToMapFactory implements CaculatorFactory {


    @Override
    public MyMap caculate(MyMap mymap) {
        List list = mymap.getList();
        Map<Integer, int []> map = new HashMap();
        for (int i=0;i<50;i++) {

            int value = (int)list.get(i);
            int key = value/10;


            //区分每个相同的key，并把相同key的数值加入到数组中放进map
            if(map.containsKey(key)){
                int []arr;
                arr = map.get(key);
                List list1 = java.util.Arrays.asList(arr);
                list1.add(value);
                int[] arr1 = new int[list1.size()];
                map.put(key, arr1);
                }else{
                List list1 = new ArrayList();
                list1.add(value);
                int[] arr1 = new int[list1.size()];
                map.put(key, arr1);
            }
            mymap.setMap(map);
            }


        return mymap;
    }

}
