package androidx.collection;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;

public class e {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public e(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = v;
        this.map = new LinkedHashMap(0, 0.75f, true);
    }

    private int a(Object object0, Object object1) {
        return 1;
    }

    protected Object create(Object object0) {
        return null;
    }

    public final int createCount() {
        synchronized(this) {
        }
        return this.createCount;
    }

    protected void entryRemoved(boolean z, Object object0, Object object1, Object object2) {
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        synchronized(this) {
        }
        return this.evictionCount;
    }

    public final Object get(Object object0) {
        Object object3;
        Object object1;
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized(this) {
            object1 = this.map.get(object0);
            if(object1 != null) {
                ++this.hitCount;
                return object1;
            }
            goto label_7;
        }
        return object1;
    label_7:
        ++this.missCount;
        Object object2 = this.create(object0);
        if(object2 == null) {
            return null;
        }
        synchronized(this) {
            ++this.createCount;
            object3 = this.map.put(object0, object2);
            if(object3 == null) {
                this.size += this.a(object0, object2);
            }
            else {
                this.map.put(object0, object3);
            }
        }
        if(object3 != null) {
            return object3;
        }
        this.trimToSize(this.maxSize);
        return object2;
    }

    public final int hitCount() {
        synchronized(this) {
        }
        return this.hitCount;
    }

    public final int maxSize() {
        synchronized(this) {
        }
        return this.maxSize;
    }

    public final int missCount() {
        synchronized(this) {
        }
        return this.missCount;
    }

    public final Object put(Object object0, Object object1) {
        Object object2;
        if(object0 == null || object1 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized(this) {
            ++this.putCount;
            this.size += this.a(object0, object1);
            object2 = this.map.put(object0, object1);
            if(object2 != null) {
                this.size -= this.a(object0, object2);
            }
        }
        this.trimToSize(this.maxSize);
        return object2;
    }

    public final int putCount() {
        synchronized(this) {
        }
        return this.putCount;
    }

    public final Object remove(Object object0) {
        if(object0 != null) {
            synchronized(this) {
                Object object1 = this.map.remove(object0);
                if(object1 != null) {
                    this.size -= this.a(object0, object1);
                }
                return object1;
            }
        }
        throw new NullPointerException("key == null");
    }

    public void resize(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized(this) {
            this.maxSize = v;
        }
        this.trimToSize(v);
    }

    public final int size() {
        synchronized(this) {
        }
        return this.size;
    }

    protected int sizeOf(Object object0, Object object1) [...] // Inlined contents

    public final Map snapshot() {
        synchronized(this) {
            return new LinkedHashMap(this.map);
        }
    }

    @Override
    public final String toString() {
        int v2;
        synchronized(this) {
            int v1 = this.missCount + this.hitCount;
            v2 = v1 == 0 ? 0 : this.hitCount * 100 / v1;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.maxSize, this.hitCount, this.missCount, v2);
    }

    public void trimToSize(int v) {
        int v1;
        while(true) {
            synchronized(this) {
                v1 = FIN.finallyOpen$NT();
                if(this.size < 0 || this.map.isEmpty() && this.size != 0) {
                    break;
                }
                if(this.size > v && !this.map.isEmpty()) {
                    Object object0 = this.map.entrySet().iterator().next();
                    Object object1 = ((Map.Entry)object0).getKey();
                    Object object2 = ((Map.Entry)object0).getValue();
                    this.map.remove(object1);
                    this.size -= this.a(object1, object2);
                    ++this.evictionCount;
                    FIN.finallyExec$NT(v1);
                    continue;
                }
                FIN.finallyCodeBegin$NT(v1);
            }
            FIN.finallyCodeEnd$NT(v1);
            return;
        }
        FIN.finallyExec$NT(v1);
        throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}

