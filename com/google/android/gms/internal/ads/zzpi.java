package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

final class zzpi {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private zzdz zzJ;
    private final zzph zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpg zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpi(zzph zzph0) {
        this.zza = zzph0;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        }
        catch(NoSuchMethodException unused_ex) {
        }
        this.zzb = new long[10];
        this.zzJ = zzdz.zza;
    }

    public final int zza(long v) {
        long v1 = this.zzo();
        return this.zze - ((int)(v - v1 * ((long)this.zzd)));
    }

    public final long zzb(boolean z) {
        long v10;
        AudioTrack audioTrack0 = this.zzc;
        audioTrack0.getClass();
        if(audioTrack0.getPlayState() == 3) {
            long v = System.nanoTime();
            if(v / 1000L - this.zzm >= 30000L) {
                long v1 = this.zzn(this.zzo());
                if(v1 != 0L) {
                    this.zzb[this.zzw] = zzfk.zzo(v1, this.zzj) - v / 1000L;
                    this.zzw = (this.zzw + 1) % 10;
                    int v2 = this.zzx;
                    if(v2 < 10) {
                        this.zzx = v2 + 1;
                    }
                    this.zzm = v / 1000L;
                    this.zzl = 0L;
                    int v3 = 0;
                    while(true) {
                        int v4 = this.zzx;
                        if(v3 >= v4) {
                            goto label_20;
                        }
                        this.zzl += this.zzb[v3] / ((long)v4);
                        ++v3;
                    }
                }
            }
            else {
            label_20:
                if(!this.zzh) {
                    zzpg zzpg0 = this.zzf;
                    zzpg0.getClass();
                    if(zzpg0.zzg(v / 1000L)) {
                        long v5 = zzpg0.zzb();
                        long v6 = zzpg0.zza();
                        long v7 = this.zzn(this.zzo());
                        if(Long.compare(Math.abs(v5 - v / 1000L), 5000000L) > 0) {
                            zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + v6 + ", " + v5 + ", " + v / 1000L + ", " + v7 + ", " + ((zzpz)this.zza).zza.zzG() + ", " + ((zzpz)this.zza).zza.zzH());
                            zzpg0.zzd();
                        }
                        else if(Math.abs(this.zzn(v6) - v7) > 5000000L) {
                            zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + v6 + ", " + v5 + ", " + v / 1000L + ", " + v7 + ", " + ((zzpz)this.zza).zza.zzG() + ", " + ((zzpz)this.zza).zza.zzH());
                            zzpg0.zzd();
                        }
                        else {
                            zzpg0.zzc();
                        }
                    }
                    if(this.zzq) {
                        Method method0 = this.zzn;
                        if(method0 != null && v / 1000L - this.zzr >= 500000L) {
                            try {
                                AudioTrack audioTrack1 = this.zzc;
                                if(audioTrack1 == null) {
                                    throw null;
                                }
                                long v8 = Math.max(((long)(((int)(((Integer)method0.invoke(audioTrack1, null)))))) * 1000L - this.zzi, 0L);
                                this.zzo = v8;
                                if(v8 > 5000000L) {
                                    zzes.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + v8);
                                    this.zzo = 0L;
                                }
                            }
                            catch(Exception unused_ex) {
                                this.zzn = null;
                            }
                            this.zzr = v / 1000L;
                        }
                    }
                }
            }
        }
        long v9 = System.nanoTime();
        zzpg zzpg1 = this.zzf;
        zzpg1.getClass();
        boolean z1 = zzpg1.zzf();
        if(z1) {
            v10 = this.zzn(zzpg1.zza()) + zzfk.zzn(v9 / 1000L - zzpg1.zzb(), this.zzj);
        }
        else {
            v10 = this.zzx == 0 ? this.zzn(this.zzo()) : zzfk.zzn(this.zzl + v9 / 1000L, this.zzj);
            if(!z) {
                v10 = Math.max(0L, v10 - this.zzo);
            }
        }
        if(this.zzE != z1) {
            this.zzG = this.zzD;
            this.zzF = this.zzC;
        }
        long v11 = v9 / 1000L - this.zzG;
        if(v11 < 1000000L) {
            long v12 = v11 * 1000L / 1000000L;
            v10 = (v10 * v12 + (1000L - v12) * (this.zzF + zzfk.zzn(v11, this.zzj))) / 1000L;
        }
        if(!this.zzk) {
            long v13 = this.zzC;
            if(v10 > v13) {
                this.zzk = true;
                float f = this.zzj;
                long v14 = zzfk.zzr(zzfk.zzo(zzfk.zzr(v10 - v13), f));
                long v15 = System.currentTimeMillis();
                zzqe zzqe0 = ((zzpz)this.zza).zza;
                if(zzqe0.zzp != null) {
                    zzqk.zzaa(((zzqj)zzqe0.zzp).zza).zzr(v15 - v14);
                }
            }
        }
        this.zzD = v9 / 1000L;
        this.zzC = v10;
        this.zzE = z1;
        return v10;
    }

    public final void zzc(long v) {
        this.zzA = this.zzo();
        this.zzy = zzfk.zzp(SystemClock.elapsedRealtime());
        this.zzB = v;
    }

    public final void zzd() {
        this.zzp();
        this.zzc = null;
        this.zzf = null;
    }

    public final void zze(AudioTrack audioTrack0, boolean z, int v, int v1, int v2) {
        boolean z1 = true;
        this.zzc = audioTrack0;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = new zzpg(audioTrack0);
        this.zzg = audioTrack0.getSampleRate();
        if(!z || zzfk.zza >= 23) {
            z1 = false;
        }
        else if(v != 5) {
            if(v == 6) {
                v = 6;
            }
            else {
                z1 = false;
            }
        }
        this.zzh = z1;
        boolean z2 = zzfk.zzE(v);
        this.zzq = z2;
        this.zzi = z2 ? this.zzn(((long)(v2 / v1))) : 0x8000000000000001L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzH = false;
        this.zzI = 0L;
        this.zzv = 0L;
        this.zzp = false;
        this.zzy = 0x8000000000000001L;
        this.zzz = 0x8000000000000001L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final void zzf(zzdz zzdz0) {
        this.zzJ = zzdz0;
    }

    public final void zzg() {
        zzpg zzpg0 = this.zzf;
        zzpg0.getClass();
        zzpg0.zze();
    }

    public final boolean zzh(long v) {
        if(v <= this.zzm(this.zzb(false))) {
            if(this.zzh) {
                AudioTrack audioTrack0 = this.zzc;
                audioTrack0.getClass();
                return audioTrack0.getPlayState() == 2 && this.zzo() == 0L;
            }
            return false;
        }
        return true;
    }

    public final boolean zzi() {
        AudioTrack audioTrack0 = this.zzc;
        audioTrack0.getClass();
        return audioTrack0.getPlayState() == 3;
    }

    public final boolean zzj(long v) {
        return this.zzz != 0x8000000000000001L && v > 0L && SystemClock.elapsedRealtime() - this.zzz >= 200L;
    }

    public final boolean zzk(long v) {
        AudioTrack audioTrack0 = this.zzc;
        audioTrack0.getClass();
        int v1 = audioTrack0.getPlayState();
        if(this.zzh) {
            switch(v1) {
                case 1: {
                    if(this.zzo() != 0L) {
                        v1 = 1;
                        break;
                    }
                    return false;
                }
                case 2: {
                    this.zzp = false;
                    return false;
                }
            }
        }
        boolean z = this.zzp;
        boolean z1 = this.zzh(v);
        this.zzp = z1;
        if(z && !z1 && v1 != 1) {
            int v2 = this.zze;
            long v3 = zzfk.zzr(this.zzi);
            zzpz zzpz0 = (zzpz)this.zza;
            if(zzqe.zzD(zzpz0.zza) != null) {
                long v4 = SystemClock.elapsedRealtime();
                zzqk.zzaa(((zzqj)zzqe.zzD(zzpz0.zza)).zza).zzt(v2, v3, v4 - zzqe.zzz(zzpz0.zza));
            }
        }
        return true;
    }

    public final boolean zzl() {
        this.zzp();
        if(this.zzy == 0x8000000000000001L) {
            zzpg zzpg0 = this.zzf;
            zzpg0.getClass();
            zzpg0.zze();
            return true;
        }
        return false;
    }

    private final long zzm(long v) {
        return v * ((long)this.zzg) / 1000000L;
    }

    private final long zzn(long v) {
        return v * 1000000L / ((long)this.zzg);
    }

    private final long zzo() {
        long v = SystemClock.elapsedRealtime();
        if(this.zzy != 0x8000000000000001L) {
            return Math.min(this.zzB, this.zzA + this.zzm(zzfk.zzn(zzfk.zzp(v) - this.zzy, this.zzj)));
        }
        if(v - this.zzs >= 5L) {
            AudioTrack audioTrack0 = this.zzc;
            audioTrack0.getClass();
            int v1 = audioTrack0.getPlayState();
            if(v1 != 1) {
                long v2 = ((long)audioTrack0.getPlaybackHeadPosition()) & 0xFFFFFFFFL;
                if(this.zzh) {
                    if(v1 == 2) {
                        if(v2 == 0L) {
                            this.zzv = this.zzt;
                        }
                        v1 = 2;
                    }
                    v2 += this.zzv;
                }
                if(zzfk.zza > 29) {
                label_25:
                    if(this.zzt > v2) {
                        ++this.zzu;
                    }
                    this.zzt = v2;
                }
                else if(v2 != 0L) {
                    this.zzz = 0x8000000000000001L;
                    goto label_25;
                }
                else if(this.zzt <= 0L || v1 != 3) {
                    this.zzz = 0x8000000000000001L;
                    v2 = 0L;
                    goto label_25;
                }
                else if(this.zzz == 0x8000000000000001L) {
                    this.zzz = v;
                }
            }
            this.zzs = v;
        }
        return this.zzt + this.zzI + (this.zzu << 0x20);
    }

    private final void zzp() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }
}

