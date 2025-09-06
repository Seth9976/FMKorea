package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import g0.j;
import g0.k.a;
import java.util.LinkedHashMap;
import java.util.Map;
import jeb.synthetic.FIN;
import z3.k;

public final class MultiInstanceInvalidationService extends Service {
    private int f;
    private final Map g;
    private final RemoteCallbackList h;
    private final a i;

    public MultiInstanceInvalidationService() {
        public static final class androidx.room.MultiInstanceInvalidationService.a extends a {
            final MultiInstanceInvalidationService f;

            androidx.room.MultiInstanceInvalidationService.a(MultiInstanceInvalidationService multiInstanceInvalidationService0) {
                this.f = multiInstanceInvalidationService0;
                super();
            }

            @Override  // g0.k
            public int d(j j0, String s) {
                k.e(j0, "callback");
                int v = 0;
                if(s == null) {
                    return 0;
                }
                RemoteCallbackList remoteCallbackList0 = this.f.a();
                MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.f;
                synchronized(remoteCallbackList0) {
                    multiInstanceInvalidationService0.d(multiInstanceInvalidationService0.c() + 1);
                    int v2 = multiInstanceInvalidationService0.c();
                    if(multiInstanceInvalidationService0.a().register(j0, v2)) {
                        multiInstanceInvalidationService0.b().put(v2, s);
                        v = v2;
                    }
                    else {
                        multiInstanceInvalidationService0.d(multiInstanceInvalidationService0.c() - 1);
                    }
                    return v;
                }
            }

            @Override  // g0.k
            public void l(j j0, int v) {
                k.e(j0, "callback");
                synchronized(this.f.a()) {
                    this.f.a().unregister(j0);
                    String s = (String)this.f.b().remove(v);
                }
            }

            @Override  // g0.k
            public void s(int v, String[] arr_s) {
                int v4;
                k.e(arr_s, "tables");
                RemoteCallbackList remoteCallbackList0 = this.f.a();
                MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.f;
                synchronized(remoteCallbackList0) {
                    String s = (String)multiInstanceInvalidationService0.b().get(v);
                    if(s == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int v2 = multiInstanceInvalidationService0.a().beginBroadcast();
                    v4 = FIN.finallyOpen$NT();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        Object object0 = multiInstanceInvalidationService0.a().getBroadcastCookie(v3);
                        k.c(object0, "null cannot be cast to non-null type kotlin.Int");
                        if(v != ((int)(((Integer)object0))) && k.a(s, ((String)multiInstanceInvalidationService0.b().get(((Integer)object0))))) {
                            try {
                                ((j)multiInstanceInvalidationService0.a().getBroadcastItem(v3)).c(arr_s);
                            }
                            catch(RemoteException remoteException0) {
                                Log.w("ROOM", "Error invoking a remote callback", remoteException0);
                            }
                        }
                    }
                    FIN.finallyCodeBegin$NT(v4);
                    multiInstanceInvalidationService0.a().finishBroadcast();
                }
                FIN.finallyCodeEnd$NT(v4);
            }
        }


        public static final class b extends RemoteCallbackList {
            final MultiInstanceInvalidationService a;

            b(MultiInstanceInvalidationService multiInstanceInvalidationService0) {
                this.a = multiInstanceInvalidationService0;
                super();
            }

            public void a(j j0, Object object0) {
                k.e(j0, "callback");
                k.e(object0, "cookie");
                this.a.b().remove(((Integer)object0));
            }

            @Override  // android.os.RemoteCallbackList
            public void onCallbackDied(IInterface iInterface0, Object object0) {
                this.a(((j)iInterface0), object0);
            }
        }

        this.g = new LinkedHashMap();
        this.h = new b(this);
        this.i = new androidx.room.MultiInstanceInvalidationService.a(this);
    }

    public final RemoteCallbackList a() {
        return this.h;
    }

    public final Map b() {
        return this.g;
    }

    public final int c() {
        return this.f;
    }

    public final void d(int v) {
        this.f = v;
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        k.e(intent0, "intent");
        return this.i;
    }
}

