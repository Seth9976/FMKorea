package com.google.android.gms.internal.measurement;

import X1.g;
import X1.h;
import X1.l;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzgn {
    private static final Object zza = null;
    private static volatile zzgu zzb = null;
    private static volatile boolean zzc = false;
    private static final AtomicReference zzd;
    private static zzgy zze;
    private static final AtomicInteger zzf;
    private final zzgv zzg;
    private final String zzh;
    private final Object zzi;
    private volatile int zzj;
    private volatile Object zzk;
    private final boolean zzl;

    static {
        zzgn.zza = new Object();
        zzgn.zzd = new AtomicReference();
        zzgn.zze = new zzgy(() -> true);
        zzgn.zzf = new AtomicInteger();
    }

    private zzgn(zzgv zzgv0, String s, Object object0, boolean z) {
        this.zzj = -1;
        String s1 = zzgv0.zza;
        if(s1 == null && zzgv0.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if(s1 != null && zzgv0.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzgv0;
        this.zzh = s;
        this.zzi = object0;
        this.zzl = z;
    }

    zzgn(zzgv zzgv0, String s, Object object0, boolean z, zzgx zzgx0) {
        this(zzgv0, s, object0, true);
    }

    static zzgn zza(zzgv zzgv0, String s, Boolean boolean0, boolean z) {
        return new zzgq(zzgv0, s, boolean0, true);
    }

    static zzgn zza(zzgv zzgv0, String s, Double double0, boolean z) {
        return new zzgt(zzgv0, s, double0, true);
    }

    static zzgn zza(zzgv zzgv0, String s, Long long0, boolean z) {
        return new zzgr(zzgv0, s, long0, true);
    }

    static zzgn zza(zzgv zzgv0, String s, String s1, boolean z) {
        return new zzgs(zzgv0, s, s1, true);
    }

    private final Object zza(zzgu zzgu0) {
        if(!this.zzg.zze && (this.zzg.zzh == null || ((Boolean)this.zzg.zzh.apply(zzgu0.zza())).booleanValue())) {
            Object object0 = zzgg.zza(zzgu0.zza()).zza((this.zzg.zze ? null : this.zza(this.zzg.zzc)));
            return object0 == null ? null : this.zza(object0);
        }
        return null;
    }

    private final String zza(String s) {
        return s == null || !s.isEmpty() ? s + this.zzh : this.zzh;
    }

    public final Object zza() {
        Object object0;
        if(!this.zzl) {
            h.n(zzgn.zze.zza(this.zzh), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int v = zzgn.zzf.get();
        if(this.zzj < v) {
            synchronized(this) {
                if(this.zzj < v) {
                    zzgu zzgu0 = zzgn.zzb;
                    g g0 = g.a();
                    String s = null;
                    if(zzgu0 != null) {
                        g0 = (g)zzgu0.zzb().get();
                        if(g0.c()) {
                            s = ((zzgh)g0.b()).zza(this.zzg.zzb, this.zzg.zza, this.zzg.zzd, this.zzh);
                        }
                    }
                    h.n(zzgu0 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if(this.zzg.zzf) {
                        object0 = this.zza(zzgu0);
                        if(object0 == null) {
                            object0 = this.zzb(zzgu0);
                            if(object0 == null) {
                                object0 = this.zzi;
                            }
                        }
                    }
                    else {
                        object0 = this.zzb(zzgu0);
                        if(object0 == null) {
                            object0 = this.zza(zzgu0);
                            if(object0 == null) {
                                object0 = this.zzi;
                            }
                        }
                    }
                    if(g0.c()) {
                        object0 = s == null ? this.zzi : this.zza(s);
                    }
                    this.zzk = object0;
                    this.zzj = v;
                }
            }
        }
        return this.zzk;
    }

    abstract Object zza(Object arg1);

    private final Object zzb(zzgu zzgu0) {
        zzgw zzgw0;
        if(this.zzg.zzb == null) {
            zzgw0 = zzgw.zza(zzgu0.zza(), this.zzg.zza, () -> zzgn.zzf.incrementAndGet());
        }
        else if(!zzgl.zza(zzgu0.zza(), this.zzg.zzb)) {
            zzgw0 = null;
        }
        else if(this.zzg.zzg) {
            zzgw0 = zzfy.zza(zzgu0.zza().getContentResolver(), zzgk.zza(zzgk.zza(zzgu0.zza(), this.zzg.zzb.getLastPathSegment())), () -> zzgn.zzf.incrementAndGet());
        }
        else {
            zzgw0 = zzfy.zza(zzgu0.zza().getContentResolver(), this.zzg.zzb, () -> zzgn.zzf.incrementAndGet());
        }
        if(zzgw0 != null) {
            Object object0 = zzgw0.zza(this.zzb());
            return object0 == null ? null : this.zza(object0);
        }
        return null;
    }

    public static void zzb(Context context0) {
        if(zzgn.zzb == null && context0 != null) {
            Object object0 = zzgn.zza;
            synchronized(object0) {
                if(zzgn.zzb == null) {
                    synchronized(object0) {
                        zzgu zzgu0 = zzgn.zzb;
                        Context context1 = context0.getApplicationContext();
                        if(context1 != null) {
                            context0 = context1;
                        }
                        if(zzgu0 == null || zzgu0.zza() != context0) {
                            zzfy.zzc();
                            zzgw.zza();
                            zzgg.zza();
                            zzgn.zzb = new zzfv(context0, l.a(new zzgp(context0)));
                            zzgn.zzf.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    public final String zzb() {
        return this.zza(this.zzg.zzd);
    }

    // 检测为 Lambda 实现
    public static void zzc() [...]

    static boolean zzd() [...] // Inlined contents
}

