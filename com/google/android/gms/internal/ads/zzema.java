package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;

public final class zzema implements zzesj {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final Context zzc;
    private final zzfca zzd;
    private final View zze;

    public zzema(zzfyo zzfyo0, zzfyo zzfyo1, Context context0, zzfca zzfca0, ViewGroup viewGroup0) {
        this.zza = zzfyo0;
        this.zzb = zzfyo1;
        this.zzc = context0;
        this.zzd = zzfca0;
        this.zze = viewGroup0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzbbr.zza(this.zzc);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjW)).booleanValue()) {
            zzely zzely0 = () -> {
                List list0 = this.zze();
                return new zzemb(this.zzc, this.zzd.zze, list0);
            };
            return this.zzb.zzb(zzely0);
        }
        zzelz zzelz0 = () -> {
            List list0 = this.zze();
            return new zzemb(this.zzc, this.zzd.zze, list0);
        };
        return this.zza.zzb(zzelz0);
    }

    // 检测为 Lambda 实现
    final zzemb zzc() [...]

    // 检测为 Lambda 实现
    final zzemb zzd() [...]

    private final List zze() {
        List list0 = new ArrayList();
        for(View view0 = this.zze; view0 != null; view0 = (View)viewParent0) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 == null) {
                break;
            }
            int v = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0).indexOfChild(view0) : -1;
            Bundle bundle0 = new Bundle();
            bundle0.putString("type", viewParent0.getClass().getName());
            bundle0.putInt("index_of_child", v);
            list0.add(bundle0);
            if(!(viewParent0 instanceof View)) {
                break;
            }
        }
        return list0;
    }
}

