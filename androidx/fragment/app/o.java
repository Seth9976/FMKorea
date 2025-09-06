package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

class o {
    static final class a {
        final k a;
        final boolean b;

        a(k fragmentManager$k0, boolean z) {
            this.a = fragmentManager$k0;
            this.b = z;
        }
    }

    private final CopyOnWriteArrayList a;
    private final FragmentManager b;

    o(FragmentManager fragmentManager0) {
        this.a = new CopyOnWriteArrayList();
        this.b = fragmentManager0;
    }

    void a(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().a(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void b(Fragment fragment0, boolean z) {
        this.b.u0().g();
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().b(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void c(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().c(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void d(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().d(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void e(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().e(fragment0, true);
        }
        for(Object object0: this.a) {
            a o$a0 = (a)object0;
            if(!z || o$a0.b) {
                o$a0.a.e(this.b, fragment0);
            }
        }
    }

    void f(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().f(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void g(Fragment fragment0, boolean z) {
        this.b.u0().g();
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().g(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void h(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().h(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void i(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().i(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void j(Fragment fragment0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().j(fragment0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void k(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().k(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void l(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().l(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void m(Fragment fragment0, View view0, Bundle bundle0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().m(fragment0, view0, bundle0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    void n(Fragment fragment0, boolean z) {
        Fragment fragment1 = this.b.x0();
        if(fragment1 != null) {
            fragment1.getParentFragmentManager().w0().n(fragment0, true);
        }
        for(Object object0: this.a) {
            if(!z || ((a)object0).b) {
            }
        }
    }

    public void o(k fragmentManager$k0, boolean z) {
        a o$a0 = new a(fragmentManager$k0, z);
        this.a.add(o$a0);
    }

    public void p(k fragmentManager$k0) {
        synchronized(this.a) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((a)this.a.get(v2)).a == fragmentManager$k0) {
                    this.a.remove(v2);
                    break;
                }
            }
        }
    }
}

