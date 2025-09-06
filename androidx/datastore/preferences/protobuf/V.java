package androidx.datastore.preferences.protobuf;

class v implements N {
    private static final v a;

    static {
        v.a = new v();
    }

    @Override  // androidx.datastore.preferences.protobuf.N
    public M a(Class class0) {
        Class class1 = w.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (M)w.u(class0.asSubclass(class1)).n();
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // androidx.datastore.preferences.protobuf.N
    public boolean b(Class class0) {
        return w.class.isAssignableFrom(class0);
    }

    public static v c() {
        return v.a;
    }
}

