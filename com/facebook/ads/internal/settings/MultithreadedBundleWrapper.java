package com.facebook.ads.internal.settings;

import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public class MultithreadedBundleWrapper {
    private final Bundle mBundle;

    public MultithreadedBundleWrapper() {
        this.mBundle = new Bundle();
    }

    public boolean getBoolean(String s) {
        synchronized(this) {
            return this.mBundle.getBoolean(s);
        }
    }

    public boolean getBoolean(String s, boolean z) {
        synchronized(this) {
            return this.mBundle.getBoolean(s, z);
        }
    }

    public Integer getInteger(String s) {
        synchronized(this) {
            return this.mBundle.containsKey(s) ? this.mBundle.getInt(s) : null;
        }
    }

    public Serializable getSerializable(String s) {
        synchronized(this) {
            return this.mBundle.getSerializable(s);
        }
    }

    public String getString(String s, String s1) {
        synchronized(this) {
            return this.mBundle.getString(s, s1);
        }
    }

    public String[] getStringArray(String s) {
        synchronized(this) {
            return this.mBundle.getStringArray(s);
        }
    }

    public ArrayList getStringArrayList(String s) {
        synchronized(this) {
            return this.mBundle.getStringArrayList(s);
        }
    }

    public void putBoolean(String s, boolean z) {
        synchronized(this) {
            this.mBundle.putBoolean(s, z);
        }
    }

    public void putInteger(String s, Integer integer0) {
        synchronized(this) {
            if(integer0 == null) {
                this.mBundle.remove(s);
            }
            else {
                this.mBundle.putInt(s, ((int)integer0));
            }
        }
    }

    public void putSerializable(String s, Serializable serializable0) {
        synchronized(this) {
            this.mBundle.putSerializable(s, serializable0);
        }
    }

    public void putString(String s, String s1) {
        synchronized(this) {
            this.mBundle.putString(s, s1);
        }
    }

    public void putStringArray(String s, String[] arr_s) {
        synchronized(this) {
            this.mBundle.putStringArray(s, arr_s);
        }
    }

    public void putStringArrayList(String s, ArrayList arrayList0) {
        synchronized(this) {
            this.mBundle.putStringArrayList(s, arrayList0);
        }
    }

    public void reset(Bundle bundle0) {
        synchronized(this) {
            this.mBundle.clear();
            this.mBundle.putAll(bundle0);
        }
    }

    public Bundle toBundle() {
        return new Bundle(this.mBundle);
    }
}

