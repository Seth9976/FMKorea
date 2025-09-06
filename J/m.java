package J;

import I3.I;
import I3.u;
import I3.w;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l3.h;
import l3.i;
import l3.o;
import p3.j;
import y3.p;
import z3.g;
import z3.k;
import z3.s;

public final class m implements f {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final Set a() {
            return m.l;
        }

        public final Object b() {
            return m.m;
        }
    }

    static abstract class b {
        public static final class J.m.b.a extends b {
            private final n a;

            public J.m.b.a(n n0) {
                super(null);
                this.a = n0;
            }

            public n a() {
                return this.a;
            }
        }

        public static final class J.m.b.b extends b {
            private final p a;
            private final u b;
            private final n c;
            private final j d;

            public J.m.b.b(p p0, u u0, n n0, j j0) {
                k.e(p0, "transform");
                k.e(u0, "ack");
                k.e(j0, "callerContext");
                super(null);
                this.a = p0;
                this.b = u0;
                this.c = n0;
                this.d = j0;
            }

            public final u a() {
                return this.b;
            }

            public final j b() {
                return this.d;
            }

            public n c() {
                return this.c;
            }

            public final p d() {
                return this.a;
            }
        }

        private b() {
        }

        public b(g g0) {
        }
    }

    static final class c extends OutputStream {
        private final FileOutputStream f;

        public c(FileOutputStream fileOutputStream0) {
            k.e(fileOutputStream0, "fileOutputStream");
            super();
            this.f = fileOutputStream0;
        }

        @Override
        public void close() {
        }

        @Override
        public void flush() {
            this.f.flush();
        }

        @Override
        public void write(int v) {
            this.f.write(v);
        }

        @Override
        public void write(byte[] arr_b) {
            k.e(arr_b, "b");
            this.f.write(arr_b);
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) {
            k.e(arr_b, "bytes");
            this.f.write(arr_b, v, v1);
        }
    }

    private final y3.a a;
    private final J.k b;
    private final J.b c;
    private final I d;
    private final L3.b e;
    private final String f;
    private final h g;
    private final L3.j h;
    private List i;
    private final l j;
    public static final a k;
    private static final Set l;
    private static final Object m;

    static {
        m.k = new a(null);
        m.l = new LinkedHashSet();
        m.m = new Object();
    }

    public m(y3.a a0, J.k k0, List list0, J.b b0, I i0) {
        static final class d extends z3.l implements y3.l {
            final m g;

            d(m m0) {
                this.g = m0;
                super(1);
            }

            public final void b(Throwable throwable0) {
                if(throwable0 != null) {
                    this.g.h.setValue(new J.h(throwable0));
                }
                synchronized(m.k.b()) {
                    m.k.a().remove(this.g.q().getAbsolutePath());
                }
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((Throwable)object0));
                return l3.u.a;
            }
        }


        static final class e extends z3.l implements p {
            public static final e g;

            static {
                e.g = new e();
            }

            e() {
                super(2);
            }

            public final void b(b m$b0, Throwable throwable0) {
                k.e(m$b0, "msg");
                if(m$b0 instanceof J.m.b.b) {
                    u u0 = ((J.m.b.b)m$b0).a();
                    if(throwable0 == null) {
                        throwable0 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    u0.Q(throwable0);
                }
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                this.b(((b)object0), ((Throwable)object1));
                return l3.u.a;
            }
        }


        static final class J.m.f extends r3.k implements p {
            int j;
            Object k;
            final m l;

            J.m.f(m m0, p3.f f0) {
                this.l = m0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((b)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                p3.f f1 = new J.m.f(this.l, f0);
                f1.k = object0;
                return f1;
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                Object object1 = q3.b.c();
                switch(this.j) {
                    case 0: {
                        o.b(object0);
                        b m$b0 = (b)this.k;
                        if(m$b0 instanceof J.m.b.a) {
                            this.j = 1;
                            if(this.l.r(((J.m.b.a)m$b0), this) == object1) {
                                return object1;
                            }
                        }
                        else if(m$b0 instanceof J.m.b.b) {
                            this.j = 2;
                            if(this.l.s(((J.m.b.b)m$b0), this) == object1) {
                                return object1;
                            }
                        }
                        return l3.u.a;
                    }
                    case 1: 
                    case 2: {
                        o.b(object0);
                        return l3.u.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            public final Object w(b m$b0, p3.f f0) {
                return ((J.m.f)this.q(m$b0, f0)).t(l3.u.a);
            }
        }


        static final class J.m.g extends r3.k implements p {
            int j;
            private Object k;
            final m l;

            J.m.g(m m0, p3.f f0) {
                this.l = m0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((L3.c)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                p3.f f1 = new J.m.g(this.l, f0);
                f1.k = object0;
                return f1;
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                static final class J.m.g.a extends r3.k implements p {
                    int j;
                    Object k;
                    final n l;

                    J.m.g.a(n n0, p3.f f0) {
                        this.l = n0;
                        super(2, f0);
                    }

                    @Override  // y3.p
                    public Object k(Object object0, Object object1) {
                        return this.w(((n)object0), ((p3.f)object1));
                    }

                    @Override  // r3.a
                    public final p3.f q(Object object0, p3.f f0) {
                        p3.f f1 = new J.m.g.a(this.l, f0);
                        f1.k = object0;
                        return f1;
                    }

                    @Override  // r3.a
                    public final Object t(Object object0) {
                        if(this.j != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        o.b(object0);
                        return r3.b.a(!(this.l instanceof J.c) && !(this.l instanceof J.h) && ((n)this.k) == this.l);
                    }

                    public final Object w(n n0, p3.f f0) {
                        return ((J.m.g.a)this.q(n0, f0)).t(l3.u.a);
                    }
                }


                public static final class J.m.g.b implements L3.b {
                    final L3.b f;

                    public J.m.g.b(L3.b b0) {
                        this.f = b0;
                        super();
                    }

                    @Override  // L3.b
                    public Object a(L3.c c0, p3.f f0) {
                        public static final class J.m.g.b.a implements L3.c {
                            final L3.c f;

                            public J.m.g.b.a(L3.c c0) {
                                this.f = c0;
                                super();
                            }

                            @Override  // L3.c
                            public Object l(Object object0, p3.f f0) {
                                public static final class J.m.g.b.a.a extends r3.d {
                                    Object i;
                                    int j;
                                    final J.m.g.b.a k;

                                    public J.m.g.b.a.a(J.m.g.b.a m$g$b$a0, p3.f f0) {
                                        this.k = m$g$b$a0;
                                        super(f0);
                                    }

                                    @Override  // r3.a
                                    public final Object t(Object object0) {
                                        this.i = object0;
                                        this.j |= 0x80000000;
                                        return this.k.l(null, this);
                                    }
                                }

                                J.m.g.b.a.a m$g$b$a$a0;
                                if(f0 instanceof J.m.g.b.a.a) {
                                    m$g$b$a$a0 = (J.m.g.b.a.a)f0;
                                    int v = m$g$b$a$a0.j;
                                    if((v & 0x80000000) == 0) {
                                        m$g$b$a$a0 = new J.m.g.b.a.a(this, f0);
                                    }
                                    else {
                                        m$g$b$a$a0.j = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    m$g$b$a$a0 = new J.m.g.b.a.a(this, f0);
                                }
                                Object object1 = m$g$b$a$a0.i;
                                Object object2 = q3.b.c();
                                switch(m$g$b$a$a0.j) {
                                    case 0: {
                                        o.b(object1);
                                        L3.c c0 = this.f;
                                        if(((n)object0) instanceof J.j) {
                                            throw ((J.j)(((n)object0))).a();
                                        }
                                        if(((n)object0) instanceof J.h) {
                                            throw ((J.h)(((n)object0))).a();
                                        }
                                        if(((n)object0) instanceof J.c) {
                                            Object object3 = ((J.c)(((n)object0))).b();
                                            m$g$b$a$a0.j = 1;
                                            return c0.l(object3, m$g$b$a$a0) == object2 ? object2 : l3.u.a;
                                        }
                                        if(!(((n)object0) instanceof J.o)) {
                                            throw new l3.l();
                                        }
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    case 1: {
                                        o.b(object1);
                                        return l3.u.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        }

                        J.m.g.b.a m$g$b$a0 = new J.m.g.b.a(c0);
                        Object object0 = this.f.a(m$g$b$a0, f0);
                        return object0 == q3.b.c() ? object0 : l3.u.a;
                    }
                }

                Object object1 = q3.b.c();
                switch(this.j) {
                    case 0: {
                        o.b(object0);
                        L3.c c0 = (L3.c)this.k;
                        n n0 = (n)this.l.h.getValue();
                        if(!(n0 instanceof J.c)) {
                            this.l.j.e(new J.m.b.a(n0));
                        }
                        J.m.g.a m$g$a0 = new J.m.g.a(n0, null);
                        J.m.g.b m$g$b0 = new J.m.g.b(L3.d.a(this.l.h, m$g$a0));
                        this.j = 1;
                        return L3.d.b(c0, m$g$b0, this) == object1 ? object1 : l3.u.a;
                    }
                    case 1: {
                        o.b(object0);
                        return l3.u.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            public final Object w(L3.c c0, p3.f f0) {
                return ((J.m.g)this.q(c0, f0)).t(l3.u.a);
            }
        }


        static final class J.m.h extends z3.l implements y3.a {
            final m g;

            J.m.h(m m0) {
                this.g = m0;
                super(0);
            }

            @Override  // y3.a
            public Object a() {
                return this.b();
            }

            public final File b() {
                File file0 = (File)this.g.a.a();
                String s = file0.getAbsolutePath();
                a m$a0 = m.k;
                synchronized(m$a0.b()) {
                    if(!m$a0.a().contains(s)) {
                        Set set0 = m$a0.a();
                        k.d(s, "it");
                        set0.add(s);
                        return file0;
                    }
                }
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file0 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }

        k.e(a0, "produceFile");
        k.e(k0, "serializer");
        k.e(list0, "initTasksList");
        k.e(b0, "corruptionHandler");
        k.e(i0, "scope");
        super();
        this.a = a0;
        this.b = k0;
        this.c = b0;
        this.d = i0;
        this.e = L3.d.e(new J.m.g(this, null));
        this.f = ".tmp";
        this.g = i.a(new J.m.h(this));
        this.h = L3.m.a(J.o.a);
        this.i = m3.o.F(list0);
        d m$d0 = new d(this);
        J.m.f m$f0 = new J.m.f(this, null);
        this.j = new l(i0, m$d0, e.g, m$f0);
    }

    @Override  // J.f
    public Object a(p p0, p3.f f0) {
        u u0 = w.b(null, 1, null);
        J.m.b.b m$b$b0 = new J.m.b.b(p0, u0, ((n)this.h.getValue()), f0.getContext());
        this.j.e(m$b$b0);
        return u0.K(f0);
    }

    @Override  // J.f
    public L3.b getData() {
        return this.e;
    }

    private final void p(File file0) {
        File file1 = file0.getCanonicalFile().getParentFile();
        if(file1 != null) {
            file1.mkdirs();
            if(!file1.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file0);
            }
        }
    }

    private final File q() {
        return (File)this.g.getValue();
    }

    private final Object r(J.m.b.a m$b$a0, p3.f f0) {
        n n0 = (n)this.h.getValue();
        if(!(n0 instanceof J.c)) {
            if(!(n0 instanceof J.j)) {
                if(k.a(n0, J.o.a)) {
                    Object object1 = this.v(f0);
                    return object1 == q3.b.c() ? object1 : l3.u.a;
                }
                if(n0 instanceof J.h) {
                    throw new IllegalStateException("Can\'t read in final state.");
                }
            }
            else if(n0 == m$b$a0.a()) {
                Object object0 = this.v(f0);
                return object0 == q3.b.c() ? object0 : l3.u.a;
            }
        }
        return l3.u.a;
    }

    private final Object s(J.m.b.b m$b$b0, p3.f f0) {
        static final class J.m.i extends r3.d {
            Object i;
            Object j;
            Object k;
            Object l;
            final m m;
            int n;

            J.m.i(m m0, p3.f f0) {
                this.m = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.s(null, this);
            }
        }

        Object object3;
        u u1;
        m m0;
        Object object2;
        u u0;
        J.m.i m$i0;
        if(f0 instanceof J.m.i) {
            m$i0 = (J.m.i)f0;
            int v = m$i0.n;
            if((v & 0x80000000) == 0) {
                m$i0 = new J.m.i(this, f0);
            }
            else {
                m$i0.n = v ^ 0x80000000;
            }
        }
        else {
            m$i0 = new J.m.i(this, f0);
        }
        Object object0 = m$i0.l;
        Object object1 = q3.b.c();
        boolean z = true;
        switch(m$i0.n) {
            case 0: {
                o.b(object0);
                u0 = m$b$b0.a();
                try {
                    n n0 = (n)this.h.getValue();
                    if(n0 instanceof J.c) {
                        m$i0.i = u0;
                        m$i0.n = 1;
                        object2 = this.y(m$b$b0.d(), m$b$b0.b(), m$i0);
                        if(object2 == object1) {
                            return object1;
                        }
                    }
                    else {
                        if(!(n0 instanceof J.j)) {
                            z = n0 instanceof J.o;
                        }
                        if(!z) {
                            if(!(n0 instanceof J.h)) {
                                throw new l3.l();
                            }
                            throw ((J.h)n0).a();
                        }
                        if(n0 != m$b$b0.c()) {
                            throw ((J.j)n0).a();
                        }
                        m$i0.i = m$b$b0;
                        m$i0.j = this;
                        m$i0.k = u0;
                        m$i0.n = 2;
                        if(this.u(m$i0) == object1) {
                            return object1;
                        }
                        m0 = this;
                        goto label_47;
                    }
                    goto label_54;
                }
                catch(Throwable throwable0) {
                    goto label_58;
                }
            }
            case 1: {
                u1 = (u)m$i0.i;
                goto label_62;
            }
            case 2: {
                u1 = (u)m$i0.k;
                m0 = (m)m$i0.j;
                J.m.b.b m$b$b1 = (J.m.b.b)m$i0.i;
                try {
                    o.b(object0);
                    u0 = u1;
                    m$b$b0 = m$b$b1;
                }
                catch(Throwable throwable1) {
                    break;
                }
                try {
                label_47:
                    m$i0.i = u0;
                    m$i0.j = null;
                    m$i0.k = null;
                    m$i0.n = 3;
                    object2 = m0.y(m$b$b0.d(), m$b$b0.b(), m$i0);
                    if(object2 == object1) {
                        return object1;
                    }
                label_54:
                    object0 = object2;
                    u1 = u0;
                    goto label_63;
                }
                catch(Throwable throwable0) {
                label_58:
                    throwable1 = throwable0;
                    u1 = u0;
                    break;
                }
            }
            case 3: {
                u1 = (u)m$i0.i;
                try {
                label_62:
                    o.b(object0);
                label_63:
                    object3 = object0;
                    goto label_67;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object3 = l3.n.a(o.a(throwable1));
    label_67:
        w.c(u1, object3);
        return l3.u.a;
    }

    private final Object t(p3.f f0) {
        static final class J.m.j extends r3.d {
            Object i;
            Object j;
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            final m p;
            int q;

            J.m.j(m m0, p3.f f0) {
                this.p = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.o = object0;
                this.q |= 0x80000000;
                return this.p.t(this);
            }
        }


        public static final class J.m.k implements J.i {
            final R3.a a;
            final s b;
            final z3.u c;
            final m d;

            J.m.k(R3.a a0, s s0, z3.u u0, m m0) {
                this.a = a0;
                this.b = s0;
                this.c = u0;
                this.d = m0;
                super();
            }

            @Override  // J.i
            public Object a(p p0, p3.f f0) {
                static final class J.m.k.a extends r3.d {
                    Object i;
                    Object j;
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    final J.m.k o;
                    int p;

                    J.m.k.a(J.m.k m$k0, p3.f f0) {
                        this.o = m$k0;
                        super(f0);
                    }

                    @Override  // r3.a
                    public final Object t(Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return this.o.a(null, this);
                    }
                }

                Object object4;
                m m2;
                R3.a a3;
                R3.a a2;
                Object object2;
                z3.u u1;
                s s1;
                m m0;
                R3.a a0;
                J.m.k.a m$k$a0;
                if(f0 instanceof J.m.k.a) {
                    m$k$a0 = (J.m.k.a)f0;
                    int v = m$k$a0.p;
                    if((v & 0x80000000) == 0) {
                        m$k$a0 = new J.m.k.a(this, f0);
                    }
                    else {
                        m$k$a0.p = v ^ 0x80000000;
                    }
                }
                else {
                    m$k$a0 = new J.m.k.a(this, f0);
                }
                Object object0 = m$k$a0.n;
                Object object1 = q3.b.c();
                switch(m$k$a0.p) {
                    case 0: {
                        o.b(object0);
                        a0 = this.a;
                        s s0 = this.b;
                        z3.u u0 = this.c;
                        m0 = this.d;
                        m$k$a0.i = p0;
                        m$k$a0.j = a0;
                        m$k$a0.k = s0;
                        m$k$a0.l = u0;
                        m$k$a0.m = m0;
                        m$k$a0.p = 1;
                        if(a0.c(null, m$k$a0) == object1) {
                            return object1;
                        }
                        s1 = s0;
                        u1 = u0;
                        goto label_38;
                    }
                    case 1: {
                        m m1 = (m)m$k$a0.m;
                        u1 = (z3.u)m$k$a0.l;
                        s1 = (s)m$k$a0.k;
                        R3.a a1 = (R3.a)m$k$a0.j;
                        p p1 = (p)m$k$a0.i;
                        o.b(object0);
                        a0 = a1;
                        m0 = m1;
                        p0 = p1;
                        try {
                        label_38:
                            if(s1.f) {
                                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                            }
                            m$k$a0.i = a0;
                            m$k$a0.j = u1;
                            m$k$a0.k = m0;
                            m$k$a0.l = null;
                            m$k$a0.m = null;
                            m$k$a0.p = 2;
                            object2 = p0.k(u1.f, m$k$a0);
                        }
                        catch(Throwable throwable0) {
                            a2 = a0;
                            break;
                        }
                        if(object2 == object1) {
                            return object1;
                        }
                        a3 = a0;
                        object0 = object2;
                        m2 = m0;
                        goto label_61;
                    }
                    case 2: {
                        m2 = (m)m$k$a0.k;
                        u1 = (z3.u)m$k$a0.j;
                        a3 = (R3.a)m$k$a0.i;
                        try {
                            o.b(object0);
                        label_61:
                            if(k.a(object0, u1.f)) {
                                a2 = a3;
                            }
                            else {
                                m$k$a0.i = a3;
                                m$k$a0.j = u1;
                                m$k$a0.k = object0;
                                m$k$a0.p = 3;
                                if(m2.z(object0, m$k$a0) == object1) {
                                    return object1;
                                }
                                a2 = a3;
                                u1.f = object0;
                            }
                            object4 = u1.f;
                            goto label_88;
                        }
                        catch(Throwable throwable0) {
                            a2 = a3;
                            break;
                        }
                        return object1;
                    }
                    case 3: {
                        Object object3 = m$k$a0.k;
                        z3.u u2 = (z3.u)m$k$a0.j;
                        a2 = (R3.a)m$k$a0.i;
                        try {
                            o.b(object0);
                            u2.f = object3;
                            u1 = u2;
                            object4 = u1.f;
                            goto label_88;
                        }
                        catch(Throwable throwable0) {
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a2.b(null);
                throw throwable0;
            label_88:
                a2.b(null);
                return object4;
            }
        }

        R3.a a2;
        z3.u u3;
        Iterator iterator0;
        s s2;
        R3.a a1;
        J.m.k m$k1;
        z3.u u2;
        m m2;
        m m1;
        J.m.j m$j1;
        s s1;
        z3.u u1;
        m m0;
        z3.u u0;
        R3.a a0;
        J.m.j m$j0;
        if(f0 instanceof J.m.j) {
            m$j0 = (J.m.j)f0;
            int v = m$j0.q;
            if((v & 0x80000000) == 0) {
                m$j0 = new J.m.j(this, f0);
            }
            else {
                m$j0.q = v ^ 0x80000000;
            }
        }
        else {
            m$j0 = new J.m.j(this, f0);
        }
        Object object0 = m$j0.o;
        Object object1 = q3.b.c();
        int v1 = 0;
        switch(m$j0.q) {
            case 0: {
                o.b(object0);
                if(!k.a(this.h.getValue(), J.o.a) && !(this.h.getValue() instanceof J.j)) {
                    throw new IllegalStateException("Check failed.");
                }
                a0 = R3.c.b(false, 1, null);
                u0 = new z3.u();
                m$j0.i = this;
                m$j0.j = a0;
                m$j0.k = u0;
                m$j0.l = u0;
                m$j0.q = 1;
                object0 = this.x(m$j0);
                if(object0 == object1) {
                    return object1;
                }
                m0 = this;
                u1 = u0;
                goto label_35;
            }
            case 1: {
                u0 = (z3.u)m$j0.l;
                u1 = (z3.u)m$j0.k;
                a0 = (R3.a)m$j0.j;
                m0 = (m)m$j0.i;
                o.b(object0);
            label_35:
                u0.f = object0;
                s s0 = new s();
                J.m.k m$k0 = new J.m.k(a0, s0, u1, m0);
                List list0 = m0.i;
                if(list0 == null) {
                    s1 = s0;
                    m$j1 = m$j0;
                    m1 = m0;
                }
                else {
                    m2 = m0;
                    u2 = u1;
                    m$k1 = m$k0;
                    a1 = a0;
                    s2 = s0;
                    iterator0 = list0.iterator();
                    goto label_58;
                }
                goto label_75;
            }
            case 2: {
                iterator0 = (Iterator)m$j0.n;
                m$k1 = (J.m.k)m$j0.m;
                s2 = (s)m$j0.l;
                u2 = (z3.u)m$j0.k;
                a1 = (R3.a)m$j0.j;
                m2 = (m)m$j0.i;
                o.b(object0);
            label_58:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    m$j0.i = m2;
                    m$j0.j = a1;
                    m$j0.k = u2;
                    m$j0.l = s2;
                    m$j0.m = m$k1;
                    m$j0.n = iterator0;
                    m$j0.q = 2;
                    if(((p)object2).k(m$k1, m$j0) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                m$j1 = m$j0;
                s1 = s2;
                u1 = u2;
                a0 = a1;
                m1 = m2;
            label_75:
                m1.i = null;
                m$j1.i = m1;
                m$j1.j = u1;
                m$j1.k = s1;
                m$j1.l = a0;
                m$j1.m = null;
                m$j1.n = null;
                m$j1.q = 3;
                if(a0.c(null, m$j1) == object1) {
                    return object1;
                }
                u3 = u1;
                a2 = a0;
                break;
            }
            case 3: {
                a2 = (R3.a)m$j0.l;
                s1 = (s)m$j0.k;
                u3 = (z3.u)m$j0.j;
                m1 = (m)m$j0.i;
                o.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        s1.f = true;
        a2.b(null);
        L3.j j0 = m1.h;
        Object object3 = u3.f;
        if(object3 != null) {
            v1 = object3.hashCode();
        }
        j0.setValue(new J.c(object3, v1));
        return l3.u.a;
    }

    private final Object u(p3.f f0) {
        static final class J.m.l extends r3.d {
            Object i;
            Object j;
            final m k;
            int l;

            J.m.l(m m0, p3.f f0) {
                this.k = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.j = object0;
                this.l |= 0x80000000;
                return this.k.u(this);
            }
        }

        m m0;
        J.m.l m$l0;
        if(f0 instanceof J.m.l) {
            m$l0 = (J.m.l)f0;
            int v = m$l0.l;
            if((v & 0x80000000) == 0) {
                m$l0 = new J.m.l(this, f0);
            }
            else {
                m$l0.l = v ^ 0x80000000;
            }
        }
        else {
            m$l0 = new J.m.l(this, f0);
        }
        Object object0 = m$l0.j;
        Object object1 = q3.b.c();
        switch(m$l0.l) {
            case 0: {
                o.b(object0);
                try {
                    m$l0.i = this;
                    m$l0.l = 1;
                    if(this.t(m$l0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    m0 = this;
                    goto label_27;
                }
                return l3.u.a;
            }
            case 1: {
                m0 = (m)m$l0.i;
                try {
                    o.b(object0);
                    return l3.u.a;
                }
                catch(Throwable throwable0) {
                }
            label_27:
                J.j j0 = new J.j(throwable0);
                m0.h.setValue(j0);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object v(p3.f f0) {
        static final class J.m.m extends r3.d {
            Object i;
            Object j;
            final m k;
            int l;

            J.m.m(m m0, p3.f f0) {
                this.k = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.j = object0;
                this.l |= 0x80000000;
                return this.k.v(this);
            }
        }

        m m0;
        J.m.m m$m0;
        if(f0 instanceof J.m.m) {
            m$m0 = (J.m.m)f0;
            int v = m$m0.l;
            if((v & 0x80000000) == 0) {
                m$m0 = new J.m.m(this, f0);
            }
            else {
                m$m0.l = v ^ 0x80000000;
            }
        }
        else {
            m$m0 = new J.m.m(this, f0);
        }
        Object object0 = m$m0.j;
        Object object1 = q3.b.c();
        switch(m$m0.l) {
            case 0: {
                o.b(object0);
                try {
                    m$m0.i = this;
                    m$m0.l = 1;
                    return this.t(m$m0) == object1 ? object1 : l3.u.a;
                }
                catch(Throwable throwable0) {
                    m0 = this;
                }
            label_25:
                J.j j0 = new J.j(throwable0);
                m0.h.setValue(j0);
                return l3.u.a;
            }
            case 1: {
                m0 = (m)m$m0.i;
                try {
                    o.b(object0);
                    return l3.u.a;
                }
                catch(Throwable throwable0) {
                    goto label_25;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object w(p3.f f0) {
        static final class J.m.n extends r3.d {
            Object i;
            Object j;
            Object k;
            Object l;
            final m m;
            int n;

            J.m.n(m m0, p3.f f0) {
                this.m = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.w(this);
            }
        }

        Throwable throwable1;
        m m0;
        Closeable closeable0;
        J.m.n m$n0;
        if(f0 instanceof J.m.n) {
            m$n0 = (J.m.n)f0;
            int v = m$n0.n;
            if((v & 0x80000000) == 0) {
                m$n0 = new J.m.n(this, f0);
            }
            else {
                m$n0.n = v ^ 0x80000000;
            }
        }
        else {
            m$n0 = new J.m.n(this, f0);
        }
        Object object0 = m$n0.l;
        Object object1 = q3.b.c();
        switch(m$n0.n) {
            case 0: {
                o.b(object0);
                try {
                    closeable0 = new FileInputStream(this.q());
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    m0 = this;
                    break;
                }
                try {
                    m$n0.i = this;
                    m$n0.j = closeable0;
                    m$n0.k = null;
                    m$n0.n = 1;
                    object0 = this.b.b(((InputStream)closeable0), m$n0);
                }
                catch(Throwable throwable0) {
                    m0 = this;
                    throw throwable0;
                }
                if(object0 == object1) {
                    return object1;
                }
                m0 = this;
                throwable1 = null;
                goto label_43;
            }
            case 1: {
                throwable1 = (Throwable)m$n0.k;
                closeable0 = (Closeable)m$n0.j;
                m0 = (m)m$n0.i;
                try {
                    o.b(object0);
                    goto label_43;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    try {
                        w3.b.a(closeable0, throwable0);
                        throw throwable2;
                    label_43:
                        w3.b.a(closeable0, throwable1);
                        return object0;
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        break;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(m0.q().exists()) {
            throw fileNotFoundException0;
        }
        return m0.b.a();
    }

    private final Object x(p3.f f0) {
        static final class J.m.o extends r3.d {
            Object i;
            Object j;
            Object k;
            final m l;
            int m;

            J.m.o(m m0, p3.f f0) {
                this.l = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.k = object0;
                this.m |= 0x80000000;
                return this.l.x(this);
            }
        }

        J.a a2;
        m m1;
        J.a a1;
        m m0;
        J.m.o m$o0;
        if(f0 instanceof J.m.o) {
            m$o0 = (J.m.o)f0;
            int v = m$o0.m;
            if((v & 0x80000000) == 0) {
                m$o0 = new J.m.o(this, f0);
            }
            else {
                m$o0.m = v ^ 0x80000000;
            }
        }
        else {
            m$o0 = new J.m.o(this, f0);
        }
        Object object0 = m$o0.k;
        Object object1 = q3.b.c();
        switch(m$o0.m) {
            case 0: {
                o.b(object0);
                try {
                    m$o0.i = this;
                    m$o0.m = 1;
                    object0 = this.w(m$o0);
                    return object0 == object1 ? object1 : object0;
                }
                catch(J.a a0) {
                    m0 = this;
                    goto label_25;
                }
            }
            case 1: {
                m0 = (m)m$o0.i;
                try {
                    o.b(object0);
                    return object0;
                }
                catch(J.a a0) {
                }
            label_25:
                m$o0.i = m0;
                m$o0.j = a0;
                m$o0.m = 2;
                Object object2 = m0.c.a(a0, m$o0);
                if(object2 == object1) {
                    return object1;
                }
                a1 = a0;
                object0 = object2;
                m1 = m0;
                m$o0.i = a1;
                m$o0.j = object0;
                m$o0.m = 3;
                return m1.z(object0, m$o0) == object1 ? object1 : object0;
            }
            case 2: {
                a1 = (J.a)m$o0.j;
                m1 = (m)m$o0.i;
                o.b(object0);
                try {
                    m$o0.i = a1;
                    m$o0.j = object0;
                    m$o0.m = 3;
                    return m1.z(object0, m$o0) == object1 ? object1 : object0;
                }
                catch(IOException iOException0) {
                    a2 = a1;
                }
                l3.a.a(a2, iOException0);
                throw a2;
            }
            case 3: {
                Object object3 = m$o0.j;
                a2 = (J.a)m$o0.i;
                try {
                    o.b(object0);
                    return object3;
                }
                catch(IOException iOException0) {
                    l3.a.a(a2, iOException0);
                    throw a2;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object y(p p0, j j0, p3.f f0) {
        static final class J.m.p extends r3.d {
            Object i;
            Object j;
            Object k;
            Object l;
            final m m;
            int n;

            J.m.p(m m0, p3.f f0) {
                this.m = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.y(null, null, this);
            }
        }


        static final class q extends r3.k implements p {
            int j;
            final p k;
            final Object l;

            q(p p0, Object object0, p3.f f0) {
                this.k = p0;
                this.l = object0;
                super(2, f0);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.w(((I)object0), ((p3.f)object1));
            }

            @Override  // r3.a
            public final p3.f q(Object object0, p3.f f0) {
                return new q(this.k, this.l, f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                Object object1 = q3.b.c();
                switch(this.j) {
                    case 0: {
                        o.b(object0);
                        this.j = 1;
                        object0 = this.k.k(this.l, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        o.b(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            public final Object w(I i0, p3.f f0) {
                return ((q)this.q(i0, f0)).t(l3.u.a);
            }
        }

        m m0;
        Object object4;
        J.c c1;
        J.m.p m$p0;
        if(f0 instanceof J.m.p) {
            m$p0 = (J.m.p)f0;
            int v = m$p0.n;
            if((v & 0x80000000) == 0) {
                m$p0 = new J.m.p(this, f0);
            }
            else {
                m$p0.n = v ^ 0x80000000;
            }
        }
        else {
            m$p0 = new J.m.p(this, f0);
        }
        Object object0 = m$p0.l;
        Object object1 = q3.b.c();
        switch(m$p0.n) {
            case 0: {
                o.b(object0);
                J.c c0 = (J.c)this.h.getValue();
                c0.a();
                Object object2 = c0.b();
                q m$q0 = new q(p0, object2, null);
                m$p0.i = this;
                m$p0.j = c0;
                m$p0.k = object2;
                m$p0.n = 1;
                Object object3 = I3.g.g(j0, m$q0, m$p0);
                if(object3 == object1) {
                    return object1;
                }
                c1 = c0;
                object0 = object3;
                object4 = object2;
                m0 = this;
                goto label_34;
            }
            case 1: {
                object4 = m$p0.k;
                c1 = (J.c)m$p0.j;
                m0 = (m)m$p0.i;
                o.b(object0);
            label_34:
                c1.a();
                if(!k.a(object4, object0)) {
                    m$p0.i = m0;
                    m$p0.j = object0;
                    m$p0.k = null;
                    m$p0.n = 2;
                    if(m0.z(object0, m$p0) == object1) {
                        return object1;
                    }
                    m0.h.setValue(new J.c(object0, (object0 == null ? 0 : object0.hashCode())));
                    return object0;
                }
                break;
            }
            case 2: {
                object4 = m$p0.j;
                m m1 = (m)m$p0.i;
                o.b(object0);
                m1.h.setValue(new J.c(object4, (object4 == null ? 0 : object4.hashCode())));
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object4;
    }

    public final Object z(Object object0, p3.f f0) {
        static final class r extends r3.d {
            Object i;
            Object j;
            Object k;
            Object l;
            Object m;
            Object n;
            final m o;
            int p;

            r(m m0, p3.f f0) {
                this.o = m0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.n = object0;
                this.p |= 0x80000000;
                return this.o.z(null, this);
            }
        }

        Throwable throwable1;
        Closeable closeable1;
        m m0;
        File file1;
        Closeable closeable0;
        File file0;
        r m$r0;
        if(f0 instanceof r) {
            m$r0 = (r)f0;
            int v = m$r0.p;
            if((v & 0x80000000) == 0) {
                m$r0 = new r(this, f0);
            }
            else {
                m$r0.p = v ^ 0x80000000;
            }
        }
        else {
            m$r0 = new r(this, f0);
        }
        Object object1 = m$r0.n;
        Object object2 = q3.b.c();
        switch(m$r0.p) {
            case 0: {
                o.b(object1);
                this.p(this.q());
                file0 = new File(k.k(this.q().getAbsolutePath(), this.f));
                try {
                    closeable0 = new FileOutputStream(file0);
                }
                catch(IOException iOException0) {
                    goto label_57;
                }
                try {
                    c m$c0 = new c(((FileOutputStream)closeable0));
                    m$r0.i = this;
                    m$r0.j = file0;
                    m$r0.k = closeable0;
                    m$r0.l = null;
                    m$r0.m = closeable0;
                    m$r0.p = 1;
                    if(this.b.c(object0, m$c0, m$r0) == object2) {
                        return object2;
                    }
                }
                catch(Throwable throwable0) {
                    file1 = file0;
                    break;
                }
                m0 = this;
                file1 = file0;
                closeable1 = closeable0;
                throwable1 = null;
                goto label_44;
            }
            case 1: {
                closeable1 = (FileOutputStream)m$r0.m;
                throwable1 = (Throwable)m$r0.l;
                closeable0 = (Closeable)m$r0.k;
                file1 = (File)m$r0.j;
                m0 = (m)m$r0.i;
                try {
                    o.b(object1);
                label_44:
                    ((FileOutputStream)closeable1).getFD().sync();
                    goto label_51;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            try {
                w3.b.a(closeable0, throwable0);
                throw throwable2;
            label_51:
                w3.b.a(closeable0, throwable1);
                if(!file1.renameTo(m0.q())) {
                    throw new IOException("Unable to rename " + file1 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
                return l3.u.a;
            }
            catch(IOException iOException0) {
            }
        }
        file0 = file1;
    label_57:
        if(file0.exists()) {
            file0.delete();
        }
        throw iOException0;
    }
}

