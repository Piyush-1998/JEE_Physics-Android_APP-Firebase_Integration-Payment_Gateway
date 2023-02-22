package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwm implements com.google.android.gms.ads.internal.zzg {
    private com.google.android.gms.ads.internal.zzg zzgpf;

    public final synchronized void zza(com.google.android.gms.ads.internal.zzg zzgVar) {
        this.zzgpf = zzgVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzh(View view) {
        if (this.zzgpf != null) {
            this.zzgpf.zzh(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzka() {
        if (this.zzgpf != null) {
            this.zzgpf.zzka();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzkb() {
        if (this.zzgpf != null) {
            this.zzgpf.zzkb();
        }
    }
}
