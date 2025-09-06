package s0;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.b;
import r0.c;

public abstract class l {
    class a extends i {
        private final Pattern d;

        a(String s, String s1) {
            super(s, s1);
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override  // s0.a
        public boolean d() {
            boolean z = super.d();
            if(z && Build.VERSION.SDK_INT < 29) {
                PackageInfo packageInfo0 = b.a();
                if(packageInfo0 == null) {
                    return false;
                }
                Matcher matcher0 = this.d.matcher(packageInfo0.versionName);
                return matcher0.find() && Integer.parseInt(packageInfo0.versionName.substring(matcher0.start(), matcher0.end())) >= 105;
            }
            return z;
        }
    }

    class s0.l.b extends d {
        s0.l.b(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public boolean d() {
            if(!super.d()) {
                return false;
            }
            return c.a("MULTI_PROCESS") ? b.d() : false;
        }
    }

    public static final s0.a.b A;
    public static final s0.a.b B;
    public static final d C;
    public static final s0.a.b D;
    public static final s0.a.b E;
    public static final s0.a.b F;
    public static final s0.a.b G;
    public static final e H;
    public static final e I;
    public static final h J;
    public static final h K;
    public static final g L;
    public static final s0.j.b M;
    public static final s0.j.a N;
    public static final h O;
    public static final i P;
    public static final d Q;
    public static final d R;
    public static final h S;
    public static final d T;
    public static final d U;
    public static final d V;
    public static final d W;
    public static final d X;
    public static final d Y;
    public static final d Z;
    public static final s0.a.b a;
    public static final d a0;
    public static final s0.a.b b;
    public static final d b0;
    public static final e c;
    public static final d c0;
    public static final s0.a.c d;
    public static final d d0;
    public static final f e;
    public static final d e0;
    public static final f f;
    public static final d f0;
    public static final f g;
    public static final d g0;
    public static final f h;
    public static final d h0;
    public static final f i;
    public static final d i0;
    public static final f j;
    public static final s0.a.c k;
    public static final s0.a.c l;
    public static final s0.a.c m;
    public static final s0.a.c n;
    public static final s0.a.c o;
    public static final s0.a.c p;
    public static final s0.a.b q;
    public static final s0.a.b r;
    public static final s0.a.c s;
    public static final f t;
    public static final s0.a.c u;
    public static final s0.a.b v;
    public static final s0.a.b w;
    public static final f x;
    public static final f y;
    public static final f z;

    static {
        l.a = new s0.a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        l.b = new s0.a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        l.c = new e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        l.d = new s0.a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        l.e = new f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        l.f = new f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        l.g = new f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        l.h = new f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        l.i = new f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        l.j = new f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        l.k = new s0.a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        l.l = new s0.a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        l.m = new s0.a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        l.n = new s0.a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        l.o = new s0.a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        l.p = new s0.a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        l.q = new s0.a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        l.r = new s0.a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        l.s = new s0.a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        l.t = new f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        l.u = new s0.a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        l.v = new s0.a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        l.w = new s0.a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        l.x = new f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        l.y = new f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        l.z = new f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        l.A = new s0.a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        l.B = new s0.a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        l.C = new d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        l.D = new s0.a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        l.E = new s0.a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        l.F = new s0.a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        l.G = new s0.a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        l.H = new e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        l.I = new e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        l.J = new h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        l.K = new h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        l.L = new g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        l.M = new s0.j.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        l.N = new s0.j.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
        l.O = new h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        l.P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        l.Q = new d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        l.R = new d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        l.S = new h("FORCE_DARK", "FORCE_DARK");
        l.T = new d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        l.U = new d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        l.V = new d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        l.W = new d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        l.X = new d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        l.Y = new d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        l.Z = new d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        l.a0 = new d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        l.b0 = new d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        l.c0 = new s0.l.b("MULTI_PROFILE", "MULTI_PROFILE");
        l.d0 = new d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        l.e0 = new d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        l.f0 = new d("MUTE_AUDIO", "MUTE_AUDIO");
        l.g0 = new d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        l.h0 = new d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        l.i0 = new d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String s) {
        return l.c(s, s0.a.e());
    }

    public static boolean c(String s, Collection collection0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: collection0) {
            s0.h h0 = (s0.h)object0;
            if(h0.a().equals(s)) {
                hashSet0.add(h0);
            }
        }
        if(hashSet0.isEmpty()) {
            throw new RuntimeException("Unknown feature " + s);
        }
        for(Object object1: hashSet0) {
            if(((s0.h)object1).b()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

