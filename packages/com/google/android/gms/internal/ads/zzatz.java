package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzatz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatz> CREATOR = new zzaty();
    public final String zzbuo;
    public final zzvc zzdpw;

    public zzatz(zzvc zzvcVar, String str) {
        this.zzdpw = zzvcVar;
        this.zzbuo = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdpw, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbuo, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
