package com.hand;

import java.util.ArrayList;

import sun.reflect.generics.tree.Tree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = 0;
        ArrayList list = new ArrayList();
        for(int i=101;i<=200;i++) {
            for (int j=2;j<i;j++){
                if(i % j == 0){
                    break;
                }else if(j==i-1){
                    list.add(i);
                    count++;
                }
            }
        }
        System.out.print( "101-200间总共有"+count+"个素数，分别是:"+ list.toString());
    }
}
