package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

public final class zzbix implements zzbir {
    static final Map zza;
    private final zzb zzb;
    private final zzbqz zzc;
    private final zzbrg zzd;

    static {
        zzbix.zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    }

    public zzbix(zzb zzb0, zzbqz zzbqz0, zzbrg zzbrg0) {
        this.zzb = zzb0;
        this.zzc = zzbqz0;
        this.zzd = zzbrg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("a");
        int v = (int)(((Integer)zzbix.zza.get(s)));
        int v1 = 6;
        boolean z = true;
        switch(v) {
            case 5: {
                String s1 = (String)map0.get("forceOrientation");
                if(map0.containsKey("allowOrientationChange")) {
                    z = Boolean.parseBoolean(((String)map0.get("allowOrientationChange")));
                }
                if(((zzcfi)object0) == null) {
                    zzcaa.zzj("AdWebView is null");
                    return;
                }
                if("portrait".equalsIgnoreCase(s1)) {
                    v1 = 7;
                }
                else if(!"landscape".equalsIgnoreCase(s1)) {
                    v1 = z ? -1 : 14;
                }
                ((zzcfi)object0).zzaq(v1);
                return;
            }
            case 7: {
                this.zzd.zzc();
                return;
            }
            default: {
                if(this.zzb.zzc()) {
                    switch(v) {
                        case 1: {
                            this.zzc.zzb(map0);
                            return;
                        }
                        case 3: {
                            new zzbrc(((zzcfi)object0), map0).zzb();
                            return;
                        }
                        case 4: {
                            new zzbqx(((zzcfi)object0), map0).zzc();
                            return;
                        }
                        case 6: {
                            this.zzc.zza(true);
                            return;
                        }
                        default: {
                            zzcaa.zzi("Unknown MRAID command called.");
                            return;
                        }
                    }
                }
                this.zzb.zzb(null);
            }
        }
    }
}

