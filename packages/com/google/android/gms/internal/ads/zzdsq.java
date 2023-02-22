package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdsq {
    private final String className;
    private final zzdsp zzhlo;
    private zzdsp zzhlp;
    private boolean zzhlq;

    private zzdsq(String str) {
        zzdsp zzdspVar = new zzdsp();
        this.zzhlo = zzdspVar;
        this.zzhlp = zzdspVar;
        this.zzhlq = false;
        this.className = (String) zzdsv.checkNotNull(str);
    }

    public final zzdsq zzy(@NullableDecl Object obj) {
        zzdsp zzdspVar = new zzdsp();
        this.zzhlp.zzhln = zzdspVar;
        this.zzhlp = zzdspVar;
        zzdspVar.value = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzdsp zzdspVar = this.zzhlo.zzhln;
        String str = "";
        while (zzdspVar != null) {
            Object obj = zzdspVar.value;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzdspVar = zzdspVar.zzhln;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
