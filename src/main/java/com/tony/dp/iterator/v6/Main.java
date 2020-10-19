package com.tony.dp.iterator.v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 22:06
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Collection c = new LinkedList();
        for (int i = 0; i < 15; i++) {
            c.add(new String("s"+i));
        }

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
