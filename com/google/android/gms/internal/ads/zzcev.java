package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzcev extends zzcca implements zzhk, zzma {
    public static final int zza;
    private final Context zzb;
    private final zzceg zzc;
    private final zzxd zzd;
    private final zzcci zze;
    private final WeakReference zzf;
    private final zzuy zzg;
    private zziw zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcei zzt;
    private final Set zzu;

    public zzcev(Context context0, zzcci zzcci0, zzccj zzccj0, Integer integer0) {
        zzcek zzcek0;
        zzcem zzcem0;
        this.zzq = new Object();
        this.zzu = new HashSet();
        this.zzb = context0;
        this.zze = zzcci0;
        this.zzr = integer0;
        this.zzf = new WeakReference(zzccj0);
        zzceg zzceg0 = new zzceg();
        this.zzc = zzceg0;
        zzxd zzxd0 = new zzxd(context0);
        this.zzd = zzxd0;
        if(zze.zzc()) {
            zze.zza(("SimpleExoPlayerAdapter initialize " + this.toString()));
        }
        zzcca.zzD().incrementAndGet();
        zzls zzls0 = new zzls(context0, new zzcer(this));
        zzls0.zzb(zzxd0);
        zzls0.zza(zzceg0);
        zzlt zzlt0 = zzls0.zzc();
        this.zzh = zzlt0;
        zzlt0.zzz(this);
        boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        String s = null;
        this.zzt = null;
        if(zzccj0 != null) {
            s = zzccj0.zzbl();
        }
        this.zzo = (String)zzfre.zzd(s).zzb("");
        this.zzp = zzccj0 == null ? 0 : zzccj0.zzf();
        String s1 = zzt.zzp().zzc(context0, zzccj0.zzn().zza);
        if(!this.zzj || this.zzi.limit() <= 0) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbV)).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue()) {
                z = true;
            }
            else if(!zzcci0.zzj) {
                z = true;
            }
            if(zzcci0.zzm) {
                zzcem0 = () -> {
                    int v = this.zze.zzd;
                    int v1 = this.zze.zzf;
                    long v2 = this.zze.zzn;
                    long v3 = this.zze.zzo;
                    return z ? new zzcey(s1, this, v, v1, v2, v3) : new zzcey(s1, null, v, v1, v2, v3);
                };
            }
            else if(zzcci0.zzi > 0) {
                zzcem0 = () -> {
                    zzgi zzgi0 = new zzcef(s1, (z ? this : null), this.zze.zzd, this.zze.zzf, this.zze.zzi);
                    WeakReference weakReference0 = new WeakReference(zzgi0);
                    this.zzu.add(weakReference0);
                    return zzgi0;
                };
            }
            else {
                zzcem0 = () -> {
                    zzgq zzgq0 = new zzgq();
                    zzgq0.zzf(s1);
                    zzgq0.zze((z ? this : null));
                    zzgq0.zzc(this.zze.zzd);
                    zzgq0.zzd(this.zze.zzf);
                    zzgq0.zzb(true);
                    return zzgq0.zzg();
                };
            }
            zzcek0 = zzcci0.zzj ? () -> {
                zzgi zzgi0 = zzcem0.zza();
                zzcel zzcel0 = new zzcel(this);
                return new zzcei(this.zzb, zzgi0, this.zzo, this.zzp, this, zzcel0);
            } : zzcem0;
            if(this.zzi != null && this.zzi.limit() > 0) {
                byte[] arr_b1 = new byte[this.zzi.limit()];
                this.zzi.get(arr_b1);
                zzcek0 = new zzceq(zzcek0, arr_b1);
            }
        }
        else {
            byte[] arr_b = new byte[this.zzi.limit()];
            this.zzi.get(arr_b);
            zzcek0 = new zzcek(arr_b);
        }
        zzcet zzcet0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzo)).booleanValue() ? (Uri uri0, Map map0) -> new zzabb[]{new zzahc(0), new zzafu(0), new zzagx(0, null)} : (Uri uri0, Map map0) -> new zzabb[]{new zzahc(0), new zzafu(0)};
        this.zzg = new zzuy(zzcek0, new zzux(zzcet0));
    }

    @Override
    public final void finalize() {
        zzcca.zzD().decrementAndGet();
        if(zze.zzc()) {
            zze.zza(("SimpleExoPlayerAdapter finalize " + this.toString()));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzA() {
        return this.zzad() ? 0L : ((long)this.zzl);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzB() {
        if(!this.zzad()) {
            Object object0 = this.zzq;
            synchronized(object0) {
                while(!this.zzs.isEmpty()) {
                    long v1 = this.zzn;
                    Map map0 = ((zzhf)this.zzs.remove(0)).zze();
                    long v2 = 0L;
                    if(map0 != null) {
                        for(Object object1: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            if(map$Entry0 != null) {
                                try {
                                    if(map$Entry0.getKey() != null && zzfqo.zzc("content-length", ((CharSequence)map$Entry0.getKey())) && map$Entry0.getValue() != null && ((List)map$Entry0.getValue()).get(0) != null) {
                                        v2 = Long.parseLong(((String)((List)map$Entry0.getValue()).get(0)));
                                        break;
                                    }
                                }
                                catch(NumberFormatException unused_ex) {
                                    continue;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                    }
                    this.zzn = v1 + v2;
                }
                return this.zzn;
            }
        }
        return this.zzt.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final Integer zzC() {
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzF(Uri[] arr_uri, String s) {
        this.zzG(arr_uri, s, ByteBuffer.allocate(0), false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzG(Uri[] arr_uri, String s, ByteBuffer byteBuffer0, boolean z) {
        zztu zztu0;
        if(this.zzh != null) {
            this.zzi = byteBuffer0;
            this.zzj = z;
            if(arr_uri.length == 1) {
                zztu0 = this.zzaa(arr_uri[0]);
            }
            else {
                zztu[] arr_zztu = new zztu[arr_uri.length];
                for(int v = 0; v < arr_uri.length; ++v) {
                    arr_zztu[v] = this.zzaa(arr_uri[v]);
                }
                zztu0 = new zzuk(false, false, arr_zztu);
            }
            this.zzh.zzB(zztu0);
            this.zzh.zzp();
            zzcca.zzE().incrementAndGet();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzH() {
        zziw zziw0 = this.zzh;
        if(zziw0 != null) {
            zziw0.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcca.zzE().decrementAndGet();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzI(long v) {
        zzm zzm0 = (zzm)this.zzh;
        zzm0.zza(zzm0.zzd(), v, 5, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzJ(int v) {
        this.zzc.zzk(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzK(int v) {
        this.zzc.zzl(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzL(zzcbz zzcbz0) {
        this.zzk = zzcbz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzM(int v) {
        this.zzc.zzm(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzN(int v) {
        this.zzc.zzn(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzP(Integer integer0) {
        this.zzr = integer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzQ(boolean z) {
        if(this.zzh != null) {
            for(int v = 0; true; ++v) {
                this.zzh.zzy();
                if(v >= 2) {
                    break;
                }
                zzwp zzwp0 = this.zzd.zzd().zzc();
                zzwp0.zzo(v, !z);
                this.zzd.zzk(zzwp0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzR(int v) {
        for(Object object0: this.zzu) {
            zzcef zzcef0 = (zzcef)((WeakReference)object0).get();
            if(zzcef0 != null) {
                zzcef0.zzm(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzS(Surface surface0, boolean z) {
        zziw zziw0 = this.zzh;
        if(zziw0 != null) {
            zziw0.zzs(surface0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzT(float f, boolean z) {
        zziw zziw0 = this.zzh;
        if(zziw0 != null) {
            zziw0.zzt(f);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final boolean zzV() {
        return this.zzh != null;
    }

    // 检测为 Lambda 实现
    final zzgi zzW(String s, boolean z) [...]

    // 检测为 Lambda 实现
    final zzgi zzX(String s, boolean z) [...]

    // 检测为 Lambda 实现
    final zzgi zzY(String s, boolean z) [...]

    // 检测为 Lambda 实现
    final zzgi zzZ(zzgh zzgh0) [...]

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgi0, zzgn zzgn0, boolean z, int v) {
        this.zzl += v;
    }

    final zztu zzaa(Uri uri0) {
        zzar zzar0 = new zzar();
        zzar0.zzb(uri0);
        zzbp zzbp0 = zzar0.zzc();
        this.zzg.zza(this.zze.zzg);
        return this.zzg.zzb(zzbp0);
    }

    final void zzab(boolean z, long v) {
        zzcbz zzcbz0 = this.zzk;
        if(zzcbz0 != null) {
            zzcbz0.zzi(z, v);
        }
    }

    final zzln[] zzac(Handler handler0, zzzw zzzw0, zzoy zzoy0, zzvv zzvv0, zzss zzss0) {
        Context context0 = this.zzb;
        zzsc zzsc0 = zzsc.zzb;
        zzoj zzoj0 = zzoj.zza;
        zzps zzps0 = new zzps();
        if(zzoj0 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        zzps0.zzc(zzoj0);
        zzps0.zzd(new zzdr[0]);
        zzqe zzqe0 = zzps0.zze();
        return new zzln[]{new zzqk(context0, zzrs.zza, zzsc0, false, handler0, zzoy0, zzqe0), new zzyz(this.zzb, zzrs.zza, zzsc0, 0L, false, handler0, zzzw0, -1, 30.0f)};
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgi0, zzgn zzgn0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgi0, zzgn zzgn0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgi0, zzgn zzgn0, boolean z) {
        if(zzgi0 instanceof zzhf) {
            synchronized(this.zzq) {
                this.zzs.add(((zzhf)zzgi0));
            }
            return;
        }
        if(zzgi0 instanceof zzcei) {
            this.zzt = (zzcei)zzgi0;
            zzccj zzccj0 = (zzccj)this.zzf.get();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccj0 != null && this.zzt.zzn()) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap0.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                zzces zzces0 = new zzces(zzccj0, hashMap0);
                zzs.zza.post(zzces0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zze(zzly zzly0, zzam zzam0, zzie zzie0) {
        zzccj zzccj0 = (zzccj)this.zzf.get();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccj0 != null && zzam0 != null) {
            HashMap hashMap0 = new HashMap();
            String s = zzam0.zzl;
            if(s != null) {
                hashMap0.put("audioMime", s);
            }
            String s1 = zzam0.zzm;
            if(s1 != null) {
                hashMap0.put("audioSampleMime", s1);
            }
            String s2 = zzam0.zzj;
            if(s2 != null) {
                hashMap0.put("audioCodec", s2);
            }
            zzccj0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzf(zzly zzly0, int v, long v1, long v2) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzg(zzly zzly0, zzto zzto0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzh(zzly zzly0, int v, long v1) {
        this.zzm += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzi(zzcp zzcp0, zzlz zzlz0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzj(zzly zzly0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        zzcbz zzcbz0 = this.zzk;
        if(zzcbz0 != null) {
            if(this.zze.zzk) {
                zzcbz0.zzl("onLoadException", iOException0);
                return;
            }
            zzcbz0.zzk("onLoadError", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzk(zzly zzly0, int v) {
        zzcbz zzcbz0 = this.zzk;
        if(zzcbz0 != null) {
            zzcbz0.zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzl(zzly zzly0, zzcf zzcf0) {
        zzcbz zzcbz0 = this.zzk;
        if(zzcbz0 != null) {
            zzcbz0.zzk("onPlayerError", zzcf0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzm(zzly zzly0, zzco zzco0, zzco zzco1, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzn(zzly zzly0, Object object0, long v) {
        zzcbz zzcbz0 = this.zzk;
        if(zzcbz0 != null) {
            zzcbz0.zzv();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzo(zzly zzly0, zzid zzid0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzp(zzly zzly0, zzam zzam0, zzie zzie0) {
        zzccj zzccj0 = (zzccj)this.zzf.get();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccj0 != null && zzam0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("frameRate", String.valueOf(zzam0.zzt));
            hashMap0.put("bitRate", String.valueOf(zzam0.zzi));
            hashMap0.put("resolution", zzam0.zzr + "x" + zzam0.zzs);
            String s = zzam0.zzl;
            if(s != null) {
                hashMap0.put("videoMime", s);
            }
            String s1 = zzam0.zzm;
            if(s1 != null) {
                hashMap0.put("videoSampleMime", s1);
            }
            String s2 = zzam0.zzj;
            if(s2 != null) {
                hashMap0.put("videoCodec", s2);
            }
            zzccj0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzma
    public final void zzq(zzly zzly0, zzdn zzdn0) {
        zzcbz zzcbz0 = this.zzk;
        if(zzcbz0 != null) {
            zzcbz0.zzD(zzdn0.zzc, zzdn0.zzd);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final int zzr() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzw() {
        return (long)this.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzx() {
        if(!this.zzad()) {
            return 0L;
        }
        return this.zzt.zzp() ? Math.min(this.zzl, this.zzt.zzk()) : 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzcca
    public final long zzz() {
        return this.zzh.zzl();
    }
}

