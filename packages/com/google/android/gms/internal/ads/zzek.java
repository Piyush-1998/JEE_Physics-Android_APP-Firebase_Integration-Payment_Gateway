package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzek extends zzcu<Integer, Long> {
    public long zzyk;
    public long zzyl;

    public zzek() {
        this.zzyk = -1L;
        this.zzyl = -1L;
    }

    public zzek(String str) {
        this();
        zzan(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Long> zzbn() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zzyk));
        hashMap.put(1, Long.valueOf(this.zzyl));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zzyk = ((Long) zzao.get(0)).longValue();
            this.zzyl = ((Long) zzao.get(1)).longValue();
        }
    }
}
