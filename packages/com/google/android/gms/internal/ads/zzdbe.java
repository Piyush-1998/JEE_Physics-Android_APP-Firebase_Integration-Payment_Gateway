package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbe implements zzden<zzdek<Bundle>> {
    private final zzdij zzgtk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbe(zzdij zzdijVar) {
        this.zzgtk = zzdijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdek<Bundle>> zzaqs() {
        zzdij zzdijVar = this.zzgtk;
        return zzdvl.zzaf((zzdijVar == null || zzdijVar.zzasf() == null || this.zzgtk.zzasf().isEmpty()) ? null : new zzdek(this) { // from class: com.google.android.gms.internal.ads.zzdbh
            private final zzdbe zzgtl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdek
            public final void zzs(Object obj) {
                this.zzgtl.zzp((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Bundle bundle) {
        bundle.putString("key_schema", this.zzgtk.zzasf());
    }
}
