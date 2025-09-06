package androidx.work;

import android.content.Context;

public abstract class w {
    private static final String a;

    static {
        w.a = "WM-WorkerFactory";
    }

    public abstract j a(Context arg1, String arg2, WorkerParameters arg3);

    public final j b(Context context0, String s, WorkerParameters workerParameters0) {
        Class class0;
        j j0 = this.a(context0, s, workerParameters0);
        if(j0 == null) {
            try {
                class0 = Class.forName(s).asSubclass(j.class);
            }
            catch(Throwable throwable0) {
                k.e().d("WM-WorkerFactory", "Invalid class: " + s, throwable0);
                class0 = null;
            }
            if(class0 != null) {
                try {
                    j0 = (j)class0.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context0, workerParameters0);
                }
                catch(Throwable throwable1) {
                    k.e().d("WM-WorkerFactory", "Could not instantiate " + s, throwable1);
                }
            }
        }
        if(j0 != null && j0.isUsed()) {
            throw new IllegalStateException("WorkerFactory (" + this.getClass().getName() + ") returned an instance of a ListenableWorker (" + s + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return j0;
    }

    public static w c() {
        class a extends w {
            a() {
                super();
            }

            @Override  // androidx.work.w
            public j a(Context context0, String s, WorkerParameters workerParameters0) {
                return null;
            }
        }

        return new a();
    }
}

