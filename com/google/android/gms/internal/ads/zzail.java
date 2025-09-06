package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzail implements zzajz {
    private final List zza;

    public zzail() {
        this(0);
    }

    public zzail(int v) {
        this.zza = zzfud.zzl();
    }

    public zzail(int v, List list0) {
        this.zza = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzajz
    public final zzakb zza(int v, zzajy zzajy0) {
        switch(v) {
            case 3: 
            case 4: {
                return new zzajf(new zzajc(zzajy0.zzb));
            }
            case 15: {
                return new zzajf(new zzaik(false, zzajy0.zzb));
            }
            case 16: {
                return new zzajf(new zzait(this.zzc(zzajy0)));
            }
            case 17: {
                return new zzajf(new zzajb(zzajy0.zzb));
            }
            case 21: {
                return new zzajf(new zzaja());
            }
            case 27: {
                return new zzajf(new zzaix(this.zzb(zzajy0), false, false));
            }
            case 36: {
                return new zzajf(new zzaiz(this.zzb(zzajy0)));
            }
            case 89: {
                return new zzajf(new zzain(zzajy0.zzc));
            }
            case 2: 
            case 0x80: {
                return new zzajf(new zzaiq(this.zzc(zzajy0)));
            }
            case 0x86: {
                return new zzajo(new zzaje("application/x-scte35"));
            }
            case 0x81: 
            case 0x87: {
                return new zzajf(new zzaie(zzajy0.zzb));
            }
            case 0x8A: {
                return new zzajf(new zzaim(zzajy0.zzb));
            }
            case 0xAC: {
                return new zzajf(new zzaih(zzajy0.zzb));
            }
            case 0x101: {
                return new zzajo(new zzaje("application/vnd.dvb.ait"));
            }
            default: {
                return null;
            }
        }
    }

    private final zzajp zzb(zzajy zzajy0) {
        return new zzajp(this.zzd(zzajy0));
    }

    private final zzakd zzc(zzajy zzajy0) {
        return new zzakd(this.zzd(zzajy0));
    }

    private final List zzd(zzajy zzajy0) {
        String s1;
        int v6;
        zzfb zzfb0 = new zzfb(zzajy0.zzd);
        List list0 = this.zza;
        while(zzfb0.zza() > 0) {
            int v = zzfb0.zzl();
            int v1 = zzfb0.zzl();
            int v2 = zzfb0.zzc();
            if(v == 0x86) {
                list0 = new ArrayList();
                int v3 = zzfb0.zzl();
                for(int v4 = 0; v4 < (v3 & 0x1F); ++v4) {
                    String s = zzfb0.zzy(3, zzfqu.zzc);
                    int v5 = zzfb0.zzl();
                    boolean z = (v5 & 0x80) != 0;
                    if(z) {
                        v6 = v5 & 0x3F;
                        s1 = "application/cea-708";
                    }
                    else {
                        s1 = "application/cea-608";
                        v6 = 1;
                    }
                    int v7 = (byte)zzfb0.zzl();
                    zzfb0.zzH(1);
                    List list1 = z ? Collections.singletonList(((v7 & 0x40) == 0 ? new byte[]{0} : new byte[]{1})) : null;
                    zzak zzak0 = new zzak();
                    zzak0.zzS(s1);
                    zzak0.zzK(s);
                    zzak0.zzu(v6);
                    zzak0.zzI(list1);
                    list0.add(zzak0.zzY());
                }
            }
            zzfb0.zzG(v2 + v1);
        }
        return list0;
    }
}

