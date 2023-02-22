package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdrs> CREATOR = new zzdrr();
    private final int versionCode;
    private final String zzhjd;
    private final String zzhje;
    private final int zzhjf;
    private final int zzhku;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrs(int i, int i2, int i3, String str, String str2) {
        this.versionCode = i;
        this.zzhjf = i2;
        this.zzhjd = str;
        this.zzhje = str2;
        this.zzhku = i3;
    }

    public zzdrs(int i, zzgo zzgoVar, String str, String str2) {
        this(1, i, zzgoVar.zzv(), str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.zzhjf);
        SafeParcelWriter.writeString(parcel, 3, this.zzhjd, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzhje, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzhku);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
