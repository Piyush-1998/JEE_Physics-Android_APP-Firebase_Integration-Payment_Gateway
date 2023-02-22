package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcy extends zzcu<Integer, Object> {
    public String zznw;
    public long zznx;
    public String zzny;
    public String zznz;
    public String zzoa;

    public zzcy(String str) {
        this();
        zzan(str);
    }

    public zzcy() {
        this.zznw = "E";
        this.zznx = -1L;
        this.zzny = "E";
        this.zznz = "E";
        this.zzoa = "E";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzan(String str) {
        HashMap zzao = zzao(str);
        if (zzao != null) {
            this.zznw = zzao.get(0) == null ? "E" : (String) zzao.get(0);
            this.zznx = zzao.get(1) == null ? -1L : ((Long) zzao.get(1)).longValue();
            this.zzny = zzao.get(2) == null ? "E" : (String) zzao.get(2);
            this.zznz = zzao.get(3) == null ? "E" : (String) zzao.get(3);
            this.zzoa = zzao.get(4) != null ? (String) zzao.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Object> zzbn() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zznw);
        hashMap.put(4, this.zzoa);
        hashMap.put(3, this.zznz);
        hashMap.put(2, this.zzny);
        hashMap.put(1, Long.valueOf(this.zznx));
        return hashMap;
    }
}
