package m2;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import l2.B.b;
import l2.B.c;
import l2.B.e.e;
import l2.B.e.f;
import l2.B;
import l2.C;
import w2.d;

public class h {
    interface a {
        Object a(JsonReader arg1);
    }

    private static final u2.a a;

    static {
        h.a = new d().j(l2.a.a).k(true).i();
    }

    private static l2.B.d A(JsonReader jsonReader0) {
        l2.B.d.a b$d$a0 = l2.B.d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("files")) {
                b$d$a0.b(h.l(jsonReader0, (JsonReader jsonReader0) -> h.z(jsonReader0)));
            }
            else if(s.equals("orgId")) {
                b$d$a0.c(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return b$d$a0.a();
    }

    private static e B(JsonReader jsonReader0) {
        l2.B.e.e.a b$e$e$a0 = e.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "buildVersion": {
                    b$e$e$a0.b(jsonReader0.nextString());
                    break;
                }
                case "jailbroken": {
                    b$e$e$a0.c(jsonReader0.nextBoolean());
                    break;
                }
                case "platform": {
                    b$e$e$a0.d(jsonReader0.nextInt());
                    break;
                }
                case "version": {
                    b$e$e$a0.e(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$e$a0.a();
    }

    private static B C(JsonReader jsonReader0) {
        b b$b0 = B.b();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "appExitInfo": {
                    b$b0.b(h.k(jsonReader0));
                    break;
                }
                case "buildVersion": {
                    b$b0.c(jsonReader0.nextString());
                    break;
                }
                case "displayVersion": {
                    b$b0.d(jsonReader0.nextString());
                    break;
                }
                case "gmpAppId": {
                    b$b0.f(jsonReader0.nextString());
                    break;
                }
                case "installationUuid": {
                    b$b0.g(jsonReader0.nextString());
                    break;
                }
                case "ndkPayload": {
                    b$b0.h(h.A(jsonReader0));
                    break;
                }
                case "platform": {
                    b$b0.i(jsonReader0.nextInt());
                    break;
                }
                case "sdkVersion": {
                    b$b0.j(jsonReader0.nextString());
                    break;
                }
                case "session": {
                    b$b0.k(h.D(jsonReader0));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$b0.a();
    }

    private static l2.B.e D(JsonReader jsonReader0) {
        l2.B.e.b b$e$b0 = l2.B.e.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "app": {
                    b$e$b0.b(h.j(jsonReader0));
                    break;
                }
                case "appQualitySessionId": {
                    b$e$b0.c(jsonReader0.nextString());
                    break;
                }
                case "crashed": {
                    b$e$b0.d(jsonReader0.nextBoolean());
                    break;
                }
                case "device": {
                    b$e$b0.e(h.o(jsonReader0));
                    break;
                }
                case "endedAt": {
                    b$e$b0.f(jsonReader0.nextLong());
                    break;
                }
                case "events": {
                    b$e$b0.g(h.l(jsonReader0, (JsonReader jsonReader0) -> h.p(jsonReader0)));
                    break;
                }
                case "generator": {
                    b$e$b0.h(jsonReader0.nextString());
                    break;
                }
                case "generatorType": {
                    b$e$b0.i(jsonReader0.nextInt());
                    break;
                }
                case "identifier": {
                    b$e$b0.k(Base64.decode(jsonReader0.nextString(), 2));
                    break;
                }
                case "os": {
                    b$e$b0.l(h.B(jsonReader0));
                    break;
                }
                case "startedAt": {
                    b$e$b0.m(jsonReader0.nextLong());
                    break;
                }
                case "user": {
                    b$e$b0.n(h.E(jsonReader0));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$b0.a();
    }

    private static f E(JsonReader jsonReader0) {
        l2.B.e.f.a b$e$f$a0 = f.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("identifier")) {
                b$e$f$a0.b(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return b$e$f$a0.a();
    }

    public B F(String s) {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return h.C(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    public String G(B b0) {
        return h.a.b(b0);
    }

    // 检测为 Lambda 实现
    public static l2.B.a.a a(JsonReader jsonReader0) [...]

    // 检测为 Lambda 实现
    public static l2.B.e.d.a.b.e.b b(JsonReader jsonReader0) [...]

    // 检测为 Lambda 实现
    public static c c(JsonReader jsonReader0) [...]

    // 检测为 Lambda 实现
    public static l2.B.e.d.a.b.a d(JsonReader jsonReader0) [...]

    // 检测为 Lambda 实现
    public static l2.B.e.d.a.b.e e(JsonReader jsonReader0) [...]

    // 检测为 Lambda 实现
    public static l2.B.d.b f(JsonReader jsonReader0) [...]

    // 检测为 Lambda 实现
    public static l2.B.e.d g(JsonReader jsonReader0) [...]

    public l2.B.e.d h(String s) {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return h.p(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    public String i(l2.B.e.d b$e$d0) {
        return h.a.b(b$e$d0);
    }

    private static l2.B.e.a j(JsonReader jsonReader0) {
        l2.B.e.a.a b$e$a$a0 = l2.B.e.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "developmentPlatform": {
                    b$e$a$a0.b(jsonReader0.nextString());
                    break;
                }
                case "developmentPlatformVersion": {
                    b$e$a$a0.c(jsonReader0.nextString());
                    break;
                }
                case "displayVersion": {
                    b$e$a$a0.d(jsonReader0.nextString());
                    break;
                }
                case "identifier": {
                    b$e$a$a0.e(jsonReader0.nextString());
                    break;
                }
                case "installationUuid": {
                    b$e$a$a0.f(jsonReader0.nextString());
                    break;
                }
                case "version": {
                    b$e$a$a0.g(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$a$a0.a();
    }

    private static l2.B.a k(JsonReader jsonReader0) {
        l2.B.a.b b$a$b0 = l2.B.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "buildIdMappingForArch": {
                    b$a$b0.b(h.l(jsonReader0, (JsonReader jsonReader0) -> h.m(jsonReader0)));
                    break;
                }
                case "importance": {
                    b$a$b0.c(jsonReader0.nextInt());
                    break;
                }
                case "pid": {
                    b$a$b0.d(jsonReader0.nextInt());
                    break;
                }
                case "processName": {
                    b$a$b0.e(jsonReader0.nextString());
                    break;
                }
                case "pss": {
                    b$a$b0.f(jsonReader0.nextLong());
                    break;
                }
                case "reasonCode": {
                    b$a$b0.g(jsonReader0.nextInt());
                    break;
                }
                case "rss": {
                    b$a$b0.h(jsonReader0.nextLong());
                    break;
                }
                case "timestamp": {
                    b$a$b0.i(jsonReader0.nextLong());
                    break;
                }
                case "traceFile": {
                    b$a$b0.j(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$a$b0.a();
    }

    private static C l(JsonReader jsonReader0, a h$a0) {
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            arrayList0.add(h$a0.a(jsonReader0));
        }
        jsonReader0.endArray();
        return C.a(arrayList0);
    }

    private static l2.B.a.a m(JsonReader jsonReader0) {
        l2.B.a.a.a b$a$a$a0 = l2.B.a.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "arch": {
                    b$a$a$a0.b(jsonReader0.nextString());
                    break;
                }
                case "buildId": {
                    b$a$a$a0.c(jsonReader0.nextString());
                    break;
                }
                case "libraryName": {
                    b$a$a$a0.d(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$a$a$a0.a();
    }

    private static c n(JsonReader jsonReader0) {
        l2.B.c.a b$c$a0 = c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("key")) {
                b$c$a0.b(jsonReader0.nextString());
            }
            else if(s.equals("value")) {
                b$c$a0.c(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return b$c$a0.a();
    }

    private static l2.B.e.c o(JsonReader jsonReader0) {
        l2.B.e.c.a b$e$c$a0 = l2.B.e.c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "arch": {
                    b$e$c$a0.b(jsonReader0.nextInt());
                    break;
                }
                case "cores": {
                    b$e$c$a0.c(jsonReader0.nextInt());
                    break;
                }
                case "diskSpace": {
                    b$e$c$a0.d(jsonReader0.nextLong());
                    break;
                }
                case "manufacturer": {
                    b$e$c$a0.e(jsonReader0.nextString());
                    break;
                }
                case "model": {
                    b$e$c$a0.f(jsonReader0.nextString());
                    break;
                }
                case "modelClass": {
                    b$e$c$a0.g(jsonReader0.nextString());
                    break;
                }
                case "ram": {
                    b$e$c$a0.h(jsonReader0.nextLong());
                    break;
                }
                case "simulator": {
                    b$e$c$a0.i(jsonReader0.nextBoolean());
                    break;
                }
                case "state": {
                    b$e$c$a0.j(jsonReader0.nextInt());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$c$a0.a();
    }

    private static l2.B.e.d p(JsonReader jsonReader0) {
        l2.B.e.d.b b$e$d$b0 = l2.B.e.d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "app": {
                    b$e$d$b0.b(h.q(jsonReader0));
                    break;
                }
                case "device": {
                    b$e$d$b0.c(h.s(jsonReader0));
                    break;
                }
                case "log": {
                    b$e$d$b0.d(h.w(jsonReader0));
                    break;
                }
                case "timestamp": {
                    b$e$d$b0.e(jsonReader0.nextLong());
                    break;
                }
                case "type": {
                    b$e$d$b0.f(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$b0.a();
    }

    private static l2.B.e.d.a q(JsonReader jsonReader0) {
        l2.B.e.d.a.a b$e$d$a$a0 = l2.B.e.d.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "background": {
                    b$e$d$a$a0.b(Boolean.valueOf(jsonReader0.nextBoolean()));
                    break;
                }
                case "customAttributes": {
                    b$e$d$a$a0.c(h.l(jsonReader0, (JsonReader jsonReader0) -> h.n(jsonReader0)));
                    break;
                }
                case "execution": {
                    b$e$d$a$a0.d(h.t(jsonReader0));
                    break;
                }
                case "internalKeys": {
                    b$e$d$a$a0.e(h.l(jsonReader0, (JsonReader jsonReader0) -> h.n(jsonReader0)));
                    break;
                }
                case "uiOrientation": {
                    b$e$d$a$a0.f(jsonReader0.nextInt());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$a0.a();
    }

    private static l2.B.e.d.a.b.a r(JsonReader jsonReader0) {
        l2.B.e.d.a.b.a.a b$e$d$a$b$a$a0 = l2.B.e.d.a.b.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "baseAddress": {
                    b$e$d$a$b$a$a0.b(jsonReader0.nextLong());
                    break;
                }
                case "name": {
                    b$e$d$a$b$a$a0.c(jsonReader0.nextString());
                    break;
                }
                case "size": {
                    b$e$d$a$b$a$a0.d(jsonReader0.nextLong());
                    break;
                }
                case "uuid": {
                    b$e$d$a$b$a$a0.f(Base64.decode(jsonReader0.nextString(), 2));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$b$a$a0.a();
    }

    private static l2.B.e.d.c s(JsonReader jsonReader0) {
        l2.B.e.d.c.a b$e$d$c$a0 = l2.B.e.d.c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "batteryLevel": {
                    b$e$d$c$a0.b(jsonReader0.nextDouble());
                    break;
                }
                case "batteryVelocity": {
                    b$e$d$c$a0.c(jsonReader0.nextInt());
                    break;
                }
                case "diskUsed": {
                    b$e$d$c$a0.d(jsonReader0.nextLong());
                    break;
                }
                case "orientation": {
                    b$e$d$c$a0.e(jsonReader0.nextInt());
                    break;
                }
                case "proximityOn": {
                    b$e$d$c$a0.f(jsonReader0.nextBoolean());
                    break;
                }
                case "ramUsed": {
                    b$e$d$c$a0.g(jsonReader0.nextLong());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$c$a0.a();
    }

    private static l2.B.e.d.a.b t(JsonReader jsonReader0) {
        l2.B.e.d.a.b.b b$e$d$a$b$b0 = l2.B.e.d.a.b.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "appExitInfo": {
                    b$e$d$a$b$b0.b(h.k(jsonReader0));
                    break;
                }
                case "binaries": {
                    b$e$d$a$b$b0.c(h.l(jsonReader0, (JsonReader jsonReader0) -> h.r(jsonReader0)));
                    break;
                }
                case "exception": {
                    b$e$d$a$b$b0.d(h.u(jsonReader0));
                    break;
                }
                case "signal": {
                    b$e$d$a$b$b0.e(h.x(jsonReader0));
                    break;
                }
                case "threads": {
                    b$e$d$a$b$b0.f(h.l(jsonReader0, (JsonReader jsonReader0) -> h.y(jsonReader0)));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$b$b0.a();
    }

    private static l2.B.e.d.a.b.c u(JsonReader jsonReader0) {
        l2.B.e.d.a.b.c.a b$e$d$a$b$c$a0 = l2.B.e.d.a.b.c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "causedBy": {
                    b$e$d$a$b$c$a0.b(h.u(jsonReader0));
                    break;
                }
                case "frames": {
                    b$e$d$a$b$c$a0.c(h.l(jsonReader0, (JsonReader jsonReader0) -> h.v(jsonReader0)));
                    break;
                }
                case "overflowCount": {
                    b$e$d$a$b$c$a0.d(jsonReader0.nextInt());
                    break;
                }
                case "reason": {
                    b$e$d$a$b$c$a0.e(jsonReader0.nextString());
                    break;
                }
                case "type": {
                    b$e$d$a$b$c$a0.f(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$b$c$a0.a();
    }

    private static l2.B.e.d.a.b.e.b v(JsonReader jsonReader0) {
        l2.B.e.d.a.b.e.b.a b$e$d$a$b$e$b$a0 = l2.B.e.d.a.b.e.b.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "file": {
                    b$e$d$a$b$e$b$a0.b(jsonReader0.nextString());
                    break;
                }
                case "importance": {
                    b$e$d$a$b$e$b$a0.c(jsonReader0.nextInt());
                    break;
                }
                case "offset": {
                    b$e$d$a$b$e$b$a0.d(jsonReader0.nextLong());
                    break;
                }
                case "pc": {
                    b$e$d$a$b$e$b$a0.e(jsonReader0.nextLong());
                    break;
                }
                case "symbol": {
                    b$e$d$a$b$e$b$a0.f(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$b$e$b$a0.a();
    }

    private static l2.B.e.d.d w(JsonReader jsonReader0) {
        l2.B.e.d.d.a b$e$d$d$a0 = l2.B.e.d.d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("content")) {
                b$e$d$d$a0.b(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return b$e$d$d$a0.a();
    }

    private static l2.B.e.d.a.b.d x(JsonReader jsonReader0) {
        l2.B.e.d.a.b.d.a b$e$d$a$b$d$a0 = l2.B.e.d.a.b.d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "address": {
                    b$e$d$a$b$d$a0.b(jsonReader0.nextLong());
                    break;
                }
                case "code": {
                    b$e$d$a$b$d$a0.c(jsonReader0.nextString());
                    break;
                }
                case "name": {
                    b$e$d$a$b$d$a0.d(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$b$d$a0.a();
    }

    private static l2.B.e.d.a.b.e y(JsonReader jsonReader0) {
        l2.B.e.d.a.b.e.a b$e$d$a$b$e$a0 = l2.B.e.d.a.b.e.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "frames": {
                    b$e$d$a$b$e$a0.b(h.l(jsonReader0, (JsonReader jsonReader0) -> h.v(jsonReader0)));
                    break;
                }
                case "importance": {
                    b$e$d$a$b$e$a0.c(jsonReader0.nextInt());
                    break;
                }
                case "name": {
                    b$e$d$a$b$e$a0.d(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return b$e$d$a$b$e$a0.a();
    }

    private static l2.B.d.b z(JsonReader jsonReader0) {
        l2.B.d.b.a b$d$b$a0 = l2.B.d.b.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("filename")) {
                b$d$b$a0.c(jsonReader0.nextString());
            }
            else if(s.equals("contents")) {
                b$d$b$a0.b(Base64.decode(jsonReader0.nextString(), 2));
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return b$d$b$a0.a();
    }
}

