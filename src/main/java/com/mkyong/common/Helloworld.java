package com.mkyong.common;

/*
    Spring Bean
 */
public class Helloworld
{
    private String name;

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
}
