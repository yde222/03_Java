package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        /***
         * LinkedHashSet 은 저장 당시의 순서를 유지하는 특성을 가지고 있다
         * (중복 제거 + 순서 유지)
         */
        Set<String> lset = new LinkedHashSet<>();

        lset.add("pork");
        lset.add("ramen");
        lset.add("kimchi");
        lset.add("friedEgg");
        lset.add("chicken");
   //     lset.add("chicken");
   //     lset.add("chicken");

        System.out.println(" lset " + lset);

        Iterator<String> iterator = lset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
