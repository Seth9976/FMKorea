package co.median.android;

import android.app.Activity;
import android.app.PendingIntent;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.b;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest.Builder;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;
import d.e;
import java.util.Map;
import l3.u;
import y3.l;
import z3.k;

public final class n {
    public interface a {
        void a(boolean arg1);
    }

    private final Activity a;
    private final long b;
    private a c;
    private final b d;
    private final b e;

    public n(Activity activity0) {
        k.e(activity0, "activity");
        super();
        this.a = activity0;
        this.b = 1000L;
        k.c(activity0, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        b b0 = ((ComponentActivity)activity0).I0(new d.b(), (Map map0) -> {
            Boolean boolean0 = (Boolean)map0.get("android.permission.ACCESS_FINE_LOCATION");
            Boolean boolean1 = (Boolean)map0.get("android.permission.ACCESS_COARSE_LOCATION");
            if((boolean0 == null ? false : boolean0.booleanValue()) && (boolean1 == null ? false : boolean1.booleanValue())) {
                this.h();
                return;
            }
            a n$a0 = this.c;
            if(n$a0 != null) {
                n$a0.a(false);
            }
        });
        k.d(b0, "registerForActivityResult(...)");
        this.d = b0;
        k.c(activity0, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        b b1 = ((ComponentActivity)activity0).I0(new e(), (ActivityResult activityResult0) -> if(activityResult0.b() == -1) {
            a n$a0 = this.c;
            if(n$a0 != null) {
                n$a0.a(true);
            }
        }
        else {
            a n$a1 = this.c;
            if(n$a1 != null) {
                n$a1.a(false);
            }
        });
        k.d(b1, "registerForActivityResult(...)");
        this.e = b1;
    }

    private final boolean f() {
        return androidx.core.content.a.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 && androidx.core.content.a.checkSelfPermission(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final boolean g() {
        if(!this.f()) {
            return false;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            Object object0 = this.a.getSystemService(LocationManager.class);
            k.d(object0, "getSystemService(...)");
            return ((LocationManager)object0).isLocationEnabled();
        }
        return Settings.Secure.getInt(this.a.getContentResolver(), "location_mode", 0) != 0;
    }

    public final void h() {
        if(!this.f()) {
            this.o();
            this.d.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            return;
        }
        LocationRequest locationRequest0 = new Builder(100, this.b).build();
        k.d(locationRequest0, "build(...)");
        com.google.android.gms.location.LocationSettingsRequest.Builder locationSettingsRequest$Builder0 = new com.google.android.gms.location.LocationSettingsRequest.Builder().addLocationRequest(locationRequest0);
        k.d(locationSettingsRequest$Builder0, "addLocationRequest(...)");
        SettingsClient settingsClient0 = LocationServices.getSettingsClient(this.a);
        k.d(settingsClient0, "getSettingsClient(...)");
        Task task0 = settingsClient0.checkLocationSettings(locationSettingsRequest$Builder0.build());
        k.d(task0, "checkLocationSettings(...)");
        task0.addOnSuccessListener((Object object0) -> (LocationSettingsResponse locationSettingsResponse0) -> {
            a n$a0 = n0.c;
            if(n$a0 != null) {
                n$a0.a(true);
            }
            return u.a;
        }.h(object0));
        task0.addOnFailureListener((Exception exception0) -> {
            k.e(exception0, "e");
            if(exception0 instanceof ResolvableApiException) {
                PendingIntent pendingIntent0 = ((ResolvableApiException)exception0).getResolution();
                k.d(pendingIntent0, "getResolution(...)");
                IntentSenderRequest intentSenderRequest0 = new androidx.activity.result.IntentSenderRequest.a(pendingIntent0).a();
                this.e.a(intentSenderRequest0);
            }
        });
    }

    public final void i(a n$a0) {
        k.e(n$a0, "callback");
        this.c = n$a0;
        this.h();
    }

    // 检测为 Lambda 实现
    private static final u j(n n0, LocationSettingsResponse locationSettingsResponse0) [...]

    // 检测为 Lambda 实现
    private static final void k(l l0, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void l(n n0, Exception exception0) [...]

    // 检测为 Lambda 实现
    private static final void m(n n0, ActivityResult activityResult0) [...]

    // 检测为 Lambda 实现
    private static final void n(n n0, Map map0) [...]

    private final void o() {
        if(androidx.core.app.b.f(this.a, "android.permission.ACCESS_FINE_LOCATION") || androidx.core.app.b.f(this.a, "android.permission.ACCESS_COARSE_LOCATION")) {
            Toast.makeText(this.a, 0x7F120117, 0).show();  // string:request_permission_explanation_geolocation "Please allow location permission"
        }
    }
}

