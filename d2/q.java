package d2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class q {
    static abstract class a {
    }

    static class b {
        private final c a;
        private final Set b;
        private final Set c;

        b(c c0) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.a = c0;
        }

        void a(b q$b0) {
            this.b.add(q$b0);
        }

        void b(b q$b0) {
            this.c.add(q$b0);
        }

        c c() {
            return this.a;
        }

        Set d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b q$b0) {
            this.c.remove(q$b0);
        }
    }

    static class d2.q.c {
        private final F a;
        private final boolean b;

        private d2.q.c(F f0, boolean z) {
            this.a = f0;
            this.b = z;
        }

        d2.q.c(F f0, boolean z, a q$a0) {
            this(f0, z);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof d2.q.c && ((d2.q.c)object0).a.equals(this.a) && ((d2.q.c)object0).b == this.b;
        }

        @Override
        public int hashCode() {
            return (this.a.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    static void a(List list0) {
        Set set0 = q.c(list0);
        Set set1 = q.b(set0);
        int v = 0;
        while(!set1.isEmpty()) {
            Object object0 = set1.iterator().next();
            b q$b0 = (b)object0;
            set1.remove(q$b0);
            ++v;
            for(Object object1: q$b0.d()) {
                b q$b1 = (b)object1;
                q$b1.g(q$b0);
                if(q$b1.f()) {
                    set1.add(q$b1);
                }
            }
        }
        if(v == list0.size()) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: set0) {
            b q$b2 = (b)object2;
            if(!q$b2.f() && !q$b2.e()) {
                arrayList0.add(q$b2.c());
            }
        }
        throw new s(arrayList0);
    }

    private static Set b(Set set0) {
        Set set1 = new HashSet();
        for(Object object0: set0) {
            b q$b0 = (b)object0;
            if(q$b0.f()) {
                set1.add(q$b0);
            }
        }
        return set1;
    }

    private static Set c(List list0) {
        HashMap hashMap0 = new HashMap(list0.size());
        for(Object object0: list0) {
            c c0 = (c)object0;
            b q$b0 = new b(c0);
            for(Object object1: c0.j()) {
                F f0 = (F)object1;
                d2.q.c q$c0 = new d2.q.c(f0, !c0.p(), null);
                if(!hashMap0.containsKey(q$c0)) {
                    hashMap0.put(q$c0, new HashSet());
                }
                Set set0 = (Set)hashMap0.get(q$c0);
                if(!set0.isEmpty() && !q$c0.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f0));
                }
                set0.add(q$b0);
            }
        }
        for(Object object2: hashMap0.values()) {
            for(Object object3: ((Set)object2)) {
                b q$b1 = (b)object3;
                for(Object object4: q$b1.c().g()) {
                    r r0 = (r)object4;
                    if(r0.e()) {
                        Set set1 = (Set)hashMap0.get(new d2.q.c(r0.c(), r0.g(), null));
                        if(set1 != null) {
                            for(Object object5: set1) {
                                q$b1.a(((b)object5));
                                ((b)object5).b(q$b1);
                            }
                        }
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
        Set set2 = new HashSet();
        for(Object object6: hashMap0.values()) {
            ((AbstractCollection)set2).addAll(((Set)object6));
        }
        return set2;
    }
}

