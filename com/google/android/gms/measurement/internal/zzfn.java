package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

final class zzfn extends SQLiteOpenHelper {
    private final zzfo zza;

    zzfn(zzfo zzfo0, Context context0, String s) {
        this.zza = zzfo0;
        super(context0, s, null, 1);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        }
        catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            throw sQLiteDatabaseLockedException0;
        }
        catch(SQLiteException unused_ex) {
            this.zza.zzj().zzg().zza("Opening the local database failed, dropping and recreating it");
            if(!this.zza.zza().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.zza.zzj().zzg().zza("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteException sQLiteException0) {
                this.zza.zzj().zzg().zza("Failed to open local database. Events will bypass local storage", sQLiteException0);
                return null;
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        zzat.zza(this.zza.zzj(), sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        zzat.zza(this.zza.zzj(), sQLiteDatabase0, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

