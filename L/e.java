package L;

import androidx.datastore.preferences.protobuf.w.d;

abstract class e {
    static final int[] a;

    static {
        int[] arr_v = new int[d.values().length];
        e.a = arr_v;
        try {
            arr_v[d.i.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[d.j.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[d.h.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[d.k.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[d.l.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[d.f.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[d.g.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

