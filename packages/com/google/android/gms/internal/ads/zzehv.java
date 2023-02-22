package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzehv implements zzehw {
    @Override // com.google.android.gms.internal.ads.zzehw
    public final Map<?, ?> zzan(Object obj) {
        return (zzeht) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final zzehu<?, ?> zzao(Object obj) {
        zzehr zzehrVar = (zzehr) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final Map<?, ?> zzap(Object obj) {
        return (zzeht) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final boolean zzaq(Object obj) {
        return !((zzeht) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final Object zzar(Object obj) {
        ((zzeht) obj).zzbdg();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final Object zzas(Object obj) {
        return zzeht.zzbgt().zzbgu();
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final Object zzf(Object obj, Object obj2) {
        zzeht zzehtVar = (zzeht) obj;
        zzeht zzehtVar2 = (zzeht) obj2;
        if (!zzehtVar2.isEmpty()) {
            if (!zzehtVar.isMutable()) {
                zzehtVar = zzehtVar.zzbgu();
            }
            zzehtVar.zza(zzehtVar2);
        }
        return zzehtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehw
    public final int zzb(int i, Object obj, Object obj2) {
        zzeht zzehtVar = (zzeht) obj;
        zzehr zzehrVar = (zzehr) obj2;
        if (zzehtVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzehtVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
