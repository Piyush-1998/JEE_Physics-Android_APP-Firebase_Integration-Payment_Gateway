package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzeja<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzicu;
    private final int zzijs;
    private List<zzejf> zzijt;
    private Map<K, V> zziju;
    private volatile zzejh zzijv;
    private Map<K, V> zzijw;
    private volatile zzejb zzijx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzegk<FieldDescriptorType>> zzeja<FieldDescriptorType, Object> zzho(int i) {
        return new zzeiz(i);
    }

    private zzeja(int i) {
        this.zzijs = i;
        this.zzijt = Collections.emptyList();
        this.zziju = Collections.emptyMap();
        this.zzijw = Collections.emptyMap();
    }

    public void zzbdg() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzicu) {
            return;
        }
        if (this.zziju.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zziju);
        }
        this.zziju = unmodifiableMap;
        if (this.zzijw.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzijw);
        }
        this.zzijw = unmodifiableMap2;
        this.zzicu = true;
    }

    public final boolean isImmutable() {
        return this.zzicu;
    }

    public final int zzbhq() {
        return this.zzijt.size();
    }

    public final Map.Entry<K, V> zzhp(int i) {
        return this.zzijt.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzbhr() {
        if (this.zziju.isEmpty()) {
            return zzeje.zzbhw();
        }
        return this.zziju.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzijt.size() + this.zziju.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzeja<K, V>) comparable) >= 0 || this.zziju.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzeja<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzijt.get(zza).getValue();
        }
        return this.zziju.get(comparable);
    }

    public final V zza(K k, V v) {
        zzbht();
        int zza = zza((zzeja<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzijt.get(zza).setValue(v);
        }
        zzbht();
        if (this.zzijt.isEmpty() && !(this.zzijt instanceof ArrayList)) {
            this.zzijt = new ArrayList(this.zzijs);
        }
        int i = -(zza + 1);
        if (i >= this.zzijs) {
            return zzbhu().put(k, v);
        }
        int size = this.zzijt.size();
        int i2 = this.zzijs;
        if (size == i2) {
            zzejf remove = this.zzijt.remove(i2 - 1);
            zzbhu().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzijt.add(i, new zzejf(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzbht();
        if (!this.zzijt.isEmpty()) {
            this.zzijt.clear();
        }
        if (this.zziju.isEmpty()) {
            return;
        }
        this.zziju.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzbht();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzeja<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzhq(zza);
        }
        if (this.zziju.isEmpty()) {
            return null;
        }
        return this.zziju.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzhq(int i) {
        zzbht();
        V v = (V) this.zzijt.remove(i).getValue();
        if (!this.zziju.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzbhu().entrySet().iterator();
            this.zzijt.add(new zzejf(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzijt.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzijt.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzijt.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzijv == null) {
            this.zzijv = new zzejh(this, null);
        }
        return this.zzijv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzbhs() {
        if (this.zzijx == null) {
            this.zzijx = new zzejb(this, null);
        }
        return this.zzijx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbht() {
        if (this.zzicu) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzbhu() {
        zzbht();
        if (this.zziju.isEmpty() && !(this.zziju instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zziju = treeMap;
            this.zzijw = treeMap.descendingMap();
        }
        return (SortedMap) this.zziju;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeja)) {
            return super.equals(obj);
        }
        zzeja zzejaVar = (zzeja) obj;
        int size = size();
        if (size != zzejaVar.size()) {
            return false;
        }
        int zzbhq = zzbhq();
        if (zzbhq != zzejaVar.zzbhq()) {
            return entrySet().equals(zzejaVar.entrySet());
        }
        for (int i = 0; i < zzbhq; i++) {
            if (!zzhp(i).equals(zzejaVar.zzhp(i))) {
                return false;
            }
        }
        if (zzbhq != size) {
            return this.zziju.equals(zzejaVar.zziju);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzbhq = zzbhq();
        int i = 0;
        for (int i2 = 0; i2 < zzbhq; i2++) {
            i += this.zzijt.get(i2).hashCode();
        }
        return this.zziju.size() > 0 ? i + this.zziju.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzeja<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeja(int i, zzeiz zzeizVar) {
        this(i);
    }
}
