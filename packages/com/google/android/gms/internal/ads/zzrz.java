package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzrz implements Comparator<zzrn> {
    public zzrz(zzsa zzsaVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzrn zzrnVar, zzrn zzrnVar2) {
        zzrn zzrnVar3 = zzrnVar;
        zzrn zzrnVar4 = zzrnVar2;
        if (zzrnVar3.zzmm() < zzrnVar4.zzmm()) {
            return -1;
        }
        if (zzrnVar3.zzmm() > zzrnVar4.zzmm()) {
            return 1;
        }
        if (zzrnVar3.zzml() < zzrnVar4.zzml()) {
            return -1;
        }
        if (zzrnVar3.zzml() > zzrnVar4.zzml()) {
            return 1;
        }
        float zzmo = (zzrnVar3.zzmo() - zzrnVar3.zzmm()) * (zzrnVar3.zzmn() - zzrnVar3.zzml());
        float zzmo2 = (zzrnVar4.zzmo() - zzrnVar4.zzmm()) * (zzrnVar4.zzmn() - zzrnVar4.zzml());
        if (zzmo > zzmo2) {
            return -1;
        }
        return zzmo < zzmo2 ? 1 : 0;
    }
}
