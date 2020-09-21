package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


public class Schema_Test {
    @Test
    public void should_return_type_when_given_flag_l(){
        FlagSchema flagSchema = new FlagSchema("l",Boolean.TYPE);
        FlagSchema flagSchema1 = new FlagSchema("p",Integer.TYPE);
        Set<FlagSchema> flagsSchema =  new HashSet<FlagSchema>();
        flagsSchema.add(flagSchema);
        flagsSchema.add(flagSchema1);
        Schema schema = new Schema(flagsSchema);

        String flag = "p";
        System.out.println(schema.getTypeOf(flag));
        System.out.println(schema.getTypeOf("p"));

        Assert.assertEquals(schema.getTypeOf(flag),Integer.TYPE);
    }
}
