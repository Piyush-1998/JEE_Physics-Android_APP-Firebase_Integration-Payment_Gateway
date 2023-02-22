package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxd implements Parcelable.Creator<zzaxa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaxa[] newArray(int i) {
        return new zzaxa[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaxa createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzvj zzvjVar = null;
        zzvc zzvcVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzvjVar = (zzvj) SafeParcelReader.createParcelable(parcel, readHeader, zzvj.CREATOR);
            } else if (fieldId == 4) {
                zzvcVar = (zzvc) SafeParcelReader.createParcelable(parcel, readHeader, zzvc.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaxa(str, str2, zzvjVar, zzvcVar);
    }
}
