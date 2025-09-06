package Q0;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import b1.a;
import com.facebook.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {
    private static final HashMap a;
    private static final HashMap b;
    private static final String c;
    private static final SharedPreferences d;
    private static final SharedPreferences e;

    static {
        b.a = new HashMap();
        b.b = new HashMap();
        b.c = "com.fmkorea.m.fmk";
        b.d = h.e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        b.e = h.e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    static Object a(Context context0, IBinder iBinder0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return b.n(context0, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder0});
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static void b() {
        Class class0 = b.class;
        if(a.d(class0)) {
            return;
        }
        try {
            long v = System.currentTimeMillis();
            SharedPreferences sharedPreferences0 = b.d;
            long v1 = sharedPreferences0.getLong("LAST_CLEARED_TIME", 0L);
            if(v1 == 0L) {
                sharedPreferences0.edit().putLong("LAST_CLEARED_TIME", v / 1000L).apply();
                return;
            }
            if(v / 1000L - v1 > 604800L) {
                sharedPreferences0.edit().clear().putLong("LAST_CLEARED_TIME", v / 1000L).apply();
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private static ArrayList c(ArrayList arrayList0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            ArrayList arrayList1 = new ArrayList();
            SharedPreferences.Editor sharedPreferences$Editor0 = b.e.edit();
            long v = System.currentTimeMillis();
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    sharedPreferences$Editor0.apply();
                    return arrayList1;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    String s1 = jSONObject0.getString("productId");
                    long v1 = jSONObject0.getLong("purchaseTime");
                    String s2 = jSONObject0.getString("purchaseToken");
                    if(v / 1000L - v1 / 1000L > 86400L || b.e.getString(s1, "").equals(s2)) {
                        continue;
                    }
                    sharedPreferences$Editor0.putString(s1, s2);
                    arrayList1.add(s);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static Class d(Context context0, String s) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            HashMap hashMap0 = b.b;
            Class class1 = (Class)hashMap0.get(s);
            if(class1 != null) {
                return class1;
            }
            try {
                class1 = context0.getClassLoader().loadClass(s);
                hashMap0.put(s, class1);
            }
            catch(ClassNotFoundException unused_ex) {
            }
            return class1;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static Method e(Class class0, String s) {
        Class[] arr_class;
        int v;
        Method method0;
        HashMap hashMap0;
        Class class1 = b.class;
        if(a.d(class1)) {
            return null;
        }
        try {
            hashMap0 = b.a;
            method0 = (Method)hashMap0.get(s);
            if(method0 != null) {
                return method0;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class1);
            return null;
        }
        try {
            switch(s) {
                case "asInterface": {
                    v = 0;
                    break;
                }
                case "getPurchaseHistory": {
                    v = 4;
                    break;
                }
                case "getPurchases": {
                    v = 3;
                    break;
                }
                case "getSkuDetails": {
                    v = 1;
                    break;
                }
                case "isBillingSupported": {
                    v = 2;
                    break;
                }
                default: {
                    v = -1;
                }
            }
            if(v == 0) {
                arr_class = new Class[]{IBinder.class};
            }
            else {
                Class class2 = Bundle.class;
                Class class3 = String.class;
                switch(v) {
                    case 1: {
                        arr_class = new Class[]{Integer.TYPE, class3, class3, class2};
                        break;
                    }
                    case 2: {
                        arr_class = new Class[]{Integer.TYPE, class3, class3};
                        break;
                    }
                    case 3: {
                        arr_class = new Class[]{Integer.TYPE, class3, class3, class3};
                        break;
                    }
                    case 4: {
                        arr_class = new Class[]{Integer.TYPE, class3, class3, class3, class2};
                        break;
                    }
                    default: {
                        arr_class = null;
                    }
                }
            }
            method0 = class0.getDeclaredMethod(s, arr_class);
            hashMap0.put(s, method0);
            return method0;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class1);
            return null;
        }
        return method0;
    }

    private static ArrayList f(Context context0, Object object0, String s) {
        String s2;
        int v;
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(b.o(context0, object0, s).booleanValue()) {
                v = 0;
                boolean z = false;
                String s1 = null;
                while(true) {
                    Bundle bundle0 = new Bundle();
                    Object object1 = b.n(context0, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", object0, new Object[]{6, b.c, s, s1, bundle0});
                    if(object1 == null) {
                        s1 = null;
                    }
                    else {
                        long v1 = System.currentTimeMillis() / 1000L;
                        if(((Bundle)object1).getInt("RESPONSE_CODE") == 0) {
                            ArrayList arrayList1 = ((Bundle)object1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if(arrayList1 == null) {
                                s1 = null;
                            }
                            else {
                                Iterator iterator0 = arrayList1.iterator();
                            label_22:
                                if(iterator0.hasNext()) {
                                    Object object2 = iterator0.next();
                                    s2 = (String)object2;
                                    try {
                                        if(v1 - new JSONObject(s2).getLong("purchaseTime") / 1000L > 1200L) {
                                            z = true;
                                        }
                                        else {
                                            goto label_30;
                                        }
                                    }
                                    catch(JSONException unused_ex) {
                                        goto label_22;
                                    }
                                }
                                s1 = ((Bundle)object1).getString("INAPP_CONTINUATION_TOKEN");
                            }
                        }
                        else {
                            s1 = null;
                        }
                    }
                    if(v >= 30 || s1 == null || z) {
                        break;
                    }
                }
            }
            return arrayList0;
            try {
            label_30:
                arrayList0.add(s2);
                ++v;
            }
            catch(JSONException unused_ex) {
            }
            goto label_22;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static ArrayList g(Context context0, Object object0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(object0 == null) {
                return arrayList0;
            }
            Class class1 = b.d(context0, "com.android.vending.billing.IInAppBillingService");
            if(class1 == null) {
                return arrayList0;
            }
            return b.e(class1, "getPurchaseHistory") == null ? arrayList0 : b.c(b.f(context0, object0, "inapp"));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static ArrayList h(Context context0, Object object0, String s) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(object0 == null) {
                return arrayList0;
            }
            if(b.o(context0, object0, s).booleanValue()) {
                int v = 0;
                String s1 = null;
                while(true) {
                    Object object1 = b.n(context0, "com.android.vending.billing.IInAppBillingService", "getPurchases", object0, new Object[]{3, b.c, s, s1});
                    if(object1 == null || ((Bundle)object1).getInt("RESPONSE_CODE") != 0) {
                        s1 = null;
                    }
                    else {
                        ArrayList arrayList1 = ((Bundle)object1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if(arrayList1 == null) {
                            break;
                        }
                        v += arrayList1.size();
                        arrayList0.addAll(arrayList1);
                        s1 = ((Bundle)object1).getString("INAPP_CONTINUATION_TOKEN");
                    }
                    if(v >= 30 || s1 == null) {
                        break;
                    }
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static ArrayList i(Context context0, Object object0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return b.c(b.h(context0, object0, "inapp"));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static ArrayList j(Context context0, Object object0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return b.c(b.h(context0, object0, "subs"));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static Map k(Context context0, ArrayList arrayList0, Object object0, boolean z) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Map map0 = b.p(arrayList0);
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                String s = (String)object1;
                if(!map0.containsKey(s)) {
                    arrayList1.add(s);
                }
            }
            map0.putAll(b.l(context0, arrayList1, object0, z));
            return map0;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    private static Map l(Context context0, ArrayList arrayList0, Object object0, boolean z) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Map map0 = new HashMap();
            if(object0 != null && !arrayList0.isEmpty()) {
                Bundle bundle0 = new Bundle();
                bundle0.putStringArrayList("ITEM_ID_LIST", arrayList0);
                Object object1 = b.n(context0, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", object0, new Object[]{3, b.c, (z ? "subs" : "inapp"), bundle0});
                if(object1 != null && ((Bundle)object1).getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList1 = ((Bundle)object1).getStringArrayList("DETAILS_LIST");
                    if(arrayList1 != null && arrayList0.size() == arrayList1.size()) {
                        for(int v = 0; v < arrayList0.size(); ++v) {
                            map0.put(arrayList0.get(v), arrayList1.get(v));
                        }
                    }
                    b.q(map0);
                }
            }
            return map0;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    public static boolean m(String s) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            String s1 = new JSONObject(s).optString("freeTrialPeriod");
            return s1 != null && !s1.isEmpty();
        }
        catch(JSONException throwable0) {
            a.b(throwable0, class0);
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private static Object n(Context context0, String s, String s1, Object object0, Object[] arr_object) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Class class1 = b.d(context0, s);
            if(class1 == null) {
                return null;
            }
            Method method0 = b.e(class1, s1);
            if(method0 == null) {
                return null;
            }
            if(object0 != null) {
                object0 = class1.cast(object0);
            }
            try {
                return method0.invoke(object0, arr_object);
            }
            catch(IllegalAccessException | InvocationTargetException unused_ex) {
                return null;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static Boolean o(Context context0, Object object0, String s) {
        boolean z = true;
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            if(object0 == null) {
                return false;
            }
            Object object1 = b.n(context0, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", object0, new Object[]{3, b.c, s});
            if(object1 == null || ((int)(((Integer)object1))) != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    private static Map p(ArrayList arrayList0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Map map0 = new HashMap();
            long v = System.currentTimeMillis();
            for(Object object0: arrayList0) {
                String s = (String)object0;
                String s1 = b.d.getString(s, null);
                if(s1 != null) {
                    String[] arr_s = s1.split(";", 2);
                    if(v / 1000L - Long.parseLong(arr_s[0]) < 43200L) {
                        map0.put(s, arr_s[1]);
                    }
                }
            }
            return map0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static void q(Map map0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return;
        }
        try {
            long v = System.currentTimeMillis();
            SharedPreferences.Editor sharedPreferences$Editor0 = b.d.edit();
            for(Object object0: map0.entrySet()) {
                sharedPreferences$Editor0.putString(((String)((Map.Entry)object0).getKey()), v / 1000L + ";" + ((String)((Map.Entry)object0).getValue()));
            }
            sharedPreferences$Editor0.apply();
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }
}

