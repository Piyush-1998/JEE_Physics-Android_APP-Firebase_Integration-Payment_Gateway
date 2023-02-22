package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzblr {
    private final Executor executor;
    private final String zzbqz;
    private final zzalz zzflq;
    private zzbma zzflr;
    private final zzahf<Object> zzfls = new zzblu(this);
    private final zzahf<Object> zzflt = new zzblw(this);

    public zzblr(String str, zzalz zzalzVar, Executor executor) {
        this.zzbqz = str;
        this.zzflq = zzalzVar;
        this.executor = executor;
    }

    public final void zza(zzbma zzbmaVar) {
        this.zzflq.zzc("/updateActiveView", this.zzfls);
        this.zzflq.zzc("/untrackActiveViewUnit", this.zzflt);
        this.zzflr = zzbmaVar;
    }

    public final void zzd(zzbfq zzbfqVar) {
        zzbfqVar.zza("/updateActiveView", this.zzfls);
        zzbfqVar.zza("/untrackActiveViewUnit", this.zzflt);
    }

    public final void zze(zzbfq zzbfqVar) {
        zzbfqVar.zzb("/updateActiveView", this.zzfls);
        zzbfqVar.zzb("/untrackActiveViewUnit", this.zzflt);
    }

    public final void zzagx() {
        this.zzflq.zzd("/updateActiveView", this.zzfls);
        this.zzflq.zzd("/untrackActiveViewUnit", this.zzflt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzm(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzbqz);
    }
}
