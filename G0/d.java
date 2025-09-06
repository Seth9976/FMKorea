package g0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.h;
import k0.j;
import l3.u;
import m3.o;
import z3.k;
import z3.l;

public final class d implements g, h {
    public static final class a implements k0.g {
        private final c f;

        public a(c c0) {
            k.e(c0, "autoCloser");
            super();
            this.f = c0;
        }

        @Override  // k0.g
        public void A() {
            k0.g g0 = this.f.j();
            try {
                g0.A();
            }
            catch(Throwable throwable0) {
                this.f.e();
                throw throwable0;
            }
        }

        @Override  // k0.g
        public int B(String s, int v, ContentValues contentValues0, String s1, Object[] arr_object) {
            static final class g0.d.a.h extends l implements y3.l {
                final String g;
                final int h;
                final ContentValues i;
                final String j;
                final Object[] k;

                g0.d.a.h(String s, int v, ContentValues contentValues0, String s1, Object[] arr_object) {
                    this.g = s;
                    this.h = v;
                    this.i = contentValues0;
                    this.j = s1;
                    this.k = arr_object;
                    super(1);
                }

                public final Integer b(k0.g g0) {
                    k.e(g0, "db");
                    return g0.B(this.g, this.h, this.i, this.j, this.k);
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            k.e(s, "table");
            k.e(contentValues0, "values");
            g0.d.a.h d$a$h0 = new g0.d.a.h(s, v, contentValues0, s1, arr_object);
            return ((Number)this.f.g(d$a$h0)).intValue();
        }

        @Override  // k0.g
        public Cursor C(j j0) {
            k.e(j0, "query");
            try {
                return new g0.d.c(this.f.j().C(j0), this.f);
            }
            catch(Throwable throwable0) {
                this.f.e();
                throw throwable0;
            }
        }

        @Override  // k0.g
        public Cursor H(String s) {
            k.e(s, "query");
            try {
                return new g0.d.c(this.f.j().H(s), this.f);
            }
            catch(Throwable throwable0) {
                this.f.e();
                throw throwable0;
            }
        }

        @Override  // k0.g
        public void I() {
            if(this.f.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                k0.g g0 = this.f.h();
                k.b(g0);
                g0.I();
            }
            finally {
                this.f.e();
            }
        }

        @Override  // k0.g
        public String S() {
            static final class f extends l implements y3.l {
                public static final f g;

                static {
                    f.g = new f();
                }

                f() {
                    super(1);
                }

                public final String b(k0.g g0) {
                    k.e(g0, "obj");
                    return g0.S();
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            return (String)this.f.g(f.g);
        }

        @Override  // k0.g
        public boolean T() {
            final class g0.d.a.d extends z3.j implements y3.l {
                public static final g0.d.a.d o;

                static {
                    g0.d.a.d.o = new g0.d.a.d();
                }

                g0.d.a.d() {
                    super(1, k0.g.class, "inTransaction", "inTransaction()Z", 0);
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.p(((k0.g)object0));
                }

                public final Boolean p(k0.g g0) {
                    k.e(g0, "p0");
                    return Boolean.valueOf(g0.T());
                }
            }

            return this.f.h() == null ? false : ((Boolean)this.f.g(g0.d.a.d.o)).booleanValue();
        }

        @Override  // k0.g
        public boolean W() {
            static final class e extends l implements y3.l {
                public static final e g;

                static {
                    e.g = new e();
                }

                e() {
                    super(1);
                }

                public final Boolean b(k0.g g0) {
                    k.e(g0, "db");
                    return Boolean.valueOf(g0.W());
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            return ((Boolean)this.f.g(e.g)).booleanValue();
        }

        public final void a() {
            static final class g0.d.a.g extends l implements y3.l {
                public static final g0.d.a.g g;

                static {
                    g0.d.a.g.g = new g0.d.a.g();
                }

                g0.d.a.g() {
                    super(1);
                }

                public final Object b(k0.g g0) {
                    k.e(g0, "it");
                    return null;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            this.f.g(g0.d.a.g.g);
        }

        @Override  // k0.g
        public void c() {
            k0.g g0 = this.f.j();
            try {
                g0.c();
            }
            catch(Throwable throwable0) {
                this.f.e();
                throw throwable0;
            }
        }

        @Override
        public void close() {
            this.f.d();
        }

        @Override  // k0.g
        public boolean h() {
            k0.g g0 = this.f.h();
            return g0 == null ? false : g0.h();
        }

        @Override  // k0.g
        public List i() {
            static final class g0.d.a.a extends l implements y3.l {
                public static final g0.d.a.a g;

                static {
                    g0.d.a.a.g = new g0.d.a.a();
                }

                g0.d.a.a() {
                    super(1);
                }

                public final List b(k0.g g0) {
                    k.e(g0, "obj");
                    return g0.i();
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            return (List)this.f.g(g0.d.a.a.g);
        }

        @Override  // k0.g
        public void k(String s) {
            static final class b extends l implements y3.l {
                final String g;

                b(String s) {
                    this.g = s;
                    super(1);
                }

                public final Object b(k0.g g0) {
                    k.e(g0, "db");
                    g0.k(this.g);
                    return null;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            k.e(s, "sql");
            b d$a$b0 = new b(s);
            this.f.g(d$a$b0);
        }

        @Override  // k0.g
        public k0.k n(String s) {
            k.e(s, "sql");
            return new g0.d.b(s, this.f);
        }

        @Override  // k0.g
        public Cursor p(j j0, CancellationSignal cancellationSignal0) {
            k.e(j0, "query");
            try {
                return new g0.d.c(this.f.j().p(j0, cancellationSignal0), this.f);
            }
            catch(Throwable throwable0) {
                this.f.e();
                throw throwable0;
            }
        }

        @Override  // k0.g
        public void y() {
            u u0;
            k0.g g0 = this.f.h();
            if(g0 == null) {
                u0 = null;
            }
            else {
                g0.y();
                u0 = u.a;
            }
            if(u0 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override  // k0.g
        public void z(String s, Object[] arr_object) {
            static final class g0.d.a.c extends l implements y3.l {
                final String g;
                final Object[] h;

                g0.d.a.c(String s, Object[] arr_object) {
                    this.g = s;
                    this.h = arr_object;
                    super(1);
                }

                public final Object b(k0.g g0) {
                    k.e(g0, "db");
                    g0.z(this.g, this.h);
                    return null;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            k.e(s, "sql");
            k.e(arr_object, "bindArgs");
            g0.d.a.c d$a$c0 = new g0.d.a.c(s, arr_object);
            this.f.g(d$a$c0);
        }
    }

    static final class g0.d.b implements k0.k {
        private final String f;
        private final c g;
        private final ArrayList h;

        public g0.d.b(String s, c c0) {
            k.e(s, "sql");
            k.e(c0, "autoCloser");
            super();
            this.f = s;
            this.g = c0;
            this.h = new ArrayList();
        }

        @Override  // k0.i
        public void D(int v, byte[] arr_b) {
            k.e(arr_b, "value");
            this.j(v, arr_b);
        }

        @Override  // k0.i
        public void P(int v) {
            this.j(v, null);
        }

        @Override
        public void close() {
        }

        @Override  // k0.k
        public long d0() {
            static final class g0.d.b.a extends l implements y3.l {
                public static final g0.d.b.a g;

                static {
                    g0.d.b.a.g = new g0.d.b.a();
                }

                g0.d.b.a() {
                    super(1);
                }

                public final Long b(k0.k k0) {
                    k.e(k0, "obj");
                    return k0.d0();
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.k)object0));
                }
            }

            return ((Number)this.g(g0.d.b.a.g)).longValue();
        }

        private final void f(k0.k k0) {
            Iterator iterator0 = this.h.iterator();
            for(int v = 0; iterator0.hasNext(); ++v) {
                iterator0.next();
                if(v < 0) {
                    o.m();
                }
                Object object0 = this.h.get(v);
                if(object0 == null) {
                    k0.P(v + 1);
                }
                else if(object0 instanceof Long) {
                    k0.x(v + 1, ((Number)object0).longValue());
                }
                else if(object0 instanceof Double) {
                    k0.q(v + 1, ((Number)object0).doubleValue());
                }
                else if(object0 instanceof String) {
                    k0.l(v + 1, ((String)object0));
                }
                else if(object0 instanceof byte[]) {
                    k0.D(v + 1, ((byte[])object0));
                }
            }
        }

        private final Object g(y3.l l0) {
            static final class g0.d.b.b extends l implements y3.l {
                final g0.d.b g;
                final y3.l h;

                g0.d.b.b(g0.d.b d$b0, y3.l l0) {
                    this.g = d$b0;
                    this.h = l0;
                    super(1);
                }

                public final Object b(k0.g g0) {
                    k.e(g0, "db");
                    k0.k k0 = g0.n(this.g.f);
                    this.g.f(k0);
                    return this.h.h(k0);
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.g)object0));
                }
            }

            g0.d.b.b d$b$b0 = new g0.d.b.b(this, l0);
            return this.g.g(d$b$b0);
        }

        private final void j(int v, Object object0) {
            if(v - 1 >= this.h.size()) {
                int v1 = this.h.size();
                if(v1 <= v - 1) {
                    while(true) {
                        this.h.add(null);
                        if(v1 == v - 1) {
                            break;
                        }
                        ++v1;
                    }
                }
            }
            this.h.set(v - 1, object0);
        }

        @Override  // k0.i
        public void l(int v, String s) {
            k.e(s, "value");
            this.j(v, s);
        }

        @Override  // k0.k
        public int m() {
            static final class g0.d.b.c extends l implements y3.l {
                public static final g0.d.b.c g;

                static {
                    g0.d.b.c.g = new g0.d.b.c();
                }

                g0.d.b.c() {
                    super(1);
                }

                public final Integer b(k0.k k0) {
                    k.e(k0, "obj");
                    return k0.m();
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((k0.k)object0));
                }
            }

            return ((Number)this.g(g0.d.b.c.g)).intValue();
        }

        @Override  // k0.i
        public void q(int v, double f) {
            this.j(v, f);
        }

        @Override  // k0.i
        public void x(int v, long v1) {
            this.j(v, v1);
        }
    }

    static final class g0.d.c implements Cursor {
        private final Cursor f;
        private final c g;

        public g0.d.c(Cursor cursor0, c c0) {
            k.e(cursor0, "delegate");
            k.e(c0, "autoCloser");
            super();
            this.f = cursor0;
            this.g = c0;
        }

        @Override  // android.database.Cursor
        public void close() {
            this.f.close();
            this.g.e();
        }

        @Override  // android.database.Cursor
        public void copyStringToBuffer(int v, CharArrayBuffer charArrayBuffer0) {
            this.f.copyStringToBuffer(v, charArrayBuffer0);
        }

        @Override  // android.database.Cursor
        public void deactivate() {
            this.f.deactivate();
        }

        @Override  // android.database.Cursor
        public byte[] getBlob(int v) {
            return this.f.getBlob(v);
        }

        @Override  // android.database.Cursor
        public int getColumnCount() {
            return this.f.getColumnCount();
        }

        @Override  // android.database.Cursor
        public int getColumnIndex(String s) {
            return this.f.getColumnIndex(s);
        }

        @Override  // android.database.Cursor
        public int getColumnIndexOrThrow(String s) {
            return this.f.getColumnIndexOrThrow(s);
        }

        @Override  // android.database.Cursor
        public String getColumnName(int v) {
            return this.f.getColumnName(v);
        }

        @Override  // android.database.Cursor
        public String[] getColumnNames() {
            return this.f.getColumnNames();
        }

        @Override  // android.database.Cursor
        public int getCount() {
            return this.f.getCount();
        }

        @Override  // android.database.Cursor
        public double getDouble(int v) {
            return this.f.getDouble(v);
        }

        @Override  // android.database.Cursor
        public Bundle getExtras() {
            return this.f.getExtras();
        }

        @Override  // android.database.Cursor
        public float getFloat(int v) {
            return this.f.getFloat(v);
        }

        @Override  // android.database.Cursor
        public int getInt(int v) {
            return this.f.getInt(v);
        }

        @Override  // android.database.Cursor
        public long getLong(int v) {
            return this.f.getLong(v);
        }

        @Override  // android.database.Cursor
        public Uri getNotificationUri() {
            return k0.c.a(this.f);
        }

        @Override  // android.database.Cursor
        public List getNotificationUris() {
            return k0.f.a(this.f);
        }

        @Override  // android.database.Cursor
        public int getPosition() {
            return this.f.getPosition();
        }

        @Override  // android.database.Cursor
        public short getShort(int v) {
            return this.f.getShort(v);
        }

        @Override  // android.database.Cursor
        public String getString(int v) {
            return this.f.getString(v);
        }

        @Override  // android.database.Cursor
        public int getType(int v) {
            return this.f.getType(v);
        }

        @Override  // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f.getWantsAllOnMoveCalls();
        }

        @Override  // android.database.Cursor
        public boolean isAfterLast() {
            return this.f.isAfterLast();
        }

        @Override  // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f.isBeforeFirst();
        }

        @Override  // android.database.Cursor
        public boolean isClosed() {
            return this.f.isClosed();
        }

        @Override  // android.database.Cursor
        public boolean isFirst() {
            return this.f.isFirst();
        }

        @Override  // android.database.Cursor
        public boolean isLast() {
            return this.f.isLast();
        }

        @Override  // android.database.Cursor
        public boolean isNull(int v) {
            return this.f.isNull(v);
        }

        @Override  // android.database.Cursor
        public boolean move(int v) {
            return this.f.move(v);
        }

        @Override  // android.database.Cursor
        public boolean moveToFirst() {
            return this.f.moveToFirst();
        }

        @Override  // android.database.Cursor
        public boolean moveToLast() {
            return this.f.moveToLast();
        }

        @Override  // android.database.Cursor
        public boolean moveToNext() {
            return this.f.moveToNext();
        }

        @Override  // android.database.Cursor
        public boolean moveToPosition(int v) {
            return this.f.moveToPosition(v);
        }

        @Override  // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f.moveToPrevious();
        }

        @Override  // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver0) {
            this.f.registerContentObserver(contentObserver0);
        }

        @Override  // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver0) {
            this.f.registerDataSetObserver(dataSetObserver0);
        }

        @Override  // android.database.Cursor
        public boolean requery() {
            return this.f.requery();
        }

        @Override  // android.database.Cursor
        public Bundle respond(Bundle bundle0) {
            return this.f.respond(bundle0);
        }

        @Override  // android.database.Cursor
        public void setExtras(Bundle bundle0) {
            k.e(bundle0, "extras");
            k0.e.a(this.f, bundle0);
        }

        @Override  // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver0, Uri uri0) {
            this.f.setNotificationUri(contentResolver0, uri0);
        }

        @Override  // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver0, List list0) {
            k.e(contentResolver0, "cr");
            k.e(list0, "uris");
            k0.f.b(this.f, contentResolver0, list0);
        }

        @Override  // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver0) {
            this.f.unregisterContentObserver(contentObserver0);
        }

        @Override  // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
            this.f.unregisterDataSetObserver(dataSetObserver0);
        }
    }

    private final h f;
    public final c g;
    private final a h;

    public d(h h0, c c0) {
        k.e(h0, "delegate");
        k.e(c0, "autoCloser");
        super();
        this.f = h0;
        this.g = c0;
        c0.k(this.a());
        this.h = new a(c0);
    }

    @Override  // k0.h
    public k0.g G() {
        this.h.a();
        return this.h;
    }

    @Override  // g0.g
    public h a() {
        return this.f;
    }

    @Override  // k0.h
    public void close() {
        this.h.close();
    }

    @Override  // k0.h
    public String getDatabaseName() {
        return this.f.getDatabaseName();
    }

    @Override  // k0.h
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f.setWriteAheadLoggingEnabled(z);
    }
}

