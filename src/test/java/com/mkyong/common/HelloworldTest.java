package com.mkyong.common;

import org.junit.Assert;
import org.junit.Test;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

public class HelloworldTest {
    Helloworld hehe = new Helloworld();

    @Test
    public void printHello() {
        hehe.setName("Nghi dap chai");
        assertEquals(hehe.getName(),"Nghi Nguyen");
    }

    @Test
    public void testSetNameFunction() {
        hehe.setName("Nghi Nghi");
        assertEquals(hehe.getName(), "Nghi Nghi");
    }

    @Test
    public void testSortArray() {
        hehe.createList();
        hehe.sortList();
        assertEquals(hehe.getList(),new ArrayList<Double>(Arrays.asList(0.1, 0.2, 0.3, 0.4)));
    }
}