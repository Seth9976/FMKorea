package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzqk extends zzsa implements zzkp {
    private final Context zzb;
    private final zzox zzc;
    private final zzpe zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private zzlm zzm;

    public zzqk(Context context0, zzrs zzrs0, zzsc zzsc0, boolean z, Handler handler0, zzoy zzoy0, zzpe zzpe0) {
        super(1, zzrs0, zzsc0, false, 44100.0f);
        this.zzb = context0.getApplicationContext();
        this.zzd = zzpe0;
        this.zzc = new zzox(handler0, zzoy0);
        zzpe0.zzp(new zzqj(this, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected final void zzA() {
        this.zzd.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    protected final void zzB() {
        this.zzaH();
        this.zzd.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final String zzQ() {
        return "MediaCodecAudioRenderer";
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzsa
    public final boolean zzS() {
        return super.zzS() && this.zzd.zzx();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzsa
    public final boolean zzT() {
        return this.zzd.zzw() || super.zzT();
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final float zzV(float f, zzam zzam0, zzam[] arr_zzam) {
        int v1 = -1;
        for(int v = 0; v < arr_zzam.length; ++v) {
            int v2 = arr_zzam[v].zzA;
            if(v2 != -1) {
                v1 = Math.max(v1, v2);
            }
        }
        return v1 == -1 ? -1.0f : ((float)v1) * f;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final int zzW(zzsc zzsc0, zzam zzam0) {
        int v2;
        int v = 0x80;
        if(!zzcc.zzf(zzam0.zzm)) {
            return 0x80;
        }
        int v1 = zzfk.zza < 21 ? 0 : 0x20;
        boolean z = zzsa.zzaE(zzam0);
        if(z && (zzam0.zzF == 0 || zzsp.zzd() != null)) {
            zzom zzom0 = this.zzd.zzd(zzam0);
            if(zzom0.zzb) {
                v2 = zzom0.zzc ? 0x600 : 0x200;
                if(zzom0.zzd) {
                    v2 |= 0x800;
                }
            }
            else {
                v2 = 0;
            }
            if(this.zzd.zzy(zzam0)) {
                return v1 | 140 | v2;
            }
        }
        else {
            v2 = 0;
        }
        if("audio/raw".equals(zzam0.zzm) && !this.zzd.zzy(zzam0)) {
            return 0x81;
        }
        zzam zzam1 = zzfk.zzw(2, zzam0.zzz, zzam0.zzA);
        if(!this.zzd.zzy(zzam1)) {
            return 0x81;
        }
        List list0 = zzqk.zzaG(zzsc0, zzam0, false, this.zzd);
        if(list0.isEmpty()) {
            return 0x81;
        }
        if(!z) {
            return 130;
        }
        int v3 = 1;
        zzrw zzrw0 = (zzrw)list0.get(0);
        boolean z1 = zzrw0.zze(zzam0);
        if(!z1) {
            for(int v4 = 1; v4 < list0.size(); ++v4) {
                zzrw zzrw1 = (zzrw)list0.get(v4);
                if(zzrw1.zze(zzam0)) {
                    v3 = 0;
                    z1 = true;
                    zzrw0 = zzrw1;
                    break;
                }
            }
        }
        int v5 = !z1 || !zzrw0.zzf(zzam0) ? 8 : 16;
        int v6 = zzrw0.zzg ? 0x40 : 0;
        if(1 != v3) {
            v = 0;
        }
        return (z1 ? 4 : 3) | v5 | v1 | v6 | v | v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzX(zzrw zzrw0, zzam zzam0, zzam zzam1) {
        zzie zzie0 = zzrw0.zzb(zzam0, zzam1);
        int v = this.zzaC(zzam1) ? zzie0.zze | 0x8000 : zzie0.zze;
        if(this.zzaF(zzrw0, zzam1) > this.zze) {
            v |= 0x40;
        }
        return v == 0 ? new zzie(zzrw0.zza, zzam0, zzam1, zzie0.zzd, 0) : new zzie(zzrw0.zza, zzam0, zzam1, 0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzY(zzkn zzkn0) {
        zzam zzam0 = zzkn0.zza;
        zzam0.getClass();
        this.zzg = zzam0;
        zzie zzie0 = super.zzY(zzkn0);
        this.zzc.zzg(this.zzg, zzie0);
        return zzie0;
    }

    static zzlm zzZ(zzqk zzqk0) {
        return zzqk0.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if(this.zzbc() == 2) {
            this.zzaH();
        }
        return this.zzi;
    }

    // 去混淆评级： 低(30)
    private final int zzaF(zzrw zzrw0, zzam zzam0) {
        return !"OMX.google.raw.decoder".equals(zzrw0.zza) || (zzfk.zza >= 24 || zzfk.zza == 23 && zzfk.zzF(this.zzb)) ? zzam0.zzn : -1;
    }

    private static List zzaG(zzsc zzsc0, zzam zzam0, boolean z, zzpe zzpe0) {
        if(zzam0.zzm == null) {
            return zzfud.zzl();
        }
        if(zzpe0.zzy(zzam0)) {
            zzrw zzrw0 = zzsp.zzd();
            if(zzrw0 != null) {
                return zzfud.zzm(zzrw0);
            }
        }
        return zzsp.zzh(zzsc0, zzam0, false, false);
    }

    private final void zzaH() {
        boolean z = this.zzS();
        long v = this.zzd.zzb(z);
        if(v != 0x8000000000000000L) {
            if(!this.zzk) {
                v = Math.max(this.zzi, v);
            }
            this.zzi = v;
            this.zzk = false;
        }
    }

    static zzox zzaa(zzqk zzqk0) {
        return zzqk0.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final zzrr zzab(zzrw zzrw0, zzam zzam0, MediaCrypto mediaCrypto0, float f) {
        zzam[] arr_zzam = this.zzP();
        int v = this.zzaF(zzrw0, zzam0);
        if(arr_zzam.length != 1) {
            for(int v1 = 0; v1 < arr_zzam.length; ++v1) {
                zzam zzam1 = arr_zzam[v1];
                if(zzrw0.zzb(zzam0, zzam1).zzd != 0) {
                    v = Math.max(v, this.zzaF(zzrw0, zzam1));
                }
            }
        }
        this.zze = v;
        int v2 = zzfk.zza;
        this.zzf = v2 < 24 && "OMX.SEC.aac.dec".equals(zzrw0.zza) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("zeroflte") || zzfk.zzb.startsWith("herolte") || zzfk.zzb.startsWith("heroqlte"));
        int v3 = this.zze;
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", zzrw0.zzc);
        mediaFormat0.setInteger("channel-count", zzam0.zzz);
        mediaFormat0.setInteger("sample-rate", zzam0.zzA);
        zzeu.zzb(mediaFormat0, zzam0.zzo);
        zzeu.zza(mediaFormat0, "max-input-size", v3);
        if(v2 >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f && (v2 != 23 || !"ZTE B2017G".equals(zzfk.zzd) && !"AXON 7 mini".equals(zzfk.zzd))) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(v2 <= 28 && "audio/ac4".equals(zzam0.zzm)) {
            mediaFormat0.setInteger("ac4-is-sync", 1);
        }
        if(v2 >= 24) {
            zzam zzam2 = zzfk.zzw(4, zzam0.zzz, zzam0.zzA);
            if(this.zzd.zza(zzam2) == 2) {
                mediaFormat0.setInteger("pcm-encoding", 4);
            }
        }
        if(v2 >= 0x20) {
            mediaFormat0.setInteger("max-output-channel-count", 99);
        }
        this.zzh = !"audio/raw".equals(zzrw0.zzb) || "audio/raw".equals(zzam0.zzm) ? null : zzam0;
        return zzrr.zza(zzrw0, mediaFormat0, zzam0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final List zzac(zzsc zzsc0, zzam zzam0, boolean z) {
        return zzsp.zzi(zzqk.zzaG(zzsc0, zzam0, false, this.zzd), zzam0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzad(Exception exception0) {
        zzes.zzd("MediaCodecAudioRenderer", "Audio codec error", exception0);
        this.zzc.zza(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzae(String s, zzrr zzrr0, long v, long v1) {
        this.zzc.zzc(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzaf(String s) {
        this.zzc.zzd(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzag(zzam zzam0, MediaFormat mediaFormat0) {
        int v;
        zzam zzam1 = this.zzh;
        int[] arr_v = null;
        if(zzam1 != null) {
            zzam0 = zzam1;
        }
        else if(this.zzaq() != null) {
            if("audio/raw".equals(zzam0.zzm)) {
                v = zzam0.zzB;
            }
            else if(zzfk.zza < 24 || !mediaFormat0.containsKey("pcm-encoding")) {
                v = mediaFormat0.containsKey("v-bits-per-sample") ? zzfk.zzk(mediaFormat0.getInteger("v-bits-per-sample")) : 2;
            }
            else {
                v = mediaFormat0.getInteger("pcm-encoding");
            }
            zzak zzak0 = new zzak();
            zzak0.zzS("audio/raw");
            zzak0.zzN(v);
            zzak0.zzC(zzam0.zzC);
            zzak0.zzD(zzam0.zzD);
            zzak0.zzw(mediaFormat0.getInteger("channel-count"));
            zzak0.zzT(mediaFormat0.getInteger("sample-rate"));
            zzam zzam2 = zzak0.zzY();
            if(this.zzf && zzam2.zzz == 6) {
                int v1 = zzam0.zzz;
                if(v1 < 6) {
                    arr_v = new int[v1];
                    for(int v2 = 0; v2 < zzam0.zzz; ++v2) {
                        arr_v[v2] = v2;
                    }
                }
            }
            zzam0 = zzam2;
        }
        try {
            if(zzfk.zza >= 29) {
                if(this.zzaB()) {
                    this.zzm();
                }
                zzdy.zzf(true);
            }
            this.zzd.zze(zzam0, 0, arr_v);
            return;
        }
        catch(zzoz zzoz0) {
        }
        throw this.zzi(zzoz0, zzoz0.zza, false, 5001);
    }

    protected final void zzah() {
        this.zzk = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzai(long v) {
        super.zzai(v);
        this.zzj = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzaj() {
        this.zzd.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzak(zzht zzht0) {
        if(this.zzj && !zzht0.zzf()) {
            if(Math.abs(zzht0.zzd - this.zzi) > 500000L) {
                this.zzi = zzht0.zzd;
            }
            this.zzj = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzal() {
        try {
            this.zzd.zzj();
        }
        catch(zzpd zzpd0) {
            throw this.zzi(zzpd0, zzpd0.zzc, zzpd0.zzb, 5002);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzam(long v, long v1, zzrt zzrt0, ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, zzam zzam0) {
        byteBuffer0.getClass();
        if(this.zzh != null && (v3 & 2) != 0) {
            zzrt0.getClass();
            zzrt0.zzn(v2, false);
            return true;
        }
        if(z) {
            if(zzrt0 != null) {
                zzrt0.zzn(v2, false);
            }
            this.zza.zzf += v4;
            this.zzd.zzg();
            return true;
        }
        try {
            if(this.zzd.zzv(byteBuffer0, v5, v4)) {
                goto label_17;
            }
            return false;
        }
        catch(zzpa zzpa0) {
            throw this.zzi(zzpa0, this.zzg, zzpa0.zzb, 5001);
        }
        catch(zzpd zzpd0) {
            throw this.zzi(zzpd0, zzam0, zzpd0.zzb, 5002);
        }
    label_17:
        if(zzrt0 != null) {
            zzrt0.zzn(v2, false);
        }
        this.zza.zze += v4;
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzan(zzam zzam0) {
        this.zzm();
        return this.zzd.zzy(zzam0);
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zzd.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzch0) {
        this.zzd.zzq(zzch0);
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    public final zzkp zzk() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzic
    public final void zzt(int v, Object object0) {
        switch(v) {
            case 2: {
                this.zzd.zzu(((float)(((Float)object0))));
                return;
            }
            case 3: {
                this.zzd.zzl(((zzk)object0));
                return;
            }
            case 6: {
                this.zzd.zzn(((zzl)object0));
                return;
            }
            case 9: {
                this.zzd.zzt(((Boolean)object0).booleanValue());
                return;
            }
            case 10: {
                this.zzd.zzm(((int)(((Integer)object0))));
                return;
            }
            case 11: {
                this.zzm = (zzlm)object0;
                return;
            }
            case 12: {
                if(zzfk.zza >= 23) {
                    zzqh.zza(this.zzd, object0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzw() {
        try {
            this.zzl = true;
            this.zzg = null;
            this.zzd.zzf();
        }
        catch(Throwable unused_ex) {
            try {
                super.zzw();
            }
            throw throwable0;
        }
        finally {
            this.zzc.zze(this.zza);
        }
        super.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzx(boolean z, boolean z1) {
        super.zzx(z, z1);
        this.zzc.zzf(this.zza);
        this.zzm();
        zzoh zzoh0 = this.zzn();
        this.zzd.zzr(zzoh0);
        zzdz zzdz0 = this.zzh();
        this.zzd.zzo(zzdz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzy(long v, boolean z) {
        super.zzy(v, z);
        this.zzd.zzf();
        this.zzi = v;
        this.zzj = true;
        this.zzk = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsa
    protected final void zzz() {
        try {
            super.zzz();
        }
        catch(Throwable throwable0) {
            if(this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
            throw throwable0;
        }
        if(this.zzl) {
            this.zzl = false;
            this.zzd.zzk();
        }
    }
}

