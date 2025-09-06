package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzddw;

@Class(creator = "AdOverlayInfoCreator")
@Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final zzc zza;
    @Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zza zzb;
    @Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzo zzc;
    @Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcfi zzd;
    @Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbhj zze;
    @Field(id = 7)
    public final String zzf;
    @Field(id = 8)
    public final boolean zzg;
    @Field(id = 9)
    public final String zzh;
    @Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzz zzi;
    @Field(id = 11)
    public final int zzj;
    @Field(id = 12)
    public final int zzk;
    @Field(id = 13)
    public final String zzl;
    @Field(id = 14)
    public final zzcag zzm;
    @Field(id = 16)
    public final String zzn;
    @Field(id = 17)
    public final zzj zzo;
    @Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbhh zzp;
    @Field(id = 19)
    public final String zzq;
    @Field(id = 24)
    public final String zzr;
    @Field(id = 25)
    public final String zzs;
    @Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzcwv zzt;
    @Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzddw zzu;
    @Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbrv zzv;

    static {
        AdOverlayInfoParcel.CREATOR = new zzn();
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzz zzz0, zzcfi zzcfi0, int v, zzcag zzcag0, String s, zzj zzj0, String s1, String s2, String s3, zzcwv zzcwv0, zzbrv zzbrv0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzo0;
        this.zzd = zzcfi0;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaG)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        }
        else {
            this.zzf = s1;
            this.zzh = s2;
        }
        this.zzi = null;
        this.zzj = v;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcag0;
        this.zzn = s;
        this.zzo = zzj0;
        this.zzq = null;
        this.zzr = null;
        this.zzs = s3;
        this.zzt = zzcwv0;
        this.zzu = null;
        this.zzv = zzbrv0;
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzz zzz0, zzcfi zzcfi0, boolean z, int v, zzcag zzcag0, zzddw zzddw0, zzbrv zzbrv0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcfi0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzz0;
        this.zzj = v;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcag0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddw0;
        this.zzv = zzbrv0;
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzbhh zzbhh0, zzbhj zzbhj0, zzz zzz0, zzcfi zzcfi0, boolean z, int v, String s, zzcag zzcag0, zzddw zzddw0, zzbrv zzbrv0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcfi0;
        this.zzp = zzbhh0;
        this.zze = zzbhj0;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzz0;
        this.zzj = v;
        this.zzk = 3;
        this.zzl = s;
        this.zzm = zzcag0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddw0;
        this.zzv = zzbrv0;
    }

    public AdOverlayInfoParcel(zza zza0, zzo zzo0, zzbhh zzbhh0, zzbhj zzbhj0, zzz zzz0, zzcfi zzcfi0, boolean z, int v, String s, String s1, zzcag zzcag0, zzddw zzddw0, zzbrv zzbrv0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcfi0;
        this.zzp = zzbhh0;
        this.zze = zzbhj0;
        this.zzf = s1;
        this.zzg = z;
        this.zzh = s;
        this.zzi = zzz0;
        this.zzj = v;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcag0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddw0;
        this.zzv = zzbrv0;
    }

    @Constructor
    AdOverlayInfoParcel(@Param(id = 2) zzc zzc0, @Param(id = 3) IBinder iBinder0, @Param(id = 4) IBinder iBinder1, @Param(id = 5) IBinder iBinder2, @Param(id = 6) IBinder iBinder3, @Param(id = 7) String s, @Param(id = 8) boolean z, @Param(id = 9) String s1, @Param(id = 10) IBinder iBinder4, @Param(id = 11) int v, @Param(id = 12) int v1, @Param(id = 13) String s2, @Param(id = 14) zzcag zzcag0, @Param(id = 16) String s3, @Param(id = 17) zzj zzj0, @Param(id = 18) IBinder iBinder5, @Param(id = 19) String s4, @Param(id = 24) String s5, @Param(id = 25) String s6, @Param(id = 26) IBinder iBinder6, @Param(id = 27) IBinder iBinder7, @Param(id = 28) IBinder iBinder8) {
        this.zza = zzc0;
        this.zzb = (zza)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.zzc = (zzo)ObjectWrapper.unwrap(Stub.asInterface(iBinder1));
        this.zzd = (zzcfi)ObjectWrapper.unwrap(Stub.asInterface(iBinder2));
        this.zzp = (zzbhh)ObjectWrapper.unwrap(Stub.asInterface(iBinder5));
        this.zze = (zzbhj)ObjectWrapper.unwrap(Stub.asInterface(iBinder3));
        this.zzf = s;
        this.zzg = z;
        this.zzh = s1;
        this.zzi = (zzz)ObjectWrapper.unwrap(Stub.asInterface(iBinder4));
        this.zzj = v;
        this.zzk = v1;
        this.zzl = s2;
        this.zzm = zzcag0;
        this.zzn = s3;
        this.zzo = zzj0;
        this.zzq = s4;
        this.zzr = s5;
        this.zzs = s6;
        this.zzt = (zzcwv)ObjectWrapper.unwrap(Stub.asInterface(iBinder6));
        this.zzu = (zzddw)ObjectWrapper.unwrap(Stub.asInterface(iBinder7));
        this.zzv = (zzbrv)ObjectWrapper.unwrap(Stub.asInterface(iBinder8));
    }

    public AdOverlayInfoParcel(zzc zzc0, zza zza0, zzo zzo0, zzz zzz0, zzcag zzcag0, zzcfi zzcfi0, zzddw zzddw0) {
        this.zza = zzc0;
        this.zzb = zza0;
        this.zzc = zzo0;
        this.zzd = zzcfi0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzz0;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcag0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddw0;
        this.zzv = null;
    }

    public AdOverlayInfoParcel(zzo zzo0, zzcfi zzcfi0, int v, zzcag zzcag0) {
        this.zzc = zzo0;
        this.zzd = zzcfi0;
        this.zzj = 1;
        this.zzm = zzcag0;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
    }

    public AdOverlayInfoParcel(zzcfi zzcfi0, zzcag zzcag0, String s, String s1, int v, zzbrv zzbrv0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcfi0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcag0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = s;
        this.zzr = s1;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbrv0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zza, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzg);
        SafeParcelWriter.writeString(parcel0, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel0, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel0, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel0, 12, this.zzk);
        SafeParcelWriter.writeString(parcel0, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel0, 14, this.zzm, v, false);
        SafeParcelWriter.writeString(parcel0, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel0, 17, this.zzo, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel0, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel0, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel0, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel0, 26, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 27, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel0, 28, ObjectWrapper.wrap(this.zzv).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static AdOverlayInfoParcel zza(Intent intent0) {
        try {
            Bundle bundle0 = intent0.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundle0.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel)bundle0.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

