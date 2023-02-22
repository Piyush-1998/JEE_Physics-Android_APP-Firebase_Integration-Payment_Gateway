package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzry {
    final long value;
    final int zzbtv;
    final String zzbuf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzry(long j, String str, int i) {
        this.value = j;
        this.zzbuf = str;
        this.zzbtv = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzry)) {
            zzry zzryVar = (zzry) obj;
            if (zzryVar.value == this.value && zzryVar.zzbtv == this.zzbtv) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
