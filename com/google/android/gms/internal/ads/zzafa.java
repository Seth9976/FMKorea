package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class zzafa extends zzaes {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    @Deprecated
    public final String zzb;
    public final zzfud zzc;

    static {
        zzafa.CREATOR = new zzaez();
    }

    public zzafa(String s, String s1, List list0) {
        super(s);
        zzdy.zzd(!list0.isEmpty());
        this.zza = s1;
        zzfud zzfud0 = zzfud.zzj(list0);
        this.zzc = zzfud0;
        this.zzb = (String)zzfud0.get(0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzafa.class == class0 && zzfk.zzD(this.zzf, ((zzafa)object0).zzf) && zzfk.zzD(this.zza, ((zzafa)object0).zza) && this.zzc.equals(((zzafa)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzf.hashCode();
        return this.zza == null ? (v + 0x20F) * 961 + this.zzc.hashCode() : ((v + 0x20F) * 0x1F + this.zza.hashCode()) * 0x1F + this.zzc.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzaes
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + this.zzc;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeStringArray(((String[])this.zzc.toArray(new String[0])));
    }

    @Override  // com.google.android.gms.internal.ads.zzaes
    public final void zza(zzbt zzbt0) {
        switch(this.zzf) {
            case "TAL": 
            case "TALB": {
                zzbt0.zzd(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TCM": 
            case "TCOM": {
                zzbt0.zzf(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TDA": 
            case "TDAT": {
                try {
                    String s = (String)this.zzc.get(0);
                    int v = Integer.parseInt(s.substring(2, 4));
                    int v1 = Integer.parseInt(s.substring(0, 2));
                    zzbt0.zzk(v);
                    zzbt0.zzj(v1);
                }
                catch(NumberFormatException | StringIndexOutOfBoundsException unused_ex) {
                }
                return;
            }
            case "TDRC": {
                List list0 = zzafa.zzb(((String)this.zzc.get(0)));
                switch(list0.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        zzbt0.zzk(((Integer)list0.get(1)));
                        break;
                    }
                    case 3: {
                        zzbt0.zzj(((Integer)list0.get(2)));
                        zzbt0.zzk(((Integer)list0.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                zzbt0.zzl(((Integer)list0.get(0)));
                return;
            }
            case "TDRL": {
                List list1 = zzafa.zzb(((String)this.zzc.get(0)));
                switch(list1.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        zzbt0.zzn(((Integer)list1.get(1)));
                        break;
                    }
                    case 3: {
                        zzbt0.zzm(((Integer)list1.get(2)));
                        zzbt0.zzn(((Integer)list1.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                zzbt0.zzo(((Integer)list1.get(0)));
                return;
            }
            case "TEXT": 
            case "TXT": {
                zzbt0.zzt(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TIT2": 
            case "TT2": {
                zzbt0.zzq(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TP1": 
            case "TPE1": {
                zzbt0.zze(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TP2": 
            case "TPE2": {
                zzbt0.zzc(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TP3": 
            case "TPE3": {
                zzbt0.zzg(((CharSequence)this.zzc.get(0)));
                return;
            }
            case "TRCK": 
            case "TRK": {
                String[] arr_s = ((String)this.zzc.get(0)).split("/", -1);
                try {
                    int v2 = Integer.parseInt(arr_s[0]);
                    Integer integer0 = arr_s.length <= 1 ? null : Integer.parseInt(arr_s[1]);
                    zzbt0.zzs(v2);
                    zzbt0.zzr(integer0);
                }
                catch(NumberFormatException unused_ex) {
                }
                return;
            }
            case "TYE": 
            case "TYER": {
                try {
                    zzbt0.zzl(Integer.parseInt(((String)this.zzc.get(0))));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
    }

    private static List zzb(String s) {
        List list0 = new ArrayList();
        try {
            if(s.length() >= 10) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
                list0.add(Integer.parseInt(s.substring(5, 7)));
                list0.add(Integer.parseInt(s.substring(8, 10)));
                return list0;
            }
            if(s.length() >= 7) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
                list0.add(Integer.parseInt(s.substring(5, 7)));
                return list0;
            }
            if(s.length() >= 4) {
                list0.add(Integer.parseInt(s.substring(0, 4)));
            }
            return list0;
        }
        catch(NumberFormatException unused_ex) {
            return new ArrayList();
        }
    }
}

