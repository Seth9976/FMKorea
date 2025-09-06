package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.LinkedList;

public abstract class zzaqu implements zzaqt {
    protected static volatile zzary zza;
    protected MotionEvent zzb;
    protected final LinkedList zzc;
    protected long zzd;
    protected long zze;
    protected long zzf;
    protected long zzg;
    protected long zzh;
    protected long zzi;
    protected long zzj;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected boolean zzp;
    protected DisplayMetrics zzq;
    protected zzarq zzr;
    private double zzs;
    private double zzt;
    private boolean zzu;

    static {
    }

    protected zzaqu(Context context0) {
        this.zzc = new LinkedList();
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzh = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        this.zzu = false;
        this.zzp = false;
        try {
            zzapm.zzd();
            this.zzq = context0.getResources().getDisplayMetrics();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                this.zzr = new zzarq();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    protected abstract long zza(StackTraceElement[] arg1);

    protected abstract zzanv zzb(Context arg1, View arg2, Activity arg3);

    protected abstract zzanv zzc(Context arg1, zzano arg2);

    protected abstract zzanv zzd(Context arg1, View arg2, Activity arg3);

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context0, String s, View view0) {
        return this.zzm(context0, s, 3, view0, null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context0, String s, View view0, Activity activity0) {
        return this.zzm(context0, s, 3, view0, activity0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context0) {
        if(zzasb.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return this.zzm(context0, null, 1, null, null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context0, View view0, Activity activity0) {
        return this.zzm(context0, null, 2, view0, activity0, null);
    }

    protected abstract zzasa zzi(MotionEvent arg1);

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if(this.zzc.isEmpty()) {
            MotionEvent motionEvent0 = this.zzb;
            if(motionEvent0 != null) {
                motionEvent0.recycle();
            }
        }
        else {
            for(Object object0: this.zzc) {
                ((MotionEvent)object0).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzk(MotionEvent motionEvent0) {
        synchronized(this) {
            if(this.zzu) {
                this.zzj();
                this.zzu = false;
            }
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.zzk = 0.0;
                    this.zzs = (double)motionEvent0.getRawX();
                    this.zzt = (double)motionEvent0.getRawY();
                    break;
                }
                case 1: 
                case 2: {
                    double f = (double)motionEvent0.getRawX();
                    double f1 = (double)motionEvent0.getRawY();
                    double f2 = f - this.zzs;
                    double f3 = f1 - this.zzt;
                    this.zzk += Math.sqrt(f2 * f2 + f3 * f3);
                    this.zzs = f;
                    this.zzt = f1;
                }
            }
            int v1 = motionEvent0.getAction();
            switch(v1) {
                case 0: {
                    this.zzl = motionEvent0.getX();
                    this.zzm = motionEvent0.getY();
                    this.zzn = motionEvent0.getRawX();
                    this.zzo = motionEvent0.getRawY();
                    ++this.zzd;
                    break;
                }
                case 1: {
                    MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                    this.zzb = motionEvent1;
                    this.zzc.add(motionEvent1);
                    if(this.zzc.size() > 6) {
                        ((MotionEvent)this.zzc.remove()).recycle();
                    }
                    try {
                        ++this.zzf;
                        this.zzh = this.zza(new Throwable().getStackTrace());
                    }
                    catch(zzaro unused_ex) {
                    }
                    break;
                }
                case 2: {
                    this.zze += (long)(motionEvent0.getHistorySize() + 1);
                    try {
                        zzasa zzasa0 = this.zzi(motionEvent0);
                        Long long0 = zzasa0.zzd;
                        if(long0 != null && zzasa0.zzg != null) {
                            this.zzi += ((long)long0) + ((long)zzasa0.zzg);
                        }
                        if(this.zzq != null) {
                            Long long1 = zzasa0.zze;
                            if(long1 != null && zzasa0.zzh != null) {
                                this.zzj += ((long)long1) + ((long)zzasa0.zzh);
                            }
                        }
                    }
                    catch(zzaro unused_ex) {
                    }
                    break;
                }
                default: {
                    if(v1 == 3) {
                        ++this.zzg;
                    }
                }
            }
            this.zzp = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzl(int v, int v1, int v2) {
        synchronized(this) {
            if(this.zzb != null) {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzcl)).booleanValue()) {
                    this.zzj();
                }
                else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics0 = this.zzq;
            this.zzb = displayMetrics0 == null ? null : MotionEvent.obtain(0L, v2, 1, ((float)v) * displayMetrics0.density, ((float)v1) * displayMetrics0.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            this.zzp = false;
        }
    }

    private final String zzm(Context context0, String s, int v, View view0, Activity activity0, byte[] arr_b) {
        int v6;
        int v5;
        String s2;
        int v3;
        int v2;
        String s1;
        zzaqs zzaqs0;
        long v1 = System.currentTimeMillis();
        boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zzcn)).booleanValue();
        zzanv zzanv0 = null;
        if(z) {
            zzaqs0 = zzaqu.zza == null ? null : zzaqu.zza.zzd();
            s1 = "be";
        }
        else {
            zzaqs0 = null;
            s1 = null;
        }
        try {
            switch(v) {
                case 2: {
                    zzanv0 = this.zzd(context0, view0, activity0);
                    v2 = 0x3F0;
                    break;
                }
                case 3: {
                    zzanv0 = this.zzb(context0, view0, activity0);
                    this.zzu = true;
                    v2 = 1002;
                    break;
                }
                default: {
                    zzanv0 = this.zzc(context0, null);
                    v2 = 1000;
                }
            }
            if(z && zzaqs0 != null) {
                zzaqs0.zzc(v2, -1, System.currentTimeMillis() - v1, s1, null);
            }
        }
        catch(Exception exception0) {
            if(z && zzaqs0 != null) {
                if(v == 3) {
                    v3 = 1003;
                }
                else if(v == 2) {
                    v3 = 1009;
                }
                else {
                    v3 = 1001;
                    v = 1;
                }
                zzaqs0.zzc(v3, -1, System.currentTimeMillis() - v1, s1, exception0);
            }
        }
        long v4 = System.currentTimeMillis();
        if(zzanv0 == null) {
            return "5";
        }
        try {
            if(((zzaos)zzanv0.zzal()).zzaz() == 0) {
                return "5";
            }
            s2 = zzapm.zza(((zzaos)zzanv0.zzal()).zzax(), s);
            if(z && zzaqs0 != null) {
                if(v == 3) {
                    v5 = 1006;
                }
                else {
                    v5 = v == 2 ? 1010 : 1004;
                }
                zzaqs0.zzc(v5, -1, System.currentTimeMillis() - v4, s1, null);
                return s2;
            }
        }
        catch(Exception unused_ex) {
            s2 = "7";
            if(z && zzaqs0 != null) {
                if(v == 3) {
                    v6 = 1007;
                }
                else {
                    v6 = v == 2 ? 0x3F3 : 1005;
                }
                zzaqs0.zzc(v6, -1, System.currentTimeMillis() - v4, s1, exception1);
            }
        }
        return s2;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] arr_stackTraceElement) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
            zzarq zzarq0 = this.zzr;
            if(zzarq0 != null) {
                zzarq0.zzb(Arrays.asList(arr_stackTraceElement));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public void zzo(View view0) {
    }
}

