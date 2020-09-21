package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArgsTest {
    @Test
    public void should_return_string_list_when_scan_givrn_string(){
        String argsText = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsText);
        List<KeyValuePair> keyValuePairs = args.scan();
//
//        Assert.assertEquals(3,keyValues.size());
//        Assert.assertEquals(Boolean.TRUE,keyValues.contains("l ture"));
////        Assert.assertTrue(keyValues.contains("l true"));
        Assert.assertEquals(3,keyValuePairs.size());
        Assert.assertTrue(keyValuePairs.contains(new KeyValuePair("l","true")));
        Assert.assertTrue(keyValuePairs.contains(new KeyValuePair("p","8080")));
        Assert.assertTrue(keyValuePairs.contains(new KeyValuePair("d","usr/logs")));


    }
}
