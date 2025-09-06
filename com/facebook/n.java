package com.facebook;

import android.util.Log;
import com.facebook.internal.F;
import com.facebook.internal.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class n {
    private final HttpURLConnection a;
    private final JSONObject b;
    private final JSONArray c;
    private final FacebookRequestError d;
    private final String e;
    private final GraphRequest f;
    private static final String g = "n";

    static {
    }

    public n(GraphRequest graphRequest0, HttpURLConnection httpURLConnection0, FacebookRequestError facebookRequestError0) {
        this(graphRequest0, httpURLConnection0, null, null, null, facebookRequestError0);
    }

    public n(GraphRequest graphRequest0, HttpURLConnection httpURLConnection0, String s, JSONArray jSONArray0) {
        this(graphRequest0, httpURLConnection0, s, null, jSONArray0, null);
    }

    public n(GraphRequest graphRequest0, HttpURLConnection httpURLConnection0, String s, JSONObject jSONObject0) {
        this(graphRequest0, httpURLConnection0, s, jSONObject0, null, null);
    }

    n(GraphRequest graphRequest0, HttpURLConnection httpURLConnection0, String s, JSONObject jSONObject0, JSONArray jSONArray0, FacebookRequestError facebookRequestError0) {
        this.f = graphRequest0;
        this.a = httpURLConnection0;
        this.e = s;
        this.b = jSONObject0;
        this.c = jSONArray0;
        this.d = facebookRequestError0;
    }

    static List a(List list0, HttpURLConnection httpURLConnection0, e e0) {
        int v = list0.size();
        List list1 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(new n(((GraphRequest)list0.get(v1)), httpURLConnection0, new FacebookRequestError(httpURLConnection0, e0)));
        }
        return list1;
    }

    private static n b(GraphRequest graphRequest0, HttpURLConnection httpURLConnection0, Object object0, Object object1) {
        if(object0 instanceof JSONObject) {
            FacebookRequestError facebookRequestError0 = FacebookRequestError.a(((JSONObject)object0), object1, httpURLConnection0);
            if(facebookRequestError0 != null) {
                Log.e("n", facebookRequestError0.toString());
                if(facebookRequestError0.c() == 190 && F.M(graphRequest0.q())) {
                    if(facebookRequestError0.h() != 493) {
                        AccessToken.w(null);
                        return new n(graphRequest0, httpURLConnection0, facebookRequestError0);
                    }
                    if(!AccessToken.g().u()) {
                        AccessToken.e();
                    }
                }
                return new n(graphRequest0, httpURLConnection0, facebookRequestError0);
            }
            Object object2 = F.C(((JSONObject)object0), "body", "FACEBOOK_NON_JSON_RESULT");
            if(object2 instanceof JSONObject) {
                return new n(graphRequest0, httpURLConnection0, object2.toString(), ((JSONObject)object2));
            }
            if(object2 instanceof JSONArray) {
                return new n(graphRequest0, httpURLConnection0, object2.toString(), ((JSONArray)object2));
            }
            object0 = JSONObject.NULL;
        }
        if(object0 != JSONObject.NULL) {
            throw new e("Got unexpected object type in response, class: " + object0.getClass().getSimpleName());
        }
        return new n(graphRequest0, httpURLConnection0, object0.toString(), null);
    }

    private static List c(HttpURLConnection httpURLConnection0, List list0, Object object0) {
        JSONArray jSONArray0;
        int v = list0.size();
        List list1 = new ArrayList(v);
        if(v == 1) {
            GraphRequest graphRequest0 = (GraphRequest)list0.get(0);
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("body", object0);
                jSONObject0.put("code", (httpURLConnection0 == null ? 200 : httpURLConnection0.getResponseCode()));
                jSONArray0 = new JSONArray();
                jSONArray0.put(jSONObject0);
                goto label_18;
            }
            catch(JSONException jSONException0) {
            }
            catch(IOException iOException0) {
                list1.add(new n(graphRequest0, httpURLConnection0, new FacebookRequestError(httpURLConnection0, iOException0)));
                goto label_17;
            }
            list1.add(new n(graphRequest0, httpURLConnection0, new FacebookRequestError(httpURLConnection0, jSONException0)));
            goto label_17;
        }
        else {
        label_17:
            jSONArray0 = object0;
        }
    label_18:
        if(!(jSONArray0 instanceof JSONArray) || jSONArray0.length() != v) {
            throw new e("Unexpected number of results");
        }
        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
            GraphRequest graphRequest1 = (GraphRequest)list0.get(v1);
            try {
                list1.add(n.b(graphRequest1, httpURLConnection0, jSONArray0.get(v1), object0));
            }
            catch(JSONException jSONException1) {
                list1.add(new n(graphRequest1, httpURLConnection0, new FacebookRequestError(httpURLConnection0, jSONException1)));
            }
            catch(e e0) {
                list1.add(new n(graphRequest1, httpURLConnection0, new FacebookRequestError(httpURLConnection0, e0)));
            }
        }
        return list1;
    }

    static List d(InputStream inputStream0, HttpURLConnection httpURLConnection0, m m0) {
        String s = F.e0(inputStream0);
        v.i(q.h, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[]{s.length(), s});
        return n.e(s, httpURLConnection0, m0);
    }

    static List e(String s, HttpURLConnection httpURLConnection0, m m0) {
        List list0 = n.c(httpURLConnection0, m0, new JSONTokener(s).nextValue());
        v.i(q.f, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[]{m0.p(), s.length(), list0});
        return list0;
    }

    static List f(HttpURLConnection httpURLConnection0, m m0) {
        List list2;
        List list1;
        List list0;
        InputStream inputStream0;
        try {
            try {
                inputStream0 = null;
                if(!h.u()) {
                    Log.e("n", "GraphRequest can\'t be used when Facebook SDK isn\'t fully initialized");
                    throw new e("GraphRequest can\'t be used when Facebook SDK isn\'t fully initialized");
                }
                inputStream0 = httpURLConnection0.getResponseCode() < 400 ? httpURLConnection0.getInputStream() : httpURLConnection0.getErrorStream();
                list0 = n.d(inputStream0, httpURLConnection0, m0);
                goto label_22;
            }
            catch(e e0) {
            }
            catch(Exception exception0) {
                goto label_16;
            }
            v.i(q.f, "Response", "Response <Error>: %s", new Object[]{e0});
            list1 = n.a(m0, httpURLConnection0, e0);
        }
        catch(Throwable throwable0) {
            F.g(inputStream0);
            throw throwable0;
        }
        F.g(inputStream0);
        return list1;
        try {
        label_16:
            v.i(q.f, "Response", "Response <Error>: %s", new Object[]{exception0});
            list2 = n.a(m0, httpURLConnection0, new e(exception0));
        }
        catch(Throwable throwable0) {
            F.g(inputStream0);
            throw throwable0;
        }
        F.g(inputStream0);
        return list2;
    label_22:
        F.g(inputStream0);
        return list0;
    }

    public final FacebookRequestError g() {
        return this.d;
    }

    public final JSONObject h() {
        return this.b;
    }

    // 去混淆评级： 中等(50)
    @Override
    public String toString() {
        try {
            return this.a == null ? "{Response:  responseCode: " + String.format(Locale.US, "%d", 200) + ", graphObject: " + this.b + ", error: " + this.d + "}" : "{Response:  responseCode: " + String.format(Locale.US, "%d", this.a.getResponseCode()) + ", graphObject: " + this.b + ", error: " + this.d + "}";
        }
        catch(IOException unused_ex) {
            return "{Response:  responseCode: unknown, graphObject: " + this.b + ", error: " + this.d + "}";
        }
    }
}

