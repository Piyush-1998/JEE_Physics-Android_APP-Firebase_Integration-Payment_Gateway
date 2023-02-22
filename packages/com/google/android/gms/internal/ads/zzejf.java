package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TK; */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzejf implements Comparable<zzejf>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzeja zzijy;
    private final Comparable zzikc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejf(zzeja zzejaVar, Map.Entry<K, V> entry) {
        this(zzejaVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzejf(zzeja zzejaVar, K k, V v) {
        this.zzijy = zzejaVar;
        this.zzikc = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzijy.zzbht();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.zzikc, entry.getKey()) && equals(this.value, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzikc;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.value;
        return hashCode ^ (v != 0 ? v.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzikc);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzikc;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzejf zzejfVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzejfVar.getKey());
    }
}
