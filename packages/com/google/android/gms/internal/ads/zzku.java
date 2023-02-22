package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzku extends zzkr {
    public final long zzawf;
    public final List<zzkt> zzawg;
    public final List<zzku> zzawh;

    public zzku(int i, long j) {
        super(i);
        this.zzawf = j;
        this.zzawg = new ArrayList();
        this.zzawh = new ArrayList();
    }

    public final void zza(zzkt zzktVar) {
        this.zzawg.add(zzktVar);
    }

    public final void zza(zzku zzkuVar) {
        this.zzawh.add(zzkuVar);
    }

    public final zzkt zzau(int i) {
        int size = this.zzawg.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzkt zzktVar = this.zzawg.get(i2);
            if (zzktVar.type == i) {
                return zzktVar;
            }
        }
        return null;
    }

    public final zzku zzav(int i) {
        int size = this.zzawh.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzku zzkuVar = this.zzawh.get(i2);
            if (zzkuVar.type == i) {
                return zzkuVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final String toString() {
        String zzas = zzas(this.type);
        String arrays = Arrays.toString(this.zzawg.toArray());
        String arrays2 = Arrays.toString(this.zzawh.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(zzas).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzas);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
