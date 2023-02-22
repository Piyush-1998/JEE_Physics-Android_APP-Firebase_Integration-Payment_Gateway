package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzavy implements zzqu {
    private final Object lock;
    private String zzbuo;
    private final Context zzcle;
    private boolean zzdwp;

    public zzavy(Context context, String str) {
        this.zzcle = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzbuo = str;
        this.zzdwp = false;
        this.lock = new Object();
    }

    public final void zzam(boolean z) {
        if (com.google.android.gms.ads.internal.zzp.zzln().zzac(this.zzcle)) {
            synchronized (this.lock) {
                if (this.zzdwp == z) {
                    return;
                }
                this.zzdwp = z;
                if (TextUtils.isEmpty(this.zzbuo)) {
                    return;
                }
                if (this.zzdwp) {
                    com.google.android.gms.ads.internal.zzp.zzln().zzf(this.zzcle, this.zzbuo);
                } else {
                    com.google.android.gms.ads.internal.zzp.zzln().zzg(this.zzcle, this.zzbuo);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final void zza(zzqr zzqrVar) {
        zzam(zzqrVar.zzbrk);
    }

    public final String getAdUnitId() {
        return this.zzbuo;
    }
}
