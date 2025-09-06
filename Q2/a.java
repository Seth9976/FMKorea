package q2;

import j2.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import o2.f;
import org.json.JSONObject;

public class a {
    private final File a;

    public a(f f0) {
        this.a = f0.e("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    public JSONObject b() {
        JSONObject jSONObject1;
        FileInputStream fileInputStream0;
        g2.f.f().b("Checking for cached settings...");
        JSONObject jSONObject0 = null;
        try {
            File file0 = this.a();
            if(file0.exists()) {
                fileInputStream0 = new FileInputStream(file0);
                jSONObject1 = new JSONObject(i.D(fileInputStream0));
                jSONObject0 = fileInputStream0;
            }
            else {
                goto label_10;
            }
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_14;
        }
        catch(Throwable throwable0) {
            fileInputStream0 = null;
            throwable1 = throwable0;
            i.e(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
        try {
            jSONObject1 = new JSONObject(i.D(fileInputStream0));
            jSONObject0 = fileInputStream0;
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_15;
            try {
            label_10:
                g2.f.f().i("Settings file does not exist.");
                jSONObject1 = null;
                goto label_26;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                fileInputStream0 = null;
                throwable1 = throwable0;
                i.e(fileInputStream0, "Error while closing settings cache file.");
                throw throwable1;
            }
        label_14:
            fileInputStream0 = null;
            try {
            label_15:
                g2.f.f().e("Failed to fetch cached settings", exception0);
                goto label_19;
            }
            catch(Throwable throwable1) {
            }
            i.e(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
        catch(Throwable throwable1) {
            i.e(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
    label_19:
        i.e(fileInputStream0, "Error while closing settings cache file.");
        return null;
    label_26:
        i.e(((Closeable)jSONObject0), "Error while closing settings cache file.");
        return jSONObject1;
    }

    public void c(long v, JSONObject jSONObject0) {
        FileWriter fileWriter1;
        FileWriter fileWriter0;
        g2.f.f().i("Writing settings to cache file...");
        if(jSONObject0 != null) {
            try {
                fileWriter0 = null;
                jSONObject0.put("expires_at", v);
                fileWriter1 = new FileWriter(this.a());
                goto label_8;
            }
            catch(Exception exception0) {
                goto label_13;
                try {
                label_8:
                    fileWriter1.write(jSONObject0.toString());
                    fileWriter1.flush();
                    goto label_23;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable0) {
                    fileWriter0 = fileWriter1;
                    i.e(fileWriter0, "Failed to close settings writer.");
                    throw throwable0;
                }
                fileWriter0 = fileWriter1;
                try {
                label_13:
                    g2.f.f().e("Failed to cache settings", exception0);
                    goto label_17;
                }
                catch(Throwable throwable0) {
                }
                i.e(fileWriter0, "Failed to close settings writer.");
                throw throwable0;
            }
            catch(Throwable throwable0) {
                i.e(fileWriter0, "Failed to close settings writer.");
                throw throwable0;
            }
        label_17:
            i.e(fileWriter0, "Failed to close settings writer.");
            return;
        label_23:
            i.e(fileWriter1, "Failed to close settings writer.");
        }
    }
}

