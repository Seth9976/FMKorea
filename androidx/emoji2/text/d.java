package androidx.emoji2.text;

import B.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.f;

public abstract class d {
    public static class a {
        private final b a;

        public a(b d$b0) {
            if(d$b0 == null) {
                d$b0 = a.e();
            }
            this.a = d$b0;
        }

        private c a(Context context0, f f0) {
            return f0 == null ? null : new k(context0, f0);
        }

        private List b(Signature[] arr_signature) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_signature.length; ++v) {
                arrayList0.add(arr_signature[v].toByteArray());
            }
            return Collections.singletonList(arrayList0);
        }

        public c c(Context context0) {
            return this.a(context0, this.h(context0));
        }

        private f d(ProviderInfo providerInfo0, PackageManager packageManager0) {
            return new f(providerInfo0.authority, providerInfo0.packageName, "emojicompat-emoji-font", this.b(this.a.b(packageManager0, providerInfo0.packageName)));
        }

        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.d.d() : new androidx.emoji2.text.d.c();
        }

        // 去混淆评级： 低(20)
        private boolean f(ProviderInfo providerInfo0) {
            return providerInfo0 != null && (providerInfo0.applicationInfo != null && (providerInfo0.applicationInfo.flags & 1) == 1);
        }

        private ProviderInfo g(PackageManager packageManager0) {
            Intent intent0 = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
            for(Object object0: this.a.c(packageManager0, intent0, 0)) {
                ProviderInfo providerInfo0 = this.a.a(((ResolveInfo)object0));
                if(this.f(providerInfo0)) {
                    return providerInfo0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        f h(Context context0) {
            PackageManager packageManager0 = context0.getPackageManager();
            h.h(packageManager0, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfo0 = this.g(packageManager0);
            if(providerInfo0 == null) {
                return null;
            }
            try {
                return this.d(providerInfo0, packageManager0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", packageManager$NameNotFoundException0);
                return null;
            }
        }
    }

    public static abstract class b {
        public abstract ProviderInfo a(ResolveInfo arg1);

        public Signature[] b(PackageManager packageManager0, String s) {
            return packageManager0.getPackageInfo(s, 0x40).signatures;
        }

        public abstract List c(PackageManager arg1, Intent arg2, int arg3);
    }

    public static class androidx.emoji2.text.d.c extends b {
        @Override  // androidx.emoji2.text.d$b
        public ProviderInfo a(ResolveInfo resolveInfo0) {
            return resolveInfo0.providerInfo;
        }

        @Override  // androidx.emoji2.text.d$b
        public List c(PackageManager packageManager0, Intent intent0, int v) {
            return packageManager0.queryIntentContentProviders(intent0, v);
        }
    }

    public static class androidx.emoji2.text.d.d extends androidx.emoji2.text.d.c {
        @Override  // androidx.emoji2.text.d$b
        public Signature[] b(PackageManager packageManager0, String s) {
            return packageManager0.getPackageInfo(s, 0x40).signatures;
        }
    }

    public static k a(Context context0) {
        return (k)new a(null).c(context0);
    }
}

