package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbes implements Iterable<zzbeq> {
    private final List<zzbeq> zzekq = new ArrayList();

    public static boolean zzc(zzbde zzbdeVar) {
        zzbeq zzd = zzd(zzbdeVar);
        if (zzd != null) {
            zzd.zzekp.abort();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbeq zzd(zzbde zzbdeVar) {
        Iterator<zzbeq> it = com.google.android.gms.ads.internal.zzp.zzll().iterator();
        while (it.hasNext()) {
            zzbeq next = it.next();
            if (next.zzefm == zzbdeVar) {
                return next;
            }
        }
        return null;
    }

    public final void zza(zzbeq zzbeqVar) {
        this.zzekq.add(zzbeqVar);
    }

    public final void zzb(zzbeq zzbeqVar) {
        this.zzekq.remove(zzbeqVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzbeq> iterator() {
        return this.zzekq.iterator();
    }
}
