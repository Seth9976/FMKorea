package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzblj;

public final class zzbo extends zzatv implements zzbq {
    zzbo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzbn zzbn0;
        Parcel parcel0 = this.zzbg(1, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbn0 = iInterface0 instanceof zzbn ? ((zzbn)iInterface0) : new zzbl(iBinder0);
        }
        parcel0.recycle();
        return zzbn0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbfu zzbfu0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbfx zzbfx0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String s, zzbgd zzbgd0, zzbga zzbga0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbgd0);
        zzatx.zzf(parcel0, zzbga0);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzblj zzblj0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgh zzbgh0, zzq zzq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbgh0);
        zzatx.zzd(parcel0, zzq0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbgk zzbgk0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbgk0);
        this.zzbh(10, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbh0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbh0);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, adManagerAdViewOptions0);
        this.zzbh(15, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbla zzbla0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbek zzbek0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbek0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcf0) {
        throw null;
    }
}

