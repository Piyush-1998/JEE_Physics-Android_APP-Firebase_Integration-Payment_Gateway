package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzkz implements zzky {
    private final zzpk zzawe;
    private final int zzawy;
    private final int zzawz;
    private int zzaxa;
    private int zzaxb;

    public zzkz(zzkt zzktVar) {
        zzpk zzpkVar = zzktVar.zzawe;
        this.zzawe = zzpkVar;
        zzpkVar.zzbo(12);
        this.zzawz = this.zzawe.zzjd() & 255;
        this.zzawy = this.zzawe.zzjd();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final boolean zzgy() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgw() {
        return this.zzawy;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgx() {
        int i = this.zzawz;
        if (i == 8) {
            return this.zzawe.readUnsignedByte();
        }
        if (i == 16) {
            return this.zzawe.readUnsignedShort();
        }
        int i2 = this.zzaxa;
        this.zzaxa = i2 + 1;
        if (i2 % 2 == 0) {
            int readUnsignedByte = this.zzawe.readUnsignedByte();
            this.zzaxb = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
        return this.zzaxb & 15;
    }
}
