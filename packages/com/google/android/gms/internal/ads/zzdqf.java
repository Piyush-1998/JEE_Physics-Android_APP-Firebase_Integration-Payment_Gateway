package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdqf extends zzdqb {
    private String zzhix;
    private Boolean zzhiy;
    private Boolean zzhiz;

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final zzdqb zzhb(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zzhix = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final zzdqb zzbq(boolean z) {
        this.zzhiy = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final zzdqb zzbr(boolean z) {
        this.zzhiz = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final zzdqc zzava() {
        String concat = this.zzhix == null ? "".concat(" clientVersion") : "";
        if (this.zzhiy == null) {
            concat = String.valueOf(concat).concat(" shouldGetAdvertisingId");
        }
        if (this.zzhiz == null) {
            concat = String.valueOf(concat).concat(" isGooglePlayServicesAvailable");
        }
        if (!concat.isEmpty()) {
            String valueOf = String.valueOf(concat);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new zzdqd(this.zzhix, this.zzhiy.booleanValue(), this.zzhiz.booleanValue());
    }
}
