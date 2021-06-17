package com.netease.wwordy;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/6/11
 */
public class MySet {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User("aa", 18));
        set.add(new User("bb", 25));
        set.add(new User("cc", 30));
        //User user = set.stream().filter(e -> e.getAge() > 30).findFirst().get();
        set.stream().map(s -> {
            if (s.getName().equals("bb")) {
                s.setAge(88);
                return s;
            } else if (s.getName().equals("cc")) {
                s.setAge(99);
            }
            return s;
        }).collect(Collectors.toSet());
        set.stream().forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        Set<User> collect = set.stream().peek(p -> p.setAge(4)).collect(Collectors.toSet());
        collect.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        List<String> list = Lists.newArrayList("one", "two", "three", "four").stream().peek(u -> u.toUpperCase()).collect(Collectors.toList());
        list.forEach(System.out::println);



    }
}
