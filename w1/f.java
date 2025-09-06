package W1;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzbg;
import com.google.android.gms.internal.consent_sdk.zzbh;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzct;

public abstract class f {
    public interface a {
        void onConsentFormLoadFailure(e arg1);
    }

    public interface b {
        void onConsentFormLoadSuccess(W1.b arg1);
    }

    public static c a(Context context0) {
        return zzc.zza(context0).zzb();
    }

    public static void b(Activity activity0, W1.b.a b$a0) {
        if(zzc.zza(activity0).zzb().canRequestAds()) {
            b$a0.a(null);
            return;
        }
        zzbq zzbq0 = zzc.zza(activity0).zzc();
        zzct.zza();
        zzbg zzbg0 = new zzbg(activity0, b$a0);
        b$a0.getClass();
        zzbq0.zzb(zzbg0, new zzbh(b$a0));
    }
}

