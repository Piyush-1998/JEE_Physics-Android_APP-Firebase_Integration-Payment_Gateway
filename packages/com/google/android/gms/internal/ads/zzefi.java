package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzefi extends zzefp {
    private final int zzibg;
    private final int zzibh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefi(byte[] bArr, int i, int i2) {
        super(bArr);
        zzi(i, i + i2, bArr.length);
        this.zzibg = i;
        this.zzibh = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzefp, com.google.android.gms.internal.ads.zzeff
    public final byte zzfu(int i) {
        zzaa(i, size());
        return this.zzibo[this.zzibg + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefp, com.google.android.gms.internal.ads.zzeff
    public final byte zzfv(int i) {
        return this.zzibo[this.zzibg + i];
    }

    @Override // com.google.android.gms.internal.ads.zzefp, com.google.android.gms.internal.ads.zzeff
    public final int size() {
        return this.zzibh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzefp
    public final int zzbdq() {
        return this.zzibg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzefp, com.google.android.gms.internal.ads.zzeff
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzibo, zzbdq() + i, bArr, i2, i3);
    }
}
