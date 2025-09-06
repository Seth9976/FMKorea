package com.google.android.gms.internal.ads;

import Z1.d;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Set;

public final class zzepo implements zzesj {
    private final zzfyo zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzepo(zzfyo zzfyo0, ViewGroup viewGroup0, Context context0, Set set0) {
        this.zza = zzfyo0;
        this.zzd = set0;
        this.zzb = viewGroup0;
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 22;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzepn zzepn0 = () -> {
            Boolean boolean0 = null;
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfL)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
                return new zzepp(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfM)).booleanValue() && this.zzd.contains("native")) {
                Context context0 = this.zzc;
                if(context0 instanceof Activity) {
                    boolean z = false;
                    Activity activity0 = (Activity)context0;
                    Window window0 = activity0.getWindow();
                    if(window0 != null && (window0.getAttributes().flags & 0x1000000) != 0) {
                        return new zzepp(Boolean.TRUE);
                    }
                    try {
                        if((activity0.getPackageManager().getActivityInfo(activity0.getComponentName(), 0).flags & 0x200) != 0) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                    return new zzepp(boolean0);
                }
            }
            return new zzepp(null);
        };
        return this.zza.zzb(zzepn0);
    }

    // 检测为 Lambda 实现
    final zzepp zzc() [...]
}

