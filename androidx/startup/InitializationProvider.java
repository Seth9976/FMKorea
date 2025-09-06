package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import n0.c;

public class InitializationProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final String getType(Uri uri0) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new c("Context cannot be null");
        }
        if(context0.getApplicationContext() != null) {
            a.e(context0).a();
        }
        return true;
    }

    @Override  // android.content.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new IllegalStateException("Not allowed.");
    }
}

