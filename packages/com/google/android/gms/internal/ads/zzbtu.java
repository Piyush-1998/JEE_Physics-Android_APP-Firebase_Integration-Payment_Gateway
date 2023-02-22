package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtu extends zzbxe<zzbsu> {
    public zzbtu(Set<zzbys<zzbsu>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbtx.zzfst);
    }

    public final void onAdLeftApplication() {
        zza(zzbtw.zzfst);
    }

    public final void onAdOpened() {
        zza(zzbtz.zzfst);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbty.zzfst);
    }

    public final void zzb(final zzatj zzatjVar, final String str, final String str2) {
        zza(new zzbxg(zzatjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbub
            private final String zzdft;
            private final String zzdin;
            private final zzatj zzfsy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsy = zzatjVar;
                this.zzdft = str;
                this.zzdin = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbsu) obj).zzb(this.zzfsy, this.zzdft, this.zzdin);
            }
        });
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbua.zzfst);
    }
}
