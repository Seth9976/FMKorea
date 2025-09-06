package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class zzaz {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final zzbb zze;
    private final String zzf;

    zzaz(zzhf zzhf0, String s, String s1, String s2, long v, long v1, Bundle bundle0) {
        Preconditions.checkNotEmpty(s1);
        zzbb zzbb0;
        Preconditions.checkNotEmpty(s2);
        this.zza = s1;
        this.zzb = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzf = s;
        this.zzc = v;
        this.zzd = v1;
        if(v1 != 0L && v1 > v) {
            zzhf0.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId", zzfr.zza(s1));
        }
        if(bundle0 == null || bundle0.isEmpty()) {
            zzbb0 = new zzbb(new Bundle());
        }
        else {
            Bundle bundle1 = new Bundle(bundle0);
            Iterator iterator0 = bundle1.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s3 = (String)object0;
                if(s3 == null) {
                    zzhf0.zzj().zzg().zza("Param name can\'t be null");
                    iterator0.remove();
                }
                else {
                    Object object1 = zzhf0.zzt().zzb(s3, bundle1.get(s3));
                    if(object1 == null) {
                        zzhf0.zzj().zzu().zza("Param value can\'t be null", zzhf0.zzk().zzb(s3));
                        iterator0.remove();
                    }
                    else {
                        zzhf0.zzt().zza(bundle1, s3, object1);
                    }
                }
            }
            zzbb0 = new zzbb(bundle1);
        }
        this.zze = zzbb0;
    }

    private zzaz(zzhf zzhf0, String s, String s1, String s2, long v, long v1, zzbb zzbb0) {
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotEmpty(s2);
        Preconditions.checkNotNull(zzbb0);
        this.zza = s1;
        this.zzb = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzf = s;
        this.zzc = v;
        this.zzd = v1;
        if(v1 != 0L && v1 > v) {
            zzhf0.zzj().zzu().zza("Event created with reverse previous/current timestamps. appId, name", zzfr.zza(s1), zzfr.zza(s2));
        }
        this.zze = zzbb0;
    }

    @Override
    public final String toString() {
        return "Event{appId=\'" + this.zza + "\', name=\'" + this.zzb + "\', params=" + this.zze + "}";
    }

    final zzaz zza(zzhf zzhf0, long v) {
        return new zzaz(zzhf0, this.zzf, this.zza, this.zzb, this.zzc, v, this.zze);
    }
}

