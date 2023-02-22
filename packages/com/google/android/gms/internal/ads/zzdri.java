package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdri extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdri> CREATOR = new zzdrh();
    private final String packageName;
    private final int versionCode;
    private final String zzhkh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdri(int i, String str, String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzhkh = str2;
    }

    public zzdri(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzhkh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
