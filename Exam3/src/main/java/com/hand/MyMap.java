package com.hand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyMap {
    private static MyMap instance = new MyMap();

    public static MyMap getInstance(){
        return instance;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    private Map map;



    public List getList(){
        Random random = new Random();
        List list=new ArrayList();
        for (int i=0;i<50;i++){
            int temp = random.nextInt(99)+1;
            list.add(temp);
        }

        return list;
    }
}
