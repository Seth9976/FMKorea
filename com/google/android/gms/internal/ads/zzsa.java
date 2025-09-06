package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public abstract class zzsa extends zzic {
    private zzrw zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzid zza;
    private boolean zzaa;
    private long zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzrz zzag;
    private long zzah;
    private boolean zzai;
    private zzra zzaj;
    private zzra zzak;
    private static final byte[] zzb;
    private final zzrs zzc;
    private final zzsc zzd;
    private final float zze;
    private final zzht zzf;
    private final zzht zzg;
    private final zzht zzh;
    private final zzro zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzql zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzrt zzt;
    private zzam zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzry zzz;

    static {
        zzsa.zzb = new byte[]{0, 0, 1, 103, 66, (byte)0xC0, 11, -38, 37, (byte)0x90, 0, 0, 1, 104, -50, 15, 19, 0x20, 0, 0, 1, 101, -120, (byte)0x84, 13, -50, 0x71, 24, (byte)0xA0, 0, 0x2F, -65, 28, 49, -61, 39, 93, 120};
    }

    public zzsa(int v, zzrs zzrs0, zzsc zzsc0, boolean z, float f) {
        super(v);
        this.zzc = zzrs0;
        zzsc0.getClass();
        this.zzd = zzsc0;
        this.zze = f;
        this.zzf = new zzht(0, 0);
        this.zzg = new zzht(0, 0);
        this.zzh = new zzht(2, 0);
        zzro zzro0 = new zzro();
        this.zzi = zzro0;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = 0x8000000000000001L;
        this.zzk = new ArrayDeque();
        this.zzaJ(zzrz.zza);
        zzro0.zzj(0);
        zzro0.zzb.order(ByteOrder.nativeOrder());
        this.zzl = new zzql();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = 0x8000000000000001L;
        this.zzab = 0x8000000000000001L;
        this.zzac = 0x8000000000000001L;
        this.zzah = 0x8000000000000001L;
        this.zzW = 0;
        this.zzX = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected final void zzC(zzam[] arr_zzam, long v, long v1) {
        if(this.zzag.zzc == 0x8000000000000001L) {
            this.zzaJ(new zzrz(0x8000000000000001L, v, v1));
            return;
        }
        if(this.zzk.isEmpty() && (this.zzab == 0x8000000000000001L || this.zzah != 0x8000000000000001L && this.zzah >= this.zzab)) {
            this.zzaJ(new zzrz(0x8000000000000001L, v, v1));
            if(this.zzag.zzc != 0x8000000000000001L) {
                this.zzaj();
            }
            return;
        }
        zzrz zzrz0 = new zzrz(this.zzab, v, v1);
        this.zzk.add(zzrz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    public void zzJ(float f, float f1) {
        this.zzr = f;
        this.zzs = f1;
        this.zzaQ(this.zzu);
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public final void zzR(long v, long v1) {
        zzsa zzsa1;
        boolean z2;
        long v8;
        long v6;
        int v5;
        long v4;
        zzro zzro0;
        zzsa zzsa0;
        try {
            zzsa0 = this;
            if(zzsa0.zzae) {
                this.zzal();
                return;
            }
            if(zzsa0.zzm == null && !zzsa0.zzaO(2)) {
                return;
            }
            this.zzau();
            if(zzsa0.zzR) {
                Trace.beginSection("bypassRender");
                while(true) {
                    while(true) {
                    label_9:
                        zzdy.zzf(!zzsa0.zzae);
                        zzro0 = zzsa0.zzi;
                        if(zzro0.zzq()) {
                            goto label_12;
                        }
                        goto label_31;
                    }
                }
            }
            goto label_72;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
        label_12:
            ByteBuffer byteBuffer0 = zzro0.zzb;
            int v2 = zzsa0.zzN;
            long v3 = zzro0.zzd;
            boolean z = zzro0.zzf();
            boolean z1 = zzro0.zzg();
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
            if(this.zzam(v, v1, null, byteBuffer0, v2, 0, zzro0.zzm(), v3, z, z1, zzsa0.zzn)) {
                goto label_22;
            }
            zzsa0 = this;
            goto label_70;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa0 = this;
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
        label_22:
            zzsa0 = this;
            zzsa0.zzai(zzsa0.zzi.zzn());
            zzsa0.zzi.zzb();
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
    label_31:
        if(zzsa0.zzad) {
            zzsa0.zzae = true;
            goto label_70;
        }
        try {
            if(zzsa0.zzS) {
                zzdy.zzf(zzsa0.zzi.zzp(zzsa0.zzh));
                zzsa0.zzS = false;
            }
            if(zzsa0.zzT) {
                if(zzsa0.zzi.zzq()) {
                    goto label_9;
                }
                this.zzZ();
                zzsa0.zzT = false;
                this.zzau();
                if(!zzsa0.zzR) {
                }
            }
            else {
                zzdy.zzf(!zzsa0.zzad);
                zzkn zzkn0 = this.zzj();
                zzsa0.zzh.zzb();
                do {
                    zzsa0.zzh.zzb();
                    switch(zzsa0.zzbd(zzkn0, zzsa0.zzh, 0)) {
                        case -5: {
                            zzsa0.zzY(zzkn0);
                            goto label_66;
                        }
                        case -4: {
                            if(zzsa0.zzh.zzg()) {
                                goto label_65;
                            }
                            if(zzsa0.zzaf) {
                                zzam zzam0 = zzsa0.zzm;
                                if(zzam0 == null) {
                                    throw null;
                                }
                                zzsa0.zzn = zzam0;
                                zzsa0.zzag(zzam0, null);
                                zzsa0.zzaf = false;
                            }
                            zzsa0.zzh.zzk();
                            if(zzsa0.zzm != null && (zzsa0.zzm.zzm != null && zzsa0.zzm.zzm.equals("audio/opus"))) {
                                zzsa0.zzl.zza(zzsa0.zzh, zzsa0.zzm.zzo);
                            }
                            break;
                        }
                        default: {
                            goto label_66;
                        }
                    }
                }
                while(zzsa0.zzi.zzp(zzsa0.zzh));
                zzsa0.zzS = true;
                goto label_66;
            label_65:
                zzsa0.zzad = true;
            label_66:
                zzro zzro1 = zzsa0.zzi;
                if(zzro1.zzq()) {
                    zzro1.zzk();
                }
                if(zzsa0.zzi.zzq() || zzsa0.zzad || zzsa0.zzT) {
                    goto label_9;
                }
            }
        label_70:
            Trace.endSection();
            return;
        label_72:
            if(zzsa0.zzt != null) {
                goto label_73;
            }
            goto label_184;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
        label_73:
            this.zzh();
            v4 = SystemClock.elapsedRealtime();
            Trace.beginSection("drainAndFeed");
            while(true) {
            label_76:
                if(this.zzaN()) {
                    goto label_131;
                }
                else {
                    break;
                }
                goto label_177;
            }
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
            if(!zzsa0.zzG) {
            }
            else if(!zzsa0.zzZ) {
                v5 = zzsa0.zzt.zzb(zzsa0.zzj);
                goto label_89;
            }
            v5 = zzsa0.zzt.zzb(zzsa0.zzj);
            goto label_89;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
            v5 = zzsa0.zzt.zzb(zzsa0.zzj);
            goto label_89;
        }
        catch(IllegalStateException unused_ex) {
            try {
                this.zzaG();
                if(zzsa0.zzae) {
                    this.zzaw();
                    v6 = v4;
                    zzsa1 = zzsa0;
                    goto label_177;
                label_89:
                    if(v5 >= 0) {
                        if(zzsa0.zzJ) {
                            goto label_168;
                        }
                        else {
                            if(zzsa0.zzj.size == 0 && (zzsa0.zzj.flags & 4) != 0) {
                                goto label_164;
                            }
                            else {
                                zzsa0.zzN = v5;
                                ByteBuffer byteBuffer1 = zzsa0.zzt.zzg(v5);
                                zzsa0.zzO = byteBuffer1;
                                if(byteBuffer1 != null) {
                                    byteBuffer1.position(zzsa0.zzj.offset);
                                    zzsa0.zzO.limit(zzsa0.zzj.offset + zzsa0.zzj.size);
                                }
                                if(zzsa0.zzH) {
                                    MediaCodec.BufferInfo mediaCodec$BufferInfo0 = zzsa0.zzj;
                                    if(mediaCodec$BufferInfo0.presentationTimeUs == 0L && (mediaCodec$BufferInfo0.flags & 4) != 0) {
                                        long v7 = zzsa0.zzab;
                                        if(v7 != 0x8000000000000001L) {
                                            mediaCodec$BufferInfo0.presentationTimeUs = v7;
                                        }
                                    }
                                }
                                zzsa0.zzP = zzsa0.zzj.presentationTimeUs >= this.zzf() ? 0 : 1;
                                zzsa0.zzQ = zzsa0.zzac == zzsa0.zzj.presentationTimeUs ? 1 : 0;
                                zzam zzam1 = (zzam)zzsa0.zzag.zzd.zzc(zzsa0.zzj.presentationTimeUs);
                                if(zzam1 == null && zzsa0.zzai && zzsa0.zzv != null) {
                                    zzam1 = (zzam)zzsa0.zzag.zzd.zzb();
                                }
                                if(zzam1 != null) {
                                    zzsa0.zzn = zzam1;
                                    zzsa0.zzag(zzsa0.zzn, zzsa0.zzv);
                                    zzsa0.zzw = false;
                                    zzsa0.zzai = false;
                                }
                                else if(zzsa0.zzw && zzsa0.zzn != null) {
                                    zzsa0.zzag(zzsa0.zzn, zzsa0.zzv);
                                    zzsa0.zzw = false;
                                    zzsa0.zzai = false;
                                }
                                goto label_131;
                            }
                            v6 = v4;
                            zzsa1 = zzsa0;
                            goto label_177;
                        }
                        goto label_170;
                    }
                    else if(v5 == -2) {
                        zzsa0.zzaa = true;
                        MediaFormat mediaFormat0 = zzsa0.zzt.zzc();
                        if(zzsa0.zzB == 0 || mediaFormat0.getInteger("width") != 0x20 || mediaFormat0.getInteger("height") != 0x20) {
                            zzsa0.zzv = mediaFormat0;
                            zzsa0.zzw = true;
                        }
                        else {
                            zzsa0.zzJ = true;
                        }
                        goto label_170;
                    }
                    else if(!zzsa0.zzK || !zzsa0.zzad && zzsa0.zzW != 2) {
                        v6 = v4;
                        zzsa1 = zzsa0;
                    }
                    else {
                        this.zzaG();
                        v6 = v4;
                        zzsa1 = zzsa0;
                    }
                }
                else {
                    v6 = v4;
                    zzsa1 = zzsa0;
                }
                goto label_177;
            }
            catch(IllegalStateException illegalStateException0) {
                zzsa1 = zzsa0;
                goto label_190;
            }
        }
        try {
        label_131:
            if(!zzsa0.zzG || !zzsa0.zzZ) {
                v8 = v4;
                z2 = this.zzam(v, v1, zzsa0.zzt, zzsa0.zzO, zzsa0.zzN, zzsa0.zzj.flags, 1, zzsa0.zzj.presentationTimeUs, zzsa0.zzP, zzsa0.zzQ, zzsa0.zzn);
            }
            else {
                goto label_138;
            }
            goto label_148;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
            z2 = this.zzam(v, v1, zzsa0.zzt, zzsa0.zzO, zzsa0.zzN, zzsa0.zzj.flags, 1, zzsa0.zzj.presentationTimeUs, zzsa0.zzP, zzsa0.zzQ, zzsa0.zzn);
            goto label_148;
        }
        catch(IllegalStateException illegalStateException0) {
            try {
                zzsa1 = this;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            goto label_190;
        }
        try {
        label_138:
            v8 = v4;
            z2 = this.zzam(v, v1, zzsa0.zzt, zzsa0.zzO, zzsa0.zzN, zzsa0.zzj.flags, 1, zzsa0.zzj.presentationTimeUs, zzsa0.zzP, zzsa0.zzQ, zzsa0.zzn);
        }
        catch(IllegalStateException unused_ex) {
            try {
                zzsa0 = this;
                this.zzaG();
                zzsa0 = this;
                if(zzsa0.zzae) {
                    this.zzaw();
                }
                zzsa1 = zzsa0;
                v6 = v8;
                goto label_177;
            }
            catch(IllegalStateException illegalStateException0) {
                zzsa1 = zzsa0;
                goto label_190;
            }
        }
        try {
        label_148:
            if(z2) {
                zzsa1 = this;
                zzsa1.zzai(zzsa1.zzj.presentationTimeUs);
                int v9 = zzsa1.zzj.flags & 4;
                this.zzaI();
                if(v9 == 0) {
                    v6 = v8;
                    goto label_176;
                }
                else {
                    this.zzaG();
                }
            }
            else {
                zzsa1 = this;
            }
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_190;
        }
        try {
            v6 = v8;
            goto label_177;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
        label_164:
            this.zzaG();
            v6 = v4;
            zzsa1 = zzsa0;
            goto label_177;
        label_168:
            zzsa0.zzJ = false;
            zzsa0.zzt.zzn(v5, ((boolean)0));
        label_170:
            v6 = v4;
            zzsa1 = zzsa0;
        }
        catch(IllegalStateException illegalStateException0) {
            zzsa1 = zzsa0;
            goto label_190;
        }
        try {
        label_176:
            if(!zzsa1.zzaP(v6)) {
                while(true) {
                label_177:
                    if(!this.zzaM() || !zzsa1.zzaP(v6)) {
                        Trace.endSection();
                        return;
                    }
                }
            }
            zzsa0 = zzsa1;
            v4 = v6;
            goto label_76;
        label_184:
            zzsa1 = zzsa0;
            zzid zzid0 = zzsa1.zza;
            zzid0.zzd += this.zzd(v);
            zzsa1.zzaO(1);
            return;
        }
        catch(IllegalStateException illegalStateException0) {
        }
    label_190:
        int v10 = zzfk.zza;
        if(v10 < 21 || !(illegalStateException0 instanceof MediaCodec.CodecException)) {
            StackTraceElement[] arr_stackTraceElement = illegalStateException0.getStackTrace();
            if(arr_stackTraceElement.length <= 0 || !arr_stackTraceElement[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException0;
            }
        }
        zzsa1.zzad(illegalStateException0);
        int v11 = v10 < 21 || !(illegalStateException0 instanceof MediaCodec.CodecException) || !((MediaCodec.CodecException)illegalStateException0).isRecoverable() ? 0 : 1;
        if(v11 != 0) {
            this.zzaw();
        }
        throw zzsa1.zzi(zzsa1.zzar(illegalStateException0, zzsa1.zzA), zzsa1.zzm, ((boolean)v11), 4003);
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public boolean zzS() {
        return this.zzae;
    }

    @Override  // com.google.android.gms.internal.ads.zzln
    public boolean zzT() {
        if(this.zzm != null) {
            if(this.zzO() || this.zzaN()) {
                return true;
            }
            if(this.zzL != 0x8000000000000001L) {
                this.zzh();
                return SystemClock.elapsedRealtime() < this.zzL;
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzlp
    public final int zzU(zzam zzam0) {
        try {
            return this.zzW(this.zzd, zzam0);
        }
        catch(zzsj zzsj0) {
            throw this.zzi(zzsj0, zzam0, false, 4002);
        }
    }

    protected float zzV(float f, zzam zzam0, zzam[] arr_zzam) {
        throw null;
    }

    protected abstract int zzW(zzsc arg1, zzam arg2);

    protected zzie zzX(zzrw zzrw0, zzam zzam0, zzam zzam1) {
        throw null;
    }

    protected zzie zzY(zzkn zzkn0) {
        boolean z = true;
        this.zzaf = true;
        zzam zzam0 = zzkn0.zza;
        zzam0.getClass();
        if(zzam0.zzm == null) {
            throw this.zzi(new IllegalArgumentException(), zzam0, false, 4005);
        }
        zzra zzra0 = zzkn0.zzb;
        this.zzak = zzra0;
        this.zzm = zzam0;
        if(this.zzR) {
            this.zzT = true;
            return null;
        }
        zzrt zzrt0 = this.zzt;
        if(zzrt0 == null) {
            this.zzy = null;
            this.zzau();
            return null;
        }
        zzrw zzrw0 = this.zzA;
        zzam zzam1 = this.zzu;
        zzra zzra1 = this.zzaj;
        if(zzra1 == zzra0) {
            boolean z1 = zzra0 != zzra1;
            zzdy.zzf(!z1 || zzfk.zza >= 23);
            zzie zzie0 = this.zzX(zzrw0, zzam1, zzam0);
            int v = zzie0.zzd;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        if(this.zzaQ(zzam0)) {
                            this.zzu = zzam0;
                            if(z1) {
                                if(this.zzaL()) {
                                    return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 0);
                                }
                                return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 2);
                            }
                            if(!this.zzY) {
                                return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 0);
                            }
                            this.zzW = 1;
                            if(!this.zzD && !this.zzF) {
                                this.zzX = 1;
                                return zzie0.zzd == 0 || this.zzt == zzrt0 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 0);
                            }
                            this.zzX = 3;
                            return zzie0.zzd == 0 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 2);
                        }
                        break;
                    }
                    case 2: {
                        if(this.zzaQ(zzam0)) {
                            this.zzU = true;
                            this.zzV = 1;
                            if(this.zzB != 2 && (this.zzB != 1 || zzam0.zzr != zzam1.zzr || zzam0.zzs != zzam1.zzs)) {
                                z = false;
                            }
                            this.zzI = z;
                            this.zzu = zzam0;
                            if(z1 && !this.zzaL()) {
                                return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 2);
                            }
                            return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 0);
                        }
                        break;
                    }
                    default: {
                        if(this.zzaQ(zzam0)) {
                            this.zzu = zzam0;
                            if(!z1 || this.zzaL()) {
                                return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 0);
                            }
                            return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 2);
                        }
                    }
                }
                return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 16);
            }
            this.zzaa();
            return zzie0.zzd == 0 || this.zzt == zzrt0 && this.zzX != 3 ? zzie0 : new zzie(zzrw0.zza, zzam1, zzam0, 0, 0);
        }
        this.zzaa();
        return new zzie(zzrw0.zza, zzam1, zzam0, 0, 0x80);
    }

    private final void zzZ() {
        this.zzT = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzS = false;
        this.zzR = false;
        this.zzl.zzb();
    }

    protected final boolean zzaA() {
        if(this.zzt == null) {
            return false;
        }
        int v = this.zzX;
        if(v != 3 && !this.zzD && (!this.zzE || this.zzaa) && (!this.zzF || !this.zzZ)) {
            if(v == 2) {
                zzdy.zzf(zzfk.zza >= 23);
                if(zzfk.zza >= 23) {
                    try {
                        this.zzaK();
                    }
                    catch(zzil zzil0) {
                        zzes.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", zzil0);
                        this.zzaw();
                        return true;
                    }
                }
            }
            this.zzah();
            return false;
        }
        this.zzaw();
        return true;
    }

    protected final boolean zzaB() {
        return this.zzR;
    }

    protected final boolean zzaC(zzam zzam0) {
        return this.zzak == null && this.zzan(zzam0);
    }

    protected boolean zzaD(zzrw zzrw0) {
        return true;
    }

    protected static boolean zzaE(zzam zzam0) {
        return zzam0.zzF == 0;
    }

    private final void zzaF(zzrw zzrw0, MediaCrypto mediaCrypto0) {
        boolean z1;
        int v7;
        zzrr zzrr2;
        zzrr zzrr1;
        String s1;
        zzrh zzrh0;
        MediaCodec mediaCodec1;
        boolean z = false;
        String s = zzrw0.zza;
        int v = zzfk.zza;
        float f = v >= 23 ? this.zzV(this.zzs, this.zzm, this.zzP()) : -1.0f;
        if(f <= this.zze) {
            f = -1.0f;
        }
        this.zzav(this.zzm);
        this.zzh();
        long v1 = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec0 = null;
        zzrr zzrr0 = this.zzab(zzrw0, this.zzm, null, f);
        if(v >= 0x1F) {
            zzrx.zza(zzrr0, this.zzn());
        }
        try {
            Trace.beginSection(("createCodec:" + s));
            if(v < 23 || v < 0x1F) {
                try {
                    zzrw zzrw1 = zzrr0.zza;
                    if(zzrw1 == null) {
                        throw null;
                    }
                    Trace.beginSection(("createCodec:" + zzrw1.zza));
                    mediaCodec1 = MediaCodec.createByCodecName(zzrw1.zza);
                    Trace.endSection();
                }
                catch(IOException | RuntimeException iOException0) {
                    goto label_40;
                }
                try {
                    Trace.beginSection("configureCodec");
                    mediaCodec1.configure(zzrr0.zzb, zzrr0.zzd, null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodec1.start();
                    Trace.endSection();
                    zzrh0 = new zzsr(mediaCodec1, null);
                    goto label_44;
                }
                catch(IOException | RuntimeException iOException0) {
                    mediaCodec0 = mediaCodec1;
                }
            label_40:
                if(mediaCodec0 != null) {
                    mediaCodec0.release();
                }
                throw iOException0;
            }
            else {
                int v3 = zzcc.zzb(zzrr0.zzc.zzm);
                zzes.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + zzfk.zzz(v3));
                zzrh0 = new zzrf(v3, false).zzc(zzrr0);
            }
        label_44:
            this.zzt = zzrh0;
        }
        finally {
            Trace.endSection();
        }
        this.zzh();
        long v4 = SystemClock.elapsedRealtime();
        if(zzrw0.zze(this.zzm)) {
            zzrr1 = zzrr0;
        }
        else {
            zzam zzam0 = this.zzm;
            if(zzam0 == null) {
                s1 = "null";
                zzrr1 = zzrr0;
            }
            else {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("id=");
                stringBuilder0.append(zzam0.zzb);
                stringBuilder0.append(", mimeType=");
                stringBuilder0.append(zzam0.zzm);
                if(zzam0.zzi != -1) {
                    stringBuilder0.append(", bitrate=");
                    stringBuilder0.append(zzam0.zzi);
                }
                if(zzam0.zzj != null) {
                    stringBuilder0.append(", codecs=");
                    stringBuilder0.append(zzam0.zzj);
                }
                if(zzam0.zzp == null) {
                    zzrr1 = zzrr0;
                }
                else {
                    LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                    int v5 = 0;
                    while(true) {
                        zzad zzad0 = zzam0.zzp;
                        if(v5 >= zzad0.zzb) {
                            break;
                        }
                        UUID uUID0 = zzad0.zza(v5).zza;
                        if(uUID0.equals(zzo.zzb)) {
                            linkedHashSet0.add("cenc");
                            zzrr2 = zzrr0;
                        }
                        else if(uUID0.equals(zzo.zzc)) {
                            linkedHashSet0.add("clearkey");
                            zzrr2 = zzrr0;
                        }
                        else if(uUID0.equals(zzo.zze)) {
                            linkedHashSet0.add("playready");
                            zzrr2 = zzrr0;
                        }
                        else if(uUID0.equals(zzo.zzd)) {
                            linkedHashSet0.add("widevine");
                            zzrr2 = zzrr0;
                        }
                        else if(uUID0.equals(zzo.zza)) {
                            linkedHashSet0.add("universal");
                            zzrr2 = zzrr0;
                        }
                        else {
                            zzrr2 = zzrr0;
                            linkedHashSet0.add("unknown (" + uUID0.toString() + ")");
                        }
                        ++v5;
                        zzrr0 = zzrr2;
                    }
                    zzrr1 = zzrr0;
                    stringBuilder0.append(", drm=[");
                    zzfqx.zzb(stringBuilder0, linkedHashSet0, ",");
                    stringBuilder0.append(']');
                }
                if(zzam0.zzr != -1 && zzam0.zzs != -1) {
                    stringBuilder0.append(", res=");
                    stringBuilder0.append(zzam0.zzr);
                    stringBuilder0.append("x");
                    stringBuilder0.append(zzam0.zzs);
                }
                if(zzam0.zzy != null && zzam0.zzy.zze()) {
                    stringBuilder0.append(", color=");
                    stringBuilder0.append(zzam0.zzy.zzd());
                }
                if(zzam0.zzt != -1.0f) {
                    stringBuilder0.append(", fps=");
                    stringBuilder0.append(zzam0.zzt);
                }
                if(zzam0.zzz != -1) {
                    stringBuilder0.append(", channels=");
                    stringBuilder0.append(zzam0.zzz);
                }
                if(zzam0.zzA != -1) {
                    stringBuilder0.append(", sample_rate=");
                    stringBuilder0.append(zzam0.zzA);
                }
                if(zzam0.zzd != null) {
                    stringBuilder0.append(", language=");
                    stringBuilder0.append(zzam0.zzd);
                }
                if(zzam0.zzc != null) {
                    stringBuilder0.append(", label=");
                    stringBuilder0.append(zzam0.zzc);
                }
                if(zzam0.zze != 0) {
                    ArrayList arrayList0 = new ArrayList();
                    if((zzam0.zze & 1) != 0) {
                        arrayList0.add("default");
                    }
                    if((zzam0.zze & 2) != 0) {
                        arrayList0.add("forced");
                    }
                    stringBuilder0.append(", selectionFlags=[");
                    zzfqx.zzb(stringBuilder0, arrayList0, ",");
                    stringBuilder0.append("]");
                }
                s1 = stringBuilder0.toString();
            }
            zzes.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec\'s capabilities [%s, %s]", s1, s));
        }
        this.zzA = zzrw0;
        this.zzx = f;
        this.zzu = this.zzm;
        int v6 = zzfk.zza;
        if(v6 <= 25 && "OMX.Exynos.avc.dec.secure".equals(s) && (zzfk.zzd.startsWith("SM-T585") || zzfk.zzd.startsWith("SM-A510") || zzfk.zzd.startsWith("SM-A520") || zzfk.zzd.startsWith("SM-J700"))) {
            v7 = 2;
        }
        else if(v6 >= 24 || !"OMX.Nvidia.h264.decode".equals(s) && !"OMX.Nvidia.h264.decode.secure".equals(s)) {
            v7 = 0;
        }
        else if("flounder".equals(zzfk.zzb) || "flounder_lte".equals(zzfk.zzb) || "grouper".equals(zzfk.zzb) || "tilapia".equals(zzfk.zzb)) {
            v7 = 1;
        }
        else {
            v7 = 0;
        }
        this.zzB = v7;
        this.zzC = v6 < 21 && this.zzu.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(s);
        this.zzD = v6 == 19 && zzfk.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(s) || "OMX.Exynos.avc.dec.secure".equals(s));
        this.zzE = v6 == 29 && "c2.android.aac.decoder".equals(s);
        if(v6 <= 23 && "OMX.google.vorbis.decoder".equals(s)) {
            z1 = true;
        }
        else if(v6 > 19 || !"hb2000".equals(zzfk.zzb) && !"stvm8".equals(zzfk.zzb)) {
            z1 = false;
        }
        else if(!"OMX.amlogic.avc.decoder.awesome".equals(s) && !"OMX.amlogic.avc.decoder.awesome.secure".equals(s)) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        this.zzF = z1;
        this.zzG = v6 == 21 && "OMX.google.aac.decoder".equals(s);
        this.zzH = v6 < 21 && "OMX.SEC.mp3.dec".equals(s) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("baffin") || zzfk.zzb.startsWith("grand") || zzfk.zzb.startsWith("fortuna") || zzfk.zzb.startsWith("gprimelte") || zzfk.zzb.startsWith("j2y18lte") || zzfk.zzb.startsWith("ms01"));
        String s2 = zzrw0.zza;
        if(v6 <= 25 && "OMX.rk.video_decoder.avc".equals(s2)) {
            z = true;
        }
        else if(v6 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(s2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(s2) || "OMX.bcm.vdec.avc.tunnel".equals(s2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(s2) || "OMX.bcm.vdec.hevc.tunnel".equals(s2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(s2)) || "Amazon".equals(zzfk.zzc) && "AFTS".equals(zzfk.zzd) && zzrw0.zzf) {
            z = true;
        }
        this.zzK = z;
        this.zzt.zzr();
        if(this.zzbc() == 2) {
            this.zzh();
            this.zzL = SystemClock.elapsedRealtime() + 1000L;
        }
        ++this.zza.zza;
        this.zzae(s, zzrr1, v4, v4 - v1);
    }

    @TargetApi(23)
    private final void zzaG() {
        switch(this.zzX) {
            case 1: {
                this.zzah();
                return;
            }
            case 2: {
                this.zzah();
                this.zzaK();
                return;
            }
            case 3: {
                this.zzaw();
                this.zzau();
                return;
            }
            default: {
                this.zzae = true;
                this.zzal();
            }
        }
    }

    private final void zzaH() {
        this.zzM = -1;
        this.zzg.zzb = null;
    }

    private final void zzaI() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final void zzaJ(zzrz zzrz0) {
        this.zzag = zzrz0;
        if(zzrz0.zzc != 0x8000000000000001L) {
            this.zzai = true;
        }
    }

    private final void zzaK() {
        this.zzaj = this.zzak;
        this.zzW = 0;
        this.zzX = 0;
    }

    @TargetApi(23)
    private final boolean zzaL() {
        if(this.zzY) {
            this.zzW = 1;
            if(!this.zzD && !this.zzF) {
                this.zzX = 2;
                return true;
            }
            this.zzX = 3;
            return false;
        }
        this.zzaK();
        return true;
    }

    private final boolean zzaM() {
        zzrt zzrt0 = this.zzt;
        if(zzrt0 != null && this.zzW != 2 && !this.zzad) {
            if(this.zzM < 0) {
                int v = zzrt0.zza();
                this.zzM = v;
                if(v < 0) {
                    return false;
                }
                this.zzg.zzb = this.zzt.zzf(v);
                this.zzg.zzb();
            }
            if(this.zzW == 1) {
                if(!this.zzK) {
                    this.zzZ = true;
                    this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                    this.zzaH();
                }
                this.zzW = 2;
                return false;
            }
            if(this.zzI) {
                this.zzI = false;
                this.zzg.zzb.put(zzsa.zzb);
                this.zzt.zzj(this.zzM, 0, 38, 0L, 0);
                this.zzaH();
                this.zzY = true;
                return true;
            }
            if(this.zzV == 1) {
                for(int v1 = 0; v1 < this.zzu.zzo.size(); ++v1) {
                    byte[] arr_b = (byte[])this.zzu.zzo.get(v1);
                    this.zzg.zzb.put(arr_b);
                }
                this.zzV = 2;
            }
            int v2 = this.zzg.zzb.position();
            zzkn zzkn0 = this.zzj();
            try {
                int v3 = this.zzbd(zzkn0, this.zzg, 0);
            }
            catch(zzhs zzhs0) {
                this.zzad(zzhs0);
                this.zzaO(0);
                this.zzah();
                return true;
            }
            if(this.zzM() || this.zzg.zzi()) {
                this.zzac = this.zzab;
            }
            switch(v3) {
                case -5: {
                    if(this.zzV == 2) {
                        this.zzg.zzb();
                        this.zzV = 1;
                    }
                    this.zzY(zzkn0);
                    return true;
                }
                case -3: {
                    return false;
                }
                default: {
                    zzht zzht0 = this.zzg;
                    if(zzht0.zzg()) {
                        if(this.zzV == 2) {
                            zzht0.zzb();
                            this.zzV = 1;
                        }
                        this.zzad = true;
                        if(!this.zzY) {
                            this.zzaG();
                            return false;
                        }
                        try {
                            if(!this.zzK) {
                                this.zzZ = true;
                                this.zzt.zzj(this.zzM, 0, 0, 0L, 4);
                                this.zzaH();
                                return false;
                            }
                            return false;
                        }
                        catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                            throw this.zzi(mediaCodec$CryptoException0, this.zzm, false, zzfk.zzi(mediaCodec$CryptoException0.getErrorCode()));
                        }
                    }
                    if(!this.zzY && !zzht0.zzh()) {
                        zzht0.zzb();
                        if(this.zzV == 2) {
                            this.zzV = 1;
                        }
                        return true;
                    }
                    boolean z = zzht0.zzl();
                    if(z) {
                        zzht0.zza.zzb(v2);
                    }
                    if(this.zzC && !z) {
                        ByteBuffer byteBuffer0 = this.zzg.zzb;
                        int v4 = byteBuffer0.position();
                        int v6 = 0;
                        for(int v5 = 0; true; ++v5) {
                            if(v5 + 1 >= v4) {
                                byteBuffer0.clear();
                                break;
                            }
                            int v7 = byteBuffer0.get(v5) & 0xFF;
                            if(v6 != 3) {
                                if(v7 == 0) {
                                    ++v6;
                                }
                            }
                            else if(v7 == 1) {
                                if((byteBuffer0.get(v5 + 1) & 0x1F) == 7) {
                                    ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
                                    byteBuffer1.position(v5 - 3);
                                    byteBuffer1.limit(v4);
                                    byteBuffer0.position(0);
                                    byteBuffer0.put(byteBuffer1);
                                    break;
                                }
                                v7 = 1;
                            }
                            if(v7 != 0) {
                                v6 = 0;
                            }
                        }
                        if(this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzC = false;
                    }
                    long v8 = this.zzg.zzd;
                    if(this.zzaf) {
                        if(this.zzk.isEmpty()) {
                            this.zzag.zzd.zzd(v8, this.zzm);
                        }
                        else {
                            ((zzrz)this.zzk.peekLast()).zzd.zzd(v8, this.zzm);
                        }
                        this.zzaf = false;
                    }
                    this.zzab = Math.max(this.zzab, v8);
                    this.zzg.zzk();
                    zzht zzht1 = this.zzg;
                    if(zzht1.zze()) {
                        this.zzat(zzht1);
                    }
                    this.zzak(this.zzg);
                    try {
                        if(z) {
                            this.zzt.zzk(this.zzM, 0, this.zzg.zza, v8, 0);
                        }
                        else {
                            this.zzt.zzj(this.zzM, 0, this.zzg.zzb.limit(), v8, 0);
                        }
                    }
                    catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                        throw this.zzi(mediaCodec$CryptoException1, this.zzm, false, zzfk.zzi(mediaCodec$CryptoException1.getErrorCode()));
                    }
                    this.zzaH();
                    this.zzY = true;
                    this.zzV = 0;
                    ++this.zza.zzc;
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean zzaN() {
        return this.zzN >= 0;
    }

    private final boolean zzaO(int v) {
        zzkn zzkn0 = this.zzj();
        this.zzf.zzb();
        int v1 = this.zzbd(zzkn0, this.zzf, v | 4);
        if(v1 == -5) {
            this.zzY(zzkn0);
            return true;
        }
        if(v1 == -4 && this.zzf.zzg()) {
            this.zzad = true;
            this.zzaG();
        }
        return false;
    }

    private final boolean zzaP(long v) {
        if(this.zzq != 0x8000000000000001L) {
            this.zzh();
            return SystemClock.elapsedRealtime() - v < this.zzq;
        }
        return true;
    }

    private final boolean zzaQ(zzam zzam0) {
        if(zzfk.zza < 23) {
            return true;
        }
        if(this.zzt != null && this.zzX != 3 && this.zzbc() != 0) {
            float f = this.zzV(this.zzs, zzam0, this.zzP());
            float f1 = this.zzx;
            if(f1 == f) {
                return true;
            }
            if(f == -1.0f) {
                this.zzaa();
                return false;
            }
            if(f1 == -1.0f && f <= this.zze) {
                return true;
            }
            Bundle bundle0 = new Bundle();
            bundle0.putFloat("operating-rate", f);
            this.zzt.zzp(bundle0);
            this.zzx = f;
        }
        return true;
    }

    private final void zzaa() {
        if(this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
            return;
        }
        this.zzaw();
        this.zzau();
    }

    protected abstract zzrr zzab(zzrw arg1, zzam arg2, MediaCrypto arg3, float arg4);

    protected abstract List zzac(zzsc arg1, zzam arg2, boolean arg3);

    protected void zzad(Exception exception0) {
        throw null;
    }

    protected void zzae(String s, zzrr zzrr0, long v, long v1) {
        throw null;
    }

    protected void zzaf(String s) {
        throw null;
    }

    protected void zzag(zzam zzam0, MediaFormat mediaFormat0) {
        throw null;
    }

    private final void zzah() {
        try {
            this.zzt.zzi();
        }
        finally {
            this.zzax();
        }
    }

    protected void zzai(long v) {
        this.zzah = v;
        while(!this.zzk.isEmpty() && v >= ((zzrz)this.zzk.peek()).zzb) {
            this.zzaJ(((zzrz)this.zzk.poll()));
            this.zzaj();
        }
    }

    protected void zzaj() {
    }

    protected void zzak(zzht zzht0) {
        throw null;
    }

    protected void zzal() {
    }

    protected abstract boolean zzam(long arg1, long arg2, zzrt arg3, ByteBuffer arg4, int arg5, int arg6, int arg7, long arg8, boolean arg9, boolean arg10, zzam arg11);

    protected boolean zzan(zzam zzam0) {
        return false;
    }

    protected final float zzao() {
        return this.zzr;
    }

    protected final long zzap() {
        return this.zzag.zzc;
    }

    protected final zzrt zzaq() {
        return this.zzt;
    }

    protected zzru zzar(Throwable throwable0, zzrw zzrw0) {
        return new zzru(throwable0, zzrw0);
    }

    protected final zzrw zzas() {
        return this.zzA;
    }

    protected void zzat(zzht zzht0) {
    }

    protected final void zzau() {
        zzrw zzrw1;
        if(this.zzt == null && !this.zzR) {
            zzam zzam0 = this.zzm;
            if(zzam0 != null) {
                if(this.zzaC(zzam0)) {
                    zzam zzam1 = this.zzm;
                    this.zzZ();
                    if("audio/mp4a-latm".equals(zzam1.zzm) || "audio/mpeg".equals(zzam1.zzm) || "audio/opus".equals(zzam1.zzm)) {
                        this.zzi.zzo(0x20);
                    }
                    else {
                        this.zzi.zzo(1);
                    }
                    this.zzR = true;
                    return;
                }
                this.zzaj = this.zzak;
                zzam zzam2 = this.zzm;
                if(this.zzy == null) {
                    try {
                        try {
                            List list0 = this.zzac(this.zzd, zzam2, false);
                            list0.isEmpty();
                            this.zzy = new ArrayDeque();
                            if(!list0.isEmpty()) {
                                this.zzy.add(((zzrw)list0.get(0)));
                            }
                            this.zzz = null;
                        }
                        catch(zzsj zzsj0) {
                            throw new zzry(this.zzm, zzsj0, false, 0xFFFF3CB2);
                        }
                    label_21:
                        if(this.zzy.isEmpty()) {
                            throw new zzry(this.zzm, null, false, 0xFFFF3CB1);
                        }
                        zzrw zzrw0 = (zzrw)this.zzy.peekFirst();
                        while(true) {
                        label_24:
                            if(this.zzt != null) {
                                this.zzy = null;
                                return;
                            }
                            zzrw1 = (zzrw)this.zzy.peekFirst();
                            if(!this.zzaD(zzrw1)) {
                                return;
                            }
                            goto label_30;
                        }
                    }
                    catch(zzry zzry0) {
                        throw this.zzi(zzry0, this.zzm, false, 4001);
                    }
                }
                goto label_21;
                try {
                label_30:
                    this.zzaF(zzrw1, null);
                    goto label_24;
                }
                catch(Exception exception0) {
                    try {
                        if(zzrw1 != zzrw0) {
                            throw exception0;
                        }
                        zzes.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        this.zzaF(zzrw1, null);
                        goto label_24;
                    }
                    catch(Exception exception1) {
                    }
                    try {
                        zzes.zzg("MediaCodecRenderer", "Failed to initialize decoder: " + zzrw1, exception1);
                        this.zzy.removeFirst();
                        zzry zzry1 = new zzry(this.zzm, exception1, false, zzrw1);
                        this.zzad(zzry1);
                        zzry zzry2 = this.zzz;
                        this.zzz = zzry2 == null ? zzry1 : zzry.zza(zzry2, zzry1);
                        if(this.zzy.isEmpty()) {
                            throw this.zzz;
                        }
                        goto label_24;
                    }
                    catch(zzry zzry0) {
                    }
                }
                throw this.zzi(zzry0, this.zzm, false, 4001);
            }
        }
    }

    protected void zzav(zzam zzam0) {
    }

    protected final void zzaw() {
        try {
            zzrt zzrt0 = this.zzt;
            if(zzrt0 != null) {
                zzrt0.zzl();
                ++this.zza.zzb;
                this.zzaf(this.zzA.zza);
            }
        }
        finally {
            this.zzt = null;
            this.zzo = null;
            this.zzaj = null;
            this.zzay();
        }
    }

    protected void zzax() {
        this.zzaH();
        this.zzaI();
        this.zzL = 0x8000000000000001L;
        this.zzZ = false;
        this.zzY = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzab = 0x8000000000000001L;
        this.zzac = 0x8000000000000001L;
        this.zzah = 0x8000000000000001L;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU;
    }

    protected final void zzay() {
        this.zzax();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzaa = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzE = false;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
        this.zzp = false;
    }

    protected final boolean zzaz() {
        boolean z = this.zzaA();
        if(z) {
            this.zzau();
        }
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    public final int zze() {
        return 8;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected void zzw() {
        this.zzm = null;
        this.zzaJ(zzrz.zza);
        this.zzk.clear();
        this.zzaA();
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected void zzx(boolean z, boolean z1) {
        this.zza = new zzid();
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected void zzy(long v, boolean z) {
        this.zzad = false;
        this.zzae = false;
        if(this.zzR) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzS = false;
            this.zzl.zzb();
        }
        else {
            this.zzaz();
        }
        zzfh zzfh0 = this.zzag.zzd;
        if(zzfh0.zza() > 0) {
            this.zzaf = true;
        }
        zzfh0.zze();
        this.zzk.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected void zzz() {
        try {
            this.zzZ();
            this.zzaw();
            this.zzak = null;
        }
        catch(Throwable throwable0) {
            this.zzak = null;
            throw throwable0;
        }
    }
}

