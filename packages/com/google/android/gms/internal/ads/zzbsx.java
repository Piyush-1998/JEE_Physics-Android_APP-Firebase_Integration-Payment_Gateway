package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsx extends zzbxe<zzbsz> implements zzbsz {
    public zzbsx(Set<zzbys<zzbsz>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(final zzuw zzuwVar) {
        zza(new zzbxg(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzbsw
            private final zzuw zzfsu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsu = zzuwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbsz) obj).zzg(this.zzfsu);
            }
        });
    }
}
