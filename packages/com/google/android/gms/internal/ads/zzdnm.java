package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdnm implements zzdnk {
    private final String zzcn;

    public zzdnm(String str) {
        this.zzcn = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdnk
    public final boolean equals(Object obj) {
        if (obj instanceof zzdnm) {
            return this.zzcn.equals(((zzdnm) obj).zzcn);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdnk
    public final int hashCode() {
        return this.zzcn.hashCode();
    }

    public final String toString() {
        return this.zzcn;
    }
}
