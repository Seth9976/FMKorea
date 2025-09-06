package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzajv implements zzajn {
    final zzajw zza;
    private final zzfa zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzajv(zzajw zzajw0, int v) {
        this.zza = zzajw0;
        super();
        this.zzb = new zzfa(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfb0) {
        zzfi zzfi4;
        int v20;
        int v12;
        zzfi zzfi2;
        int v11;
        zzfi zzfi1;
        if(zzfb0.zzl() != 2) {
            return;
        }
        zzfi zzfi0 = (zzfi)this.zza.zzb.get(0);
        if((zzfb0.zzl() & 0x80) == 0) {
            return;
        }
        zzfb0.zzH(1);
        int v = zzfb0.zzp();
        zzfb0.zzH(3);
        zzfb0.zzB(this.zzb, 2);
        this.zzb.zzl(3);
        int v1 = this.zzb.zzd(13);
        this.zza.zzq = v1;
        zzfb0.zzB(this.zzb, 2);
        this.zzb.zzl(4);
        zzfb0.zzH(this.zzb.zzd(12));
        this.zzc.clear();
        this.zzd.clear();
        int v2 = zzfb0.zza();
        while(v2 > 0) {
            zzfb0.zzB(this.zzb, 5);
            int v3 = this.zzb.zzd(8);
            this.zzb.zzl(3);
            int v4 = this.zzb.zzd(13);
            this.zzb.zzl(4);
            int v5 = this.zzb.zzd(12);
            int v6 = zzfb0.zzc();
            int v7 = v6 + v5;
            List list0 = null;
            String s = null;
            int v8 = -1;
            while(true) {
                if(zzfb0.zzc() < v7) {
                    int v9 = zzfb0.zzl();
                    int v10 = zzfb0.zzc() + zzfb0.zzl();
                    if(v10 > v7) {
                        zzfi1 = zzfi0;
                        v11 = v;
                        break;
                    }
                    else {
                        switch(v9) {
                            case 5: {
                                long v13 = zzfb0.zzt();
                                if(v13 == 1094921523L) {
                                    goto label_51;
                                }
                                else if(v13 == 1161904947L) {
                                    goto label_55;
                                }
                                else if(v13 == 1094921524L) {
                                    goto label_60;
                                }
                                else if(v13 == 1212503619L) {
                                    zzfi2 = zzfi0;
                                    v8 = 36;
                                    goto label_65;
                                }
                                zzfi2 = zzfi0;
                                v12 = v;
                                break;
                            }
                            case 10: {
                                zzfi2 = zzfi0;
                                s = zzfb0.zzy(3, zzfqu.zzc).trim();
                                v12 = v;
                                break;
                            }
                            case 89: {
                                ArrayList arrayList0 = new ArrayList();
                                while(zzfb0.zzc() < v10) {
                                    String s1 = zzfb0.zzy(3, zzfqu.zzc).trim();
                                    int v14 = zzfb0.zzl();
                                    byte[] arr_b = new byte[4];
                                    zzfb0.zzC(arr_b, 0, 4);
                                    arrayList0.add(new zzajx(s1, v14, arr_b));
                                }
                                zzfi2 = zzfi0;
                                v12 = v;
                                list0 = arrayList0;
                                v8 = 89;
                                break;
                            }
                            case 106: {
                            label_51:
                                zzfi2 = zzfi0;
                                v8 = 0x81;
                                v12 = v;
                                break;
                            }
                            case 0x7A: {
                            label_55:
                                zzfi2 = zzfi0;
                                v12 = v;
                                v8 = 0x87;
                                break;
                            }
                            case 0x7B: {
                                zzfi2 = zzfi0;
                                v8 = 0x8A;
                                v12 = v;
                                break;
                            }
                            case 0x7F: {
                                if(zzfb0.zzl() == 21) {
                                label_60:
                                    zzfi2 = zzfi0;
                                    v12 = v;
                                    v8 = 0xAC;
                                    break;
                                }
                                zzfi2 = zzfi0;
                            label_65:
                                v12 = v;
                                break;
                            }
                            default: {
                                zzfi2 = zzfi0;
                                v12 = v;
                                if(v9 == 0x6F) {
                                    v8 = 0x101;
                                }
                            }
                        }
                        zzfb0.zzH(v10 - zzfb0.zzc());
                        zzfi0 = zzfi2;
                        v = v12;
                        continue;
                    }
                }
                zzfi1 = zzfi0;
                v11 = v;
                break;
            }
            zzfb0.zzG(v7);
            zzajy zzajy0 = new zzajy(v8, s, list0, Arrays.copyOfRange(zzfb0.zzI(), v6, v7));
            if(v3 == 5 || v3 == 6) {
                v3 = zzajy0.zza;
            }
            v2 -= v5 + 5;
            if(!this.zza.zzg.get(v4)) {
                zzakb zzakb0 = this.zza.zze.zza(v3, zzajy0);
                this.zzd.put(v4, v4);
                this.zzc.put(v4, zzakb0);
            }
            zzfi0 = zzfi1;
            v = v11;
        }
        zzfi zzfi3 = zzfi0;
        int v15 = v;
        int v16 = this.zzd.size();
        int v17 = 0;
        while(v17 < v16) {
            int v18 = this.zzd.keyAt(v17);
            int v19 = this.zzd.valueAt(v17);
            this.zza.zzg.put(v18, true);
            this.zza.zzh.put(v19, true);
            zzakb zzakb1 = (zzakb)this.zzc.valueAt(v17);
            if(zzakb1 == null) {
                zzfi4 = zzfi3;
                v20 = v15;
            }
            else {
                v20 = v15;
                zzfi4 = zzfi3;
                zzakb1.zzb(zzfi4, this.zza.zzk, new zzaka(v20, v18, 0x2000));
                this.zza.zzf.put(v19, zzakb1);
            }
            ++v17;
            zzfi3 = zzfi4;
            v15 = v20;
        }
        this.zza.zzf.remove(this.zze);
        this.zza.zzl = 0;
        zzajw zzajw0 = this.zza;
        if(zzajw0.zzl == 0) {
            zzajw0.zzk.zzC();
            zzajw.zzn(this.zza, true);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfi0, zzabe zzabe0, zzaka zzaka0) {
    }
}

