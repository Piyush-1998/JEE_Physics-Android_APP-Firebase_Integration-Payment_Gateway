package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaip extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaip> CREATOR = new zzais();
    public final Bundle extras;
    public final String zzdfi;

    public zzaip(String str, Bundle bundle) {
        this.zzdfi = str;
        this.extras = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdfi, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.extras, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
