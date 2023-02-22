package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaif extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaif> CREATOR = new zzaii();
    public final String description;
    public final String zzdfe;
    public final boolean zzdff;
    public final int zzdfg;

    public zzaif(String str, boolean z, int i, String str2) {
        this.zzdfe = str;
        this.zzdff = z;
        this.zzdfg = i;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdfe, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdff);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdfg);
        SafeParcelWriter.writeString(parcel, 4, this.description, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
