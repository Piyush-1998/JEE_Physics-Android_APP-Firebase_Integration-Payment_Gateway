package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzuu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuu> CREATOR = new zzux();
    public final String zzcgo;
    public final String zzcgp;

    public zzuu(String str, String str2) {
        this.zzcgo = str;
        this.zzcgp = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcgo, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzcgp, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
