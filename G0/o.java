package g0;

import G3.h;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import jeb.synthetic.FIN;
import m3.F;
import m3.L;
import z3.g;
import z3.k;

public class o {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final void a(k0.g g0) {
            k.e(g0, "database");
            if(g0.W()) {
                g0.A();
                return;
            }
            g0.c();
        }

        public final String b(String s, String s1) {
            k.e(s, "tableName");
            k.e(s1, "triggerType");
            return "`room_table_modification_trigger_" + s + '_' + s1 + '`';
        }
    }

    public static final class b {
        public static final class g0.o.b.a {
            private g0.o.b.a() {
            }

            public g0.o.b.a(g g0) {
            }
        }

        private final long[] a;
        private final boolean[] b;
        private final int[] c;
        private boolean d;
        public static final g0.o.b.a e;

        static {
            b.e = new g0.o.b.a(null);
        }

        public b(int v) {
            this.a = new long[v];
            this.b = new boolean[v];
            this.c = new int[v];
        }

        public final int[] a() {
            int[] arr_v2;
            __monitor_enter(this);
            try {
                if(this.d) {
                    long[] arr_v = this.a;
                    int v = 0;
                    for(int v1 = 0; true; ++v1) {
                        int v2 = 1;
                        if(v >= arr_v.length) {
                            break;
                        }
                        boolean z = Long.compare(arr_v[v], 0L) > 0;
                        boolean[] arr_z = this.b;
                        if(z == arr_z[v1]) {
                            this.c[v1] = 0;
                        }
                        else {
                            int[] arr_v1 = this.c;
                            if(!z) {
                                v2 = 2;
                            }
                            arr_v1[v1] = v2;
                        }
                        arr_z[v1] = z;
                        ++v;
                    }
                    this.d = false;
                    arr_v2 = (int[])this.c.clone();
                    goto label_26;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        label_26:
            __monitor_exit(this);
            return arr_v2;
        label_28:
            __monitor_exit(this);
            return null;
        }

        public final boolean b(int[] arr_v) {
            k.e(arr_v, "tableIds");
            synchronized(this) {
                boolean z = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v2 = arr_v[v1];
                    long v3 = this.a[v2];
                    this.a[v2] = v3 + 1L;
                    if(v3 == 0L) {
                        this.d = true;
                        z = true;
                    }
                }
                return z;
            }
        }

        public final boolean c(int[] arr_v) {
            k.e(arr_v, "tableIds");
            synchronized(this) {
                boolean z = false;
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v2 = arr_v[v1];
                    long v3 = this.a[v2];
                    this.a[v2] = v3 - 1L;
                    if(v3 == 1L) {
                        this.d = true;
                        z = true;
                    }
                }
                return z;
            }
        }

        public final void d() {
            synchronized(this) {
                Arrays.fill(this.b, false);
                this.d = true;
            }
        }
    }

    public static abstract class c {
        private final String[] a;

        public c(String[] arr_s) {
            k.e(arr_s, "tables");
            super();
            this.a = arr_s;
        }

        public final String[] a() {
            return this.a;
        }

        public abstract boolean b();

        public abstract void c(Set arg1);
    }

    public static final class d {
        private final c a;
        private final int[] b;
        private final String[] c;
        private final Set d;

        public d(c o$c0, int[] arr_v, String[] arr_s) {
            k.e(o$c0, "observer");
            k.e(arr_v, "tableIds");
            k.e(arr_s, "tableNames");
            super();
            this.a = o$c0;
            this.b = arr_v;
            this.c = arr_s;
            this.d = arr_s.length == 0 ? L.e() : L.d(arr_s[0]);
            if(arr_v.length != arr_s.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.b;
        }

        public final void b(Set set0) {
            Set set2;
            int v = 0;
            k.e(set0, "invalidatedTablesIds");
            int[] arr_v = this.b;
            switch(arr_v.length) {
                case 0: {
                    set2 = L.e();
                    break;
                }
                case 1: {
                    set2 = set0.contains(((int)arr_v[0])) ? this.d : L.e();
                    break;
                }
                default: {
                    Set set1 = L.b();
                    int[] arr_v1 = this.b;
                    for(int v1 = 0; v < arr_v1.length; ++v1) {
                        if(set0.contains(((int)arr_v1[v]))) {
                            set1.add(this.c[v1]);
                        }
                        ++v;
                    }
                    set2 = L.a(set1);
                }
            }
            if(!set2.isEmpty()) {
                this.a.c(set2);
            }
        }

        public final void c(String[] arr_s) {
            Set set1;
            k.e(arr_s, "tables");
        alab1:
            switch(this.c.length) {
                case 0: {
                    set1 = L.e();
                    break;
                }
                case 1: {
                    int v2 = 0;
                    while(true) {
                        if(v2 < arr_s.length) {
                            if(h.n(arr_s[v2], this.c[0], true)) {
                                set1 = this.d;
                                break alab1;
                            }
                            ++v2;
                            continue;
                        }
                        set1 = L.e();
                        break alab1;
                    }
                }
                default: {
                    Set set0 = L.b();
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s = arr_s[v];
                        String[] arr_s1 = this.c;
                        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                            String s1 = arr_s1[v1];
                            if(h.n(s1, s, true)) {
                                set0.add(s1);
                            }
                        }
                    }
                    set1 = L.a(set0);
                }
            }
            if(!set1.isEmpty()) {
                this.a.c(set1);
            }
        }
    }

    private final u a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final String[] e;
    private g0.c f;
    private final AtomicBoolean g;
    private volatile boolean h;
    private volatile k0.k i;
    private final b j;
    private final m k;
    private final l.b l;
    private r m;
    private final Object n;
    private final Object o;
    public final Runnable p;
    public static final a q;
    private static final String[] r;

    static {
        o.q = new a(null);
        o.r = new String[]{"UPDATE", "DELETE", "INSERT"};
    }

    public o(u u0, Map map0, Map map1, String[] arr_s) {
        public static final class e implements Runnable {
            final o f;

            e(o o0) {
                this.f = o0;
                super();
            }

            private final Set a() {
                Set set0 = L.b();
                Cursor cursor0 = u.y(this.f.e(), new k0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
                try {
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            goto label_10;
                        }
                        set0.add(cursor0.getInt(0));
                    }
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    w3.b.a(cursor0, throwable0);
                    throw throwable1;
                }
            label_10:
                w3.b.a(cursor0, null);
                Set set1 = L.a(set0);
                if(!set1.isEmpty()) {
                    if(this.f.d() == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    k0.k k0 = this.f.d();
                    if(k0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    k0.m();
                    return set1;
                }
                return set1;
            }

            @Override
            public void run() {
                Set set0;
                Lock lock0 = this.f.e().k();
                lock0.lock();
                try {
                    try {
                        if(this.f.c()) {
                            if(this.f.g().compareAndSet(true, false)) {
                                if(!this.f.e().q()) {
                                    k0.g g0 = this.f.e().m().G();
                                    g0.A();
                                    try {
                                        set0 = this.a();
                                        g0.y();
                                    }
                                    finally {
                                        g0.I();
                                    }
                                    goto label_36;
                                }
                                goto label_54;
                            }
                            goto label_59;
                        }
                        goto label_64;
                    }
                    catch(IllegalStateException illegalStateException0) {
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_23;
                    }
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
                    set0 = L.e();
                }
                catch(Throwable throwable0) {
                    goto label_31;
                }
                lock0.unlock();
                g0.c c0 = this.f.f;
                if(c0 != null) {
                    c0.e();
                    goto label_40;
                    try {
                    label_23:
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
                        set0 = L.e();
                    }
                    catch(Throwable throwable0) {
                        goto label_31;
                    }
                    lock0.unlock();
                    c0 = this.f.f;
                    if(c0 != null) {
                        c0.e();
                        goto label_40;
                    label_31:
                        lock0.unlock();
                        g0.c c1 = this.f.f;
                        if(c1 != null) {
                            c1.e();
                        }
                        throw throwable0;
                    label_36:
                        lock0.unlock();
                        c0 = this.f.f;
                        if(c0 != null) {
                            c0.e();
                        }
                    }
                }
            label_40:
                if(!set0.isEmpty()) {
                    synchronized(this.f.f()) {
                        for(Object object0: this.f.f()) {
                            ((d)((Map.Entry)object0).getValue()).b(set0);
                        }
                    }
                    return;
                }
                return;
            label_54:
                lock0.unlock();
                g0.c c2 = this.f.f;
                if(c2 != null) {
                    c2.e();
                }
                return;
            label_59:
                lock0.unlock();
                g0.c c3 = this.f.f;
                if(c3 != null) {
                    c3.e();
                }
                return;
            label_64:
                lock0.unlock();
                g0.c c4 = this.f.f;
                if(c4 != null) {
                    c4.e();
                }
            }
        }

        k.e(u0, "database");
        String s3;
        k.e(map0, "shadowTablesMap");
        k.e(map1, "viewTables");
        k.e(arr_s, "tableNames");
        super();
        this.a = u0;
        this.b = map0;
        this.c = map1;
        this.g = new AtomicBoolean(false);
        this.j = new b(arr_s.length);
        this.k = new m(u0);
        this.l = new l.b();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        String[] arr_s1 = new String[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            k.d(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            k.d(s1, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(s1, v);
            String s2 = (String)this.b.get(arr_s[v]);
            if(s2 == null) {
                s3 = null;
            }
            else {
                k.d(locale0, "US");
                s3 = s2.toLowerCase(locale0);
                k.d(s3, "this as java.lang.String).toLowerCase(locale)");
            }
            if(s3 != null) {
                s1 = s3;
            }
            arr_s1[v] = s1;
        }
        this.e = arr_s1;
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s4 = (String)map$Entry0.getValue();
            Locale locale1 = Locale.US;
            k.d(locale1, "US");
            String s5 = s4.toLowerCase(locale1);
            k.d(s5, "this as java.lang.String).toLowerCase(locale)");
            if(this.d.containsKey(s5)) {
                String s6 = (String)map$Entry0.getKey();
                k.d(locale1, "US");
                String s7 = s6.toLowerCase(locale1);
                k.d(s7, "this as java.lang.String).toLowerCase(locale)");
                Object object1 = F.i(this.d, s5);
                this.d.put(s7, object1);
            }
        }
        this.p = new e(this);
    }

    public void b(c o$c0) {
        k.e(o$c0, "observer");
        String[] arr_s = this.n(o$c0.a());
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            k.d(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            k.d(s1, "this as java.lang.String).toLowerCase(locale)");
            Integer integer0 = (Integer)this.d.get(s1);
            if(integer0 == null) {
                throw new IllegalArgumentException("There is no table with name " + s);
            }
            arrayList0.add(integer0);
        }
        int[] arr_v = m3.o.E(arrayList0);
        d o$d0 = new d(o$c0, arr_v, arr_s);
        synchronized(this.l) {
            d o$d1 = (d)this.l.i(o$c0, o$d0);
        }
        if(o$d1 == null) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.j.b(arr_v1)) {
                this.s();
            }
        }
    }

    public final boolean c() {
        if(!this.a.w()) {
            return false;
        }
        if(!this.h) {
            this.a.m().G();
        }
        if(!this.h) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final k0.k d() {
        return this.i;
    }

    public final u e() {
        return this.a;
    }

    public final l.b f() {
        return this.l;
    }

    public final AtomicBoolean g() {
        return this.g;
    }

    public final Map h() {
        return this.d;
    }

    public final void i(k0.g g0) {
        k.e(g0, "database");
        synchronized(this.o) {
            if(this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            g0.k("PRAGMA temp_store = MEMORY;");
            g0.k("PRAGMA recursive_triggers=\'ON\';");
            g0.k("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            this.t(g0);
            this.i = g0.n("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
        }
    }

    public final void j(String[] arr_s) {
        k.e(arr_s, "tables");
        synchronized(this.l) {
            for(Object object0: this.l) {
                k.d(((Map.Entry)object0), "(observer, wrapper)");
                c o$c0 = (c)((Map.Entry)object0).getKey();
                d o$d0 = (d)((Map.Entry)object0).getValue();
                if(!o$c0.b()) {
                    o$d0.c(arr_s);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    public final void k() [...]

    public void l() {
        if(this.g.compareAndSet(false, true)) {
            g0.c c0 = this.f;
            if(c0 != null) {
                c0.j();
            }
            this.a.n().execute(this.p);
        }
    }

    public void m(c o$c0) {
        d o$d0;
        k.e(o$c0, "observer");
        synchronized(this.l) {
            o$d0 = (d)this.l.k(o$c0);
        }
        if(o$d0 != null) {
            int[] arr_v = o$d0.a();
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.j.c(arr_v1)) {
                this.s();
            }
        }
    }

    private final String[] n(String[] arr_s) {
        Set set0 = L.b();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Locale locale0 = Locale.US;
            k.d(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            k.d(s1, "this as java.lang.String).toLowerCase(locale)");
            if(this.c.containsKey(s1)) {
                k.d(locale0, "US");
                String s2 = s.toLowerCase(locale0);
                k.d(s2, "this as java.lang.String).toLowerCase(locale)");
                Object object0 = this.c.get(s2);
                k.b(object0);
                set0.addAll(((Collection)object0));
            }
            else {
                set0.add(s);
            }
        }
        Object[] arr_object = L.a(set0).toArray(new String[0]);
        k.c(arr_object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[])arr_object;
    }

    public final void o(g0.c c0) {
        k.e(c0, "autoCloser");
        this.f = c0;
        c0.m(() -> synchronized(this.o) {
            this.h = false;
            this.j.d();
        });
    }

    public final void p(Context context0, String s, Intent intent0) {
        k.e(context0, "context");
        k.e(s, "name");
        k.e(intent0, "serviceIntent");
        this.m = new r(context0, s, intent0, this, this.a.n());
    }

    private final void q(k0.g g0, int v) {
        g0.k("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + v + ", 0)");
        String s = this.e[v];
        String[] arr_s = o.r;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = arr_s[v1];
            String s2 = "CREATE TEMP TRIGGER IF NOT EXISTS " + o.q.b(s, s1) + " AFTER " + s1 + " ON `" + s + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + v + " AND " + "invalidated" + " = 0" + "; END";
            k.d(s2, "StringBuilder().apply(builderAction).toString()");
            g0.k(s2);
        }
    }

    private final void r(k0.g g0, int v) {
        String s = this.e[v];
        String[] arr_s = o.r;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = "DROP TRIGGER IF EXISTS " + o.q.b(s, arr_s[v1]);
            k.d(s1, "StringBuilder().apply(builderAction).toString()");
            g0.k(s1);
        }
    }

    public final void s() {
        if(!this.a.w()) {
            return;
        }
        this.t(this.a.m().G());
    }

    public final void t(k0.g g0) {
        int v;
        Lock lock0;
        k.e(g0, "database");
        if(g0.T()) {
            return;
        }
        try {
            lock0 = this.a.k();
            lock0.lock();
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_40;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_43;
        }
        try {
            Object object0 = this.n;
            __monitor_enter(object0);
            v = FIN.finallyOpen$NT();
            int[] arr_v = this.j.a();
            if(arr_v != null) {
                o.q.a(g0);
                try {
                    int v2 = 0;
                    for(int v3 = 0; v2 < arr_v.length; ++v3) {
                        switch(arr_v[v2]) {
                            case 1: {
                                this.q(g0, v3);
                                break;
                            }
                            case 2: {
                                this.r(g0, v3);
                            }
                        }
                        ++v2;
                    }
                    g0.y();
                }
                finally {
                    g0.I();
                }
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                goto label_30;
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        try {
        label_30:
            lock0.unlock();
            return;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_40;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_43;
        }
        try {
        label_32:
            FIN.finallyExec$NT(v);
            goto label_37;
        }
        catch(Throwable throwable0) {
            try {
            label_35:
                lock0.unlock();
                throw throwable0;
            label_37:
                lock0.unlock();
                return;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(SQLiteException sQLiteException0) {
                goto label_43;
            }
        }
    label_40:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
        return;
    label_43:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
    }
}

