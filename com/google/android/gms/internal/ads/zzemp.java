package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;

public final class zzemp implements zzesj {
    private final zzesj zza;
    private final zzfca zzb;
    private final Context zzc;
    private final zzbzj zzd;

    public zzemp(zzeoj zzeoj0, zzfca zzfca0, Context context0, zzbzj zzbzj0) {
        this.zza = zzeoj0;
        this.zzb = zzfca0;
        this.zzc = context0;
        this.zzd = zzbzj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 7;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return zzfye.zzm(this.zza.zzb(), (zzeso zzeso0) -> {
            float f1;
            int v3;
            String s1;
            int v2;
            boolean z;
            String s;
            zzq zzq0 = this.zzb.zze;
            zzq[] arr_zzq = zzq0.zzg;
            if(arr_zzq == null) {
                s = zzq0.zza;
                z = zzq0.zzi;
            }
            else {
                s = null;
                boolean z1 = false;
                boolean z2 = false;
                z = false;
                for(int v = 0; v < arr_zzq.length; ++v) {
                    zzq zzq1 = arr_zzq[v];
                    boolean z3 = zzq1.zzi;
                    if(!z3 && !z1) {
                        s = zzq1.zza;
                        z1 = true;
                    }
                    if(z3) {
                        if(z2) {
                            z2 = true;
                        }
                        else {
                            z2 = true;
                            z = true;
                        }
                    }
                    if(z1 && z2) {
                        break;
                    }
                }
            }
            Resources resources0 = this.zzc.getResources();
            if(resources0 == null) {
            label_37:
                s1 = null;
                f1 = 0.0f;
                v2 = 0;
                v3 = 0;
            }
            else {
                DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                if(displayMetrics0 != null) {
                    float f = displayMetrics0.density;
                    int v1 = displayMetrics0.widthPixels;
                    v2 = displayMetrics0.heightPixels;
                    s1 = this.zzd.zzh().zzm();
                    v3 = v1;
                    f1 = f;
                    goto label_41;
                }
                goto label_37;
            }
        label_41:
            StringBuilder stringBuilder0 = new StringBuilder();
            zzq[] arr_zzq1 = zzq0.zzg;
            if(arr_zzq1 != null) {
                boolean z4 = false;
                for(int v4 = 0; v4 < arr_zzq1.length; ++v4) {
                    zzq zzq2 = arr_zzq1[v4];
                    if(zzq2.zzi) {
                        z4 = true;
                    }
                    else {
                        if(stringBuilder0.length() != 0) {
                            stringBuilder0.append("|");
                        }
                        int v5 = zzq2.zze;
                        if(v5 == -1) {
                            v5 = f1 == 0.0f ? -1 : ((int)(((float)zzq2.zzf) / f1));
                        }
                        stringBuilder0.append(v5);
                        stringBuilder0.append("x");
                        int v6 = zzq2.zzb;
                        if(v6 == -2) {
                            v6 = f1 == 0.0f ? -2 : ((int)(((float)zzq2.zzc) / f1));
                        }
                        stringBuilder0.append(v6);
                    }
                }
                if(z4) {
                    if(stringBuilder0.length() != 0) {
                        stringBuilder0.insert(0, "|");
                    }
                    stringBuilder0.insert(0, "320x50");
                }
            }
            return new zzemq(zzq0, s, z, stringBuilder0.toString(), f1, v3, v2, s1, this.zzb.zzp);
        }, zzcan.zzf);
    }

    // 检测为 Lambda 实现
    final zzemq zzc(zzeso zzeso0) [...]
}

