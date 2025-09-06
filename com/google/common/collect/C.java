package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

abstract class c implements z {
    @Override  // com.google.common.collect.z
    public abstract Map a();

    public boolean b(Object object0) {
        for(Object object1: this.a().values()) {
            if(((Collection)object1).contains(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object object0) {
        return A.a(this, object0);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    @Override
    public String toString() {
        return this.a().toString();
    }
}

