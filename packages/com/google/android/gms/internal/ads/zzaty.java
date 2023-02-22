package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaty implements Parcelable.Creator<zzatz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzatz[] newArray(int i) {
        return new zzatz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzatz createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzvc zzvcVar = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                zzvcVar = (zzvc) SafeParcelReader.createParcelable(parcel, readHeader, zzvc.CREATOR);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzatz(zzvcVar, str);
    }
}
