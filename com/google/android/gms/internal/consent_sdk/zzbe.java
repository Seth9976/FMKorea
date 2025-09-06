package com.google.android.gms.internal.consent_sdk;

import W1.b.a;
import W1.b;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbe implements b {
    boolean zza;
    private final Application zzb;
    private final zzae zzc;
    private final zzby zzd;
    private final zzas zze;
    private final zzbs zzf;
    private final zzdr zzg;
    private Dialog zzh;
    private zzbw zzi;
    private final AtomicBoolean zzj;
    private final AtomicReference zzk;
    private final AtomicReference zzl;
    private final AtomicReference zzm;

    public zzbe(Application application0, zzae zzae0, zzby zzby0, zzas zzas0, zzbs zzbs0, zzdr zzdr0) {
        this.zzj = new AtomicBoolean();
        this.zzk = new AtomicReference();
        this.zzl = new AtomicReference();
        this.zzm = new AtomicReference();
        this.zza = false;
        this.zzb = application0;
        this.zzc = zzae0;
        this.zzd = zzby0;
        this.zze = zzas0;
        this.zzf = zzbs0;
        this.zzg = zzdr0;
    }

    @Override  // W1.b
    public final void show(Activity activity0, a b$a0) {
        zzct.zza();
        if(!this.zzj.compareAndSet(false, true)) {
            b$a0.a(new zzi(3, (this.zza ? "Privacy options form is being loading. Please try again later." : "ConsentForm#show can only be invoked once.")).zza());
            return;
        }
        zzbb zzbb0 = new zzbb(this, activity0);
        this.zzb.registerActivityLifecycleCallbacks(zzbb0);
        this.zzm.set(zzbb0);
        this.zzd.zza(activity0);
        Dialog dialog0 = new Dialog(activity0, 0x1030010);
        dialog0.setContentView(this.zzi);
        dialog0.setCancelable(false);
        Window window0 = dialog0.getWindow();
        if(window0 == null) {
            b$a0.a(new zzi(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window0.setLayout(-1, -1);
        window0.setBackgroundDrawable(new ColorDrawable(0));
        window0.setFlags(0x1000000, 0x1000000);
        this.zzl.set(b$a0);
        dialog0.show();
        this.zzh = dialog0;
        this.zzi.zzc("UMP_messagePresented", "");
    }

    final zzbw zza() {
        return this.zzi;
    }

    final void zzb(W1.f.b f$b0, W1.f.a f$a0) {
        zzbw zzbw0 = ((zzbx)this.zzg).zza();
        this.zzi = zzbw0;
        zzbw0.setBackgroundColor(0);
        zzbw0.getSettings().setJavaScriptEnabled(true);
        zzbw0.setWebViewClient(new zzbv(zzbw0, null));
        zzbd zzbd0 = new zzbd(f$b0, f$a0, null);
        this.zzk.set(zzbd0);
        this.zzi.loadDataWithBaseURL(this.zzf.zza(), this.zzf.zzb(), "text/html", "UTF-8", null);
        zzba zzba0 = new zzba(this);
        zzct.zza.postDelayed(zzba0, 10000L);
    }

    final void zzc(int v) {
        this.zzg();
        a b$a0 = (a)this.zzl.getAndSet(null);
        if(b$a0 == null) {
            return;
        }
        this.zze.zzg(3);
        b$a0.a(null);
    }

    final void zzd(zzi zzi0) {
        this.zzg();
        a b$a0 = (a)this.zzl.getAndSet(null);
        if(b$a0 == null) {
            return;
        }
        b$a0.a(zzi0.zza());
    }

    final void zze() {
        zzbd zzbd0 = (zzbd)this.zzk.getAndSet(null);
        if(zzbd0 == null) {
            return;
        }
        zzbd0.onConsentFormLoadSuccess(this);
    }

    final void zzf(zzi zzi0) {
        zzbd zzbd0 = (zzbd)this.zzk.getAndSet(null);
        if(zzbd0 == null) {
            return;
        }
        zzbd0.onConsentFormLoadFailure(zzi0.zza());
    }

    private final void zzg() {
        Dialog dialog0 = this.zzh;
        if(dialog0 != null) {
            dialog0.dismiss();
            this.zzh = null;
        }
        this.zzd.zza(null);
        zzbb zzbb0 = (zzbb)this.zzm.getAndSet(null);
        if(zzbb0 != null) {
            zzbb0.zza.zzb.unregisterActivityLifecycleCallbacks(zzbb0);
        }
    }
}

