package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.F;
import com.facebook.internal.G;
import com.facebook.internal.v;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class p {
    private String a;
    private SharedPreferences b;
    private static final String c = "p";

    static {
    }

    public p(Context context0) {
        this(context0, null);
    }

    public p(Context context0, String s) {
        G.i(context0, "context");
        if(F.P(s)) {
            s = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.a = s;
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        this.b = context0.getSharedPreferences(this.a, 0);
    }

    public void a() {
        this.b.edit().clear().apply();
    }

    private void b(String s, Bundle bundle0) {
        int v = 0;
        JSONObject jSONObject0 = new JSONObject(this.b.getString(s, "{}"));
        String s1 = jSONObject0.getString("valueType");
        if(s1.equals("bool")) {
            bundle0.putBoolean(s, jSONObject0.getBoolean("value"));
            return;
        }
        if(s1.equals("bool[]")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("value");
            int v1 = jSONArray0.length();
            boolean[] arr_z = new boolean[v1];
            while(v < v1) {
                arr_z[v] = jSONArray0.getBoolean(v);
                ++v;
            }
            bundle0.putBooleanArray(s, arr_z);
            return;
        }
        if(s1.equals("byte")) {
            bundle0.putByte(s, ((byte)jSONObject0.getInt("value")));
            return;
        }
        if(s1.equals("byte[]")) {
            JSONArray jSONArray1 = jSONObject0.getJSONArray("value");
            int v2 = jSONArray1.length();
            byte[] arr_b = new byte[v2];
            while(v < v2) {
                arr_b[v] = (byte)jSONArray1.getInt(v);
                ++v;
            }
            bundle0.putByteArray(s, arr_b);
            return;
        }
        if(s1.equals("short")) {
            bundle0.putShort(s, ((short)jSONObject0.getInt("value")));
            return;
        }
        if(s1.equals("short[]")) {
            JSONArray jSONArray2 = jSONObject0.getJSONArray("value");
            int v3 = jSONArray2.length();
            short[] arr_v = new short[v3];
            while(v < v3) {
                arr_v[v] = (short)jSONArray2.getInt(v);
                ++v;
            }
            bundle0.putShortArray(s, arr_v);
            return;
        }
        if(s1.equals("int")) {
            bundle0.putInt(s, jSONObject0.getInt("value"));
            return;
        }
        if(s1.equals("int[]")) {
            JSONArray jSONArray3 = jSONObject0.getJSONArray("value");
            int v4 = jSONArray3.length();
            int[] arr_v1 = new int[v4];
            while(v < v4) {
                arr_v1[v] = jSONArray3.getInt(v);
                ++v;
            }
            bundle0.putIntArray(s, arr_v1);
            return;
        }
        if(s1.equals("long")) {
            bundle0.putLong(s, jSONObject0.getLong("value"));
            return;
        }
        if(s1.equals("long[]")) {
            JSONArray jSONArray4 = jSONObject0.getJSONArray("value");
            int v5 = jSONArray4.length();
            long[] arr_v2 = new long[v5];
            while(v < v5) {
                arr_v2[v] = jSONArray4.getLong(v);
                ++v;
            }
            bundle0.putLongArray(s, arr_v2);
            return;
        }
        if(s1.equals("float")) {
            bundle0.putFloat(s, ((float)jSONObject0.getDouble("value")));
            return;
        }
        if(s1.equals("float[]")) {
            JSONArray jSONArray5 = jSONObject0.getJSONArray("value");
            int v6 = jSONArray5.length();
            float[] arr_f = new float[v6];
            while(v < v6) {
                arr_f[v] = (float)jSONArray5.getDouble(v);
                ++v;
            }
            bundle0.putFloatArray(s, arr_f);
            return;
        }
        if(s1.equals("double")) {
            bundle0.putDouble(s, jSONObject0.getDouble("value"));
            return;
        }
        if(s1.equals("double[]")) {
            JSONArray jSONArray6 = jSONObject0.getJSONArray("value");
            int v7 = jSONArray6.length();
            double[] arr_f1 = new double[v7];
            while(v < v7) {
                arr_f1[v] = jSONArray6.getDouble(v);
                ++v;
            }
            bundle0.putDoubleArray(s, arr_f1);
            return;
        }
        if(s1.equals("char")) {
            String s2 = jSONObject0.getString("value");
            if(s2 != null && s2.length() == 1) {
                bundle0.putChar(s, s2.charAt(0));
            }
        }
        else {
            if(s1.equals("char[]")) {
                JSONArray jSONArray7 = jSONObject0.getJSONArray("value");
                int v8 = jSONArray7.length();
                char[] arr_c = new char[v8];
                for(int v9 = 0; v9 < v8; ++v9) {
                    String s3 = jSONArray7.getString(v9);
                    if(s3 != null && s3.length() == 1) {
                        arr_c[v9] = s3.charAt(0);
                    }
                }
                bundle0.putCharArray(s, arr_c);
                return;
            }
            if(s1.equals("string")) {
                bundle0.putString(s, jSONObject0.getString("value"));
                return;
            }
            if(s1.equals("stringList")) {
                JSONArray jSONArray8 = jSONObject0.getJSONArray("value");
                int v10 = jSONArray8.length();
                ArrayList arrayList0 = new ArrayList(v10);
                while(v < v10) {
                    Object object0 = jSONArray8.get(v);
                    arrayList0.add(v, (object0 == JSONObject.NULL ? null : ((String)object0)));
                    ++v;
                }
                bundle0.putStringArrayList(s, arrayList0);
                return;
            }
            if(s1.equals("enum")) {
                try {
                    bundle0.putSerializable(s, Enum.valueOf(Class.forName(jSONObject0.getString("enumType")), jSONObject0.getString("value")));
                }
                catch(ClassNotFoundException | IllegalArgumentException unused_ex) {
                }
            }
        }
    }

    public static String c(Bundle bundle0) {
        G.i(bundle0, "bundle");
        return bundle0.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    static Date d(Bundle bundle0, String s) {
        if(bundle0 == null) {
            return null;
        }
        long v = bundle0.getLong(s, 0x8000000000000000L);
        return v == 0x8000000000000000L ? null : new Date(v);
    }

    public static c e(Bundle bundle0) {
        G.i(bundle0, "bundle");
        if(bundle0.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
            return (c)bundle0.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        return bundle0.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? c.h : c.k;
    }

    public static String f(Bundle bundle0) {
        G.i(bundle0, "bundle");
        return bundle0.getString("com.facebook.TokenCachingStrategy.Token");
    }

    public static boolean g(Bundle bundle0) {
        if(bundle0 == null) {
            return false;
        }
        String s = bundle0.getString("com.facebook.TokenCachingStrategy.Token");
        return s != null && s.length() != 0 && bundle0.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L;
    }

    public Bundle h() {
        Bundle bundle0 = new Bundle();
        for(Object object0: this.b.getAll().keySet()) {
            String s = (String)object0;
            try {
                this.b(s, bundle0);
            }
            catch(JSONException jSONException0) {
                v.f(q.i, 5, "p", "Error reading cached value for key: \'" + s + "\' -- " + jSONException0);
                return null;
            }
        }
        return bundle0;
    }
}

