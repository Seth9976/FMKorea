package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

public final class zzepb implements Callable {
    public final zzepc zza;

    public zzepb(zzepc zzepc0) {
        this.zza = zzepc0;
    }

    @Override
    public final Object call() {
        String s2;
        String s1;
        String s;
        zzave zzave0 = zzt.zzo().zzh().zzg();
        Bundle bundle0 = null;
        if(zzave0 != null && (!zzt.zzo().zzh().zzN() || !zzt.zzo().zzh().zzO())) {
            if(zzave0.zzh()) {
                zzave0.zzg();
            }
            zzauu zzauu0 = zzave0.zza();
            if(zzauu0 == null) {
                s = zzt.zzo().zzh().zzj();
                s2 = zzt.zzo().zzh().zzk();
                s1 = null;
            }
            else {
                s = zzauu0.zzd();
                s1 = zzauu0.zze();
                s2 = zzauu0.zzf();
                if(s != null) {
                    zzt.zzo().zzh().zzw(s);
                }
                if(s2 != null) {
                    zzt.zzo().zzh().zzy(s2);
                }
            }
            Bundle bundle1 = new Bundle(1);
            if(!zzt.zzo().zzh().zzO()) {
                if(s2 == null || TextUtils.isEmpty(s2)) {
                    bundle1.putString("v_fp_vertical", "no_hash");
                }
                else {
                    bundle1.putString("v_fp_vertical", s2);
                }
            }
            if(s != null && !zzt.zzo().zzh().zzN()) {
                bundle1.putString("fingerprint", s);
                if(!s.equals(s1)) {
                    bundle1.putString("v_fp", s1);
                }
            }
            if(!bundle1.isEmpty()) {
                bundle0 = bundle1;
            }
        }
        return new zzepd(bundle0);
    }
}

