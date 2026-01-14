package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private IBaz baz;
    private List<IBar> bars;
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
        this.qux = qux;
        this.corge = null;
    }
}
