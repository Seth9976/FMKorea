package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

final class zzaia extends zzahy {
    private zzahz zza;
    private int zzb;
    private boolean zzc;
    private zzacj zzd;
    private zzach zze;

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfb0) {
        int v = 0;
        if((zzfb0.zzI()[0] & 1) == 1) {
            return -1L;
        }
        int v1 = zzfb0.zzI()[0];
        zzahz zzahz0 = this.zza;
        zzdy.zzb(zzahz0);
        int v2 = zzahz0.zzd[v1 >> 1 & 0xFF >>> 8 - zzahz0.zze].zza ? zzahz0.zza.zzf : zzahz0.zza.zze;
        if(this.zzc) {
            v = (this.zzb + v2) / 4;
        }
        if(zzfb0.zzb() < zzfb0.zzd() + 4) {
            byte[] arr_b = Arrays.copyOf(zzfb0.zzI(), zzfb0.zzd() + 4);
            zzfb0.zzE(arr_b, arr_b.length);
        }
        else {
            zzfb0.zzF(zzfb0.zzd() + 4);
        }
        byte[] arr_b1 = zzfb0.zzI();
        arr_b1[zzfb0.zzd() - 4] = (byte)(((int)(((long)v) & 0xFFL)));
        arr_b1[zzfb0.zzd() - 3] = (byte)(((int)(((long)v) >>> 8 & 0xFFL)));
        arr_b1[zzfb0.zzd() - 2] = (byte)(((int)(((long)v) >>> 16 & 0xFFL)));
        arr_b1[zzfb0.zzd() - 1] = (byte)(((int)(((long)v) >>> 24 & 0xFFL)));
        this.zzc = true;
        this.zzb = v2;
        return (long)v;
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if(z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final boolean zzc(zzfb zzfb0, long v, zzahv zzahv0) {
        int v24;
        long v18;
        zzacj zzacj1;
        int v16;
        zzahz zzahz0;
        if(this.zza != null) {
            zzahv0.zza.getClass();
            return false;
        }
        zzacj zzacj0 = this.zzd;
        if(zzacj0 == null) {
            zzack.zzd(1, zzfb0, false);
            int v1 = zzfb0.zzi();
            int v2 = zzfb0.zzl();
            int v3 = zzfb0.zzi();
            int v4 = zzfb0.zzh();
            int v5 = zzfb0.zzh();
            int v6 = zzfb0.zzh();
            int v7 = zzfb0.zzl();
            this.zzd = new zzacj(v1, v2, v3, (v4 > 0 ? v4 : -1), (v5 > 0 ? v5 : -1), (v6 > 0 ? v6 : -1), ((int)Math.pow(2.0, v7 & 15)), ((int)Math.pow(2.0, (v7 & 0xF0) >> 4)), 1 == (zzfb0.zzl() & 1), Arrays.copyOf(zzfb0.zzI(), zzfb0.zzd()));
            goto label_18;
        }
        zzach zzach0 = this.zze;
        if(zzach0 == null) {
            this.zze = zzack.zzc(zzfb0, true, true);
        label_18:
            zzahz0 = null;
        }
        else {
            byte[] arr_b = new byte[zzfb0.zzd()];
            System.arraycopy(zzfb0.zzI(), 0, arr_b, 0, zzfb0.zzd());
            int v8 = zzacj0.zza;
            zzack.zzd(5, zzfb0, false);
            int v9 = zzfb0.zzl();
            zzacg zzacg0 = new zzacg(zzfb0.zzI());
            zzacg0.zzc(zzfb0.zzc() * 8);
            int v10 = 0;
            while(true) {
                int v11 = 2;
                if(v10 >= v9 + 1) {
                    goto label_77;
                }
                if(zzacg0.zzb(24) != 0x564342) {
                    throw zzcd.zza(("expected code book to start with [0x56, 0x43, 0x42] at " + zzacg0.zza()), null);
                }
                int v12 = zzacg0.zzb(16);
                int v13 = zzacg0.zzb(24);
                if(zzacg0.zzd()) {
                    zzacg0.zzc(5);
                    for(int v15 = 0; v15 < v13; v15 += zzacg0.zzb(zzack.zza(v13 - v15))) {
                    }
                }
                else {
                    boolean z = zzacg0.zzd();
                    for(int v14 = 0; v14 < v13; ++v14) {
                        if(!z) {
                            zzacg0.zzc(5);
                        }
                        else if(zzacg0.zzd()) {
                            zzacg0.zzc(5);
                        }
                    }
                }
                v16 = zzacg0.zzb(4);
                if(v16 > 2) {
                    break;
                }
                if(v16 == 1) {
                    v11 = 1;
                }
                else if(v16 != 2) {
                    zzacj1 = zzacj0;
                    goto label_72;
                }
                zzacg0.zzc(0x20);
                zzacg0.zzc(0x20);
                int v17 = zzacg0.zzb(4);
                zzacg0.zzc(1);
                if(v11 != 1) {
                    zzacj1 = zzacj0;
                    v18 = ((long)v12) * ((long)v13);
                }
                else if(v12 == 0) {
                    zzacj1 = zzacj0;
                    v18 = 0L;
                }
                else {
                    zzacj1 = zzacj0;
                    v18 = (long)Math.floor(Math.pow(((long)v13), 1.0 / ((double)(((long)v12)))));
                }
                zzacg0.zzc(((int)(v18 * ((long)(v17 + 1)))));
            label_72:
                ++v10;
                zzacj0 = zzacj1;
            }
            throw zzcd.zza(("lookup type greater than 2 not decodable: " + v16), null);
        label_77:
            int v19 = zzacg0.zzb(6);
            for(int v20 = 0; v20 < v19 + 1; ++v20) {
                if(zzacg0.zzb(16) != 0) {
                    throw zzcd.zza("placeholder of time domain transforms not zeroed out", null);
                }
            }
            int v21 = zzacg0.zzb(6) + 1;
            int v22 = 0;
            while(v22 < v21) {
                int v23 = zzacg0.zzb(16);
            alab1:
                switch(v23) {
                    case 0: {
                        v24 = v21;
                        zzacg0.zzc(8);
                        zzacg0.zzc(16);
                        zzacg0.zzc(16);
                        zzacg0.zzc(6);
                        zzacg0.zzc(8);
                        int v25 = zzacg0.zzb(4);
                        for(int v26 = 0; v26 < v25 + 1; ++v26) {
                            zzacg0.zzc(8);
                        }
                        break;
                    }
                    case 1: {
                        int v27 = zzacg0.zzb(5);
                        int[] arr_v = new int[v27];
                        int v29 = -1;
                        for(int v28 = 0; v28 < v27; ++v28) {
                            int v30 = zzacg0.zzb(4);
                            arr_v[v28] = v30;
                            if(v30 > v29) {
                                v29 = v30;
                            }
                        }
                        int v31 = v29 + 1;
                        int[] arr_v1 = new int[v31];
                        for(int v32 = 0; v32 < v31; ++v32) {
                            arr_v1[v32] = zzacg0.zzb(3) + 1;
                            int v33 = zzacg0.zzb(2);
                            if(v33 > 0) {
                                zzacg0.zzc(8);
                            }
                            for(int v34 = 0; v34 < 1 << v33; ++v34) {
                                zzacg0.zzc(8);
                            }
                        }
                        v24 = v21;
                        zzacg0.zzc(2);
                        int v35 = zzacg0.zzb(4);
                        int v37 = 0;
                        for(int v36 = 0; true; ++v36) {
                            if(v36 >= v27) {
                                break alab1;
                            }
                            v37 += arr_v1[arr_v[v36]];
                            for(int v38 = 0; v38 < v37; ++v38) {
                                zzacg0.zzc(v35);
                            }
                        }
                    }
                    default: {
                        throw zzcd.zza(("floor type greater than 1 not decodable: " + v23), null);
                    }
                }
                ++v22;
                v21 = v24;
            }
            int v39 = zzacg0.zzb(6);
            for(int v40 = 0; v40 < v39 + 1; ++v40) {
                if(zzacg0.zzb(16) > 2) {
                    throw zzcd.zza("residueType greater than 2 is not decodable", null);
                }
                zzacg0.zzc(24);
                zzacg0.zzc(24);
                zzacg0.zzc(24);
                int v41 = zzacg0.zzb(6);
                zzacg0.zzc(8);
                int[] arr_v2 = new int[v41 + 1];
                for(int v42 = 0; v42 < v41 + 1; ++v42) {
                    int v43 = zzacg0.zzb(3);
                    arr_v2[v42] = (zzacg0.zzd() ? zzacg0.zzb(5) : 0) * 8 + v43;
                }
                for(int v44 = 0; v44 < v41 + 1; ++v44) {
                    for(int v45 = 0; v45 < 8; ++v45) {
                        if((arr_v2[v44] & 1 << v45) != 0) {
                            zzacg0.zzc(8);
                        }
                    }
                }
            }
            int v46 = zzacg0.zzb(6);
            for(int v47 = 0; v47 < v46 + 1; ++v47) {
                int v48 = zzacg0.zzb(16);
                if(v48 == 0) {
                    int v49 = zzacg0.zzd() ? zzacg0.zzb(4) + 1 : 1;
                    if(zzacg0.zzd()) {
                        int v50 = zzacg0.zzb(8);
                        for(int v51 = 0; v51 < v50 + 1; ++v51) {
                            zzacg0.zzc(zzack.zza(v8 - 1));
                            zzacg0.zzc(zzack.zza(v8 - 1));
                        }
                    }
                    if(zzacg0.zzb(2) != 0) {
                        throw zzcd.zza("to reserved bits must be zero after mapping coupling steps", null);
                    }
                    if(v49 > 1) {
                        for(int v52 = 0; v52 < v8; ++v52) {
                            zzacg0.zzc(4);
                        }
                    }
                    for(int v53 = 0; v53 < v49; ++v53) {
                        zzacg0.zzc(8);
                        zzacg0.zzc(8);
                        zzacg0.zzc(8);
                    }
                }
                else {
                    zzes.zzc("VorbisUtil", "mapping type other than 0 not supported: " + v48);
                }
            }
            int v54 = zzacg0.zzb(6);
            zzaci[] arr_zzaci = new zzaci[v54 + 1];
            for(int v55 = 0; v55 < v54 + 1; ++v55) {
                arr_zzaci[v55] = new zzaci(zzacg0.zzd(), zzacg0.zzb(16), zzacg0.zzb(16), zzacg0.zzb(8));
            }
            if(!zzacg0.zzd()) {
                throw zzcd.zza("framing bit after modes not set as expected", null);
            }
            zzahz0 = new zzahz(zzacj0, zzach0, arr_b, arr_zzaci, zzack.zza(v54));
        }
        this.zza = zzahz0;
        if(zzahz0 == null) {
            return true;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(zzahz0.zza.zzg);
        arrayList0.add(zzahz0.zzc);
        zzbz zzbz0 = zzack.zzb(zzfud.zzk(zzahz0.zzb.zzb));
        zzak zzak0 = new zzak();
        zzak0.zzS("audio/vorbis");
        zzak0.zzv(zzahz0.zza.zzd);
        zzak0.zzO(zzahz0.zza.zzc);
        zzak0.zzw(zzahz0.zza.zza);
        zzak0.zzT(zzahz0.zza.zzb);
        zzak0.zzI(arrayList0);
        zzak0.zzM(zzbz0);
        zzahv0.zza = zzak0.zzY();
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final void zzi(long v) {
        super.zzi(v);
        int v1 = 0;
        this.zzc = Long.compare(v, 0L) != 0;
        zzacj zzacj0 = this.zzd;
        if(zzacj0 != null) {
            v1 = zzacj0.zze;
        }
        this.zzb = v1;
    }
}

