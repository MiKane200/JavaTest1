package com.hand;

import java.util.*;

public class ListToMapFactory implements CaculatorFactory {


    @Override
    public MyMap caculate(MyMap mymap) {
        List list = mymap.getList();
        Map<Integer, ArrayList> map = new HashMap();
        for (int i=0;i<50;i++) {

            int value = (int)list.get(i);
            int key = value/10;


            //区分每个相同的key，并把相同key的数值加入到数组中放进map
            if(map.containsKey(key)){
                ArrayList arr;
                arr = map.get(key);
                arr.add(value);
                map.put(key, arr);
                }else{
                ArrayList arr = new ArrayList();
                arr.add(value);
                map.put(key, arr);
            }
            mymap.setMap(map);
            }


        return mymap;
    }

}
