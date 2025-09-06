package g3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import e3.b;
import z3.k;

public final class i {
    public final void a(SQLiteDatabase sQLiteDatabase0) {
        k.e(sQLiteDatabase0, "db");
        try {
            sQLiteDatabase0.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase0.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase0.execSQL("INSERT INTO cached_unique_outcome(_id,name,channel_influence_id) SELECT _id,name,notification_id FROM cached_unique_outcome_notification" + ';');
            sQLiteDatabase0.execSQL("UPDATE cached_unique_outcome SET channel_type = \'" + b.i + "\';");
            sQLiteDatabase0.execSQL("DROP TABLE cached_unique_outcome_notification" + ';');
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException0.printStackTrace();
        }
        finally {
            sQLiteDatabase0.execSQL("COMMIT;");
        }
    }

    public final void b(SQLiteDatabase sQLiteDatabase0) {
        k.e(sQLiteDatabase0, "db");
        try {
            sQLiteDatabase0.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase0.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
            sQLiteDatabase0.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
            sQLiteDatabase0.execSQL("DROP TABLE outcome;");
            sQLiteDatabase0.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase0.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
            sQLiteDatabase0.execSQL("DROP TABLE outcome_backup;");
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException0.printStackTrace();
        }
        finally {
            sQLiteDatabase0.execSQL("COMMIT;");
        }
    }

    public final void c(SQLiteDatabase sQLiteDatabase0) {
        k.e(sQLiteDatabase0, "db");
        try {
            sQLiteDatabase0.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase0.execSQL("ALTER TABLE outcome RENAME TO outcome_aux" + ';');
            sQLiteDatabase0.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase0.execSQL("INSERT INTO outcome(_id,name,timestamp,notification_ids,weight,notification_influence_type) SELECT _id,name,timestamp,notification_ids,weight,session FROM outcome_aux" + ';');
            sQLiteDatabase0.execSQL("DROP TABLE outcome_aux" + ';');
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException0.printStackTrace();
        }
        finally {
            sQLiteDatabase0.execSQL("COMMIT;");
        }
    }
}

