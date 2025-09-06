package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map.Entry;
import java.util.TreeMap;

abstract class n {
    static final byte[] a;
    static final byte[] b;

    static {
        n.a = new byte[]{0x70, 0x72, 0x6F, 0};
        n.b = new byte[]{0x70, 0x72, 109, 0};
    }

    private static void A(InputStream inputStream0) {
        f.h(inputStream0);
        int v = f.j(inputStream0);
        if(v == 6) {
            return;
        }
        if(v == 7) {
            return;
        }
        while(v > 0) {
            f.j(inputStream0);
            for(int v1 = f.j(inputStream0); v1 > 0; --v1) {
                f.h(inputStream0);
            }
            --v;
        }
    }

    static boolean B(OutputStream outputStream0, byte[] arr_b, e[] arr_e) {
        if(Arrays.equals(arr_b, p.a)) {
            n.N(outputStream0, arr_e);
            return true;
        }
        if(Arrays.equals(arr_b, p.b)) {
            n.M(outputStream0, arr_e);
            return true;
        }
        if(Arrays.equals(arr_b, p.d)) {
            n.K(outputStream0, arr_e);
            return true;
        }
        if(Arrays.equals(arr_b, p.c)) {
            n.L(outputStream0, arr_e);
            return true;
        }
        if(Arrays.equals(arr_b, p.e)) {
            n.J(outputStream0, arr_e);
            return true;
        }
        return false;
    }

    private static void C(OutputStream outputStream0, e e0) {
        int[] arr_v = e0.h;
        int v = 0;
        for(int v1 = 0; v < arr_v.length; v1 = v2) {
            int v2 = arr_v[v];
            f.p(outputStream0, v2 - v1);
            ++v;
        }
    }

