package m3;

import D3.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import z3.g;
import z3.k;

public final class h extends e {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private int f;
    private Object[] g;
    private int h;
    public static final a i;
    private static final Object[] j;

    static {
        h.i = new a(null);
        h.j = new Object[0];
    }

    public h() {
        this.g = h.j;
    }

    @Override  // m3.e
    public int a() {
        return this.h;
    }

    @Override
    public void add(int v, Object object0) {
        c.f.b(v, this.size());
        if(v == this.size()) {
            this.addLast(object0);
            return;
        }
        if(v == 0) {
            this.addFirst(object0);
            return;
        }
        this.o();
        this.i(this.size() + 1);
        int v1 = this.n(this.f + v);
        if(v < this.size() + 1 >> 1) {
            int v2 = this.h(v1);
            int v3 = this.h(this.f);
            int v4 = this.f;
            if(v2 >= v4) {
                Object[] arr_object = this.g;
                arr_object[v3] = arr_object[v4];
                i.d(arr_object, arr_object, v4, v4 + 1, v2 + 1);
            }
            else {
                i.d(this.g, this.g, v4 - 1, v4, this.g.length);
                Object[] arr_object1 = this.g;
                arr_object1[arr_object1.length - 1] = arr_object1[0];
                i.d(arr_object1, arr_object1, 0, 1, v2 + 1);
            }
            this.g[v2] = object0;
            this.f = v3;
        }
        else {
            int v5 = this.n(this.f + this.size());
            if(v1 < v5) {
                i.d(this.g, this.g, v1 + 1, v1, v5);
            }
            else {
                i.d(this.g, this.g, 1, 0, v5);
                Object[] arr_object2 = this.g;
                arr_object2[0] = arr_object2[arr_object2.length - 1];
                i.d(arr_object2, arr_object2, v1 + 1, v1, arr_object2.length - 1);
            }
            this.g[v1] = object0;
        }
        this.h = this.size() + 1;
    }

    @Override
    public boolean add(Object object0) {
        this.addLast(object0);
        return true;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        k.e(collection0, "elements");
        c.f.b(v, this.size());
        if(collection0.isEmpty()) {
            return false;
        }
        if(v == this.size()) {
            return this.addAll(collection0);
        }
        this.o();
        this.i(this.size() + collection0.size());
        int v1 = this.n(this.f + this.size());
        int v2 = this.n(this.f + v);
        int v3 = collection0.size();
        if(v < this.size() + 1 >> 1) {
            int v4 = this.f;
            int v5 = v4 - v3;
            if(v2 < v4) {
                i.d(this.g, this.g, v5, v4, this.g.length);
                if(v3 >= v2) {
                    i.d(this.g, this.g, this.g.length - v3, 0, v2);
                }
                else {
                    i.d(this.g, this.g, this.g.length - v3, 0, v3);
                    i.d(this.g, this.g, 0, v3, v2);
                }
            }
            else if(v5 >= 0) {
                i.d(this.g, this.g, v5, v4, v2);
            }
            else {
                Object[] arr_object = this.g;
                v5 += arr_object.length;
                int v6 = arr_object.length - v5;
                if(v6 >= v2 - v4) {
                    i.d(arr_object, arr_object, v5, v4, v2);
                }
                else {
                    i.d(arr_object, arr_object, v5, v4, v4 + v6);
                    i.d(this.g, this.g, 0, this.f + v6, v2);
                }
            }
            this.f = v5;
            this.d(this.l(v2 - v3), collection0);
            return true;
        }
        int v7 = v2 + v3;
        if(v2 < v1) {
            int v8 = v3 + v1;
            Object[] arr_object1 = this.g;
            if(v8 <= arr_object1.length) {
                i.d(arr_object1, arr_object1, v7, v2, v1);
            }
            else if(v7 >= arr_object1.length) {
                i.d(arr_object1, arr_object1, v7 - arr_object1.length, v2, v1);
            }
            else {
                int v9 = v1 - (v8 - arr_object1.length);
                i.d(arr_object1, arr_object1, 0, v9, v1);
                i.d(this.g, this.g, v7, v2, v9);
            }
        }
        else {
            i.d(this.g, this.g, v3, 0, v1);
            Object[] arr_object2 = this.g;
            if(v7 >= arr_object2.length) {
                i.d(arr_object2, arr_object2, v7 - arr_object2.length, v2, arr_object2.length);
            }
            else {
                i.d(arr_object2, arr_object2, 0, arr_object2.length - v3, arr_object2.length);
                i.d(this.g, this.g, v7, v2, this.g.length - v3);
            }
        }
        this.d(v2, collection0);
        return true;
    }

