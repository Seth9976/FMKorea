package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

final class zzui implements zztp, zztq {
    private final zztq[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc;
    private final HashMap zzd;
    private zztp zze;
    private zzvs zzf;
    private zztq[] zzg;
    private zzvl zzh;
    private final zztd zzi;

    public zzui(zztd zztd0, long[] arr_v, zztq[] arr_zztq) {
        this.zzi = zztd0;
        this.zza = arr_zztq;
        this.zzc = new ArrayList();
        this.zzd = new HashMap();
        this.zzh = new zztc(new zzvl[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zztq[0];
        for(int v = 0; v < arr_zztq.length; ++v) {
            long v1 = arr_v[v];
            if(v1 != 0L) {
                this.zza[v] = new zzug(arr_zztq[v], v1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zza(long v, zzlr zzlr0) {
        zztq[] arr_zztq = this.zzg;
        return arr_zztq.length <= 0 ? this.zza[0].zza(v, zzlr0) : arr_zztq[0].zza(v, zzlr0);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        zztq[] arr_zztq = this.zzg;
        long v1 = 0x8000000000000001L;
        for(int v = 0; v < arr_zztq.length; ++v) {
            zztq zztq0 = arr_zztq[v];
            long v2 = zztq0.zzd();
            if(Long.compare(v2, 0x8000000000000001L) != 0) {
                if(v1 == 0x8000000000000001L) {
                    zztq[] arr_zztq1 = this.zzg;
                    for(int v3 = 0; v3 < arr_zztq1.length; ++v3) {
                        zztq zztq1 = arr_zztq1[v3];
                        if(zztq1 == zztq0) {
                            break;
                        }
                        if(zztq1.zze(v2) != v2) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    v1 = v2;
                }
                else if(v2 != v1) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            }
            else if(v1 != 0x8000000000000001L && zztq0.zze(v1) != v1) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zze(long v) {
        long v1 = this.zzg[0].zze(v);
        for(int v2 = 1; true; ++v2) {
            zztq[] arr_zztq = this.zzg;
            if(v2 >= arr_zztq.length) {
                break;
            }
            if(arr_zztq[v2].zze(v1) != v1) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] arr_zzxf, boolean[] arr_z, zzvj[] arr_zzvj, boolean[] arr_z1, long v) {
        int[] arr_v = new int[arr_zzxf.length];
        int[] arr_v1 = new int[arr_zzxf.length];
        for(int v1 = 0; true; ++v1) {
            Integer integer0 = null;
            if(v1 >= arr_zzxf.length) {
                break;
            }
            zzvj zzvj0 = arr_zzvj[v1];
            if(zzvj0 != null) {
                integer0 = (Integer)this.zzb.get(zzvj0);
            }
            arr_v[v1] = integer0 == null ? -1 : ((int)integer0);
            zzxf zzxf0 = arr_zzxf[v1];
            if(zzxf0 == null) {
                arr_v1[v1] = -1;
            }
            else {
                zzcy zzcy0 = zzxf0.zze();
                arr_v1[v1] = Integer.parseInt(zzcy0.zzc.substring(0, zzcy0.zzc.indexOf(":")));
            }
        }
        this.zzb.clear();
        zzvj[] arr_zzvj1 = new zzvj[arr_zzxf.length];
        zzvj[] arr_zzvj2 = new zzvj[arr_zzxf.length];
        zzxf[] arr_zzxf1 = new zzxf[arr_zzxf.length];
        ArrayList arrayList0 = new ArrayList(this.zza.length);
        long v2 = v;
        for(int v3 = 0; v3 < this.zza.length; v3 = v5 + 1) {
            for(int v4 = 0; v4 < arr_zzxf.length; ++v4) {
                arr_zzvj2[v4] = arr_v[v4] == v3 ? arr_zzvj[v4] : null;
                if(arr_v1[v4] == v3) {
                    zzxf zzxf1 = arr_zzxf[v4];
                    zzxf1.getClass();
                    zzcy zzcy1 = zzxf1.zze();
                    zzcy zzcy2 = (zzcy)this.zzd.get(zzcy1);
                    zzcy2.getClass();
                    arr_zzxf1[v4] = new zzuf(zzxf1, zzcy2);
                }
                else {
                    arr_zzxf1[v4] = null;
                }
            }
            int v5 = v3;
            long v6 = this.zza[v3].zzf(arr_zzxf1, arr_z, arr_zzvj2, arr_z1, v2);
            if(v5 == 0) {
                v2 = v6;
            }
            else if(v6 != v2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for(int v7 = 0; true; ++v7) {
                boolean z1 = true;
                if(v7 >= arr_zzxf.length) {
                    break;
                }
                if(arr_v1[v7] == v5) {
                    zzvj zzvj1 = arr_zzvj2[v7];
                    zzvj1.getClass();
                    arr_zzvj1[v7] = zzvj1;
                    this.zzb.put(zzvj1, v5);
                    z = true;
                }
                else if(arr_v[v7] == v5) {
                    if(arr_zzvj2[v7] != null) {
                        z1 = false;
                    }
                    zzdy.zzf(z1);
                }
            }
            if(z) {
                arrayList0.add(this.zza[v5]);
            }
        }
        System.arraycopy(arr_zzvj1, 0, arr_zzvj, 0, arr_zzxf.length);
        zztq[] arr_zztq = (zztq[])arrayList0.toArray(new zztq[0]);
        this.zzg = arr_zztq;
        this.zzh = new zztc(arr_zztq);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzvk
    public final void zzg(zzvl zzvl0) {
        zztq zztq0 = (zztq)zzvl0;
        zztp zztp0 = this.zze;
        zztp0.getClass();
        zztp0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zzvs zzvs0 = this.zzf;
        zzvs0.getClass();
        return zzvs0;
    }

    @Override  // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztq0) {
        this.zzc.remove(zztq0);
        if(!this.zzc.isEmpty()) {
            return;
        }
        zztq[] arr_zztq = this.zza;
        int v1 = 0;
        for(int v = 0; v < arr_zztq.length; ++v) {
            v1 += arr_zztq[v].zzh().zzc;
        }
        zzcy[] arr_zzcy = new zzcy[v1];
        for(int v2 = 0; true; ++v2) {
            zztq[] arr_zztq1 = this.zza;
            if(v2 >= arr_zztq1.length) {
                break;
            }
            zzvs zzvs0 = arr_zztq1[v2].zzh();
            int v4 = zzvs0.zzc;
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                zzcy zzcy0 = zzvs0.zzb(v5);
                zzcy zzcy1 = zzcy0.zzc(v2 + ":" + zzcy0.zzc);
                this.zzd.put(zzcy1, zzcy0);
                arr_zzcy[v3] = zzcy1;
                ++v5;
            }
        }
        this.zzf = new zzvs(arr_zzcy);
        zztp zztp0 = this.zze;
        zztp0.getClass();
        zztp0.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzj(long v, boolean z) {
        zztq[] arr_zztq = this.zzg;
        for(int v1 = 0; v1 < arr_zztq.length; ++v1) {
            arr_zztq[v1].zzj(v, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzk() {
        zztq[] arr_zztq = this.zza;
        for(int v = 0; v < arr_zztq.length; ++v) {
            arr_zztq[v].zzk();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztp0, long v) {
        this.zze = zztp0;
        Collections.addAll(this.zzc, this.zza);
        zztq[] arr_zztq = this.zza;
        for(int v1 = 0; v1 < arr_zztq.length; ++v1) {
            arr_zztq[v1].zzl(this, v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final void zzm(long v) {
        this.zzh.zzm(v);
    }

    public final zztq zzn(int v) {
        zztq zztq0 = this.zza[v];
        return zztq0 instanceof zzug ? ((zzug)zztq0).zza : zztq0;
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzo(long v) {
        if(!this.zzc.isEmpty()) {
            int v1 = this.zzc.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((zztq)this.zzc.get(v2)).zzo(v);
            }
            return false;
        }
        return this.zzh.zzo(v);
    }

    @Override  // com.google.android.gms.internal.ads.zztq
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

