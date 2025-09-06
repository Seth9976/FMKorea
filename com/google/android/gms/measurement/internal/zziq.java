package com.google.android.gms.measurement.internal;

import Z1.b;
import Z1.d;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zziq extends zze {
    protected zzjx zza;
    final zzu zzb;
    private zzim zzc;
    private final Set zzd;
    private boolean zze;
    private final AtomicReference zzf;
    private final Object zzg;
    private boolean zzh;
    private PriorityQueue zzi;
    private zzih zzj;
    private final AtomicLong zzk;
    private long zzl;
    private boolean zzm;
    private zzaw zzn;
    private final zznf zzo;

    protected zziq(zzhf zzhf0) {
        super(zzhf0);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzm = true;
        this.zzo = new zzjp(this);
        this.zzf = new AtomicReference();
        this.zzj = zzih.zza;
        this.zzl = -1L;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzu(zzhf0);
    }

    static void zza(zziq zziq0, zzih zzih0, long v, boolean z, boolean z1) {
        zziq0.zzt();
        zziq0.zzu();
        zzih zzih1 = zziq0.zzk().zzm();
        if(v <= zziq0.zzl && zzih.zza(zzih1.zza(), zzih0.zza())) {
            zziq0.zzj().zzn().zza("Dropped out-of-date consent setting, proposed settings", zzih0);
            return;
        }
        if(zziq0.zzk().zza(zzih0)) {
            zziq0.zzl = v;
            zziq0.zzo().zza(z);
            if(z1) {
                zziq0.zzo().zza(new AtomicReference());
            }
        }
        else {
            zziq0.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", zzih0.zza());
        }
    }

    static void zza(zziq zziq0, zzih zzih0, zzih zzih1) {
        if(zzih0.zza(zzih1, new zza[]{zza.zzb, zza.zza}) || zzih0.zzb(zzih1, new zza[]{zza.zzb, zza.zza})) {
            zziq0.zzg().zzag();
        }
    }

    static void zza(zziq zziq0, Boolean boolean0, boolean z) {
        zziq0.zza(boolean0, true);
    }

    static void zza(zziq zziq0, boolean z) {
        zziq0.zzh = false;
    }

    private final void zza(Boolean boolean0, boolean z) {
        this.zzt();
        this.zzu();
        this.zzj().zzc().zza("Setting app measurement enabled (FE)", boolean0);
        this.zzk().zza(boolean0);
        if(z) {
            this.zzk().zzb(boolean0);
        }
        if(this.zzu.zzad() || boolean0 != null && !boolean0.booleanValue()) {
            this.zzap();
        }
    }

    private final void zza(String s, String s1, long v, Object object0) {
        this.zzl().zzb(new zzjf(this, s, s1, object0, v));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    public final ArrayList zza(String s, String s1) {
        if(this.zzl().zzg()) {
            this.zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if(zzae.zza()) {
            this.zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzu.zzl().zza(atomicReference0, 5000L, "get conditional user properties", new zzjo(this, atomicReference0, null, s, s1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zznd.zzb(list0);
    }

    public final List zza(boolean z) {
        this.zzu();
        this.zzj().zzp().zza("Getting user properties (FE)");
        if(this.zzl().zzg()) {
            this.zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        if(zzae.zza()) {
            this.zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzu.zzl().zza(atomicReference0, 5000L, "get user properties", new zzji(this, atomicReference0, z));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        return list0;
    }

    public final Map zza(String s, String s1, boolean z) {
        if(this.zzl().zzg()) {
            this.zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if(zzae.zza()) {
            this.zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.zzu.zzl().zza(atomicReference0, 5000L, "get user properties", new zzjn(this, atomicReference0, null, s, s1, z));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        Map map0 = new a(list0.size());
        for(Object object0: list0) {
            zznc zznc0 = (zznc)object0;
            Object object1 = zznc0.zza();
            if(object1 != null) {
                map0.put(zznc0.zza, object1);
            }
        }
        return map0;
    }

    final void zza(long v, boolean z) {
        this.zzt();
        this.zzu();
        this.zzj().zzc().zza("Resetting analytics data (FE)");
        zzlx zzlx0 = this.zzp();
        zzlx0.zzt();
        zzlx0.zzb.zza();
        if(zzps.zza() && this.zze().zza(zzbi.zzbs)) {
            this.zzg().zzag();
        }
        boolean z1 = this.zzu.zzac();
        zzgd zzgd0 = this.zzk();
        zzgd0.zzc.zza(v);
        if(!TextUtils.isEmpty(zzgd0.zzk().zzq.zza())) {
            zzgd0.zzq.zza(null);
        }
        if(zzoh.zza() && zzgd0.zze().zza(zzbi.zzbn)) {
            zzgd0.zzk.zza(0L);
        }
        zzgd0.zzl.zza(0L);
        if(!zzgd0.zze().zzv()) {
            zzgd0.zzb(!z1);
        }
        zzgd0.zzr.zza(null);
        zzgd0.zzs.zza(0L);
        zzgd0.zzt.zza(null);
        if(z) {
            this.zzo().zzaf();
        }
        if(zzoh.zza() && this.zze().zza(zzbi.zzbn)) {
            this.zzp().zza.zza();
        }
        this.zzm = !z1;
    }

    final void zza(Bundle bundle0) {
        if(bundle0 == null) {
            zzgd zzgd0 = this.zzk();
            Bundle bundle1 = new Bundle();
            zzgd0.zzt.zza(bundle1);
            return;
        }
        Bundle bundle2 = this.zzk().zzt.zza();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if(object1 != null && !(object1 instanceof String) && !(object1 instanceof Long) && !(object1 instanceof Double)) {
                this.zzq();
                if(zznd.zza(object1)) {
                    this.zzq();
                    zznd.zza(this.zzo, 27, null, null, 0);
                }
                this.zzj().zzv().zza("Invalid default event parameter type. Name, value", s, object1);
            }
            else if(zznd.zzg(s)) {
                this.zzj().zzv().zza("Invalid default event parameter name. Name", s);
            }
            else if(object1 == null) {
                bundle2.remove(s);
            }
            else if(this.zzq().zza("param", s, this.zze().zzb(this.zzu.zzh().zzad()), object1)) {
                this.zzq().zza(bundle2, s, object1);
            }
        }
        this.zzq();
        if(zznd.zza(bundle2, this.zze().zzg())) {
            this.zzq();
            zznd.zza(this.zzo, 26, null, null, 0);
            this.zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzk().zzt.zza(bundle2);
        this.zzo().zza(bundle2);
    }

    final void zza(Bundle bundle0, int v, long v1) {
        this.zzu();
        String s = zzih.zza(bundle0);
        if(s != null) {
            this.zzj().zzv().zza("Ignoring invalid consent setting", s);
            this.zzj().zzv().zza("Valid consent values are \'granted\', \'denied\'");
        }
        zzih zzih0 = zzih.zza(bundle0, v);
        if(zznp.zza() && this.zze().zza(zzbi.zzcl)) {
            if(zzih0.zzi()) {
                this.zza(zzih0, v1);
            }
            zzay zzay0 = zzay.zza(bundle0, v);
            if(zzay0.zzg()) {
                this.zza(zzay0);
            }
            Boolean boolean0 = zzay.zza(bundle0);
            if(boolean0 != null) {
                this.zza("app", "allow_personalized_ads", boolean0.toString(), false);
            }
            return;
        }
        this.zza(zzih0, v1);
    }

    public final void zza(Bundle bundle0, long v) {
        Preconditions.checkNotNull(bundle0);
        Bundle bundle1 = new Bundle(bundle0);
        if(!TextUtils.isEmpty(bundle1.getString("app_id"))) {
            this.zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle1.remove("app_id");
        Preconditions.checkNotNull(bundle1);
        zzie.zza(bundle1, "app_id", String.class, null);
        zzie.zza(bundle1, "origin", String.class, null);
        zzie.zza(bundle1, "name", String.class, null);
        zzie.zza(bundle1, "value", Object.class, null);
        zzie.zza(bundle1, "trigger_event_name", String.class, null);
        zzie.zza(bundle1, "trigger_timeout", Long.class, 0L);
        zzie.zza(bundle1, "timed_out_event_name", String.class, null);
        zzie.zza(bundle1, "timed_out_event_params", Bundle.class, null);
        zzie.zza(bundle1, "triggered_event_name", String.class, null);
        zzie.zza(bundle1, "triggered_event_params", Bundle.class, null);
        zzie.zza(bundle1, "time_to_live", Long.class, 0L);
        zzie.zza(bundle1, "expired_event_name", String.class, null);
        zzie.zza(bundle1, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle1.getString("name"));
        Preconditions.checkNotEmpty(bundle1.getString("origin"));
        Preconditions.checkNotNull(bundle1.get("value"));
        bundle1.putLong("creation_timestamp", v);
        String s = bundle1.getString("name");
        Object object0 = bundle1.get("value");
        if(this.zzq().zzb(s) != 0) {
            this.zzj().zzg().zza("Invalid conditional user property name", this.zzi().zzc(s));
            return;
        }
        if(this.zzq().zza(s, object0) != 0) {
            this.zzj().zzg().zza("Invalid conditional user property value", this.zzi().zzc(s), object0);
            return;
        }
        Object object1 = this.zzq().zzc(s, object0);
        if(object1 == null) {
            this.zzj().zzg().zza("Unable to normalize conditional user property value", this.zzi().zzc(s), object0);
            return;
        }
        zzie.zza(bundle1, object1);
        long v1 = bundle1.getLong("trigger_timeout");
        if(!TextUtils.isEmpty(bundle1.getString("trigger_event_name")) && (v1 > 15552000000L || v1 < 1L)) {
            this.zzj().zzg().zza("Invalid conditional user property timeout", this.zzi().zzc(s), v1);
            return;
        }
        long v2 = bundle1.getLong("time_to_live");
        if(v2 <= 15552000000L && v2 >= 1L) {
            this.zzl().zzb(new zzjm(this, bundle1));
            return;
        }
        this.zzj().zzg().zza("Invalid conditional user property time to live", this.zzi().zzc(s), v2);
    }

    final void zza(zzay zzay0) {
        this.zzl().zzb(new zzjw(this, zzay0));
    }

    final void zza(zzih zzih0) {
        this.zzt();
        boolean z = zzih0.zzh() && zzih0.zzg() || this.zzo().zzaj();
        if(z != this.zzu.zzad()) {
            this.zzu.zzb(z);
            Boolean boolean0 = this.zzk().zzp();
            if(!z || boolean0 == null || boolean0.booleanValue()) {
                this.zza(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zza(zzih zzih0, long v) {
        zzih zzih1;
        boolean z2;
        zzih zzih3;
        boolean z1;
        this.zzu();
        int v1 = zzih0.zza();
        if(v1 != -10 && zzih0.zzc() == null && zzih0.zzd() == null) {
            this.zzj().zzv().zza("Discarding empty consent settings");
            return;
        }
        synchronized(this.zzg) {
            zzih1 = this.zzj;
            boolean z = false;
            if(zzih.zza(v1, zzih1.zza())) {
                z1 = zzih0.zzc(this.zzj);
                if(zzih0.zzh() && !this.zzj.zzh()) {
                    z = true;
                }
                zzih zzih2 = zzih0.zzb(this.zzj);
                this.zzj = zzih2;
                zzih3 = zzih2;
                z2 = z;
                z = true;
            }
            else {
                zzih3 = zzih0;
                z2 = false;
                z1 = false;
            }
        }
        if(!z) {
            this.zzj().zzn().zza("Ignoring lower-priority consent settings, proposed settings", zzih3);
            return;
        }
        long v3 = this.zzk.getAndIncrement();
        if(z1) {
            this.zza(null);
            this.zzl().zzc(new zzjv(this, zzih3, v, v3, z2, zzih1));
            return;
        }
        zzjy zzjy0 = new zzjy(this, zzih3, v3, z2, zzih1);
        if(v1 != -10 && v1 != 30) {
            this.zzl().zzb(zzjy0);
            return;
        }
        this.zzl().zzc(zzjy0);
    }

    public final void zza(zzil zzil0) {
        this.zzu();
        Preconditions.checkNotNull(zzil0);
        if(!this.zzd.add(zzil0)) {
            this.zzj().zzu().zza("OnEventListener already registered");
        }
    }

    public final void zza(zzim zzim0) {
        this.zzt();
        this.zzu();
        if(zzim0 != null) {
            zzim zzim1 = this.zzc;
            if(zzim0 != zzim1) {
                Preconditions.checkState(zzim1 == null, "EventInterceptor already set.");
            }
        }
        this.zzc = zzim0;
    }

    public final void zza(Boolean boolean0) {
        this.zzu();
        this.zzl().zzb(new zzjt(this, boolean0));
    }

    final void zza(String s) {
        this.zzf.set(s);
    }

    final void zza(String s, String s1, long v, Bundle bundle0) {
        this.zzt();
        this.zza(s, s1, v, bundle0, true, this.zzc == null || zznd.zzg(s1), true, null);
    }

    protected final void zza(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        int v1 = 0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(bundle0);
        this.zzt();
        this.zzu();
        if(!this.zzu.zzac()) {
            this.zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        String s3 = null;
        List list0 = this.zzg().zzaf();
        if(list0 != null && !list0.contains(s1)) {
            this.zzj().zzc().zza("Dropping non-safelisted event. event name, origin", s1, s);
            return;
        }
        if(!this.zze) {
            try {
                this.zze = true;
                Class class0 = this.zzu.zzag() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zza().getClassLoader());
                try {
                    class0.getDeclaredMethod("initialize", Context.class).invoke(null, this.zza());
                }
                catch(Exception exception0) {
                    this.zzj().zzu().zza("Failed to invoke Tag Manager\'s initialize() method", exception0);
                }
            }
            catch(ClassNotFoundException unused_ex) {
                this.zzj().zzn().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if("_cmp".equals(s1)) {
            if(bundle0.containsKey("gclid")) {
                this.zza("auto", "_lgclid", bundle0.getString("gclid"), this.zzb().currentTimeMillis());
            }
            if(zzoi.zza() && this.zze().zza(zzbi.zzcs) && bundle0.containsKey("gbraid")) {
                this.zza("auto", "_gbraid", bundle0.getString("gbraid"), this.zzb().currentTimeMillis());
            }
        }
        if(z && zznd.zzj(s1)) {
            this.zzq().zza(bundle0, this.zzk().zzt.zza());
        }
        if(!z2 && !"_iap".equals(s1)) {
            zznd zznd0 = this.zzu.zzt();
            int v2 = 2;
            if(zznd0.zzc("event", s1)) {
                if(!zznd0.zza("event", zzii.zza, zzii.zzb, s1)) {
                    v2 = 13;
                }
                else if(zznd0.zza("event", 40, s1)) {
                    v2 = 0;
                }
            }
            if(v2 != 0) {
                this.zzj().zzh().zza("Invalid public event name. Event will not be logged (FE)", this.zzi().zza(s1));
                this.zzu.zzt();
                String s4 = zznd.zza(s1, 40, true);
                if(s1 != null) {
                    v1 = s1.length();
                }
                this.zzu.zzt();
                zznd.zza(this.zzo, v2, "_ev", s4, v1);
                return;
            }
        }
        zzki zzki0 = this.zzn().zza(false);
        if(zzki0 != null && !bundle0.containsKey("_sc")) {
            zzki0.zzd = true;
        }
        zznd.zza(zzki0, bundle0, z && !z2);
        boolean z3 = "am".equals(s);
        boolean z4 = zznd.zzg(s1);
        if(z && this.zzc != null && !z4 && !z3) {
            this.zzj().zzc().zza("Passing event to registered event handler (FE)", this.zzi().zza(s1), this.zzi().zza(bundle0));
            Preconditions.checkNotNull(this.zzc);
            this.zzc.interceptEvent(s, s1, bundle0, v);
            return;
        }
        if(!this.zzu.zzaf()) {
            return;
        }
        int v3 = this.zzq().zza(s1);
        if(v3 != 0) {
            this.zzj().zzh().zza("Invalid event name. Event will not be logged (FE)", this.zzi().zza(s1));
            this.zzq();
            String s5 = zznd.zza(s1, 40, true);
            if(s1 != null) {
                v1 = s1.length();
            }
            this.zzu.zzt();
            zznd.zza(this.zzo, s2, v3, "_ev", s5, v1);
            return;
        }
        List list1 = CollectionUtils.listOf(new String[]{"_o", "_sn", "_sc", "_si"});
        Bundle bundle1 = this.zzq().zza(s2, s1, bundle0, list1, z2);
        Preconditions.checkNotNull(bundle1);
        if(this.zzn().zza(false) != null && "_ae".equals(s1)) {
            zzlx zzlx0 = this.zzp();
            long v4 = zzlx0.zzb.zzb.zzb().elapsedRealtime();
            long v5 = v4 - zzlx0.zzb.zza;
            zzlx0.zzb.zza = v4;
            if(v5 > 0L) {
                this.zzq().zza(bundle1, v5);
            }
        }
        if(zznv.zza() && this.zze().zza(zzbi.zzbm)) {
            if(!"auto".equals(s) && "_ssr".equals(s1)) {
                zznd zznd1 = this.zzq();
                String s6 = bundle1.getString("_ffr");
                if(!Strings.isEmptyOrWhitespace(s6) && s6 != null) {
                    s3 = s6.trim();
                }
                if(zzng.zza(s3, zznd1.zzk().zzq.zza())) {
                    zznd1.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zznd1.zzk().zzq.zza(s3);
            }
            else if("_ae".equals(s1)) {
                String s7 = this.zzq().zzk().zzq.zza();
                if(!TextUtils.isEmpty(s7)) {
                    bundle1.putString("_ffr", s7);
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(bundle1);
        boolean z5 = this.zze().zza(zzbi.zzcj) ? this.zzp().zzaa() : this.zzk().zzn.zza();
        if(this.zzk().zzk.zza() > 0L && this.zzk().zza(v) && z5) {
            this.zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
            this.zza("auto", "_sid", null, this.zzb().currentTimeMillis());
            this.zza("auto", "_sno", null, this.zzb().currentTimeMillis());
            this.zza("auto", "_se", null, this.zzb().currentTimeMillis());
            this.zzk().zzl.zza(0L);
        }
        if(bundle1.getLong("extend_session", 0L) == 1L) {
            this.zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            this.zzu.zzs().zza.zza(v, true);
        }
        ArrayList arrayList1 = new ArrayList(bundle1.keySet());
        Collections.sort(arrayList1);
        int v6 = arrayList1.size();
        int v7 = 0;
        while(v7 < v6) {
            Object object0 = arrayList1.get(v7);
            ++v7;
            String s8 = (String)object0;
            if(s8 != null) {
                this.zzq();
                Bundle[] arr_bundle = zznd.zzb(bundle1.get(s8));
                if(arr_bundle != null) {
                    bundle1.putParcelableArray(s8, arr_bundle);
                }
            }
        }
        for(int v8 = 0; v8 < arrayList0.size(); ++v8) {
            Bundle bundle2 = (Bundle)arrayList0.get(v8);
            bundle2.putString("_o", s);
            if(z1) {
                bundle2 = this.zzq().zzb(bundle2);
            }
            Bundle bundle3 = bundle2;
            zzbg zzbg0 = new zzbg((v8 == 0 ? s1 : "_ep"), new zzbb(bundle3), s, v);
            this.zzo().zza(zzbg0, s2);
            if(!z3) {
                for(Object object1: this.zzd) {
                    ((zzil)object1).onEvent(s, s1, new Bundle(bundle3), v);
                }
            }
        }
        if(this.zzn().zza(false) != null && "_ae".equals(s1)) {
            this.zzp().zza(true, true, this.zzb().elapsedRealtime());
        }
    }

    public final void zza(String s, String s1, Bundle bundle0) {
        long v = this.zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(s);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", s);
        bundle1.putLong("creation_timestamp", v);
        if(s1 != null) {
            bundle1.putString("expired_event_name", s1);
            bundle1.putBundle("expired_event_params", bundle0);
        }
        this.zzl().zzb(new zzjl(this, bundle1));
    }

    public final void zza(String s, String s1, Bundle bundle0, String s2) {
        this.zzs();
        this.zzb(s, s1, this.zzb().currentTimeMillis(), bundle0, false, true, true, s2);
    }

    public final void zza(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        switch(s1) {
            case 0: {
                break;
            }
            case 0x8892: {
                this.zzn().zza(bundle1, v);
                return;
            }
            default: {
                if(s1.equals("screen_view")) {
                    this.zzn().zza(bundle1, v);
                    return;
                }
            }
        }
        this.zzb((s == null ? "app" : s), s1, v, bundle1, z1, !z1 || this.zzc == null || zznd.zzg(s1), z, null);
    }

    final void zza(String s, String s1, Object object0, long v) {
        String s3;
        Long long1;
        String s2 = "false";
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzu();
        if(!"allow_personalized_ads".equals(s1)) {
            s3 = s1;
            long1 = object0;
        }
        else if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
            Long long0 = (long)("false".equals(((String)object0).toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
            zzgj zzgj0 = this.zzk().zzh;
            if(((long)long0) == 1L) {
                s2 = "true";
            }
            zzgj0.zza(s2);
            long1 = long0;
            s3 = "_npa";
        }
        else if(object0 == null) {
            this.zzk().zzh.zza("unset");
            long1 = null;
            s3 = "_npa";
        }
        else {
            s3 = s1;
            long1 = object0;
        }
        if(!this.zzu.zzac()) {
            this.zzj().zzp().zza("User property not set since app measurement is disabled");
            return;
        }
        if(!this.zzu.zzaf()) {
            return;
        }
        zznc zznc0 = new zznc(s3, v, long1, s);
        this.zzo().zza(zznc0);
    }

    public final void zza(String s, String s1, Object object0, boolean z) {
        this.zza(s, s1, object0, z, this.zzb().currentTimeMillis());
    }

    public final void zza(String s, String s1, Object object0, boolean z, long v) {
        int v2;
        if(s == null) {
            s = "app";
        }
        int v1 = 0;
        if(z) {
            v2 = this.zzq().zzb(s1);
        }
        else {
            zznd zznd0 = this.zzq();
            if(!zznd0.zzc("user property", s1)) {
                v2 = 6;
            }
            else if(!zznd0.zza("user property", zzij.zza, s1)) {
                v2 = 15;
            }
            else if(zznd0.zza("user property", 24, s1)) {
                v2 = 0;
            }
            else {
                v2 = 6;
            }
        }
        if(v2 != 0) {
            this.zzq();
            String s2 = zznd.zza(s1, 24, true);
            if(s1 != null) {
                v1 = s1.length();
            }
            this.zzu.zzt();
            zznd.zza(this.zzo, v2, "_ev", s2, v1);
            return;
        }
        if(object0 != null) {
            int v3 = this.zzq().zza(s1, object0);
            if(v3 != 0) {
                this.zzq();
                String s3 = zznd.zza(s1, 24, true);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    v1 = String.valueOf(object0).length();
                }
                this.zzu.zzt();
                zznd.zza(this.zzo, v3, "_ev", s3, v1);
                return;
            }
            Object object1 = this.zzq().zzc(s1, object0);
            if(object1 != null) {
                this.zza(s, s1, v, object1);
            }
            return;
        }
        this.zza(s, s1, v, null);
    }

    // 检测为 Lambda 实现
    final void zza(List list0) [...]

    public final Boolean zzaa() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Boolean)this.zzl().zza(atomicReference0, 15000L, "boolean test flag value", new zzja(this, atomicReference0));
    }

    public final Double zzab() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Double)this.zzl().zza(atomicReference0, 15000L, "double test flag value", new zzju(this, atomicReference0));
    }

    public final Integer zzac() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Integer)this.zzl().zza(atomicReference0, 15000L, "int test flag value", new zzjr(this, atomicReference0));
    }

    public final Long zzad() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (Long)this.zzl().zza(atomicReference0, 15000L, "long test flag value", new zzjs(this, atomicReference0));
    }

    public final String zzae() {
        return (String)this.zzf.get();
    }

    public final String zzaf() {
        zzki zzki0 = this.zzu.zzq().zzaa();
        return zzki0 == null ? null : zzki0.zzb;
    }

    public final String zzag() {
        zzki zzki0 = this.zzu.zzq().zzaa();
        return zzki0 == null ? null : zzki0.zza;
    }

    public final String zzah() {
        if(this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzgz(this.zza(), this.zzu.zzx()).zza("google_app_id");
        }
        catch(IllegalStateException illegalStateException0) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", illegalStateException0);
            return null;
        }
    }

    public final String zzai() {
        AtomicReference atomicReference0 = new AtomicReference();
        return (String)this.zzl().zza(atomicReference0, 15000L, "String test flag value", new zzjj(this, atomicReference0));
    }

    public final void zzaj() {
        this.zzt();
        this.zzu();
        if(!this.zzu.zzaf()) {
            return;
        }
        if(this.zze().zza(zzbi.zzbh)) {
            Boolean boolean0 = this.zze().zzg("google_analytics_deferred_deep_link_enabled");
            if(boolean0 != null && boolean0.booleanValue()) {
                this.zzj().zzc().zza("Deferred Deep Link feature enabled.");
                this.zzl().zzb(() -> {
                    this.zzt();
                    if(this.zzk().zzo.zza()) {
                        this.zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        return;
                    }
                    long v = this.zzk().zzp.zza();
                    this.zzk().zzp.zza(v + 1L);
                    if(v >= 5L) {
                        this.zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        this.zzk().zzo.zza(true);
                        return;
                    }
                    if(zznp.zza() && this.zze().zza(zzbi.zzcn)) {
                        if(this.zzn == null) {
                            this.zzn = new zzjh(this, this.zzu);
                        }
                        this.zzn.zza(0L);
                        return;
                    }
                    this.zzu.zzah();
                });
            }
        }
        this.zzo().zzac();
        this.zzm = false;
        String s = this.zzk().zzv();
        if(!TextUtils.isEmpty(s)) {
            this.zzf().zzab();
            if(!s.equals(Build.VERSION.RELEASE)) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("_po", s);
                this.zzc("auto", "_ou", bundle0);
            }
        }
    }

    public final void zzak() {
        if(this.zza().getApplicationContext() instanceof Application && this.zza != null) {
            ((Application)this.zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    final void zzal() {
        if(zzpg.zza() && this.zze().zza(zzbi.zzcg)) {
            if(this.zzl().zzg()) {
                this.zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if(zzae.zza()) {
                this.zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            this.zzu();
            this.zzj().zzp().zza("Getting trigger URIs (FE)");
            AtomicReference atomicReference0 = new AtomicReference();
            this.zzl().zza(atomicReference0, 5000L, "get trigger URIs", new zzir(this, atomicReference0));
            List list0 = (List)atomicReference0.get();
            if(list0 == null) {
                this.zzj().zzg().zza("Timed out waiting for get trigger URIs");
                return;
            }
            this.zzl().zzb(() -> {
                this.zzt();
                if(Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArray0 = this.zzk().zzg();
                    for(Object object0: list0) {
                        zzmh zzmh0 = (zzmh)object0;
                        if(!sparseArray0.contains(zzmh0.zzc) || ((long)(((Long)sparseArray0.get(zzmh0.zzc)))) < zzmh0.zzb) {
                            this.zzao().add(zzmh0);
                        }
                    }
                    this.zzan();
                }
            });
        }
    }

    // 检测为 Lambda 实现
    public final void zzam() [...]

    @TargetApi(30)
    final void zzan() {
        this.zzt();
        if(!this.zzao().isEmpty() && !this.zzh) {
            zzmh zzmh0 = (zzmh)this.zzao().poll();
            if(zzmh0 == null) {
                return;
            }
            c0.a a0 = this.zzq().zzn();
            if(a0 == null) {
                return;
            }
            this.zzh = true;
            this.zzj().zzp().zza("Registering trigger URI", zzmh0.zza);
            d d0 = a0.d(Uri.parse(zzmh0.zza));
            if(d0 == null) {
                this.zzh = false;
                this.zzao().add(zzmh0);
                return;
            }
            SparseArray sparseArray0 = this.zzk().zzg();
            sparseArray0.put(zzmh0.zzc, zzmh0.zzb);
            zzgd zzgd0 = this.zzk();
            int[] arr_v = new int[sparseArray0.size()];
            long[] arr_v1 = new long[sparseArray0.size()];
            for(int v = 0; v < sparseArray0.size(); ++v) {
                arr_v[v] = sparseArray0.keyAt(v);
                arr_v1[v] = (long)(((Long)sparseArray0.valueAt(v)));
            }
            Bundle bundle0 = new Bundle();
            bundle0.putIntArray("uriSources", arr_v);
            bundle0.putLongArray("uriTimestamps", arr_v1);
            zzgd0.zzi.zza(bundle0);
            zziz zziz0 = new zziz(this);
            b.a(d0, new zzjc(this, zzmh0), zziz0);
        }
    }

    @TargetApi(30)
    private final PriorityQueue zzao() {
        if(this.zzi == null) {
            this.zzi = com.google.android.gms.measurement.internal.b.a(zzix.zza((Object object0) -> ((zzmh)object0).zzb, (zzis this, Object object0) -> Long.compare(((long)(((Long)object0))), ((long)(((Long)object1))))));
        }
        return this.zzi;
    }

    private final void zzap() {
        this.zzt();
        String s = this.zzk().zzh.zza();
        if(s != null) {
            if("unset".equals(s)) {
                this.zza("app", "_npa", null, this.zzb().currentTimeMillis());
            }
            else {
                this.zza("app", "_npa", ((long)("true".equals(s) ? 1L : 0L)), this.zzb().currentTimeMillis());
            }
        }
        if(this.zzu.zzac() && this.zzm) {
            this.zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            this.zzaj();
            if(zzoh.zza() && this.zze().zza(zzbi.zzbn)) {
                this.zzp().zza.zza();
            }
            this.zzl().zzb(new zzje(this));
            return;
        }
        this.zzj().zzc().zza("Updating Scion state (FE)");
        this.zzo().zzag();
    }

    private final void zzb(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        Bundle bundle1 = zznd.zza(bundle0);
        this.zzl().zzb(new zzjg(this, s, s1, v, bundle1, z, z1, z2, s2));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    public final void zzb(Bundle bundle0) {
        this.zza(bundle0, this.zzb().currentTimeMillis());
    }

    public final void zzb(zzil zzil0) {
        this.zzu();
        Preconditions.checkNotNull(zzil0);
        if(!this.zzd.remove(zzil0)) {
            this.zzj().zzu().zza("OnEventListener had not been registered");
        }
    }

    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zza(s, s1, bundle0, true, true, this.zzb().currentTimeMillis());
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzb zzc() {
        return super.zzc();
    }

    final void zzc(String s, String s1, Bundle bundle0) {
        this.zzt();
        this.zza(s, s1, this.zzb().currentTimeMillis(), bundle0);
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

