package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdrd> CREATOR = new zzdrg();
    private final int versionCode;
    private final byte[] zzhkf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrd(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzhkf = bArr;
    }

    public zzdrd(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzhkf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
