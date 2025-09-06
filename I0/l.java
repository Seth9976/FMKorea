package I0;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class l {
    public static boolean a(String s, Context context0) {
        a a0 = a.V(context0);
        if(a0.z != null && !a0.z.isEmpty()) {
            for(Object object0: a0.z) {
                if(((Pattern)object0).matcher(s).matches()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    // 去混淆评级： 高(250)
    public static String b(String s, JSONObject jSONObject0) [...] // 潜在的解密器

    public static List c(Object object0) {
        List list0 = new LinkedList();
        if(object0 instanceof JSONArray) {
            for(int v = 0; true; ++v) {
                String s = null;
                if(v >= ((JSONArray)object0).length()) {
                    break;
                }
                if(!((JSONArray)object0).isNull(v)) {
                    s = ((JSONArray)object0).optString(v, null);
                }
                if(s != null) {
                    try {
                        ((LinkedList)list0).add(Pattern.compile(s));
                    }
                    catch(PatternSyntaxException patternSyntaxException0) {
                        g.a().c("co.median.median_core.LeanUtils", "Error parsing regex: " + s, patternSyntaxException0);
                    }
                }
            }
        }
        else if(object0 instanceof String) {
            String s1 = (String)object0;
            try {
                ((LinkedList)list0).add(Pattern.compile(s1));
                return list0;
            }
            catch(PatternSyntaxException patternSyntaxException1) {
                g.a().c("co.median.median_core.LeanUtils", "Error parsing regex: " + s1, patternSyntaxException1);
            }
        }
        return list0;
    }

    public static String d(Date date0) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat0.format(date0);
    }

    public static String e(String s, String s1, String s2) {
        if(s1 != null) {
            try {
                Matcher matcher0 = Pattern.compile("(?:attachment|inline);\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$*", 2).matcher(s1);
                if(matcher0.find()) {
                    return matcher0.group(2);
                }
            }
            catch(Exception exception0) {
                g.a().c("co.median.median_core.LeanUtils", "Error parsing content-disposition", exception0);
            }
        }
        return URLUtil.guessFileName(s, s1, s2);
    }

    public static String f(String s) {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder("decodeURIComponent(\"");
        try {
            s1 = URLEncoder.encode(s, "UTF-8").replace("+", " ");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            g.a().c("co.median.median_core.LeanUtils", unsupportedEncodingException0.getMessage(), unsupportedEncodingException0);
            s1 = null;
        }
        stringBuilder0.append(s1);
        stringBuilder0.append("\")");
        return stringBuilder0.toString();
    }

    public static Bundle g(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            try {
                Object object1 = jSONObject0.get(s);
                if(!(object1 instanceof String)) {
                    if(object1 instanceof Double) {
                        bundle0.putDouble(s, ((double)(((Double)object1))));
                    }
                    else if(object1 instanceof Boolean) {
                        bundle0.putBoolean(s, ((Boolean)object1).booleanValue());
                    }
                    else {
                        if(!(object1 instanceof Integer)) {
                            continue;
                        }
                        bundle0.putInt(s, ((int)(((Integer)object1))));
                    }
                    continue;
                }
                bundle0.putString(s, ((String)object1));
            }
            catch(JSONException unused_ex) {
            }
        }
        return bundle0;
    }

    public static HashMap h(Object object0) {
        HashMap hashMap0 = new HashMap();
        try {
            JSONObject jSONObject0 = object0 instanceof String ? new JSONObject(((String)object0)) : ((JSONObject)object0);
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                hashMap0.put(((String)object1), jSONObject0.getString(((String)object1)));
            }
            return hashMap0;
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
        return null;
    }

    public static String i(JSONObject jSONObject0, String s) {
        return jSONObject0 == null || s == null || jSONObject0.isNull(s) ? null : jSONObject0.optString(s, null);
    }

    public static Integer j(String s) {
        if(s == null) {
            return null;
        }
        if(!s.startsWith("#")) {
            s = "#" + s;
        }
        try {
            return Color.parseColor(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            g.a().c("co.median.median_core.LeanUtils", "Bad color string:" + s, illegalArgumentException0);
            return null;
        }
    }

    public static JSONObject k(Uri uri0) {
        JSONObject jSONObject0 = new JSONObject();
        if(uri0 == null) {
            return null;
        }
        try {
            for(Object object0: uri0.getQueryParameterNames()) {
                String s = (String)object0;
                String s1 = uri0.getQueryParameter(s);
                Object object1 = new JSONTokener(s1).nextValue();
                if(!(object1 instanceof JSONObject) && !(object1 instanceof JSONArray)) {
                    jSONObject0.put(s, s1);
                }
                else {
                    jSONObject0.put(s, object1);
                }
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
        }
        g.a().b("co.median.median_core.LeanUtils", "GoNative JSONException:- " + jSONException0.getMessage());
        return null;
    }

    public static boolean l(String s, Collection collection0) {
        if(s != null && collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(((Pattern)object0).matcher(s).matches()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static boolean m(String s, String s1) {
        return s == null || s1 == null ? false : s.trim().replaceAll("/+$", "").equals(s1.trim().replaceAll("/+$", ""));
    }

    public static boolean n(String s, String s1) {
        try {
            Uri uri0 = Uri.parse(s);
            Uri uri1 = Uri.parse(s1);
            String s2 = uri0.getPath();
            String s3 = uri1.getPath();
            if(s2.length() >= 2 && s2.substring(0, 2).equals("//")) {
                s2 = s2.substring(1, s2.length());
            }
            if(s3.length() >= 2 && s3.substring(0, 2).equals("//")) {
                s3 = s3.substring(1, s3.length());
            }
            if(s2.isEmpty()) {
                s2 = "/";
            }
            if(s3.isEmpty()) {
                s3 = "/";
            }
            String s4 = uri0.getHost();
            String s5 = uri1.getHost();
            if(s4.startsWith("www.")) {
                s4 = s4.substring(4);
            }
            if(s5.startsWith("www.")) {
                s5 = s5.substring(4);
            }
            if(s4.equals(s5) && s2.equals(s3)) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }
}

