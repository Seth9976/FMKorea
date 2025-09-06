package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzbv {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
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
    public static final zzbv zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    public static final zzn zzb;
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final CharSequence zzg;
    public final byte[] zzh;
    public final Integer zzi;
    public final Integer zzj;
    public final Integer zzk;
    @Deprecated
    public final Integer zzl;
    public final Boolean zzm;
    @Deprecated
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final Integer zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final CharSequence zzx;
    public final CharSequence zzy;
    public final Integer zzz;

    static {
        zzbv.zza = new zzbv(new zzbt());
        zzbv.zzA = "0";
        zzbv.zzB = "1";
        zzbv.zzC = "2";
        zzbv.zzD = "3";
        zzbv.zzE = "4";
        zzbv.zzF = "5";
        zzbv.zzG = "6";
        zzbv.zzH = "8";
        zzbv.zzI = "9";
        zzbv.zzJ = "a";
        zzbv.zzK = "b";
        zzbv.zzL = "c";
        zzbv.zzM = "d";
        zzbv.zzN = "e";
        zzbv.zzO = "f";
        zzbv.zzP = "g";
        zzbv.zzQ = "h";
        zzbv.zzR = "i";
        zzbv.zzS = "j";
        zzbv.zzT = "k";
        zzbv.zzU = "l";
        zzbv.zzV = "m";
        zzbv.zzW = "n";
        zzbv.zzX = "o";
        zzbv.zzY = "p";
        zzbv.zzZ = "q";
        zzbv.zzaa = "r";
        zzbv.zzab = "s";
        zzbv.zzac = "t";
        zzbv.zzad = "u";
        zzbv.zzae = "v";
        zzbv.zzaf = "w";
        zzbv.zzag = "rs";
        zzbv.zzb = zzbr.zza;
    }

    private zzbv(zzbt zzbt0) {
        Boolean boolean0 = zzbt0.zzk;
        Integer integer0 = zzbt0.zzj;
        Integer integer1 = zzbt0.zzw;
        boolean z = true;
        int v = 0;
        if(boolean0 == null) {
            if(integer0 != null) {
                if(((int)integer0) == -1) {
                    z = false;
                }
                boolean0 = Boolean.valueOf(z);
                if(z && integer1 == null) {
                    switch(((int)integer0)) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            v = 21;
                            break;
                        }
                        case 3: {
                            v = 22;
                            break;
                        }
                        case 4: {
                            v = 23;
                            break;
                        }
                        case 5: {
                            v = 24;
                            break;
                        }
                        case 6: {
                            v = 25;
                            break;
                        }
                        default: {
                            v = 20;
                        }
                    }
                    integer1 = v;
                }
            }
        }
        else if(!boolean0.booleanValue()) {
            integer0 = -1;
        }
        else if(integer0 == null || ((int)integer0) == -1) {
            if(integer1 == null) {
                z = false;
            }
            else {
                switch(((int)integer1)) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        break;
                    }
                    case 21: {
                        z = false;
                        break;
                    }
                    case 22: {
                        z = true;
                        break;
                    }
                    case 23: {
                        z = false;
                        break;
                    }
                    case 24: {
                        z = true;
                        break;
                    }
                    case 25: {
                        z = false;
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
            }
            integer0 = (int)z;
        }
        this.zzc = zzbt0.zza;
        this.zzd = zzbt0.zzb;
        this.zze = zzbt0.zzc;
        this.zzf = zzbt0.zzd;
        this.zzg = zzbt0.zze;
        this.zzh = zzbt0.zzf;
        this.zzi = zzbt0.zzg;
        this.zzj = zzbt0.zzh;
        this.zzk = zzbt0.zzi;
        this.zzl = integer0;
        this.zzm = boolean0;
        this.zzn = zzbt0.zzl;
        this.zzo = zzbt0.zzl;
        this.zzp = zzbt0.zzm;
        this.zzq = zzbt0.zzn;
        this.zzr = zzbt0.zzo;
        this.zzs = zzbt0.zzp;
        this.zzt = zzbt0.zzq;
        this.zzu = zzbt0.zzr;
        this.zzv = zzbt0.zzs;
        this.zzw = zzbt0.zzt;
        this.zzx = zzbt0.zzu;
        this.zzy = zzbt0.zzv;
        this.zzz = integer1;
    }

    zzbv(zzbt zzbt0, zzbu zzbu0) {
        this(zzbt0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzbv.class == class0) {
                zzbv zzbv0 = (zzbv)object0;
                return zzfk.zzD(this.zzc, zzbv0.zzc) && zzfk.zzD(this.zzd, zzbv0.zzd) && zzfk.zzD(this.zze, zzbv0.zze) && zzfk.zzD(this.zzf, zzbv0.zzf) && zzfk.zzD(null, null) && zzfk.zzD(null, null) && zzfk.zzD(this.zzg, zzbv0.zzg) && zzfk.zzD(null, null) && zzfk.zzD(null, null) && Arrays.equals(this.zzh, zzbv0.zzh) && zzfk.zzD(this.zzi, zzbv0.zzi) && zzfk.zzD(null, null) && zzfk.zzD(this.zzj, zzbv0.zzj) && zzfk.zzD(this.zzk, zzbv0.zzk) && zzfk.zzD(this.zzl, zzbv0.zzl) && zzfk.zzD(this.zzm, zzbv0.zzm) && zzfk.zzD(null, null) && zzfk.zzD(this.zzo, zzbv0.zzo) && zzfk.zzD(this.zzp, zzbv0.zzp) && zzfk.zzD(this.zzq, zzbv0.zzq) && zzfk.zzD(this.zzr, zzbv0.zzr) && zzfk.zzD(this.zzs, zzbv0.zzs) && zzfk.zzD(this.zzt, zzbv0.zzt) && zzfk.zzD(this.zzu, zzbv0.zzu) && zzfk.zzD(this.zzv, zzbv0.zzv) && zzfk.zzD(this.zzw, zzbv0.zzw) && zzfk.zzD(null, null) && zzfk.zzD(null, null) && zzfk.zzD(this.zzx, zzbv0.zzx) && zzfk.zzD(null, null) && zzfk.zzD(this.zzy, zzbv0.zzy) && zzfk.zzD(this.zzz, zzbv0.zzz);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.zzh);
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, integer0, this.zzi, null, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, null, null, this.zzx, null, this.zzy, this.zzz});
    }

    public final zzbt zza() {
        return new zzbt(this, null);
    }
}

