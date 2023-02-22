package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzrs implements Comparator<zzry> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrs(zzrp zzrpVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzry zzryVar, zzry zzryVar2) {
        zzry zzryVar3 = zzryVar;
        zzry zzryVar4 = zzryVar2;
        int i = zzryVar3.zzbtv - zzryVar4.zzbtv;
        return i != 0 ? i : (int) (zzryVar3.value - zzryVar4.value);
    }
}
