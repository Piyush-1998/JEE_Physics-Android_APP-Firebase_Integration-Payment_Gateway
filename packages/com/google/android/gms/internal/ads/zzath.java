package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzath extends zzati {
    private final String type;
    private final int zzdva;

    public zzath(String str, int i) {
        this.type = str;
        this.zzdva = i;
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final int getAmount() {
        return this.zzdva;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzath)) {
            zzath zzathVar = (zzath) obj;
            if (Objects.equal(this.type, zzathVar.type) && Objects.equal(Integer.valueOf(this.zzdva), Integer.valueOf(zzathVar.zzdva))) {
                return true;
            }
        }
        return false;
    }
}
