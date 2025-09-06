package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map.Entry;
import java.util.Map;

public final class zzwr extends zzdd {
    public static final zzwr zzE;
    @Deprecated
    public static final zzwr zzF;
    public static final zzn zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private final SparseArray zzam;
    private final SparseBooleanArray zzan;

    static {
        zzwr zzwr0 = new zzwr(new zzwp());
        zzwr.zzE = zzwr0;
        zzwr.zzF = zzwr0;
        zzwr.zzU = "rs";
        zzwr.zzV = "rt";
        zzwr.zzW = "ru";
        zzwr.zzX = "rv";
        zzwr.zzY = "rw";
        zzwr.zzZ = "rx";
        zzwr.zzaa = "ry";
        zzwr.zzab = "rz";
        zzwr.zzac = "s0";
        zzwr.zzad = "s1";
        zzwr.zzae = "s2";
        zzwr.zzaf = "s3";
        zzwr.zzag = "s4";
        zzwr.zzah = "s5";
        zzwr.zzai = "s6";
        zzwr.zzaj = "s7";
        zzwr.zzak = "s8";
        zzwr.zzal = "s9";
        zzwr.zzG = zzwn.zza;
    }

    private zzwr(zzwp zzwp0) {
        super(zzwp0);
        this.zzH = zzwp0.zza;
        this.zzI = false;
        this.zzJ = zzwp0.zzb;
        this.zzK = false;
        this.zzL = zzwp0.zzc;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = zzwp0.zzd;
        this.zzR = zzwp0.zze;
        this.zzS = false;
        this.zzT = zzwp0.zzf;
        this.zzam = zzwp0.zzg;
        this.zzan = zzwp0.zzh;
    }

    zzwr(zzwp zzwp0, zzwq zzwq0) {
        this(zzwp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdd
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzwr.class == class0 && super.equals(((zzwr)object0)) && this.zzH == ((zzwr)object0).zzH && this.zzJ == ((zzwr)object0).zzJ && this.zzL == ((zzwr)object0).zzL && this.zzQ == ((zzwr)object0).zzQ && this.zzR == ((zzwr)object0).zzR && this.zzT == ((zzwr)object0).zzT) {
                SparseBooleanArray sparseBooleanArray0 = this.zzan;
                SparseBooleanArray sparseBooleanArray1 = ((zzwr)object0).zzan;
                int v = sparseBooleanArray0.size();
                if(sparseBooleanArray1.size() == v) {
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(sparseBooleanArray1.indexOfKey(sparseBooleanArray0.keyAt(v1)) < 0) {
                            return false;
                        }
                    }
                    SparseArray sparseArray0 = this.zzam;
                    SparseArray sparseArray1 = ((zzwr)object0).zzam;
                    int v2 = sparseArray0.size();
                    if(sparseArray1.size() == v2) {
                        for(int v3 = 0; v3 < v2; ++v3) {
                            int v4 = sparseArray1.indexOfKey(sparseArray0.keyAt(v3));
                            if(v4 < 0) {
                                return false;
                            }
                            Map map0 = (Map)sparseArray0.valueAt(v3);
                            Map map1 = (Map)sparseArray1.valueAt(v4);
                            if(map1.size() != map0.size()) {
                                return false;
                            }
                            for(Object object1: map0.entrySet()) {
                                zzvs zzvs0 = (zzvs)((Map.Entry)object1).getKey();
                                if(!map1.containsKey(zzvs0) || !zzfk.zzD(((Map.Entry)object1).getValue(), map1.get(zzvs0))) {
                                    return false;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdd
    public final int hashCode() {
        return (((((((super.hashCode() + 0x1F) * 0x1F + this.zzH) * 961 + this.zzJ) * 961 + this.zzL) * 0x1B4D89F + this.zzQ) * 0x1F + this.zzR) * 961 + this.zzT) * 0x1F;
    }

    static SparseArray zza(zzwr zzwr0) {
        return zzwr0.zzam;
    }

    static SparseBooleanArray zzb(zzwr zzwr0) {
        return zzwr0.zzan;
    }

    public final zzwp zzc() {
        return new zzwp(this, null);
    }

    public static zzwr zzd(Context context0) {
        return new zzwr(new zzwp(context0));
    }

    @Deprecated
    public final zzwt zze(int v, zzvs zzvs0) {
        Map map0 = (Map)this.zzam.get(v);
        return map0 == null ? null : ((zzwt)map0.get(zzvs0));
    }

    public final boolean zzf(int v) {
        return this.zzan.get(v);
    }

    @Deprecated
    public final boolean zzg(int v, zzvs zzvs0) {
        Map map0 = (Map)this.zzam.get(v);
        return map0 != null && map0.containsKey(zzvs0);
    }
}

