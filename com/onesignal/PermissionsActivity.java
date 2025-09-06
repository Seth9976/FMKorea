package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.HashMap;

public class PermissionsActivity extends Activity {
    interface c {
        void a();

        void b(boolean arg1);
    }

    private String f;
    private String g;
    private static final String h = "com.onesignal.PermissionsActivity";
    private static boolean i;
    private static boolean j;
    private static boolean k;
    private static b l;
    private static final HashMap m;

    static {
        PermissionsActivity.m = new HashMap();
    }

    private void d(Bundle bundle0) {
        this.g(bundle0);
        this.f = bundle0.getString("INTENT_EXTRA_PERMISSION_TYPE");
        String s = bundle0.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.g = s;
        this.f(s);
    }

    public static void e(String s, c permissionsActivity$c0) {
        PermissionsActivity.m.put(s, permissionsActivity$c0);
    }

    private void f(String s) {
        if(!PermissionsActivity.i) {
            PermissionsActivity.i = true;
            PermissionsActivity.k = true ^ f.b(this, s);
            f.a(this, new String[]{s}, 2);
        }
    }

    private void g(Bundle bundle0) {
        String s = bundle0.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(s);
        }
        catch(ClassNotFoundException unused_ex) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + s);
        }
    }

    // 去混淆评级： 低(30)
    private boolean h() {
        return PermissionsActivity.j && PermissionsActivity.k && !f.b(this, this.g);
    }

    static void i(boolean z, String s, String s1, Class class0) {
        class com.onesignal.PermissionsActivity.b extends b {
            final String a;
            final String b;
            final Class c;

            com.onesignal.PermissionsActivity.b(String s, String s1, Class class0) {
                this.b = s1;
                this.c = class0;
                super();
            }

            @Override  // com.onesignal.a$b
            public void a(Activity activity0) {
                Class class0 = activity0.getClass();
                Class class1 = PermissionsActivity.class;
                if(!class0.equals(class1)) {
                    Intent intent0 = new Intent(activity0, class1);
                    intent0.setFlags(0x20000);
                    intent0.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.c.getName());
                    activity0.startActivity(intent0);
                    activity0.overridePendingTransition(e2.a, e2.b);
                }
            }
        }

        if(PermissionsActivity.i) {
            return;
        }
        PermissionsActivity.j = z;
        PermissionsActivity.l = new com.onesignal.PermissionsActivity.b(s, s1, class0);
        a a0 = com.onesignal.b.b();
        if(a0 != null) {
            a0.c("com.onesignal.PermissionsActivity", PermissionsActivity.l);
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        I1.X0(this);
        this.d(this.getIntent().getExtras());
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.d(intent0.getExtras());
    }

    @Override  // android.app.Activity
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        class com.onesignal.PermissionsActivity.a implements Runnable {
            final int[] f;
            final PermissionsActivity g;

            com.onesignal.PermissionsActivity.a(int[] arr_v) {
                this.f = arr_v;
                super();
            }

            @Override
            public void run() {
                boolean z = this.f.length > 0 && this.f[0] == 0;
                c permissionsActivity$c0 = (c)PermissionsActivity.m.get(PermissionsActivity.this.f);
                if(permissionsActivity$c0 == null) {
                    throw new RuntimeException("Missing handler for permissionRequestType: " + PermissionsActivity.this.f);
                }
                if(z) {
                    permissionsActivity$c0.a();
                    return;
                }
                permissionsActivity$c0.b(PermissionsActivity.this.h());
            }
        }

        PermissionsActivity.i = false;
        if(v == 2) {
            new Handler().postDelayed(new com.onesignal.PermissionsActivity.a(this, arr_v), 500L);
        }
        a a0 = com.onesignal.b.b();
        if(a0 != null) {
            a0.r("com.onesignal.PermissionsActivity");
        }
        this.finish();
        this.overridePendingTransition(e2.a, e2.b);
    }
}

