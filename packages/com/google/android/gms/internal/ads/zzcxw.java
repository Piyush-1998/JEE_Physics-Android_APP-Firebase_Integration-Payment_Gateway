package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxw {
    private final zzcdg zzgqx;
    private final zzcxm zzgqy;
    private final zzbsz zzgqz;

    public zzcxw(zzcdg zzcdgVar) {
        final zzcxm zzcxmVar = new zzcxm();
        this.zzgqy = zzcxmVar;
        this.zzgqx = zzcdgVar;
        final zzaiz zzamg = zzcdgVar.zzamg();
        this.zzgqz = new zzbsz(zzcxmVar, zzamg) { // from class: com.google.android.gms.internal.ads.zzcxv
            private final zzcxm zzgqf;
            private final zzaiz zzgqw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqf = zzcxmVar;
                this.zzgqw = zzamg;
            }

            @Override // com.google.android.gms.internal.ads.zzbsz
            public final void zzg(zzuw zzuwVar) {
                zzcxm zzcxmVar2 = this.zzgqf;
                zzaiz zzaizVar = this.zzgqw;
                zzcxmVar2.zzg(zzuwVar);
                if (zzaizVar != null) {
                    try {
                        zzaizVar.zzc(zzuwVar);
                    } catch (RemoteException e) {
                        zzbbd.zze("#007 Could not call remote method.", e);
                    }
                    try {
                        zzaizVar.onInstreamAdFailedToLoad(zzuwVar.errorCode);
                    } catch (RemoteException e2) {
                        zzbbd.zze("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zzc(zzwl zzwlVar) {
        this.zzgqy.zzc(zzwlVar);
    }

    public final zzcbj zzaqf() {
        return new zzcbj(this.zzgqx, this.zzgqy.zzaqc());
    }

    public final zzcxm zzaqg() {
        return this.zzgqy;
    }

    public final zzbsu zzaqh() {
        return this.zzgqy;
    }

    public final zzbuj zzaqi() {
        return this.zzgqy;
    }

    public final zzbsz zzaqj() {
        return this.zzgqz;
    }

    public final zzbtm zzaqk() {
        return this.zzgqy;
    }

    public final zzut zzaql() {
        return this.zzgqy;
    }
}
