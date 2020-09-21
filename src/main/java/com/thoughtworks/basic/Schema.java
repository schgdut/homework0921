package com.thoughtworks.basic;

import java.util.Set;

public class Schema {
    private Set<FlagSchema> flagsSchemas;

    public Schema(Set<FlagSchema> flagsSchemas) {

        this.flagsSchemas = flagsSchemas;
    }

    public Object getTypeOf(String flag) {
        return flagsSchemas.stream()
                .filter(flagSchema -> flagSchema.equalsWith(flag))
                .findFirst()
                .get()
                .getType();
    }
}
