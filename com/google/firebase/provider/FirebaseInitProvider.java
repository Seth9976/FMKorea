package com.google.firebase.provider;

import a2.e;
import a2.m;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseInitProvider extends ContentProvider {
    private static m f;
    private static AtomicBoolean g;

    static {
        FirebaseInitProvider.f = m.e();
        FirebaseInitProvider.g = new AtomicBoolean(false);
    }

    private static void a(ProviderInfo providerInfo0) {
        Preconditions.checkNotNull(providerInfo0, "FirebaseInitProvider ProviderInfo cannot be null.");
        if("com.google.firebase.firebaseinitprovider".equals(providerInfo0.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application\'s build.gradle.");
        }
    }

    @Override  // android.content.ContentProvider
    public void attachInfo(Context context0, ProviderInfo providerInfo0) {
        FirebaseInitProvider.a(providerInfo0);
        super.attachInfo(context0, providerInfo0);
    }

    public static m b() {
        return FirebaseInitProvider.f;
    }

    public static boolean c() {
        return FirebaseInitProvider.g.get();
    }

    @Override  // android.content.ContentProvider
    public int delete(Uri uri0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    public String getType(Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public Uri insert(Uri uri0, ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        try {
            FirebaseInitProvider.g.set(true);
            if(e.p(this.getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            }
            else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        }
        finally {
            FirebaseInitProvider.g.set(false);
        }
    }

    @Override  // android.content.ContentProvider
    public Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return 0;
    }
}

