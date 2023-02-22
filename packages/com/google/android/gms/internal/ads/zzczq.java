package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzczq implements zzduv {
    static final zzduv zzbok = new zzczq();

    private zzczq() {
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt zzf(Object obj) {
        final String str = (String) obj;
        return zzdvl.zzaf(new zzdek(str) { // from class: com.google.android.gms.internal.ads.zzczt
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdek
            public final void zzs(Object obj2) {
                ((Bundle) obj2).putString("ms", this.zzdgb);
            }
        });
    }
}
