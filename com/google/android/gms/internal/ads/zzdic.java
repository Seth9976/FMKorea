package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.g;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzdic {
    private int zza;
    private zzdq zzb;
    private zzbeo zzc;
    private View zzd;
    private List zze;
    private List zzf;
    private zzel zzg;
    private Bundle zzh;
    private zzcfi zzi;
    private zzcfi zzj;
    private zzcfi zzk;
    private zzfip zzl;
    private d zzm;
    private zzcas zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbew zzs;
    private zzbew zzt;
    private String zzu;
    private final g zzv;
    private final g zzw;
    private float zzx;
    private String zzy;

    public zzdic() {
        this.zzv = new g();
        this.zzw = new g();
        this.zzf = Collections.emptyList();
    }

    public final String zzA() {
        synchronized(this) {
        }
        return this.zzu;
    }

    public final String zzB() {
        synchronized(this) {
            return this.zzF("headline");
        }
    }

    public final String zzC() {
        synchronized(this) {
        }
        return this.zzy;
    }

    public final String zzD() {
        synchronized(this) {
            return this.zzF("price");
        }
    }

    public final String zzE() {
        synchronized(this) {
            return this.zzF("store");
        }
    }

    public final String zzF(String s) {
        synchronized(this) {
            return (String)this.zzw.get(s);
        }
    }

    public final List zzG() {
        synchronized(this) {
        }
        return this.zze;
    }

    public final List zzH() {
        synchronized(this) {
        }
        return this.zzf;
    }

    public final void zzI() {
        synchronized(this) {
            zzcfi zzcfi0 = this.zzi;
            if(zzcfi0 != null) {
                zzcfi0.destroy();
                this.zzi = null;
            }
            zzcfi zzcfi1 = this.zzj;
            if(zzcfi1 != null) {
                zzcfi1.destroy();
                this.zzj = null;
            }
            zzcfi zzcfi2 = this.zzk;
            if(zzcfi2 != null) {
                zzcfi2.destroy();
                this.zzk = null;
            }
            d d0 = this.zzm;
            if(d0 != null) {
                d0.cancel(false);
                this.zzm = null;
            }
            zzcas zzcas0 = this.zzn;
            if(zzcas0 != null) {
                zzcas0.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        }
    }

    public final void zzJ(zzbeo zzbeo0) {
        synchronized(this) {
            this.zzc = zzbeo0;
        }
    }

    public final void zzK(String s) {
        synchronized(this) {
            this.zzu = s;
        }
    }

    public final void zzL(zzel zzel0) {
        synchronized(this) {
            this.zzg = zzel0;
        }
    }

    public final void zzM(zzbew zzbew0) {
        synchronized(this) {
            this.zzs = zzbew0;
        }
    }

    public final void zzN(String s, zzbei zzbei0) {
        synchronized(this) {
            if(zzbei0 == null) {
                this.zzv.remove(s);
                return;
            }
            this.zzv.put(s, zzbei0);
        }
    }

    public final void zzO(zzcfi zzcfi0) {
        synchronized(this) {
            this.zzj = zzcfi0;
        }
    }

    public final void zzP(List list0) {
        synchronized(this) {
            this.zze = list0;
        }
    }

    public final void zzQ(zzbew zzbew0) {
        synchronized(this) {
            this.zzt = zzbew0;
        }
    }

    public final void zzR(float f) {
        synchronized(this) {
            this.zzx = f;
        }
    }

    public final void zzS(List list0) {
        synchronized(this) {
            this.zzf = list0;
        }
    }

    public final void zzT(zzcfi zzcfi0) {
        synchronized(this) {
            this.zzk = zzcfi0;
        }
    }

    public final void zzU(d d0) {
        synchronized(this) {
            this.zzm = d0;
        }
    }

    public final void zzV(String s) {
        synchronized(this) {
            this.zzy = s;
        }
    }

    public final void zzW(zzfip zzfip0) {
        synchronized(this) {
            this.zzl = zzfip0;
        }
    }

    public final void zzX(zzcas zzcas0) {
        synchronized(this) {
            this.zzn = zzcas0;
        }
    }

    public final void zzY(double f) {
        synchronized(this) {
            this.zzr = f;
        }
    }

    public final void zzZ(String s, String s1) {
        synchronized(this) {
            if(s1 == null) {
                this.zzw.remove(s);
                return;
            }
            this.zzw.put(s, s1);
        }
    }

    public final double zza() {
        synchronized(this) {
        }
        return this.zzr;
    }

    public final void zzaa(int v) {
        synchronized(this) {
            this.zza = v;
        }
    }

    public final void zzab(zzdq zzdq0) {
        synchronized(this) {
            this.zzb = zzdq0;
        }
    }

    public final void zzac(View view0) {
        synchronized(this) {
            this.zzo = view0;
        }
    }

    public final void zzad(zzcfi zzcfi0) {
        synchronized(this) {
            this.zzi = zzcfi0;
        }
    }

    public final void zzae(View view0) {
        synchronized(this) {
            this.zzp = view0;
        }
    }

    public final boolean zzaf() {
        synchronized(this) {
        }
        return this.zzj != null;
    }

    public static zzdic zzag(zzboq zzboq0) {
        try {
            zzdib zzdib0 = zzdic.zzak(zzboq0.zzg(), null);
            zzbeo zzbeo0 = zzboq0.zzh();
            View view0 = (View)zzdic.zzam(zzboq0.zzj());
            String s = zzboq0.zzo();
            List list0 = zzboq0.zzr();
            String s1 = zzboq0.zzm();
            Bundle bundle0 = zzboq0.zzf();
            String s2 = zzboq0.zzn();
            View view1 = (View)zzdic.zzam(zzboq0.zzk());
            IObjectWrapper iObjectWrapper0 = zzboq0.zzl();
            String s3 = zzboq0.zzq();
            String s4 = zzboq0.zzp();
            double f = zzboq0.zze();
            zzbew zzbew0 = zzboq0.zzi();
            zzdic zzdic0 = new zzdic();
            zzdic0.zza = 2;
            zzdic0.zzb = zzdib0;
            zzdic0.zzc = zzbeo0;
            zzdic0.zzd = view0;
            zzdic0.zzZ("headline", s);
            zzdic0.zze = list0;
            zzdic0.zzZ("body", s1);
            zzdic0.zzh = bundle0;
            zzdic0.zzZ("call_to_action", s2);
            zzdic0.zzo = view1;
            zzdic0.zzq = iObjectWrapper0;
            zzdic0.zzZ("store", s3);
            zzdic0.zzZ("price", s4);
            zzdic0.zzr = f;
            zzdic0.zzs = zzbew0;
            return zzdic0;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to get native ad from app install ad mapper", remoteException0);
            return null;
        }
    }

    public static zzdic zzah(zzbor zzbor0) {
        try {
            zzdib zzdib0 = zzdic.zzak(zzbor0.zzf(), null);
            zzbeo zzbeo0 = zzbor0.zzg();
            View view0 = (View)zzdic.zzam(zzbor0.zzi());
            String s = zzbor0.zzo();
            List list0 = zzbor0.zzp();
            String s1 = zzbor0.zzm();
            Bundle bundle0 = zzbor0.zze();
            String s2 = zzbor0.zzn();
            View view1 = (View)zzdic.zzam(zzbor0.zzj());
            IObjectWrapper iObjectWrapper0 = zzbor0.zzk();
            String s3 = zzbor0.zzl();
            zzbew zzbew0 = zzbor0.zzh();
            zzdic zzdic0 = new zzdic();
            zzdic0.zza = 1;
            zzdic0.zzb = zzdib0;
            zzdic0.zzc = zzbeo0;
            zzdic0.zzd = view0;
            zzdic0.zzZ("headline", s);
            zzdic0.zze = list0;
            zzdic0.zzZ("body", s1);
            zzdic0.zzh = bundle0;
            zzdic0.zzZ("call_to_action", s2);
            zzdic0.zzo = view1;
            zzdic0.zzq = iObjectWrapper0;
            zzdic0.zzZ("advertiser", s3);
            zzdic0.zzt = zzbew0;
            return zzdic0;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to get native ad from content ad mapper", remoteException0);
            return null;
        }
    }

    public static zzdic zzai(zzboq zzboq0) {
        try {
            return zzdic.zzal(zzdic.zzak(zzboq0.zzg(), null), zzboq0.zzh(), ((View)zzdic.zzam(zzboq0.zzj())), zzboq0.zzo(), zzboq0.zzr(), zzboq0.zzm(), zzboq0.zzf(), zzboq0.zzn(), ((View)zzdic.zzam(zzboq0.zzk())), zzboq0.zzl(), zzboq0.zzq(), zzboq0.zzp(), zzboq0.zze(), zzboq0.zzi(), null, 0.0f);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to get native ad assets from app install ad mapper", remoteException0);
            return null;
        }
    }

    public static zzdic zzaj(zzbor zzbor0) {
        try {
            return zzdic.zzal(zzdic.zzak(zzbor0.zzf(), null), zzbor0.zzg(), ((View)zzdic.zzam(zzbor0.zzi())), zzbor0.zzo(), zzbor0.zzp(), zzbor0.zzm(), zzbor0.zze(), zzbor0.zzn(), ((View)zzdic.zzam(zzbor0.zzj())), zzbor0.zzk(), null, null, -1.0, zzbor0.zzh(), zzbor0.zzl(), 0.0f);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to get native ad assets from content ad mapper", remoteException0);
            return null;
        }
    }

    private static zzdib zzak(zzdq zzdq0, zzbou zzbou0) {
        return zzdq0 == null ? null : new zzdib(zzdq0, zzbou0);
    }

    private static zzdic zzal(zzdq zzdq0, zzbeo zzbeo0, View view0, String s, List list0, String s1, Bundle bundle0, String s2, View view1, IObjectWrapper iObjectWrapper0, String s3, String s4, double f, zzbew zzbew0, String s5, float f1) {
        zzdic zzdic0 = new zzdic();
        zzdic0.zza = 6;
        zzdic0.zzb = zzdq0;
        zzdic0.zzc = zzbeo0;
        zzdic0.zzd = view0;
        zzdic0.zzZ("headline", s);
        zzdic0.zze = list0;
        zzdic0.zzZ("body", s1);
        zzdic0.zzh = bundle0;
        zzdic0.zzZ("call_to_action", s2);
        zzdic0.zzo = view1;
        zzdic0.zzq = iObjectWrapper0;
        zzdic0.zzZ("store", s3);
        zzdic0.zzZ("price", s4);
        zzdic0.zzr = f;
        zzdic0.zzs = zzbew0;
        zzdic0.zzZ("advertiser", s5);
        zzdic0.zzR(f1);
        return zzdic0;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper0) {
        return iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
    }

    public final float zzb() {
        synchronized(this) {
        }
        return this.zzx;
    }

    public final int zzc() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final Bundle zzd() {
        synchronized(this) {
            if(this.zzh == null) {
                this.zzh = new Bundle();
            }
            return this.zzh;
        }
    }

    public final View zze() {
        synchronized(this) {
        }
        return this.zzd;
    }

    public final View zzf() {
        synchronized(this) {
        }
        return this.zzo;
    }

    public final View zzg() {
        synchronized(this) {
        }
        return this.zzp;
    }

    public final g zzh() {
        synchronized(this) {
        }
        return this.zzv;
    }

    public final g zzi() {
        synchronized(this) {
        }
        return this.zzw;
    }

    public final zzdq zzj() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final zzel zzk() {
        synchronized(this) {
        }
        return this.zzg;
    }

    public final zzbeo zzl() {
        synchronized(this) {
        }
        return this.zzc;
    }

    public final zzbew zzm() {
        if(this.zze != null && !this.zze.isEmpty()) {
            Object object0 = this.zze.get(0);
            return object0 instanceof IBinder ? zzbev.zzg(((IBinder)object0)) : null;
        }
        return null;
    }

    public final zzbew zzn() {
        synchronized(this) {
        }
        return this.zzs;
    }

    public final zzbew zzo() {
        synchronized(this) {
        }
        return this.zzt;
    }

    public final zzcas zzp() {
        synchronized(this) {
        }
        return this.zzn;
    }

    public final zzcfi zzq() {
        synchronized(this) {
        }
        return this.zzj;
    }

    public final zzcfi zzr() {
        synchronized(this) {
        }
        return this.zzk;
    }

    public final zzcfi zzs() {
        synchronized(this) {
        }
        return this.zzi;
    }

    public static zzdic zzt(zzbou zzbou0) {
        try {
            return zzdic.zzal(zzdic.zzak(zzbou0.zzj(), zzbou0), zzbou0.zzk(), ((View)zzdic.zzam(zzbou0.zzm())), zzbou0.zzs(), zzbou0.zzv(), zzbou0.zzq(), zzbou0.zzi(), zzbou0.zzr(), ((View)zzdic.zzam(zzbou0.zzn())), zzbou0.zzo(), zzbou0.zzu(), zzbou0.zzt(), zzbou0.zze(), zzbou0.zzl(), zzbou0.zzp(), zzbou0.zzf());
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to get native ad assets from unified ad mapper", remoteException0);
            return null;
        }
    }

    public final zzfip zzu() {
        synchronized(this) {
        }
        return this.zzl;
    }

    public final IObjectWrapper zzv() {
        synchronized(this) {
        }
        return this.zzq;
    }

    public final d zzw() {
        synchronized(this) {
        }
        return this.zzm;
    }

    public final String zzx() {
        synchronized(this) {
            return this.zzF("advertiser");
        }
    }

    public final String zzy() {
        synchronized(this) {
            return this.zzF("body");
        }
    }

    public final String zzz() {
        synchronized(this) {
            return this.zzF("call_to_action");
        }
    }
}

