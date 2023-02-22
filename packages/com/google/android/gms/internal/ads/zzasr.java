package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzasr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasr> CREATOR = new zzasq();
    String zzdti;

    public zzasr(String str) {
        this.zzdti = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdti, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
