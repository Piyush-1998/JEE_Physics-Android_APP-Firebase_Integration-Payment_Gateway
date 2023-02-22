package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdaz implements zzden<zzdaw> {
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzdaz(zzdvw zzdvwVar, Context context) {
        this.zzgay = zzdvwVar;
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdaw> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzday
            private final zzdaz zzgti;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgti = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgti.zzaqw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdaw zzaqw() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzvr.getSystemService("audio");
        return new zzdaw(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzp.zzku().zzqd(), com.google.android.gms.ads.internal.zzp.zzku().zzqe());
    }
}
