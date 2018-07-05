package com.mkyong.common;

import java.util.*;

/*
    Spring Bean
 */
public class Helloworld
{
    private String name;

    List<Double> list;

    public void createList()
    {
        list = new ArrayList<Double>(Arrays.asList(0.1, 0.4, 0.3, 0.2));
    }

    public void sortList()
    {
        Collections.sort(list);
    }

    public void printHello()
    {
        System.out.println("Hello "+this.name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Double> getList() {
        return list;
    }

    public void setList(List<Double> list) {
        this.list = list;
    }

}
