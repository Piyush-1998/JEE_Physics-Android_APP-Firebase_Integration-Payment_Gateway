package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbj implements Parcelable.Creator<zzbbg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbbg[] newArray(int i) {
        return new zzbbg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbbg createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 4) {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 5) {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 6) {
                z2 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbbg(str, i, i2, z, z2);
    }
}
