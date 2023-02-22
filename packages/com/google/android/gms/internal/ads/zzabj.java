package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzabj extends zzabo {
    private final com.google.android.gms.ads.internal.zzg zzcyp;
    private final String zzcyq;
    private final String zzcyr;

    public zzabj(com.google.android.gms.ads.internal.zzg zzgVar, String str, String str2) {
        this.zzcyp = zzgVar;
        this.zzcyq = str;
        this.zzcyr = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final String zzrp() {
        return this.zzcyq;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final String getContent() {
        return this.zzcyr;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzn(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zzcyp.zzh((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void recordClick() {
        this.zzcyp.zzka();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void recordImpression() {
        this.zzcyp.zzkb();
    }
}
