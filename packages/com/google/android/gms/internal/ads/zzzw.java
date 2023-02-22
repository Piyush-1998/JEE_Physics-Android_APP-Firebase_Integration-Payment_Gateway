package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzw> CREATOR = new zzzv();
    private final int zzadj;
    private final int zzadk;

    public zzzw(int i, int i2) {
        this.zzadj = i;
        this.zzadk = i2;
    }

    public zzzw(RequestConfiguration requestConfiguration) {
        this.zzadj = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzadk = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzadj);
        SafeParcelWriter.writeInt(parcel, 2, this.zzadk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
