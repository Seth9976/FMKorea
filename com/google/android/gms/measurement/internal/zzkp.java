package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class zzkp extends zze {
    private final zzlm zza;
    private zzfk zzb;
    private volatile Boolean zzc;
    private final zzaw zzd;
    private final zzmi zze;
    private final List zzf;
    private final zzaw zzg;

    protected zzkp(zzhf zzhf0) {
        super(zzhf0);
        this.zzf = new ArrayList();
        this.zze = new zzmi(zzhf0.zzb());
        this.zza = new zzlm(this);
        this.zzd = new zzks(this, zzhf0);
        this.zzg = new zzlb(this, zzhf0);
    }

    static void zza(zzkp zzkp0, ComponentName componentName0) {
        zzkp0.zzt();
        if(zzkp0.zzb != null) {
            zzkp0.zzb = null;
            zzkp0.zzj().zzp().zza("Disconnected from device MeasurementService", componentName0);
            zzkp0.zzt();
            zzkp0.zzad();
        }
    }

    static void zza(zzkp zzkp0, zzfk zzfk0) {
        zzkp0.zzb = null;
    }

    private final void zza(Runnable runnable0) {
        this.zzt();
        if(this.zzah()) {
            runnable0.run();
            return;
        }
        if(((long)this.zzf.size()) >= 1000L) {
            this.zzj().zzg().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable0);
        this.zzg.zza(60000L);
        this.zzad();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    public final void zza(Bundle bundle0) {
        this.zzt();
        this.zzu();
        this.zza(new zzlc(this, this.zzb(false), bundle0));
    }

    public final void zza(zzcv zzcv0) {
        this.zzt();
        this.zzu();
        this.zza(new zzkx(this, this.zzb(false), zzcv0));
    }

    public final void zza(zzcv zzcv0, zzbg zzbg0, String s) {
        this.zzt();
        this.zzu();
        if(this.zzq().zza(12451000) != 0) {
            this.zzj().zzu().zza("Not bundling data. Service unavailable or out of date");
            this.zzq().zza(zzcv0, new byte[0]);
            return;
        }
        this.zza(new zzle(this, zzbg0, s, zzcv0));
    }

    protected final void zza(zzcv zzcv0, String s, String s1) {
        this.zzt();
        this.zzu();
        this.zza(new zzlk(this, s, s1, this.zzb(false), zzcv0));
    }

    protected final void zza(zzcv zzcv0, String s, String s1, boolean z) {
        this.zzt();
        this.zzu();
        this.zza(new zzkr(this, s, s1, this.zzb(false), z, zzcv0));
    }

    protected final void zza(zzad zzad0) {
        Preconditions.checkNotNull(zzad0);
        this.zzt();
        this.zzu();
        boolean z = this.zzh().zza(zzad0);
        zzad zzad1 = new zzad(zzad0);
        this.zza(new zzli(this, true, this.zzb(true), z, zzad1, zzad0));
    }

    protected final void zza(zzbg zzbg0, String s) {
        Preconditions.checkNotNull(zzbg0);
        this.zzt();
        this.zzu();
        boolean z = this.zzh().zza(zzbg0);
        this.zza(new zzlf(this, true, this.zzb(true), z, zzbg0, s));
    }

    protected final void zza(zzfk zzfk0) {
        this.zzt();
        Preconditions.checkNotNull(zzfk0);
        this.zzb = zzfk0;
        this.zzal();
        this.zzak();
    }

    final void zza(zzfk zzfk0, AbstractSafeParcelable abstractSafeParcelable0, zzo zzo0) {
        int v2;
        this.zzt();
        this.zzu();
        int v1 = 0;
        for(int v = 100; v1 < 1001 && v == 100; v = v2) {
            ArrayList arrayList0 = new ArrayList();
            List list0 = this.zzh().zza(100);
            if(list0 == null) {
                v2 = 0;
            }
            else {
                arrayList0.addAll(list0);
                v2 = list0.size();
            }
            if(abstractSafeParcelable0 != null && v2 < 100) {
                arrayList0.add(abstractSafeParcelable0);
            }
            int v3 = arrayList0.size();
            int v4 = 0;
            while(v4 < v3) {
                Object object0 = arrayList0.get(v4);
                ++v4;
                AbstractSafeParcelable abstractSafeParcelable1 = (AbstractSafeParcelable)object0;
                if(abstractSafeParcelable1 instanceof zzbg) {
                    try {
                        zzfk0.zza(((zzbg)abstractSafeParcelable1), zzo0);
                    }
                    catch(RemoteException remoteException0) {
                        this.zzj().zzg().zza("Failed to send event to the service", remoteException0);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zznc) {
                    try {
                        zzfk0.zza(((zznc)abstractSafeParcelable1), zzo0);
                    }
                    catch(RemoteException remoteException1) {
                        this.zzj().zzg().zza("Failed to send user property to the service", remoteException1);
                    }
                }
                else if(abstractSafeParcelable1 instanceof zzad) {
                    try {
                        zzfk0.zza(((zzad)abstractSafeParcelable1), zzo0);
                    }
                    catch(RemoteException remoteException2) {
                        this.zzj().zzg().zza("Failed to send conditional user property to the service", remoteException2);
                    }
                }
                else {
                    this.zzj().zzg().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            ++v1;
        }
    }

    protected final void zza(zzki zzki0) {
        this.zzt();
        this.zzu();
        this.zza(new zzkz(this, zzki0));
    }

    protected final void zza(zznc zznc0) {
        this.zzt();
        this.zzu();
        boolean z = this.zzh().zza(zznc0);
        this.zza(new zzkw(this, this.zzb(true), z, zznc0));
    }

    public final void zza(AtomicReference atomicReference0) {
        this.zzt();
        this.zzu();
        this.zza(new zzky(this, atomicReference0, this.zzb(false)));
    }

    protected final void zza(AtomicReference atomicReference0, Bundle bundle0) {
        this.zzt();
        this.zzu();
        this.zza(new zzkt(this, atomicReference0, this.zzb(false), bundle0));
    }

    protected final void zza(AtomicReference atomicReference0, String s, String s1, String s2) {
        this.zzt();
        this.zzu();
        this.zza(new zzlh(this, atomicReference0, s, s1, s2, this.zzb(false)));
    }

    protected final void zza(AtomicReference atomicReference0, String s, String s1, String s2, boolean z) {
        this.zzt();
        this.zzu();
        this.zza(new zzlj(this, atomicReference0, s, s1, s2, this.zzb(false), z));
    }

    protected final void zza(AtomicReference atomicReference0, boolean z) {
        this.zzt();
        this.zzu();
        this.zza(new zzku(this, atomicReference0, this.zzb(false), z));
    }

    protected final void zza(boolean z) {
        this.zzt();
        this.zzu();
        if(z) {
            this.zzh().zzaa();
        }
        if(this.zzaj()) {
            this.zza(new zzlg(this, this.zzb(false)));
        }
    }

    protected final zzam zzaa() {
        this.zzt();
        this.zzu();
        zzfk zzfk0 = this.zzb;
        if(zzfk0 == null) {
            this.zzad();
            this.zzj().zzc().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzo0 = this.zzb(false);
        Preconditions.checkNotNull(zzo0);
        try {
            zzam zzam0 = zzfk0.zza(zzo0);
            this.zzal();
            return zzam0;
        }
        catch(RemoteException remoteException0) {
            this.zzj().zzg().zza("Failed to get consents; remote exception", remoteException0);
            return null;
        }
    }

    final Boolean zzab() {
        return this.zzc;
    }

    protected final void zzac() {
        this.zzt();
        this.zzu();
        zzo zzo0 = this.zzb(true);
        this.zzh().zzab();
        this.zza(new zzla(this, zzo0));
    }

    final void zzad() {
        this.zzt();
        this.zzu();
        if(this.zzah()) {
            return;
        }
        if(this.zzam()) {
            this.zza.zza();
            return;
        }
        if(!this.zze().zzw()) {
            List list0 = this.zza().getPackageManager().queryIntentServices(new Intent().setClassName(this.zza(), "com.google.android.gms.measurement.AppMeasurementService"), 0x10000);
            if(list0 != null && !list0.isEmpty()) {
                Intent intent0 = new Intent("com.google.android.gms.measurement.START");
                intent0.setComponent(new ComponentName(this.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent0);
                return;
            }
            this.zzj().zzg().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    public final void zzae() {
        this.zzt();
        this.zzu();
        this.zza.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(this.zza(), this.zza);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        this.zzb = null;
    }

    protected final void zzaf() {
        this.zzt();
        this.zzu();
        zzo zzo0 = this.zzb(false);
        this.zzh().zzaa();
        this.zza(new zzkv(this, zzo0));
    }

    protected final void zzag() {
        this.zzt();
        this.zzu();
        this.zza(new zzld(this, this.zzb(true)));
    }

    public final boolean zzah() {
        this.zzt();
        this.zzu();
        return this.zzb != null;
    }

    final boolean zzai() {
        this.zzt();
        this.zzu();
        return this.zzam() ? this.zzq().zzg() >= 200900 : true;
    }

    final boolean zzaj() {
        this.zzt();
        this.zzu();
        return this.zzam() ? this.zzq().zzg() >= ((int)(((Integer)zzbi.zzbo.zza(null)))) : true;
    }

    private final void zzak() {
        this.zzt();
        this.zzj().zzp().zza("Processing queued up service tasks", this.zzf.size());
        for(Object object0: this.zzf) {
            Runnable runnable0 = (Runnable)object0;
            try {
                runnable0.run();
            }
            catch(RuntimeException runtimeException0) {
                this.zzj().zzg().zza("Task exception while flushing queue", runtimeException0);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    private final void zzal() {
        this.zzt();
        this.zze.zzb();
        long v = (long)(((Long)zzbi.zzaj.zza(null)));
        this.zzd.zza(v);
    }

    private final boolean zzam() {
        int v2;
        this.zzt();
        this.zzu();
        if(this.zzc == null) {
            int v = 0;
            this.zzt();
            this.zzu();
            Boolean boolean0 = this.zzk().zzn();
            boolean z = true;
            if(boolean0 == null || !boolean0.booleanValue()) {
                if(this.zzg().zzaa() == 1) {
                    v2 = 1;
                }
                else {
                    this.zzj().zzp().zza("Checking service availability");
                    int v1 = this.zzq().zza(12451000);
                    switch(v1) {
                        case 0: {
                            this.zzj().zzp().zza("Service available");
                            v2 = 1;
                            break;
                        }
                        case 1: {
                            this.zzj().zzp().zza("Service missing");
                            v2 = 1;
                            z = false;
                            break;
                        }
                        case 2: {
                            this.zzj().zzc().zza("Service container out of date");
                            if(this.zzq().zzg() < 0x4423) {
                                v2 = 1;
                                z = false;
                            }
                            else {
                                if(boolean0 != null) {
                                    z = false;
                                }
                                v2 = 0;
                            }
                            break;
                        }
                        case 3: {
                            this.zzj().zzu().zza("Service disabled");
                            v2 = 0;
                            z = false;
                            break;
                        }
                        case 9: {
                            this.zzj().zzu().zza("Service invalid");
                            v2 = 0;
                            z = false;
                            break;
                        }
                        case 18: {
                            this.zzj().zzu().zza("Service updating");
                            v2 = 1;
                            break;
                        }
                        default: {
                            this.zzj().zzu().zza("Unexpected service status", v1);
                            v2 = 0;
                            z = false;
                        }
                    }
                }
                if(z || !this.zze().zzw()) {
                    v = v2;
                }
                else {
                    this.zzj().zzg().zza("No way to upload. Consider using the full version of Analytics");
                }
                if(v != 0) {
                    this.zzk().zza(z);
                }
            }
            this.zzc = Boolean.valueOf(z);
        }
        return this.zzc.booleanValue();
    }

    private final zzo zzb(boolean z) {
        zzfl zzfl0 = this.zzg();
        return z ? zzfl0.zza(this.zzj().zzx()) : zzfl0.zza(null);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzb zzc() {
        return super.zzc();
    }

    static void zzd(zzkp zzkp0) {
        zzkp0.zzt();
        if(zzkp0.zzah()) {
            zzkp0.zzj().zzp().zza("Inactivity, disconnecting from the service");
            zzkp0.zzae();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzfl zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzfo zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zziq zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzkh zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzkp zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzlx zzp() {
        return super.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzt() {
        super.zzt();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }
}

