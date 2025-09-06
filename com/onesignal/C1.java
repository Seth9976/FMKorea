package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

class c1 {
    private String a;
    private List b;
    private boolean c;

    c1(String s, boolean z) {
        this.a = s;
        this.c = z;
        this.b = new ArrayList();
    }

    void a(Object object0) {
        this.b.add(new WeakReference(object0));
    }

    void b(Object object0) {
        this.b.add(object0);
    }

    boolean c(Object object0) {
        class a implements Runnable {
            final Method f;
            final Object g;
            final Object h;
            final c1 i;

            a(Method method0, Object object0, Object object1) {
                this.f = method0;
                this.g = object0;
                this.h = object1;
                super();
            }

            @Override
            public void run() {
                try {
                    this.f.invoke(this.g, this.h);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    illegalAccessException0.printStackTrace();
                }
                catch(InvocationTargetException invocationTargetException0) {
                    invocationTargetException0.printStackTrace();
                }
            }
        }

        boolean z = false;
        for(Object object1: this.b) {
            if(object1 instanceof WeakReference) {
                object1 = ((WeakReference)object1).get();
            }
            if(object1 != null) {
                Class class0 = object1.getClass();
                try {
                    Method method0 = class0.getDeclaredMethod(this.a, object0.getClass());
                    method0.setAccessible(true);
                    if(this.c) {
                        a c1$a0 = new a(this, method0, object1, object0);
                        q.a.b(c1$a0);
                    }
                    else {
                        try {
                            method0.invoke(object1, object0);
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            illegalAccessException0.printStackTrace();
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            invocationTargetException0.printStackTrace();
                        }
                    }
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    noSuchMethodException0.printStackTrace();
                    continue;
                }
                z = true;
            }
        }
        return z;
    }
}

