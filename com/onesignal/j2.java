package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class j2 {
    class b implements PurchasingListener {
        PurchasingListener a;
        final j2 b;

        private b() {
        }

        b(a j2$a0) {
        }
    }

    private Context a;
    private boolean b;
    private b c;
    private boolean d;
    private Object e;
    private Field f;

    j2(Context context0) {
        this.b = false;
        this.d = false;
        this.a = context0;
        try {
            Class class0 = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.e = class0.getMethod("d", null).invoke(null, null);
            }
            catch(NullPointerException unused_ex) {
                this.e = class0.getMethod("e", null).invoke(null, null);
                this.d = true;
            }
            Field field0 = class0.getDeclaredField("f");
            this.f = field0;
            field0.setAccessible(true);
            b j2$b0 = new b(this, null);
            this.c = j2$b0;
            j2$b0.a = (PurchasingListener)this.f.get(this.e);
            this.b = true;
            this.e();
        }
        catch(ClassNotFoundException classNotFoundException0) {
            j2.d(classNotFoundException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            j2.d(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            j2.d(invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            j2.d(noSuchMethodException0);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            j2.d(noSuchFieldException0);
        }
        catch(ClassCastException classCastException0) {
            j2.d(classCastException0);
        }
    }

    void c() {
        try {
            if(!this.b) {
                return;
            }
            PurchasingListener purchasingListener0 = (PurchasingListener)this.f.get(this.e);
            b j2$b0 = this.c;
            if(purchasingListener0 != j2$b0) {
                j2$b0.a = purchasingListener0;
                this.e();
            }
        }
        catch(IllegalAccessException illegalAccessException0) {
            illegalAccessException0.printStackTrace();
        }
    }

    private static void d(Exception exception0) {
        I1.b(C.h, "Error adding Amazon IAP listener.", exception0);
        exception0.printStackTrace();
    }

    private void e() {
        class a implements Runnable {
            final j2 f;

            @Override
            public void run() {
                PurchasingService.registerListener(j2.this.a, j2.this.c);
            }
        }

        if(this.d) {
            OSUtils.S(new a(this));
            return;
        }
        PurchasingService.registerListener(this.a, this.c);
    }
}

