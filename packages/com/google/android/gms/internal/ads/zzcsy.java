package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcsy implements zzcaz {
    private zzbtl zzfrn = null;
    private final zzdkx zzfro;
    private final zzapa zzgmm;
    private final boolean zzgmn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsy(zzdkx zzdkxVar, zzapa zzapaVar, boolean z) {
        this.zzfro = zzdkxVar;
        this.zzgmm = zzapaVar;
        this.zzgmn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zza(boolean z, Context context) throws zzcbc {
        boolean zzz;
        try {
            if (this.zzgmn) {
                zzz = this.zzgmm.zzaa(ObjectWrapper.wrap(context));
            } else {
                zzz = this.zzgmm.zzz(ObjectWrapper.wrap(context));
            }
            if (!zzz) {
                throw new zzcbc("Adapter failed to show.");
            }
            if (this.zzfrn == null) {
                return;
            }
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpx)).booleanValue() || this.zzfro.zzhaz != 2) {
                return;
            }
            this.zzfrn.onAdImpression();
        } catch (Throwable th) {
            throw new zzcbc(th);
        }
    }

    public final void zza(zzbtl zzbtlVar) {
        this.zzfrn = zzbtlVar;
    }
}
