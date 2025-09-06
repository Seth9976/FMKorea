package com.google.common.collect;

import X1.f;
import X1.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class v {
    public static boolean a(Collection collection0, Iterator iterator0) {
        h.i(collection0);
        h.i(iterator0);
        boolean z;
        for(z = false; iterator0.hasNext(); z |= collection0.add(object0)) {
            Object object0 = iterator0.next();
        }
        return z;
    }

    public static boolean b(Iterator iterator0, Iterator iterator1) {
        while(iterator0.hasNext()) {
            if(!iterator1.hasNext()) {
                return false;
            }
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            if(!f.a(object0, object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !iterator1.hasNext();
    }

    public static S c(Object object0) {
        class a extends S {
            boolean f;
            final Object g;

            a(Object object0) {
            }

            @Override
            public boolean hasNext() {
                return !this.f;
            }

            @Override
            public Object next() {
                if(this.f) {
                    throw new NoSuchElementException();
                }
                this.f = true;
                return this.g;
            }
        }

        return new a(object0);
    }
}

