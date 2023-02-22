package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdco implements zzden<zzdcp> {
    private final PackageInfo zzdpx;
    private final zzaya zzdza;
    private final zzdln zzfqn;
    private final zzdvw zzgay;

    public zzdco(zzdvw zzdvwVar, zzdln zzdlnVar, PackageInfo packageInfo, zzaya zzayaVar) {
        this.zzgay = zzdvwVar;
        this.zzfqn = zzdlnVar;
        this.zzdpx = packageInfo;
        this.zzdza = zzayaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdcp> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcr
            private final zzdco zzguc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguc = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzguc.zzara();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
        if (r9 == 3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zza(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdco.zza(java.util.ArrayList, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdcp zzara() throws Exception {
        final ArrayList<String> arrayList = this.zzfqn.zzhbw;
        if (arrayList == null) {
            return zzdcq.zzgub;
        }
        if (arrayList.isEmpty()) {
            return zzdct.zzgub;
        }
        return new zzdcp(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzdcs
            private final zzdco zzguc;
            private final ArrayList zzgud;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguc = this;
                this.zzgud = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdek
            public final void zzs(Bundle bundle) {
                this.zzguc.zza(this.zzgud, bundle);
            }
        };
    }
}
