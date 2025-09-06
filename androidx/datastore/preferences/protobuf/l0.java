package androidx.datastore.preferences.protobuf;

abstract class l0 {
    abstract void a(Object arg1, int arg2, int arg3);

    abstract void b(Object arg1, int arg2, long arg3);

    abstract void c(Object arg1, int arg2, Object arg3);

    abstract void d(Object arg1, int arg2, g arg3);

    abstract void e(Object arg1, int arg2, long arg3);

    abstract Object f(Object arg1);

    abstract Object g(Object arg1);

    abstract int h(Object arg1);

    abstract int i(Object arg1);

    abstract void j(Object arg1);

    abstract Object k(Object arg1, Object arg2);

    final void l(Object object0, d0 d00) {
        while(d00.x() != 0x7FFFFFFF && this.m(object0, d00)) {
        }
    }

    final boolean m(Object object0, d0 d00) {
        int v = d00.getTag();
        switch(v & 7) {
            case 0: {
                this.e(object0, v >>> 3, d00.J());
                return true;
            }
            case 1: {
                this.b(object0, v >>> 3, d00.d());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            Object object1 = this.n();
                            this.l(object1, d00);
                            if((v >>> 3 << 3 | 4) != d00.getTag()) {
                                throw z.a();
                            }
                            this.c(object0, v >>> 3, this.r(object1));
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw z.d();
                            }
                            this.a(object0, v >>> 3, d00.h());
                            return true;
                        }
                    }
                }
                this.d(object0, v >>> 3, d00.A());
                return true;
            }
        }
    }

    abstract Object n();

    abstract void o(Object arg1, Object arg2);

    abstract void p(Object arg1, Object arg2);

    abstract boolean q(d0 arg1);

    abstract Object r(Object arg1);

    abstract void s(Object arg1, s0 arg2);

    abstract void t(Object arg1, s0 arg2);
}

