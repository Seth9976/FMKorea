package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzam {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private static final zzam zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzn zza;
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
    private static final String zzam;
    private int zzan;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbz zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzad zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzs zzy;
    public final int zzz;

    static {
        zzam.zzG = new zzam(new zzak());
        zzam.zzH = "0";
        zzam.zzI = "1";
        zzam.zzJ = "2";
        zzam.zzK = "3";
        zzam.zzL = "4";
        zzam.zzM = "5";
        zzam.zzN = "6";
        zzam.zzO = "7";
        zzam.zzP = "8";
        zzam.zzQ = "9";
        zzam.zzR = "a";
        zzam.zzS = "b";
        zzam.zzT = "c";
        zzam.zzU = "d";
        zzam.zzV = "e";
        zzam.zzW = "f";
        zzam.zzX = "g";
        zzam.zzY = "h";
        zzam.zzZ = "i";
        zzam.zzaa = "j";
        zzam.zzab = "k";
        zzam.zzac = "l";
        zzam.zzad = "m";
        zzam.zzae = "n";
        zzam.zzaf = "o";
        zzam.zzag = "p";
        zzam.zzah = "q";
        zzam.zzai = "r";
        zzam.zzaj = "s";
        zzam.zzak = "t";
        zzam.zzal = "u";
        zzam.zzam = "v";
        zzam.zza = zzai.zza;
    }

    private zzam(zzak zzak0) {
        this.zzb = zzak0.zza;
        this.zzc = zzak0.zzb;
        this.zzd = zzfk.zzA(zzak0.zzc);
        this.zze = zzak0.zzd;
        int v = 0;
        this.zzf = 0;
        int v1 = zzak0.zze;
        this.zzg = v1;
        int v2 = zzak0.zzf;
        this.zzh = v2;
        if(v2 != -1) {
            v1 = v2;
        }
        this.zzi = v1;
        this.zzj = zzak0.zzg;
        this.zzk = zzak0.zzh;
        this.zzl = zzak0.zzi;
        this.zzm = zzak0.zzj;
        this.zzn = zzak0.zzk;
        this.zzo = zzak0.zzl == null ? Collections.emptyList() : zzak0.zzl;
        zzad zzad0 = zzak0.zzm;
        this.zzp = zzad0;
        this.zzq = zzak0.zzn;
        this.zzr = zzak0.zzo;
        this.zzs = zzak0.zzp;
        this.zzt = zzak0.zzq;
        this.zzu = zzak0.zzr == -1 ? 0 : zzak0.zzr;
        this.zzv = zzak0.zzs == -1.0f ? 1.0f : zzak0.zzs;
        this.zzw = zzak0.zzt;
        this.zzx = zzak0.zzu;
        this.zzy = zzak0.zzv;
        this.zzz = zzak0.zzw;
        this.zzA = zzak0.zzx;
        this.zzB = zzak0.zzy;
        this.zzC = zzak0.zzz == -1 ? 0 : zzak0.zzz;
        if(zzak0.zzA != -1) {
            v = zzak0.zzA;
        }
        this.zzD = v;
        this.zzE = zzak0.zzB;
        this.zzF = zzak0.zzC != 0 || zzad0 == null ? zzak0.zzC : 1;
    }

    zzam(zzak zzak0, zzal zzal0) {
        this(zzak0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzam.class == class0) {
                zzam zzam0 = (zzam)object0;
                return this.zzan == 0 || (zzam0.zzan == 0 || this.zzan == zzam0.zzan) ? this.zze == zzam0.zze && this.zzg == zzam0.zzg && this.zzh == zzam0.zzh && this.zzn == zzam0.zzn && this.zzq == zzam0.zzq && this.zzr == zzam0.zzr && this.zzs == zzam0.zzs && this.zzu == zzam0.zzu && this.zzx == zzam0.zzx && this.zzz == zzam0.zzz && this.zzA == zzam0.zzA && this.zzB == zzam0.zzB && this.zzC == zzam0.zzC && this.zzD == zzam0.zzD && this.zzE == zzam0.zzE && this.zzF == zzam0.zzF && Float.compare(this.zzt, zzam0.zzt) == 0 && Float.compare(this.zzv, zzam0.zzv) == 0 && zzfk.zzD(this.zzb, zzam0.zzb) && zzfk.zzD(this.zzc, zzam0.zzc) && zzfk.zzD(this.zzj, zzam0.zzj) && zzfk.zzD(this.zzl, zzam0.zzl) && zzfk.zzD(this.zzm, zzam0.zzm) && zzfk.zzD(this.zzd, zzam0.zzd) && Arrays.equals(this.zzw, zzam0.zzw) && zzfk.zzD(this.zzk, zzam0.zzk) && zzfk.zzD(this.zzy, zzam0.zzy) && zzfk.zzD(this.zzp, zzam0.zzp) && this.zzd(zzam0) : false;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzan;
        if(v == 0) {
            int v1 = 0;
            int v2 = ((((((this.zzb == null ? 0 : this.zzb.hashCode()) + 0x20F) * 0x1F + (this.zzc == null ? 0 : this.zzc.hashCode())) * 0x1F + (this.zzd == null ? 0 : this.zzd.hashCode())) * 0x1F + this.zze) * 961 + this.zzg) * 0x1F + this.zzh;
            int v3 = this.zzj == null ? 0 : this.zzj.hashCode();
            int v4 = this.zzk == null ? 0 : this.zzk.hashCode();
            int v5 = this.zzl == null ? 0 : this.zzl.hashCode();
            String s = this.zzm;
            if(s != null) {
                v1 = s.hashCode();
            }
            v = ((((((((((((((((((((v2 * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1) * 0x1F + this.zzn) * 0x1F + ((int)this.zzq)) * 0x1F + this.zzr) * 0x1F + this.zzs) * 0x1F + Float.floatToIntBits(this.zzt)) * 0x1F + this.zzu) * 0x1F + Float.floatToIntBits(this.zzv)) * 0x1F + this.zzx) * 0x1F + this.zzz) * 0x1F + this.zzA) * 0x1F + this.zzB) * 0x1F + this.zzC) * 0x1F + this.zzD) * 0x1F + this.zzE) * 0x1F - 1) * 0x1F - 1) * 0x1F + this.zzF;
            this.zzan = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + ", " + this.zzy + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int v = this.zzr;
        if(v != -1) {
            return this.zzs == -1 ? -1 : v * this.zzs;
        }
        return -1;
    }

    public final zzak zzb() {
        return new zzak(this, null);
    }

    public final zzam zzc(int v) {
        zzak zzak0 = new zzak(this, null);
        zzak0.zzA(v);
        return new zzam(zzak0);
    }

    public final boolean zzd(zzam zzam0) {
        if(this.zzo.size() == zzam0.zzo.size()) {
            for(int v = 0; v < this.zzo.size(); ++v) {
                if(!Arrays.equals(((byte[])this.zzo.get(v)), ((byte[])zzam0.zzo.get(v)))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

