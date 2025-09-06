package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class d {
    public static final class a {
        private Map a;

        public a() {
            this.a = new HashMap();
        }

        public d a() {
            d d0 = new d(this.a);
            d.n(d0);
            return d0;
        }

        public a b(String s, Object object0) {
            if(object0 == null) {
                this.a.put(s, null);
                return this;
            }
            Class class0 = object0.getClass();
            if(class0 != Boolean.class && class0 != Byte.class && class0 != Integer.class && class0 != Long.class && class0 != Float.class && class0 != Double.class && class0 != String.class && class0 != Boolean[].class && class0 != Byte[].class && class0 != Integer[].class && class0 != Long[].class && class0 != Float[].class && class0 != Double[].class && class0 != String[].class) {
                if(class0 == boolean[].class) {
                    this.a.put(s, d.a(((boolean[])object0)));
                    return this;
                }
                if(class0 == byte[].class) {
                    this.a.put(s, d.b(((byte[])object0)));
                    return this;
                }
                if(class0 == int[].class) {
                    this.a.put(s, d.e(((int[])object0)));
                    return this;
                }
                if(class0 == long[].class) {
                    this.a.put(s, d.f(((long[])object0)));
                    return this;
                }
                if(class0 == float[].class) {
                    this.a.put(s, d.d(((float[])object0)));
                    return this;
                }
                if(class0 != double[].class) {
                    throw new IllegalArgumentException("Key " + s + "has invalid type " + class0);
                }
                this.a.put(s, d.c(((double[])object0)));
                return this;
            }
            this.a.put(s, object0);
            return this;
        }

        public a c(d d0) {
            this.d(d0.a);
            return this;
        }

        public a d(Map map0) {
            for(Object object0: map0.entrySet()) {
                this.b(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
            return this;
        }

        public a e(String s, boolean z) {
            this.a.put(s, Boolean.valueOf(z));
            return this;
        }

        public a f(String s, int v) {
            this.a.put(s, v);
            return this;
        }

        public a g(String s, long v) {
            this.a.put(s, v);
            return this;
        }

        public a h(String s, String s1) {
            this.a.put(s, s1);
            return this;
        }
    }

    Map a;
    private static final String b;
    public static final d c;

    static {
        d.b = "WM-Data";
        d.c = new a().a();
    }

    public d(d d0) {
        this.a = new HashMap(d0.a);
    }

    public d(Map map0) {
        this.a = new HashMap(map0);
    }

    public static Boolean[] a(boolean[] arr_z) {
        Boolean[] arr_boolean = new Boolean[arr_z.length];
        for(int v = 0; v < arr_z.length; ++v) {
            arr_boolean[v] = Boolean.valueOf(arr_z[v]);
        }
        return arr_boolean;
    }

    public static Byte[] b(byte[] arr_b) {
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }

    public static Double[] c(double[] arr_f) {
        Double[] arr_double = new Double[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_double[v] = (double)arr_f[v];
        }
        return arr_double;
    }

    public static Float[] d(float[] arr_f) {
        Float[] arr_float = new Float[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_float[v] = (float)arr_f[v];
        }
        return arr_float;
    }

    public static Integer[] e(int[] arr_v) {
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    @Override
    public boolean equals(Object object0) {
        boolean z;
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(d.class == class0) {
                Set set0 = this.a.keySet();
                if(!set0.equals(((d)object0).a.keySet())) {
                    return false;
                }
                for(Object object1: set0) {
                    Object object2 = this.a.get(((String)object1));
                    Object object3 = ((d)object0).a.get(((String)object1));
                    if(object2 == null || object3 == null) {
                        z = object2 == object3;
                    }
                    else if(!(object2 instanceof Object[]) || !(object3 instanceof Object[])) {
                        z = object2.equals(object3);
                    }
                    else {
                        z = Arrays.deepEquals(((Object[])object2), ((Object[])object3));
                    }
                    if(!z) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static Long[] f(long[] arr_v) {
        Long[] arr_long = new Long[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_long[v] = (long)arr_v[v];
        }
        return arr_long;
    }

    public static d g(byte[] arr_b) {
        Throwable throwable1;
        IOException iOException1;
        ObjectInputStream objectInputStream0;
        if(arr_b.length <= 0x2800) {
            HashMap hashMap0 = new HashMap();
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            try {
                objectInputStream0 = null;
                objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
            }
            catch(IOException | ClassNotFoundException iOException0) {
                iOException1 = iOException0;
                goto label_18;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                goto label_27;
            }
            try {
                int v = objectInputStream0.readInt();
                while(true) {
                    if(v <= 0) {
                        goto label_37;
                    }
                    hashMap0.put(objectInputStream0.readUTF(), objectInputStream0.readObject());
                    --v;
                }
            }
            catch(IOException | ClassNotFoundException iOException1) {
                try {
                label_18:
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException1);
                    if(objectInputStream0 != null) {
                        goto label_20;
                    }
                    goto label_24;
                }
                catch(Throwable throwable1) {
                    goto label_27;
                }
                try {
                label_20:
                    objectInputStream0.close();
                }
                catch(IOException iOException2) {
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException2);
                }
                try {
                label_24:
                    byteArrayInputStream0.close();
                }
                catch(IOException iOException3) {
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException3);
                    return new d(hashMap0);
                }
                return new d(hashMap0);
            }
            catch(Throwable throwable1) {
            }
        label_27:
            if(objectInputStream0 != null) {
                try {
                    objectInputStream0.close();
                }
                catch(IOException iOException4) {
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException4);
                }
            }
            try {
                byteArrayInputStream0.close();
            }
            catch(IOException iOException5) {
                Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException5);
            }
            throw throwable1;
            try {
            label_37:
                objectInputStream0.close();
            }
            catch(IOException iOException6) {
                Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException6);
            }
            try {
                byteArrayInputStream0.close();
                return new d(hashMap0);
            }
            catch(IOException iOException3) {
                Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException3);
                return new d(hashMap0);
            }
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public boolean h(String s, boolean z) {
        Object object0 = this.a.get(s);
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : z;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    public int i(String s, int v) {
        Object object0 = this.a.get(s);
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : v;
    }

    public Map j() {
        return Collections.unmodifiableMap(this.a);
    }

    public long k(String s, long v) {
        Object object0 = this.a.get(s);
        return object0 instanceof Long ? ((long)(((Long)object0))) : v;
    }

    public String l(String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    public int m() {
        return this.a.size();
    }

    public static byte[] n(d d0) {
        byte[] arr_b;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream0 = null;
        try {
            try {
                objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
                objectOutputStream0.writeInt(d0.m());
                Iterator iterator0 = d0.a.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_34;
                    }
                    Object object0 = iterator0.next();
                    objectOutputStream0.writeUTF(((String)((Map.Entry)object0).getKey()));
                    objectOutputStream0.writeObject(((Map.Entry)object0).getValue());
                }
            }
            catch(IOException iOException0) {
            }
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException0);
            arr_b = byteArrayOutputStream0.toByteArray();
            if(objectOutputStream0 != null) {
                goto label_14;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
        try {
        label_14:
            objectOutputStream0.close();
        }
        catch(IOException iOException1) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException1);
        }
        try {
        label_18:
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException2) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException2);
        }
        return arr_b;
    label_24:
        if(objectOutputStream0 != null) {
            try {
                objectOutputStream0.close();
            }
            catch(IOException iOException3) {
                Log.e("WM-Data", "Error in Data#toByteArray: ", iOException3);
            }
        }
        try {
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException4) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException4);
        }
        throw throwable0;
        try {
        label_34:
            objectOutputStream0.close();
        }
        catch(IOException iOException5) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException5);
        }
        try {
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException6) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException6);
        }
        if(byteArrayOutputStream0.size() > 0x2800) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        return byteArrayOutputStream0.toByteArray();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Data {");
        if(!this.a.isEmpty()) {
            for(Object object0: this.a.keySet()) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(" : ");
                Object object1 = this.a.get(((String)object0));
                if(object1 instanceof Object[]) {
                    stringBuilder0.append(Arrays.toString(((Object[])object1)));
                }
                else {
                    stringBuilder0.append(object1);
                }
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

