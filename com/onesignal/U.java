package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

abstract class u extends N {
    static abstract class b {
        static Location a(GoogleApiClient googleApiClient0) {
            synchronized(N.d) {
                return googleApiClient0.isConnected() ? LocationServices.FusedLocationApi.getLastLocation(googleApiClient0) : null;
            }
        }

        static void b(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, LocationListener locationListener0) {
            try {
                Object object0 = N.d;
                synchronized(object0) {
                    if(Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if(googleApiClient0.isConnected()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient0, locationRequest0, locationListener0);
                    }
                }
            }
            catch(Throwable throwable0) {
                I1.b(C.i, "FusedLocationApi.requestLocationUpdates failed!", throwable0);
            }
        }
    }

    static class c implements ConnectionCallbacks, OnConnectionFailedListener {
        private c() {
        }

        c(a u$a0) {
        }

        @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle0) {
            synchronized(N.d) {
                if(u.j != null && u.j.c() != null) {
                    C i1$C0 = C.k;
                    I1.a(i1$C0, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + N.h);
                    if(N.h == null) {
                        N.h = b.a(u.j.c());
                        I1.a(i1$C0, "GMSLocationController GoogleApiClientListener lastLocation: " + N.h);
                        Location location0 = N.h;
                        if(location0 != null) {
                            N.d(location0);
                        }
                    }
                    u.k = new d(u.j.c());
                    return;
                }
                I1.a(C.k, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult0) {
            I1.a(C.k, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult0);
            u.e();
        }

        @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int v) {
            I1.a(C.k, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + v);
            u.e();
        }
    }

    static class d implements LocationListener {
        private GoogleApiClient a;

        d(GoogleApiClient googleApiClient0) {
            this.a = googleApiClient0;
            this.a();
        }

        private void a() {
            long v = I1.a1() ? 270000L : 570000L;
            if(this.a != null) {
                LocationRequest locationRequest0 = LocationRequest.create().setFastestInterval(v).setInterval(v).setMaxWaitTime(((long)(((double)v) * 1.5))).setPriority(102);
                I1.a(C.k, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                b.b(this.a, locationRequest0, this);
            }
        }

        @Override  // com.google.android.gms.location.LocationListener
        public void onLocationChanged(Location location0) {
            I1.a(C.k, "GMSLocationController onLocationChanged: " + location0);
            N.h = location0;
        }
    }

    private static A j;
    static d k;

    @Override  // com.onesignal.N
    static void e() {
        synchronized(N.d) {
            A a0 = u.j;
            if(a0 != null) {
                a0.b();
            }
            u.j = null;
        }
    }

    @Override  // com.onesignal.N
    static void l() {
        synchronized(N.d) {
            I1.a(C.k, "GMSLocationController onFocusChange!");
            if(u.j != null && u.j.c().isConnected()) {
                A a0 = u.j;
                if(a0 != null) {
                    GoogleApiClient googleApiClient0 = a0.c();
                    if(u.k != null) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient0, u.k);
                    }
                    u.k = new d(googleApiClient0);
                }
            }
        }
    }

    @Override  // com.onesignal.N
    static void p() {
        u.t();
    }

    static int q() [...] // 潜在的解密器

    private static int s() [...] // Inlined contents

    private static void t() {
        if(N.f != null) {
            return;
        }
        synchronized(N.d) {
            u.u();
            if(u.j == null) {
            label_11:
                c u$c0 = new c(null);
                A a0 = new A(new Builder(N.g).addApi(LocationServices.API).addConnectionCallbacks(u$c0).addOnConnectionFailedListener(u$c0).setHandler(N.h().f).build());
                u.j = a0;
                a0.a();
            }
            else {
                Location location0 = N.h;
                if(location0 != null) {
                    N.d(location0);
                    return;
                }
                goto label_11;
            }
        }
    }

    private static void u() {
        class a implements Runnable {
            a() {
                super();
            }

            @Override
            public void run() {
                try {
                    Thread.sleep(30000L);
                    I1.a(C.i, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                    N.e();
                    N.m(N.g);
                }
                catch(InterruptedException unused_ex) {
                }
            }
        }

        Thread thread0 = new Thread(new a(), "OS_GMS_LOCATION_FALLBACK");
        N.f = thread0;
        thread0.start();
    }
}

