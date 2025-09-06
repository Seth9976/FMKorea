package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class n implements Serializable {
    static abstract class a {
    }

    static class b implements Serializable {
        private final HashMap f;
        private static final long serialVersionUID = 20160629001L;

        private b(HashMap hashMap0) {
            this.f = hashMap0;
        }

        b(HashMap hashMap0, a n$a0) {
            this(hashMap0);
        }

        private Object readResolve() {
            return new n(this.f);
        }
    }

    private HashMap f;
    private static final long serialVersionUID = 20160629001L;

    public n() {
        this.f = new HashMap();
    }

    public n(HashMap hashMap0) {
        HashMap hashMap1 = new HashMap();
        this.f = hashMap1;
        hashMap1.putAll(hashMap0);
    }

    public void a(com.facebook.appevents.a a0, List list0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            if(!this.f.containsKey(a0)) {
                this.f.put(a0, list0);
                return;
            }
            ((List)this.f.get(a0)).addAll(list0);
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, this);
    }

    public List b(com.facebook.appevents.a a0) {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            return (List)this.f.get(a0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }

    public Set c() {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            return this.f.keySet();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }

    private Object writeReplace() {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            return new b(this.f, null);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }
}

