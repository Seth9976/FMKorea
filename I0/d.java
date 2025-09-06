package i0;

import G3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import z3.g;
import z3.k;

public final class d {
    public static final class a {
        public static final class i0.d.a.a {
            private i0.d.a.a() {
            }

            public i0.d.a.a(g g0) {
            }

            private final boolean a(String s) {
                if(s.length() == 0) {
                    return false;
                }
                int v = 0;
                int v1 = 0;
                for(int v2 = 0; v < s.length(); ++v2) {
                    int v3 = s.charAt(v);
                    if(v2 == 0 && v3 != 40) {
                        return false;
                    }
                    if(v3 == 40) {
                        ++v1;
                    }
                    else if(v3 == 41) {
                        --v1;
                        if(v1 == 0 && v2 != s.length() - 1) {
                            return false;
                        }
                    }
                    ++v;
                }
                return v1 == 0;
            }

            public final boolean b(String s, String s1) {
                k.e(s, "current");
                if(k.a(s, s1)) {
                    return true;
                }
                if(this.a(s)) {
                    String s2 = s.substring(1, s.length() - 1);
                    k.d(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                    return k.a(h.g0(s2).toString(), s1);
                }
                return false;
            }
        }

        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;
        public static final i0.d.a.a h;

        static {
            a.h = new i0.d.a.a(null);
        }

        public a(String s, String s1, boolean z, int v, String s2, int v1) {
            k.e(s, "name");
            k.e(s1, "type");
            super();
            this.a = s;
            this.b = s1;
            this.c = z;
            this.d = v;
            this.e = s2;
            this.f = v1;
            this.g = this.a(s1);
        }

        private final int a(String s) {
            if(s == null) {
                return 5;
            }
            Locale locale0 = Locale.US;
            k.d(locale0, "US");
            String s1 = s.toUpperCase(locale0);
            k.d(s1, "this as java.lang.String).toUpperCase(locale)");
            if(h.x(s1, "INT", false, 2, null)) {
                return 3;
            }
            if(!h.x(s1, "CHAR", false, 2, null) && !h.x(s1, "CLOB", false, 2, null) && !h.x(s1, "TEXT", false, 2, null)) {
                if(h.x(s1, "BLOB", false, 2, null)) {
                    return 5;
                }
                return h.x(s1, "REAL", false, 2, null) || h.x(s1, "FLOA", false, 2, null) || h.x(s1, "DOUB", false, 2, null) ? 4 : 1;
            }
            return 2;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(this.d != ((a)object0).d) {
                return false;
            }
            if(!k.a(this.a, ((a)object0).a)) {
                return false;
            }
            if(this.c != ((a)object0).c) {
                return false;
            }
            if(this.f == 1 && ((a)object0).f == 2 && (this.e != null && !a.h.b(this.e, ((a)object0).e))) {
                return false;
            }
            if(this.f == 2 && ((a)object0).f == 1) {
                String s = ((a)object0).e;
                if(s != null && !a.h.b(s, this.e)) {
                    return false;
                }
            }
            if(this.f != 0 && this.f == ((a)object0).f) {
                String s1 = this.e;
                if(s1 != null) {
                    return a.h.b(s1, ((a)object0).e) ? this.g == ((a)object0).g : false;
                }
                return ((a)object0).e == null ? this.g == ((a)object0).g : false;
            }
            return this.g == ((a)object0).g;
        }

        @Override
        public int hashCode() {
            int v = (this.a.hashCode() * 0x1F + this.g) * 0x1F;
            return this.c ? (v + 0x4CF) * 0x1F + this.d : (v + 0x4D5) * 0x1F + this.d;
        }

        @Override
        public String toString() {
            return "Column{name=\'" + this.a + "\', type=\'" + this.b + "\', affinity=\'" + this.g + "\', notNull=" + this.c + ", primaryKeyPosition=" + this.d + ", defaultValue=\'" + (this.e == null ? "undefined" : this.e) + "\'}";
        }
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }

