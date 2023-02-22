package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbzc extends zzbxe<zzahp> implements zzahp {
    public zzbzc(Set<zzbys<zzahp>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final synchronized void zzsv() {
        zza(zzbzb.zzfst);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zza(final zzaue zzaueVar) {
        zza(new zzbxg(zzaueVar) { // from class: com.google.android.gms.internal.ads.zzbze
            private final zzaue zzfup;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfup = zzaueVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzahp) obj).zza(this.zzfup);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzsw() {
        zza(zzbzd.zzfst);
    }
}
