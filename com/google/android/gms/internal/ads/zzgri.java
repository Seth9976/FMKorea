package com.google.android.gms.internal.ads;

public enum zzgri {
    DOUBLE(0, 1, zzgse.zze),
    FLOAT(1, 1, zzgse.zzd),
    INT64(2, 1, zzgse.zzc),
    UINT64(3, 1, zzgse.zzc),
    INT32(4, 1, zzgse.zzb),
    FIXED64(5, 1, zzgse.zzc),
    FIXED32(6, 1, zzgse.zzb),
    BOOL(7, 1, zzgse.zzf),
    STRING(8, 1, zzgse.zzg),
    MESSAGE(9, 1, zzgse.zzj),
    BYTES(10, 1, zzgse.zzh),
    UINT32(11, 1, zzgse.zzb),
    ENUM(12, 1, zzgse.zzi),
    SFIXED32(13, 1, zzgse.zzb),
    SFIXED64(14, 1, zzgse.zzc),
    SINT32(15, 1, zzgse.zzb),
    SINT64(16, 1, zzgse.zzc),
    GROUP(17, 1, zzgse.zzj),
    DOUBLE_LIST(18, 2, zzgse.zze),
    FLOAT_LIST(19, 2, zzgse.zzd),
    INT64_LIST(20, 2, zzgse.zzc),
    UINT64_LIST(21, 2, zzgse.zzc),
    INT32_LIST(22, 2, zzgse.zzb),
    FIXED64_LIST(23, 2, zzgse.zzc),
    FIXED32_LIST(24, 2, zzgse.zzb),
    BOOL_LIST(25, 2, zzgse.zzf),
    STRING_LIST(26, 2, zzgse.zzg),
    MESSAGE_LIST(27, 2, zzgse.zzj),
    BYTES_LIST(28, 2, zzgse.zzh),
    UINT32_LIST(29, 2, zzgse.zzb),
    ENUM_LIST(30, 2, zzgse.zzi),
    SFIXED32_LIST(0x1F, 2, zzgse.zzb),
    SFIXED64_LIST(0x20, 2, zzgse.zzc),
    SINT32_LIST(33, 2, zzgse.zzb),
    SINT64_LIST(34, 2, zzgse.zzc),
    DOUBLE_LIST_PACKED(35, 3, zzgse.zze),
    FLOAT_LIST_PACKED(36, 3, zzgse.zzd),
    INT64_LIST_PACKED(37, 3, zzgse.zzc),
    UINT64_LIST_PACKED(38, 3, zzgse.zzc),
    INT32_LIST_PACKED(39, 3, zzgse.zzb),
    FIXED64_LIST_PACKED(40, 3, zzgse.zzc),
    FIXED32_LIST_PACKED(41, 3, zzgse.zzb),
    BOOL_LIST_PACKED(42, 3, zzgse.zzf),
    UINT32_LIST_PACKED(43, 3, zzgse.zzb),
    ENUM_LIST_PACKED(44, 3, zzgse.zzi),
    SFIXED32_LIST_PACKED(45, 3, zzgse.zzb),
    SFIXED64_LIST_PACKED(46, 3, zzgse.zzc),
    SINT32_LIST_PACKED(0x2F, 3, zzgse.zzb),
    SINT64_LIST_PACKED(0x30, 3, zzgse.zzc),
    GROUP_LIST(49, 2, zzgse.zzj),
    MAP(50, 4, zzgse.zza);

    private static final zzgri[] zzZ;
    private static final zzgri[] zzaa;
    private final zzgse zzab;
    private final int zzac;
    private final Class zzad;

    static {
        arr_zzgri[0] = zzgri.zza;
        arr_zzgri[1] = zzgri.zzb;
        arr_zzgri[2] = zzgri.zzc;
        arr_zzgri[3] = zzgri.zzd;
        arr_zzgri[4] = zzgri.zze;
        arr_zzgri[5] = zzgri.zzf;
        arr_zzgri[6] = zzgri.zzg;
        arr_zzgri[7] = zzgri.zzh;
        arr_zzgri[8] = zzgri.zzi;
        arr_zzgri[9] = zzgri.zzj;
        arr_zzgri[10] = zzgri.zzk;
        arr_zzgri[11] = zzgri.zzl;
        arr_zzgri[12] = zzgri.zzm;
        arr_zzgri[13] = zzgri.zzn;
        arr_zzgri[14] = zzgri.zzo;
        arr_zzgri[15] = zzgri.zzp;
        arr_zzgri[16] = zzgri.zzq;
        arr_zzgri[17] = zzgri.zzr;
        arr_zzgri[18] = zzgri.zzs;
        arr_zzgri[19] = zzgri.zzt;
        arr_zzgri[20] = zzgri.zzu;
        arr_zzgri[21] = zzgri.zzv;
        arr_zzgri[22] = zzgri.zzw;
        arr_zzgri[23] = zzgri.zzx;
        arr_zzgri[24] = zzgri.zzy;
        arr_zzgri[25] = zzgri.zzz;
        arr_zzgri[26] = zzgri.zzA;
        arr_zzgri[27] = zzgri.zzB;
        arr_zzgri[28] = zzgri.zzC;
        arr_zzgri[29] = zzgri.zzD;
        arr_zzgri[30] = zzgri.zzE;
        arr_zzgri[0x1F] = zzgri.zzF;
        arr_zzgri[0x20] = zzgri.zzG;
        arr_zzgri[33] = zzgri.zzH;
        arr_zzgri[34] = zzgri.zzI;
        arr_zzgri[35] = zzgri.zzJ;
        arr_zzgri[36] = zzgri.zzK;
        arr_zzgri[37] = zzgri.zzL;
        arr_zzgri[38] = zzgri.zzM;
        arr_zzgri[39] = zzgri.zzN;
        arr_zzgri[40] = zzgri.zzO;
        arr_zzgri[41] = zzgri.zzP;
        arr_zzgri[42] = zzgri.zzQ;
        arr_zzgri[43] = zzgri.zzR;
        arr_zzgri[44] = zzgri.zzS;
        arr_zzgri[45] = zzgri.zzT;
        arr_zzgri[46] = zzgri.zzU;
        arr_zzgri[0x2F] = zzgri.zzV;
        arr_zzgri[0x30] = zzgri.zzW;
        arr_zzgri[49] = zzgri.zzX;
        arr_zzgri[50] = zzgri.zzY;
        zzgri.zzaa = arr_zzgri;
        zzgri[] arr_zzgri1 = (zzgri[])zzgri.zzaa.clone();
        zzgri.zzZ = new zzgri[arr_zzgri1.length];
        for(int v = 0; v < arr_zzgri1.length; ++v) {
            zzgri zzgri0 = arr_zzgri1[v];
            zzgri.zzZ[zzgri0.zzac] = zzgri0;
        }
    }

    private zzgri(int v1, int v2, zzgse zzgse0) {
        this.zzac = v1;
        this.zzab = zzgse0;
        switch(v2 - 1) {
            case 1: {
                this.zzad = zzgse0.zza();
                break;
            }
            case 3: {
                this.zzad = zzgse0.zza();
                break;
            }
            default: {
                this.zzad = null;
            }
        }
        if(v2 == 1) {
            zzgse0.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}

