package h1;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import b1.a;
import com.facebook.AccessToken;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.GraphRequest.e;
import com.facebook.GraphRequest;
import com.facebook.internal.F;
import com.facebook.o;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {
    public static Pair a(String s) {
        String s1;
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            int v = s.indexOf(58);
            if(v == -1 || s.length() <= v + 1) {
                s1 = null;
            }
            else {
                s1 = s.substring(0, v);
                s = s.substring(v + 1);
            }
            return new Pair(s1, s);
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static GraphRequest b(AccessToken accessToken0, Uri uri0, e graphRequest$e0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            if(F.O(uri0)) {
                return b.c(accessToken0, new File(uri0.getPath()), graphRequest$e0);
            }
            if(!F.L(uri0)) {
                throw new com.facebook.e("The image Uri must be either a file:// or content:// Uri");
            }
            ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType0 = new ParcelableResourceWithMimeType(uri0, "image/png");
            Bundle bundle0 = new Bundle(1);
            bundle0.putParcelable("file", graphRequest$ParcelableResourceWithMimeType0);
            return new GraphRequest(accessToken0, "me/staging_resources", bundle0, o.g, graphRequest$e0);
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static GraphRequest c(AccessToken accessToken0, File file0, e graphRequest$e0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType0 = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file0, 0x10000000), "image/png");
            Bundle bundle0 = new Bundle(1);
            bundle0.putParcelable("file", graphRequest$ParcelableResourceWithMimeType0);
            return new GraphRequest(accessToken0, "me/staging_resources", bundle0, o.g, graphRequest$e0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    public static JSONArray d(JSONArray jSONArray0, boolean z) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            JSONArray jSONArray1 = new JSONArray();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                Object object0 = jSONArray0.get(v);
                if(object0 instanceof JSONArray) {
                    object0 = b.d(((JSONArray)object0), z);
                }
                else if(object0 instanceof JSONObject) {
                    object0 = b.e(((JSONObject)object0), z);
                }
                jSONArray1.put(object0);
            }
            return jSONArray1;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static JSONObject e(JSONObject jSONObject0, boolean z) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        if(jSONObject0 == null) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject1 = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray0 = jSONObject0.names();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s = jSONArray0.getString(v);
                    Object object0 = jSONObject0.get(s);
                    if(object0 instanceof JSONObject) {
                        object0 = b.e(((JSONObject)object0), true);
                    }
                    else if(object0 instanceof JSONArray) {
                        object0 = b.d(((JSONArray)object0), true);
                    }
                    Pair pair0 = b.a(s);
                    String s1 = (String)pair0.first;
                    String s2 = (String)pair0.second;
                    if(z) {
                        if(s1 != null && s1.equals("fbsdk")) {
                            jSONObject1.put(s, object0);
                        }
                        else if(s1 == null || s1.equals("og")) {
                            jSONObject1.put(s2, object0);
                        }
                        else {
                            jSONObject2.put(s2, object0);
                        }
                    }
                    else if(s1 == null || !s1.equals("fb")) {
                        jSONObject1.put(s2, object0);
                    }
                    else {
                        jSONObject1.put(s, object0);
                    }
                }
                if(jSONObject2.length() > 0) {
                    jSONObject1.put("data", jSONObject2);
                }
                return jSONObject1;
            }
            catch(JSONException unused_ex) {
                throw new com.facebook.e("Failed to create json object from share content");
            }
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static JSONObject f(ShareOpenGraphContent shareOpenGraphContent0) {
        static final class h1.b.a implements h1.a.a {
            @Override  // h1.a$a
            public JSONObject a(SharePhoto sharePhoto0) {
                Uri uri0 = sharePhoto0.a();
                if(F.R(uri0)) {
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("url", uri0.toString());
                        return jSONObject0;
                    }
                    catch(JSONException jSONException0) {
                        throw new com.facebook.e("Unable to attach images", jSONException0);
                    }
                }
                throw new com.facebook.e("Only web images may be used in OG objects shared via the web dialog");
            }
        }

        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return h1.a.b(shareOpenGraphContent0.d(), new h1.b.a());
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }
}

