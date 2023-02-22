package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzcf;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdrk> CREATOR = new zzdrj();
    private final int versionCode;
    private zzcf.zza zzhki = null;
    private byte[] zzhkj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrk(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzhkj = bArr;
        zzavv();
    }

    public final zzcf.zza zzavu() {
        if (!(this.zzhki != null)) {
            try {
                this.zzhki = zzcf.zza.zza(this.zzhkj, zzegc.zzbey());
                this.zzhkj = null;
            } catch (zzegz e) {
                throw new IllegalStateException(e);
            }
        }
        zzavv();
        return this.zzhki;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        byte[] bArr = this.zzhkj;
        if (bArr == null) {
            bArr = this.zzhki.toByteArray();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void zzavv() {
        if (this.zzhki != null || this.zzhkj == null) {
            if (this.zzhki == null || this.zzhkj != null) {
                if (this.zzhki != null && this.zzhkj != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (this.zzhki == null && this.zzhkj == null) {
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Impossible");
            }
        }
    }
}
