package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;

public final class d {
    static abstract class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    static abstract class b {
        static String a() {
            LocaleList localeList0 = LocaleList.getAdjustedDefault();
            return localeList0.size() <= 0 ? null : localeList0.get(0).toLanguageTag();
        }
    }

    static abstract class c {
        static void a(ActivityOptions activityOptions0, boolean z) {
            activityOptions0.setShareIdentityEnabled(z);
        }
    }

    public static final class androidx.browser.customtabs.d.d {
        private final Intent a;
        private final androidx.browser.customtabs.a.a b;
        private ArrayList c;
        private ActivityOptions d;
        private ArrayList e;
        private SparseArray f;
        private Bundle g;
        private int h;
        private boolean i;
        private boolean j;

        public androidx.browser.customtabs.d.d() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new androidx.browser.customtabs.a.a();
            this.h = 0;
            this.i = true;
        }

        public androidx.browser.customtabs.d.d(f f0) {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new androidx.browser.customtabs.a.a();
            this.h = 0;
            this.i = true;
            if(f0 != null) {
                this.d(f0);
            }
        }

        public d a() {
            Bundle bundle0 = null;
            if(!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                this.e(null, null);
            }
            ArrayList arrayList0 = this.c;
            if(arrayList0 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList0);
            }
            ArrayList arrayList1 = this.e;
            if(arrayList1 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList1);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            Bundle bundle1 = this.b.a().a();
            this.a.putExtras(bundle1);
            Bundle bundle2 = this.g;
            if(bundle2 != null) {
                this.a.putExtras(bundle2);
            }
            if(this.f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle3);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            int v = Build.VERSION.SDK_INT;
            if(v >= 24) {
                this.b();
            }
            if(v >= 34) {
                this.f();
            }
            ActivityOptions activityOptions0 = this.d;
            if(activityOptions0 != null) {
                bundle0 = activityOptions0.toBundle();
            }
            return new d(this.a, bundle0);
        }

        private void b() {
            String s = b.a();
            if(!TextUtils.isEmpty(s)) {
                Bundle bundle0 = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if(!bundle0.containsKey("Accept-Language")) {
                    bundle0.putString("Accept-Language", s);
                    this.a.putExtra("com.android.browser.headers", bundle0);
                }
            }
        }

        public androidx.browser.customtabs.d.d c(androidx.browser.customtabs.a a0) {
            this.g = a0.a();
            return this;
        }

        public androidx.browser.customtabs.d.d d(f f0) {
            String s = f0.d().getPackageName();
            this.a.setPackage(s);
            this.e(f0.c(), f0.e());
            return this;
        }

        private void e(IBinder iBinder0, PendingIntent pendingIntent0) {
            Bundle bundle0 = new Bundle();
            bundle0.putBinder("android.support.customtabs.extra.SESSION", iBinder0);
            if(pendingIntent0 != null) {
                bundle0.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
            }
            this.a.putExtras(bundle0);
        }

        private void f() {
            if(this.d == null) {
                this.d = a.a();
            }
            c.a(this.d, this.j);
        }
    }

    public final Intent a;
    public final Bundle b;

    d(Intent intent0, Bundle bundle0) {
        this.a = intent0;
        this.b = bundle0;
    }

    public void a(Context context0, Uri uri0) {
        this.a.setData(uri0);
        androidx.core.content.a.startActivity(context0, this.a, this.b);
    }
}

