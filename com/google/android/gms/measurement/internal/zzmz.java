package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew.zzb;
import com.google.android.gms.internal.measurement.zzew.zzc;
import com.google.android.gms.internal.measurement.zzew.zzd;
import com.google.android.gms.internal.measurement.zzew.zzf;
import com.google.android.gms.internal.measurement.zzfi.zze;
import com.google.android.gms.internal.measurement.zzfi.zzg;
import com.google.android.gms.internal.measurement.zzfi.zzi;
import com.google.android.gms.internal.measurement.zzfi.zzj.zza;
import com.google.android.gms.internal.measurement.zzfi.zzj;
import com.google.android.gms.internal.measurement.zzfi.zzl;
import com.google.android.gms.internal.measurement.zzfi.zzm;
import com.google.android.gms.internal.measurement.zzfi.zzn;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class zzmz extends zzmo {
    zzmz(zzmp zzmp0) {
        super(zzmp0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmz g_() {
        return super.g_();
    }

    static int zza(zza zzfi$zzj$zza0, String s) {
        if(zzfi$zzj$zza0 == null) {
            return -1;
        }
        for(int v = 0; v < zzfi$zzj$zza0.zzb(); ++v) {
            if(s.equals("")) {
                return v;
            }
        }
        return -1;
    }

    private final Bundle zza(Map map0, boolean z) {
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 == null) {
                bundle0.putString(s, null);
            }
            else if(object1 instanceof Long) {
                bundle0.putLong(s, ((long)(((Long)object1))));
            }
            else if(object1 instanceof Double) {
                bundle0.putDouble(s, ((double)(((Double)object1))));
            }
            else if(!(object1 instanceof ArrayList)) {
                bundle0.putString(s, object1.toString());
            }
            else if(z) {
                ArrayList arrayList0 = (ArrayList)object1;
                ArrayList arrayList1 = new ArrayList();
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    Object object2 = arrayList0.get(v1);
                    ++v1;
                    arrayList1.add(this.zza(((Map)object2), false));
                }
                bundle0.putParcelableArray(s, ((Parcelable[])arrayList1.toArray(new Parcelable[0])));
            }
        }
        return bundle0;
    }

    static zzg zza(zze zzfi$zze0, String s) {
        for(Object object0: zzfi$zze0.zzh()) {
            zzg zzfi$zzg0 = (zzg)object0;
            if("".equals(s)) {
                return zzfi$zzg0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    static zzkm zza(zzkm zzkm0, byte[] arr_b) {
        zzik zzik0 = zzik.zza();
        return zzik0 == null ? zzkm0.zza(arr_b) : zzkm0.zza(arr_b, zzik0);
    }

    private static String zza(boolean z, boolean z1, boolean z2) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append("Dynamic ");
        }
        if(z1) {
            stringBuilder0.append("Sequence ");
        }
        if(z2) {
            stringBuilder0.append("Session-Scoped ");
        }
        return stringBuilder0.toString();
    }

    static List zza(BitSet bitSet0) {
        int v = (bitSet0.length() + 0x3F) / 0x40;
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = 0L;
            for(int v3 = 0; v3 < 0x40; ++v3) {
                int v4 = (v1 << 6) + v3;
                if(v4 >= bitSet0.length()) {
                    break;
                }
                if(bitSet0.get(v4)) {
                    v2 |= 1L << v3;
                }
            }
            ((ArrayList)list0).add(v2);
        }
        return list0;
    }

    private static void zza(Uri.Builder uri$Builder0, String s, String s1, Set set0) {
        if(!set0.contains(s) && !TextUtils.isEmpty(s1)) {
            uri$Builder0.appendQueryParameter(s, s1);
        }
    }

    private static void zza(Uri.Builder uri$Builder0, String[] arr_s, Bundle bundle0, Set set0) {
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split(",");
            String s = arr_s1[0];
            String s1 = arr_s1[arr_s1.length - 1];
            String s2 = bundle0.getString(s);
            if(s2 != null) {
                zzmz.zza(uri$Builder0, s1, s2, set0);
            }
        }
    }

    static void zza(com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0, String s, Object object0) {
        List list0 = zzfi$zze$zza0.zzf();
        int v;
        for(v = 0; true; ++v) {
            if(v >= list0.size()) {
                v = -1;
                break;
            }
            if(s.equals("")) {
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzfi.zzg.zza zzfi$zzg$zza0 = zzg.zze().zza(s);
        if(object0 instanceof Long) {
            zzfi$zzg$zza0.zza(((long)(((Long)object0))));
        }
        else if(object0 instanceof String) {
            zzfi$zzg$zza0.zzb(((String)object0));
        }
        else if(object0 instanceof Double) {
            zzfi$zzg$zza0.zza(((double)(((Double)object0))));
        }
        if(v >= 0) {
            zzfi$zze$zza0.zza(v, zzfi$zzg$zza0);
            return;
        }
        zzfi$zze$zza0.zza(zzfi$zzg$zza0);
    }

    private static void zza(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
    }

    private final void zza(StringBuilder stringBuilder0, int v, zzc zzew$zzc0) {
        if(zzew$zzc0 == null) {
            return;
        }
        zzmz.zza(stringBuilder0, v);
        stringBuilder0.append("filter {\n");
        if(zzew$zzc0.zzg()) {
            zzmz.zza(stringBuilder0, v, "complement", Boolean.valueOf(zzew$zzc0.zzf()));
        }
        if(zzew$zzc0.zzi()) {
            zzmz.zza(stringBuilder0, v, "param_name", this.zzi().zzb(""));
        }
        if(zzew$zzc0.zzj()) {
            zzf zzew$zzf0 = zzew$zzc0.zzd();
            if(zzew$zzf0 != null) {
                zzmz.zza(stringBuilder0, v + 1);
                stringBuilder0.append("string_filter");
                stringBuilder0.append(" {\n");
                if(zzew$zzf0.zzj()) {
                    zzmz.zza(stringBuilder0, v + 1, "match_type", zzew$zzf0.zzb().name());
                }
                if(zzew$zzf0.zzi()) {
                    zzmz.zza(stringBuilder0, v + 1, "expression", "");
                }
                if(zzew$zzf0.zzh()) {
                    zzmz.zza(stringBuilder0, v + 1, "case_sensitive", Boolean.valueOf(zzew$zzf0.zzg()));
                }
                if(zzew$zzf0.zza() > 0) {
                    zzmz.zza(stringBuilder0, v + 2);
                    stringBuilder0.append("expression_list {\n");
                    for(Object object0: zzew$zzf0.zzf()) {
                        zzmz.zza(stringBuilder0, v + 3);
                        stringBuilder0.append(((String)object0));
                        stringBuilder0.append("\n");
                    }
                    stringBuilder0.append("}\n");
                }
                zzmz.zza(stringBuilder0, v + 1);
                stringBuilder0.append("}\n");
            }
        }
        if(zzew$zzc0.zzh()) {
            zzmz.zza(stringBuilder0, v + 1, "number_filter", zzew$zzc0.zzc());
        }
        zzmz.zza(stringBuilder0, v);
        stringBuilder0.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder0, int v, String s, zzd zzew$zzd0) {
        if(zzew$zzd0 == null) {
            return;
        }
        zzmz.zza(stringBuilder0, v);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzew$zzd0.zzh()) {
            zzmz.zza(stringBuilder0, v, "comparison_type", zzew$zzd0.zza().name());
        }
        if(zzew$zzd0.zzj()) {
            zzmz.zza(stringBuilder0, v, "match_as_float", Boolean.valueOf(zzew$zzd0.zzg()));
        }
        if(zzew$zzd0.zzi()) {
            zzmz.zza(stringBuilder0, v, "comparison_value", "");
        }
        if(zzew$zzd0.zzl()) {
            zzmz.zza(stringBuilder0, v, "min_comparison_value", "");
        }
        if(zzew$zzd0.zzk()) {
            zzmz.zza(stringBuilder0, v, "max_comparison_value", "");
        }
        zzmz.zza(stringBuilder0, v);
        stringBuilder0.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder0, int v, String s, zzl zzfi$zzl0) {
        if(zzfi$zzl0 == null) {
            return;
        }
        zzmz.zza(stringBuilder0, 3);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzfi$zzl0.zzb() != 0) {
            zzmz.zza(stringBuilder0, 4);
            stringBuilder0.append("results: ");
            int v1 = 0;
            for(Object object0: zzfi$zzl0.zzi()) {
                if(v1 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object0));
                ++v1;
            }
            stringBuilder0.append('\n');
        }
        if(zzfi$zzl0.zzd() != 0) {
            zzmz.zza(stringBuilder0, 4);
            stringBuilder0.append("status: ");
            int v2 = 0;
            for(Object object1: zzfi$zzl0.zzk()) {
                if(v2 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object1));
                ++v2;
            }
            stringBuilder0.append('\n');
        }
        if(zzfi$zzl0.zza() != 0) {
            zzmz.zza(stringBuilder0, 4);
            stringBuilder0.append("dynamic_filter_timestamps: {");
            int v3 = 0;
            for(Object object2: zzfi$zzl0.zzh()) {
                com.google.android.gms.internal.measurement.zzfi.zzd zzfi$zzd0 = (com.google.android.gms.internal.measurement.zzfi.zzd)object2;
                if(v3 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzfi$zzd0.zzf() ? zzfi$zzd0.zza() : null));
                stringBuilder0.append(":");
                stringBuilder0.append((zzfi$zzd0.zze() ? zzfi$zzd0.zzb() : null));
                ++v3;
            }
            stringBuilder0.append("}\n");
        }
        if(zzfi$zzl0.zzc() != 0) {
            zzmz.zza(stringBuilder0, 4);
            stringBuilder0.append("sequence_filter_timestamps: {");
            int v4 = 0;
            for(Object object3: zzfi$zzl0.zzj()) {
                zzm zzfi$zzm0 = (zzm)object3;
                if(v4 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzfi$zzm0.zzf() ? zzfi$zzm0.zzb() : null));
                stringBuilder0.append(": [");
                int v5 = 0;
                for(Object object4: zzfi$zzm0.zze()) {
                    long v6 = (long)(((Long)object4));
                    if(v5 != 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(v6);
                    ++v5;
                }
                stringBuilder0.append("]");
                ++v4;
            }
            stringBuilder0.append("}\n");
        }
        zzmz.zza(stringBuilder0, 3);
        stringBuilder0.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 == null) {
            return;
        }
        zzmz.zza(stringBuilder0, v + 1);
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
        stringBuilder0.append('\n');
    }

    private final void zza(StringBuilder stringBuilder0, int v, List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            zzg zzfi$zzg0 = (zzg)object0;
            if(zzfi$zzg0 != null) {
                zzmz.zza(stringBuilder0, v + 1);
                stringBuilder0.append("param {\n");
                Double double0 = null;
                zzmz.zza(stringBuilder0, v + 1, "name", (zzfi$zzg0.zzm() ? this.zzi().zzb("") : null));
                zzmz.zza(stringBuilder0, v + 1, "string_value", (zzfi$zzg0.zzn() ? "" : null));
                zzmz.zza(stringBuilder0, v + 1, "int_value", (zzfi$zzg0.zzl() ? zzfi$zzg0.zzd() : null));
                if(zzfi$zzg0.zzj()) {
                    double0 = zzfi$zzg0.zza();
                }
                zzmz.zza(stringBuilder0, v + 1, "double_value", double0);
                if(zzfi$zzg0.zzc() > 0) {
                    this.zza(stringBuilder0, v + 1, zzfi$zzg0.zzi());
                }
                zzmz.zza(stringBuilder0, v + 1);
                stringBuilder0.append("}\n");
            }
        }
    }

    static boolean zza(zzbg zzbg0, zzo zzo0) {
        Preconditions.checkNotNull(zzbg0);
        Preconditions.checkNotNull(zzo0);
        return !TextUtils.isEmpty(zzo0.zzb) || !TextUtils.isEmpty(zzo0.zzp);
    }

    static boolean zza(List list0, int v) {
        return v < list0.size() << 6 && (1L << v % 0x40 & ((long)(((Long)list0.get(v / 0x40))))) != 0L;
    }

    // 去混淆评级： 低(20)
    final long zza(String s) {
        return TextUtils.isEmpty(s) ? 0L : this.zza(s.getBytes(Charset.forName("UTF-8")));
    }

    final long zza(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        this.zzq().zzt();
        MessageDigest messageDigest0 = zznd.zzu();
        if(messageDigest0 == null) {
            this.zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zznd.zza(messageDigest0.digest(arr_b));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    final Parcelable zza(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        if(arr_b == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            return (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        }
        catch(ParseException unused_ex) {
            this.zzj().zzg().zza("Failed to load parcelable from buffer");
            return null;
        }
        finally {
            parcel0.recycle();
        }
    }

    final zze zza(zzaz zzaz0) {
        com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0 = zze.zze().zza(zzaz0.zzd);
        for(Object object0: zzaz0.zze) {
            com.google.android.gms.internal.measurement.zzfi.zzg.zza zzfi$zzg$zza0 = zzg.zze().zza(((String)object0));
            Object object1 = zzaz0.zze.zzc(((String)object0));
            Preconditions.checkNotNull(object1);
            this.zza(zzfi$zzg$zza0, object1);
            zzfi$zze$zza0.zza(zzfi$zzg$zza0);
        }
        return (zze)(((zzix)zzfi$zze$zza0.zzab()));
    }

    final zzbg zza(zzad zzad0) {
        String s;
        Bundle bundle0 = this.zza(zzad0.zzc(), true);
        if(bundle0.containsKey("_o")) {
            Object object0 = bundle0.get("_o");
            s = object0 == null ? "app" : object0.toString();
        }
        else {
            s = "app";
        }
        String s1 = zzii.zzb(zzad0.zzb());
        if(s1 == null) {
            s1 = zzad0.zzb();
        }
        return new zzbg(s1, new zzbb(bundle0), s, zzad0.zza());
    }

    @TargetApi(30)
    final zzmh zza(String s, zzj zzfi$zzj0, com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0, String s1) {
        if(zzpg.zza() && this.zze().zze(s, zzbi.zzcf)) {
            long v = this.zzb().currentTimeMillis();
            String[] arr_s = this.zze().zzd(s, zzbi.zzbb).split(",");
            HashSet hashSet0 = new HashSet(arr_s.length);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s2 = arr_s[v1];
                s2.getClass();
                if(!hashSet0.add(s2)) {
                    throw new IllegalArgumentException("duplicate element: " + s2);
                }
            }
            Set set0 = Collections.unmodifiableSet(hashSet0);
            zzmn zzmn0 = this.zzo();
            String s3 = zzmn0.zzm().zzf(s);
            Uri.Builder uri$Builder0 = new Uri.Builder();
            uri$Builder0.scheme(zzmn0.zze().zzd(s, zzbi.zzav));
            if(TextUtils.isEmpty(s3)) {
                uri$Builder0.authority(zzmn0.zze().zzd(s, zzbi.zzaw));
            }
            else {
                uri$Builder0.authority(s3 + "." + zzmn0.zze().zzd(s, zzbi.zzaw));
            }
            uri$Builder0.path(zzmn0.zze().zzd(s, zzbi.zzax));
            zzmz.zza(uri$Builder0, "gmp_app_id", "", set0);
            zzmz.zza(uri$Builder0, "gmp_version", "82001", set0);
            boolean z = !this.zze().zze(s, zzbi.zzci) || !this.zzm().zzp(s);
            zzmz.zza(uri$Builder0, "app_instance_id", "", set0);
            zzmz.zza(uri$Builder0, "rdid", "", set0);
            zzmz.zza(uri$Builder0, "bundle_id", "", set0);
            TextUtils.isEmpty(zzii.zza(""));
            zzmz.zza(uri$Builder0, "app_event_name", "", set0);
            zzmz.zza(uri$Builder0, "app_version", String.valueOf(zzfi$zzj0.zzb()), set0);
            if(this.zze().zze(s, zzbi.zzci) && this.zzm().zzt(s)) {
                boolean z1 = !this.zze().zze(s, zzbi.zzbv);
            }
            zzmz.zza(uri$Builder0, "os_version", "", set0);
            zzmz.zza(uri$Builder0, "timestamp", String.valueOf(zzfi$zze$zza0.zzc()), set0);
            String s4 = "1";
            if(zzfi$zzj0.zzat()) {
                zzmz.zza(uri$Builder0, "lat", "1", set0);
            }
            zzmz.zza(uri$Builder0, "privacy_sandbox_version", String.valueOf(zzfi$zzj0.zza()), set0);
            zzmz.zza(uri$Builder0, "trigger_uri_source", "1", set0);
            zzmz.zza(uri$Builder0, "trigger_uri_timestamp", String.valueOf(v), set0);
            if(s1 != null) {
                zzmz.zza(uri$Builder0, "request_uuid", s1, set0);
            }
            List list0 = zzfi$zze$zza0.zzf();
            Bundle bundle0 = new Bundle();
            for(Object object0: list0) {
                zzg zzfi$zzg0 = (zzg)object0;
                if(zzfi$zzg0.zzj()) {
                    bundle0.putString("", String.valueOf(zzfi$zzg0.zza()));
                }
                else if(zzfi$zzg0.zzk()) {
                    bundle0.putString("", String.valueOf(zzfi$zzg0.zzb()));
                }
                else if(zzfi$zzg0.zzn()) {
                    bundle0.putString("", "");
                }
                else if(zzfi$zzg0.zzl()) {
                    bundle0.putString("", String.valueOf(zzfi$zzg0.zzd()));
                }
            }
            zzmz.zza(uri$Builder0, this.zze().zzd(s, zzbi.zzba).split("\\|"), bundle0, set0);
            Bundle bundle1 = new Bundle();
            for(Object object1: zzfi$zzj0.zzaq()) {
                zzn zzfi$zzn0 = (zzn)object1;
                if(zzfi$zzn0.zzi()) {
                    bundle1.putString("", String.valueOf(zzfi$zzn0.zza()));
                }
                else if(zzfi$zzn0.zzj()) {
                    bundle1.putString("", String.valueOf(zzfi$zzn0.zzb()));
                }
                else if(zzfi$zzn0.zzm()) {
                    bundle1.putString("", "");
                }
                else if(zzfi$zzn0.zzk()) {
                    bundle1.putString("", String.valueOf(zzfi$zzn0.zzc()));
                }
            }
            zzmz.zza(uri$Builder0, this.zze().zzd(s, zzbi.zzaz).split("\\|"), bundle1, set0);
            if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
                if(!zzfi$zzj0.zzas()) {
                    s4 = "0";
                }
                zzmz.zza(uri$Builder0, "dma", s4, set0);
            }
            return new zzmh(uri$Builder0.build().toString(), v, 1);
        }
        return null;
    }

    final String zza(zzb zzew$zzb0) {
        if(zzew$zzb0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nevent_filter {\n");
        if(zzew$zzb0.zzl()) {
            zzmz.zza(stringBuilder0, 0, "filter_id", zzew$zzb0.zzb());
        }
        zzmz.zza(stringBuilder0, 0, "event_name", this.zzi().zza(""));
        String s = zzmz.zza(zzew$zzb0.zzh(), zzew$zzb0.zzi(), zzew$zzb0.zzj());
        if(!s.isEmpty()) {
            zzmz.zza(stringBuilder0, 0, "filter_type", s);
        }
        if(zzew$zzb0.zzk()) {
            zzmz.zza(stringBuilder0, 1, "event_count_filter", zzew$zzb0.zze());
        }
        if(zzew$zzb0.zza() > 0) {
            stringBuilder0.append("  filters {\n");
            for(Object object0: zzew$zzb0.zzg()) {
                this.zza(stringBuilder0, 2, ((zzc)object0));
            }
        }
        zzmz.zza(stringBuilder0, 1);
        stringBuilder0.append("}\n}\n");
        return stringBuilder0.toString();
    }

    final String zza(com.google.android.gms.internal.measurement.zzew.zze zzew$zze0) {
        if(zzew$zze0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nproperty_filter {\n");
        if(zzew$zze0.zzi()) {
            zzmz.zza(stringBuilder0, 0, "filter_id", zzew$zze0.zza());
        }
        zzmz.zza(stringBuilder0, 0, "property_name", this.zzi().zzc(""));
        String s = zzmz.zza(zzew$zze0.zzf(), zzew$zze0.zzg(), zzew$zze0.zzh());
        if(!s.isEmpty()) {
            zzmz.zza(stringBuilder0, 0, "filter_type", s);
        }
        this.zza(stringBuilder0, 1, zzew$zze0.zzb());
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    final String zza(zzi zzfi$zzi0) {
        if(zzfi$zzi0 == null) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nbatch {\n");
        for(Object object0: zzfi$zzi0.zzd()) {
            zzj zzfi$zzj0 = (zzj)object0;
            if(zzfi$zzj0 != null) {
                zzmz.zza(stringBuilder0, 1);
                stringBuilder0.append("bundle {\n");
                if(zzfi$zzj0.zzbk()) {
                    zzmz.zza(stringBuilder0, 1, "protocol_version", zzfi$zzj0.zze());
                }
                if(zzps.zza() && this.zze().zze("", zzbi.zzbt) && zzfi$zzj0.zzbn()) {
                    zzmz.zza(stringBuilder0, 1, "session_stitching_token", "");
                }
                zzmz.zza(stringBuilder0, 1, "platform", "");
                if(zzfi$zzj0.zzbf()) {
                    zzmz.zza(stringBuilder0, 1, "gmp_version", zzfi$zzj0.zzm());
                }
                if(zzfi$zzj0.zzbs()) {
                    zzmz.zza(stringBuilder0, 1, "uploading_gmp_version", zzfi$zzj0.zzs());
                }
                if(zzfi$zzj0.zzbd()) {
                    zzmz.zza(stringBuilder0, 1, "dynamite_version", zzfi$zzj0.zzk());
                }
                if(zzfi$zzj0.zzay()) {
                    zzmz.zza(stringBuilder0, 1, "config_version", zzfi$zzj0.zzi());
                }
                zzmz.zza(stringBuilder0, 1, "gmp_app_id", "");
                zzmz.zza(stringBuilder0, 1, "admob_app_id", "");
                zzmz.zza(stringBuilder0, 1, "app_id", "");
                zzmz.zza(stringBuilder0, 1, "app_version", "");
                if(zzfi$zzj0.zzav()) {
                    zzmz.zza(stringBuilder0, 1, "app_version_major", zzfi$zzj0.zzb());
                }
                zzmz.zza(stringBuilder0, 1, "firebase_instance_id", "");
                if(zzfi$zzj0.zzbc()) {
                    zzmz.zza(stringBuilder0, 1, "dev_cert_hash", zzfi$zzj0.zzj());
                }
                zzmz.zza(stringBuilder0, 1, "app_store", "");
                if(zzfi$zzj0.zzbr()) {
                    zzmz.zza(stringBuilder0, 1, "upload_timestamp_millis", zzfi$zzj0.zzr());
                }
                if(zzfi$zzj0.zzbo()) {
                    zzmz.zza(stringBuilder0, 1, "start_timestamp_millis", zzfi$zzj0.zzp());
                }
                if(zzfi$zzj0.zzbe()) {
                    zzmz.zza(stringBuilder0, 1, "end_timestamp_millis", zzfi$zzj0.zzl());
                }
                if(zzfi$zzj0.zzbj()) {
                    zzmz.zza(stringBuilder0, 1, "previous_bundle_start_timestamp_millis", zzfi$zzj0.zzo());
                }
                if(zzfi$zzj0.zzbi()) {
                    zzmz.zza(stringBuilder0, 1, "previous_bundle_end_timestamp_millis", zzfi$zzj0.zzn());
                }
                zzmz.zza(stringBuilder0, 1, "app_instance_id", "");
                zzmz.zza(stringBuilder0, 1, "resettable_device_id", "");
                zzmz.zza(stringBuilder0, 1, "ds_id", "");
                if(zzfi$zzj0.zzbh()) {
                    zzmz.zza(stringBuilder0, 1, "limited_ad_tracking", Boolean.valueOf(zzfi$zzj0.zzat()));
                }
                zzmz.zza(stringBuilder0, 1, "os_version", "");
                zzmz.zza(stringBuilder0, 1, "device_model", "");
                zzmz.zza(stringBuilder0, 1, "user_default_language", "");
                if(zzfi$zzj0.zzbq()) {
                    zzmz.zza(stringBuilder0, 1, "time_zone_offset_minutes", zzfi$zzj0.zzg());
                }
                if(zzfi$zzj0.zzax()) {
                    zzmz.zza(stringBuilder0, 1, "bundle_sequential_index", zzfi$zzj0.zzc());
                }
                if(zzfi$zzj0.zzbm()) {
                    zzmz.zza(stringBuilder0, 1, "service_upload", Boolean.valueOf(zzfi$zzj0.zzau()));
                }
                zzmz.zza(stringBuilder0, 1, "health_monitor", "");
                if(zzfi$zzj0.zzbl()) {
                    zzmz.zza(stringBuilder0, 1, "retry_counter", zzfi$zzj0.zzf());
                }
                if(zzfi$zzj0.zzba()) {
                    zzmz.zza(stringBuilder0, 1, "consent_signals", "");
                }
                if(zzfi$zzj0.zzbg()) {
                    zzmz.zza(stringBuilder0, 1, "is_dma_region", Boolean.valueOf(zzfi$zzj0.zzas()));
                }
                if(zzfi$zzj0.zzbb()) {
                    zzmz.zza(stringBuilder0, 1, "core_platform_services", "");
                }
                if(zzfi$zzj0.zzaz()) {
                    zzmz.zza(stringBuilder0, 1, "consent_diagnostics", "");
                }
                if(zzfi$zzj0.zzbp()) {
                    zzmz.zza(stringBuilder0, 1, "target_os_version", zzfi$zzj0.zzq());
                }
                if(zzpg.zza() && this.zze().zze("", zzbi.zzcf)) {
                    zzmz.zza(stringBuilder0, 1, "ad_services_version", zzfi$zzj0.zza());
                    if(zzfi$zzj0.zzaw()) {
                        com.google.android.gms.internal.measurement.zzfi.zzb zzfi$zzb0 = zzfi$zzj0.zzt();
                        if(zzfi$zzb0 != null) {
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("attribution_eligibility_status {\n");
                            zzmz.zza(stringBuilder0, 2, "eligible", Boolean.valueOf(zzfi$zzb0.zzf()));
                            zzmz.zza(stringBuilder0, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzfi$zzb0.zzh()));
                            zzmz.zza(stringBuilder0, 2, "pre_r", Boolean.valueOf(zzfi$zzb0.zzi()));
                            zzmz.zza(stringBuilder0, 2, "r_extensions_too_old", Boolean.valueOf(zzfi$zzb0.zzj()));
                            zzmz.zza(stringBuilder0, 2, "adservices_extension_too_old", Boolean.valueOf(zzfi$zzb0.zze()));
                            zzmz.zza(stringBuilder0, 2, "ad_storage_not_allowed", Boolean.valueOf(zzfi$zzb0.zzd()));
                            zzmz.zza(stringBuilder0, 2, "measurement_manager_disabled", Boolean.valueOf(zzfi$zzb0.zzg()));
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list0 = zzfi$zzj0.zzaq();
                if(list0 != null) {
                    for(Object object1: list0) {
                        zzn zzfi$zzn0 = (zzn)object1;
                        if(zzfi$zzn0 != null) {
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("user_property {\n");
                            Double double0 = null;
                            zzmz.zza(stringBuilder0, 2, "set_timestamp_millis", (zzfi$zzn0.zzl() ? zzfi$zzn0.zzd() : null));
                            zzmz.zza(stringBuilder0, 2, "name", this.zzi().zzc(""));
                            zzmz.zza(stringBuilder0, 2, "string_value", "");
                            zzmz.zza(stringBuilder0, 2, "int_value", (zzfi$zzn0.zzk() ? zzfi$zzn0.zzc() : null));
                            if(zzfi$zzn0.zzi()) {
                                double0 = zzfi$zzn0.zza();
                            }
                            zzmz.zza(stringBuilder0, 2, "double_value", double0);
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list1 = zzfi$zzj0.zzao();
                if(list1 != null) {
                    for(Object object2: list1) {
                        com.google.android.gms.internal.measurement.zzfi.zzc zzfi$zzc0 = (com.google.android.gms.internal.measurement.zzfi.zzc)object2;
                        if(zzfi$zzc0 != null) {
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("audience_membership {\n");
                            if(zzfi$zzc0.zzg()) {
                                zzmz.zza(stringBuilder0, 2, "audience_id", zzfi$zzc0.zza());
                            }
                            if(zzfi$zzc0.zzh()) {
                                zzmz.zza(stringBuilder0, 2, "new_audience", Boolean.valueOf(zzfi$zzc0.zzf()));
                            }
                            zzmz.zza(stringBuilder0, 2, "current_data", zzfi$zzc0.zzd());
                            if(zzfi$zzc0.zzi()) {
                                zzmz.zza(stringBuilder0, 2, "previous_data", zzfi$zzc0.zze());
                            }
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list2 = zzfi$zzj0.zzap();
                if(list2 != null) {
                    for(Object object3: list2) {
                        zze zzfi$zze0 = (zze)object3;
                        if(zzfi$zze0 != null) {
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("event {\n");
                            zzmz.zza(stringBuilder0, 2, "name", this.zzi().zza(""));
                            if(zzfi$zze0.zzk()) {
                                zzmz.zza(stringBuilder0, 2, "timestamp_millis", zzfi$zze0.zzd());
                            }
                            if(zzfi$zze0.zzj()) {
                                zzmz.zza(stringBuilder0, 2, "previous_timestamp_millis", zzfi$zze0.zzc());
                            }
                            if(zzfi$zze0.zzi()) {
                                zzmz.zza(stringBuilder0, 2, "count", zzfi$zze0.zza());
                            }
                            if(zzfi$zze0.zzb() != 0) {
                                this.zza(stringBuilder0, 2, zzfi$zze0.zzh());
                            }
                            zzmz.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                zzmz.zza(stringBuilder0, 1);
                stringBuilder0.append("}\n");
            }
        }
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    final List zza(List list0, List list1) {
        int v3;
        ArrayList arrayList0 = new ArrayList(list0);
        for(Object object0: list1) {
            Integer integer0 = (Integer)object0;
            if(((int)integer0) < 0) {
                this.zzj().zzu().zza("Ignoring negative bit index to be cleared", integer0);
            }
            else {
                int v = ((int)integer0) / 0x40;
                if(v >= arrayList0.size()) {
                    this.zzj().zzu().zza("Ignoring bit index greater than bitSet size", integer0, arrayList0.size());
                }
                else {
                    arrayList0.set(v, ((long)(((long)(((Long)arrayList0.get(v)))) & ~(1L << ((int)integer0) % 0x40))));
                }
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = arrayList0.size() - 1; true; v2 = v1 - 1) {
            v3 = v1;
            v1 = v2;
            if(v1 < 0 || ((long)(((Long)arrayList0.get(v1)))) != 0L) {
                break;
            }
        }
        return arrayList0.subList(0, v3);
    }

    final Map zza(Bundle bundle0, boolean z) {
        Map map0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            boolean z1 = object1 instanceof Parcelable[];
            if(!z1 && !(object1 instanceof ArrayList) && !(object1 instanceof Bundle)) {
                if(object1 == null) {
                    continue;
                }
                map0.put(s, object1);
            }
            else if(z) {
                ArrayList arrayList0 = new ArrayList();
                if(z1) {
                    Parcelable[] arr_parcelable = (Parcelable[])object1;
                    for(int v = 0; v < arr_parcelable.length; ++v) {
                        Parcelable parcelable0 = arr_parcelable[v];
                        if(parcelable0 instanceof Bundle) {
                            arrayList0.add(this.zza(((Bundle)parcelable0), false));
                        }
                    }
                }
                else if(object1 instanceof ArrayList) {
                    ArrayList arrayList1 = (ArrayList)object1;
                    int v1 = arrayList1.size();
                    int v2 = 0;
                    while(v2 < v1) {
                        Object object2 = arrayList1.get(v2);
                        ++v2;
                        if(object2 instanceof Bundle) {
                            arrayList0.add(this.zza(((Bundle)object2), false));
                        }
                    }
                }
                else if(object1 instanceof Bundle) {
                    arrayList0.add(this.zza(((Bundle)object1), false));
                }
                map0.put(s, arrayList0);
            }
        }
        return map0;
    }

    final void zza(com.google.android.gms.internal.measurement.zzfi.zzg.zza zzfi$zzg$zza0, Object object0) {
        Preconditions.checkNotNull(object0);
        zzfi$zzg$zza0.zze().zzc().zzb().zzd();
        if(object0 instanceof String) {
            zzfi$zzg$zza0.zzb(((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            zzfi$zzg$zza0.zza(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            zzfi$zzg$zza0.zza(((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            ArrayList arrayList0 = new ArrayList();
            int v = 0;
            while(v < ((Bundle[])object0).length) {
                Bundle bundle0 = ((Bundle[])object0)[v];
                if(bundle0 != null) {
                    com.google.android.gms.internal.measurement.zzfi.zzg.zza zzfi$zzg$zza1 = zzg.zze();
                    for(Object object1: bundle0.keySet()) {
                        com.google.android.gms.internal.measurement.zzfi.zzg.zza zzfi$zzg$zza2 = zzg.zze().zza(((String)object1));
                        Object object2 = bundle0.get(((String)object1));
                        if(object2 instanceof Long) {
                            zzfi$zzg$zza2.zza(((long)(((Long)object2))));
                        }
                        else if(object2 instanceof String) {
                            zzfi$zzg$zza2.zzb(((String)object2));
                        }
                        else {
                            if(!(object2 instanceof Double)) {
                                continue;
                            }
                            zzfi$zzg$zza2.zza(((double)(((Double)object2))));
                        }
                        zzfi$zzg$zza1.zza(zzfi$zzg$zza2);
                    }
                    if(zzfi$zzg$zza1.zza() > 0) {
                        arrayList0.add(((zzg)(((zzix)zzfi$zzg$zza1.zzab()))));
                    }
                }
                ++v;
            }
            zzfi$zzg$zza0.zza(arrayList0);
            return;
        }
        this.zzj().zzg().zza("Ignoring invalid (type) event param value", object0);
    }

    final void zza(zza zzfi$zzj$zza0) {
        this.zzj().zzp().zza("Checking account type status for ad personalization signals");
        if(this.zzc("")) {
            this.zzj().zzc().zza("Turning off ad personalization due to account type");
            zzn zzfi$zzn0 = (zzn)(((zzix)zzn.zze().zza("_npa").zzb(this.zzf().zzc()).zza(1L).zzab()));
            for(int v = 0; v < zzfi$zzj$zza0.zzb(); ++v) {
            }
            zzfi$zzj$zza0.zza(zzfi$zzn0);
            if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
                zzak zzak0 = zzak.zza("");
                zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzd, zzaj.zzg);
                zzfi$zzj$zza0.zzf(zzak0.toString());
            }
        }
    }

    final void zza(com.google.android.gms.internal.measurement.zzfi.zzn.zza zzfi$zzn$zza0, Object object0) {
        Preconditions.checkNotNull(object0);
        zzfi$zzn$zza0.zzc().zzb().zza();
        if(object0 instanceof String) {
            zzfi$zzn$zza0.zzb(((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            zzfi$zzn$zza0.zza(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            zzfi$zzn$zza0.zza(((double)(((Double)object0))));
            return;
        }
        this.zzj().zzg().zza("Ignoring invalid (type) user attribute value", object0);
    }

    final boolean zza(long v, long v1) {
        return v == 0L || v1 <= 0L || Math.abs(this.zzb().currentTimeMillis() - v) > v1;
    }

    static Object zzb(zze zzfi$zze0, String s) {
        zzg zzfi$zzg0 = zzmz.zza(zzfi$zze0, s);
        if(zzfi$zzg0 != null) {
            if(zzfi$zzg0.zzn()) {
                return "";
            }
            if(zzfi$zzg0.zzl()) {
                return zzfi$zzg0.zzd();
            }
            if(zzfi$zzg0.zzj()) {
                return zzfi$zzg0.zza();
            }
            if(zzfi$zzg0.zzc() > 0) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: zzfi$zzg0.zzi()) {
                    zzg zzfi$zzg1 = (zzg)object0;
                    if(zzfi$zzg1 != null) {
                        Bundle bundle0 = new Bundle();
                        for(Object object1: zzfi$zzg1.zzi()) {
                            zzg zzfi$zzg2 = (zzg)object1;
                            if(zzfi$zzg2.zzn()) {
                                bundle0.putString("", "");
                            }
                            else if(zzfi$zzg2.zzl()) {
                                bundle0.putLong("", zzfi$zzg2.zzd());
                            }
                            else if(zzfi$zzg2.zzj()) {
                                bundle0.putDouble("", zzfi$zzg2.zza());
                            }
                        }
                        if(!bundle0.isEmpty()) {
                            arrayList0.add(bundle0);
                        }
                    }
                }
                return (Bundle[])arrayList0.toArray(new Bundle[arrayList0.size()]);
            }
        }
        return null;
    }

    static boolean zzb(String s) [...] // 潜在的解密器

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    final byte[] zzb(byte[] arr_b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            gZIPOutputStream0.write(arr_b);
            gZIPOutputStream0.close();
            byteArrayOutputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Failed to gzip content", iOException0);
            throw iOException0;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
    }

    final boolean zzc(String s) {
        Preconditions.checkNotNull(s);
        zzh zzh0 = this.zzh().zzd(s);
        return zzh0 == null ? false : this.zzf().zzn() && zzh0.zzaj() && this.zzm().zzk(s);
    }

    final byte[] zzc(byte[] arr_b) {
        try {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            GZIPInputStream gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byte[] arr_b1 = new byte[0x400];
            int v;
            while((v = gZIPInputStream0.read(arr_b1)) > 0) {
                byteArrayOutputStream0.write(arr_b1, 0, v);
            }
            gZIPInputStream0.close();
            byteArrayInputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
        }
        this.zzj().zzg().zza("Failed to ungzip content", iOException0);
        throw iOException0;
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

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzao zzh() {
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

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzgp zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzls zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmn zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        super.zzt();
    }

    final List zzu() {
        Map map0 = zzbi.zza(this.zzf.zza());
        if(map0 != null && !map0.isEmpty()) {
            List list0 = new ArrayList();
            int v = (int)(((Integer)zzbi.zzap.zza(null)));
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((String)map$Entry0.getKey()).startsWith("measurement.id.")) {
                    try {
                        int v1 = Integer.parseInt(((String)map$Entry0.getValue()));
                        if(v1 == 0) {
                            continue;
                        }
                        list0.add(v1);
                        if(list0.size() < v) {
                            continue;
                        }
                        this.zzj().zzu().zza("Too many experiment IDs. Number of IDs", list0.size());
                        return list0.isEmpty() ? null : list0;
                    }
                    catch(NumberFormatException numberFormatException0) {
                        this.zzj().zzu().zza("Experiment ID NumberFormatException", numberFormatException0);
                    }
                }
            }
            return list0.isEmpty() ? null : list0;
        }
        return null;
    }
}

