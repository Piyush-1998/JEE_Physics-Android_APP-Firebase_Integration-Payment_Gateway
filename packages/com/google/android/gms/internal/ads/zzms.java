package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzms implements Runnable {
    private final /* synthetic */ zzmn zzbeg;
    private final /* synthetic */ zzmt zzbei;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzms(zzmn zzmnVar, zzmt zzmtVar) {
        this.zzbeg = zzmnVar;
        this.zzbei = zzmtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zzbei.release();
        sparseArray = this.zzbeg.zzbdq;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzbeg.zzbdq;
            ((zznh) sparseArray2.valueAt(i)).disable();
        }
    }
}
