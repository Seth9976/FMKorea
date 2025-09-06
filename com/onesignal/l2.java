package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class l2 {
    private ServiceConnection a;
    private Object b;
    private Method c;
    private Method d;
    private Context e;
    private ArrayList f;
    private boolean g;
    private boolean h;
    private static int i = -99;
    private static Class j;

    static {
    }

    l2(Context context0) {
        this.g = true;
        boolean z = false;
        this.h = false;
        this.e = context0;
        this.f = new ArrayList();
        try {
            JSONArray jSONArray0 = new JSONArray(S1.f("GTPlayerPurchases", "purchaseTokens", "[]"));
            for(int v = 0; v < jSONArray0.length(); ++v) {
                this.f.add(jSONArray0.get(v).toString());
            }
            if(jSONArray0.length() == 0) {
                z = true;
            }
            this.g = z;
            if(z) {
                this.g = S1.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        this.u();
    }

    static boolean a(Context context0) {
        if(l2.i == -99) {
            l2.i = context0.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if(l2.i == 0) {
                l2.j = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            return l2.i == 0;
        }
        catch(Throwable unused_ex) {
            l2.i = 0;
            return false;
        }
    }

    private void b() {
        class b implements Runnable {
            final l2 f;

            @Override
            public void run() {
                l2.j(l2.this, true);
                try {
                    if(l2.k(l2.this) == null) {
                        Method method0 = l2.n(l2.m());
                        l2.l(l2.this, method0);
                        l2.k(l2.this).setAccessible(true);
                    }
                    Bundle bundle0 = (Bundle)l2.k(l2.this).invoke(l2.d(l2.this), 3, "com.fmkorea.m.fmk", "inapp", null);
                    if(bundle0.getInt("RESPONSE_CODE") == 0) {
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = new ArrayList();
                        ArrayList arrayList2 = bundle0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList arrayList3 = bundle0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        for(int v = 0; v < arrayList3.size(); ++v) {
                            String s = (String)arrayList3.get(v);
                            String s1 = (String)arrayList2.get(v);
                            String s2 = new JSONObject(s).getString("purchaseToken");
                            if(!l2.p(l2.this).contains(s2) && !arrayList1.contains(s2)) {
                                arrayList1.add(s2);
                                arrayList0.add(s1);
                            }
                        }
                        if(arrayList0.size() > 0) {
                            l2.e(l2.this, arrayList0, arrayList1);
                        }
                        else if(arrayList3.size() == 0) {
                            l2.g(l2.this, false);
                            S1.j("GTPlayerPurchases", "ExistingPurchases", false);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    throwable0.printStackTrace();
                }
                l2.j(l2.this, false);
            }
        }

        if(this.h) {
            return;
        }
        new Thread(new b(this)).start();
    }

    static Object d(l2 l20) {
        return l20.b;
    }

    static void e(l2 l20, ArrayList arrayList0, ArrayList arrayList1) {
        l20.t(arrayList0, arrayList1);
    }

    static Method k(l2 l20) {
        return l20.c;
    }

    static Method l(l2 l20, Method method0) {
        l20.c = method0;
        return method0;
    }

    static Class m() {
        return l2.j;
    }

    static Method n(Class class0) {
        return l2.r(class0);
    }

    static Context o(l2 l20) {
        return l20.e;
    }

    private static Method q(Class class0) {
        Method[] arr_method = class0.getMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class[] arr_class = method0.getParameterTypes();
            if(arr_class.length == 1 && arr_class[0] == IBinder.class) {
                return method0;
            }
        }
        return null;
    }

    private static Method r(Class class0) {
        Method[] arr_method = class0.getMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class[] arr_class = method0.getParameterTypes();
            if(arr_class.length == 4 && arr_class[0] == Integer.TYPE && (arr_class[1] == String.class && arr_class[2] == String.class && arr_class[3] == String.class)) {
                return method0;
            }
        }
        return null;
    }

    private static Method s(Class class0) {
        Method[] arr_method = class0.getMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class[] arr_class = method0.getParameterTypes();
            Class class1 = method0.getReturnType();
            if(arr_class.length == 4 && arr_class[0] == Integer.TYPE && (arr_class[1] == String.class && arr_class[2] == String.class) && (arr_class[3] == Bundle.class && class1 == Bundle.class)) {
                return method0;
            }
        }
        return null;
    }

    private void t(ArrayList arrayList0, ArrayList arrayList1) {
        class c extends g {
            final ArrayList a;
            final l2 b;

            c(ArrayList arrayList0) {
                this.a = arrayList0;
                super();
            }

            @Override  // com.onesignal.U1$g
            public void b(String s) {
                l2.this.f.addAll(this.a);
                S1.m("GTPlayerPurchases", "purchaseTokens", l2.this.f.toString());
                S1.j("GTPlayerPurchases", "ExistingPurchases", true);
                l2.this.g = false;
                l2.this.h = false;
            }
        }

        try {
            if(this.d == null) {
                Method method0 = l2.s(l2.j);
                this.d = method0;
                method0.setAccessible(true);
            }
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("ITEM_ID_LIST", arrayList0);
            Bundle bundle1 = (Bundle)this.d.invoke(this.b, 3, "com.fmkorea.m.fmk", "inapp", bundle0);
            if(bundle1.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList2 = bundle1.getStringArrayList("DETAILS_LIST");
                HashMap hashMap0 = new HashMap();
                for(Object object0: arrayList2) {
                    JSONObject jSONObject0 = new JSONObject(((String)object0));
                    String s = jSONObject0.getString("productId");
                    BigDecimal bigDecimal0 = new BigDecimal(jSONObject0.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("sku", s);
                    jSONObject1.put("iso", jSONObject0.getString("price_currency_code"));
                    jSONObject1.put("amount", bigDecimal0.toString());
                    hashMap0.put(s, jSONObject1);
                }
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: arrayList0) {
                    String s1 = (String)object1;
                    if(hashMap0.containsKey(s1)) {
                        jSONArray0.put(hashMap0.get(s1));
                    }
                }
                if(jSONArray0.length() > 0) {
                    c l2$c0 = new c(this, arrayList1);
                    I1.R1(jSONArray0, this.g, l2$c0);
                }
            }
        }
        catch(Throwable throwable0) {
            I1.b(C.i, "Failed to track IAP purchases", throwable0);
        }
    }

    void u() {
        class a implements ServiceConnection {
            final l2 f;

            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
                try {
                    Method method0 = l2.q(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                    method0.setAccessible(true);
                    Object object0 = method0.invoke(null, iBinder0);
                    l2.this.b = object0;
                    l2.this.b();
                }
                catch(Throwable throwable0) {
                    throwable0.printStackTrace();
                }
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName0) {
                l2.i = -99;
                l2.this.b = null;
            }
        }

        if(this.a == null) {
            this.a = new a(this);
            Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent0.setPackage("com.android.vending");
            this.e.bindService(intent0, this.a, 1);
            return;
        }
        if(this.b != null) {
            this.b();
        }
    }
}

