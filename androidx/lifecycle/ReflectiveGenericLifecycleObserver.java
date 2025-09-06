package androidx.lifecycle;

@Deprecated
class ReflectiveGenericLifecycleObserver implements l {
    private final Object f;
    private final a g;

    ReflectiveGenericLifecycleObserver(Object object0) {
        this.f = object0;
        this.g = b.c.c(object0.getClass());
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, androidx.lifecycle.h.a h$a0) {
        this.g.a(n0, h$a0, this.f);
    }
}

