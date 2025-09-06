package com.google.android.gms.measurement.internal;

import Z1.d;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import c0.a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzot;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zznd extends zzic {
    private static final String[] zza;
    private static final String[] zzb;
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private a zzf;
    private Boolean zzg;
    private Integer zzh;

    static {
        zznd.zza = new String[]{"firebase_", "google_", "ga_"};
        zznd.zzb = new String[]{"_err"};
    }

    zznd(zzhf zzhf0) {
        super(zzhf0);
        this.zzh = null;
        this.zzd = new AtomicLong(0L);
    }

    private final int zza(String s, String s1, String s2, Object object0, Bundle bundle0, List list0, boolean z, boolean z1) {
        int v2;
        int v1;
        this.zzt();
        if(zznd.zza(object0)) {
            if(!z1) {
                return 21;
            }
            if(!zznd.zza(s2, zzik.zzc)) {
                return 20;
            }
            if(!this.zzu.zzr().zzai()) {
                return 25;
            }
            if(object0 instanceof Parcelable[]) {
                v1 = ((Parcelable[])object0).length;
                goto label_13;
            }
            else if(object0 instanceof ArrayList) {
                v1 = ((ArrayList)object0).size();
            label_13:
                if(v1 > 200) {
                    this.zzj().zzv().zza("Parameter array is too long; discarded. Value kind, name, array length", "param", s2, v1);
                    if(!(object0 instanceof Parcelable[])) {
                        if(object0 instanceof ArrayList && ((ArrayList)object0).size() > 200) {
                            bundle0.putParcelableArrayList(s2, new ArrayList(((ArrayList)object0).subList(0, 200)));
                        }
                    }
                    else if(((Parcelable[])object0).length > 200) {
                        bundle0.putParcelableArray(s2, ((Parcelable[])Arrays.copyOf(((Parcelable[])object0), 200)));
                    }
                    v2 = 17;
                }
                else {
                    v2 = 0;
                }
            }
            else {
                v2 = 0;
            }
        }
        else {
            v2 = 0;
        }
        if(this.zza("param", s2, (zznd.zzg(s1) || zznd.zzg(s2) ? this.zze().zzc(this.zzu.zzh().zzad()) : this.zze().zzb(this.zzu.zzh().zzad())), object0)) {
            return v2;
        }
        if(z1) {
            if(object0 instanceof Bundle) {
                this.zza(s, s1, s2, ((Bundle)object0), list0, z);
                return v2;
            }
            if(object0 instanceof Parcelable[]) {
                for(int v3 = 0; v3 < ((Parcelable[])object0).length; ++v3) {
                    Parcelable parcelable0 = ((Parcelable[])object0)[v3];
                    if(!(parcelable0 instanceof Bundle)) {
                        this.zzj().zzv().zza("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable0.getClass(), s2);
                        return 4;
                    }
                    this.zza(s, s1, s2, ((Bundle)parcelable0), list0, z);
                }
                return v2;
            }
            if(object0 instanceof ArrayList) {
                int v4 = ((ArrayList)object0).size();
                for(int v = 0; v < v4; ++v) {
                    Object object1 = ((ArrayList)object0).get(v);
                    if(!(object1 instanceof Bundle)) {
                        zzft zzft0 = this.zzj().zzv();
                        Class class0 = object1 == null ? "null" : object1.getClass();
                        zzft0.zza("All ArrayList elements must be of type Bundle. Value type, name", class0, s2);
                        return 4;
                    }
                    this.zza(s, s1, s2, ((Bundle)object1), list0, z);
                }
                return v2;
            }
        }
        return 4;
    }

    public static long zza(long v, long v1) {
        return (v + v1 * 60000L) / 86400000L;
    }

    public static long zza(zzbb zzbb0) {
        long v = 0L;
        if(zzbb0 == null) {
            return 0L;
        }
        for(Object object0: zzbb0) {
            Object object1 = zzbb0.zzc(((String)object0));
            if(object1 instanceof Parcelable[]) {
                v += (long)((Parcelable[])object1).length;
            }
        }
        return v;
    }

    static long zza(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        int v = 0;
        Preconditions.checkState(arr_b.length > 0);
        int v1 = arr_b.length - 1;
        long v2 = 0L;
        while(v1 >= 0 && v1 >= arr_b.length - 8) {
            v2 += (((long)arr_b[v1]) & 0xFFL) << v;
            v += 8;
            --v1;
        }
        return v2;
    }

    public static Bundle zza(Bundle bundle0) {
        if(bundle0 == null) {
            return new Bundle();
        }
        Bundle bundle1 = new Bundle(bundle0);
        Iterator iterator0 = bundle1.keySet().iterator();
        while(iterator0.hasNext()) {
            int v = 0;
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = bundle1.get(s);
            if(object1 instanceof Bundle) {
                bundle1.putBundle(s, new Bundle(((Bundle)object1)));
            }
            else if(object1 instanceof Parcelable[]) {
                Parcelable[] arr_parcelable = (Parcelable[])object1;
                while(v < arr_parcelable.length) {
                    if(arr_parcelable[v] instanceof Bundle) {
                        arr_parcelable[v] = new Bundle(((Bundle)arr_parcelable[v]));
                    }
                    ++v;
                }
            }
            else if(object1 instanceof List) {
                List list0 = (List)object1;
                while(v < list0.size()) {
                    Object object2 = list0.get(v);
                    if(object2 instanceof Bundle) {
                        list0.set(v, new Bundle(((Bundle)object2)));
                    }
                    ++v;
                }
            }
        }
        return bundle1;
    }

    public static Bundle zza(List list0) {
        Bundle bundle0 = new Bundle();
        if(list0 == null) {
            return bundle0;
        }
        for(Object object0: list0) {
            zznc zznc0 = (zznc)object0;
            String s = zznc0.zzd;
            if(s == null) {
                Long long0 = zznc0.zzc;
                if(long0 == null) {
                    Double double0 = zznc0.zzf;
                    if(double0 != null) {
                        bundle0.putDouble(zznc0.zza, ((double)double0));
                    }
                }
                else {
                    bundle0.putLong(zznc0.zza, ((long)long0));
                }
            }
            else {
                bundle0.putString(zznc0.zza, s);
            }
        }
        return bundle0;
    }

    private final Object zza(int v, Object object0, boolean z, boolean z1) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Double)) {
            if(object0 instanceof Integer) {
                return (long)(((int)(((Integer)object0))));
            }
            if(object0 instanceof Byte) {
                return (long)(((byte)(((Byte)object0))));
            }
            if(object0 instanceof Short) {
                return (long)(((short)(((Short)object0))));
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? 1L : 0L;
            }
            if(object0 instanceof Float) {
                return ((Float)object0).doubleValue();
            }
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                if(z1 && (object0 instanceof Bundle[] || object0 instanceof Parcelable[])) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < ((Parcelable[])object0).length; ++v1) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v1];
                        if(parcelable0 instanceof Bundle) {
                            Bundle bundle0 = this.zzb(((Bundle)parcelable0));
                            if(bundle0 != null && !bundle0.isEmpty()) {
                                arrayList0.add(bundle0);
                            }
                        }
                    }
                    return arrayList0.toArray(new Bundle[arrayList0.size()]);
                }
                return null;
            }
            return zznd.zza(String.valueOf(object0), v, z);
        }
        return object0;
    }

    public static String zza(String s, int v, boolean z) {
        if(s == null) {
            return null;
        }
        if(s.codePointCount(0, s.length()) > v) {
            return z ? s.substring(0, s.offsetByCodePoints(0, v)) + "..." : null;
        }
        return s;
    }

    private static void zza(Bundle bundle0, int v, String s, String s1, Object object0) {
        if(zznd.zzb(bundle0, v)) {
            bundle0.putString("_ev", zznd.zza(s, 40, true));
            if(object0 != null) {
                Preconditions.checkNotNull(bundle0);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    bundle0.putLong("_el", ((long)String.valueOf(object0).length()));
                }
            }
        }
    }

    public static void zza(zzki zzki0, Bundle bundle0, boolean z) {
        if(bundle0 != null && zzki0 != null && (!bundle0.containsKey("_sc") || z)) {
            String s = zzki0.zza;
            if(s == null) {
                bundle0.remove("_sn");
            }
            else {
                bundle0.putString("_sn", s);
            }
            String s1 = zzki0.zzb;
            if(s1 == null) {
                bundle0.remove("_sc");
            }
            else {
                bundle0.putString("_sc", s1);
            }
            bundle0.putLong("_si", zzki0.zzc);
            return;
        }
        if(bundle0 != null && zzki0 == null && z) {
            bundle0.remove("_sn");
            bundle0.remove("_sc");
            bundle0.remove("_si");
        }
    }

    public static void zza(zznf zznf0, int v, String s, String s1, int v1) {
        zznd.zza(zznf0, null, v, s, s1, v1);
    }

    static void zza(zznf zznf0, String s, int v, String s1, String s2, int v1) {
        Bundle bundle0 = new Bundle();
        zznd.zzb(bundle0, v);
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            bundle0.putString(s1, s2);
        }
        if(v == 2 || v == 6 || v == 7) {
            bundle0.putLong("_el", ((long)v1));
        }
        zznf0.zza(s, "_err", bundle0);
    }

    private final void zza(String s, String s1, String s2, Bundle bundle0, List list0, boolean z) {
        String s4;
        String s5;
        int v4;
        int v2;
        if(bundle0 == null) {
            return;
        }
        int v = this.zze().zzc();
        int v1 = 0;
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s3 = (String)object0;
            if(list0 == null || !list0.contains(s3)) {
                int v3 = z ? 0 : this.zzl(s3);
                v2 = v3 == 0 ? this.zzk(s3) : v3;
            }
            else {
                v2 = 0;
            }
            switch(v2) {
                case 0: {
                    if(zznd.zza(bundle0.get(s3))) {
                        this.zzj().zzv().zza("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s1, s2, s3);
                        v4 = 22;
                        s5 = s3;
                    }
                    else {
                        s5 = s3;
                        v4 = this.zza(s, s1, s3, bundle0.get(s3), bundle0, list0, z, false);
                    }
                    if(v4 == 0 || "_ev".equals(s5)) {
                        if(!zznd.zzh(s5) || zznd.zza(s5, zzik.zzd)) {
                            continue;
                        }
                        if(!this.zza(231100000, true)) {
                            this.zzj().zzh().zza("Item array not supported on client\'s version of Google Play Services (Android Only)", this.zzi().zza(s1), this.zzi().zza(bundle0));
                            zznd.zzb(bundle0, 23);
                            bundle0.remove(s5);
                        }
                        else if(v1 + 1 > v) {
                            if(!zzot.zza() || !this.zze().zza(zzbi.zzcc)) {
                                this.zzj().zzh().zza("Item cannot contain custom parameters", this.zzi().zza(s1), this.zzi().zza(bundle0));
                                zznd.zzb(bundle0, 23);
                            }
                            else {
                                this.zzj().zzh().zza("Item can\'t contain more than " + v + " item-scoped custom params", this.zzi().zza(s1), this.zzi().zza(bundle0));
                                zznd.zzb(bundle0, 28);
                            }
                            bundle0.remove(s5);
                        }
                        ++v1;
                    }
                    else {
                        zznd.zza(bundle0, v4, s5, s5, bundle0.get(s5));
                        bundle0.remove(s5);
                    }
                    continue;
                }
                case 3: {
                    s4 = s3;
                    break;
                }
                default: {
                    s4 = null;
                }
            }
            zznd.zza(bundle0, v2, s3, s3, s4);
            bundle0.remove(s3);
        }
    }

    static boolean zza(Context context0) {
        Preconditions.checkNotNull(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ActivityInfo activityInfo0 = packageManager0.getReceiverInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if(activityInfo0 != null) {
                return activityInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    static boolean zza(Context context0, boolean z) {
        Preconditions.checkNotNull(context0);
        return Build.VERSION.SDK_INT < 24 ? zznd.zzc(context0, "com.google.android.gms.measurement.AppMeasurementService") : zznd.zzc(context0, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean zza(Intent intent0) {
        String s = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(s) || "https://www.google.com".equals(s) || "android-app://com.google.appcrawler".equals(s);
    }

    static boolean zza(Bundle bundle0, int v) {
        int v1 = 0;
        if(bundle0.size() <= v) {
            return false;
        }
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s = (String)object0;
            ++v1;
            if(v1 > v) {
                bundle0.remove(s);
            }
        }
        return true;
    }

    // 去混淆评级： 低(30)
    static boolean zza(Object object0) {
        return object0 instanceof Parcelable[] || object0 instanceof ArrayList || object0 instanceof Bundle;
    }

    // 去混淆评级： 低(20)
    static boolean zza(String s, String s1, String s2, String s3) {
        boolean z = TextUtils.isEmpty(s);
        boolean z1 = TextUtils.isEmpty(s1);
        if(!z && !z1) {
            Preconditions.checkNotNull(s);
            return !s.equals(s1);
        }
        if(z && z1) {
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) ? !TextUtils.isEmpty(s3) : !s2.equals(s3);
        }
        return z || !z1 || !TextUtils.isEmpty(s3) ? TextUtils.isEmpty(s2) || !s2.equals(s3) : false;
    }

    private static boolean zza(String s, String[] arr_s) {
        Preconditions.checkNotNull(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            if(zzng.zza(s, arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    static byte[] zza(Parcelable parcelable0) {
        if(parcelable0 == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    public final int zza(int v) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zza(), 12451000);
    }

    final int zza(String s) {
        if(!this.zzb("event", s)) {
            return 2;
        }
        if(!this.zza("event", zzii.zza, zzii.zzb, s)) {
            return 13;
        }
        return this.zza("event", 40, s) ? 0 : 2;
    }

    // 去混淆评级： 低(40)
    final int zza(String s, Object object0) {
        return ("_ldl".equals(s) ? this.zza("user property referrer", s, zznd.zzm(s), object0) : this.zza("user property", s, zznd.zzm(s), object0)) ? 0 : 7;
    }

    final long zza(Context context0, String s) {
        this.zzt();
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotEmpty(s);
        PackageManager packageManager0 = context0.getPackageManager();
        MessageDigest messageDigest0 = zznd.zzu();
        if(messageDigest0 == null) {
            this.zzj().zzg().zza("Could not get MD5 instance");
            return -1L;
        }
        if(packageManager0 != null) {
            try {
                if(!this.zzb(context0, s)) {
                    Signature[] arr_signature = Wrappers.packageManager(context0).getPackageInfo("com.fmkorea.m.fmk", 0x40).signatures;
                    if(arr_signature != null && arr_signature.length > 0) {
                        return zznd.zza(messageDigest0.digest(arr_signature[0].toByteArray()));
                    }
                    this.zzj().zzu().zza("Could not get signatures");
                    return -1L;
                }
                return 0L;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            }
            this.zzj().zzg().zza("Package name not found", packageManager$NameNotFoundException0);
        }
        return 0L;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Context zza() {
        return super.zza();
    }

    final Bundle zza(Uri uri0, boolean z, boolean z1) {
        String s8;
        String s7;
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        if(uri0 == null) {
            return null;
        }
        try {
            if(uri0.isHierarchical()) {
                s = uri0.getQueryParameter("utm_campaign");
                s1 = uri0.getQueryParameter("utm_source");
                s2 = uri0.getQueryParameter("utm_medium");
                s3 = uri0.getQueryParameter("gclid");
                s4 = z1 ? uri0.getQueryParameter("gbraid") : null;
                s5 = uri0.getQueryParameter("utm_id");
                s6 = uri0.getQueryParameter("dclid");
                s7 = uri0.getQueryParameter("srsltid");
                s8 = z ? uri0.getQueryParameter("sfmc_id") : null;
            }
            else {
                s = null;
                s1 = null;
                s2 = null;
                s3 = null;
                s4 = null;
                s5 = null;
                s6 = null;
                s7 = null;
                s8 = null;
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            this.zzj().zzu().zza("Install referrer url isn\'t a hierarchical URI", unsupportedOperationException0);
            return null;
        }
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && (!z1 || TextUtils.isEmpty(s4)) && TextUtils.isEmpty(s5) && TextUtils.isEmpty(s6) && TextUtils.isEmpty(s7) && (!z || TextUtils.isEmpty(s8))) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        if(!TextUtils.isEmpty(s)) {
            bundle0.putString("campaign", s);
        }
        if(!TextUtils.isEmpty(s1)) {
            bundle0.putString("source", s1);
        }
        if(!TextUtils.isEmpty(s2)) {
            bundle0.putString("medium", s2);
        }
        if(!TextUtils.isEmpty(s3)) {
            bundle0.putString("gclid", s3);
        }
        if(z1 && !TextUtils.isEmpty(s4)) {
            bundle0.putString("gbraid", s4);
        }
        String s9 = uri0.getQueryParameter("utm_term");
        if(!TextUtils.isEmpty(s9)) {
            bundle0.putString("term", s9);
        }
        String s10 = uri0.getQueryParameter("utm_content");
        if(!TextUtils.isEmpty(s10)) {
            bundle0.putString("content", s10);
        }
        String s11 = uri0.getQueryParameter("aclid");
        if(!TextUtils.isEmpty(s11)) {
            bundle0.putString("aclid", s11);
        }
        String s12 = uri0.getQueryParameter("cp1");
        if(!TextUtils.isEmpty(s12)) {
            bundle0.putString("cp1", s12);
        }
        String s13 = uri0.getQueryParameter("anid");
        if(!TextUtils.isEmpty(s13)) {
            bundle0.putString("anid", s13);
        }
        if(!TextUtils.isEmpty(s5)) {
            bundle0.putString("campaign_id", s5);
        }
        if(!TextUtils.isEmpty(s6)) {
            bundle0.putString("dclid", s6);
        }
        String s14 = uri0.getQueryParameter("utm_source_platform");
        if(!TextUtils.isEmpty(s14)) {
            bundle0.putString("source_platform", s14);
        }
        String s15 = uri0.getQueryParameter("utm_creative_format");
        if(!TextUtils.isEmpty(s15)) {
            bundle0.putString("creative_format", s15);
        }
        String s16 = uri0.getQueryParameter("utm_marketing_tactic");
        if(!TextUtils.isEmpty(s16)) {
            bundle0.putString("marketing_tactic", s16);
        }
        if(!TextUtils.isEmpty(s7)) {
            bundle0.putString("srsltid", s7);
        }
        if(z && !TextUtils.isEmpty(s8)) {
            bundle0.putString("sfmc_id", s8);
        }
        return bundle0;
    }

    final Bundle zza(String s, String s1, Bundle bundle0, List list0, boolean z) {
        String s3;
        int v4;
        int v2;
        boolean z1 = zznd.zza(s1, zzii.zzd);
        if(bundle0 != null) {
            Bundle bundle1 = new Bundle(bundle0);
            int v = this.zze().zzg();
            int v1 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s2 = (String)object0;
                if(list0 == null || !list0.contains(s2)) {
                    int v3 = z ? 0 : this.zzl(s2);
                    v2 = v3 == 0 ? this.zzk(s2) : v3;
                }
                else {
                    v2 = 0;
                }
                switch(v2) {
                    case 0: {
                        v4 = v;
                        int v5 = this.zza(s, s1, s2, bundle0.get(s2), bundle1, list0, z, z1);
                        if(v5 == 17) {
                            zznd.zza(bundle1, 17, s2, s2, Boolean.FALSE);
                        }
                        else if(v5 != 0 && !"_ev".equals(s2)) {
                            zznd.zza(bundle1, v5, (v5 == 21 ? s1 : s2), s2, bundle0.get(s2));
                            bundle1.remove(s2);
                            break;
                        }
                        if(zznd.zzh(s2)) {
                            if(v1 + 1 > v4) {
                                this.zzj().zzh().zza("Event can\'t contain more than " + v4 + " params", this.zzi().zza(s1), this.zzi().zza(bundle0));
                                zznd.zzb(bundle1, 5);
                                bundle1.remove(s2);
                            }
                            ++v1;
                        }
                        break;
                    }
                    case 3: {
                        s3 = s2;
                        zznd.zza(bundle1, v2, s2, s2, s3);
                        bundle1.remove(s2);
                        v4 = v;
                        break;
                    }
                    default: {
                        s3 = null;
                        zznd.zza(bundle1, v2, s2, s2, s3);
                        bundle1.remove(s2);
                        v4 = v;
                        break;
                    }
                }
                v = v4;
            }
            return bundle1;
        }
        return null;
    }

    final zzbg zza(String s, String s1, Bundle bundle0, String s2, long v, boolean z, boolean z1) {
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        if(this.zza(s1) == 0) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle1.putString("_o", s2);
            Bundle bundle2 = this.zza(s, s1, bundle1, CollectionUtils.listOf("_o"), true);
            if(z) {
                bundle2 = this.zzb(bundle2);
            }
            Preconditions.checkNotNull(bundle2);
            return new zzbg(s1, new zzbb(bundle2), s2, v);
        }
        this.zzj().zzg().zza("Invalid conditional property event name", this.zzi().zzc(s1));
        throw new IllegalArgumentException();
    }

    public final URL zza(long v, String s, String s1, long v1, String s2) {
        try {
            Preconditions.checkNotEmpty(s1);
            Preconditions.checkNotEmpty(s);
            String s3 = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", v, this.zzg()), s1, s, v1);
            if(s.equals(this.zze().zzo())) {
                s3 = s3 + "&ddl_test=1";
            }
            if(!s2.isEmpty()) {
                if(s2.charAt(0) != 38) {
                    s3 = s3 + "&";
                }
                s3 = s3 + s2;
            }
            return new URL(s3);
        }
        catch(MalformedURLException | IllegalArgumentException malformedURLException0) {
        }
        this.zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", malformedURLException0.getMessage());
        return null;
    }

    final void zza(Bundle bundle0, long v) {
        long v1 = bundle0.getLong("_et");
        if(v1 != 0L) {
            this.zzj().zzu().zza("Params already contained engagement", v1);
        }
        bundle0.putLong("_et", v + v1);
    }

    final void zza(Bundle bundle0, Bundle bundle1) {
        if(bundle1 == null) {
            return;
        }
        for(Object object0: bundle1.keySet()) {
            String s = (String)object0;
            if(!bundle0.containsKey(s)) {
                this.zzq().zza(bundle0, s, bundle1.get(s));
            }
        }
    }

    final void zza(Bundle bundle0, String s, Object object0) {
        if(bundle0 == null) {
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof String) {
            bundle0.putString(s, String.valueOf(object0));
            return;
        }
        if(object0 instanceof Double) {
            bundle0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            bundle0.putParcelableArray(s, ((Bundle[])object0));
            return;
        }
        if(s != null) {
            String s1 = object0 == null ? null : object0.getClass().getSimpleName();
            this.zzj().zzv().zza("Not putting event parameter. Invalid value type. name, type", this.zzi().zzb(s), s1);
        }
    }

    public final void zza(zzcv zzcv0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("r", v);
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning int value to wrapper", remoteException0);
        }
    }

    public final void zza(zzcv zzcv0, long v) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("r", v);
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning long value to wrapper", remoteException0);
        }
    }

    public final void zza(zzcv zzcv0, Bundle bundle0) {
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning bundle value to wrapper", remoteException0);
        }
    }

    public final void zza(zzcv zzcv0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("r", s);
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning string value to wrapper", remoteException0);
        }
    }

    public final void zza(zzcv zzcv0, ArrayList arrayList0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("r", arrayList0);
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning bundle list to wrapper", remoteException0);
        }
    }

    public final void zza(zzcv zzcv0, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("r", z);
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning boolean value to wrapper", remoteException0);
        }
    }

    public final void zza(zzcv zzcv0, byte[] arr_b) {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("r", arr_b);
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning byte array to wrapper", remoteException0);
        }
    }

    final void zza(zzfv zzfv0, int v) {
        int v1 = 0;
        for(Object object0: new TreeSet(zzfv0.zzb.keySet())) {
            String s = (String)object0;
            if(zznd.zzh(s)) {
                ++v1;
                if(v1 > v) {
                    this.zzj().zzh().zza("Event can\'t contain more than " + v + " params", this.zzi().zza(zzfv0.zza), this.zzi().zza(zzfv0.zzb));
                    zznd.zzb(zzfv0.zzb, 5);
                    zzfv0.zzb.remove(s);
                }
            }
        }
    }

    final void zza(Parcelable[] arr_parcelable, int v, boolean z) {
        Preconditions.checkNotNull(arr_parcelable);
        for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
            Bundle bundle0 = (Bundle)arr_parcelable[v1];
            int v2 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s = (String)object0;
                if(zznd.zzh(s) && !zznd.zza(s, zzik.zzd)) {
                    ++v2;
                    if(v2 > v) {
                        if(z) {
                            this.zzj().zzh().zza("Param can\'t contain more than " + v + " item-scoped custom parameters", this.zzi().zzb(s), this.zzi().zza(bundle0));
                            zznd.zzb(bundle0, 28);
                        }
                        else {
                            this.zzj().zzh().zza("Param cannot contain item-scoped custom parameters", this.zzi().zzb(s), this.zzi().zza(bundle0));
                            zznd.zzb(bundle0, 23);
                        }
                        bundle0.remove(s);
                    }
                }
            }
        }
    }

    public final boolean zza(int v, boolean z) {
        Boolean boolean0 = this.zzu.zzr().zzab();
        return this.zzg() >= v / 1000 || boolean0 != null && !boolean0.booleanValue();
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean zza(String s, double f) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            sharedPreferences$Editor0.putString("deeplink", s);
            sharedPreferences$Editor0.putLong("timestamp", Double.doubleToRawLongBits(f));
            return sharedPreferences$Editor0.commit();
        }
        catch(RuntimeException runtimeException0) {
            this.zzj().zzg().zza("Failed to persist Deferred Deep Link. exception", runtimeException0);
            return false;
        }
    }

    final boolean zza(String s, int v, String s1) {
        if(s1 == null) {
            this.zzj().zzh().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.codePointCount(0, s1.length()) > v) {
            this.zzj().zzh().zza("Name is too long. Type, maximum supported length, name", s, v, s1);
            return false;
        }
        return true;
    }

    final boolean zza(String s, String s1) {
        if(!TextUtils.isEmpty(s)) {
            if(zznd.zzn(s)) {
                return true;
            }
            if(this.zzu.zzae()) {
                this.zzj().zzh().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzfr.zza(s));
            }
            return false;
        }
        if(!TextUtils.isEmpty(s1)) {
            if(!zznd.zzn(s1)) {
                this.zzj().zzh().zza("Invalid admob_app_id. Analytics disabled.", zzfr.zza(s1));
                return false;
            }
            return true;
        }
        if(this.zzu.zzae()) {
            this.zzj().zzh().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    final boolean zza(String s, String s1, int v, Object object0) {
        if(object0 == null) {
            return true;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Float) && !(object0 instanceof Integer) && !(object0 instanceof Byte) && !(object0 instanceof Short) && !(object0 instanceof Boolean) && !(object0 instanceof Double)) {
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                return false;
            }
            String s2 = String.valueOf(object0);
            if(s2.codePointCount(0, s2.length()) > v) {
                this.zzj().zzv().zza("Value is too long; discarded. Value kind, name, value length", s, s1, s2.length());
                return false;
            }
        }
        return true;
    }

    final boolean zza(String s, String[] arr_s, String s1) {
        return this.zza(s, arr_s, null, s1);
    }

    final boolean zza(String s, String[] arr_s, String[] arr_s1, String s1) {
        if(s1 == null) {
            this.zzj().zzh().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        Preconditions.checkNotNull(s1);
        String[] arr_s2 = zznd.zza;
        for(int v = 0; v < arr_s2.length; ++v) {
            if(s1.startsWith(arr_s2[v])) {
                this.zzj().zzh().zza("Name starts with reserved prefix. Type, name", s, s1);
                return false;
            }
        }
        if(arr_s != null && zznd.zza(s1, arr_s) && (arr_s1 == null || !zznd.zza(s1, arr_s1))) {
            this.zzj().zzh().zza("Name is reserved. Type, name", s, s1);
            return false;
        }
        return true;
    }

    public static ArrayList zzb(List list0) {
        if(list0 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("app_id", ((zzad)object0).zza);
            bundle0.putString("origin", ((zzad)object0).zzb);
            bundle0.putLong("creation_timestamp", ((zzad)object0).zzd);
            bundle0.putString("name", ((zzad)object0).zzc.zza);
            zzie.zza(bundle0, Preconditions.checkNotNull(((zzad)object0).zzc.zza()));
            bundle0.putBoolean("active", ((zzad)object0).zze);
            String s = ((zzad)object0).zzf;
            if(s != null) {
                bundle0.putString("trigger_event_name", s);
            }
            zzbg zzbg0 = ((zzad)object0).zzg;
            if(zzbg0 != null) {
                bundle0.putString("timed_out_event_name", zzbg0.zza);
                zzbb zzbb0 = zzbg0.zzb;
                if(zzbb0 != null) {
                    bundle0.putBundle("timed_out_event_params", zzbb0.zzb());
                }
            }
            bundle0.putLong("trigger_timeout", ((zzad)object0).zzh);
            zzbg zzbg1 = ((zzad)object0).zzi;
            if(zzbg1 != null) {
                bundle0.putString("triggered_event_name", zzbg1.zza);
                zzbb zzbb1 = zzbg1.zzb;
                if(zzbb1 != null) {
                    bundle0.putBundle("triggered_event_params", zzbb1.zzb());
                }
            }
            bundle0.putLong("triggered_timestamp", ((zzad)object0).zzc.zzb);
            bundle0.putLong("time_to_live", ((zzad)object0).zzj);
            zzbg zzbg2 = ((zzad)object0).zzk;
            if(zzbg2 != null) {
                bundle0.putString("expired_event_name", zzbg2.zza);
                zzbb zzbb2 = zzbg2.zzb;
                if(zzbb2 != null) {
                    bundle0.putBundle("expired_event_params", zzbb2.zzb());
                }
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    private final boolean zzb(Context context0, String s) {
        X500Principal x500Principal0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(s, 0x40);
            if(packageInfo0 != null) {
                Signature[] arr_signature = packageInfo0.signatures;
                if(arr_signature != null && arr_signature.length > 0) {
                    Signature signature0 = arr_signature[0];
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(x500Principal0);
                }
            }
        }
        catch(CertificateException certificateException0) {
            this.zzj().zzg().zza("Error obtaining certificate", certificateException0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.zzj().zzg().zza("Package name not found", packageManager$NameNotFoundException0);
        }
        return true;
    }

    private static boolean zzb(Bundle bundle0, int v) {
        if(bundle0 == null) {
            return false;
        }
        if(bundle0.getLong("_err") == 0L) {
            bundle0.putLong("_err", ((long)v));
            return true;
        }
        return false;
    }

    static Bundle[] zzb(Object object0) {
        if(object0 instanceof Bundle) {
            return new Bundle[]{((Bundle)object0)};
        }
        if(object0 instanceof Parcelable[]) {
            return (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
        }
        return object0 instanceof ArrayList ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
    }

    final int zzb(String s) {
        if(!this.zzb("user property", s)) {
            return 6;
        }
        if(!this.zza("user property", zzij.zza, s)) {
            return 15;
        }
        return this.zza("user property", 24, s) ? 0 : 6;
    }

    final Bundle zzb(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = this.zzb(s, bundle0.get(s));
                if(object1 == null) {
                    this.zzj().zzv().zza("Param value can\'t be null", this.zzi().zzb(s));
                }
                else {
                    this.zza(bundle1, s, object1);
                }
            }
        }
        return bundle1;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Clock zzb() {
        return super.zzb();
    }

    final Object zzb(String s, Object object0) {
        if("_ev".equals(s)) {
            return this.zza(this.zze().zzc(this.zzu.zzh().zzad()), object0, true, true);
        }
        return zznd.zzg(s) ? this.zza(this.zze().zzc(this.zzu.zzh().zzad()), object0, false, true) : this.zza(this.zze().zzb(this.zzu.zzh().zzad()), object0, false, true);
    }

    final boolean zzb(String s, String s1) {
        if(s1 == null) {
            this.zzj().zzh().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.zzj().zzh().zza("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v) && v != 0x5F) {
            this.zzj().zzh().zza("Name must start with a letter or _ (underscore). Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.zzj().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    static int zzc() {
        return Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3 ? 0 : SdkExtensions.getExtensionVersion(1000000);
    }

    private static boolean zzc(Context context0, String s) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, s), 0);
            if(serviceInfo0 != null) {
                return serviceInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    final long zzc(String s) {
        if(this.zza().getPackageManager() == null) {
            return 0L;
        }
        try {
            if(Wrappers.packageManager(this.zza()).getApplicationInfo(s, 0) != null) {
                return 35L;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            this.zzj().zzn().zza("PackageManager failed to find running app: app_id", s);
        }
        return 0L;
    }

    // 去混淆评级： 低(20)
    final Object zzc(String s, Object object0) {
        return "_ldl".equals(s) ? this.zza(zznd.zzm(s), object0, true, false) : this.zza(zznd.zzm(s), object0, false, false);
    }

    final boolean zzc(String s, String s1) {
        if(s1 == null) {
            this.zzj().zzh().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.zzj().zzh().zza("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            this.zzj().zzh().zza("Name must start with a letter. Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.zzj().zzh().zza("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    // 去混淆评级： 中等(100)
    static boolean zzd(String s) {
        return Arrays.asList(new String[]{"com.labpixies.flood"}).contains(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    final boolean zze(String s) {
        this.zzt();
        if(Wrappers.packageManager(this.zza()).checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        this.zzj().zzc().zza("Permission not granted", s);
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    // 去混淆评级： 低(20)
    final boolean zzf(String s) {
        return TextUtils.isEmpty(s) ? false : this.zze().zzn().equals(s);
    }

    // 去混淆评级： 低(20)
    static boolean zzg(String s) {
        return !TextUtils.isEmpty(s) && s.startsWith("_");
    }

    public final int zzg() {
        if(this.zzh == null) {
            this.zzh = (int)(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zza()) / 1000);
        }
        return (int)this.zzh;
    }

    static boolean zzh(String s) {
        Preconditions.checkNotEmpty(s);
        return s.charAt(0) != 0x5F || s.equals("_ep");
    }

    final long zzh() {
        long v;
        this.zzt();
        if(!zznd.zzd(this.zzu.zzh().zzad())) {
            return 0L;
        }
        if(Build.VERSION.SDK_INT < 30) {
            v = 4L;
        }
        else if(SdkExtensions.getExtensionVersion(30) < 4) {
            v = 8L;
        }
        else {
            v = zznd.zzc() >= ((int)(((Integer)zzbi.zzau.zza(null)))) ? 0L : 16L;
        }
        if(!this.zze("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            v |= 2L;
        }
        if(v == 0L && !this.zzy()) {
            v = 0x40L;
        }
        return v == 0L ? 1L : v;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    public final boolean zzi(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        List list0 = this.zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0);
        return list0 != null && !list0.isEmpty();
    }

    public static boolean zzj(String s) {
        String[] arr_s = zznd.zzb;
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(s)) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfr zzj() {
        return super.zzj();
    }

    private final int zzk(String s) {
        if(!this.zzb("event param", s)) {
            return 3;
        }
        if(!this.zza("event param", null, s)) {
            return 14;
        }
        return this.zza("event param", 40, s) ? 0 : 3;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    private final int zzl(String s) {
        if(!this.zzc("event param", s)) {
            return 3;
        }
        if(!this.zza("event param", null, s)) {
            return 14;
        }
        return this.zza("event param", 40, s) ? 0 : 3;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgy zzl() {
        return super.zzl();
    }

    private static int zzm(String s) {
        if("_ldl".equals(s)) {
            return 0x800;
        }
        if("_id".equals(s)) {
            return 0x100;
        }
        if("_lgclid".equals(s)) {
            return 100;
        }
        return "_gbraid".equals(s) ? 100 : 36;
    }

    public final long zzm() {
        int v2;
        long v1;
        if(this.zzd.get() == 0L) {
            synchronized(this.zzd) {
                v1 = new Random(System.nanoTime() ^ this.zzb().currentTimeMillis()).nextLong();
                v2 = this.zze + 1;
                this.zze = v2;
            }
            return v1 + ((long)v2);
        }
        synchronized(this.zzd) {
            this.zzd.compareAndSet(-1L, 1L);
        }
        return this.zzd.getAndIncrement();
    }

    private static boolean zzn(String s) {
        Preconditions.checkNotNull(s);
        return s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    final a zzn() {
        if(this.zzf == null) {
            this.zzf = a.a(this.zza());
        }
        return this.zzf;
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final boolean zzo() {
        return true;
    }

    final String zzp() {
        byte[] arr_b = new byte[16];
        this.zzv().nextBytes(arr_b);
        return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
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

    static MessageDigest zzu() {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    final SecureRandom zzv() {
        this.zzt();
        if(this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    final boolean zzw() {
        this.zzt();
        return this.zzh() == 1L;
    }

    public final boolean zzx() {
        try {
            this.zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    @TargetApi(30)
    private final boolean zzy() {
        if(this.zzg == null) {
            a a0 = this.zzn();
            boolean z = false;
            if(a0 == null) {
                return false;
            }
            d d0 = a0.b();
            Integer integer0 = null;
            try {
                integer0 = (Integer)d0.get(10000L, TimeUnit.MILLISECONDS);
                if(integer0 != null && ((int)integer0) == 1) {
                    z = true;
                }
                this.zzg = Boolean.valueOf(z);
            }
            catch(CancellationException | ExecutionException | InterruptedException | TimeoutException cancellationException0) {
                this.zzj().zzu().zza("Measurement manager api exception", cancellationException0);
                this.zzg = Boolean.FALSE;
            }
            this.zzj().zzp().zza("Measurement manager api status result", integer0);
        }
        return this.zzg.booleanValue();
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final void zzz() {
        this.zzt();
        SecureRandom secureRandom0 = new SecureRandom();
        long v = secureRandom0.nextLong();
        if(v == 0L) {
            v = secureRandom0.nextLong();
            if(v == 0L) {
                this.zzj().zzu().zza("Utils falling back to Random for random id");
            }
        }
        this.zzd.set(v);
    }
}

