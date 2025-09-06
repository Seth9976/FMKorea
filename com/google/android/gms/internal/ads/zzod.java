package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent.Builder;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

public final class zzod implements zzma, zzoe {
    private final Context zza;
    private final zzof zzb;
    private final PlaybackSession zzc;
    private final long zzd;
    private final zzcv zze;
    private final zzct zzf;
    private final HashMap zzg;
    private final HashMap zzh;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcf zzn;
    private zzoc zzo;
    private zzoc zzp;
    private zzoc zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzod(Context context0, PlaybackSession playbackSession0) {
        this.zza = context0.getApplicationContext();
        this.zzc = playbackSession0;
        this.zze = new zzcv();
        this.zzf = new zzct();
        this.zzh = new HashMap();
        this.zzg = new HashMap();
        this.zzd = SystemClock.elapsedRealtime();
        this.zzl = 0;
        this.zzm = 0;
        zzob zzob0 = new zzob(zzob.zza);
        this.zzb = zzob0;
        zzob0.zzh(this);
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public static zzod zzb(Context context0) {
        MediaMetricsManager mediaMetricsManager0 = d0.a(context0.getSystemService("media_metrics"));
        return mediaMetricsManager0 == null ? null : new zzod(context0, mediaMetricsManager0.createPlaybackSession());
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzc(zzly zzly0, String s) {
        if(zzly0.zzd != null && zzly0.zzd.zzb()) {
            return;
        }
        this.zzs();
        this.zzi = s;
        this.zzj = o0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.1.0");
        this.zzv(zzly0.zzb, zzly0.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzd(zzly zzly0, String s, boolean z) {
        if((zzly0.zzd == null || !zzly0.zzd.zzb()) && s.equals(this.zzi)) {
            this.zzs();
        }
        this.zzg.remove(s);
        this.zzh.remove(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zze(zzly zzly0, zzam zzam0, zzie zzie0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzf(zzly zzly0, int v, long v1, long v2) {
        zzts zzts0 = zzly0.zzd;
        if(zzts0 != null) {
            String s = this.zzb.zzf(zzly0.zzb, zzts0);
            Long long0 = (Long)this.zzh.get(s);
            Long long1 = (Long)this.zzg.get(s);
            long v3 = 0L;
            this.zzh.put(s, ((long)((long0 == null ? 0L : ((long)long0)) + v1)));
            HashMap hashMap0 = this.zzg;
            if(long1 != null) {
                v3 = (long)long1;
            }
            hashMap0.put(s, ((long)(v3 + ((long)v))));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzg(zzly zzly0, zzto zzto0) {
        zzts zzts0 = zzly0.zzd;
        if(zzts0 == null) {
            return;
        }
        zzto0.zzb.getClass();
        String s = this.zzb.zzf(zzly0.zzb, zzts0);
        zzoc zzoc0 = new zzoc(zzto0.zzb, 0, s);
        switch(zzto0.zza) {
            case 1: {
                this.zzp = zzoc0;
                return;
            }
            case 0: 
            case 2: {
                this.zzo = zzoc0;
                return;
            }
            case 3: {
                this.zzq = zzoc0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzh(zzly zzly0, int v, long v1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzi(zzcp zzcp0, zzlz zzlz0) {
        int v14;
        int v13;
        int v11;
        int v8;
        int v7;
        zzad zzad0;
        if(zzlz0.zzb() != 0) {
            for(int v = 0; v < zzlz0.zzb(); ++v) {
                int v1 = zzlz0.zza(v);
                zzly zzly0 = zzlz0.zzc(v1);
                if(v1 == 0) {
                    this.zzb.zzk(zzly0);
                }
                else if(v1 == 11) {
                    this.zzb.zzj(zzly0, this.zzk);
                }
                else {
                    this.zzb.zzi(zzly0);
                }
            }
            long v2 = SystemClock.elapsedRealtime();
            if(zzlz0.zzd(0)) {
                zzly zzly1 = zzlz0.zzc(0);
                if(this.zzj != null) {
                    this.zzv(zzly1.zzb, zzly1.zzd);
                }
            }
            if(zzlz0.zzd(2) && this.zzj != null) {
                zzfud zzfud0 = zzcp0.zzo().zza();
                int v3 = zzfud0.size();
            alab1:
                for(int v4 = 0; true; ++v4) {
                    zzad0 = null;
                    if(v4 >= v3) {
                        break;
                    }
                    zzdg zzdg0 = (zzdg)zzfud0.get(v4);
                    for(int v5 = 0; v5 <= 0; ++v5) {
                        if(zzdg0.zzd(v5)) {
                            zzad zzad1 = zzdg0.zzb(v5).zzp;
                            if(zzad1 != null) {
                                zzad0 = zzad1;
                                break alab1;
                            }
                        }
                    }
                }
                if(zzad0 != null) {
                    PlaybackMetrics.Builder playbackMetrics$Builder0 = this.zzj;
                    for(int v6 = 0; true; ++v6) {
                        v7 = 1;
                        if(v6 >= zzad0.zzb) {
                            break;
                        }
                        UUID uUID0 = zzad0.zza(v6).zza;
                        if(uUID0.equals(zzo.zzd)) {
                            v7 = 3;
                            break;
                        }
                        if(uUID0.equals(zzo.zze)) {
                            v7 = 2;
                            break;
                        }
                        if(uUID0.equals(zzo.zzc)) {
                            v7 = 6;
                            break;
                        }
                    }
                    playbackMetrics$Builder0.setDrmType(v7);
                }
            }
            if(zzlz0.zzd(0x3F3)) {
                ++this.zzy;
            }
            zzcf zzcf0 = this.zzn;
            if(zzcf0 != null) {
                Context context0 = this.zza;
                if(zzcf0.zzb == 1001) {
                    v8 = 20;
                    v11 = 0;
                }
                else {
                    boolean z = ((zzil)zzcf0).zze == 1;
                    int v9 = 14;
                    v8 = 35;
                    int v10 = ((zzil)zzcf0).zzi;
                    Throwable throwable0 = zzcf0.getCause();
                    throwable0.getClass();
                    if(!(throwable0 instanceof IOException)) {
                        if(z && (v10 == 0 || v10 == 1)) {
                            v11 = 0;
                        }
                        else if(z && v10 == 3) {
                            v8 = 15;
                            v11 = 0;
                        }
                        else if(z && v10 == 2) {
                            v11 = 0;
                            v8 = 23;
                        }
                        else if(throwable0 instanceof zzry) {
                            v11 = zzfk.zzj(((zzry)throwable0).zzd);
                            v8 = 13;
                        }
                        else if(throwable0 instanceof zzru) {
                            v13 = zzfk.zzj(((zzru)throwable0).zzb);
                            v11 = v13;
                            v8 = v9;
                        }
                        else if(throwable0 instanceof OutOfMemoryError) {
                            v8 = 14;
                            v11 = 0;
                        }
                        else if(throwable0 instanceof zzpa) {
                            v13 = ((zzpa)throwable0).zza;
                            v9 = 17;
                            v11 = v13;
                            v8 = v9;
                        }
                        else if(throwable0 instanceof zzpd) {
                            v13 = ((zzpd)throwable0).zza;
                            v9 = 18;
                            v11 = v13;
                            v8 = v9;
                        }
                        else if(throwable0 instanceof MediaCodec.CryptoException) {
                            v13 = ((MediaCodec.CryptoException)throwable0).getErrorCode();
                            v11 = v13;
                            v8 = zzod.zzr(v13);
                        }
                        else {
                            v8 = 22;
                            v11 = 0;
                        }
                    }
                    else if(throwable0 instanceof zzhd) {
                        v11 = ((zzhd)throwable0).zzd;
                        v8 = 5;
                    }
                    else if(throwable0 instanceof zzhc || throwable0 instanceof zzcd) {
                        v11 = 0;
                        v8 = 11;
                    }
                    else if(throwable0 instanceof zzhb || throwable0 instanceof zzhl) {
                        if(zzez.zzb(context0).zza() == 1) {
                            v11 = 0;
                            v8 = 3;
                        }
                        else {
                            Throwable throwable4 = throwable0.getCause();
                            if(throwable4 instanceof UnknownHostException) {
                                v11 = 0;
                                v8 = 6;
                            }
                            else if(throwable4 instanceof SocketTimeoutException) {
                                v11 = 0;
                                v8 = 7;
                            }
                            else if(!(throwable0 instanceof zzhb) || ((zzhb)throwable0).zzc != 1) {
                                v11 = 0;
                                v8 = 8;
                            }
                            else {
                                v11 = 0;
                                v8 = 4;
                            }
                        }
                    }
                    else if(zzcf0.zzb == 1002) {
                        v11 = 0;
                        v8 = 21;
                    }
                    else if(throwable0 instanceof zzqr) {
                        Throwable throwable1 = throwable0.getCause();
                        throwable1.getClass();
                        int v12 = zzfk.zza;
                        if(v12 >= 21 && throwable1 instanceof MediaDrm.MediaDrmStateException) {
                            v13 = zzfk.zzj(((MediaDrm.MediaDrmStateException)throwable1).getDiagnosticInfo());
                            v9 = zzod.zzr(v13);
                            v11 = v13;
                            v8 = v9;
                        }
                        else if(v12 >= 23 && throwable1 instanceof MediaDrmResetException) {
                            v8 = 27;
                            v11 = 0;
                        }
                        else if(throwable1 instanceof NotProvisionedException) {
                            v8 = 24;
                            v11 = 0;
                        }
                        else if(throwable1 instanceof DeniedByServerException) {
                            v8 = 29;
                            v11 = 0;
                        }
                        else if(throwable1 instanceof zzrc) {
                            v11 = 0;
                            v8 = 23;
                        }
                        else if(throwable1 instanceof zzqp) {
                            v8 = 28;
                            v11 = 0;
                        }
                        else {
                            v8 = 30;
                            v11 = 0;
                        }
                    }
                    else if(!(throwable0 instanceof zzgx) || !(throwable0.getCause() instanceof FileNotFoundException)) {
                        v11 = 0;
                        v8 = 9;
                    }
                    else {
                        Throwable throwable2 = throwable0.getCause();
                        throwable2.getClass();
                        Throwable throwable3 = throwable2.getCause();
                        if(zzfk.zza < 21 || !(throwable3 instanceof ErrnoException) || ((ErrnoException)throwable3).errno != OsConstants.EACCES) {
                            v11 = 0;
                            v8 = 0x1F;
                        }
                        else {
                            v8 = 0x20;
                            v11 = 0;
                        }
                    }
                }
                PlaybackErrorEvent playbackErrorEvent0 = q0.a().setTimeSinceCreatedMillis(v2 - this.zzd).setErrorCode(v8).setSubErrorCode(v11).setException(zzcf0).build();
                this.zzc.reportPlaybackErrorEvent(playbackErrorEvent0);
                this.zzz = true;
                this.zzn = null;
            }
            if(zzlz0.zzd(2)) {
                zzdh zzdh0 = zzcp0.zzo();
                boolean z1 = zzdh0.zzb(2);
                boolean z2 = zzdh0.zzb(1);
                boolean z3 = zzdh0.zzb(3);
                if(z1 || z2) {
                label_193:
                    if(!z1) {
                        this.zzw(v2, null, 0);
                    }
                    if(!z2) {
                        this.zzt(v2, null, 0);
                    }
                    if(!z3) {
                        this.zzu(v2, null, 0);
                    }
                }
                else if(z3) {
                    z3 = true;
                    goto label_193;
                }
            }
            if(this.zzy(this.zzo)) {
                zzam zzam0 = this.zzo.zza;
                if(zzam0.zzs != -1) {
                    this.zzw(v2, zzam0, 0);
                    this.zzo = null;
                }
            }
            if(this.zzy(this.zzp)) {
                this.zzt(v2, this.zzp.zza, 0);
                this.zzp = null;
            }
            if(this.zzy(this.zzq)) {
                this.zzu(v2, this.zzq.zza, 0);
                this.zzq = null;
            }
            switch(zzez.zzb(this.zza).zza()) {
                case 0: {
                    v14 = 0;
                    break;
                }
                case 1: {
                    v14 = 9;
                    break;
                }
                case 2: {
                    v14 = 2;
                    break;
                }
                case 3: {
                    v14 = 4;
                    break;
                }
                case 4: {
                    v14 = 5;
                    break;
                }
                case 5: {
                    v14 = 6;
                    break;
                }
                case 7: {
                    v14 = 3;
                    break;
                }
                case 9: {
                    v14 = 8;
                    break;
                }
                case 10: {
                    v14 = 7;
                    break;
                }
                default: {
                    v14 = 1;
                }
            }
            if(v14 != this.zzm) {
                this.zzm = v14;
                NetworkEvent networkEvent0 = s0.a().setNetworkType(v14).setTimeSinceCreatedMillis(v2 - this.zzd).build();
                this.zzc.reportNetworkEvent(networkEvent0);
            }
            if(zzcp0.zzf() != 2) {
                this.zzu = false;
            }
            if(((zzlt)zzcp0).zzC() == null) {
                this.zzv = false;
            }
            else if(zzlz0.zzd(10)) {
                this.zzv = true;
            }
            int v15 = 4;
            int v16 = zzcp0.zzf();
            if(this.zzu) {
                v15 = 5;
            }
            else if(this.zzv) {
                v15 = 13;
            }
            else {
                switch(v16) {
                    case 1: {
                        v15 = this.zzl == 0 ? this.zzl : 12;
                        break;
                    }
                    case 2: {
                        if(this.zzl == 0 || this.zzl == 2) {
                            v15 = 2;
                        }
                        else if(!zzcp0.zzv()) {
                            v15 = 7;
                        }
                        else if(zzcp0.zzg() == 0) {
                            v15 = 6;
                        }
                        else {
                            v15 = 10;
                        }
                        break;
                    }
                    case 3: {
                        if(zzcp0.zzv()) {
                            v15 = zzcp0.zzg() == 0 ? 3 : 9;
                        }
                        break;
                    }
                    case 4: {
                        v15 = 11;
                        break;
                    }
                    default: {
                        v15 = this.zzl;
                    }
                }
            }
            if(this.zzl != v15) {
                this.zzl = v15;
                this.zzz = true;
                PlaybackStateEvent playbackStateEvent0 = t0.a().setState(this.zzl).setTimeSinceCreatedMillis(v2 - this.zzd).build();
                this.zzc.reportPlaybackStateEvent(playbackStateEvent0);
            }
            if(zzlz0.zzd(0x404)) {
                zzly zzly2 = zzlz0.zzc(0x404);
                this.zzb.zzg(zzly2);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzj(zzly zzly0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzk(zzly zzly0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzl(zzly zzly0, zzcf zzcf0) {
        this.zzn = zzcf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzm(zzly zzly0, zzco zzco0, zzco zzco1, int v) {
        if(v == 1) {
            this.zzu = true;
            v = 1;
        }
        this.zzk = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzn(zzly zzly0, Object object0, long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzo(zzly zzly0, zzid zzid0) {
        this.zzw += zzid0.zzg;
        this.zzx += zzid0.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzp(zzly zzly0, zzam zzam0, zzie zzie0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzq(zzly zzly0, zzdn zzdn0) {
        zzoc zzoc0 = this.zzo;
        if(zzoc0 != null) {
            zzam zzam0 = zzoc0.zza;
            if(zzam0.zzs == -1) {
                zzak zzak0 = zzam0.zzb();
                zzak0.zzX(zzdn0.zzc);
                zzak0.zzF(zzdn0.zzd);
                this.zzo = new zzoc(zzak0.zzY(), 0, zzoc0.zzc);
            }
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int v) {
        switch(zzfk.zzi(v)) {
            case 6002: {
                return 24;
            }
            case 6003: {
                return 28;
            }
            case 6004: {
                return 25;
            }
            case 6005: {
                return 26;
            }
            default: {
                return 27;
            }
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.zzj;
        if(playbackMetrics$Builder0 != null && this.zzz) {
            playbackMetrics$Builder0.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long long0 = (Long)this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis((long0 == null ? 0L : ((long)long0)));
            Long long1 = (Long)this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead((long1 == null ? 0L : ((long)long1)));
            this.zzj.setStreamSource((long1 == null || ((long)long1) <= 0L ? 0 : 1));
            PlaybackMetrics playbackMetrics0 = this.zzj.build();
            this.zzc.reportPlaybackMetrics(playbackMetrics0);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long v, zzam zzam0, int v1) {
        if(zzfk.zzD(this.zzs, zzam0)) {
            return;
        }
        int v2 = this.zzs == null ? 1 : 0;
        this.zzs = zzam0;
        this.zzx(0, v, zzam0, v2);
    }

    private final void zzu(long v, zzam zzam0, int v1) {
        if(zzfk.zzD(this.zzt, zzam0)) {
            return;
        }
        int v2 = this.zzt == null ? 1 : 0;
        this.zzt = zzam0;
        this.zzx(2, v, zzam0, v2);
    }

    private final void zzv(zzcw zzcw0, zzts zzts0) {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.zzj;
        if(zzts0 == null) {
            return;
        }
        int v = zzcw0.zza(zzts0.zza);
        if(v == -1) {
            return;
        }
        int v1 = 0;
        zzcw0.zzd(v, this.zzf, false);
        zzcw0.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbi0 = this.zze.zze.zzd;
        int v2 = 2;
        if(zzbi0 != null) {
            switch(zzfk.zzm(zzbi0.zzb)) {
                case 0: {
                    v1 = 3;
                    break;
                }
                case 1: {
                    v1 = 5;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 1;
                }
            }
        }
        playbackMetrics$Builder0.setStreamType(v1);
        if(this.zze.zzo != 0x8000000000000001L && !this.zze.zzm && !this.zze.zzj && !this.zze.zzb()) {
            playbackMetrics$Builder0.setMediaDurationMillis(zzfk.zzr(this.zze.zzo));
        }
        if(!this.zze.zzb()) {
            v2 = 1;
        }
        playbackMetrics$Builder0.setPlaybackType(v2);
        this.zzz = true;
    }

    private final void zzw(long v, zzam zzam0, int v1) {
        if(zzfk.zzD(this.zzr, zzam0)) {
            return;
        }
        int v2 = this.zzr == null ? 1 : 0;
        this.zzr = zzam0;
        this.zzx(1, v, zzam0, v2);
    }

    private final void zzx(int v, long v1, zzam zzam0, int v2) {
        TrackChangeEvent.Builder trackChangeEvent$Builder0 = p0.a(v).setTimeSinceCreatedMillis(v1 - this.zzd);
        if(zzam0 == null) {
            trackChangeEvent$Builder0.setTrackState(0);
        }
        else {
            trackChangeEvent$Builder0.setTrackState(1);
            trackChangeEvent$Builder0.setTrackChangeReason((v2 == 1 ? 2 : 1));
            String s = zzam0.zzl;
            if(s != null) {
                trackChangeEvent$Builder0.setContainerMimeType(s);
            }
            String s1 = zzam0.zzm;
            if(s1 != null) {
                trackChangeEvent$Builder0.setSampleMimeType(s1);
            }
            String s2 = zzam0.zzj;
            if(s2 != null) {
                trackChangeEvent$Builder0.setCodecName(s2);
            }
            int v3 = zzam0.zzi;
            if(v3 != -1) {
                trackChangeEvent$Builder0.setBitrate(v3);
            }
            int v4 = zzam0.zzr;
            if(v4 != -1) {
                trackChangeEvent$Builder0.setWidth(v4);
            }
            int v5 = zzam0.zzs;
            if(v5 != -1) {
                trackChangeEvent$Builder0.setHeight(v5);
            }
            int v6 = zzam0.zzz;
            if(v6 != -1) {
                trackChangeEvent$Builder0.setChannelCount(v6);
            }
            int v7 = zzam0.zzA;
            if(v7 != -1) {
                trackChangeEvent$Builder0.setAudioSampleRate(v7);
            }
            String s3 = zzam0.zzd;
            if(s3 != null) {
                String[] arr_s = s3.split("-", -1);
                Pair pair0 = Pair.create(arr_s[0], (arr_s.length < 2 ? null : arr_s[1]));
                trackChangeEvent$Builder0.setLanguage(((String)pair0.first));
                Object object0 = pair0.second;
                if(object0 != null) {
                    trackChangeEvent$Builder0.setLanguageRegion(((String)object0));
                }
            }
            float f = zzam0.zzt;
            if(f != -1.0f) {
                trackChangeEvent$Builder0.setVideoFrameRate(f);
            }
        }
        this.zzz = true;
        TrackChangeEvent trackChangeEvent0 = trackChangeEvent$Builder0.build();
        this.zzc.reportTrackChangeEvent(trackChangeEvent0);
    }

    private final boolean zzy(zzoc zzoc0) {
        if(zzoc0 != null) {
            String s = this.zzb.zze();
            return zzoc0.zzc.equals(s);
        }
        return false;
    }
}