    private static q D(e[] arr_e) {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            f.p(byteArrayOutputStream0, arr_e.length);
            int v = 2;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= arr_e.length) {
                    break;
                }
                e e0 = arr_e[v1];
                f.q(byteArrayOutputStream0, e0.c);
                f.q(byteArrayOutputStream0, e0.d);
                f.q(byteArrayOutputStream0, ((long)e0.g));
                String s = n.j(e0.a, e0.b, p.a);
                int v2 = f.k(s);
                f.p(byteArrayOutputStream0, v2);
                v = v + 14 + v2;
                f.n(byteArrayOutputStream0, s);
            }
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            if(v != arr_b.length) {
                throw f.c(("Expected size " + v + ", does not match actual size " + arr_b.length));
            }
            return new q(g.g, v, arr_b, false);
        }
    }

    static void E(OutputStream outputStream0, byte[] arr_b) {
        outputStream0.write(n.a);
        outputStream0.write(arr_b);
    }

    private static void F(OutputStream outputStream0, e e0) {
        n.I(outputStream0, e0);
        n.C(outputStream0, e0);
        n.H(outputStream0, e0);
    }

    private static void G(OutputStream outputStream0, e e0, String s) {
        f.p(outputStream0, f.k(s));
        f.p(outputStream0, e0.e);
        f.q(outputStream0, ((long)e0.f));
        f.q(outputStream0, e0.c);
        f.q(outputStream0, ((long)e0.g));
        f.n(outputStream0, s);
    }

    private static void H(OutputStream outputStream0, e e0) {
        byte[] arr_b = new byte[n.k(e0.g)];
        for(Object object0: e0.i.entrySet()) {
            int v = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v1 = (int)(((Integer)((Map.Entry)object0).getValue()));
            if((v1 & 2) != 0) {
                n.z(arr_b, 2, v, e0);
            }
            if((v1 & 4) != 0) {
                n.z(arr_b, 4, v, e0);
            }
        }
        outputStream0.write(arr_b);
    }

    private static void I(OutputStream outputStream0, e e0) {
        int v = 0;
        for(Object object0: e0.i.entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object0).getKey()));
            if((((int)(((Integer)((Map.Entry)object0).getValue()))) & 1) != 0) {
                f.p(outputStream0, v1 - v);
                f.p(outputStream0, 0);
                v = v1;
            }
        }
    }

    private static void J(OutputStream outputStream0, e[] arr_e) {
        f.p(outputStream0, arr_e.length);
        for(int v = 0; v < arr_e.length; ++v) {
            e e0 = arr_e[v];
            String s = n.j(e0.a, e0.b, p.e);
            f.p(outputStream0, f.k(s));
            f.p(outputStream0, e0.i.size());
            f.p(outputStream0, e0.h.length);
            f.q(outputStream0, e0.c);
            f.n(outputStream0, s);
            for(Object object0: e0.i.keySet()) {
                f.p(outputStream0, ((int)(((Integer)object0))));
            }
            int[] arr_v = e0.h;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                f.p(outputStream0, arr_v[v1]);
            }
        }
    }

    private static void K(OutputStream outputStream0, e[] arr_e) {
        f.r(outputStream0, arr_e.length);
        for(int v = 0; v < arr_e.length; ++v) {
            e e0 = arr_e[v];
            String s = n.j(e0.a, e0.b, p.d);
            f.p(outputStream0, f.k(s));
            f.p(outputStream0, e0.h.length);
            f.q(outputStream0, ((long)(e0.i.size() * 4)));
            f.q(outputStream0, e0.c);
            f.n(outputStream0, s);
            for(Object object0: e0.i.keySet()) {
                f.p(outputStream0, ((int)(((Integer)object0))));
                f.p(outputStream0, 0);
            }
            int[] arr_v = e0.h;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                f.p(outputStream0, arr_v[v1]);
            }
        }
    }

    private static void L(OutputStream outputStream0, e[] arr_e) {
        byte[] arr_b = n.b(arr_e, p.c);
        f.r(outputStream0, arr_e.length);
        f.m(outputStream0, arr_b);
    }

    private static void M(OutputStream outputStream0, e[] arr_e) {
        byte[] arr_b = n.b(arr_e, p.b);
        f.r(outputStream0, arr_e.length);
        f.m(outputStream0, arr_b);
    }

    private static void N(OutputStream outputStream0, e[] arr_e) {
        n.O(outputStream0, arr_e);
    }

    private static void O(OutputStream outputStream0, e[] arr_e) {
        int v3;
        ArrayList arrayList0 = new ArrayList(3);
        ArrayList arrayList1 = new ArrayList(3);
        arrayList0.add(n.D(arr_e));
        arrayList0.add(n.c(arr_e));
        arrayList0.add(n.d(arr_e));
        long v = ((long)p.a.length) + ((long)n.a.length) + 4L + ((long)(arrayList0.size() * 16));
        f.q(outputStream0, ((long)arrayList0.size()));
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            q q0 = (q)arrayList0.get(v2);
            f.q(outputStream0, q0.a.f());
            f.q(outputStream0, v);
            if(q0.d) {
                byte[] arr_b = f.b(q0.c);
                arrayList1.add(arr_b);
                f.q(outputStream0, ((long)arr_b.length));
                f.q(outputStream0, ((long)q0.c.length));
                v3 = arr_b.length;
            }
            else {
                arrayList1.add(q0.c);
                f.q(outputStream0, ((long)q0.c.length));
                f.q(outputStream0, 0L);
                v3 = q0.c.length;
            }
            v += (long)v3;
        }
        for(int v1 = 0; v1 < arrayList1.size(); ++v1) {
            outputStream0.write(((byte[])arrayList1.get(v1)));
        }
    }

    private static int a(e e0) {
        int v = 0;
        for(Object object0: e0.i.entrySet()) {
            v |= (int)(((Integer)((Map.Entry)object0).getValue()));
        }
        return v;
    }

    private static byte[] b(e[] arr_e, byte[] arr_b) {
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_e.length; ++v1) {
            e e0 = arr_e[v1];
            v2 += f.k(n.j(e0.a, e0.b, arr_b)) + 16 + e0.e * 2 + e0.f + n.k(e0.g);
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(v2);
        if(Arrays.equals(arr_b, p.c)) {
            while(v < arr_e.length) {
                e e1 = arr_e[v];
                n.G(byteArrayOutputStream0, e1, n.j(e1.a, e1.b, arr_b));
                n.F(byteArrayOutputStream0, e1);
                ++v;
            }
        }
        else {
            for(int v3 = 0; v3 < arr_e.length; ++v3) {
                e e2 = arr_e[v3];
                n.G(byteArrayOutputStream0, e2, n.j(e2.a, e2.b, arr_b));
            }
            while(v < arr_e.length) {
                n.F(byteArrayOutputStream0, arr_e[v]);
                ++v;
            }
        }
        if(byteArrayOutputStream0.size() != v2) {
            throw f.c(("The bytes saved do not match expectation. actual=" + byteArrayOutputStream0.size() + " expected=" + v2));
        }
        return byteArrayOutputStream0.toByteArray();
    }

    private static q c(e[] arr_e) {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            int v1 = 0;
            for(int v = 0; true; ++v) {
                if(v >= arr_e.length) {
                    break;
                }
                e e0 = arr_e[v];
                f.p(byteArrayOutputStream0, v);
                f.p(byteArrayOutputStream0, e0.e);
                v1 = v1 + 4 + e0.e * 2;
                n.C(byteArrayOutputStream0, e0);
            }
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            if(v1 != arr_b.length) {
                throw f.c(("Expected size " + v1 + ", does not match actual size " + arr_b.length));
            }
            return new q(g.i, v1, arr_b, true);
        }
    }

    private static q d(e[] arr_e) {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            int v1 = 0;
            for(int v = 0; true; ++v) {
                if(v >= arr_e.length) {
                    break;
                }
                e e0 = arr_e[v];
                int v2 = n.a(e0);
                byte[] arr_b = n.e(e0);
                byte[] arr_b1 = n.f(e0);
                f.p(byteArrayOutputStream0, v);
                int v3 = arr_b.length + 2 + arr_b1.length;
                f.q(byteArrayOutputStream0, ((long)v3));
                f.p(byteArrayOutputStream0, v2);
                byteArrayOutputStream0.write(arr_b);
                byteArrayOutputStream0.write(arr_b1);
                v1 = v1 + 6 + v3;
            }
            byte[] arr_b2 = byteArrayOutputStream0.toByteArray();
            if(v1 != arr_b2.length) {
                throw f.c(("Expected size " + v1 + ", does not match actual size " + arr_b2.length));
            }
            return new q(g.j, v1, arr_b2, true);
        }
    }

    private static byte[] e(e e0) {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            n.H(byteArrayOutputStream0, e0);
            return byteArrayOutputStream0.toByteArray();
        }
    }

    private static byte[] f(e e0) {
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            n.I(byteArrayOutputStream0, e0);
            return byteArrayOutputStream0.toByteArray();
        }
    }

    private static String g(String s, String s1) {
        if("!".equals(s1)) {
            return s.replace(":", "!");
        }
        return ":".equals(s1) ? s.replace("!", ":") : s;
    }

    private static String h(String s) {
        int v = s.indexOf("!");
        if(v < 0) {
            v = s.indexOf(":");
        }
        return v <= 0 ? s : s.substring(v + 1);
    }

    private static e i(e[] arr_e, String s) {
        if(arr_e.length <= 0) {
            return null;
        }
        String s1 = n.h(s);
        for(int v = 0; v < arr_e.length; ++v) {
            if(arr_e[v].b.equals(s1)) {
                return arr_e[v];
            }
        }
        return null;
    }

    private static String j(String s, String s1, byte[] arr_b) {
        String s2 = p.a(arr_b);
        if(s.length() <= 0) {
            return n.g(s1, s2);
        }
        if(s1.equals("classes.dex")) {
            return s;
        }
        if(!s1.contains("!") && !s1.contains(":")) {
            return s1.endsWith(".apk") ? s1 : s + p.a(arr_b) + s1;
        }
        return n.g(s1, s2);
    }

    private static int k(int v) {
        return (v * 2 + 7 & -8) / 8;
    }

    private static int l(int v, int v1, int v2) {
        switch(v) {
            case 1: {
                throw f.c("HOT methods are not stored in the bitmap");
            }
            case 2: {
                return v1;
            }
            case 4: {
                return v1 + v2;
            }
            default: {
                throw f.c(("Unexpected flag: " + v));
            }
        }
    }

    private static int[] m(InputStream inputStream0, int v) {
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += f.h(inputStream0);
            arr_v[v1] = v2;
        }
        return arr_v;
    }

    private static int n(BitSet bitSet0, int v, int v1) {
        int v2 = bitSet0.get(n.l(2, v, v1)) ? 2 : 0;
        return bitSet0.get(n.l(4, v, v1)) ? v2 | 4 : v2;
    }

    static byte[] o(InputStream inputStream0, byte[] arr_b) {
        if(!Arrays.equals(arr_b, f.d(inputStream0, arr_b.length))) {
            throw f.c("Invalid magic");
        }
        return f.d(inputStream0, p.b.length);
    }

    private static void p(InputStream inputStream0, e e0) {
        int v = inputStream0.available() - e0.f;
        int v1 = 0;
        while(inputStream0.available() > v) {
            v1 += f.h(inputStream0);
            e0.i.put(v1, 1);
            for(int v2 = f.h(inputStream0); v2 > 0; --v2) {
                n.A(inputStream0);
            }
        }
        if(inputStream0.available() != v) {
            throw f.c("Read too much data during profile line parse");
        }
    }

    static e[] q(InputStream inputStream0, byte[] arr_b, byte[] arr_b1, e[] arr_e) {
        if(Arrays.equals(arr_b, p.f)) {
            if(Arrays.equals(p.a, arr_b1)) {
                throw f.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return n.r(inputStream0, arr_b, arr_e);
        }
        if(!Arrays.equals(arr_b, p.g)) {
            throw f.c("Unsupported meta version");
        }
        return n.t(inputStream0, arr_b1, arr_e);
    }

    static e[] r(InputStream inputStream0, byte[] arr_b, e[] arr_e) {
        if(!Arrays.equals(arr_b, p.f)) {
            throw f.c("Unsupported meta version");
        }
        int v = f.j(inputStream0);
        long v1 = f.i(inputStream0);
        byte[] arr_b1 = f.e(inputStream0, ((int)f.i(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return n.s(byteArrayInputStream0, v, arr_e);
            }
        }
        throw f.c("Content found after the end of file");
    }

    private static e[] s(InputStream inputStream0, int v, e[] arr_e) {
        if(inputStream0.available() == 0) {
            return new e[0];
        }
        if(v != arr_e.length) {
            throw f.c("Mismatched number of dex files found in metadata");
        }
        String[] arr_s = new String[v];
        int[] arr_v = new int[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = f.h(inputStream0);
            arr_v[v2] = f.h(inputStream0);
            arr_s[v2] = f.f(inputStream0, v3);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = arr_e[v1];
            if(!e0.b.equals(arr_s[v1])) {
                throw f.c("Order of dexfiles in metadata did not match baseline");
            }
            int v4 = arr_v[v1];
            e0.e = v4;
            e0.h = n.m(inputStream0, v4);
        }
        return arr_e;
    }

    static e[] t(InputStream inputStream0, byte[] arr_b, e[] arr_e) {
        int v = f.h(inputStream0);
        long v1 = f.i(inputStream0);
        byte[] arr_b1 = f.e(inputStream0, ((int)f.i(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return n.u(byteArrayInputStream0, arr_b, v, arr_e);
            }
        }
        throw f.c("Content found after the end of file");
    }

    private static e[] u(InputStream inputStream0, byte[] arr_b, int v, e[] arr_e) {
        if(inputStream0.available() == 0) {
            return new e[0];
        }
        if(v != arr_e.length) {
            throw f.c("Mismatched number of dex files found in metadata");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            f.h(inputStream0);
            String s = f.f(inputStream0, f.h(inputStream0));
            long v2 = f.i(inputStream0);
            int v3 = f.h(inputStream0);
            e e0 = n.i(arr_e, s);
            if(e0 == null) {
                throw f.c(("Missing profile key: " + s));
            }
            e0.d = v2;
            int[] arr_v = n.m(inputStream0, v3);
            if(Arrays.equals(arr_b, p.e)) {
                e0.e = v3;
                e0.h = arr_v;
            }
        }
        return arr_e;
    }

    private static void v(InputStream inputStream0, e e0) {
        BitSet bitSet0 = BitSet.valueOf(f.d(inputStream0, (e0.g * 2 + 7 & -8) / 8));
        for(int v = 0; true; ++v) {
            int v1 = e0.g;
            if(v >= v1) {
                break;
            }
            int v2 = n.n(bitSet0, v, v1);
            if(v2 != 0) {
                Integer integer0 = (Integer)e0.i.get(v);
                if(integer0 == null) {
                    integer0 = 0;
                }
                e0.i.put(v, ((int)(v2 | ((int)integer0))));
            }
        }
    }

    static e[] w(InputStream inputStream0, byte[] arr_b, String s) {
        if(!Arrays.equals(arr_b, p.b)) {
            throw f.c("Unsupported version");
        }
        int v = f.j(inputStream0);
        long v1 = f.i(inputStream0);
        byte[] arr_b1 = f.e(inputStream0, ((int)f.i(inputStream0)), ((int)v1));
        if(inputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return n.x(byteArrayInputStream0, s, v);
            }
        }
        throw f.c("Content found after the end of file");
    }

    private static e[] x(InputStream inputStream0, String s, int v) {
        if(inputStream0.available() == 0) {
            return new e[0];
        }
        e[] arr_e = new e[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = f.h(inputStream0);
            int v4 = f.h(inputStream0);
            long v5 = f.i(inputStream0);
            long v6 = f.i(inputStream0);
            long v7 = f.i(inputStream0);
            String s1 = f.f(inputStream0, v3);
            TreeMap treeMap0 = new TreeMap();
            arr_e[v2] = new e(s, s1, v6, 0L, v4, ((int)v5), ((int)v7), new int[v4], treeMap0);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = arr_e[v1];
            n.p(inputStream0, e0);
            e0.h = n.m(inputStream0, e0.e);
            n.v(inputStream0, e0);
        }
        return arr_e;
    }

    private static int y(int v) [...] // Inlined contents

    private static void z(byte[] arr_b, int v, int v1, e e0) {
        int v2 = n.l(v, v1, e0.g);
        arr_b[v2 / 8] = (byte)(1 << v2 % 8 | arr_b[v2 / 8]);
    }
}