        public final d a(k0.g g0, String s) {
            k.e(g0, "database");
            k.e(s, "tableName");
            return e.f(g0, s);
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final List e;

        public c(String s, String s1, String s2, List list0, List list1) {
            k.e(s, "referenceTable");
            k.e(s1, "onDelete");
            k.e(s2, "onUpdate");
            k.e(list0, "columnNames");
            k.e(list1, "referenceColumnNames");
            super();
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = list0;
            this.e = list1;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof c)) {
                return false;
            }
            if(!k.a(this.a, ((c)object0).a)) {
                return false;
            }
            if(!k.a(this.b, ((c)object0).b)) {
                return false;
            }
            if(!k.a(this.c, ((c)object0).c)) {
                return false;
            }
            return k.a(this.d, ((c)object0).d) ? k.a(this.e, ((c)object0).e) : false;
        }

        @Override
        public int hashCode() {
            return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        }

        @Override
        public String toString() {
            return "ForeignKey{referenceTable=\'" + this.a + "\', onDelete=\'" + this.b + " +\', onUpdate=\'" + this.c + "\', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    public static final class i0.d.d implements Comparable {
        private final int f;
        private final int g;
        private final String h;
        private final String i;

        public i0.d.d(int v, int v1, String s, String s1) {
            k.e(s, "from");
            k.e(s1, "to");
            super();
            this.f = v;
            this.g = v1;
            this.h = s;
            this.i = s1;
        }

        public int b(i0.d.d d$d0) {
            k.e(d$d0, "other");
            int v = this.f - d$d0.f;
            return v == 0 ? this.g - d$d0.g : v;
        }

        @Override
        public int compareTo(Object object0) {
            return this.b(((i0.d.d)object0));
        }

        public final String f() {
            return this.h;
        }

        public final int g() {
            return this.f;
        }

        public final String h() {
            return this.i;
        }
    }

    public static final class i0.d.e {
        public static final class i0.d.e.a {
            private i0.d.e.a() {
            }

            public i0.d.e.a(g g0) {
            }
        }

        public final String a;
        public final boolean b;
        public final List c;
        public List d;
        public static final i0.d.e.a e;

        static {
            i0.d.e.e = new i0.d.e.a(null);
        }

        public i0.d.e(String s, boolean z, List list0, List list1) {
            k.e(s, "name");
            k.e(list0, "columns");
            k.e(list1, "orders");
            super();
            this.a = s;
            this.b = z;
            this.c = list0;
            this.d = list1;
            Collection collection0 = list1;
            if(collection0.isEmpty()) {
                int v = list0.size();
                collection0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((ArrayList)collection0).add("ASC");
                }
            }
            this.d = (List)collection0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof i0.d.e)) {
                return false;
            }
            if(this.b != ((i0.d.e)object0).b) {
                return false;
            }
            if(!k.a(this.c, ((i0.d.e)object0).c)) {
                return false;
            }
            if(!k.a(this.d, ((i0.d.e)object0).d)) {
                return false;
            }
            return h.u(this.a, "index_", false, 2, null) ? h.u(((i0.d.e)object0).a, "index_", false, 2, null) : k.a(this.a, ((i0.d.e)object0).a);
        }

        // 去混淆评级： 低(20)
        @Override
        public int hashCode() {
            return h.u(this.a, "index_", false, 2, null) ? ((this.b + 0x73D447D3) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode() : ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        }

        @Override
        public String toString() {
            return "Index{name=\'" + this.a + "\', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "\'}";
        }
    }

    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;
    public static final b e;

    static {
        d.e = new b(null);
    }

    public d(String s, Map map0, Set set0, Set set1) {
        k.e(s, "name");
        k.e(map0, "columns");
        k.e(set0, "foreignKeys");
        super();
        this.a = s;
        this.b = map0;
        this.c = set0;
        this.d = set1;
    }

    public static final d a(k0.g g0, String s) {
        return d.e.a(g0, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!k.a(this.a, ((d)object0).a)) {
            return false;
        }
        if(!k.a(this.b, ((d)object0).b)) {
            return false;
        }
        if(!k.a(this.c, ((d)object0).c)) {
            return false;
        }
        Set set0 = this.d;
        if(set0 != null) {
            Set set1 = ((d)object0).d;
            return set1 == null ? true : k.a(set0, set1);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public String toString() {
        return "TableInfo{name=\'" + this.a + "\', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

