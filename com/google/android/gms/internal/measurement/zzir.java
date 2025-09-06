package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum zzir {
    DOUBLE(0, zzit.zza, zzjk.zze),
    FLOAT(1, zzit.zza, zzjk.zzd),
    INT64(2, zzit.zza, zzjk.zzc),
    UINT64(3, zzit.zza, zzjk.zzc),
    INT32(4, zzit.zza, zzjk.zzb),
    FIXED64(5, zzit.zza, zzjk.zzc),
    FIXED32(6, zzit.zza, zzjk.zzb),
    BOOL(7, zzit.zza, zzjk.zzf),
    STRING(8, zzit.zza, zzjk.zzg),
    MESSAGE(9, zzit.zza, zzjk.zzj),
    BYTES(10, zzit.zza, zzjk.zzh),
    UINT32(11, zzit.zza, zzjk.zzb),
    ENUM(12, zzit.zza, zzjk.zzi),
    SFIXED32(13, zzit.zza, zzjk.zzb),
    SFIXED64(14, zzit.zza, zzjk.zzc),
    SINT32(15, zzit.zza, zzjk.zzb),
    SINT64(16, zzit.zza, zzjk.zzc),
    GROUP(17, zzit.zza, zzjk.zzj),
    DOUBLE_LIST(18, zzit.zzb, zzjk.zze),
    FLOAT_LIST(19, zzit.zzb, zzjk.zzd),
    INT64_LIST(20, zzit.zzb, zzjk.zzc),
    UINT64_LIST(21, zzit.zzb, zzjk.zzc),
    INT32_LIST(22, zzit.zzb, zzjk.zzb),
    FIXED64_LIST(23, zzit.zzb, zzjk.zzc),
    FIXED32_LIST(24, zzit.zzb, zzjk.zzb),
    BOOL_LIST(25, zzit.zzb, zzjk.zzf),
    STRING_LIST(26, zzit.zzb, zzjk.zzg),
    MESSAGE_LIST(27, zzit.zzb, zzjk.zzj),
    BYTES_LIST(28, zzit.zzb, zzjk.zzh),
    UINT32_LIST(29, zzit.zzb, zzjk.zzb),
    ENUM_LIST(30, zzit.zzb, zzjk.zzi),
    SFIXED32_LIST(0x1F, zzit.zzb, zzjk.zzb),
    SFIXED64_LIST(0x20, zzit.zzb, zzjk.zzc),
    SINT32_LIST(33, zzit.zzb, zzjk.zzb),
    SINT64_LIST(34, zzit.zzb, zzjk.zzc),
    DOUBLE_LIST_PACKED(35, zzit.zzc, zzjk.zze),
    FLOAT_LIST_PACKED(36, zzit.zzc, zzjk.zzd),
    INT64_LIST_PACKED(37, zzit.zzc, zzjk.zzc),
    UINT64_LIST_PACKED(38, zzit.zzc, zzjk.zzc),
    INT32_LIST_PACKED(39, zzit.zzc, zzjk.zzb),
    FIXED64_LIST_PACKED(40, zzit.zzc, zzjk.zzc),
    FIXED32_LIST_PACKED(41, zzit.zzc, zzjk.zzb),
    BOOL_LIST_PACKED(42, zzit.zzc, zzjk.zzf),
    UINT32_LIST_PACKED(43, zzit.zzc, zzjk.zzb),
    ENUM_LIST_PACKED(44, zzit.zzc, zzjk.zzi),
    SFIXED32_LIST_PACKED(45, zzit.zzc, zzjk.zzb),
    SFIXED64_LIST_PACKED(46, zzit.zzc, zzjk.zzc),
    SINT32_LIST_PACKED(0x2F, zzit.zzc, zzjk.zzb),
    SINT64_LIST_PACKED(0x30, zzit.zzc, zzjk.zzc),
    GROUP_LIST(49, zzit.zzb, zzjk.zzj),
    MAP(50, zzit.zzd, zzjk.zza);

    private static final zzir[] zzaz;
    private static final Type[] zzba;
    private static final zzir[] zzbb;
    private final zzjk zzbc;
    private final int zzbd;
    private final zzit zzbe;
    private final Class zzbf;
    private final boolean zzbg;

    static {
        arr_zzir[0] = zzir.zzc;
        arr_zzir[1] = zzir.zzd;
        arr_zzir[2] = zzir.zze;
        arr_zzir[3] = zzir.zzf;
        arr_zzir[4] = zzir.zzg;
        arr_zzir[5] = zzir.zzh;
        arr_zzir[6] = zzir.zzi;
        arr_zzir[7] = zzir.zzj;
        arr_zzir[8] = zzir.zzk;
        arr_zzir[9] = zzir.zzl;
        arr_zzir[10] = zzir.zzm;
        arr_zzir[11] = zzir.zzn;
        arr_zzir[12] = zzir.zzo;
        arr_zzir[13] = zzir.zzp;
        arr_zzir[14] = zzir.zzq;
        arr_zzir[15] = zzir.zzr;
        arr_zzir[16] = zzir.zzs;
        arr_zzir[17] = zzir.zzt;
        arr_zzir[18] = zzir.zzu;
        arr_zzir[19] = zzir.zzv;
        arr_zzir[20] = zzir.zzw;
        arr_zzir[21] = zzir.zzx;
        arr_zzir[22] = zzir.zzy;
        arr_zzir[23] = zzir.zzz;
        arr_zzir[24] = zzir.zzaa;
        arr_zzir[25] = zzir.zzab;
        arr_zzir[26] = zzir.zzac;
        arr_zzir[27] = zzir.zzad;
        arr_zzir[28] = zzir.zzae;
        arr_zzir[29] = zzir.zzaf;
        arr_zzir[30] = zzir.zzag;
        arr_zzir[0x1F] = zzir.zzah;
        arr_zzir[0x20] = zzir.zzai;
        arr_zzir[33] = zzir.zzaj;
        arr_zzir[34] = zzir.zzak;
        arr_zzir[35] = zzir.zza;
        arr_zzir[36] = zzir.zzal;
        arr_zzir[37] = zzir.zzam;
        arr_zzir[38] = zzir.zzan;
        arr_zzir[39] = zzir.zzao;
        arr_zzir[40] = zzir.zzap;
        arr_zzir[41] = zzir.zzaq;
        arr_zzir[42] = zzir.zzar;
        arr_zzir[43] = zzir.zzas;
        arr_zzir[44] = zzir.zzat;
        arr_zzir[45] = zzir.zzau;
        arr_zzir[46] = zzir.zzav;
        arr_zzir[0x2F] = zzir.zzaw;
        arr_zzir[0x30] = zzir.zzb;
        arr_zzir[49] = zzir.zzax;
        arr_zzir[50] = zzir.zzay;
        zzir.zzbb = arr_zzir;
        zzir.zzba = new Type[0];
        zzir[] arr_zzir1 = (zzir[])zzir.zzbb.clone();
        zzir.zzaz = new zzir[arr_zzir1.length];
        for(int v = 0; v < arr_zzir1.length; ++v) {
            zzir zzir0 = arr_zzir1[v];
            zzir.zzaz[zzir0.zzbd] = zzir0;
        }
    }

    private zzir(int v1, zzit zzit0, zzjk zzjk0) {
        this.zzbd = v1;
        this.zzbe = zzit0;
        this.zzbc = zzjk0;
        boolean z = true;
        switch(zzit0.ordinal()) {
            case 1: {
                this.zzbf = zzjk0.zza();
                break;
            }
            case 3: {
                this.zzbf = zzjk0.zza();
                break;
            }
            default: {
                this.zzbf = null;
            }
        }
        if(zzit0 == zzit.zza) {
            switch(zziu.zza[zzjk0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    z = false;
                }
            }
        }
        else {
            z = false;
        }
        this.zzbg = z;
    }

    public final int zza() {
        return this.zzbd;
    }
}

