package i0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import k0.g;
import m3.F;
import m3.L;
import m3.o;
import w3.b;
import z3.k;

public abstract class e {
    private static final Map a(g g0, String s) {
        Map map2;
        Map map1;
        Cursor cursor0 = g0.H("PRAGMA table_info(`" + s + "`)");
        try {
            if(cursor0.getColumnCount() > 0) {
                int v = cursor0.getColumnIndex("name");
                int v1 = cursor0.getColumnIndex("type");
                int v2 = cursor0.getColumnIndex("notnull");
                int v3 = cursor0.getColumnIndex("pk");
                int v4 = cursor0.getColumnIndex("dflt_value");
                Map map0 = F.c();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(v);
                    String s2 = cursor0.getString(v1);
                    boolean z = cursor0.getInt(v2) != 0;
                    int v5 = cursor0.getInt(v3);
                    String s3 = cursor0.getString(v4);
                    k.d(s1, "name");
                    k.d(s2, "type");
                    map0.put(s1, new a(s1, s2, z, v5, s3, 2));
                }
                map1 = F.b(map0);
                goto label_19;
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
            b.a(cursor0, throwable0);
            throw throwable0;
        }
    label_19:
        b.a(cursor0, null);
        return map1;
        try {
        label_21:
            map2 = F.h();
        }
        catch(Throwable throwable0) {
            b.a(cursor0, throwable0);
            throw throwable0;
        }
        b.a(cursor0, null);
        return map2;
    }

    private static final List b(Cursor cursor0) {
        int v = cursor0.getColumnIndex("id");
        int v1 = cursor0.getColumnIndex("seq");
        int v2 = cursor0.getColumnIndex("from");
        int v3 = cursor0.getColumnIndex("to");
        List list0 = o.c();
        while(cursor0.moveToNext()) {
            int v4 = cursor0.getInt(v);
            int v5 = cursor0.getInt(v1);
            String s = cursor0.getString(v2);
            k.d(s, "cursor.getString(fromColumnIndex)");
            String s1 = cursor0.getString(v3);
            k.d(s1, "cursor.getString(toColumnIndex)");
            list0.add(new d(v4, v5, s, s1));
        }
        return o.B(o.a(list0));
    }

    private static final Set c(g g0, String s) {
        Set set1;
        Cursor cursor0 = g0.H("PRAGMA foreign_key_list(`" + s + "`)");
        try {
            int v = cursor0.getColumnIndex("id");
            int v1 = cursor0.getColumnIndex("seq");
            int v2 = cursor0.getColumnIndex("table");
            int v3 = cursor0.getColumnIndex("on_delete");
            int v4 = cursor0.getColumnIndex("on_update");
            List list0 = e.b(cursor0);
            cursor0.moveToPosition(-1);
            Set set0 = L.b();
            while(cursor0.moveToNext()) {
                if(cursor0.getInt(v1) == 0) {
                    int v5 = cursor0.getInt(v);
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object0: list0) {
                        if(((d)object0).g() == v5) {
                            arrayList2.add(object0);
                        }
                    }
                    for(Object object1: arrayList2) {
                        arrayList0.add(((d)object1).f());
                        arrayList1.add(((d)object1).h());
                    }
                    String s1 = cursor0.getString(v2);
                    k.d(s1, "cursor.getString(tableColumnIndex)");
                    String s2 = cursor0.getString(v3);
                    k.d(s2, "cursor.getString(onDeleteColumnIndex)");
                    String s3 = cursor0.getString(v4);
                    k.d(s3, "cursor.getString(onUpdateColumnIndex)");
                    set0.add(new c(s1, s2, s3, arrayList0, arrayList1));
                }
            }
            set1 = L.a(set0);
            goto label_42;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            b.a(cursor0, throwable0);
            throw throwable1;
        }
    label_42:
        b.a(cursor0, null);
        return set1;
    }

    private static final i0.d.e d(g g0, String s, boolean z) {
        i0.d.e d$e0;
        Cursor cursor0 = g0.H("PRAGMA index_xinfo(`" + s + "`)");
        try {
            int v = cursor0.getColumnIndex("seqno");
            int v1 = cursor0.getColumnIndex("cid");
            int v2 = cursor0.getColumnIndex("name");
            int v3 = cursor0.getColumnIndex("desc");
            if(v != -1 && v1 != -1 && v2 != -1 && v3 != -1) {
                TreeMap treeMap0 = new TreeMap();
                TreeMap treeMap1 = new TreeMap();
                while(cursor0.moveToNext()) {
                    if(cursor0.getInt(v1) >= 0) {
                        int v4 = cursor0.getInt(v);
                        String s1 = cursor0.getString(v2);
                        String s2 = cursor0.getInt(v3) <= 0 ? "ASC" : "DESC";
                        k.d(s1, "columnName");
                        treeMap0.put(v4, s1);
                        treeMap1.put(v4, s2);
                    }
                }
                Collection collection0 = treeMap0.values();
                k.d(collection0, "columnsMap.values");
                List list0 = o.F(collection0);
                Collection collection1 = treeMap1.values();
                k.d(collection1, "ordersMap.values");
                d$e0 = new i0.d.e(s, z, list0, o.F(collection1));
                goto label_29;
            }
            goto label_31;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            b.a(cursor0, throwable0);
            throw throwable1;
        }
    label_29:
        b.a(cursor0, null);
        return d$e0;
    label_31:
        b.a(cursor0, null);
        return null;
    }

    private static final Set e(g g0, String s) {
        Set set1;
        Set set0;
        Cursor cursor0 = g0.H("PRAGMA index_list(`" + s + "`)");
        int v = cursor0.getColumnIndex("name");
        int v1 = cursor0.getColumnIndex("origin");
        int v2 = cursor0.getColumnIndex("unique");
        if(v != -1 && v1 != -1 && v2 != -1) {
            set0 = L.b();
            while(true) {
                if(!cursor0.moveToNext()) {
                    set1 = L.a(set0);
                    goto label_24;
                }
                if(k.a("c", cursor0.getString(v1))) {
                    String s1 = cursor0.getString(v);
                    boolean z = cursor0.getInt(v2) == 1;
                    k.d(s1, "name");
                    i0.d.e d$e0 = e.d(g0, s1, z);
                    if(d$e0 == null) {
                        b.a(cursor0, null);
                        return null;
                    }
                    set0.add(d$e0);
                }
            }
        }
        b.a(cursor0, null);
        return null;
        try {
            set1 = L.a(set0);
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            b.a(cursor0, throwable0);
            throw throwable1;
        }
    label_24:
        b.a(cursor0, null);
        return set1;
    }

    public static final i0.d f(g g0, String s) {
        k.e(g0, "database");
        k.e(s, "tableName");
        return new i0.d(s, e.a(g0, s), e.c(g0, s), e.e(g0, s));
    }
}

