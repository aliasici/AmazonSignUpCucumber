package com.amazon.stepdefinitions;

import com.amazon.pages.JUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class JUnit {

    @Test
    public void test(){
        JUnitTest jUnitTest = new JUnitTest();

         int input = jUnitTest.squareTest(5);

        Assert.assertEquals(27,input);
    }
}
