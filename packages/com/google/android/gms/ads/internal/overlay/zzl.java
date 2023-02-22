package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzaxu;
import com.google.android.gms.internal.ads.zzayh;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzl extends zzaxu {
    final /* synthetic */ zzc zzdop;

    private zzl(zzc zzcVar) {
        this.zzdop = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxu
    public final void zzuy() {
        Bitmap zza = com.google.android.gms.ads.internal.zzp.zzli().zza(Integer.valueOf(this.zzdop.zzdno.zzdoy.zzbow));
        if (zza != null) {
            final Drawable zza2 = com.google.android.gms.ads.internal.zzp.zzkr().zza(this.zzdop.zzaas, zza, this.zzdop.zzdno.zzdoy.zzbou, this.zzdop.zzdno.zzdoy.zzbov);
            zzayh.zzeaj.post(new Runnable(this, zza2) { // from class: com.google.android.gms.ads.internal.overlay.zzk
                private final zzl zzdon;
                private final Drawable zzdoo;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdon = this;
                    this.zzdoo = zza2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzl zzlVar = this.zzdon;
                    zzlVar.zzdop.zzaas.getWindow().setBackgroundDrawable(this.zzdoo);
                }
            });
        }
    }
}
