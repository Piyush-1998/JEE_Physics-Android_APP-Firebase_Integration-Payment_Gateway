package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdup;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzduu<V, C> extends zzdup<V, C> {
    private List<zzduw<V>> zzhpk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduu(zzdtf<? extends zzdvt<? extends V>> zzdtfVar, boolean z) {
        super(zzdtfVar, true, true);
        List<zzduw<V>> zzep;
        if (zzdtfVar.isEmpty()) {
            zzep = zzdtg.zzawt();
        } else {
            zzep = zzdto.zzep(zzdtfVar.size());
        }
        for (int i = 0; i < zzdtfVar.size(); i++) {
            zzep.add(null);
        }
        this.zzhpk = zzep;
    }

    abstract C zzj(List<zzduw<V>> list);

    @Override // com.google.android.gms.internal.ads.zzdup
    final void zzb(int i, @NullableDecl V v) {
        List<zzduw<V>> list = this.zzhpk;
        if (list != null) {
            list.set(i, new zzduw<>(v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdup
    final void zzaxe() {
        List<zzduw<V>> list = this.zzhpk;
        if (list != null) {
            set(zzj(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zza(zzdup.zza zzaVar) {
        super.zza(zzaVar);
        this.zzhpk = null;
    }
}
