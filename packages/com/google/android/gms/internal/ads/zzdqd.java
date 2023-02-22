package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdqd extends zzdqc {
    private final String zzhix;
    private final boolean zzxj;
    private final boolean zzzf;

    private zzdqd(String str, boolean z, boolean z2) {
        this.zzhix = str;
        this.zzxj = z;
        this.zzzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzdqc
    public final String zzavb() {
        return this.zzhix;
    }

    @Override // com.google.android.gms.internal.ads.zzdqc
    public final boolean zzavc() {
        return this.zzxj;
    }

    @Override // com.google.android.gms.internal.ads.zzdqc
    public final boolean zzcm() {
        return this.zzzf;
    }

    public final String toString() {
        String str = this.zzhix;
        boolean z = this.zzxj;
        boolean z2 = this.zzzf;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdqc) {
            zzdqc zzdqcVar = (zzdqc) obj;
            if (this.zzhix.equals(zzdqcVar.zzavb()) && this.zzxj == zzdqcVar.zzavc() && this.zzzf == zzdqcVar.zzcm()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzhix.hashCode() ^ 1000003) * 1000003) ^ (this.zzxj ? 1231 : 1237)) * 1000003) ^ (this.zzzf ? 1231 : 1237);
    }
}
