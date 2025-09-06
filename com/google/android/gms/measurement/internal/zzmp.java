package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzfc.zzd;
import com.google.android.gms.internal.measurement.zzfi.zze;
import com.google.android.gms.internal.measurement.zzfi.zzg;
import com.google.android.gms.internal.measurement.zzfi.zzi;
import com.google.android.gms.internal.measurement.zzfi.zzj;
import com.google.android.gms.internal.measurement.zzfi.zzn;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzon;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzmp implements zzif {
    final class zza implements zzas {
        zzj zza;
        List zzb;
        List zzc;
        private long zzd;
        private final zzmp zze;

        private zza() {
        }

        zza(zzmx zzmx0) {
        }

        private static long zza(zze zzfi$zze0) {
            return zzfi$zze0.zzd() / 1000L / 60L / 60L;
        }

        @Override  // com.google.android.gms.measurement.internal.zzas
        public final void zza(zzj zzfi$zzj0) {
            Preconditions.checkNotNull(zzfi$zzj0);
            this.zza = zzfi$zzj0;
        }

        @Override  // com.google.android.gms.measurement.internal.zzas
        public final boolean zza(long v, zze zzfi$zze0) {
            Preconditions.checkNotNull(zzfi$zze0);
            if(this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if(this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if(!this.zzc.isEmpty() && zza.zza(((zze)this.zzc.get(0))) != zza.zza(zzfi$zze0)) {
                return false;
            }
            long v1 = this.zzd + ((long)zzfi$zze0.zzbw());
            zzmp.this.zze();
            if(v1 >= ((long)Math.max(0, ((int)(((Integer)zzbi.zzi.zza(null))))))) {
                return false;
            }
            this.zzd = v1;
            this.zzc.add(zzfi$zze0);
            this.zzb.add(v);
            int v2 = this.zzc.size();
            zzmp.this.zze();
            return v2 < Math.max(1, ((int)(((Integer)zzbi.zzj.zza(null)))));
        }
    }

    final class zzb {
        final String zza;
        long zzb;

        private zzb() {
            this(zzmp0.zzq().zzp());
        }

        zzb(zzmy zzmy0) {
        }

        private zzb(String s) {
            this.zza = s;
            this.zzb = zzmp0.zzb().elapsedRealtime();
        }

        zzb(String s, zzmy zzmy0) {
            this(s);
        }
    }

    private static volatile zzmp zza;
    private List zzaa;
    private long zzab;
    private final Map zzac;
    private final Map zzad;
    private final Map zzae;
    private zzki zzaf;
    private String zzag;
    private final zznf zzah;
    private zzgp zzb;
    private zzfy zzc;
    private zzao zzd;
    private zzgb zze;
    private zzmj zzf;
    private zzt zzg;
    private final zzmz zzh;
    private zzkg zzi;
    private zzls zzj;
    private final zzmn zzk;
    private zzgm zzl;
    private final zzhf zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;
    private List zzq;
    private final Set zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;

    private zzmp(zzna zzna0) {
        this(zzna0, null);
    }

    private zzmp(zzna zzna0, zzhf zzhf0) {
        this.zzn = false;
        this.zzr = new HashSet();
        this.zzah = new zzmw(this);
        Preconditions.checkNotNull(zzna0);
        this.zzm = zzhf.zza(zzna0.zza, null, null);
        this.zzab = -1L;
        this.zzk = new zzmn(this);
        zzmz zzmz0 = new zzmz(this);
        zzmz0.zzal();
        this.zzh = zzmz0;
        zzfy zzfy0 = new zzfy(this);
        zzfy0.zzal();
        this.zzc = zzfy0;
        zzgp zzgp0 = new zzgp(this);
        zzgp0.zzal();
        this.zzb = zzgp0;
        this.zzac = new HashMap();
        this.zzad = new HashMap();
        this.zzae = new HashMap();
        this.zzl().zzb(new zzms(this, zzna0));
    }

    private final int zza(FileChannel fileChannel0) {
        this.zzl().zzt();
        if(fileChannel0 != null && fileChannel0.isOpen()) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            try {
                fileChannel0.position(0L);
                int v = fileChannel0.read(byteBuffer0);
                switch(v) {
                    case -1: {
                        return 0;
                    }
                    case 4: {
                        byteBuffer0.flip();
                        return byteBuffer0.getInt();
                    }
                    default: {
                        this.zzj().zzu().zza("Unexpected data length. Bytes read", v);
                        return 0;
                    }
                }
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to read from channel", iOException0);
            return 0;
        }
        this.zzj().zzg().zza("Bad channel to read from");
        return 0;
    }

    private final zzay zza(String s, zzay zzay0, zzih zzih0, zzak zzak0) {
        int v = 90;
        if(zznp.zza()) {
            if(this.zzi().zzb(s) == null) {
                if(zzay0.zzc() == Boolean.FALSE) {
                    v = zzay0.zza();
                    zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzc, v);
                    return new zzay(Boolean.FALSE, v, Boolean.TRUE, "-");
                }
                zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzc, zzaj.zzh);
                return new zzay(Boolean.FALSE, 90, Boolean.TRUE, "-");
            }
            Boolean boolean0 = zzay0.zzc();
            if(boolean0 == null) {
                com.google.android.gms.measurement.internal.zzih.zza zzih$zza0 = com.google.android.gms.measurement.internal.zzih.zza.zzc;
                if(this.zzb.zza(s, zzih$zza0) == com.google.android.gms.measurement.internal.zzih.zza.zza && zzih0.zzc() != null) {
                    boolean0 = zzih0.zzc();
                    zzak0.zza(zzih$zza0, zzaj.zzc);
                }
                if(boolean0 == null) {
                    boolean0 = Boolean.valueOf(this.zzb.zzb(s, zzih$zza0));
                    zzak0.zza(zzih$zza0, zzaj.zzb);
                }
            }
            else {
                v = zzay0.zza();
                zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzc, v);
            }
            Preconditions.checkNotNull(boolean0);
            boolean z = this.zzb.zzn(s);
            SortedSet sortedSet0 = this.zzi().zzh(s);
            if(boolean0.booleanValue() && !sortedSet0.isEmpty()) {
                String s1 = z ? TextUtils.join("", sortedSet0) : "";
                return new zzay(Boolean.TRUE, v, Boolean.valueOf(z), s1);
            }
            return new zzay(Boolean.FALSE, v, Boolean.valueOf(z), "-");
        }
        return zzay.zza;
    }

    private static zzmo zza(zzmo zzmo0) {
        if(zzmo0 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if(!zzmo0.zzam()) {
            throw new IllegalStateException("Component not initialized: " + zzmo0.getClass());
        }
        return zzmo0;
    }

    public static zzmp zza(Context context0) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzmp.zza == null) {
            synchronized(zzmp.class) {
                if(zzmp.zza == null) {
                    zzmp.zza = new zzmp(((zzna)Preconditions.checkNotNull(new zzna(context0))));
                }
            }
        }
        return zzmp.zza;
    }

    private final Boolean zza(zzh zzh0) {
        try {
            if(Long.compare(zzh0.zzc(), 0xFFFFFFFF80000000L) != 0) {
                int v = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzh0.zzx(), 0).versionCode;
                return zzh0.zzc() == ((long)v);
            }
            String s = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzh0.zzx(), 0).versionName;
            String s1 = zzh0.zzaa();
            return s1 == null || !s1.equals(s) ? false : true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    private final String zza(zzih zzih0) {
        if(zzih0.zzh()) {
            byte[] arr_b = new byte[16];
            this.zzq().zzv().nextBytes(arr_b);
            return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        return null;
    }

    private static void zza(com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0, int v, String s) {
        List list0 = zzfi$zze$zza0.zzf();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
        }
        zzg zzfi$zzg0 = (zzg)(((zzix)zzg.zze().zza("_err").zza(((long)v)).zzab()));
        zzg zzfi$zzg1 = (zzg)(((zzix)zzg.zze().zza("_ev").zzb(s).zzab()));
        zzfi$zze$zza0.zza(zzfi$zzg0).zza(zzfi$zzg1);
    }

    private static void zza(com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0, String s) {
        List list0 = zzfi$zze$zza0.zzf();
        for(int v = 0; v < list0.size(); ++v) {
            if(s.equals("")) {
                zzfi$zze$zza0.zza(v);
                return;
            }
        }
    }

    private final void zza(com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0, long v, boolean z) {
        String s = z ? "_se" : "_lte";
        zzne zzne0 = this.zzf().zze("", s);
        zzne zzne1 = zzne0 == null || zzne0.zze == null ? new zzne("", "auto", s, this.zzb().currentTimeMillis(), v) : new zzne("", "auto", s, this.zzb().currentTimeMillis(), ((long)(((long)(((Long)zzne0.zze))) + v)));
        zzn zzfi$zzn0 = (zzn)(((zzix)zzn.zze().zza(s).zzb(this.zzb().currentTimeMillis()).zza(((long)(((Long)zzne1.zze)))).zzab()));
        int v1 = zzmz.zza(zzfi$zzj$zza0, s);
        if(v1 >= 0) {
            zzfi$zzj$zza0.zza(v1, zzfi$zzn0);
        }
        else {
            zzfi$zzj$zza0.zza(zzfi$zzn0);
        }
        if(v > 0L) {
            this.zzf().zza(zzne1);
            this.zzj().zzp().zza("Updated engagement user property. scope, value", (z ? "session-scoped" : "lifetime"), zzne1.zze);
        }
    }

    static void zza(zzmp zzmp0, zzna zzna0) {
        zzmp0.zzl().zzt();
        zzmp0.zzl = new zzgm(zzmp0);
        zzao zzao0 = new zzao(zzmp0);
        zzao0.zzal();
        zzmp0.zzd = zzao0;
        zzmp0.zze().zza(((zzah)Preconditions.checkNotNull(zzmp0.zzb)));
        zzls zzls0 = new zzls(zzmp0);
        zzls0.zzal();
        zzmp0.zzj = zzls0;
        zzt zzt0 = new zzt(zzmp0);
        zzt0.zzal();
        zzmp0.zzg = zzt0;
        zzkg zzkg0 = new zzkg(zzmp0);
        zzkg0.zzal();
        zzmp0.zzi = zzkg0;
        zzmj zzmj0 = new zzmj(zzmp0);
        zzmj0.zzal();
        zzmp0.zzf = zzmj0;
        zzmp0.zze = new zzgb(zzmp0);
        if(zzmp0.zzs != zzmp0.zzt) {
            zzmp0.zzj().zzg().zza("Not all upload components initialized", zzmp0.zzs, zzmp0.zzt);
        }
        zzmp0.zzn = true;
    }

    private final void zza(String s, boolean z) {
        zzh zzh0 = this.zzf().zzd(s);
        if(zzh0 != null) {
            zzh0.zzd(z);
            if(zzh0.zzal()) {
                this.zzf().zza(zzh0);
            }
        }
    }

    private final void zza(List list0) {
        Preconditions.checkArgument(!list0.isEmpty());
        if(this.zzz != null) {
            this.zzj().zzg().zza("Set uploading progress before finishing the previous upload");
            return;
        }
        this.zzz = new ArrayList(list0);
    }

    private final boolean zza(int v, FileChannel fileChannel0) {
        this.zzl().zzt();
        if(fileChannel0 != null && fileChannel0.isOpen()) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            byteBuffer0.putInt(v);
            byteBuffer0.flip();
            try {
                fileChannel0.truncate(0L);
                fileChannel0.write(byteBuffer0);
                fileChannel0.force(true);
                if(fileChannel0.size() != 4L) {
                    this.zzj().zzg().zza("Error writing to channel. Bytes written", fileChannel0.size());
                    return true;
                }
                return true;
            }
            catch(IOException iOException0) {
                this.zzj().zzg().zza("Failed to write to channel", iOException0);
                return false;
            }
        }
        this.zzj().zzg().zza("Bad channel to read from");
        return false;
    }

    private final boolean zza(com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0, com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza1) {
        Preconditions.checkArgument(false);
        this.zzp();
        String s = null;
        String s1 = zzmz.zza(((zze)(((zzix)zzfi$zze$zza0.zzab()))), "_sc") == null ? null : "";
        this.zzp();
        if(zzmz.zza(((zze)(((zzix)zzfi$zze$zza1.zzab()))), "_pc") != null) {
            s = "";
        }
        if(s != null && s.equals(s1)) {
            Preconditions.checkArgument(false);
            this.zzp();
            zzg zzfi$zzg0 = zzmz.zza(((zze)(((zzix)zzfi$zze$zza0.zzab()))), "_et");
            if(zzfi$zzg0 != null && zzfi$zzg0.zzl() && zzfi$zzg0.zzd() > 0L) {
                long v = zzfi$zzg0.zzd();
                this.zzp();
                zzg zzfi$zzg1 = zzmz.zza(((zze)(((zzix)zzfi$zze$zza1.zzab()))), "_et");
                if(zzfi$zzg1 != null && zzfi$zzg1.zzd() > 0L) {
                    v += zzfi$zzg1.zzd();
                }
                this.zzp();
                zzmz.zza(zzfi$zze$zza1, "_et", v);
                this.zzp();
                zzmz.zza(zzfi$zze$zza0, "_fr", 1L);
            }
            return true;
        }
        return false;
    }

    private final boolean zza(String s, long v) {
        SQLiteException sQLiteException4;
        zza zzmp$zza2;
        HashMap hashMap2;
        long v23;
        HashMap hashMap1;
        int v22;
        SecureRandom secureRandom1;
        zza zzmp$zza1;
        long v21;
        com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza5;
        com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza2;
        com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza1;
        int v8;
        com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza4;
        boolean z1;
        com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0;
        String s6;
        String[] arr_s2;
        Cursor cursor3;
        zzj zzfi$zzj0;
        Throwable throwable3;
        Cursor cursor2;
        String s4;
        Cursor cursor1;
        String s2;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        String s1;
        this.zzf().zzp();
        try {
            zza zzmp$zza0 = new zza(this, null);
            zzao zzao0 = this.zzf();
            long v2 = this.zzab;
            Preconditions.checkNotNull(zzmp$zza0);
            zzao0.zzt();
            zzao0.zzak();
            try {
                s1 = "";
                sQLiteDatabase0 = zzao0.e_();
                if(TextUtils.isEmpty(null)) {
                    int v3 = Long.compare(v2, -1L);
                    String[] arr_s = v3 == 0 ? new String[]{String.valueOf(v)} : new String[]{String.valueOf(v2), String.valueOf(v)};
                    if(v3 != 0) {
                        s1 = "rowid <= ? and ";
                    }
                    cursor0 = sQLiteDatabase0.rawQuery("select app_id, metadata_fingerprint from raw_events where " + s1 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", arr_s);
                    goto label_16;
                }
                else {
                    goto label_24;
                }
                goto label_139;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_45;
            }
            catch(Throwable throwable0) {
                throwable3 = throwable0;
                cursor0 = null;
                goto label_132;
            }
            try {
                try {
                label_16:
                    if(cursor0.moveToFirst()) {
                        s2 = cursor0.getString(0);
                        goto label_18;
                    }
                    else {
                        goto label_96;
                    }
                    goto label_139;
                }
                catch(SQLiteException sQLiteException1) {
                    goto label_37;
                }
                try {
                label_18:
                    String s3 = cursor0.getString(1);
                    cursor0.close();
                    cursor1 = cursor0;
                    s4 = s3;
                }
                catch(SQLiteException sQLiteException2) {
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
            }
            catch(Throwable throwable1) {
                throwable3 = throwable1;
                goto label_132;
            }
            try {
                cursor2 = sQLiteDatabase0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{s2, s4}, null, null, "rowid", "2");
                goto label_58;
            }
            catch(SQLiteException sQLiteException3) {
                sQLiteException4 = sQLiteException3;
                cursor0 = cursor1;
                goto label_121;
            }
            catch(Throwable throwable2) {
                throwable3 = throwable2;
                cursor0 = cursor1;
                goto label_132;
            }
            try {
            label_24:
                int v4 = Long.compare(v2, -1L);
                String[] arr_s1 = v4 == 0 ? new String[]{0} : new String[]{0, String.valueOf(v2)};
                if(v4 != 0) {
                    s1 = " and rowid <= ?";
                }
                cursor0 = sQLiteDatabase0.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + s1 + " order by rowid limit 1;", arr_s1);
            }
            catch(SQLiteException sQLiteException0) {
                goto label_45;
            }
            catch(Throwable throwable0) {
                throwable3 = throwable0;
                cursor0 = null;
                goto label_132;
            }
            try {
                if(cursor0.moveToFirst()) {
                    String s5 = cursor0.getString(0);
                    cursor0.close();
                    cursor1 = cursor0;
                    s4 = s5;
                    s2 = null;
                    goto label_48;
                }
                else {
                    goto label_138;
                }
                goto label_139;
            }
            catch(SQLiteException sQLiteException1) {
            label_37:
                sQLiteException4 = sQLiteException1;
                try {
                    while(true) {
                        s2 = null;
                        goto label_121;
                    label_45:
                        sQLiteException4 = sQLiteException0;
                        cursor0 = null;
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_45;
                }
                catch(Throwable throwable0) {
                    throwable3 = throwable0;
                    cursor0 = null;
                    goto label_132;
                }
                try {
                label_48:
                    cursor2 = sQLiteDatabase0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{null, s4}, null, null, "rowid", "2");
                }
                catch(SQLiteException sQLiteException3) {
                    sQLiteException4 = sQLiteException3;
                    cursor0 = cursor1;
                    goto label_121;
                }
                catch(Throwable throwable2) {
                    throwable3 = throwable2;
                    cursor0 = cursor1;
                    goto label_132;
                }
                try {
                label_58:
                    if(cursor2.moveToFirst()) {
                        byte[] arr_b = cursor2.getBlob(0);
                        try {
                            zzfi$zzj0 = (zzj)(((zzix)((com.google.android.gms.internal.measurement.zzfi.zzj.zza)zzmz.zza(zzj.zzu(), arr_b)).zzab()));
                            goto label_67;
                        }
                        catch(IOException iOException0) {
                        }
                        goto label_63;
                    }
                    else {
                        goto label_116;
                    }
                    goto label_139;
                }
                catch(SQLiteException sQLiteException2) {
                    cursor3 = cursor2;
                    cursor0 = cursor3;
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
                catch(Throwable throwable4) {
                    cursor3 = cursor2;
                    throwable3 = throwable4;
                    cursor0 = cursor3;
                    goto label_132;
                }
                try {
                label_63:
                    cursor3 = cursor2;
                    zzao0.zzj().zzg().zza("Data loss. Failed to merge raw event metadata. appId", zzfr.zza(s2), iOException0);
                }
                catch(SQLiteException sQLiteException2) {
                    cursor0 = cursor3;
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
                catch(Throwable throwable4) {
                    throwable3 = throwable4;
                    cursor0 = cursor3;
                    goto label_132;
                }
                cursor3.close();
                goto label_139;
                try {
                label_67:
                    if(cursor2.moveToNext()) {
                        goto label_68;
                    }
                    goto label_69;
                }
                catch(SQLiteException sQLiteException2) {
                    cursor3 = cursor2;
                    cursor0 = cursor3;
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
                catch(Throwable throwable4) {
                    cursor3 = cursor2;
                    throwable3 = throwable4;
                    cursor0 = cursor3;
                    goto label_132;
                }
                try {
                label_68:
                    zzao0.zzj().zzu().zza("Get multiple raw event metadata records, expected one. appId", zzfr.zza(s2));
                }
                catch(SQLiteException sQLiteException5) {
                    goto label_119;
                }
                catch(Throwable throwable5) {
                    goto label_130;
                }
                try {
                label_69:
                    cursor2.close();
                    zzmp$zza0.zza(zzfi$zzj0);
                    if(v2 == -1L) {
                        arr_s2 = new String[]{s2, s4};
                        s6 = "app_id = ? and metadata_fingerprint = ?";
                    }
                    else {
                        arr_s2 = new String[]{s2, s4, String.valueOf(v2)};
                        s6 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    }
                }
                catch(SQLiteException sQLiteException2) {
                    cursor3 = cursor2;
                    cursor0 = cursor3;
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
                catch(Throwable throwable4) {
                    cursor3 = cursor2;
                    throwable3 = throwable4;
                    cursor0 = cursor3;
                    goto label_132;
                }
                try {
                    cursor3 = cursor2;
                    cursor0 = sQLiteDatabase0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, s6, arr_s2, null, null, "rowid", null);
                    goto label_94;
                }
                catch(SQLiteException sQLiteException2) {
                    cursor0 = cursor3;
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
                catch(Throwable throwable4) {
                }
                throwable3 = throwable4;
                cursor0 = cursor3;
                goto label_132;
                try {
                label_94:
                    if(cursor0.moveToFirst()) {
                        goto label_98;
                    }
                    else {
                        zzao0.zzj().zzu().zza("Raw event data disappeared while in transaction. appId", zzfr.zza(s2));
                        goto label_96;
                    }
                    goto label_139;
                }
                catch(SQLiteException sQLiteException2) {
                    sQLiteException4 = sQLiteException2;
                    goto label_121;
                }
                catch(Throwable throwable1) {
                    throwable3 = throwable1;
                    goto label_132;
                }
            label_96:
                cursor0.close();
                goto label_139;
                try {
                    do {
                    label_98:
                        long v5 = cursor0.getLong(0);
                        byte[] arr_b1 = cursor0.getBlob(3);
                        try {
                            zzfi$zze$zza0 = (com.google.android.gms.internal.measurement.zzfi.zze.zza)zzmz.zza(zze.zze(), arr_b1);
                        }
                        catch(IOException iOException1) {
                            zzao0.zzj().zzg().zza("Data loss. Failed to merge raw event. appId", zzfr.zza(s2), iOException1);
                            continue;
                        }
                        zzfi$zze$zza0.zza(cursor0.getString(1)).zzb(cursor0.getLong(2));
                        if(!zzmp$zza0.zza(v5, ((zze)(((zzix)zzfi$zze$zza0.zzab()))))) {
                            goto label_114;
                        }
                    }
                    while(cursor0.moveToNext());
                    goto label_112;
                }
                catch(SQLiteException sQLiteException2) {
                }
                catch(Throwable throwable1) {
                    throwable3 = throwable1;
                    goto label_132;
                }
                sQLiteException4 = sQLiteException2;
                goto label_121;
            label_112:
                cursor0.close();
                goto label_139;
            label_114:
                cursor0.close();
                goto label_139;
                try {
                label_116:
                    zzao0.zzj().zzg().zza("Raw event metadata record is missing. appId", zzfr.zza(s2));
                    goto label_136;
                }
                catch(SQLiteException sQLiteException5) {
                }
                catch(Throwable throwable5) {
                    goto label_130;
                }
            label_119:
                sQLiteException4 = sQLiteException5;
                cursor0 = cursor2;
                try {
                label_121:
                    zzao0.zzj().zzg().zza("Data loss. Error selecting raw event. appId", zzfr.zza(s2), sQLiteException4);
                    goto label_126;
                }
                catch(Throwable throwable1) {
                }
                throwable3 = throwable1;
                goto label_132;
            }
            catch(Throwable throwable1) {
                throwable3 = throwable1;
                goto label_132;
            }
        label_126:
            if(cursor0 != null) {
                cursor0.close();
                goto label_139;
            label_130:
                throwable3 = throwable5;
                cursor0 = cursor2;
            label_132:
                if(cursor0 != null) {
                    cursor0.close();
                }
                throw throwable3;
            label_136:
                cursor2.close();
                goto label_139;
            label_138:
                cursor0.close();
            }
        label_139:
            if(zzmp$zza0.zzc != null && !zzmp$zza0.zzc.isEmpty()) {
                com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0 = ((com.google.android.gms.internal.measurement.zzfi.zzj.zza)zzmp$zza0.zza.zzby()).zzi();
                boolean z = false;
                com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza2 = null;
                int v6 = 0;
                int v7 = 0;
                for(com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza1 = null; true; zzfi$zze$zza1 = zzfi$zze$zza4) {
                    z1 = z;
                    if(v6 >= zzmp$zza0.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza3 = (com.google.android.gms.internal.measurement.zzfi.zze.zza)((zze)zzmp$zza0.zzc.get(v6)).zzby();
                    if(this.zzi().zzd("", "")) {
                        this.zzj().zzu().zza("Dropping blocked raw event. appId", zzfr.zza(""), this.zzm.zzk().zza(""));
                        if(!this.zzi().zzm("") && !this.zzi().zzo("")) {
                            this.zzq();
                            zznd.zza(this.zzah, "", 11, "_ev", "", 0);
                        }
                        zzfi$zze$zza4 = zzfi$zze$zza1;
                        v8 = v6;
                        zzfi$zzj$zza1 = zzfi$zzj$zza0;
                    }
                    else {
                        boolean z2 = this.zzi().zzc("", "");
                        if(z2) {
                            zzfi$zze$zza4 = zzfi$zze$zza1;
                            int v9 = 0;
                            while(true) {
                                zzfi$zzj$zza2 = zzfi$zzj$zza0;
                                if(v9 >= zzfi$zze$zza3.zza()) {
                                    break;
                                }
                                ++v9;
                                zzfi$zzj$zza0 = zzfi$zzj$zza2;
                            }
                            zzfi$zze$zza5 = zzfi$zze$zza2;
                            this.zzj().zzp().zza("Marking event as conversion", this.zzm.zzk().zza(""));
                            zzfi$zze$zza3.zza(zzg.zze().zza("_c").zza(1L));
                            this.zzj().zzp().zza("Marking event as real-time", this.zzm.zzk().zza(""));
                            zzfi$zze$zza3.zza(zzg.zze().zza("_r").zza(1L));
                            if(this.zzf().zza(this.zzx(), "", false, false, false, false, true).zze > ((long)this.zze().zze(""))) {
                                zzmp.zza(zzfi$zze$zza3, "_r");
                            }
                            else {
                                z1 = true;
                            }
                            if(zznd.zzh("") && this.zzf().zza(this.zzx(), "", false, false, true, false, false).zzc > ((long)this.zze().zzb("", zzbi.zzn))) {
                                this.zzj().zzu().zza("Too many conversions. Not logging as conversion. appId", zzfr.zza(""));
                                for(int v10 = 0; v10 < zzfi$zze$zza3.zza(); ++v10) {
                                    zzfi$zze$zza3.zzb(v10);
                                }
                                this.zzj().zzg().zza("Did not find conversion parameter. appId", zzfr.zza(""));
                            }
                        }
                        else {
                            this.zzp();
                            Preconditions.checkNotEmpty("");
                            zzfi$zze$zza4 = zzfi$zze$zza1;
                            zzfi$zzj$zza2 = zzfi$zzj$zza0;
                            zzfi$zze$zza5 = zzfi$zze$zza2;
                        }
                        if(z2) {
                            ArrayList arrayList0 = new ArrayList(zzfi$zze$zza3.zzf());
                            for(int v11 = 0; v11 < arrayList0.size(); ++v11) {
                            }
                        }
                        zzfi$zzj$zza1 = zzfi$zzj$zza2;
                        v8 = v6;
                        zzmp$zza0.zzc.set(v8, ((zze)(((zzix)zzfi$zze$zza3.zzab()))));
                        ++v7;
                        zzfi$zzj$zza1.zza(zzfi$zze$zza3);
                        zzfi$zze$zza2 = zzfi$zze$zza5;
                    }
                    v6 = v8 + 1;
                    zzfi$zzj$zza0 = zzfi$zzj$zza1;
                    z = z1;
                }
                long v12 = 0L;
                for(int v13 = 0; v13 < v7; ++v13) {
                    zze zzfi$zze0 = zzfi$zzj$zza0.zza(v13);
                    this.zzp();
                    zzg zzfi$zzg0 = zzmz.zza(zzfi$zze0, "_et");
                    if(zzfi$zzg0 != null) {
                        Long long0 = zzfi$zzg0.zzl() ? zzfi$zzg0.zzd() : null;
                        if(long0 != null && ((long)long0) > 0L) {
                            v12 += (long)long0;
                        }
                    }
                }
                this.zza(zzfi$zzj$zza0, v12, false);
                Iterator iterator0 = zzfi$zzj$zza0.zzw().iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                }
                if(zzmz.zza(zzfi$zzj$zza0, "_sid") >= 0) {
                    this.zza(zzfi$zzj$zza0, v12, true);
                }
                else {
                    int v14 = zzmz.zza(zzfi$zzj$zza0, "_se");
                    if(v14 >= 0) {
                        zzfi$zzj$zza0.zzc(v14);
                        this.zzj().zzg().zza("Session engagement user property is in the bundle without session ID. appId", zzfr.zza(""));
                    }
                }
                this.zzp().zza(zzfi$zzj$zza0);
                if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
                    this.zzl().zzt();
                    this.zzs();
                    if(zznp.zza()) {
                        zzh zzh0 = this.zzf().zzd("");
                        if(zzh0 == null) {
                            this.zzj().zzg().zza("Cannot fix consent fields without appInfo. appId", zzfr.zza(""));
                        }
                        else {
                            this.zza(zzh0, zzfi$zzj$zza0);
                        }
                    }
                }
                zzfi$zzj$zza0.zzi(0x7FFFFFFFFFFFFFFFL).zze(0x8000000000000000L);
                for(int v15 = 0; v15 < zzfi$zzj$zza0.zza(); ++v15) {
                    zze zzfi$zze1 = zzfi$zzj$zza0.zza(v15);
                    if(zzfi$zze1.zzd() < zzfi$zzj$zza0.zzd()) {
                        zzfi$zzj$zza0.zzi(zzfi$zze1.zzd());
                    }
                    if(zzfi$zze1.zzd() > zzfi$zzj$zza0.zzc()) {
                        zzfi$zzj$zza0.zze(zzfi$zze1.zzd());
                    }
                }
                zzfi$zzj$zza0.zzq();
                if(zzpg.zza() && this.zze().zze("", zzbi.zzcf)) {
                    this.zzq();
                    if(zznd.zzd("") && this.zzb("").zzg() && zzmp$zza0.zza.zzar()) {
                        for(int v16 = 0; v16 < zzmp$zza0.zzc.size(); ++v16) {
                            Iterator iterator1 = ((com.google.android.gms.internal.measurement.zzfi.zze.zza)((zze)zzmp$zza0.zzc.get(v16)).zzby()).zzf().iterator();
                            while(iterator1.hasNext()) {
                                iterator1.next();
                            }
                        }
                    }
                }
                zzfi$zzj$zza0.zzf().zza(this.zzc().zza("", zzfi$zzj$zza0.zzw(), zzfi$zzj$zza0.zzx(), zzfi$zzj$zza0.zzd(), zzfi$zzj$zza0.zzc()));
                if(this.zze().zzl("")) {
                    HashMap hashMap0 = new HashMap();
                    ArrayList arrayList1 = new ArrayList();
                    SecureRandom secureRandom0 = this.zzq().zzv();
                    int v17 = 0;
                    while(v17 < zzfi$zzj$zza0.zza()) {
                        com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza6 = (com.google.android.gms.internal.measurement.zzfi.zze.zza)zzfi$zzj$zza0.zza(v17).zzby();
                        long v18 = this.zzi().zza("");
                        this.zzq();
                        long v19 = zznd.zza(zzfi$zze$zza6.zzc(), v18);
                        zze zzfi$zze2 = (zze)(((zzix)zzfi$zze$zza6.zzab()));
                        if(!TextUtils.isEmpty("_dbg")) {
                            for(Object object0: zzfi$zze2.zzh()) {
                                zzg zzfi$zzg1 = (zzg)object0;
                            }
                        }
                        int v20 = this.zzi().zzb("", "");
                        if(v20 <= 0) {
                            this.zzj().zzu().zza("Sample rate must be positive. event, rate", "", v20);
                            arrayList1.add(((zze)(((zzix)zzfi$zze$zza6.zzab()))));
                            zzfi$zzj$zza0.zza(v17, zzfi$zze$zza6);
                            goto label_306;
                        }
                        else {
                            zzbc zzbc0 = (zzbc)hashMap0.get("");
                            if(zzbc0 == null) {
                                v21 = v18;
                                zzbc zzbc1 = this.zzf().zzd("", "");
                                if(zzbc1 == null) {
                                    this.zzj().zzu().zza("Event being bundled has no eventAggregate. appId, eventName", "", "");
                                    zzbc0 = new zzbc("", "", 1L, 1L, 1L, zzfi$zze$zza6.zzc(), 0L, null, null, null, null);
                                }
                                else {
                                    zzbc0 = zzbc1;
                                }
                            }
                            else {
                                v21 = v18;
                            }
                            this.zzp();
                            Long long1 = (Long)zzmz.zzb(((zze)(((zzix)zzfi$zze$zza6.zzab()))), "_eid");
                            boolean z3 = long1 != null;
                            if(v20 == 1) {
                                arrayList1.add(((zze)(((zzix)zzfi$zze$zza6.zzab()))));
                                if(z3 && (zzbc0.zzi != null || zzbc0.zzj != null || zzbc0.zzk != null)) {
                                    hashMap0.put("", zzbc0.zza(null, null, null));
                                }
                                zzfi$zzj$zza0.zza(v17, zzfi$zze$zza6);
                            label_306:
                                zzmp$zza1 = zzmp$zza0;
                                secureRandom1 = secureRandom0;
                                v22 = v17;
                                hashMap1 = hashMap0;
                            }
                            else {
                                if(secureRandom0.nextInt(v20) == 0) {
                                    this.zzp();
                                    secureRandom1 = secureRandom0;
                                    zzmz.zza(zzfi$zze$zza6, "_sr", ((long)v20));
                                    arrayList1.add(((zze)(((zzix)zzfi$zze$zza6.zzab()))));
                                    if(z3) {
                                        zzbc0 = zzbc0.zza(null, ((long)v20), null);
                                    }
                                    hashMap0.put("", zzbc0.zza(zzfi$zze$zza6.zzc(), v19));
                                    hashMap1 = hashMap0;
                                    zzmp$zza1 = zzmp$zza0;
                                }
                                else {
                                    secureRandom1 = secureRandom0;
                                    Long long2 = zzbc0.zzh;
                                    if(long2 == null) {
                                        this.zzq();
                                        hashMap2 = hashMap0;
                                        zzmp$zza1 = zzmp$zza0;
                                        v23 = zznd.zza(zzfi$zze$zza6.zzb(), v21);
                                    }
                                    else {
                                        v23 = (long)long2;
                                        hashMap2 = hashMap0;
                                        zzmp$zza1 = zzmp$zza0;
                                    }
                                    if(v23 == v19) {
                                        hashMap1 = hashMap2;
                                        if(z3) {
                                            hashMap1.put("", zzbc0.zza(long1, null, null));
                                        }
                                    }
                                    else {
                                        this.zzp();
                                        zzmz.zza(zzfi$zze$zza6, "_efs", 1L);
                                        this.zzp();
                                        zzmz.zza(zzfi$zze$zza6, "_sr", ((long)v20));
                                        arrayList1.add(((zze)(((zzix)zzfi$zze$zza6.zzab()))));
                                        if(z3) {
                                            zzbc0 = zzbc0.zza(null, ((long)v20), Boolean.TRUE);
                                        }
                                        hashMap1 = hashMap2;
                                        hashMap1.put("", zzbc0.zza(zzfi$zze$zza6.zzc(), v19));
                                    }
                                }
                                v22 = v17;
                                zzfi$zzj$zza0.zza(v22, zzfi$zze$zza6);
                            }
                        }
                        hashMap0 = hashMap1;
                        secureRandom0 = secureRandom1;
                        zzmp$zza0 = zzmp$zza1;
                        v17 = v22 + 1;
                    }
                    if(arrayList1.size() < zzfi$zzj$zza0.zza()) {
                        zzfi$zzj$zza0.zzi().zzb(arrayList1);
                    }
                    for(Object object1: hashMap0.entrySet()) {
                        this.zzf().zza(((zzbc)((Map.Entry)object1).getValue()));
                    }
                }
                zzmp$zza2 = zzmp$zza0;
                zzh zzh1 = this.zzf().zzd("");
                if(zzh1 == null) {
                    this.zzj().zzg().zza("Bundling raw events w/o app info. appId", zzfr.zza(""));
                }
                else if(zzfi$zzj$zza0.zza() > 0) {
                    long v24 = zzh1.zzp();
                    if(v24 == 0L) {
                        zzfi$zzj$zza0.zzm();
                    }
                    else {
                        zzfi$zzj$zza0.zzg(v24);
                    }
                    long v25 = zzh1.zzr();
                    if(v25 != 0L) {
                        v24 = v25;
                    }
                    if(v24 == 0L) {
                        zzfi$zzj$zza0.zzn();
                    }
                    else {
                        zzfi$zzj$zza0.zzh(v24);
                    }
                    zzh1.zzai();
                    zzfi$zzj$zza0.zzf(((int)zzh1.zzq()));
                    zzh1.zzp(zzfi$zzj$zza0.zzd());
                    zzh1.zzn(zzfi$zzj$zza0.zzc());
                    String s7 = zzh1.zzw();
                    if(s7 == null) {
                        zzfi$zzj$zza0.zzj();
                    }
                    else {
                        zzfi$zzj$zza0.zzn(s7);
                    }
                    this.zzf().zza(zzh1);
                }
                if(zzfi$zzj$zza0.zza() > 0) {
                    zzd zzfc$zzd0 = this.zzi().zzc("");
                    if(zzfc$zzd0 == null || !zzfc$zzd0.zzs()) {
                        zzfi$zzj$zza0.zzb(-1L);
                    }
                    else {
                        zzfi$zzj$zza0.zzb(zzfc$zzd0.zzc());
                    }
                    this.zzf().zza(((zzj)(((zzix)zzfi$zzj$zza0.zzab()))), z1);
                }
                zzao zzao1 = this.zzf();
                List list0 = zzmp$zza2.zzb;
                Preconditions.checkNotNull(list0);
                zzao1.zzt();
                zzao1.zzak();
                StringBuilder stringBuilder0 = new StringBuilder("rowid in (");
                for(int v26 = 0; v26 < list0.size(); ++v26) {
                    if(v26 != 0) {
                        stringBuilder0.append(",");
                    }
                    stringBuilder0.append(((long)(((Long)list0.get(v26)))));
                }
                stringBuilder0.append(")");
                int v27 = zzao1.e_().delete("raw_events", stringBuilder0.toString(), null);
                if(v27 != list0.size()) {
                    zzao1.zzj().zzg().zza("Deleted fewer rows from raw events table than expected", v27, list0.size());
                }
                zzao zzao2 = this.zzf();
                SQLiteDatabase sQLiteDatabase1 = zzao2.e_();
                try {
                    sQLiteDatabase1.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{"", ""});
                }
                catch(SQLiteException sQLiteException6) {
                    zzao2.zzj().zzg().zza("Failed to remove unused event metadata. appId", zzfr.zza(""), sQLiteException6);
                }
                this.zzf().zzw();
                return true;
            }
            this.zzf().zzw();
            return false;
        }
        finally {
            this.zzf().zzu();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return this.zzm.zza();
    }

    final Bundle zza(String s) {
        boolean z;
        this.zzl().zzt();
        this.zzs();
        if(!zznp.zza() || this.zzi().zzb(s) == null) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        zzih zzih0 = this.zzb(s);
        bundle0.putAll(zzih0.zzb());
        bundle0.putAll(this.zza(s, this.zzd(s), zzih0, new zzak()).zzb());
        if(this.zzp().zzc(s)) {
            z = true;
        }
        else {
            zzne zzne0 = this.zzf().zze(s, "_npa");
            if(zzne0 != null) {
                z = zzne0.zze.equals(1L);
            }
            else if(this.zzb.zzb(s, com.google.android.gms.measurement.internal.zzih.zza.zzd)) {
                z = false;
            }
            else {
                z = true;
            }
        }
        bundle0.putString("ad_personalization", (z ? "denied" : "granted"));
        return bundle0;
    }

    final zzh zza(zzo zzo0) {
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        if(!zzo0.zzu.isEmpty()) {
            zzb zzmp$zzb0 = new zzb(this, zzo0.zzu, null);
            this.zzae.put(zzo0.zza, zzmp$zzb0);
        }
        zzh zzh0 = this.zzf().zzd(zzo0.zza);
        zzih zzih0 = this.zzb(zzo0.zza).zza(zzih.zza(zzo0.zzt));
        String s = zzih0.zzg() ? this.zzj.zza(zzo0.zza, zzo0.zzn) : "";
        if(zzh0 == null) {
            zzh0 = new zzh(this.zzm, zzo0.zza);
            if(zzih0.zzh()) {
                zzh0.zzb(this.zza(zzih0));
            }
            if(zzih0.zzg()) {
                zzh0.zzh(s);
            }
        }
        else if(zzih0.zzg() && s != null && !s.equals(zzh0.zzae())) {
            zzh0.zzh(s);
            if(zzo0.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzj.zza(zzo0.zza, zzih0).first)) {
                zzh0.zzb(this.zza(zzih0));
                if(this.zzf().zze(zzo0.zza, "_id") != null && this.zzf().zze(zzo0.zza, "_lair") == null) {
                    long v = this.zzb().currentTimeMillis();
                    zzne zzne0 = new zzne(zzo0.zza, "auto", "_lair", v, 1L);
                    this.zzf().zza(zzne0);
                }
            }
        }
        else if(TextUtils.isEmpty(zzh0.zzy()) && zzih0.zzh()) {
            zzh0.zzb(this.zza(zzih0));
        }
        zzh0.zzf(zzo0.zzb);
        zzh0.zza(zzo0.zzp);
        if(!TextUtils.isEmpty(zzo0.zzk)) {
            zzh0.zze(zzo0.zzk);
        }
        long v1 = zzo0.zze;
        if(v1 != 0L) {
            zzh0.zzm(v1);
        }
        if(!TextUtils.isEmpty(zzo0.zzc)) {
            zzh0.zzd(zzo0.zzc);
        }
        zzh0.zza(zzo0.zzj);
        String s1 = zzo0.zzd;
        if(s1 != null) {
            zzh0.zzc(s1);
        }
        zzh0.zzj(zzo0.zzf);
        zzh0.zzb(zzo0.zzh);
        if(!TextUtils.isEmpty(zzo0.zzg)) {
            zzh0.zzg(zzo0.zzg);
        }
        zzh0.zza(zzo0.zzn);
        zzh0.zza(zzo0.zzq);
        zzh0.zzk(zzo0.zzr);
        if(zzps.zza() && (this.zze().zza(zzbi.zzbr) || this.zze().zze(zzo0.zza, zzbi.zzbt))) {
            zzh0.zzi(zzo0.zzv);
        }
        if(zznq.zza() && this.zze().zza(zzbi.zzbq)) {
            zzh0.zza(zzo0.zzs);
        }
        else if(zznq.zza() && this.zze().zza(zzbi.zzbp)) {
            zzh0.zza(null);
        }
        if(zzqd.zza() && this.zze().zza(zzbi.zzbu)) {
            zzh0.zzc(zzo0.zzw);
        }
        if(zzpg.zza() && this.zze().zza(zzbi.zzcf)) {
            zzh0.zza(zzo0.zzaa);
        }
        zzh0.zzr(zzo0.zzx);
        if(zzh0.zzal()) {
            this.zzf().zza(zzh0);
        }
        return zzh0;
    }

    final void zza(zzad zzad0) {
        zzo zzo0 = this.zzc(((String)Preconditions.checkNotNull(zzad0.zza)));
        if(zzo0 != null) {
            this.zza(zzad0, zzo0);
        }
    }

    final void zza(zzad zzad0, zzo zzo0) {
        Preconditions.checkNotNull(zzad0);
        Preconditions.checkNotEmpty(zzad0.zza);
        Preconditions.checkNotNull(zzad0.zzc);
        Preconditions.checkNotEmpty(zzad0.zzc.zza);
        this.zzl().zzt();
        this.zzs();
        if(!zzmp.zze(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        this.zzf().zzp();
        try {
            this.zza(zzo0);
            Object object0 = Preconditions.checkNotNull(zzad0.zza);
            zzad zzad1 = this.zzf().zzc(((String)object0), zzad0.zzc.zza);
            if(zzad1 == null) {
                this.zzj().zzu().zza("Conditional user property doesn\'t exist", zzfr.zza(zzad0.zza), this.zzm.zzk().zzc(zzad0.zzc.zza));
            }
            else {
                this.zzj().zzc().zza("Removing conditional user property", zzad0.zza, this.zzm.zzk().zzc(zzad0.zzc.zza));
                this.zzf().zza(((String)object0), zzad0.zzc.zza);
                if(zzad1.zze) {
                    this.zzf().zzh(((String)object0), zzad0.zzc.zza);
                }
                zzbg zzbg0 = zzad0.zzk;
                if(zzbg0 != null) {
                    Bundle bundle0 = zzbg0.zzb == null ? null : zzbg0.zzb.zzb();
                    this.zzc(((zzbg)Preconditions.checkNotNull(this.zzq().zza(((String)object0), ((zzbg)Preconditions.checkNotNull(zzad0.zzk)).zza, bundle0, zzad1.zzb, zzad0.zzk.zzd, true, true))), zzo0);
                }
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    final void zza(zzbg zzbg0, zzo zzo0) {
        List list3;
        List list2;
        List list1;
        zzbg zzbg2;
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        this.zzl().zzt();
        this.zzs();
        String s = zzo0.zza;
        long v = zzbg0.zzd;
        zzfv zzfv0 = zzfv.zza(zzbg0);
        this.zzl().zzt();
        zznd.zza((this.zzaf == null || (this.zzag == null || !this.zzag.equals(s)) ? null : this.zzaf), zzfv0.zzb, false);
        zzbg zzbg1 = zzfv0.zza();
        this.zzp();
        if(!zzmz.zza(zzbg1, zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        List list0 = zzo0.zzs;
        if(list0 == null) {
            zzbg2 = zzbg1;
        }
        else {
            if(list0.contains(zzbg1.zza)) {
                Bundle bundle0 = zzbg1.zzb.zzb();
                bundle0.putLong("ga_safelisted", 1L);
                zzbb zzbb0 = new zzbb(bundle0);
                zzbg2 = new zzbg(zzbg1.zza, zzbb0, zzbg1.zzc, zzbg1.zzd);
                goto label_27;
            }
            this.zzj().zzc().zza("Dropping non-safelisted event. appId, event name, origin", s, zzbg1.zza, zzbg1.zzc);
            return;
        }
    label_27:
        this.zzf().zzp();
        try {
            zzao zzao0 = this.zzf();
            Preconditions.checkNotEmpty(s);
            zzao0.zzt();
            zzao0.zzak();
            int v2 = Long.compare(v, 0L);
            if(v2 < 0) {
                zzao0.zzj().zzu().zza("Invalid time querying timed out conditional properties", zzfr.zza(s), v);
                list1 = Collections.emptyList();
            }
            else {
                list1 = zzao0.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{s, String.valueOf(v)});
            }
            for(Object object0: list1) {
                zzad zzad0 = (zzad)object0;
                if(zzad0 != null) {
                    this.zzj().zzp().zza("User property timed out", zzad0.zza, this.zzm.zzk().zzc(zzad0.zzc.zza), zzad0.zzc.zza());
                    if(zzad0.zzg != null) {
                        this.zzc(new zzbg(zzad0.zzg, v), zzo0);
                    }
                    this.zzf().zza(s, zzad0.zzc.zza);
                }
            }
            zzao zzao1 = this.zzf();
            Preconditions.checkNotEmpty(s);
            zzao1.zzt();
            zzao1.zzak();
            if(v2 < 0) {
                zzao1.zzj().zzu().zza("Invalid time querying expired conditional properties", zzfr.zza(s), v);
                list2 = Collections.emptyList();
            }
            else {
                list2 = zzao1.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{s, String.valueOf(v)});
            }
            ArrayList arrayList0 = new ArrayList(list2.size());
            for(Object object1: list2) {
                zzad zzad1 = (zzad)object1;
                if(zzad1 != null) {
                    this.zzj().zzp().zza("User property expired", zzad1.zza, this.zzm.zzk().zzc(zzad1.zzc.zza), zzad1.zzc.zza());
                    this.zzf().zzh(s, zzad1.zzc.zza);
                    zzbg zzbg3 = zzad1.zzk;
                    if(zzbg3 != null) {
                        arrayList0.add(zzbg3);
                    }
                    this.zzf().zza(s, zzad1.zzc.zza);
                }
            }
            int v3 = arrayList0.size();
            int v4 = 0;
            while(v4 < v3) {
                Object object2 = arrayList0.get(v4);
                ++v4;
                this.zzc(new zzbg(((zzbg)object2), v), zzo0);
            }
            zzao zzao2 = this.zzf();
            String s1 = zzbg2.zza;
            Preconditions.checkNotEmpty(s);
            Preconditions.checkNotEmpty(s1);
            zzao2.zzt();
            zzao2.zzak();
            if(v2 < 0) {
                zzao2.zzj().zzu().zza("Invalid time querying triggered conditional properties", zzfr.zza(s), zzao2.zzi().zza(s1), v);
                list3 = Collections.emptyList();
            }
            else {
                list3 = zzao2.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{s, s1, String.valueOf(v)});
            }
            ArrayList arrayList1 = new ArrayList(list3.size());
            for(Object object3: list3) {
                zzad zzad2 = (zzad)object3;
                if(zzad2 != null) {
                    zznc zznc0 = zzad2.zzc;
                    String s2 = (String)Preconditions.checkNotNull(zzad2.zza);
                    String s3 = zzad2.zzb;
                    Object object4 = Preconditions.checkNotNull(zznc0.zza());
                    zzne zzne0 = new zzne(s2, s3, zznc0.zza, v, object4);
                    if(this.zzf().zza(zzne0)) {
                        this.zzj().zzp().zza("User property triggered", zzad2.zza, this.zzm.zzk().zzc(zzne0.zzc), zzne0.zze);
                    }
                    else {
                        this.zzj().zzg().zza("Too many active user properties, ignoring", zzfr.zza(zzad2.zza), this.zzm.zzk().zzc(zzne0.zzc), zzne0.zze);
                    }
                    zzbg zzbg4 = zzad2.zzi;
                    if(zzbg4 != null) {
                        arrayList1.add(zzbg4);
                    }
                    zzad2.zzc = new zznc(zzne0);
                    zzad2.zze = true;
                    this.zzf().zza(zzad2);
                }
            }
            this.zzc(zzbg2, zzo0);
            int v5 = arrayList1.size();
            int v6 = 0;
            while(v6 < v5) {
                Object object5 = arrayList1.get(v6);
                ++v6;
                this.zzc(new zzbg(((zzbg)object5), v), zzo0);
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    final void zza(zzbg zzbg0, String s) {
        int v;
        String s1;
        zzh zzh0 = this.zzf().zzd(s);
        if(zzh0 != null && !TextUtils.isEmpty(zzh0.zzaa())) {
            Boolean boolean0 = this.zza(zzh0);
            if(boolean0 != null) {
                if(!boolean0.booleanValue()) {
                    this.zzj().zzg().zza("App version does not match; dropping event. appId", zzfr.zza(s));
                    return;
                }
            }
            else if(!"_ui".equals(zzbg0.zza)) {
                this.zzj().zzu().zza("Could not find package. appId", zzfr.zza(s));
            }
            zzih zzih0 = this.zzb(s);
            if(!zznp.zza() || !this.zze().zza(zzbi.zzcm)) {
                s1 = "";
                v = 100;
            }
            else {
                s1 = this.zzd(s).zzf();
                v = zzih0.zza();
            }
            this.zzb(zzbg0, new zzo(s, zzh0.zzac(), zzh0.zzaa(), zzh0.zzc(), zzh0.zzz(), zzh0.zzo(), zzh0.zzl(), null, zzh0.zzak(), false, zzh0.zzab(), zzh0.zzb(), 0L, 0, zzh0.zzaj(), false, zzh0.zzv(), zzh0.zzu(), zzh0.zzm(), zzh0.zzag(), null, zzih0.zze(), "", null, zzh0.zzam(), zzh0.zzt(), v, s1, zzh0.zza(), zzh0.zzd()));
            return;
        }
        this.zzj().zzc().zza("No app data available; dropping event", s);
    }

    final void zza(zzh zzh0, com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0) {
        int v;
        this.zzl().zzt();
        this.zzs();
        if(zznp.zza()) {
            zzak zzak0 = zzak.zza("");
            String s = zzh0.zzx();
            this.zzl().zzt();
            this.zzs();
            if(zznp.zza()) {
                zzih zzih0 = this.zzb(s);
                if(zznp.zza() && this.zze().zza(zzbi.zzco)) {
                    zzfi$zzj$zza0.zzg(zzih0.zzf());
                }
                if(zzih0.zzc() == null) {
                    zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zza, zzaj.zzh);
                }
                else {
                    zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zza, zzih0.zza());
                }
                if(zzih0.zzd() == null) {
                    zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzb, zzaj.zzh);
                }
                else {
                    zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzb, zzih0.zza());
                }
            }
            String s1 = zzh0.zzx();
            this.zzl().zzt();
            this.zzs();
            if(zznp.zza()) {
                zzay zzay0 = this.zza(s1, this.zzd(s1), this.zzb(s1), zzak0);
                zzfi$zzj$zza0.zzb(((Boolean)Preconditions.checkNotNull(zzay0.zzd())).booleanValue());
                if(!TextUtils.isEmpty(zzay0.zze())) {
                    zzfi$zzj$zza0.zzh(zzay0.zze());
                }
            }
            this.zzl().zzt();
            this.zzs();
            if(zznp.zza()) {
                Iterator iterator0 = zzfi$zzj$zza0.zzx().iterator();
                while(true) {
                    v = 1;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    zzn zzfi$zzn0 = (zzn)object0;
                }
                if(zznp.zza() && this.zze().zza(zzbi.zzcp)) {
                    if(this.zzb.zzb(zzh0.zzx()) == null) {
                        zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzd, zzaj.zzh);
                    }
                    else {
                        v = true ^ this.zzb.zzb(zzh0.zzx(), com.google.android.gms.measurement.internal.zzih.zza.zzd);
                        zzak0.zza(com.google.android.gms.measurement.internal.zzih.zza.zzd, zzaj.zzb);
                    }
                    zzfi$zzj$zza0.zza(((zzn)(((zzix)zzn.zze().zza("_npa").zzb(this.zzb().currentTimeMillis()).zza(((long)v)).zzab()))));
                }
            }
            zzfi$zzj$zza0.zzf(zzak0.toString());
        }
    }

    final void zza(zznc zznc0, zzo zzo0) {
        long v4;
        this.zzl().zzt();
        this.zzs();
        if(!zzmp.zze(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        int v = this.zzq().zzb(zznc0.zza);
        int v1 = 0;
        if(v != 0) {
            this.zzq();
            this.zze();
            String s = zznd.zza(zznc0.zza, 24, true);
            this.zzq();
            zznd.zza(this.zzah, zzo0.zza, v, "_ev", s, (zznc0.zza == null ? 0 : zznc0.zza.length()));
            return;
        }
        zznd zznd0 = this.zzq();
        Object object0 = zznc0.zza();
        int v2 = zznd0.zza(zznc0.zza, object0);
        if(v2 != 0) {
            this.zzq();
            this.zze();
            String s1 = zznd.zza(zznc0.zza, 24, true);
            Object object1 = zznc0.zza();
            if(object1 != null && (object1 instanceof String || object1 instanceof CharSequence)) {
                v1 = String.valueOf(object1).length();
            }
            this.zzq();
            zznd.zza(this.zzah, zzo0.zza, v2, "_ev", s1, v1);
            return;
        }
        zznd zznd1 = this.zzq();
        Object object2 = zznc0.zza();
        Object object3 = zznd1.zzc(zznc0.zza, object2);
        if(object3 == null) {
            return;
        }
        if("_sid".equals(zznc0.zza)) {
            long v3 = zznc0.zzb;
            String s2 = zznc0.zze;
            String s3 = (String)Preconditions.checkNotNull(zzo0.zza);
            zzne zzne0 = this.zzf().zze(s3, "_sno");
            if(zzne0 == null) {
            label_44:
                if(zzne0 != null) {
                    this.zzj().zzu().zza("Retrieved last session number from database does not contain a valid (long) value", zzne0.zze);
                }
                zzbc zzbc0 = this.zzf().zzd(s3, "_s");
                if(zzbc0 == null) {
                    v4 = 0L;
                }
                else {
                    v4 = zzbc0.zzc;
                    this.zzj().zzp().zza("Backfill the session number. Last used session number", v4);
                }
            }
            else {
                Object object4 = zzne0.zze;
                if(object4 instanceof Long) {
                    v4 = (long)(((Long)object4));
                    goto label_52;
                }
                goto label_44;
            }
        label_52:
            this.zza(new zznc("_sno", v3, ((long)(v4 + 1L)), s2), zzo0);
        }
        zzne zzne1 = new zzne(((String)Preconditions.checkNotNull(zzo0.zza)), ((String)Preconditions.checkNotNull(zznc0.zze)), zznc0.zza, zznc0.zzb, object3);
        this.zzj().zzp().zza("Setting user property", this.zzm.zzk().zzc(zzne1.zzc), object3);
        this.zzf().zzp();
        try {
            if("_id".equals(zzne1.zzc)) {
                zzne zzne2 = this.zzf().zze(zzo0.zza, "_id");
                if(zzne2 != null && !zzne1.zze.equals(zzne2.zze)) {
                    this.zzf().zzh(zzo0.zza, "_lair");
                }
            }
            this.zza(zzo0);
            boolean z = this.zzf().zza(zzne1);
            if("_sid".equals(zznc0.zza)) {
                long v6 = this.zzp().zza(zzo0.zzv);
                zzh zzh0 = this.zzf().zzd(zzo0.zza);
                if(zzh0 != null) {
                    zzh0.zzq(v6);
                    if(zzh0.zzal()) {
                        this.zzf().zza(zzh0);
                    }
                }
            }
            this.zzf().zzw();
            if(!z) {
                this.zzj().zzg().zza("Too many unique user properties are set. Ignoring user property", this.zzm.zzk().zzc(zzne1.zzc), zzne1.zze);
                this.zzq();
                zznd.zza(this.zzah, zzo0.zza, 9, null, null, 0);
            }
        }
        finally {
            this.zzf().zzu();
        }
    }

    final void zza(Runnable runnable0) {
        this.zzl().zzt();
        if(this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable0);
    }

    final void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        zzh zzh0;
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotEmpty(s);
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            this.zzj().zzp().zza("onConfigFetched. Response size", ((int)arr_b.length));
            this.zzf().zzp();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        try {
            zzh0 = this.zzf().zzd(s);
            if(zzh0 == null) {
                goto label_45;
            }
            else if((v != 200 && (v != 204 && v != 304) || throwable0 != null) && v != 404) {
                zzh0.zzl(this.zzb().currentTimeMillis());
                this.zzf().zza(zzh0);
                this.zzj().zzp().zza("Fetching config failed. code, error", v, throwable0);
                this.zzi().zzi(s);
                this.zzj.zzd.zza(this.zzb().currentTimeMillis());
                if(v == 429 || v == 503) {
                    this.zzj.zzb.zza(this.zzb().currentTimeMillis());
                }
                this.zzab();
            }
            else {
                List list0 = map0 == null ? null : ((List)map0.get("Last-Modified"));
                String s1 = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
                List list1 = map0 == null ? null : ((List)map0.get("ETag"));
                String s2 = list1 == null || list1.isEmpty() ? null : ((String)list1.get(0));
                if(v == 304 || v == 404) {
                    goto label_29;
                }
                else if(!this.zzi().zza(s, arr_b, s1, s2)) {
                    goto label_25;
                }
                goto label_30;
            }
            goto label_46;
        }
        catch(Throwable throwable2) {
            goto label_49;
        }
        try {
        label_25:
            this.zzf().zzu();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        this.zzu = false;
        this.zzaa();
        return;
        try {
        label_29:
            if(this.zzi().zzc(s) == null && !this.zzi().zza(s, null, null, null)) {
                goto label_41;
            }
        label_30:
            zzh0.zzc(this.zzb().currentTimeMillis());
            this.zzf().zza(zzh0);
            if(v == 404) {
                this.zzj().zzv().zza("Config not found. Using empty config. appId", s);
            }
            else {
                this.zzj().zzp().zza("Successfully fetched config. Got network response. code, size", v, ((int)arr_b.length));
            }
            if(!this.zzh().zzu() || !this.zzac()) {
                this.zzab();
            }
            else {
                this.zzw();
            }
            goto label_46;
        }
        catch(Throwable throwable2) {
            goto label_49;
        }
        try {
        label_41:
            this.zzf().zzu();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        this.zzu = false;
        this.zzaa();
        return;
        try {
        label_45:
            this.zzj().zzu().zza("App does not exist in onConfigFetched. appId", zzfr.zza(s));
        label_46:
            this.zzf().zzw();
            goto label_51;
        }
        catch(Throwable throwable2) {
        }
        try {
        label_49:
            this.zzf().zzu();
            throw throwable2;
        label_51:
            this.zzf().zzu();
        }
        catch(Throwable throwable1) {
            this.zzu = false;
            this.zzaa();
            throw throwable1;
        }
        this.zzu = false;
        this.zzaa();
    }

    final void zza(String s, com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0) {
        Set set0 = this.zzi().zzg(s);
        if(set0 != null) {
            zzfi$zzj$zza0.zzd(set0);
        }
        if(this.zzi().zzq(s)) {
            zzfi$zzj$zza0.zzg();
        }
        if(this.zzi().zzt(s) && !this.zze().zze(s, zzbi.zzbv)) {
            zzfi$zzj$zza0.zzl();
        }
        if(this.zzi().zzu(s)) {
            int v = zzmz.zza(zzfi$zzj$zza0, "_id");
            if(v != -1) {
                zzfi$zzj$zza0.zzc(v);
            }
        }
        if(this.zzi().zzs(s)) {
            zzfi$zzj$zza0.zzh();
        }
        if(this.zzi().zzp(s)) {
            zzfi$zzj$zza0.zze();
            zzb zzmp$zzb0 = (zzb)this.zzae.get(s);
            if(zzmp$zzb0 == null || zzmp$zzb0.zzb + this.zze().zzc(s, zzbi.zzat) < this.zzb().elapsedRealtime()) {
                zzmp$zzb0 = new zzb(this, null);
                this.zzae.put(s, zzmp$zzb0);
            }
            zzfi$zzj$zza0.zzk(zzmp$zzb0.zza);
        }
        if(this.zzi().zzr(s)) {
            zzfi$zzj$zza0.zzp();
        }
    }

    final void zza(String s, zzay zzay0) {
        this.zzl().zzt();
        this.zzs();
        if(zznp.zza()) {
            this.zzad.put(s, zzay0);
            this.zzf().zza(s, zzay0);
        }
    }

    final void zza(String s, zzih zzih0) {
        this.zzl().zzt();
        this.zzs();
        this.zzac.put(s, zzih0);
        this.zzf().zza(s, zzih0);
    }

    public final void zza(String s, zzki zzki0) {
        this.zzl().zzt();
        if(this.zzag == null || this.zzag.equals(s) || zzki0 != null) {
            this.zzag = s;
            this.zzaf = zzki0;
        }
    }

    final void zza(String s, zzo zzo0) {
        this.zzl().zzt();
        this.zzs();
        if(!zzmp.zze(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        if("_npa".equals(s) && zzo0.zzq != null) {
            this.zzj().zzc().zza("Falling back to manifest metadata value for ad personalization");
            this.zza(new zznc("_npa", this.zzb().currentTimeMillis(), ((long)(zzo0.zzq.booleanValue() ? 1L : 0L)), "auto"), zzo0);
            return;
        }
        this.zzj().zzc().zza("Removing user property", this.zzm.zzk().zzc(s));
        this.zzf().zzp();
        try {
            this.zza(zzo0);
            if("_id".equals(s)) {
                this.zzf().zzh(((String)Preconditions.checkNotNull(zzo0.zza)), "_lair");
            }
            this.zzf().zzh(((String)Preconditions.checkNotNull(zzo0.zza)), s);
            this.zzf().zzw();
            this.zzj().zzc().zza("User property removed", this.zzm.zzk().zzc(s));
        }
        finally {
            this.zzf().zzu();
        }
    }

    final void zza(boolean z) {
        this.zzab();
    }

    final void zza(boolean z, int v, Throwable throwable0, byte[] arr_b, String s) {
        zzao zzao0;
        this.zzl().zzt();
        this.zzs();
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            List list0 = (List)Preconditions.checkNotNull(this.zzz);
            this.zzz = null;
            if((!zznk.zza() || (!this.zze().zza(zzbi.zzcr) || z)) && (v != 200 && v != 204 || throwable0 != null)) {
                this.zzj().zzp().zza("Network upload failed. Will retry later. code, error", v, throwable0);
                this.zzj.zzd.zza(this.zzb().currentTimeMillis());
                if(v == 429 || v == 503) {
                    this.zzj.zzb.zza(this.zzb().currentTimeMillis());
                }
                this.zzf().zza(list0);
                this.zzab();
            }
            else {
                try {
                    if(!zznk.zza() || !this.zze().zza(zzbi.zzcr) || z) {
                        this.zzj.zzc.zza(this.zzb().currentTimeMillis());
                    }
                    this.zzj.zzd.zza(0L);
                    this.zzab();
                    if(zznk.zza()) {
                        zzaf zzaf0 = this.zze();
                        zzfi zzfi0 = zzbi.zzcr;
                        if(!zzaf0.zza(zzfi0) || z) {
                            this.zzj().zzp().zza("Successful upload. Got network response. code, size", v, ((int)arr_b.length));
                        }
                        else if(zznk.zza() && this.zze().zza(zzfi0)) {
                            this.zzj().zzp().zza("Purged empty bundles");
                        }
                    }
                    else {
                        this.zzj().zzp().zza("Successful upload. Got network response. code, size", v, ((int)arr_b.length));
                    }
                    this.zzf().zzp();
                }
                catch(SQLiteException sQLiteException0) {
                    this.zzj().zzg().zza("Database error while trying to delete uploaded bundles", sQLiteException0);
                    this.zzp = this.zzb().elapsedRealtime();
                    this.zzj().zzp().zza("Disable upload, time", this.zzp);
                    return;
                }
                try {
                    for(Object object0: list0) {
                        Long long0 = (Long)object0;
                        try {
                            zzao0 = this.zzf();
                            zzao0.zzt();
                            zzao0.zzak();
                            SQLiteDatabase sQLiteDatabase0 = zzao0.e_();
                            String[] arr_s = {String.valueOf(((long)long0))};
                        }
                        catch(SQLiteException sQLiteException1) {
                            goto label_38;
                        }
                        try {
                            if(sQLiteDatabase0.delete("queue", "rowid=?", arr_s) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                            continue;
                        }
                        catch(SQLiteException sQLiteException2) {
                            try {
                                zzao0.zzj().zzg().zza("Failed to delete a bundle in a queue table", sQLiteException2);
                                throw sQLiteException2;
                            }
                            catch(SQLiteException sQLiteException1) {
                            }
                        }
                    label_38:
                        if(this.zzaa == null || !this.zzaa.contains(long0)) {
                            throw sQLiteException1;
                        }
                        if(false) {
                            break;
                        }
                    }
                    this.zzf().zzw();
                    goto label_47;
                }
                catch(Throwable throwable1) {
                    try {
                        this.zzf().zzu();
                        throw throwable1;
                    label_47:
                        this.zzf().zzu();
                        this.zzaa = null;
                        if(!this.zzh().zzu() || !this.zzac()) {
                            this.zzab = -1L;
                            this.zzab();
                        }
                        else {
                            this.zzw();
                        }
                        this.zzp = 0L;
                        return;
                    }
                    catch(SQLiteException sQLiteException0) {
                    }
                }
                this.zzj().zzg().zza("Database error while trying to delete uploaded bundles", sQLiteException0);
                this.zzp = this.zzb().elapsedRealtime();
                this.zzj().zzp().zza("Disable upload, time", this.zzp);
            }
        }
        finally {
            this.zzv = false;
            this.zzaa();
        }
    }

    private final void zzaa() {
        this.zzl().zzt();
        if(!this.zzu && !this.zzv && !this.zzw) {
            this.zzj().zzp().zza("Stopping uploading service(s)");
            List list0 = this.zzq;
            if(list0 == null) {
                return;
            }
            for(Object object0: list0) {
                ((Runnable)object0).run();
            }
            ((List)Preconditions.checkNotNull(this.zzq)).clear();
            return;
        }
        this.zzj().zzp().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
    }

    private final void zzab() {
        long v10;
        long v3;
        this.zzl().zzt();
        this.zzs();
        if(this.zzp > 0L) {
            long v = Math.abs(this.zzb().elapsedRealtime() - this.zzp);
            if(3600000L - v > 0L) {
                this.zzj().zzp().zza("Upload has been suspended. Will update scheduling later in approximately ms", ((long)(3600000L - v)));
                this.zzy().zzb();
                this.zzz().zzu();
                return;
            }
            this.zzp = 0L;
        }
        if(this.zzm.zzaf() && this.zzac()) {
            long v1 = this.zzb().currentTimeMillis();
            this.zze();
            long v2 = Math.max(0L, ((long)(((Long)zzbi.zzaa.zza(null)))));
            boolean z = this.zzf().zzz() || this.zzf().zzy();
            if(z) {
                String s = this.zze().zzn();
                if(TextUtils.isEmpty(s) || ".none.".equals(s)) {
                    this.zze();
                    v3 = Math.max(0L, ((long)(((Long)zzbi.zzu.zza(null)))));
                }
                else {
                    this.zze();
                    v3 = Math.max(0L, ((long)(((Long)zzbi.zzv.zza(null)))));
                }
            }
            else {
                this.zze();
                v3 = Math.max(0L, ((long)(((Long)zzbi.zzt.zza(null)))));
            }
            long v4 = this.zzj.zzc.zza();
            long v5 = this.zzj.zzd.zza();
            long v6 = Math.max(this.zzf().c_(), this.zzf().d_());
            if(v6 == 0L) {
                v10 = 0L;
            }
            else {
                long v7 = v1 - Math.abs(v6 - v1);
                long v8 = v1 - Math.abs(v5 - v1);
                long v9 = Math.max(v1 - Math.abs(v4 - v1), v8);
                v10 = !z || v9 <= 0L ? v7 + v2 : Math.min(v7, v9) + v3;
                if(!this.zzp().zza(v9, v3)) {
                    v10 = v9 + v3;
                }
                if(v8 != 0L && v8 >= v7) {
                    int v11 = 0;
                    while(true) {
                        this.zze();
                        if(v11 >= Math.min(20, Math.max(0, ((int)(((Integer)zzbi.zzac.zza(null))))))) {
                            break;
                        }
                        this.zze();
                        v10 += Math.max(0L, ((long)(((Long)zzbi.zzab.zza(null))))) * (1L << v11);
                        if(v10 > v8) {
                            goto label_48;
                        }
                        ++v11;
                    }
                    v10 = 0L;
                }
            }
        label_48:
            if(v10 == 0L) {
                this.zzj().zzp().zza("Next upload time is 0");
                this.zzy().zzb();
                this.zzz().zzu();
                return;
            }
            if(!this.zzh().zzu()) {
                this.zzj().zzp().zza("No network");
                this.zzy().zza();
                this.zzz().zzu();
                return;
            }
            long v12 = this.zzj.zzb.zza();
            this.zze();
            long v13 = Math.max(0L, ((long)(((Long)zzbi.zzr.zza(null)))));
            if(!this.zzp().zza(v12, v13)) {
                v10 = Math.max(v10, v12 + v13);
            }
            this.zzy().zzb();
            long v14 = v10 - this.zzb().currentTimeMillis();
            if(v14 <= 0L) {
                this.zze();
                v14 = Math.max(0L, ((long)(((Long)zzbi.zzw.zza(null)))));
                this.zzj.zzc.zza(this.zzb().currentTimeMillis());
            }
            this.zzj().zzp().zza("Upload scheduled in approximately ms", v14);
            this.zzz().zza(v14);
            return;
        }
        this.zzj().zzp().zza("Nothing to upload or uploading impossible");
        this.zzy().zzb();
        this.zzz().zzu();
    }

    private final boolean zzac() {
        this.zzl().zzt();
        this.zzs();
        return this.zzf().zzx() || !TextUtils.isEmpty(this.zzf().f_());
    }

    private final boolean zzad() {
        this.zzl().zzt();
        if(this.zzx != null && this.zzx.isValid()) {
            this.zzj().zzp().zza("Storage concurrent access okay");
            return true;
        }
        File file0 = new File(this.zzm.zza().getFilesDir(), "google_app_measurement.db");
        try {
            FileChannel fileChannel0 = new RandomAccessFile(file0, "rw").getChannel();
            this.zzy = fileChannel0;
            FileLock fileLock0 = fileChannel0.tryLock();
            this.zzx = fileLock0;
            if(fileLock0 != null) {
                this.zzj().zzp().zza("Storage concurrent access okay");
                return true;
            }
            this.zzj().zzg().zza("Storage concurrent data access panic");
            return false;
        }
        catch(FileNotFoundException fileNotFoundException0) {
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Failed to access storage lock file", iOException0);
            return false;
        }
        catch(OverlappingFileLockException overlappingFileLockException0) {
            this.zzj().zzu().zza("Storage lock already acquired", overlappingFileLockException0);
            return false;
        }
        this.zzj().zzg().zza("Failed to acquire storage lock", fileNotFoundException0);
        return false;
    }

    private final void zzb(zzbg zzbg0, zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        zzfv zzfv0 = zzfv.zza(zzbg0);
        this.zzq().zza(zzfv0.zzb, this.zzf().zzc(zzo0.zza));
        this.zzq().zza(zzfv0, this.zze().zzd(zzo0.zza));
        zzbg zzbg1 = zzfv0.zza();
        if("_cmp".equals(zzbg1.zza) && "referrer API v2".equals(zzbg1.zzb.zzd("_cis"))) {
            String s = zzbg1.zzb.zzd("gclid");
            if(!TextUtils.isEmpty(s)) {
                this.zza(new zznc("_lgclid", zzbg1.zzd, s, "auto"), zzo0);
            }
        }
        if(zzoi.zza() && zzoi.zzc() && "_cmp".equals(zzbg1.zza) && "referrer API v2".equals(zzbg1.zzb.zzd("_cis"))) {
            String s1 = zzbg1.zzb.zzd("gbraid");
            if(!TextUtils.isEmpty(s1)) {
                this.zza(new zznc("_gbraid", zzbg1.zzd, s1, "auto"), zzo0);
            }
        }
        this.zza(zzbg1, zzo0);
    }

    private final void zzb(zzh zzh0) {
        this.zzl().zzt();
        if(TextUtils.isEmpty(zzh0.zzac()) && TextUtils.isEmpty(zzh0.zzv())) {
            this.zza(((String)Preconditions.checkNotNull(zzh0.zzx())), 204, null, null, null);
            return;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder();
        String s = zzh0.zzac();
        if(TextUtils.isEmpty(s)) {
            s = zzh0.zzv();
        }
        a a0 = null;
        uri$Builder0.scheme(((String)zzbi.zze.zza(null))).encodedAuthority(((String)zzbi.zzf.zza(null))).path("config/app/" + s).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
        String s1 = uri$Builder0.build().toString();
        try {
            Object object0 = Preconditions.checkNotNull(zzh0.zzx());
            URL uRL0 = new URL(s1);
            this.zzj().zzp().zza("Fetching remote configuration", ((String)object0));
            zzd zzfc$zzd0 = this.zzi().zzc(((String)object0));
            String s2 = this.zzi().zze(((String)object0));
            if(zzfc$zzd0 != null) {
                if(!TextUtils.isEmpty(s2)) {
                    a0 = new a();
                    a0.put("If-Modified-Since", s2);
                }
                String s3 = this.zzi().zzd(((String)object0));
                if(!TextUtils.isEmpty(s3)) {
                    if(a0 == null) {
                        a0 = new a();
                    }
                    a0.put("If-None-Match", s3);
                }
            }
            this.zzu = true;
            zzfy zzfy0 = this.zzh();
            zzmu zzmu0 = new zzmu(this);
            zzfy0.zzt();
            zzfy0.zzak();
            Preconditions.checkNotNull(uRL0);
            Preconditions.checkNotNull(zzmu0);
            zzfy0.zzl().zza(new zzgc(zzfy0, ((String)object0), uRL0, null, a0, zzmu0));
        }
        catch(MalformedURLException unused_ex) {
            this.zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzfr.zza(zzh0.zzx()), s1);
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return ((zzhf)Preconditions.checkNotNull(this.zzm)).zzb();
    }

    final zzih zzb(String s) {
        this.zzl().zzt();
        this.zzs();
        zzih zzih0 = (zzih)this.zzac.get(s);
        if(zzih0 == null) {
            zzih0 = this.zzf().zzg(s);
            if(zzih0 == null) {
                zzih0 = zzih.zza;
            }
            this.zza(s, zzih0);
        }
        return zzih0;
    }

    final String zzb(zzo zzo0) {
        Future future0 = this.zzl().zza(new zzmt(this, zzo0));
        try {
            return (String)future0.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            this.zzj().zzg().zza("Failed to get app instance id. appId", zzfr.zza(zzo0.zza), timeoutException0);
            return null;
        }
    }

    final void zzb(zzad zzad0) {
        zzo zzo0 = this.zzc(((String)Preconditions.checkNotNull(zzad0.zza)));
        if(zzo0 != null) {
            this.zzb(zzad0, zzo0);
        }
    }

    final void zzb(zzad zzad0, zzo zzo0) {
        Preconditions.checkNotNull(zzad0);
        Preconditions.checkNotEmpty(zzad0.zza);
        Preconditions.checkNotNull(zzad0.zzb);
        Preconditions.checkNotNull(zzad0.zzc);
        Preconditions.checkNotEmpty(zzad0.zzc.zza);
        this.zzl().zzt();
        this.zzs();
        if(!zzmp.zze(zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        zzad zzad1 = new zzad(zzad0);
        boolean z = false;
        zzad1.zze = false;
        this.zzf().zzp();
        try {
            zzad zzad2 = this.zzf().zzc(((String)Preconditions.checkNotNull(zzad1.zza)), zzad1.zzc.zza);
            if(zzad2 != null && !zzad2.zzb.equals(zzad1.zzb)) {
                this.zzj().zzu().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzm.zzk().zzc(zzad1.zzc.zza), zzad1.zzb, zzad2.zzb);
            }
            if(zzad2 != null && zzad2.zze) {
                zzad1.zzb = zzad2.zzb;
                zzad1.zzd = zzad2.zzd;
                zzad1.zzh = zzad2.zzh;
                zzad1.zzf = zzad2.zzf;
                zzad1.zzi = zzad2.zzi;
                zzad1.zze = true;
                zzad1.zzc = new zznc(zzad1.zzc.zza, zzad2.zzc.zzb, zzad1.zzc.zza(), zzad2.zzc.zze);
            }
            else if(TextUtils.isEmpty(zzad1.zzf)) {
                zzad1.zzc = new zznc(zzad1.zzc.zza, zzad1.zzd, zzad1.zzc.zza(), zzad1.zzc.zze);
                z = true;
                zzad1.zze = true;
            }
            if(zzad1.zze) {
                zznc zznc0 = zzad1.zzc;
                Object object0 = Preconditions.checkNotNull(zzad1.zza);
                String s = zzad1.zzb;
                Object object1 = Preconditions.checkNotNull(zznc0.zza());
                zzne zzne0 = new zzne(((String)object0), s, zznc0.zza, zznc0.zzb, object1);
                if(this.zzf().zza(zzne0)) {
                    this.zzj().zzc().zza("User property updated immediately", zzad1.zza, this.zzm.zzk().zzc(zzne0.zzc), zzne0.zze);
                }
                else {
                    this.zzj().zzg().zza("(2)Too many active user properties, ignoring", zzfr.zza(zzad1.zza), this.zzm.zzk().zzc(zzne0.zzc), zzne0.zze);
                }
                if(z && zzad1.zzi != null) {
                    this.zzc(new zzbg(zzad1.zzi, zzad1.zzd), zzo0);
                }
            }
            if(this.zzf().zza(zzad1)) {
                this.zzj().zzc().zza("Conditional property added", zzad1.zza, this.zzm.zzk().zzc(zzad1.zzc.zza), zzad1.zzc.zza());
            }
            else {
                this.zzj().zzg().zza("Too many conditional properties, ignoring", zzfr.zza(zzad1.zza), this.zzm.zzk().zzc(zzad1.zzc.zza), zzad1.zzc.zza());
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    private final zzo zzc(String s) {
        zzh zzh0 = this.zzf().zzd(s);
        if(zzh0 != null && !TextUtils.isEmpty(zzh0.zzaa())) {
            Boolean boolean0 = this.zza(zzh0);
            if(boolean0 != null && !boolean0.booleanValue()) {
                this.zzj().zzg().zza("App version does not match; dropping. appId", zzfr.zza(s));
                return null;
            }
            zzih zzih0 = this.zzb(s);
            if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
                String s1 = this.zzd(s).zzf();
                return new zzo(s, zzh0.zzac(), zzh0.zzaa(), zzh0.zzc(), zzh0.zzz(), zzh0.zzo(), zzh0.zzl(), null, zzh0.zzak(), false, zzh0.zzab(), zzh0.zzb(), 0L, 0, zzh0.zzaj(), false, zzh0.zzv(), zzh0.zzu(), zzh0.zzm(), zzh0.zzag(), null, zzih0.zze(), "", null, zzh0.zzam(), zzh0.zzt(), zzih0.zza(), s1, zzh0.zza(), zzh0.zzd());
            }
            return new zzo(s, zzh0.zzac(), zzh0.zzaa(), zzh0.zzc(), zzh0.zzz(), zzh0.zzo(), zzh0.zzl(), null, zzh0.zzak(), false, zzh0.zzab(), zzh0.zzb(), 0L, 0, zzh0.zzaj(), false, zzh0.zzv(), zzh0.zzu(), zzh0.zzm(), zzh0.zzag(), null, zzih0.zze(), "", null, zzh0.zzam(), zzh0.zzt(), 100, "", zzh0.zza(), zzh0.zzd());
        }
        this.zzj().zzc().zza("No app data available; dropping", s);
        return null;
    }

    private final void zzc(zzbg zzbg0, zzo zzo0) {
        zzbc zzbc1;
        zzne zzne1;
        long v5;
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        long v = System.nanoTime();
        this.zzl().zzt();
        this.zzs();
        String s = zzo0.zza;
        this.zzp();
        if(!zzmz.zza(zzbg0, zzo0)) {
            return;
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        if(this.zzi().zzd(s, zzbg0.zza)) {
            this.zzj().zzu().zza("Dropping blocked event. appId", zzfr.zza(s), this.zzm.zzk().zza(zzbg0.zza));
            boolean z = this.zzi().zzm(s) || this.zzi().zzo(s);
            if(!z && !"_err".equals(zzbg0.zza)) {
                this.zzq();
                zznd.zza(this.zzah, s, 11, "_ev", zzbg0.zza, 0);
            }
            if(z) {
                zzh zzh0 = this.zzf().zzd(s);
                if(zzh0 != null) {
                    long v1 = Math.max(zzh0.zzn(), zzh0.zze());
                    long v2 = Math.abs(this.zzb().currentTimeMillis() - v1);
                    this.zze();
                    if(v2 > ((long)(((Long)zzbi.zzz.zza(null))))) {
                        this.zzj().zzc().zza("Fetching config for blocked app");
                        this.zzb(zzh0);
                    }
                }
            }
            return;
        }
        zzfv zzfv0 = zzfv.zza(zzbg0);
        this.zzq().zza(zzfv0, this.zze().zzd(s));
        int v3 = !zzot.zza() || !this.zze().zza(zzbi.zzcd) ? 0 : this.zze().zza(s, zzbi.zzaq, 10, 35);
        for(Object object0: new TreeSet(zzfv0.zzb.keySet())) {
            String s1 = (String)object0;
            if("items".equals(s1)) {
                this.zzq().zza(zzfv0.zzb.getParcelableArray(s1), v3, zzot.zza() && this.zze().zza(zzbi.zzcd));
            }
        }
        zzbg zzbg1 = zzfv0.zza();
        if(this.zzj().zza(2)) {
            this.zzj().zzp().zza("Logging event", this.zzm.zzk().zza(zzbg1));
        }
        if(zzon.zza()) {
            this.zze().zza(zzbi.zzca);
        }
        this.zzf().zzp();
        try {
            this.zza(zzo0);
            boolean z1 = "ecommerce_purchase".equals(zzbg1.zza) || ("purchase".equals(zzbg1.zza) || "refund".equals(zzbg1.zza));
            if("_iap".equals(zzbg1.zza) || z1) {
                String s2 = zzbg1.zzb.zzd("currency");
                if(z1) {
                    double f = ((double)zzbg1.zzb.zza("value")) * 1000000.0;
                    if(f == 0.0) {
                        f = ((double)(((long)zzbg1.zzb.zzb("value")))) * 1000000.0;
                    }
                    if(f > 9223372036854776000.0 || f < -9223372036854776000.0) {
                        this.zzj().zzu().zza("Data lost. Currency value is too big. appId", zzfr.zza(s), f);
                        this.zzf().zzw();
                        return;
                    }
                    v5 = Math.round(f);
                    if("refund".equals(zzbg1.zza)) {
                        v5 = -v5;
                    }
                }
                else {
                    v5 = (long)zzbg1.zzb.zzb("value");
                }
                if(!TextUtils.isEmpty(s2)) {
                    String s3 = s2.toUpperCase(Locale.US);
                    if(s3.matches("[A-Z]{3}")) {
                        zzne zzne0 = this.zzf().zze(s, "_ltv_" + s3);
                        if(zzne0 == null) {
                        label_73:
                            zzao zzao0 = this.zzf();
                            int v7 = this.zze().zzb(s, zzbi.zzae);
                            Preconditions.checkNotEmpty(s);
                            zzao0.zzt();
                            zzao0.zzak();
                            try {
                                zzao0.e_().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);", new String[]{s, s, String.valueOf(v7 - 1)});
                            }
                            catch(SQLiteException sQLiteException0) {
                                zzao0.zzj().zzg().zza("Error pruning currencies. appId", zzfr.zza(s), sQLiteException0);
                            }
                            long v8 = this.zzb().currentTimeMillis();
                            zzne1 = new zzne(s, zzbg1.zzc, "_ltv_" + s3, v8, v5);
                        }
                        else {
                            Object object1 = zzne0.zze;
                            if(object1 instanceof Long) {
                                long v6 = this.zzb().currentTimeMillis();
                                zzne1 = new zzne(s, zzbg1.zzc, "_ltv_" + s3, v6, ((long)(((long)(((Long)object1))) + v5)));
                                goto label_84;
                            }
                            goto label_73;
                        }
                    label_84:
                        if(!this.zzf().zza(zzne1)) {
                            this.zzj().zzg().zza("Too many unique user properties are set. Ignoring user property. appId", zzfr.zza(s), this.zzm.zzk().zzc(zzne1.zzc), zzne1.zze);
                            this.zzq();
                            zznd.zza(this.zzah, s, 9, null, null, 0);
                        }
                    }
                }
            }
            boolean z2 = zznd.zzh(zzbg1.zza);
            boolean z3 = "_err".equals(zzbg1.zza);
            this.zzq();
            long v9 = zznd.zza(zzbg1.zzb);
            zzap zzap0 = this.zzf().zza(this.zzx(), s, v9 + 1L, true, z2, false, z3, false);
            long v10 = zzap0.zzb;
            this.zze();
            long v11 = v10 - ((long)(((int)(((Integer)zzbi.zzk.zza(null))))));
            if(Long.compare(v11, 0L) > 0) {
                if(v11 % 1000L == 1L) {
                    this.zzj().zzg().zza("Data loss. Too many events logged. appId, count", zzfr.zza(s), zzap0.zzb);
                }
                this.zzf().zzw();
                return;
            }
            if(z2) {
                long v12 = zzap0.zza;
                this.zze();
                long v13 = v12 - ((long)(((int)(((Integer)zzbi.zzm.zza(null))))));
                if(v13 > 0L) {
                    if(v13 % 1000L == 1L) {
                        this.zzj().zzg().zza("Data loss. Too many public events logged. appId, count", zzfr.zza(s), zzap0.zza);
                    }
                    this.zzq();
                    zznd.zza(this.zzah, s, 16, "_ev", zzbg1.zza, 0);
                    this.zzf().zzw();
                    return;
                }
            }
            if(z3) {
                long v14 = zzap0.zzd - ((long)Math.max(0, Math.min(1000000, this.zze().zzb(zzo0.zza, zzbi.zzl))));
                if(v14 > 0L) {
                    if(v14 == 1L) {
                        this.zzj().zzg().zza("Too many error events logged. appId, count", zzfr.zza(s), zzap0.zzd);
                    }
                    this.zzf().zzw();
                    return;
                }
            }
            Bundle bundle0 = zzbg1.zzb.zzb();
            this.zzq().zza(bundle0, "_o", zzbg1.zzc);
            if(this.zzq().zzf(s)) {
                this.zzq().zza(bundle0, "_dbg", 1L);
                this.zzq().zza(bundle0, "_r", 1L);
            }
            if("_s".equals(zzbg1.zza)) {
                zzne zzne2 = this.zzf().zze(zzo0.zza, "_sno");
                if(zzne2 != null && zzne2.zze instanceof Long) {
                    this.zzq().zza(bundle0, "_sno", zzne2.zze);
                }
            }
            long v15 = this.zzf().zza(s);
            if(v15 > 0L) {
                this.zzj().zzu().zza("Data lost. Too many events stored on disk, deleted. appId", zzfr.zza(s), v15);
            }
            boolean z4 = false;
            zzaz zzaz0 = new zzaz(this.zzm, zzbg1.zzc, s, zzbg1.zza, zzbg1.zzd, 0L, bundle0);
            zzbc zzbc0 = this.zzf().zzd(s, zzaz0.zzb);
            if(zzbc0 == null) {
                if(this.zzf().zzb(s) >= ((long)this.zze().zza(s)) && z2) {
                    this.zzj().zzg().zza("Too many event names used, ignoring event. appId, name, supported count", zzfr.zza(s), this.zzm.zzk().zza(zzaz0.zzb), this.zze().zza(s));
                    this.zzq();
                    zznd.zza(this.zzah, s, 8, null, null, 0);
                    return;
                }
                zzbc1 = new zzbc(s, zzaz0.zzb, 0L, 0L, zzaz0.zzc, 0L, null, null, null, null);
            }
            else {
                zzaz0 = zzaz0.zza(this.zzm, zzbc0.zzf);
                zzbc1 = zzbc0.zza(zzaz0.zzc);
            }
            this.zzf().zza(zzbc1);
            this.zzl().zzt();
            this.zzs();
            Preconditions.checkNotNull(zzaz0);
            Preconditions.checkNotNull(zzo0);
            Preconditions.checkNotEmpty(zzaz0.zza);
            Preconditions.checkArgument(zzaz0.zza.equals(zzo0.zza));
            com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0 = zzj.zzu().zzg(1).zzp("android");
            if(!TextUtils.isEmpty(zzo0.zza)) {
                zzfi$zzj$zza0.zzb(zzo0.zza);
            }
            if(!TextUtils.isEmpty(zzo0.zzd)) {
                zzfi$zzj$zza0.zzd(zzo0.zzd);
            }
            if(!TextUtils.isEmpty(zzo0.zzc)) {
                zzfi$zzj$zza0.zze(zzo0.zzc);
            }
            if(zzps.zza() && !TextUtils.isEmpty(zzo0.zzv) && (this.zze().zza(zzbi.zzbr) || this.zze().zze(zzo0.zza, zzbi.zzbt))) {
                zzfi$zzj$zza0.zzr(zzo0.zzv);
            }
            long v16 = zzo0.zzj;
            if(v16 != 0xFFFFFFFF80000000L) {
                zzfi$zzj$zza0.zze(((int)v16));
            }
            zzfi$zzj$zza0.zzf(zzo0.zze);
            if(!TextUtils.isEmpty(zzo0.zzb)) {
                zzfi$zzj$zza0.zzm(zzo0.zzb);
            }
            zzih zzih0 = this.zzb(((String)Preconditions.checkNotNull(zzo0.zza))).zza(zzih.zza(zzo0.zzt));
            zzfi$zzj$zza0.zzg(zzih0.zze());
            if(!TextUtils.isEmpty(zzo0.zzp)) {
                zzfi$zzj$zza0.zza(zzo0.zzp);
            }
            if(zzpg.zza() && this.zze().zze(zzo0.zza, zzbi.zzcf)) {
                this.zzq();
                if(zznd.zzd(zzo0.zza)) {
                    zzfi$zzj$zza0.zzd(zzo0.zzaa);
                    long v17 = zzih0.zzg() || zzo0.zzab == 0L ? zzo0.zzab : zzo0.zzab & -2L | 0x20L;
                    zzfi$zzj$zza0.zza(v17 == 1L);
                    if(v17 != 0L) {
                        com.google.android.gms.internal.measurement.zzfi.zzb.zza zzfi$zzb$zza0 = com.google.android.gms.internal.measurement.zzfi.zzb.zza();
                        zzfi$zzb$zza0.zzc((v17 & 1L) != 0L);
                        zzfi$zzb$zza0.zze((2L & v17) != 0L);
                        zzfi$zzb$zza0.zzf((4L & v17) != 0L);
                        zzfi$zzb$zza0.zzg((8L & v17) != 0L);
                        zzfi$zzb$zza0.zzb((16L & v17) != 0L);
                        zzfi$zzb$zza0.zza((v17 & 0x20L) != 0L);
                        zzfi$zzb$zza0.zzd((0x40L & v17) != 0L);
                        zzfi$zzj$zza0.zza(((com.google.android.gms.internal.measurement.zzfi.zzb)(((zzix)zzfi$zzb$zza0.zzab()))));
                    }
                }
            }
            long v18 = zzo0.zzf;
            if(v18 != 0L) {
                zzfi$zzj$zza0.zzc(v18);
            }
            zzfi$zzj$zza0.zzd(zzo0.zzr);
            List list0 = this.zzp().zzu();
            if(list0 != null) {
                zzfi$zzj$zza0.zzc(list0);
            }
            zzih zzih1 = this.zzb(((String)Preconditions.checkNotNull(zzo0.zza))).zza(zzih.zza(zzo0.zzt));
            if(zzih1.zzg() && zzo0.zzn) {
                Pair pair0 = this.zzj.zza(zzo0.zza, zzih1);
                if(pair0 != null && !TextUtils.isEmpty(((CharSequence)pair0.first)) && zzo0.zzn) {
                    zzfi$zzj$zza0.zzq(((String)pair0.first));
                    Object object2 = pair0.second;
                    if(object2 != null) {
                        zzfi$zzj$zza0.zzc(((Boolean)object2).booleanValue());
                    }
                    if(zznk.zza() && this.zze().zza(zzbi.zzcr) && !zzaz0.zzb.equals("_fx") && !((String)pair0.first).equals("00000000-0000-0000-0000-000000000000")) {
                        zzh zzh1 = this.zzf().zzd(zzo0.zza);
                        if(zzh1 != null && zzh1.zzan()) {
                            this.zza(zzo0.zza, false);
                            Bundle bundle1 = new Bundle();
                            bundle1.putLong("_r", 1L);
                            this.zzah.zza(zzo0.zza, "_fx", bundle1);
                        }
                    }
                }
            }
            this.zzm.zzg().zzab();
            com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza1 = zzfi$zzj$zza0.zzi(Build.MODEL);
            this.zzm.zzg().zzab();
            zzfi$zzj$zza1.zzo(Build.VERSION.RELEASE).zzi(((int)this.zzm.zzg().zzg())).zzs(this.zzm.zzg().zzh());
            zzfi$zzj$zza0.zzj(zzo0.zzx);
            if(this.zzm.zzac() && !TextUtils.isEmpty(null)) {
                zzfi$zzj$zza0.zzj(null);
            }
            zzh zzh2 = this.zzf().zzd(zzo0.zza);
            if(zzh2 == null) {
                zzh2 = new zzh(this.zzm, zzo0.zza);
                zzh2.zzb(this.zza(zzih1));
                zzh2.zze(zzo0.zzk);
                zzh2.zzf(zzo0.zzb);
                if(zzih1.zzg()) {
                    zzh2.zzh(this.zzj.zza(zzo0.zza, zzo0.zzn));
                }
                zzh2.zzo(0L);
                zzh2.zzp(0L);
                zzh2.zzn(0L);
                zzh2.zzd(zzo0.zzc);
                zzh2.zza(zzo0.zzj);
                zzh2.zzc(zzo0.zzd);
                zzh2.zzm(zzo0.zze);
                zzh2.zzj(zzo0.zzf);
                zzh2.zzb(zzo0.zzh);
                zzh2.zzk(zzo0.zzr);
                this.zzf().zza(zzh2);
            }
            if(zzih1.zzh() && !TextUtils.isEmpty(zzh2.zzy())) {
                zzfi$zzj$zza0.zzc(((String)Preconditions.checkNotNull(zzh2.zzy())));
            }
            if(!TextUtils.isEmpty(zzh2.zzab())) {
                zzfi$zzj$zza0.zzl(((String)Preconditions.checkNotNull(zzh2.zzab())));
            }
            List list1 = this.zzf().zzi(zzo0.zza);
            for(int v19 = 0; v19 < list1.size(); ++v19) {
                com.google.android.gms.internal.measurement.zzfi.zzn.zza zzfi$zzn$zza0 = zzn.zze().zza(((zzne)list1.get(v19)).zzc).zzb(((zzne)list1.get(v19)).zzd);
                this.zzp().zza(zzfi$zzn$zza0, ((zzne)list1.get(v19)).zze);
                zzfi$zzj$zza0.zza(zzfi$zzn$zza0);
                if("_sid".equals(((zzne)list1.get(v19)).zzc) && zzh2.zzs() != 0L && this.zzp().zza(zzo0.zzv) != zzh2.zzs()) {
                    zzfi$zzj$zza0.zzp();
                }
            }
            try {
                long v20 = this.zzf().zza(((zzj)(((zzix)zzfi$zzj$zza0.zzab()))));
            }
            catch(IOException iOException0) {
                this.zzj().zzg().zza("Data loss. Failed to insert raw event metadata. appId", zzfr.zza(zzfi$zzj$zza0.zzr()), iOException0);
                this.zzf().zzw();
                this.zzab();
                this.zzj().zzp().zza("Background event processing time, ms", ((long)((System.nanoTime() - v + 500000L) / 1000000L)));
                return;
            }
            zzao zzao1 = this.zzf();
            zzbb zzbb0 = zzaz0.zze;
            if(zzbb0 != null) {
                for(Object object3: zzbb0) {
                    if(!"_r".equals(((String)object3))) {
                        continue;
                    }
                    z4 = true;
                    goto label_268;
                }
                if(this.zzi().zzc(zzaz0.zza, zzaz0.zzb) && this.zzf().zza(this.zzx(), zzaz0.zza, false, false, false, false, false).zze < ((long)this.zze().zze(zzaz0.zza))) {
                    z4 = true;
                }
            }
        label_268:
            if(zzao1.zza(zzaz0, v20, z4)) {
                this.zzp = 0L;
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
        this.zzab();
        this.zzj().zzp().zza("Background event processing time, ms", ((long)((System.nanoTime() - v + 500000L) / 1000000L)));
    }

    public final zzt zzc() {
        return (zzt)zzmp.zza(this.zzg);
    }

    final void zzc(zzo zzo0) {
        ApplicationInfo applicationInfo0;
        boolean z1;
        PackageInfo packageInfo0;
        this.zzl().zzt();
        this.zzs();
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        if(!zzmp.zze(zzo0)) {
            return;
        }
        zzh zzh0 = this.zzf().zzd(zzo0.zza);
        if(zzh0 != null && TextUtils.isEmpty(zzh0.zzac()) && !TextUtils.isEmpty(zzo0.zzb)) {
            zzh0.zzc(0L);
            this.zzf().zza(zzh0);
            this.zzi().zzj(zzo0.zza);
        }
        if(!zzo0.zzh) {
            this.zza(zzo0);
            return;
        }
        long v = zzo0.zzl == 0L ? this.zzb().currentTimeMillis() : zzo0.zzl;
        this.zzm.zzg().zzm();
        int v1 = zzo0.zzm;
        if(v1 != 0 && v1 != 1) {
            this.zzj().zzu().zza("Incorrect app type, assuming installed app. appId, appType", zzfr.zza(zzo0.zza), v1);
            v1 = 0;
        }
        this.zzf().zzp();
        try {
            zzne zzne0 = this.zzf().zze(zzo0.zza, "_npa");
            if(zzne0 == null || "auto".equals(zzne0.zzb)) {
                if(zzo0.zzq != null) {
                    zznc zznc0 = new zznc("_npa", v, ((long)(zzo0.zzq.booleanValue() ? 1L : 0L)), "auto");
                    if(zzne0 == null || !zzne0.zze.equals(zznc0.zzc)) {
                        this.zza(zznc0, zzo0);
                    }
                }
                else if(zzne0 != null) {
                    this.zza("_npa", zzo0);
                }
            }
            zzh zzh1 = this.zzf().zzd(((String)Preconditions.checkNotNull(zzo0.zza)));
            if(zzh1 != null) {
                this.zzq();
                String s = zzh1.zzac();
                String s1 = zzh1.zzv();
                if(zznd.zza(zzo0.zzb, s, zzo0.zzp, s1)) {
                    this.zzj().zzu().zza("New GMP App Id passed in. Removing cached database data. appId", zzfr.zza(zzh1.zzx()));
                    zzao zzao0 = this.zzf();
                    String s2 = zzh1.zzx();
                    zzao0.zzak();
                    zzao0.zzt();
                    Preconditions.checkNotEmpty(s2);
                    try {
                        SQLiteDatabase sQLiteDatabase0 = zzao0.e_();
                        String[] arr_s = {s2};
                        int v3 = sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("event_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("property_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("consent_settings", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("trigger_uris", "app_id=?", arr_s);
                        if(v3 > 0) {
                            zzao0.zzj().zzp().zza("Deleted application data. app, records", s2, v3);
                        }
                    }
                    catch(SQLiteException sQLiteException0) {
                        zzao0.zzj().zzg().zza("Error deleting application data. appId, error", zzfr.zza(s2), sQLiteException0);
                    }
                    zzh1 = null;
                }
            }
            if(zzh1 != null) {
                int v4 = zzh1.zzc() == 0xFFFFFFFF80000000L || zzh1.zzc() == zzo0.zzj ? 0 : 1;
                String s3 = zzh1.zzaa();
                if((v4 | (zzh1.zzc() != 0xFFFFFFFF80000000L || s3 == null || s3.equals(zzo0.zzc) ? 0 : 1)) != 0) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("_pv", s3);
                    this.zza(new zzbg("_au", new zzbb(bundle0), "auto", v), zzo0);
                }
            }
            this.zza(zzo0);
            if((v1 == 0 ? this.zzf().zzd(zzo0.zza, "_f") : this.zzf().zzd(zzo0.zza, "_v")) == null) {
                long v5 = (v / 3600000L + 1L) * 3600000L;
                if(v1 == 0) {
                    this.zza(new zznc("_fot", v, v5, "auto"), zzo0);
                    this.zzl().zzt();
                    zzgm zzgm0 = (zzgm)Preconditions.checkNotNull(this.zzl);
                    String s4 = zzo0.zza;
                    if(s4 == null || s4.isEmpty()) {
                        zzgm0.zza.zzj().zzw().zza("Install Referrer Reporter was called with invalid app package name");
                    }
                    else {
                        zzgm0.zza.zzl().zzt();
                        if(zzgm0.zza()) {
                            zzgl zzgl0 = new zzgl(zzgm0, s4);
                            zzgm0.zza.zzl().zzt();
                            Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                            intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                            PackageManager packageManager0 = zzgm0.zza.zza().getPackageManager();
                            if(packageManager0 == null) {
                                zzgm0.zza.zzj().zzw().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                            }
                            else {
                                List list0 = packageManager0.queryIntentServices(intent0, 0);
                                if(list0 == null || list0.isEmpty()) {
                                    zzgm0.zza.zzj().zzn().zza("Play Service for fetching Install Referrer is unavailable on device");
                                }
                                else {
                                    ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                                    if(serviceInfo0 != null) {
                                        if(serviceInfo0.name == null || !"com.android.vending".equals(serviceInfo0.packageName) || !zzgm0.zza()) {
                                            zzgm0.zza.zzj().zzu().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                        }
                                        else {
                                            Intent intent1 = new Intent(intent0);
                                            try {
                                                boolean z = ConnectionTracker.getInstance().bindService(zzgm0.zza.zza(), intent1, zzgl0, 1);
                                                zzgm0.zza.zzj().zzp().zza("Install Referrer Service is", (z ? "available" : "not available"));
                                                goto label_97;
                                            }
                                            catch(RuntimeException runtimeException0) {
                                            }
                                            zzgm0.zza.zzj().zzg().zza("Exception occurred while binding to Install Referrer Service", runtimeException0.getMessage());
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            zzgm0.zza.zzj().zzn().zza("Install Referrer Reporter is not available");
                        }
                    }
                label_97:
                    this.zzl().zzt();
                    this.zzs();
                    Bundle bundle1 = new Bundle();
                    bundle1.putLong("_c", 1L);
                    bundle1.putLong("_r", 1L);
                    bundle1.putLong("_uwa", 0L);
                    bundle1.putLong("_pfo", 0L);
                    bundle1.putLong("_sys", 0L);
                    bundle1.putLong("_sysu", 0L);
                    bundle1.putLong("_et", 1L);
                    if(zzo0.zzo) {
                        bundle1.putLong("_dac", 1L);
                    }
                    String s5 = (String)Preconditions.checkNotNull(zzo0.zza);
                    zzao zzao1 = this.zzf();
                    Preconditions.checkNotEmpty(s5);
                    zzao1.zzt();
                    zzao1.zzak();
                    long v6 = zzao1.zzb(s5, "first_open_count");
                    if(this.zzm.zza().getPackageManager() == null) {
                        this.zzj().zzg().zza("PackageManager is null, first open report might be inaccurate. appId", zzfr.zza(s5));
                    }
                    else {
                        try {
                            packageInfo0 = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(s5, 0);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            this.zzj().zzg().zza("Package info is null, first open report might be inaccurate. appId", zzfr.zza(s5), packageManager$NameNotFoundException0);
                            packageInfo0 = null;
                        }
                        if(packageInfo0 != null) {
                            long v7 = packageInfo0.firstInstallTime;
                            if(v7 != 0L) {
                                if(v7 == packageInfo0.lastUpdateTime) {
                                    z1 = true;
                                }
                                else {
                                    if(!this.zze().zza(zzbi.zzbl)) {
                                        bundle1.putLong("_uwa", 1L);
                                    }
                                    else if(v6 == 0L) {
                                        bundle1.putLong("_uwa", 1L);
                                    }
                                    z1 = false;
                                }
                                this.zza(new zznc("_fi", v, ((long)(z1 ? 1L : 0L)), "auto"), zzo0);
                            }
                        }
                        try {
                            applicationInfo0 = Wrappers.packageManager(this.zzm.zza()).getApplicationInfo(s5, 0);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                            this.zzj().zzg().zza("Application info is null, first open report might be inaccurate. appId", zzfr.zza(s5), packageManager$NameNotFoundException1);
                            applicationInfo0 = null;
                        }
                        if(applicationInfo0 != null) {
                            if((applicationInfo0.flags & 1) != 0) {
                                bundle1.putLong("_sys", 1L);
                            }
                            if((applicationInfo0.flags & 0x80) != 0) {
                                bundle1.putLong("_sysu", 1L);
                            }
                        }
                    }
                    if(v6 >= 0L) {
                        bundle1.putLong("_pfo", v6);
                    }
                    this.zzb(new zzbg("_f", new zzbb(bundle1), "auto", v), zzo0);
                }
                else {
                    this.zza(new zznc("_fvt", v, v5, "auto"), zzo0);
                    this.zzl().zzt();
                    this.zzs();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("_c", 1L);
                    bundle2.putLong("_r", 1L);
                    bundle2.putLong("_et", 1L);
                    if(zzo0.zzo) {
                        bundle2.putLong("_dac", 1L);
                    }
                    this.zzb(new zzbg("_v", new zzbb(bundle2), "auto", v), zzo0);
                }
            }
            else if(zzo0.zzi) {
                this.zzb(new zzbg("_cd", new zzbb(new Bundle()), "auto", v), zzo0);
            }
            this.zzf().zzw();
        }
        finally {
            this.zzf().zzu();
        }
    }

    private final zzay zzd(String s) {
        this.zzl().zzt();
        this.zzs();
        if(zznp.zza()) {
            zzay zzay0 = (zzay)this.zzad.get(s);
            if(zzay0 == null) {
                zzay0 = this.zzf().zzf(s);
                this.zzad.put(s, zzay0);
            }
            return zzay0;
        }
        return zzay.zza;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return this.zzm.zzd();
    }

    final void zzd(zzo zzo0) {
        if(this.zzz != null) {
            ArrayList arrayList0 = new ArrayList();
            this.zzaa = arrayList0;
            arrayList0.addAll(this.zzz);
        }
        zzao zzao0 = this.zzf();
        String s = (String)Preconditions.checkNotNull(zzo0.zza);
        Preconditions.checkNotEmpty(s);
        zzao0.zzt();
        zzao0.zzak();
        try {
            SQLiteDatabase sQLiteDatabase0 = zzao0.e_();
            String[] arr_s = {s};
            int v = sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("queue", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("main_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("trigger_uris", "app_id=?", arr_s);
            if(v > 0) {
                zzao0.zzj().zzp().zza("Reset analytics data. app, records", s, v);
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzao0.zzj().zzg().zza("Error resetting analytics data. appId, error", zzfr.zza(s), sQLiteException0);
        }
        if(zzo0.zzh) {
            this.zzc(zzo0);
        }
    }

    // 去混淆评级： 低(20)
    private static boolean zze(zzo zzo0) {
        return !TextUtils.isEmpty(zzo0.zzb) || !TextUtils.isEmpty(zzo0.zzp);
    }

    public final zzaf zze() {
        return ((zzhf)Preconditions.checkNotNull(this.zzm)).zzf();
    }

    public final zzao zzf() {
        return (zzao)zzmp.zza(this.zzd);
    }

    public final zzfq zzg() {
        return this.zzm.zzk();
    }

    public final zzfy zzh() {
        return (zzfy)zzmp.zza(this.zzc);
    }

    public final zzgp zzi() {
        return (zzgp)zzmp.zza(this.zzb);
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return ((zzhf)Preconditions.checkNotNull(this.zzm)).zzj();
    }

    final zzhf zzk() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return ((zzhf)Preconditions.checkNotNull(this.zzm)).zzl();
    }

    public final zzkg zzm() {
        return (zzkg)zzmp.zza(this.zzi);
    }

    public final zzls zzn() {
        return this.zzj;
    }

    public final zzmn zzo() {
        return this.zzk;
    }

    public final zzmz zzp() {
        return (zzmz)zzmp.zza(this.zzh);
    }

    public final zznd zzq() {
        return ((zzhf)Preconditions.checkNotNull(this.zzm)).zzt();
    }

    final void zzr() {
        this.zzl().zzt();
        this.zzs();
        if(!this.zzo) {
            this.zzo = true;
            if(this.zzad()) {
                int v = this.zza(this.zzy);
                int v1 = this.zzm.zzh().zzab();
                this.zzl().zzt();
                if(v > v1) {
                    this.zzj().zzg().zza("Panic: can\'t downgrade version. Previous, current version", v, v1);
                    return;
                }
                if(v < v1) {
                    if(this.zza(v1, this.zzy)) {
                        this.zzj().zzp().zza("Storage version upgraded. Previous, current version", v, v1);
                        return;
                    }
                    this.zzj().zzg().zza("Storage version upgrade failed. Previous, current version", v, v1);
                }
            }
        }
    }

    final void zzs() {
        if(!this.zzn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzt() {
        ++this.zzt;
    }

    final void zzu() {
        ++this.zzs;
    }

    protected final void zzv() {
        this.zzl().zzt();
        this.zzf().zzv();
        if(this.zzj.zzc.zza() == 0L) {
            this.zzj.zzc.zza(this.zzb().currentTimeMillis());
        }
        this.zzab();
    }

    final void zzw() {
        com.google.android.gms.internal.measurement.zzfi.zzi.zza zzfi$zzi$zza1;
        List list1;
        this.zzl().zzt();
        this.zzs();
        this.zzw = true;
        try {
            Boolean boolean0 = this.zzm.zzr().zzab();
            if(boolean0 == null) {
                this.zzj().zzu().zza("Upload data called on the client side before use of service was decided");
                return;
            }
            if(boolean0.booleanValue()) {
                this.zzj().zzg().zza("Upload called in the client side when service should be used");
                return;
            }
            if(this.zzp > 0L) {
                this.zzab();
                return;
            }
            this.zzl().zzt();
            if(this.zzz != null) {
                this.zzj().zzp().zza("Uploading requested multiple times");
                return;
            }
            if(!this.zzh().zzu()) {
                this.zzj().zzp().zza("Network not connected, ignoring upload request");
                this.zzab();
                return;
            }
            long v1 = this.zzb().currentTimeMillis();
            int v2 = this.zze().zzb(null, zzbi.zzar);
            this.zze();
            long v3 = zzaf.zzh();
            for(int v4 = 0; v4 < v2 && this.zza(null, v1 - v3); ++v4) {
            }
            if(zzpg.zza()) {
                this.zzl().zzt();
                for(Object object0: this.zzr) {
                    String s = (String)object0;
                    if(zzpg.zza() && this.zze().zze(s, zzbi.zzcf)) {
                        this.zzj().zzc().zza("Notifying app that trigger URIs are available. App ID", s);
                        Intent intent0 = new Intent();
                        intent0.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intent0.setPackage(s);
                        this.zzm.zza().sendBroadcast(intent0);
                    }
                }
                this.zzr.clear();
            }
            long v5 = this.zzj.zzc.zza();
            if(v5 != 0L) {
                this.zzj().zzc().zza("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(v1 - v5));
            }
            String s1 = this.zzf().f_();
            if(TextUtils.isEmpty(s1)) {
                this.zzab = -1L;
                zzao zzao0 = this.zzf();
                this.zze();
                String s3 = zzao0.zza(v1 - zzaf.zzh());
                if(!TextUtils.isEmpty(s3)) {
                    zzh zzh0 = this.zzf().zzd(s3);
                    if(zzh0 != null) {
                        this.zzb(zzh0);
                    }
                }
            }
            else {
                if(this.zzab == -1L) {
                    this.zzab = this.zzf().b_();
                }
                int v6 = this.zze().zzb(s1, zzbi.zzg);
                int v7 = Math.max(0, this.zze().zzb(s1, zzbi.zzh));
                List list0 = this.zzf().zza(s1, v6, v7);
                if(!list0.isEmpty()) {
                    if(this.zzb(s1).zzg()) {
                        for(Object object1: list0) {
                            zzj zzfi$zzj0 = (zzj)((Pair)object1).first;
                        }
                    }
                    com.google.android.gms.internal.measurement.zzfi.zzi.zza zzfi$zzi$zza0 = zzi.zzb();
                    int v8 = list0.size();
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    boolean z = this.zze().zzk(s1) && this.zzb(s1).zzg();
                    boolean z1 = this.zzb(s1).zzg();
                    boolean z2 = this.zzb(s1).zzh();
                    boolean z3 = zzps.zza() && this.zze().zze(s1, zzbi.zzbt);
                    int v9 = 0;
                    while(v9 < v8) {
                        com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza)((zzj)((Pair)list0.get(v9)).first).zzby();
                        arrayList0.add(((Long)((Pair)list0.get(v9)).second));
                        this.zze();
                        zzfi$zzj$zza0.zzl(82001L).zzk(v1).zzd(false);
                        if(!z) {
                            zzfi$zzj$zza0.zzh();
                        }
                        if(!z1) {
                            zzfi$zzj$zza0.zzo();
                            zzfi$zzj$zza0.zzk();
                        }
                        if(!z2) {
                            zzfi$zzj$zza0.zze();
                        }
                        this.zza(s1, zzfi$zzj$zza0);
                        if(!z3) {
                            zzfi$zzj$zza0.zzp();
                        }
                        if(!zznk.zza() || !this.zze().zza(zzbi.zzcr)) {
                            list1 = list0;
                        }
                        else {
                            for(Object object2: new ArrayList(zzfi$zzj$zza0.zzw())) {
                                zze zzfi$zze0 = (zze)object2;
                            }
                            list1 = list0;
                            if(zzfi$zzj$zza0.zza() == 0) {
                                zzfi$zzi$zza1 = zzfi$zzi$zza0;
                                goto label_108;
                            }
                        }
                        if(this.zze().zze(s1, zzbi.zzbd)) {
                            byte[] arr_b = ((zzj)(((zzix)zzfi$zzj$zza0.zzab()))).zzbv();
                            zzfi$zzj$zza0.zza(this.zzp().zza(arr_b));
                        }
                        zzfi$zzi$zza1 = zzfi$zzi$zza0;
                        zzfi$zzi$zza1.zza(zzfi$zzj$zza0);
                    label_108:
                        ++v9;
                        zzfi$zzi$zza0 = zzfi$zzi$zza1;
                        list0 = list1;
                    }
                    if(zznk.zza() && this.zze().zza(zzbi.zzcr) && zzfi$zzi$zza0.zza() == 0) {
                        this.zza(arrayList0);
                        this.zza(false, 204, null, null, s1);
                        return;
                    }
                    String s2 = this.zzj().zza(2) ? this.zzp().zza(((zzi)(((zzix)zzfi$zzi$zza0.zzab())))) : null;
                    this.zzp();
                    byte[] arr_b1 = ((zzi)(((zzix)zzfi$zzi$zza0.zzab()))).zzbv();
                    zzmq zzmq0 = this.zzk.zza(s1);
                    try {
                        this.zza(arrayList0);
                        this.zzj.zzd.zza(v1);
                        this.zzj().zzp().zza("Uploading data. app, uncompressed size, data", (v8 <= 0 ? "?" : ""), ((int)arr_b1.length), s2);
                        this.zzv = true;
                        zzfy zzfy0 = this.zzh();
                        URL uRL0 = new URL(zzmq0.zza());
                        zzmr zzmr0 = new zzmr(this, s1);
                        zzfy0.zzt();
                        zzfy0.zzak();
                        Preconditions.checkNotNull(uRL0);
                        Preconditions.checkNotNull(arr_b1);
                        Preconditions.checkNotNull(zzmr0);
                        zzfy0.zzl().zza(new zzgc(zzfy0, s1, uRL0, arr_b1, zzmq0.zzb(), zzmr0));
                    }
                    catch(MalformedURLException unused_ex) {
                        this.zzj().zzg().zza("Failed to parse upload URL. Not uploading. appId", zzfr.zza(s1), zzmq0.zza());
                    }
                }
            }
        }
        finally {
            this.zzw = false;
            this.zzaa();
        }
    }

    private final long zzx() {
        long v = this.zzb().currentTimeMillis();
        zzls zzls0 = this.zzj;
        zzls0.zzak();
        zzls0.zzt();
        long v1 = zzls0.zze.zza();
        if(v1 == 0L) {
            v1 = ((long)zzls0.zzq().zzv().nextInt(86400000)) + 1L;
            zzls0.zze.zza(v1);
        }
        return (v + v1) / 1000L / 60L / 60L / 24L;
    }

    private final zzgb zzy() {
        zzgb zzgb0 = this.zze;
        if(zzgb0 == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return zzgb0;
    }

    private final zzmj zzz() {
        return (zzmj)zzmp.zza(this.zzf);
    }
}

