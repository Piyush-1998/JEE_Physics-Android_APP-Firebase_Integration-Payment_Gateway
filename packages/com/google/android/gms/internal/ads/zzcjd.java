package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcjd {
    private final Map<String, zzcje> zzgdt = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzdlx zzdlxVar) {
        if (this.zzgdt.containsKey(str)) {
            return;
        }
        try {
            this.zzgdt.put(str, new zzcje(str, zzdlxVar.zztw(), zzdlxVar.zztx()));
        } catch (zzdlr unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzapa zzapaVar) {
        if (this.zzgdt.containsKey(str)) {
            return;
        }
        try {
            this.zzgdt.put(str, new zzcje(str, zzapaVar.zztw(), zzapaVar.zztx()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzcje zzgg(String str) {
        return this.zzgdt.get(str);
    }
}
