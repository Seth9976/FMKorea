package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.E;
import java.util.List;
import java.util.Map;

final class i implements d0 {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.o.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.s.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.u.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.r.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.v.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.w.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.x.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.y.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final h a;
    private int b;
    private int c;
    private int d;

    private i(h h0) {
        this.d = 0;
        h h1 = (h)y.b(h0, "input");
        this.a = h1;
        h1.d = this;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public g A() {
        this.U(2);
        return this.a.n();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void B(List list0) {
        int v2;
        if(list0 instanceof u) {
            E.a(list0);
            switch(this.b & 7) {
                case 2: {
                    this.V(this.a.C());
                    this.a.d();
                    this.a.s();
                    throw null;
                }
                case 5: {
                    this.a.s();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 2: {
                int v = this.a.C();
                this.V(v);
                int v1 = this.a.d();
                do {
                    list0.add(this.a.s());
                }
                while(this.a.d() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw z.d();
            }
        }
        do {
            list0.add(this.a.s());
            if(this.a.e()) {
                return;
            }
            v2 = this.a.B();
        }
        while(v2 == this.b);
        this.d = v2;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int C() {
        this.U(0);
        return this.a.t();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void D(List list0, e0 e00, o o0) {
        if((this.b & 7) != 3) {
            throw z.d();
        }
        int v = this.b;
        while(true) {
            list0.add(this.P(e00, o0));
            if(this.a.e() || this.d != 0) {
                break;
            }
            int v1 = this.a.B();
            if(v1 != v) {
                this.d = v1;
                return;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public boolean E() {
        if(!this.a.e()) {
            return this.b == this.c ? false : this.a.E(this.b);
        }
        return false;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int F() {
        this.U(5);
        return this.a.v();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void G(List list0) {
        int v;
        if((this.b & 7) != 2) {
            throw z.d();
        }
        do {
            list0.add(this.A());
            if(this.a.e()) {
                return;
            }
            v = this.a.B();
        }
        while(v == this.b);
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void H(List list0) {
        int v;
        if(list0 instanceof l) {
            E.a(list0);
            switch(this.b & 7) {
                case 1: {
                    this.a.o();
                    throw null;
                }
                case 2: {
                    this.W(this.a.C());
                    this.a.d();
                    this.a.o();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(this.a.o());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                this.W(v1);
                int v2 = this.a.d();
                do {
                    list0.add(this.a.o());
                }
                while(this.a.d() < v2 + v1);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void I(List list0, e0 e00, o o0) {
        if((this.b & 7) != 2) {
            throw z.d();
        }
        int v = this.b;
        while(true) {
            list0.add(this.Q(e00, o0));
            if(this.a.e() || this.d != 0) {
                break;
            }
            int v1 = this.a.B();
            if(v1 != v) {
                this.d = v1;
                return;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public long J() {
        this.U(0);
        return this.a.u();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public String K() {
        this.U(2);
        return this.a.A();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void L(List list0) {
        int v;
        if(list0 instanceof F) {
            E.a(list0);
            switch(this.b & 7) {
                case 1: {
                    this.a.r();
                    throw null;
                }
                case 2: {
                    this.W(this.a.C());
                    this.a.d();
                    this.a.r();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(this.a.r());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                this.W(v1);
                int v2 = this.a.d();
                do {
                    list0.add(this.a.r());
                }
                while(this.a.d() < v2 + v1);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public Object M(e0 e00, o o0) {
        this.U(3);
        return this.P(e00, o0);
    }

    public static i N(h h0) {
        i i0 = h0.d;
        return i0 == null ? new i(h0) : i0;
    }

    private Object O(b r0$b0, Class class0, o o0) {
        switch(r0$b0) {
            case 1: {
                return Boolean.valueOf(this.i());
            }
            case 2: {
                return this.A();
            }
            case 3: {
                return this.readDouble();
            }
            case 4: {
                return this.r();
            }
            case 5: {
                return this.h();
            }
            case 6: {
                return this.d();
            }
            case 7: {
                return this.readFloat();
            }
            case 8: {
                return this.C();
            }
            case 9: {
                return this.J();
            }
            case 10: {
                return this.R(class0, o0);
            }
            case 11: {
                return this.F();
            }
            case 12: {
                return this.j();
            }
            case 13: {
                return this.t();
            }
            case 14: {
                return this.u();
            }
            case 15: {
                return this.K();
            }
            case 16: {
                return this.l();
            }
            case 17: {
                return this.c();
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    private Object P(e0 e00, o o0) {
        int v1;
        try {
            v1 = this.c;
            this.c = this.b >>> 3 << 3 | 4;
            Object object0 = e00.h();
            e00.b(object0, this, o0);
            e00.c(object0);
            if(this.b == this.c) {
                return object0;
            }
        }
        finally {
            this.c = v1;
        }
        throw z.g();
    }

    private Object Q(e0 e00, o o0) {
        int v = this.a.C();
        h h0 = this.a;
        if(h0.a >= h0.b) {
            throw z.h();
        }
        int v1 = h0.l(v);
        Object object0 = e00.h();
        ++this.a.a;
        e00.b(object0, this, o0);
        e00.c(object0);
        this.a.a(0);
        --this.a.a;
        this.a.k(v1);
        return object0;
    }

    public Object R(Class class0, o o0) {
        this.U(2);
        return this.Q(a0.a().c(class0), o0);
    }

    public void S(List list0, boolean z) {
        int v1;
        int v;
        if((this.b & 7) != 2) {
            throw z.d();
        }
        if(list0 instanceof D && !z) {
            do {
                ((D)list0).j(this.A());
                if(this.a.e()) {
                    return;
                }
                v = this.a.B();
            }
            while(v == this.b);
            this.d = v;
            return;
        }
        do {
            list0.add((z ? this.K() : this.w()));
            if(this.a.e()) {
                return;
            }
            v1 = this.a.B();
        }
        while(v1 == this.b);
        this.d = v1;
    }

    private void T(int v) {
        if(this.a.d() != v) {
            throw z.k();
        }
    }

    private void U(int v) {
        if((this.b & 7) != v) {
            throw z.d();
        }
    }

    private void V(int v) {
        if((v & 3) != 0) {
            throw z.g();
        }
    }

    private void W(int v) {
        if((v & 7) != 0) {
            throw z.g();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public Object a(e0 e00, o o0) {
        this.U(2);
        return this.Q(e00, o0);
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void b(List list0) {
        int v;
        if(list0 instanceof x) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.x();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.x();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.x());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.x());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public long c() {
        this.U(0);
        return this.a.D();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public long d() {
        this.U(1);
        return this.a.r();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void e(List list0) {
        int v2;
        if(list0 instanceof x) {
            E.a(list0);
            switch(this.b & 7) {
                case 2: {
                    this.V(this.a.C());
                    this.a.d();
                    this.a.v();
                    throw null;
                }
                case 5: {
                    this.a.v();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 2: {
                int v = this.a.C();
                this.V(v);
                int v1 = this.a.d();
                do {
                    list0.add(this.a.v());
                }
                while(this.a.d() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw z.d();
            }
        }
        do {
            list0.add(this.a.v());
            if(this.a.e()) {
                return;
            }
            v2 = this.a.B();
        }
        while(v2 == this.b);
        this.d = v2;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void f(List list0) {
        int v;
        if(list0 instanceof F) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.y();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.y();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.y());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.y());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void g(List list0) {
        int v;
        if(list0 instanceof x) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.C();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.C();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.C());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.C());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int getTag() {
        return this.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int h() {
        this.U(5);
        return this.a.q();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public boolean i() {
        this.U(0);
        return this.a.m();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public long j() {
        this.U(1);
        return this.a.w();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void k(List list0) {
        int v;
        if(list0 instanceof F) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.D();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.D();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.D());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.D());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int l() {
        this.U(0);
        return this.a.C();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void m(List list0) {
        int v;
        if(list0 instanceof F) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.u();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.u();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.u());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.u());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void n(List list0) {
        int v;
        if(list0 instanceof F) {
            E.a(list0);
            switch(this.b & 7) {
                case 1: {
                    this.a.w();
                    throw null;
                }
                case 2: {
                    this.W(this.a.C());
                    this.a.d();
                    this.a.w();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(this.a.w());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                this.W(v1);
                int v2 = this.a.d();
                do {
                    list0.add(this.a.w());
                }
                while(this.a.d() < v2 + v1);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void o(List list0) {
        int v;
        if(list0 instanceof x) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.t();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.t();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.t());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.t());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void p(List list0) {
        int v;
        if(list0 instanceof x) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.p();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.p();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(this.a.p());
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(this.a.p());
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void q(Map map0, androidx.datastore.preferences.protobuf.H.a h$a0, o o0) {
        this.U(2);
        int v = this.a.C();
        int v1 = this.a.l(v);
        Object object0 = h$a0.b;
        Object object1 = h$a0.d;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v3 = this.x();
                    if(v3 == 0x7FFFFFFF || this.a.e()) {
                        break alab1;
                    }
                    try {
                        switch(v3) {
                            case 1: {
                                object0 = this.O(h$a0.a, null, null);
                                continue;
                            }
                            case 2: {
                                goto label_14;
                            }
                            default: {
                                if(this.E()) {
                                    continue;
                                }
                            }
                        }
                        throw new z("Unable to parse map entry.");
                    label_14:
                        Class class0 = h$a0.d.getClass();
                        object1 = this.O(h$a0.c, class0, o0);
                        continue;
                    }
                    catch(androidx.datastore.preferences.protobuf.z.a unused_ex) {
                    }
                    break;
                }
                if(!this.E()) {
                    throw new z("Unable to parse map entry.");
                }
            }
            map0.put(object0, object1);
        }
        finally {
            this.a.k(v1);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int r() {
        this.U(0);
        return this.a.p();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public double readDouble() {
        this.U(1);
        return this.a.o();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public float readFloat() {
        this.U(5);
        return this.a.s();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void s(List list0) {
        int v2;
        if(list0 instanceof x) {
            E.a(list0);
            switch(this.b & 7) {
                case 2: {
                    this.V(this.a.C());
                    this.a.d();
                    this.a.q();
                    throw null;
                }
                case 5: {
                    this.a.q();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 2: {
                int v = this.a.C();
                this.V(v);
                int v1 = this.a.d();
                do {
                    list0.add(this.a.q());
                }
                while(this.a.d() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw z.d();
            }
        }
        do {
            list0.add(this.a.q());
            if(this.a.e()) {
                return;
            }
            v2 = this.a.B();
        }
        while(v2 == this.b);
        this.d = v2;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int t() {
        this.U(0);
        return this.a.x();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public long u() {
        this.U(0);
        return this.a.y();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void v(List list0) {
        int v;
        if(list0 instanceof e) {
            E.a(list0);
            switch(this.b & 7) {
                case 0: {
                    this.a.m();
                    throw null;
                }
                case 2: {
                    this.a.C();
                    this.a.d();
                    this.a.m();
                    throw null;
                }
                default: {
                    throw z.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.a.m()));
                    if(this.a.e()) {
                        return;
                    }
                    v = this.a.B();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = this.a.C();
                int v2 = this.a.d() + v1;
                do {
                    list0.add(Boolean.valueOf(this.a.m()));
                }
                while(this.a.d() < v2);
                this.T(v2);
                return;
            }
            default: {
                throw z.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public String w() {
        this.U(2);
        return this.a.z();
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public int x() {
        int v = this.d;
        if(v != 0) {
            this.b = v;
            this.d = 0;
            return this.b == 0 || this.b == this.c ? 0x7FFFFFFF : this.b >>> 3;
        }
        this.b = this.a.B();
        return this.b == 0 || this.b == this.c ? 0x7FFFFFFF : this.b >>> 3;
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void y(List list0) {
        this.S(list0, false);
    }

    @Override  // androidx.datastore.preferences.protobuf.d0
    public void z(List list0) {
        this.S(list0, true);
    }
}

