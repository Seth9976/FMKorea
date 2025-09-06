package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo.DetailedState;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

public final class zzebm extends zzebn {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcvm zzd;
    private final TelephonyManager zze;
    private final zzebe zzf;
    private int zzg;

    static {
        SparseArray sparseArray0 = new SparseArray();
        zzebm.zzb = sparseArray0;
        sparseArray0.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzazr.zzc);
        sparseArray0.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzazr.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzazr.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzazr.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzazr.zzd);
        sparseArray0.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzazr.zze);
        sparseArray0.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzazr.zze);
        sparseArray0.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzazr.zze);
        sparseArray0.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzazr.zze);
        sparseArray0.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzazr.zze);
        sparseArray0.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzazr.zzf);
        sparseArray0.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzazr.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzazr.zzb);
    }

    zzebm(Context context0, zzcvm zzcvm0, zzebe zzebe0, zzeba zzeba0, zzg zzg0) {
        super(zzeba0, zzg0);
        this.zzc = context0;
        this.zzd = zzcvm0;
        this.zzf = zzebe0;
        this.zze = (TelephonyManager)context0.getSystemService("phone");
    }

    static zzazi zza(zzebm zzebm0, Bundle bundle0) {
        zzazb zzazb0 = zzazi.zza();
        int v = bundle0.getInt("cnt", -2);
        int v1 = bundle0.getInt("gnt", 0);
        int v2 = 2;
        if(v == -1) {
            zzebm0.zzg = 2;
            return (zzazi)zzazb0.zzal();
        }
        zzebm0.zzg = 1;
        switch(v) {
            case 0: {
                zzazb0.zzb(2);
                break;
            }
            case 1: {
                zzazb0.zzb(3);
                break;
            }
            default: {
                zzazb0.zzb(1);
            }
        }
        switch(v1) {
            case 13: {
                v2 = 5;
                break;
            }
            case 1: 
            case 2: 
            case 4: 
            case 7: 
            case 11: 
            case 16: {
                break;
            }
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                v2 = 3;
                break;
            }
            default: {
                v2 = 1;
            }
        }
        zzazb0.zza(v2);
        return (zzazi)zzazb0.zzal();
    }

    static zzazr zzb(zzebm zzebm0, Bundle bundle0) {
        int v = zzfcm.zza(zzfcm.zza(bundle0, "device"), "network").getInt("active_network_state", -1);
        return (zzazr)zzebm.zzb.get(v, zzazr.zza);
    }

    static zzebe zzc(zzebm zzebm0) {
        return zzebm0.zzf;
    }

    public final void zzd(boolean z) {
        zzfye.zzr(this.zzd.zzb(), new zzebl(this, z), zzcan.zzf);
    }

    static byte[] zze(zzebm zzebm0, boolean z, ArrayList arrayList0, zzazi zzazi0, zzazr zzazr0) {
        zzazm zzazm0 = zzazn.zzg();
        zzazm0.zza(arrayList0);
        boolean z1 = false;
        zzazm0.zzi(zzebm.zzg(Settings.Global.getInt(zzebm0.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzazm0.zzj(zzt.zzq().zzj(zzebm0.zzc, zzebm0.zze));
        zzazm0.zzf(zzebm0.zzf.zze());
        zzazm0.zze(zzebm0.zzf.zzb());
        zzazm0.zzb(zzebm0.zzf.zza());
        zzazm0.zzc(zzazr0);
        zzazm0.zzd(zzazi0);
        zzazm0.zzk(zzebm0.zzg);
        zzazm0.zzl(zzebm.zzg(z));
        zzazm0.zzh(zzebm0.zzf.zzd());
        zzazm0.zzg(zzt.zzB().currentTimeMillis());
        if(Settings.Global.getInt(zzebm0.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z1 = true;
        }
        zzazm0.zzm(zzebm.zzg(z1));
        return ((zzazn)zzazm0.zzal()).zzax();
    }

    // 去混淆评级： 低(20)
    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }
}