    @Override
    public boolean addAll(Collection collection0) {
        k.e(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        this.o();
        this.i(this.size() + collection0.size());
        this.d(this.n(this.f + this.size()), collection0);
        return true;
    }

    @Override
    public final void addFirst(Object object0) {
        this.o();
        this.i(this.size() + 1);
        int v = this.h(this.f);
        this.f = v;
        this.g[v] = object0;
        this.h = this.size() + 1;
    }

    @Override
    public final void addLast(Object object0) {
        this.o();
        this.i(this.size() + 1);
        this.g[this.n(this.f + this.size())] = object0;
        this.h = this.size() + 1;
    }

    @Override  // m3.e
    public Object c(int v) {
        c.f.a(v, this.size());
        if(v == o.j(this)) {
            return this.removeLast();
        }
        if(v == 0) {
            return this.removeFirst();
        }
        this.o();
        int v1 = this.n(this.f + v);
        Object object0 = this.g[v1];
        if(v < this.size() >> 1) {
            int v2 = this.f;
            if(v1 >= v2) {
                i.d(this.g, this.g, v2 + 1, v2, v1);
            }
            else {
                i.d(this.g, this.g, 1, 0, v1);
                Object[] arr_object = this.g;
                arr_object[0] = arr_object[arr_object.length - 1];
                i.d(arr_object, arr_object, this.f + 1, this.f, arr_object.length - 1);
            }
            int v3 = this.f;
            this.g[v3] = null;
            this.f = this.k(v3);
        }
        else {
            int v4 = this.n(this.f + o.j(this));
            if(v1 <= v4) {
                i.d(this.g, this.g, v1, v1 + 1, v4 + 1);
            }
            else {
                i.d(this.g, this.g, v1, v1 + 1, this.g.length);
                Object[] arr_object1 = this.g;
                arr_object1[arr_object1.length - 1] = arr_object1[0];
                i.d(arr_object1, arr_object1, 0, 1, v4 + 1);
            }
            this.g[v4] = null;
        }
        this.h = this.size() - 1;
        return object0;
    }

    @Override
    public void clear() {
        if(!this.isEmpty()) {
            this.o();
            int v = this.n(this.f + this.size());
            this.m(this.f, v);
        }
        this.f = 0;
        this.h = 0;
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    private final void d(int v, Collection collection0) {
        Iterator iterator0 = collection0.iterator();
        while(v < this.g.length && iterator0.hasNext()) {
            Object[] arr_object = this.g;
            Object object0 = iterator0.next();
            arr_object[v] = object0;
            ++v;
        }
        int v1 = this.f;
        for(int v2 = 0; v2 < v1 && iterator0.hasNext(); ++v2) {
            Object[] arr_object1 = this.g;
            Object object1 = iterator0.next();
            arr_object1[v2] = object1;
        }
        this.h = this.size() + collection0.size();
    }

    private final void e(int v) {
        Object[] arr_object = new Object[v];
        i.d(this.g, arr_object, 0, this.f, this.g.length);
        i.d(this.g, arr_object, this.g.length - this.f, 0, this.f);
        this.f = 0;
        this.g = arr_object;
    }

    @Override
    public Object get(int v) {
        c.f.a(v, this.size());
        return this.g[this.n(this.f + v)];
    }

    private final int h(int v) {
        return v == 0 ? m.n(this.g) : v - 1;
    }

    private final void i(int v) {
        if(v < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] arr_object = this.g;
        if(v <= arr_object.length) {
            return;
        }
        if(arr_object == h.j) {
            this.g = new Object[d.a(v, 10)];
            return;
        }
        this.e(c.f.d(arr_object.length, v));
    }

    @Override
    public int indexOf(Object object0) {
        int v = this.n(this.f + this.size());
        int v1 = this.f;
        if(v1 < v) {
            while(v1 < v) {
                if(k.a(object0, this.g[v1])) {
                    return v1 - this.f;
                }
                ++v1;
            }
            return -1;
        }
        if(v1 >= v) {
            while(v1 < this.g.length) {
                if(k.a(object0, this.g[v1])) {
                    return v1 - this.f;
                }
                ++v1;
            }
            for(int v2 = 0; v2 < v; ++v2) {
                if(k.a(object0, this.g[v2])) {
                    return v2 + this.g.length - this.f;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    private final int k(int v) {
        return v == m.n(this.g) ? 0 : v + 1;
    }

    private final int l(int v) {
        return v >= 0 ? v : v + this.g.length;
    }

    @Override
    public int lastIndexOf(Object object0) {
        int v2;
        int v = this.n(this.f + this.size());
        int v1 = this.f;
        if(v1 < v) {
            v2 = v - 1;
            if(v1 <= v2) {
                while(true) {
                    if(k.a(object0, this.g[v2])) {
                        return v2 - this.f;
                    }
                    if(v2 == v1) {
                        break;
                    }
                    --v2;
                }
            }
        }
        else if(v1 > v) {
            for(int v3 = v - 1; -1 < v3; --v3) {
                if(k.a(object0, this.g[v3])) {
                    return v3 + this.g.length - this.f;
                }
            }
            v2 = m.n(this.g);
            int v4 = this.f;
            if(v4 <= v2) {
                while(true) {
                    if(k.a(object0, this.g[v2])) {
                        return v2 - this.f;
                    }
                    if(v2 == v4) {
                        break;
                    }
                    --v2;
                }
            }
        }
        return -1;
    }

    private final void m(int v, int v1) {
        if(v < v1) {
            l.g(this.g, null, v, v1);
            return;
        }
        l.g(this.g, null, v, this.g.length);
        l.g(this.g, null, 0, v1);
    }

    private final int n(int v) {
        return v < this.g.length ? v : v - this.g.length;
    }

    private final void o() {
        ++this.modCount;
    }

    // 去混淆评级： 低(20)
    public final Object p() {
        return this.isEmpty() ? null : this.removeFirst();
    }

    private final void q(int v, int v1) {
        int v2 = this.n(this.f + (v - 1));
        int v3 = this.n(this.f + (v1 - 1));
        while(v > 0) {
            int v4 = Math.min(v, Math.min(v2 + 1, v3 + 1));
            int v5 = v3 - v4;
            int v6 = v2 - v4;
            i.d(this.g, this.g, v5 + 1, v6 + 1, v2 + 1);
            v2 = this.l(v6);
            v3 = this.l(v5);
            v -= v4;
        }
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v == -1) {
            return false;
        }
        this.remove(v);
        return true;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        int v3;
        k.e(collection0, "elements");
        int v = 0;
        if(!this.isEmpty() && this.g.length != 0) {
            int v1 = this.n(this.f + this.size());
            int v2 = this.f;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.g[v2];
                    if(collection0.contains(object0)) {
                        v = 1;
                    }
                    else {
                        this.g[v3] = object0;
                        ++v3;
                    }
                    ++v2;
                }
                l.g(this.g, null, v3, v1);
            }
            else {
                int v4 = 0;
                int v5 = v2;
                while(v2 < this.g.length) {
                    Object[] arr_object = this.g;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(collection0.contains(object1)) {
                        v4 = 1;
                    }
                    else {
                        this.g[v5] = object1;
                        ++v5;
                    }
                    ++v2;
                }
                v3 = this.n(v5);
                while(v < v1) {
                    Object[] arr_object1 = this.g;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(collection0.contains(object2)) {
                        v4 = 1;
                    }
                    else {
                        this.g[v3] = object2;
                        v3 = this.k(v3);
                    }
                    ++v;
                }
                v = v4;
            }
            if(v) {
                this.o();
                this.h = this.l(v3 - this.f);
            }
        }
        return v != 0;
    }

    @Override
    public final Object removeFirst() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        this.o();
        Object[] arr_object = this.g;
        int v = this.f;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.f = this.k(v);
        this.h = this.size() - 1;
        return object0;
    }

    @Override
    public final Object removeLast() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        this.o();
        int v = this.n(this.f + o.j(this));
        Object[] arr_object = this.g;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.h = this.size() - 1;
        return object0;
    }

    @Override
    protected void removeRange(int v, int v1) {
        c.f.c(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == 0) {
            return;
        }
        if(v2 == this.size()) {
            this.clear();
            return;
        }
        if(v2 == 1) {
            this.remove(v);
            return;
        }
        this.o();
        if(v < this.size() - v1) {
            this.q(v, v1);
            int v3 = this.n(this.f + v2);
            this.m(this.f, v3);
            this.f = v3;
        }
        else {
            this.s(v, v1);
            int v4 = this.n(this.f + this.size());
            this.m(this.l(v4 - v2), v4);
        }
        this.h = this.size() - v2;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        int v3;
        k.e(collection0, "elements");
        int v = 0;
        if(!this.isEmpty() && this.g.length != 0) {
            int v1 = this.n(this.f + this.size());
            int v2 = this.f;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.g[v2];
                    if(collection0.contains(object0)) {
                        this.g[v3] = object0;
                        ++v3;
                    }
                    else {
                        v = 1;
                    }
                    ++v2;
                }
                l.g(this.g, null, v3, v1);
            }
            else {
                int v4 = 0;
                int v5 = v2;
                while(v2 < this.g.length) {
                    Object[] arr_object = this.g;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(collection0.contains(object1)) {
                        this.g[v5] = object1;
                        ++v5;
                    }
                    else {
                        v4 = 1;
                    }
                    ++v2;
                }
                v3 = this.n(v5);
                while(v < v1) {
                    Object[] arr_object1 = this.g;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(collection0.contains(object2)) {
                        this.g[v3] = object2;
                        v3 = this.k(v3);
                    }
                    else {
                        v4 = 1;
                    }
                    ++v;
                }
                v = v4;
            }
            if(v) {
                this.o();
                this.h = this.l(v3 - this.f);
            }
        }
        return v != 0;
    }

    private final void s(int v, int v1) {
        int v2 = this.n(this.f + v1);
        int v3 = this.n(this.f + v);
        int v4 = this.size();
        while(true) {
            v4 -= v1;
            if(v4 <= 0) {
                break;
            }
            v1 = Math.min(v4, Math.min(this.g.length - v2, this.g.length - v3));
            int v5 = v2 + v1;
            i.d(this.g, this.g, v3, v2, v5);
            v2 = this.n(v5);
            v3 = this.n(v3 + v1);
        }
    }

    @Override
    public Object set(int v, Object object0) {
        c.f.a(v, this.size());
        int v1 = this.n(this.f + v);
        Object[] arr_object = this.g;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        k.e(arr_object, "array");
        if(arr_object.length < this.size()) {
            arr_object = j.a(arr_object, this.size());
        }
        int v = this.n(this.f + this.size());
        int v1 = this.f;
        if(v1 < v) {
            l.e(this.g, arr_object, 0, v1, v, 2, null);
            return o.f(this.size(), arr_object);
        }
        if(!this.isEmpty()) {
            i.d(this.g, arr_object, 0, this.f, this.g.length);
            i.d(this.g, arr_object, this.g.length - this.f, 0, v);
        }
        return o.f(this.size(), arr_object);
    }
}

