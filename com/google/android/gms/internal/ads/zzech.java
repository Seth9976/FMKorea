package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzech extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfyo zzb;

    public zzech(Context context0, zzfyo zzfyo0) {
        super(context0, "AdMobOfflineBufferedPings.db", null, ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhZ)))));
        this.zza = context0;
        this.zzb = zzfyo0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final Void zza(zzecj zzecj0, SQLiteDatabase sQLiteDatabase0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("timestamp", zzecj0.zza);
        contentValues0.put("gws_query_id", zzecj0.zzb);
        contentValues0.put("url", zzecj0.zzc);
        contentValues0.put("event_state", ((int)(zzecj0.zzd - 1)));
        sQLiteDatabase0.insert("offline_buffered_pings", null, contentValues0);
        zzbr zzbr0 = zzs.zzw(this.zza);
        if(zzbr0 != null) {
            try {
                zzbr0.zze(ObjectWrapper.wrap(this.zza));
                return null;
            }
            catch(RemoteException remoteException0) {
                zze.zzb("Failed to schedule offline ping sender.", remoteException0);
            }
        }
        return null;
    }

    static Void zzb(zzcaf zzcaf0, SQLiteDatabase sQLiteDatabase0) {
        zzech.zzj(sQLiteDatabase0, zzcaf0);
        return null;
    }

    public final void zzc(String s) {
        this.zze(new zzece(this, s));
    }

    public final void zzd(zzecj zzecj0) {
        this.zze(new zzecc(this, zzecj0));
    }

    final void zze(zzffh zzffh0) {
        zzeca zzeca0 = new zzeca(this);
        zzfye.zzr(this.zzb.zzb(zzeca0), new zzecg(this, zzffh0), this.zzb);
    }

    // 检测为 Lambda 实现
    static void zzf(SQLiteDatabase sQLiteDatabase0, String s, zzcaf zzcaf0) [...]

    final void zzg(SQLiteDatabase sQLiteDatabase0, zzcaf zzcaf0, String s) {
        zzecb zzecb0 = () -> {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("event_state", 1);
            sQLiteDatabase0.update("offline_buffered_pings", contentValues0, "gws_query_id = ?", new String[]{s});
            zzech.zzj(sQLiteDatabase0, zzcaf0);
        };
        this.zzb.execute(zzecb0);
    }

    public final void zzh(zzcaf zzcaf0, String s) {
        this.zze(new zzecf(this, zzcaf0, s));
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{s, "0"});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase0, zzcaf zzcaf0) {
        String[] arr_s;
        sQLiteDatabase0.beginTransaction();
        try {
            Cursor cursor0 = sQLiteDatabase0.query("offline_buffered_pings", new String[]{"url"}, "event_state = " + 1, null, null, null, "timestamp ASC", null);
            int v1 = cursor0.getCount();
            arr_s = new String[v1];
            for(int v3 = 0; cursor0.moveToNext(); ++v3) {
                int v4 = cursor0.getColumnIndex("url");
                if(v4 != -1) {
                    arr_s[v3] = cursor0.getString(v4);
                }
            }
            cursor0.close();
            sQLiteDatabase0.delete("offline_buffered_pings", "event_state = ?", new String[]{"1"});
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            zzcaf0.zza(arr_s[v2]);
        }
    }
}

