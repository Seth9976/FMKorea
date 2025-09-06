package com.onesignal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class z1 {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.o.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    t0 a;
    private final ConcurrentHashMap b;

    z1(c t0$c0) {
        this.b = new ConcurrentHashMap();
        this.a = new t0(t0$c0);
    }

    void a(Map map0) {
        synchronized(this.b) {
            for(Object object0: map0.keySet()) {
                Object object1 = map0.get(((String)object0));
                this.b.put(((String)object0), object1);
            }
        }
    }

    private boolean b(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            if(!this.d(((y1)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    boolean c(E0 e00) {
        if(e00.c.size() == 0) {
            return true;
        }
        for(Object object0: e00.c) {
            if(this.b(((ArrayList)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private boolean d(y1 y10) {
        com.onesignal.y1.a y1$a0 = y10.b;
        if(y1$a0 == com.onesignal.y1.a.j) {
            return false;
        }
        if(y1$a0 != com.onesignal.y1.a.i) {
            return this.a.c(y10);
        }
        b y1$b0 = y10.d;
        Object object0 = this.b.get(y10.c);
        if(object0 == null) {
            return y1$b0 == b.n ? true : y1$b0 == b.j && y10.e != null;
        }
        if(y1$b0 == b.m) {
            return true;
        }
        if(y1$b0 == b.n) {
            return false;
        }
        if(y1$b0 == b.o) {
            return object0 instanceof Collection && ((Collection)object0).contains(y10.e);
        }
        if(object0 instanceof String && (y10.e instanceof String && this.l(((String)y10.e), ((String)object0), y1$b0))) {
            return true;
        }
        return !(y10.e instanceof Number) || !(object0 instanceof Number) || !this.j(((Number)y10.e), ((Number)object0), y1$b0) ? this.i(y10.e, object0, y1$b0) : true;
    }

    Object e(String s) {
        synchronized(this.b) {
            return this.b.containsKey(s) ? this.b.get(s) : null;
        }
    }

    boolean f(E0 e00, Collection collection0) {
        if(e00.c == null) {
            return false;
        }
        for(Object object0: collection0) {
            String s = (String)object0;
            for(Object object1: e00.c) {
                for(Object object2: ((ArrayList)object1)) {
                    if(s.equals(((y1)object2).c) || s.equals(((y1)object2).a)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    boolean g(E0 e00) {
        if(e00.c != null && !e00.c.isEmpty()) {
            for(Object object0: e00.c) {
                for(Object object1: ((ArrayList)object0)) {
                    com.onesignal.y1.a y1$a0 = ((y1)object1).b;
                    if(y1$a0 == com.onesignal.y1.a.i || y1$a0 == com.onesignal.y1.a.j) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    void h(Collection collection0) {
        synchronized(this.b) {
            for(Object object0: collection0) {
                this.b.remove(((String)object0));
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean i(Object object0, Object object1, b y1$b0) {
        if(object0 == null) {
            return false;
        }
        return !(object1 instanceof String) || !(object0 instanceof Number) ? false : this.k(((Number)object0), ((String)object1), y1$b0);
    }

    private boolean j(Number number0, Number number1, b y1$b0) {
        double f = number0.doubleValue();
        double f1 = number1.doubleValue();
        switch(a.a[y1$b0.ordinal()]) {
            case 1: {
                return f1 == f;
            }
            case 2: {
                return f1 != f;
            }
            case 3: 
            case 4: 
            case 5: {
                I1.p1(C.h, "Attempted to use an invalid operator with a numeric value: " + y1$b0.toString());
                return false;
            }
            case 6: {
                return f1 < f;
            }
            case 7: {
                return f1 > f;
            }
            case 8: {
                return f1 < f || f1 == f;
            }
            case 9: {
                int v = Double.compare(f1, f);
                return v > 0 || v == 0;
            }
            default: {
                return false;
            }
        }
    }

    private boolean k(Number number0, String s, b y1$b0) {
        try {
            return this.j(number0.doubleValue(), Double.parseDouble(s), y1$b0);
        }
        catch(NumberFormatException unused_ex) {
            return false;
        }
    }

    private boolean l(String s, String s1, b y1$b0) {
        switch(a.a[y1$b0.ordinal()]) {
            case 1: {
                return s.equals(s1);
            }
            case 2: {
                return !s.equals(s1);
            }
            default: {
                I1.p1(C.h, "Attempted to use an invalid operator for a string trigger comparison: " + y1$b0.toString());
                return false;
            }
        }
    }
}

