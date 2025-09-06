package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew.zzb;
import com.google.android.gms.internal.measurement.zzew.zzc;
import com.google.android.gms.internal.measurement.zzew.zze;
import com.google.android.gms.internal.measurement.zzfi.zze.zza;
import com.google.android.gms.internal.measurement.zzfi.zzg;
import com.google.android.gms.internal.measurement.zzfi.zzj;
import com.google.android.gms.internal.measurement.zzfi.zzl;
import com.google.android.gms.internal.measurement.zzfi.zzn;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

final class zzao extends zzmo {
    private static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;
    private static final String[] zzd;
    private static final String[] zze;
    private static final String[] zzg;
    private static final String[] zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final String[] zzk;
    private final zzau zzl;
    private final zzmi zzm;

    static {
        zzao.zza = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        zzao.zzb = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        zzao.zzc = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
        zzao.zzd = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        zzao.zze = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        zzao.zzg = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzao.zzh = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzao.zzi = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
        zzao.zzj = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
        zzao.zzk = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    }

    zzao(zzmp zzmp0) {
        super(zzmp0);
        this.zzm = new zzmi(this.zzb());
        this.zzl = new zzau(this, this.zza(), "google_app_measurement.db");
    }

    public final long b_() {
        long v;
        Cursor cursor0;
        try {
            try {
                cursor0 = null;
                cursor0 = this.e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if(cursor0.moveToFirst()) {
                    v = cursor0.getLong(0);
                    goto label_13;
                }
                goto label_15;
            }
            catch(SQLiteException sQLiteException0) {
            }
            this.zzj().zzg().zza("Error querying raw events", sQLiteException0);
            if(cursor0 != null) {
                goto label_8;
            }
            return -1L;
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
    label_8:
        cursor0.close();
        return -1L;
    label_11:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_13:
        cursor0.close();
        return v;
    label_15:
        cursor0.close();
        return -1L;
    }

    public final long c_() {
        return this.zza("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long d_() {
        return this.zza("select max(timestamp) from raw_events", null, 0L);
    }

    final SQLiteDatabase e_() {
        this.zzt();
        try {
            return this.zzl.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzu().zza("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final String f_() {
        String s;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_7;
        }
        try {
            try {
                if(cursor0.moveToFirst()) {
                    s = cursor0.getString(0);
                    goto label_14;
                }
                goto label_16;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_7:
            this.zzj().zzg().zza("Database error getting next bundle app id", sQLiteException0);
            if(cursor0 != null) {
                goto label_9;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
    label_9:
        cursor0.close();
        return null;
    label_12:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_14:
        cursor0.close();
        return s;
    label_16:
        cursor0.close();
        return null;
    }

    private final long zza(String s, String[] arr_s, long v) {
        long v1;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v1 = cursor0.getLong(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzj().zzg().zza("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return v1;
    label_14:
        cursor0.close();
        return v;
    }

    // 检测为 Lambda 实现
    static zzih zza(Cursor cursor0) [...]

    private final Object zza(Cursor cursor0, int v) {
        int v1 = cursor0.getType(v);
        switch(v1) {
            case 0: {
                this.zzj().zzg().zza("Loaded invalid null value from database");
                return null;
            }
            case 1: {
                return cursor0.getLong(v);
            }
            case 2: {
                return cursor0.getDouble(v);
            }
            case 3: {
                return cursor0.getString(v);
            }
            case 4: {
                this.zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
                return null;
            }
            default: {
                this.zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", v1);
                return null;
            }
        }
    }

    private final Object zza(String s, String[] arr_s, zzar zzar0) {
        Object object0;
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().rawQuery(s, arr_s);
            goto label_6;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_13;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_6:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("No data found");
                goto label_8;
            }
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_13;
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
    label_8:
        cursor0.close();
        return null;
        try {
            try {
            label_10:
                object0 = zzar0.zza(cursor0);
                goto label_20;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_13:
            this.zzj().zzg().zza("Error querying database.", sQLiteException0);
            if(cursor0 != null) {
                goto label_15;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
    label_15:
        cursor0.close();
        return null;
    label_18:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_20:
        cursor0.close();
        return object0;
    }

    private final String zza(String s, String[] arr_s, String s1) {
        String s2;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    s2 = cursor0.getString(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzj().zzg().zza("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return s2;
    label_14:
        cursor0.close();
        return s1;
    }

    private static void zza(ContentValues contentValues0, String s, Object object0) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(object0);
        if(object0 instanceof String) {
            contentValues0.put(s, ((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            contentValues0.put(s, ((Long)object0));
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues0.put(s, ((Double)object0));
    }

    private final void zza(String s, String s1, ContentValues contentValues0) {
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            String s2 = contentValues0.getAsString(s1);
            if(s2 == null) {
                this.zzj().zzh().zza("Value of the primary key is not set.", zzfr.zza(s1));
                return;
            }
            if(((long)sQLiteDatabase0.update(s, contentValues0, s1 + " = ?", new String[]{s2})) == 0L && sQLiteDatabase0.insertWithOnConflict(s, null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update table (got -1). key", zzfr.zza(s), zzfr.zza(s1));
            }
            return;
        }
        catch(SQLiteException sQLiteException0) {
        }
        this.zzj().zzg().zza("Error storing into table. key", zzfr.zza(s), zzfr.zza(s1), sQLiteException0);
    }

    private final boolean zza(String s, int v, zzb zzew$zzb0) {
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzew$zzb0);
        Integer integer0 = null;
        zzft zzft0 = this.zzj().zzu();
        Object object0 = zzfr.zza(s);
        Integer integer1 = v;
        if(zzew$zzb0.zzl()) {
            integer0 = zzew$zzb0.zzb();
        }
        zzft0.zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", object0, integer1, String.valueOf(integer0));
        return false;
    }

    private final boolean zza(String s, int v, zze zzew$zze0) {
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzew$zze0);
        Integer integer0 = null;
        zzft zzft0 = this.zzj().zzu();
        Object object0 = zzfr.zza(s);
        Integer integer1 = v;
        if(zzew$zze0.zzi()) {
            integer0 = zzew$zze0.zza();
        }
        zzft0.zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", object0, integer1, String.valueOf(integer0));
        return false;
    }

    public final int zza(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzak();
        try {
            return this.e_().delete("conditional_properties", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting conditional property", zzfr.zza(s), this.zzi().zzc(s1), sQLiteException0);
            return 0;
        }
    }

    public final long zza(zzj zzfi$zzj0) {
        this.zzt();
        this.zzak();
        Preconditions.checkNotNull(zzfi$zzj0);
        Preconditions.checkNotEmpty("");
        byte[] arr_b = zzfi$zzj0.zzbv();
        long v = this.g_().zza(arr_b);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", "");
        contentValues0.put("metadata_fingerprint", v);
        contentValues0.put("metadata", arr_b);
        try {
            this.e_().insertWithOnConflict("raw_events_metadata", null, contentValues0, 4);
            return v;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing raw event metadata. appId", zzfr.zza(""), sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final long zza(String s) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        try {
            return (long)this.e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{s, String.valueOf(Math.max(0, Math.min(1000000, this.zze().zzb(s, zzbi.zzp))))});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting over the limit events. appId", zzfr.zza(s), sQLiteException0);
            return 0L;
        }
    }

    public final Pair zza(String s, Long long0) {
        Pair pair0;
        com.google.android.gms.internal.measurement.zzfi.zze zzfi$zze0;
        Long long1;
        Cursor cursor0;
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{s, String.valueOf(long0)});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("Main event not found");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_10:
        cursor0.close();
        return null;
        try {
        label_12:
            byte[] arr_b = cursor0.getBlob(0);
            long1 = cursor0.getLong(1);
            try {
                zzfi$zze0 = (com.google.android.gms.internal.measurement.zzfi.zze)(((zzix)((zza)zzmz.zza(com.google.android.gms.internal.measurement.zzfi.zze.zze(), arr_b)).zzab()));
                goto label_20;
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to merge main event. appId, eventId", zzfr.zza(s), long0, iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        cursor0.close();
        return null;
        try {
            try {
            label_20:
                pair0 = Pair.create(zzfi$zze0, long1);
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_23:
            this.zzj().zzg().zza("Error selecting main event", sQLiteException0);
            if(cursor0 != null) {
                goto label_25;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_25:
        cursor0.close();
        return null;
    label_28:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_30:
        cursor0.close();
        return pair0;
    }

    public final zzap zza(long v, String s, long v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        String[] arr_s = {s};
        zzap zzap0 = new zzap();
        Cursor cursor0 = null;
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            cursor0 = sQLiteDatabase0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                if(cursor0.getLong(0) == v) {
                    zzap0.zzb = cursor0.getLong(1);
                    zzap0.zza = cursor0.getLong(2);
                    zzap0.zzc = cursor0.getLong(3);
                    zzap0.zzd = cursor0.getLong(4);
                    zzap0.zze = cursor0.getLong(5);
                }
                if(z) {
                    zzap0.zzb += v1;
                }
                if(z1) {
                    zzap0.zza += v1;
                }
                if(z2) {
                    zzap0.zzc += v1;
                }
                if(z3) {
                    zzap0.zzd += v1;
                }
                if(z4) {
                    zzap0.zze += v1;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("day", v);
                contentValues0.put("daily_public_events_count", zzap0.zza);
                contentValues0.put("daily_events_count", zzap0.zzb);
                contentValues0.put("daily_conversions_count", zzap0.zzc);
                contentValues0.put("daily_error_events_count", zzap0.zzd);
                contentValues0.put("daily_realtime_events_count", zzap0.zze);
                sQLiteDatabase0.update("apps", contentValues0, "app_id=?", arr_s);
                goto label_33;
            }
            goto label_35;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_33:
        cursor0.close();
        return zzap0;
        try {
            try {
            label_35:
                this.zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzfr.zza(s));
                goto label_45;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_38:
            this.zzj().zzg().zza("Error updating daily counts. appId", zzfr.zza(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_40;
            }
            return zzap0;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_40:
        cursor0.close();
        return zzap0;
    label_43:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_45:
        cursor0.close();
        return zzap0;
    }

    public final zzap zza(long v, String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        return this.zza(v, s, 1L, false, false, z2, false, z4);
    }

    public final String zza(long v) {
        String s;
        Cursor cursor0;
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v)});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("No expired configs for apps with pending events");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_10:
        cursor0.close();
        return null;
        try {
            try {
            label_12:
                s = cursor0.getString(0);
                goto label_22;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_15:
            this.zzj().zzg().zza("Error selecting expired configs", sQLiteException0);
            if(cursor0 != null) {
                goto label_17;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_17:
        cursor0.close();
        return null;
    label_20:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_22:
        cursor0.close();
        return s;
    }

    public final List zza(String s, int v, int v1) {
        List list2;
        List list1;
        com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0;
        byte[] arr_b1;
        List list0;
        this.zzt();
        this.zzak();
        Preconditions.checkArgument(v > 0);
        Preconditions.checkArgument(v1 > 0);
        Preconditions.checkNotEmpty(s);
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{s}, null, null, "rowid", String.valueOf(v));
            if(cursor0.moveToFirst()) {
                list0 = new ArrayList();
                int v2 = 0;
                while(true) {
                    long v3 = cursor0.getLong(0);
                    try {
                        byte[] arr_b = cursor0.getBlob(1);
                        arr_b1 = this.g_().zzc(arr_b);
                    }
                    catch(IOException iOException0) {
                        this.zzj().zzg().zza("Failed to unzip queued bundle. appId", zzfr.zza(s), iOException0);
                        goto label_41;
                    }
                    if(!list0.isEmpty() && arr_b1.length + v2 > v1) {
                        goto label_42;
                    }
                    try {
                        zzfi$zzj$zza0 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza)zzmz.zza(zzj.zzu(), arr_b1);
                    }
                    catch(IOException iOException1) {
                        this.zzj().zzg().zza("Failed to merge queued bundle. appId", zzfr.zza(s), iOException1);
                        goto label_41;
                    }
                    if(zznp.zza() && this.zze().zza(zzbi.zzcq) && !list0.isEmpty()) {
                        zzj zzfi$zzj0 = (zzj)((Pair)list0.get(0)).first;
                        zzj zzfi$zzj1 = (zzj)(((zzix)zzfi$zzj$zza0.zzab()));
                        if(zzfi$zzj0.zzas() != zzfi$zzj1.zzas()) {
                            goto label_42;
                        }
                        for(Object object0: zzfi$zzj0.zzaq()) {
                            zzn zzfi$zzn0 = (zzn)object0;
                        }
                        for(Object object1: zzfi$zzj1.zzaq()) {
                            zzn zzfi$zzn1 = (zzn)object1;
                        }
                    }
                    if(!cursor0.isNull(2)) {
                        zzfi$zzj$zza0.zzh(cursor0.getInt(2));
                    }
                    v2 += arr_b1.length;
                    list0.add(Pair.create(((zzj)(((zzix)zzfi$zzj$zza0.zzab()))), v3));
                label_41:
                    if(cursor0.moveToNext() && v2 <= v1) {
                        continue;
                    }
                    goto label_42;
                }
            }
            goto label_44;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_47;
        }
        catch(Throwable throwable0) {
            goto label_53;
        }
    label_42:
        cursor0.close();
        return list0;
        try {
            try {
            label_44:
                list1 = Collections.emptyList();
                goto label_55;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_47:
            this.zzj().zzg().zza("Error querying bundles. appId", zzfr.zza(s), sQLiteException0);
            list2 = Collections.emptyList();
            if(cursor0 != null) {
                goto label_50;
            }
            return list2;
        }
        catch(Throwable throwable0) {
            goto label_53;
        }
    label_50:
        cursor0.close();
        return list2;
    label_53:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_55:
        cursor0.close();
        return list1;
    }

    public final List zza(String s, String s1, String s2) {
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(s);
        StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(s1)) {
            arrayList0.add(s1);
            stringBuilder0.append(" and origin=?");
        }
        if(!TextUtils.isEmpty(s2)) {
            arrayList0.add(s2 + "*");
            stringBuilder0.append(" and name glob ?");
        }
        return this.zza(stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    public final List zza(String s, String[] arr_s) {
        List list1;
        this.zzt();
        this.zzak();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, s, arr_s, null, null, "rowid", "1001");
            if(cursor0.moveToFirst()) {
                while(true) {
                    if(list0.size() >= 1000) {
                        goto label_25;
                    }
                    boolean z = false;
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    String s3 = cursor0.getString(2);
                    Object object0 = this.zza(cursor0, 3);
                    if(cursor0.getInt(4) != 0) {
                        z = true;
                    }
                    String s4 = cursor0.getString(5);
                    long v = cursor0.getLong(6);
                    Parcelable parcelable0 = this.g_().zza(cursor0.getBlob(7), zzbg.CREATOR);
                    long v1 = cursor0.getLong(8);
                    Parcelable parcelable1 = this.g_().zza(cursor0.getBlob(9), zzbg.CREATOR);
                    long v2 = cursor0.getLong(10);
                    long v3 = cursor0.getLong(11);
                    Parcelable parcelable2 = this.g_().zza(cursor0.getBlob(12), zzbg.CREATOR);
                    list0.add(new zzad(s1, s2, new zznc(s3, v2, object0, s2), v1, z, s4, ((zzbg)parcelable0), v, ((zzbg)parcelable1), v3, ((zzbg)parcelable2)));
                    if(!cursor0.moveToNext()) {
                        goto label_24;
                    }
                }
            }
            goto label_38;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_28;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_24:
        goto label_36;
        try {
            try {
            label_25:
                this.zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
                goto label_36;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_28:
            this.zzj().zzg().zza("Error querying conditional user property value", sQLiteException0);
            list1 = Collections.emptyList();
            if(cursor0 != null) {
                goto label_31;
            }
            return list1;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_31:
        cursor0.close();
        return list1;
    label_34:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_36:
        cursor0.close();
        return list0;
    label_38:
        cursor0.close();
        return list0;
    }

    public final void zza(zzbc zzbc0) {
        Preconditions.checkNotNull(zzbc0);
        this.zzt();
        this.zzak();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzbc0.zza);
        contentValues0.put("name", zzbc0.zzb);
        contentValues0.put("lifetime_count", zzbc0.zzc);
        contentValues0.put("current_bundle_count", zzbc0.zzd);
        contentValues0.put("last_fire_timestamp", zzbc0.zzf);
        contentValues0.put("last_bundled_timestamp", zzbc0.zzg);
        contentValues0.put("last_bundled_day", zzbc0.zzh);
        contentValues0.put("last_sampled_complex_event_id", zzbc0.zzi);
        contentValues0.put("last_sampling_rate", zzbc0.zzj);
        contentValues0.put("current_session_count", zzbc0.zze);
        contentValues0.put("last_exempt_from_sampling", (zzbc0.zzk == null || !zzbc0.zzk.booleanValue() ? null : 1L));
        try {
            if(this.e_().insertWithOnConflict("events", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzfr.zza(zzbc0.zza));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing event aggregates. appId", zzfr.zza(zzbc0.zza), sQLiteException0);
        }
    }

    public final void zza(zzh zzh0) {
        Preconditions.checkNotNull(zzh0);
        this.zzt();
        this.zzak();
        String s = zzh0.zzx();
        Preconditions.checkNotNull(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("app_instance_id", zzh0.zzy());
        contentValues0.put("gmp_app_id", zzh0.zzac());
        contentValues0.put("resettable_device_id_hash", zzh0.zzae());
        contentValues0.put("last_bundle_index", zzh0.zzq());
        contentValues0.put("last_bundle_start_timestamp", zzh0.zzr());
        contentValues0.put("last_bundle_end_timestamp", zzh0.zzp());
        contentValues0.put("app_version", zzh0.zzaa());
        contentValues0.put("app_store", zzh0.zzz());
        contentValues0.put("gmp_version", zzh0.zzo());
        contentValues0.put("dev_cert_hash", zzh0.zzl());
        contentValues0.put("measurement_enabled", Boolean.valueOf(zzh0.zzak()));
        contentValues0.put("day", zzh0.zzk());
        contentValues0.put("daily_public_events_count", zzh0.zzi());
        contentValues0.put("daily_events_count", zzh0.zzh());
        contentValues0.put("daily_conversions_count", zzh0.zzf());
        contentValues0.put("config_fetched_time", zzh0.zze());
        contentValues0.put("failed_config_fetch_time", zzh0.zzn());
        contentValues0.put("app_version_int", zzh0.zzc());
        contentValues0.put("firebase_instance_id", zzh0.zzab());
        contentValues0.put("daily_error_events_count", zzh0.zzg());
        contentValues0.put("daily_realtime_events_count", zzh0.zzj());
        contentValues0.put("health_monitor_sample", zzh0.zzad());
        contentValues0.put("android_id", zzh0.zzb());
        contentValues0.put("adid_reporting_enabled", Boolean.valueOf(zzh0.zzaj()));
        contentValues0.put("admob_app_id", zzh0.zzv());
        contentValues0.put("dynamite_version", zzh0.zzm());
        contentValues0.put("session_stitching_token", zzh0.zzaf());
        contentValues0.put("sgtm_upload_enabled", Boolean.valueOf(zzh0.zzam()));
        contentValues0.put("target_os_version", zzh0.zzt());
        contentValues0.put("session_stitching_token_hash", zzh0.zzs());
        if(zzpg.zza() && this.zze().zze(s, zzbi.zzcf)) {
            contentValues0.put("ad_services_version", zzh0.zza());
            contentValues0.put("attribution_eligibility_status", zzh0.zzd());
        }
        if(zznk.zza() && this.zze().zze(s, zzbi.zzcr)) {
            contentValues0.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzh0.zzan()));
        }
        List list0 = zzh0.zzag();
        if(list0 != null) {
            if(list0.isEmpty()) {
                this.zzj().zzu().zza("Safelisted events should not be an empty list. appId", s);
            }
            else {
                contentValues0.put("safelisted_events", TextUtils.join(",", list0));
            }
        }
        if(zznq.zza() && this.zze().zza(zzbi.zzbp) && !contentValues0.containsKey("safelisted_events")) {
            contentValues0.put("safelisted_events", null);
        }
        if(zznp.zza() && this.zze().zze(s, zzbi.zzcm)) {
            contentValues0.put("npa_metadata_value", zzh0.zzu());
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.e_();
            if(((long)sQLiteDatabase0.update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("apps", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzfr.zza(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing app. appId", zzfr.zza(s), sQLiteException0);
        }
    }

    public final void zza(String s, zzay zzay0) {
        if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
            Preconditions.checkNotNull(s);
            Preconditions.checkNotNull(zzay0);
            this.zzt();
            this.zzak();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s);
            contentValues0.put("dma_consent_settings", zzay0.zzf());
            this.zza("consent_settings", "app_id", contentValues0);
        }
    }

    public final void zza(String s, zzih zzih0) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(zzih0);
        this.zzt();
        this.zzak();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("consent_state", zzih0.zze());
        if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
            contentValues0.put("consent_source", zzih0.zza());
            this.zza("consent_settings", "app_id", contentValues0);
            return;
        }
        try {
            if(this.e_().insertWithOnConflict("consent_settings", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update consent setting (got -1). appId", zzfr.zza(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing consent setting. appId, error", zzfr.zza(s), sQLiteException0);
        }
    }

    final void zza(String s, List list0) {
        boolean z;
        Preconditions.checkNotNull(list0);
        for(int v = 0; v < list0.size(); ++v) {
            com.google.android.gms.internal.measurement.zzew.zza.zza zzew$zza$zza0 = (com.google.android.gms.internal.measurement.zzew.zza.zza)((com.google.android.gms.internal.measurement.zzew.zza)list0.get(v)).zzby();
            if(zzew$zza$zza0.zza() != 0) {
                for(int v1 = 0; v1 < zzew$zza$zza0.zza(); ++v1) {
                    com.google.android.gms.internal.measurement.zzew.zzb.zza zzew$zzb$zza0 = (com.google.android.gms.internal.measurement.zzew.zzb.zza)zzew$zza$zza0.zza(v1).zzby();
                    com.google.android.gms.internal.measurement.zzew.zzb.zza zzew$zzb$zza1 = (com.google.android.gms.internal.measurement.zzew.zzb.zza)(((com.google.android.gms.internal.measurement.zzix.zzb)zzew$zzb$zza0.clone()));
                    String s1 = zzii.zzb("");
                    if(s1 == null) {
                        z = false;
                    }
                    else {
                        zzew$zzb$zza1.zza(s1);
                        z = true;
                    }
                    for(int v2 = 0; v2 < zzew$zzb$zza0.zza(); ++v2) {
                        zzc zzew$zzc0 = zzew$zzb$zza0.zza(v2);
                        String s2 = zzik.zza("");
                        if(s2 != null) {
                            zzew$zzb$zza1.zza(v2, ((zzc)(((zzix)((com.google.android.gms.internal.measurement.zzew.zzc.zza)zzew$zzc0.zzby()).zza(s2).zzab()))));
                            z = true;
                        }
                    }
                    if(z) {
                        com.google.android.gms.internal.measurement.zzew.zza.zza zzew$zza$zza1 = zzew$zza$zza0.zza(v1, zzew$zzb$zza1);
                        list0.set(v, ((com.google.android.gms.internal.measurement.zzew.zza)(((zzix)zzew$zza$zza1.zzab()))));
                        zzew$zza$zza0 = zzew$zza$zza1;
                    }
                }
            }
            if(zzew$zza$zza0.zzb() != 0) {
                for(int v3 = 0; v3 < zzew$zza$zza0.zzb(); ++v3) {
                    zze zzew$zze0 = zzew$zza$zza0.zzb(v3);
                    String s3 = zzij.zza("");
                    if(s3 != null) {
                        zzew$zza$zza0 = zzew$zza$zza0.zza(v3, ((com.google.android.gms.internal.measurement.zzew.zze.zza)zzew$zze0.zzby()).zza(s3));
                        list0.set(v, ((com.google.android.gms.internal.measurement.zzew.zza)(((zzix)zzew$zza$zza0.zzab()))));
                    }
                }
            }
        }
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(list0);
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        sQLiteDatabase0.beginTransaction();
        try {
            this.zzak();
            this.zzt();
            Preconditions.checkNotEmpty(s);
            SQLiteDatabase sQLiteDatabase1 = this.e_();
            sQLiteDatabase1.delete("property_filters", "app_id=?", new String[]{s});
            sQLiteDatabase1.delete("event_filters", "app_id=?", new String[]{s});
            Iterator iterator0 = list0.iterator();
        label_56:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                com.google.android.gms.internal.measurement.zzew.zza zzew$zza0 = (com.google.android.gms.internal.measurement.zzew.zza)object0;
                this.zzak();
                this.zzt();
                Preconditions.checkNotEmpty(s);
                Preconditions.checkNotNull(zzew$zza0);
                if(zzew$zza0.zzg()) {
                    int v5 = zzew$zza0.zza();
                    for(Object object1: zzew$zza0.zze()) {
                        if(!((zzb)object1).zzl()) {
                            this.zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfr.zza(s), v5);
                            continue label_56;
                        }
                        if(false) {
                            break;
                        }
                    }
                    for(Object object2: zzew$zza0.zzf()) {
                        if(!((zze)object2).zzi()) {
                            this.zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfr.zza(s), v5);
                            continue label_56;
                        }
                        if(false) {
                            break;
                        }
                    }
                    boolean z1 = true;
                    for(Object object3: zzew$zza0.zze()) {
                        if(!this.zza(s, v5, ((zzb)object3))) {
                            z1 = false;
                            break;
                        }
                    }
                    if(z1) {
                        for(Object object4: zzew$zza0.zzf()) {
                            if(!this.zza(s, v5, ((zze)object4))) {
                                z1 = false;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(!z1) {
                        this.zzak();
                        this.zzt();
                        Preconditions.checkNotEmpty(s);
                        SQLiteDatabase sQLiteDatabase2 = this.e_();
                        sQLiteDatabase2.delete("property_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                        sQLiteDatabase2.delete("event_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                    }
                }
                else {
                    this.zzj().zzu().zza("Audience with no ID. appId", zzfr.zza(s));
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object5: list0) {
                com.google.android.gms.internal.measurement.zzew.zza zzew$zza1 = (com.google.android.gms.internal.measurement.zzew.zza)object5;
                arrayList0.add((zzew$zza1.zzg() ? zzew$zza1.zza() : null));
            }
            this.zzb(s, arrayList0);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    final void zza(List list0) {
        this.zzt();
        this.zzak();
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotZero(list0.size());
        if(!this.zzan()) {
            return;
        }
        String s = "(" + TextUtils.join(",", list0) + ")";
        if(this.zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + s + " AND retry_count =  2147483647 LIMIT 1", null) > 0L) {
            this.zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + s + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error incrementing retry count. error", sQLiteException0);
        }
    }

    public final boolean zza(zzj zzfi$zzj0, boolean z) {
        byte[] arr_b1;
        this.zzt();
        this.zzak();
        Preconditions.checkNotNull(zzfi$zzj0);
        Preconditions.checkNotEmpty("");
        Preconditions.checkState(zzfi$zzj0.zzbe());
        this.zzv();
        long v = this.zzb().currentTimeMillis();
        if(zzfi$zzj0.zzl() < v - zzaf.zzm() || zzfi$zzj0.zzl() > zzaf.zzm() + v) {
            this.zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfr.zza(""), v, zzfi$zzj0.zzl());
        }
        byte[] arr_b = zzfi$zzj0.zzbv();
        try {
            arr_b1 = this.g_().zzb(arr_b);
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzfr.zza(""), iOException0);
            return false;
        }
        this.zzj().zzp().zza("Saving bundle, size", ((int)arr_b1.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", "");
        contentValues0.put("bundle_end_timestamp", zzfi$zzj0.zzl());
        contentValues0.put("data", arr_b1);
        contentValues0.put("has_realtime", ((int)z));
        if(zzfi$zzj0.zzbl()) {
            contentValues0.put("retry_count", zzfi$zzj0.zzf());
        }
        try {
            if(this.e_().insert("queue", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzfr.zza(""));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing bundle. appId", zzfr.zza(""), sQLiteException0);
            return false;
        }
    }

    public final boolean zza(zzad zzad0) {
        Preconditions.checkNotNull(zzad0);
        this.zzt();
        this.zzak();
        String s = zzad0.zza;
        Preconditions.checkNotNull(s);
        if(this.zze(s, zzad0.zzc.zza) == null && this.zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{s}) >= 1000L) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", zzad0.zzb);
        contentValues0.put("name", zzad0.zzc.zza);
        zzao.zza(contentValues0, "value", Preconditions.checkNotNull(zzad0.zzc.zza()));
        contentValues0.put("active", Boolean.valueOf(zzad0.zze));
        contentValues0.put("trigger_event_name", zzad0.zzf);
        contentValues0.put("trigger_timeout", zzad0.zzh);
        this.zzq();
        contentValues0.put("timed_out_event", zznd.zza(zzad0.zzg));
        contentValues0.put("creation_timestamp", zzad0.zzd);
        this.zzq();
        contentValues0.put("triggered_event", zznd.zza(zzad0.zzi));
        contentValues0.put("triggered_timestamp", zzad0.zzc.zzb);
        contentValues0.put("time_to_live", zzad0.zzj);
        this.zzq();
        contentValues0.put("expired_event", zznd.zza(zzad0.zzk));
        try {
            if(this.e_().insertWithOnConflict("conditional_properties", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzfr.zza(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing conditional user property", zzfr.zza(s), sQLiteException0);
        }
        return true;
    }

    public final boolean zza(zzaz zzaz0, long v, boolean z) {
        this.zzt();
        this.zzak();
        Preconditions.checkNotNull(zzaz0);
        Preconditions.checkNotEmpty(zzaz0.zza);
        byte[] arr_b = this.g_().zza(zzaz0).zzbv();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzaz0.zza);
        contentValues0.put("name", zzaz0.zzb);
        contentValues0.put("timestamp", zzaz0.zzc);
        contentValues0.put("metadata_fingerprint", v);
        contentValues0.put("data", arr_b);
        contentValues0.put("realtime", ((int)z));
        try {
            if(this.e_().insert("raw_events", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzfr.zza(zzaz0.zza));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing raw event. appId", zzfr.zza(zzaz0.zza), sQLiteException0);
            return false;
        }
    }

    public final boolean zza(zzne zzne0) {
        Preconditions.checkNotNull(zzne0);
        this.zzt();
        this.zzak();
        if(this.zze(zzne0.zza, zzne0.zzc) == null) {
            if(zznd.zzh(zzne0.zzc)) {
                if(this.zzb("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{zzne0.zza}) >= ((long)this.zze().zza(zzne0.zza, zzbi.zzag, 25, 100))) {
                    return false;
                }
            }
            else if(!"_npa".equals(zzne0.zzc) && this.zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{zzne0.zza, zzne0.zzb}) >= 25L) {
                return false;
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", zzne0.zza);
        contentValues0.put("origin", zzne0.zzb);
        contentValues0.put("name", zzne0.zzc);
        contentValues0.put("set_timestamp", zzne0.zzd);
        zzao.zza(contentValues0, "value", zzne0.zze);
        try {
            if(this.e_().insertWithOnConflict("user_attributes", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzfr.zza(zzne0.zza));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing user property. appId", zzfr.zza(zzne0.zza), sQLiteException0);
        }
        return true;
    }

    final boolean zza(String s, Bundle bundle0) {
        this.zzt();
        this.zzak();
        zzaz zzaz0 = new zzaz(this.zzu, "", s, "dep", 0L, 0L, bundle0);
        byte[] arr_b = this.g_().zza(zzaz0).zzbv();
        this.zzj().zzp().zza("Saving default event parameters, appId, data size", this.zzi().zza(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("parameters", arr_b);
        try {
            if(this.e_().insertWithOnConflict("default_event_params", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzfr.zza(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing default event parameters. appId", zzfr.zza(s), sQLiteException0);
            return false;
        }
    }

    public final boolean zza(String s, zzmh zzmh0) {
        this.zzt();
        this.zzak();
        Preconditions.checkNotNull(zzmh0);
        Preconditions.checkNotEmpty(s);
        long v = this.zzb().currentTimeMillis();
        long v1 = zzaf.zzm();
        if(zzmh0.zzb >= v - v1) {
            long v2 = zzaf.zzm();
            if(zzmh0.zzb > v2 + v) {
                this.zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfr.zza(s), v, zzmh0.zzb);
            }
        }
        else {
            this.zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfr.zza(s), v, zzmh0.zzb);
        }
        this.zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("trigger_uri", zzmh0.zza);
        contentValues0.put("source", zzmh0.zzc);
        contentValues0.put("timestamp_millis", zzmh0.zzb);
        try {
            if(this.e_().insert("trigger_uris", null, contentValues0) == -1L) {
                this.zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzfr.zza(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing trigger URI. appId", zzfr.zza(s), sQLiteException0);
            return false;
        }
    }

    public final boolean zza(String s, Long long0, long v, com.google.android.gms.internal.measurement.zzfi.zze zzfi$zze0) {
        this.zzt();
        this.zzak();
        Preconditions.checkNotNull(zzfi$zze0);
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(long0);
        byte[] arr_b = zzfi$zze0.zzbv();
        this.zzj().zzp().zza("Saving complex main event, appId, data size", this.zzi().zza(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("event_id", long0);
        contentValues0.put("children_to_process", v);
        contentValues0.put("main_event", arr_b);
        try {
            if(this.e_().insertWithOnConflict("main_event_params", null, contentValues0, 5) == -1L) {
                this.zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzfr.zza(s));
                return false;
            }
            return true;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error storing complex main event. appId", zzfr.zza(s), sQLiteException0);
            return false;
        }
    }

    private final boolean zzan() {
        return this.zza().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long zzb(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.zzj().zzg().zza("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    private final boolean zzb(String s, List list0) {
        Preconditions.checkNotEmpty(s);
        this.zzak();
        this.zzt();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        try {
            long v = this.zzb("select count(1) from audience_filter_values where app_id=?", new String[]{s});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(s), sQLiteException0);
            return false;
        }
        int v1 = Math.max(0, Math.min(2000, this.zze().zzb(s, zzbi.zzaf)));
        if(v <= ((long)v1)) {
            return false;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            Integer integer0 = (Integer)list0.get(v2);
            if(integer0 == null) {
                return false;
            }
            arrayList0.add(Integer.toString(((int)integer0)));
        }
        return sQLiteDatabase0.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList0) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{s, Integer.toString(v1)}) > 0;
    }

    public final long zzb(String s) {
        Preconditions.checkNotEmpty(s);
        return this.zza("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}, 0L);
    }

    protected final long zzb(String s, String s1) {
        long v2;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzak();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        sQLiteDatabase0.beginTransaction();
        long v = 0L;
        try {
            v2 = this.zza("select " + s1 + " from app2 where app_id=?", new String[]{s}, -1L);
            if(Long.compare(v2, -1L) == 0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s);
                contentValues0.put("first_open_count", 0);
                contentValues0.put("previous_install_count", 0);
                if(sQLiteDatabase0.insertWithOnConflict("app2", null, contentValues0, 5) == -1L) {
                    this.zzj().zzg().zza("Failed to insert column (got -1). appId", zzfr.zza(s), s1);
                    return -1L;
                }
                goto label_20;
            }
            goto label_24;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error inserting column. appId", zzfr.zza(s), s1, sQLiteException0);
            return v;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
        label_20:
            v2 = 0L;
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error inserting column. appId", zzfr.zza(s), s1, sQLiteException0);
            return v;
        }
        try {
        label_24:
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("app_id", s);
            contentValues1.put(s1, ((long)(v2 + 1L)));
            if(((long)sQLiteDatabase0.update("app2", contentValues1, "app_id = ?", new String[]{s})) == 0L) {
                this.zzj().zzg().zza("Failed to update column (got 0). appId", zzfr.zza(s), s1);
                return -1L;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return v2;
        }
        catch(SQLiteException sQLiteException1) {
            sQLiteException0 = sQLiteException1;
            v = v2;
        }
        this.zzj().zzg().zza("Error inserting column. appId", zzfr.zza(s), s1, sQLiteException0);
        return v;
    }

    public final List zzb(String s, String s1, String s2) {
        List list1;
        String s5;
        Object object0;
        long v;
        String s4;
        StringBuilder stringBuilder0;
        ArrayList arrayList0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            arrayList0 = new ArrayList(3);
            arrayList0.add(s);
            stringBuilder0 = new StringBuilder("app_id=?");
            if(TextUtils.isEmpty(s1)) {
                goto label_17;
            }
            else {
                goto label_13;
            }
            goto label_18;
        }
        catch(SQLiteException sQLiteException0) {
            String s3 = s1;
            goto label_46;
            try {
                try {
                label_13:
                    s3 = s1;
                    arrayList0.add(s3);
                    stringBuilder0.append(" and origin=?");
                    goto label_18;
                label_17:
                    s3 = s1;
                label_18:
                    if(!TextUtils.isEmpty(s2)) {
                        arrayList0.add(s2 + "*");
                        stringBuilder0.append(" and name glob ?");
                    }
                    Object[] arr_object = arrayList0.toArray(new String[arrayList0.size()]);
                    cursor0 = this.e_().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, stringBuilder0.toString(), ((String[])arr_object), null, null, "rowid", "1001");
                    if(cursor0.moveToFirst()) {
                        while(true) {
                        label_24:
                            if(list0.size() >= 1000) {
                                this.zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
                            }
                            else {
                                s4 = cursor0.getString(0);
                                v = cursor0.getLong(1);
                                object0 = this.zza(cursor0, 2);
                                s5 = cursor0.getString(3);
                                if(object0 == null) {
                                    goto label_32;
                                }
                                else {
                                    goto label_34;
                                }
                                goto label_35;
                            }
                            goto label_40;
                        }
                    }
                    goto label_54;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_46;
                }
                try {
                label_32:
                    this.zzj().zzg().zza("(2)Read invalid user property value, ignoring it", zzfr.zza(s), s5, s2);
                    goto label_35;
                label_34:
                    list0.add(new zzne(s, s5, s4, v, object0));
                label_35:
                    if(cursor0.moveToNext()) {
                        goto label_42;
                    }
                    goto label_40;
                }
                catch(SQLiteException sQLiteException0) {
                }
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
            try {
            label_38:
                s3 = s5;
                goto label_46;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_38;
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
        label_40:
            cursor0.close();
            return list0;
            try {
                try {
                label_42:
                    s3 = s5;
                    goto label_24;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_46:
                this.zzj().zzg().zza("(2)Error querying user properties", zzfr.zza(s), s3, sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_49;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
        label_49:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_52:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_54:
        cursor0.close();
        return list0;
    }

    public final Bundle zzc(String s) {
        Bundle bundle0;
        com.google.android.gms.internal.measurement.zzfi.zze zzfi$zze0;
        Cursor cursor0;
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{s});
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_8:
            if(!cursor0.moveToFirst()) {
                this.zzj().zzp().zza("Default event parameters not found");
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_10:
        cursor0.close();
        return null;
        try {
        label_12:
            byte[] arr_b = cursor0.getBlob(0);
            try {
                zzfi$zze0 = (com.google.android.gms.internal.measurement.zzfi.zze)(((zzix)((zza)zzmz.zza(com.google.android.gms.internal.measurement.zzfi.zze.zze(), arr_b)).zzab()));
                goto label_19;
            }
            catch(IOException iOException0) {
            }
            this.zzj().zzg().zza("Failed to retrieve default event parameters. appId", zzfr.zza(s), iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        cursor0.close();
        return null;
        try {
            try {
            label_19:
                this.g_();
                bundle0 = new Bundle();
                Iterator iterator0 = zzfi$zze0.zzh().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_45;
                    }
                    Object object0 = iterator0.next();
                    zzg zzfi$zzg0 = (zzg)object0;
                    if(zzfi$zzg0.zzj()) {
                        bundle0.putDouble("", zzfi$zzg0.zza());
                    }
                    else if(zzfi$zzg0.zzk()) {
                        bundle0.putFloat("", zzfi$zzg0.zzb());
                    }
                    else if(zzfi$zzg0.zzn()) {
                        bundle0.putString("", "");
                    }
                    else {
                        if(!zzfi$zzg0.zzl()) {
                            continue;
                        }
                        bundle0.putLong("", zzfi$zzg0.zzd());
                    }
                }
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_38:
            this.zzj().zzg().zza("Error selecting default event parameters", sQLiteException0);
            if(cursor0 != null) {
                goto label_40;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_40:
        cursor0.close();
        return null;
    label_43:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_45:
        cursor0.close();
        return bundle0;
    }

    public final zzad zzc(String s, String s1) {
        zzad zzad0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_29;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    String s2 = cursor0.getString(0);
                    if(s2 == null) {
                        s2 = "";
                    }
                    Object object0 = this.zza(cursor0, 1);
                    boolean z = cursor0.getInt(2) != 0;
                    String s3 = cursor0.getString(3);
                    long v = cursor0.getLong(4);
                    Parcelable parcelable0 = this.g_().zza(cursor0.getBlob(5), zzbg.CREATOR);
                    long v1 = cursor0.getLong(6);
                    zzbg zzbg0 = (zzbg)this.g_().zza(cursor0.getBlob(7), zzbg.CREATOR);
                    long v2 = cursor0.getLong(8);
                    long v3 = cursor0.getLong(9);
                    Parcelable parcelable1 = this.g_().zza(cursor0.getBlob(10), zzbg.CREATOR);
                    zzad0 = new zzad(s, s2, new zznc(s1, v2, object0, s2), v1, z, s3, ((zzbg)parcelable0), v, zzbg0, v3, ((zzbg)parcelable1));
                    if(cursor0.moveToNext()) {
                        this.zzj().zzg().zza("Got multiple records for conditional property, expected one", zzfr.zza(s), this.zzi().zzc(s1));
                    }
                    goto label_36;
                }
                goto label_38;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_29:
            this.zzj().zzg().zza("Error querying conditional property", zzfr.zza(s), this.zzi().zzc(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_31;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_31:
        cursor0.close();
        return null;
    label_34:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_36:
        cursor0.close();
        return zzad0;
    label_38:
        cursor0.close();
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
    }

    public final zzbc zzd(String s, String s1) {
        zzbc zzbc0;
        Boolean boolean0;
        Cursor cursor0;
        boolean z;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzak();
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        try {
            z = false;
            cursor0 = null;
            cursor0 = this.e_().query("events", ((String[])arrayList0.toArray(new String[0])), "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_31;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_12:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(1);
                    long v2 = cursor0.getLong(2);
                    long v3 = cursor0.isNull(3) ? 0L : cursor0.getLong(3);
                    Long long0 = cursor0.isNull(4) ? null : cursor0.getLong(4);
                    Long long1 = cursor0.isNull(5) ? null : cursor0.getLong(5);
                    Long long2 = cursor0.isNull(6) ? null : cursor0.getLong(6);
                    if(cursor0.isNull(7)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getLong(7) == 1L) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    zzbc0 = new zzbc(s, s1, v, v1, (cursor0.isNull(8) ? 0L : cursor0.getLong(8)), v2, v3, long0, long1, long2, boolean0);
                    if(cursor0.moveToNext()) {
                        this.zzj().zzg().zza("Got multiple records for event aggregates, expected one. appId", zzfr.zza(s));
                    }
                    goto label_38;
                }
                goto label_40;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            this.zzj().zzg().zza("Error querying events. appId", zzfr.zza(s), this.zzi().zza(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_33;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
    label_33:
        cursor0.close();
        return null;
    label_36:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_38:
        cursor0.close();
        return zzbc0;
    label_40:
        cursor0.close();
        return null;
    }

    public final zzh zzd(String s) {
        Boolean boolean0;
        zzh zzh0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_63;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_9:
                if(cursor0.moveToFirst()) {
                    zzh0 = new zzh(this.zzf.zzk(), s);
                    boolean z = false;
                    zzh0.zzb(cursor0.getString(0));
                    zzh0.zzf(cursor0.getString(1));
                    zzh0.zzh(cursor0.getString(2));
                    zzh0.zzo(cursor0.getLong(3));
                    zzh0.zzp(cursor0.getLong(4));
                    zzh0.zzn(cursor0.getLong(5));
                    zzh0.zzd(cursor0.getString(6));
                    zzh0.zzc(cursor0.getString(7));
                    zzh0.zzm(cursor0.getLong(8));
                    zzh0.zzj(cursor0.getLong(9));
                    zzh0.zzb(cursor0.isNull(10) || cursor0.getInt(10) != 0);
                    zzh0.zzi(cursor0.getLong(11));
                    zzh0.zzg(cursor0.getLong(12));
                    zzh0.zzf(cursor0.getLong(13));
                    zzh0.zzd(cursor0.getLong(14));
                    zzh0.zzc(cursor0.getLong(15));
                    zzh0.zzl(cursor0.getLong(16));
                    zzh0.zza((cursor0.isNull(17) ? 0xFFFFFFFF80000000L : ((long)cursor0.getInt(17))));
                    zzh0.zze(cursor0.getString(18));
                    zzh0.zze(cursor0.getLong(19));
                    zzh0.zzh(cursor0.getLong(20));
                    zzh0.zzg(cursor0.getString(21));
                    zzh0.zza(cursor0.isNull(23) || cursor0.getInt(23) != 0);
                    zzh0.zza(cursor0.getString(24));
                    zzh0.zzk((cursor0.isNull(25) ? 0L : cursor0.getLong(25)));
                    if(!cursor0.isNull(26)) {
                        zzh0.zza(Arrays.asList(cursor0.getString(26).split(",", -1)));
                    }
                    if(zzps.zza() && (this.zze().zze(s, zzbi.zzbt) || this.zze().zza(zzbi.zzbr))) {
                        zzh0.zzi(cursor0.getString(28));
                    }
                    if(zzqd.zza() && this.zze().zza(zzbi.zzbu)) {
                        zzh0.zzc(!cursor0.isNull(29) && cursor0.getInt(29) != 0);
                    }
                    zzh0.zzr(cursor0.getLong(30));
                    zzh0.zzq(cursor0.getLong(0x1F));
                    if(zzpg.zza() && this.zze().zze(s, zzbi.zzcf)) {
                        zzh0.zza(cursor0.getInt(0x20));
                        zzh0.zzb(cursor0.getLong(35));
                    }
                    if(zznk.zza() && this.zze().zze(s, zzbi.zzcr)) {
                        zzh0.zzd(!cursor0.isNull(33) && cursor0.getInt(33) != 0);
                    }
                    if(zznp.zza() && this.zze().zze(s, zzbi.zzcm)) {
                        if(cursor0.isNull(34)) {
                            boolean0 = null;
                        }
                        else {
                            if(cursor0.getInt(34) != 0) {
                                z = true;
                            }
                            boolean0 = Boolean.valueOf(z);
                        }
                        zzh0.zza(boolean0);
                    }
                    zzh0.zzah();
                    if(cursor0.moveToNext()) {
                        this.zzj().zzg().zza("Got multiple records for app, expected one. appId", zzfr.zza(s));
                    }
                    goto label_70;
                }
                goto label_72;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_63:
            this.zzj().zzg().zza("Error querying app. appId", zzfr.zza(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_65;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_68;
        }
    label_65:
        cursor0.close();
        return null;
    label_68:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_70:
        cursor0.close();
        return zzh0;
    label_72:
        cursor0.close();
        return null;
    }

    public final zzaq zze(String s) {
        zzaq zzaq0;
        String s2;
        String s1;
        byte[] arr_b;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_9:
            if(cursor0.moveToFirst()) {
                arr_b = cursor0.getBlob(0);
                s1 = cursor0.getString(1);
                s2 = cursor0.getString(2);
                if(cursor0.moveToNext()) {
                    this.zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzfr.zza(s));
                }
                goto label_15;
            }
            goto label_30;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_15:
        if(arr_b == null) {
            cursor0.close();
            return null;
        }
        try {
            try {
                zzaq0 = new zzaq(arr_b, s1, s2);
                goto label_28;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_21:
            this.zzj().zzg().zza("Error querying remote config. appId", zzfr.zza(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_23;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_23:
        cursor0.close();
        return null;
    label_26:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_28:
        cursor0.close();
        return zzaq0;
    label_30:
        cursor0.close();
        return null;
    }

    public final zzne zze(String s, String s1) {
        zzne zzne0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzak();
        try {
            cursor0 = null;
            cursor0 = this.e_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_19;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    Object object0 = this.zza(cursor0, 1);
                    if(object0 != null) {
                        zzne0 = new zzne(s, cursor0.getString(2), s1, v, object0);
                        if(cursor0.moveToNext()) {
                            this.zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzfr.zza(s));
                        }
                        goto label_26;
                    }
                    goto label_28;
                }
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_19:
            this.zzj().zzg().zza("Error querying user property. appId", zzfr.zza(s), this.zzi().zzc(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_21;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
    label_21:
        cursor0.close();
        return null;
    label_24:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_26:
        cursor0.close();
        return zzne0;
    label_28:
        cursor0.close();
        return null;
    label_30:
        cursor0.close();
        return null;
    }

    public final zzay zzf(String s) {
        if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
            Preconditions.checkNotNull(s);
            this.zzt();
            this.zzak();
            return zzay.zza(this.zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{s}, ""));
        }
        return zzay.zza;
    }

    final Map zzf(String s, String s1) {
        Map map2;
        zzb zzew$zzb0;
        Map map1;
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        Map map0 = new a();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{s, s1}, null, null, null);
            if(!cursor0.moveToFirst()) {
                map1 = Collections.emptyMap();
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
    label_10:
        cursor0.close();
        return map1;
        try {
            do {
            label_12:
                byte[] arr_b = cursor0.getBlob(1);
                try {
                    zzew$zzb0 = (zzb)(((zzix)((com.google.android.gms.internal.measurement.zzew.zzb.zza)zzmz.zza(zzb.zzc(), arr_b)).zzab()));
                }
                catch(IOException iOException0) {
                    this.zzj().zzg().zza("Failed to merge filter. appId", zzfr.zza(s), iOException0);
                    continue;
                }
                int v = cursor0.getInt(0);
                List list0 = (List)map0.get(v);
                if(list0 == null) {
                    list0 = new ArrayList();
                    map0.put(v, list0);
                }
                list0.add(zzew$zzb0);
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_27:
                this.zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(s), sQLiteException0);
                map2 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_30;
                }
                return map2;
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
        label_30:
            cursor0.close();
            return map2;
        }
        catch(Throwable throwable0) {
        label_33:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    public final zzih zzg(String s) {
        Preconditions.checkNotNull(s);
        this.zzt();
        this.zzak();
        if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
            zzih zzih0 = (zzih)this.zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{s}, (Cursor cursor0) -> zzih.zza(cursor0.getString(0), cursor0.getInt(1)));
            return zzih0 == null ? zzih.zza : zzih0;
        }
        return zzih.zza(this.zza("select consent_state from consent_settings where app_id=? limit 1;", new String[]{s}, "G1"));
    }

    final Map zzg(String s, String s1) {
        Map map2;
        zze zzew$zze0;
        Map map1;
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        Map map0 = new a();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{s, s1}, null, null, null);
            if(!cursor0.moveToFirst()) {
                map1 = Collections.emptyMap();
                goto label_10;
            }
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
    label_10:
        cursor0.close();
        return map1;
        try {
            do {
            label_12:
                byte[] arr_b = cursor0.getBlob(1);
                try {
                    zzew$zze0 = (zze)(((zzix)((com.google.android.gms.internal.measurement.zzew.zze.zza)zzmz.zza(zze.zzc(), arr_b)).zzab()));
                }
                catch(IOException iOException0) {
                    this.zzj().zzg().zza("Failed to merge filter", zzfr.zza(s), iOException0);
                    continue;
                }
                int v = cursor0.getInt(0);
                List list0 = (List)map0.get(v);
                if(list0 == null) {
                    list0 = new ArrayList();
                    map0.put(v, list0);
                }
                list0.add(zzew$zze0);
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_27:
                this.zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(s), sQLiteException0);
                map2 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_30;
                }
                return map2;
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
        label_30:
            cursor0.close();
            return map2;
        }
        catch(Throwable throwable0) {
        label_33:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    public final List zzh(String s) {
        List list1;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{s}, null, null, "rowid", null);
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    if(s1 == null) {
                        s1 = "";
                    }
                    list0.add(new zzmh(s1, cursor0.getLong(1), cursor0.getInt(2)));
                }
                while(cursor0.moveToNext());
                goto label_22;
            }
            goto label_24;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzj().zzg().zza("Error querying trigger uris. appId", zzfr.zza(s), sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_17;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
        label_17:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_20:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_22:
        cursor0.close();
        return list0;
    label_24:
        cursor0.close();
        return list0;
    }

    public final void zzh(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzt();
        this.zzak();
        try {
            this.e_().delete("user_attributes", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzj().zzg().zza("Error deleting user property. appId", zzfr.zza(s), this.zzi().zzc(s1), sQLiteException0);
        }
    }

    public final List zzi(String s) {
        List list1;
        Preconditions.checkNotEmpty(s);
        this.zzt();
        this.zzak();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{s}, null, null, "rowid", "1000");
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    if(s2 == null) {
                        s2 = "";
                    }
                    long v = cursor0.getLong(2);
                    Object object0 = this.zza(cursor0, 3);
                    if(object0 == null) {
                        this.zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzfr.zza(s));
                    }
                    else {
                        list0.add(new zzne(s, s2, s1, v, object0));
                    }
                }
                while(cursor0.moveToNext());
                goto label_28;
            }
            goto label_30;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzj().zzg().zza("Error querying user properties. appId", zzfr.zza(s), sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_23;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
        label_23:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_26:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_28:
        cursor0.close();
        return list0;
    label_30:
        cursor0.close();
        return list0;
    }

    final Map zzj(String s) {
        Map map2;
        Map map1;
        zzl zzfi$zzl0;
        Map map0;
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                map0 = new a();
                while(true) {
                    int v = cursor0.getInt(0);
                    byte[] arr_b = cursor0.getBlob(1);
                    try {
                        zzfi$zzl0 = (zzl)(((zzix)((com.google.android.gms.internal.measurement.zzfi.zzl.zza)zzmz.zza(zzl.zze(), arr_b)).zzab()));
                    }
                    catch(IOException iOException0) {
                        this.zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzfr.zza(s), v, iOException0);
                        goto label_16;
                    }
                    map0.put(v, zzfi$zzl0);
                label_16:
                    if(cursor0.moveToNext()) {
                        continue;
                    }
                    goto label_17;
                }
            }
            goto label_19;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_22;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_17:
        cursor0.close();
        return map0;
        try {
            try {
            label_19:
                map1 = Collections.emptyMap();
                goto label_30;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_22:
            this.zzj().zzg().zza("Database error querying filter results. appId", zzfr.zza(s), sQLiteException0);
            map2 = Collections.emptyMap();
            if(cursor0 != null) {
                goto label_25;
            }
            return map2;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_25:
        cursor0.close();
        return map2;
    label_28:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_30:
        cursor0.close();
        return map1;
    }

    final Map zzk(String s) {
        Map map2;
        zzb zzew$zzb0;
        Map map1;
        Preconditions.checkNotEmpty(s);
        Map map0 = new a();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{s}, null, null, null);
            if(!cursor0.moveToFirst()) {
                map1 = Collections.emptyMap();
                goto label_7;
            }
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_25;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
    label_7:
        cursor0.close();
        return map1;
        try {
            do {
            label_9:
                byte[] arr_b = cursor0.getBlob(1);
                try {
                    zzew$zzb0 = (zzb)(((zzix)((com.google.android.gms.internal.measurement.zzew.zzb.zza)zzmz.zza(zzb.zzc(), arr_b)).zzab()));
                }
                catch(IOException iOException0) {
                    this.zzj().zzg().zza("Failed to merge filter. appId", zzfr.zza(s), iOException0);
                    continue;
                }
                if(zzew$zzb0.zzk()) {
                    int v = cursor0.getInt(0);
                    List list0 = (List)map0.get(v);
                    if(list0 == null) {
                        list0 = new ArrayList();
                        map0.put(v, list0);
                    }
                    list0.add(zzew$zzb0);
                }
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_25:
                this.zzj().zzg().zza("Database error querying filters. appId", zzfr.zza(s), sQLiteException0);
                map2 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_28;
                }
                return map2;
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
        label_28:
            cursor0.close();
            return map2;
        }
        catch(Throwable throwable0) {
        label_31:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }

    final Map zzl(String s) {
        Map map2;
        Map map1;
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        Map map0 = new a();
        SQLiteDatabase sQLiteDatabase0 = this.e_();
        Cursor cursor0 = null;
        try {
            cursor0 = sQLiteDatabase0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{s, s});
            if(cursor0.moveToFirst()) {
                while(true) {
                    int v = cursor0.getInt(0);
                    List list0 = (List)map0.get(v);
                    if(list0 == null) {
                        list0 = new ArrayList();
                        map0.put(v, list0);
                    }
                    list0.add(cursor0.getInt(1));
                    if(cursor0.moveToNext()) {
                        continue;
                    }
                    goto label_15;
                }
            }
            goto label_17;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_15:
        cursor0.close();
        return map0;
        try {
            try {
            label_17:
                map1 = Collections.emptyMap();
                goto label_28;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_20:
            this.zzj().zzg().zza("Database error querying scoped filters. appId", zzfr.zza(s), sQLiteException0);
            map2 = Collections.emptyMap();
            if(cursor0 != null) {
                goto label_23;
            }
            return map2;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_23:
        cursor0.close();
        return map2;
    label_26:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_28:
        cursor0.close();
        return map1;
    }

    public final void zzp() {
        this.zzak();
        this.e_().beginTransaction();
    }

    public final void zzu() {
        this.zzak();
        this.e_().endTransaction();
    }

    final void zzv() {
        this.zzt();
        this.zzak();
        if(!this.zzan()) {
            return;
        }
        long v = this.zzn().zza.zza();
        long v1 = this.zzb().elapsedRealtime();
        if(Math.abs(v1 - v) > ((long)(((Long)zzbi.zzy.zza(null))))) {
            this.zzn().zza.zza(v1);
            this.zzt();
            this.zzak();
            if(this.zzan()) {
                int v2 = this.e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzb().currentTimeMillis()), "2419200000"});
                if(v2 > 0) {
                    this.zzj().zzp().zza("Deleted stale rows. rowsDeleted", v2);
                }
            }
        }
    }

    public final void zzw() {
        this.zzak();
        this.e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return this.zzb("select count(1) > 0 from raw_events", null) != 0L;
    }

    public final boolean zzy() {
        return this.zzb("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
    }

    public final boolean zzz() {
        return this.zzb("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
    }
}

