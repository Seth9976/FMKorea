package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;

final class zzgo implements Runnable {
    private final zzby zza;
    private final ServiceConnection zzb;
    private final zzgl zzc;

    zzgo(zzgl zzgl0, zzby zzby0, ServiceConnection serviceConnection0) {
        this.zzc = zzgl0;
        this.zza = zzby0;
        this.zzb = serviceConnection0;
        super();
    }

    @Override
    public final void run() {
        zzgm zzgm0 = this.zzc.zza;
        String s = this.zzc.zzb;
        ServiceConnection serviceConnection0 = this.zzb;
        Bundle bundle0 = zzgm0.zza(s, this.zza);
        zzgm0.zza.zzl().zzt();
        zzgm0.zza.zzy();
        if(bundle0 != null) {
            long v = bundle0.getLong("install_begin_timestamp_seconds", 0L);
            if(v * 1000L == 0L) {
                zzgm0.zza.zzj().zzu().zza("Service response is missing Install Referrer install timestamp");
            }
            else {
                String s1 = bundle0.getString("install_referrer");
                if(s1 == null || s1.isEmpty()) {
                    zzgm0.zza.zzj().zzg().zza("No referrer defined in Install Referrer response");
                }
                else {
                    zzgm0.zza.zzj().zzp().zza("InstallReferrer API result", s1);
                    Bundle bundle1 = zzgm0.zza.zzt().zza(Uri.parse(("?" + s1)), zzpy.zza() && zzgm0.zza.zzf().zza(zzbi.zzbz), zzoi.zza() && zzgm0.zza.zzf().zza(zzbi.zzct));
                    if(bundle1 == null) {
                        zzgm0.zza.zzj().zzg().zza("No campaign params defined in Install Referrer result");
                    }
                    else {
                        String s2 = bundle1.getString("medium");
                        if(s2 == null || "(not set)".equalsIgnoreCase(s2) || "organic".equalsIgnoreCase(s2)) {
                        label_25:
                            if(v * 1000L == zzgm0.zza.zzn().zzd.zza()) {
                                zzgm0.zza.zzj().zzp().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if(zzgm0.zza.zzac()) {
                                zzgm0.zza.zzn().zzd.zza(v * 1000L);
                                zzgm0.zza.zzj().zzp().zza("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                bundle1.putString("_cis", "referrer API v2");
                                zzgm0.zza.zzp().zza("auto", "_cmp", bundle1, s);
                            }
                        }
                        else {
                            long v1 = bundle0.getLong("referrer_click_timestamp_seconds", 0L);
                            if(v1 * 1000L == 0L) {
                                zzgm0.zza.zzj().zzg().zza("Install Referrer is missing click timestamp for ad campaign");
                            }
                            else {
                                bundle1.putLong("click_timestamp", v1 * 1000L);
                                goto label_25;
                            }
                        }
                    }
                }
            }
        }
        if(serviceConnection0 != null) {
            ConnectionTracker.getInstance().unbindService(zzgm0.zza.zza(), serviceConnection0);
        }
    }
}

