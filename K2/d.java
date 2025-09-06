package k2;

import j2.i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o2.f;
import org.json.JSONObject;

class d {
    private final f a;
    private static final Charset b;

    static {
        d.b = Charset.forName("UTF-8");
    }

    public d(f f0) {
        this.a = f0;
    }

    public File a(String s) {
        return this.a.o(s, "internal-keys");
    }

    public File b(String s) {
        return this.a.o(s, "keys");
    }

    public File c(String s) {
        return this.a.o(s, "user-data");
    }

    private static Map d(String s) {
        JSONObject jSONObject0 = new JSONObject(s);
        Map map0 = new HashMap();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            map0.put(((String)object0), d.k(jSONObject0, ((String)object0)));
        }
        return map0;
    }

    private String e(String s) {
        return d.k(new JSONObject(s), "userId");
    }

    private static String f(Map map0) {
        return new JSONObject(map0).toString();
    }

    Map g(String s, boolean z) {
        Map map0;
        Exception exception1;
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        File file0 = z ? this.a(s) : this.b(s);
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream0 = null;
                fileInputStream1 = null;
                fileInputStream1 = new FileInputStream(file0);
            }
            catch(Exception exception0) {
                exception1 = exception0;
                goto label_14;
            }
            catch(Throwable throwable0) {
                i.e(fileInputStream0, "Failed to close user metadata file.");
                throw throwable0;
            }
            try {
                map0 = d.d(i.D(fileInputStream1));
                goto label_22;
            }
            catch(Exception exception1) {
                try {
                label_14:
                    g2.f.f().l("Error deserializing user metadata.", exception1);
                    d.i(file0);
                }
                catch(Throwable throwable0) {
                    fileInputStream0 = fileInputStream1;
                    i.e(fileInputStream0, "Failed to close user metadata file.");
                    throw throwable0;
                }
                i.e(fileInputStream1, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
            catch(Throwable throwable0) {
                fileInputStream0 = fileInputStream1;
            }
            i.e(fileInputStream0, "Failed to close user metadata file.");
            throw throwable0;
        label_22:
            i.e(fileInputStream1, "Failed to close user metadata file.");
            return map0;
        }
        d.i(file0);
        return Collections.emptyMap();
    }

    public String h(String s) {
        String s1;
        FileInputStream fileInputStream1;
        File file0 = this.c(s);
        FileInputStream fileInputStream0 = null;
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream1 = null;
                fileInputStream1 = new FileInputStream(file0);
                goto label_8;
            }
            catch(Exception exception0) {
                goto label_12;
            }
            catch(Throwable throwable0) {
            }
            i.e(fileInputStream0, "Failed to close user metadata file.");
            throw throwable0;
            try {
                try {
                label_8:
                    s1 = this.e(i.D(fileInputStream1));
                    g2.f.f().b("Loaded userId " + s1 + " for session " + s);
                    goto label_20;
                }
                catch(Exception exception0) {
                }
            label_12:
                g2.f.f().l("Error deserializing user metadata.", exception0);
                d.i(file0);
            }
            catch(Throwable throwable0) {
                fileInputStream0 = fileInputStream1;
                i.e(fileInputStream0, "Failed to close user metadata file.");
                throw throwable0;
            }
            i.e(fileInputStream1, "Failed to close user metadata file.");
            return null;
        label_20:
            i.e(fileInputStream1, "Failed to close user metadata file.");
            return s1;
        }
        g2.f.f().b("No userId set for session " + s);
        d.i(file0);
        return null;
    }

    private static void i(File file0) {
        if(file0.exists() && file0.delete()) {
            g2.f.f().g("Deleted corrupt file: " + file0.getAbsolutePath());
        }
    }

    private static String j(String s) {
        class a extends JSONObject {
            final String a;

            a(String s) {
                this.put("userId", s);
            }
        }

        return new a(s).toString();
    }

    private static String k(JSONObject jSONObject0, String s) {
        return jSONObject0.isNull(s) ? null : jSONObject0.optString(s, null);
    }

    public void l(String s, Map map0, boolean z) {
        BufferedWriter bufferedWriter1;
        String s1;
        BufferedWriter bufferedWriter0;
        File file0 = z ? this.a(s) : this.b(s);
        try {
            bufferedWriter0 = null;
            s1 = d.f(map0);
            bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), d.b));
            goto label_7;
        }
        catch(Exception exception0) {
            goto label_12;
            try {
            label_7:
                bufferedWriter1.write(s1);
                bufferedWriter1.flush();
                goto label_23;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                bufferedWriter0 = bufferedWriter1;
                i.e(bufferedWriter0, "Failed to close key/value metadata file.");
                throw throwable0;
            }
            bufferedWriter0 = bufferedWriter1;
            try {
            label_12:
                g2.f.f().l("Error serializing key/value metadata.", exception0);
                d.i(file0);
                goto label_17;
            }
            catch(Throwable throwable0) {
            }
            i.e(bufferedWriter0, "Failed to close key/value metadata file.");
            throw throwable0;
        }
        catch(Throwable throwable0) {
            i.e(bufferedWriter0, "Failed to close key/value metadata file.");
            throw throwable0;
        }
    label_17:
        i.e(bufferedWriter0, "Failed to close key/value metadata file.");
        return;
    label_23:
        i.e(bufferedWriter1, "Failed to close key/value metadata file.");
    }

    public void m(String s, String s1) {
        BufferedWriter bufferedWriter1;
        String s2;
        File file0 = this.c(s);
        BufferedWriter bufferedWriter0 = null;
        try {
            s2 = d.j(s1);
            bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), d.b));
            goto label_7;
        }
        catch(Exception exception0) {
            goto label_12;
            try {
            label_7:
                bufferedWriter1.write(s2);
                bufferedWriter1.flush();
                goto label_22;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                bufferedWriter0 = bufferedWriter1;
                i.e(bufferedWriter0, "Failed to close user metadata file.");
                throw throwable0;
            }
            bufferedWriter0 = bufferedWriter1;
            try {
            label_12:
                g2.f.f().l("Error serializing user metadata.", exception0);
                goto label_16;
            }
            catch(Throwable throwable0) {
            }
            i.e(bufferedWriter0, "Failed to close user metadata file.");
            throw throwable0;
        }
        catch(Throwable throwable0) {
            i.e(bufferedWriter0, "Failed to close user metadata file.");
            throw throwable0;
        }
    label_16:
        i.e(bufferedWriter0, "Failed to close user metadata file.");
        return;
    label_22:
        i.e(bufferedWriter1, "Failed to close user metadata file.");
    }
}

