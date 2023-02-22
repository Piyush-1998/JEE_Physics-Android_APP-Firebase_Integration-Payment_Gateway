package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzair extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzair> CREATOR = new zzaiu();
    public final int versionCode;
    public final int zzbnk;
    public final int zzdfk;
    public final String zzdfl;

    public zzair(zzajd zzajdVar) {
        this(2, 1, zzajdVar.zzsz(), zzajdVar.getMediaAspectRatio());
    }

    public zzair(int i, int i2, String str, int i3) {
        this.versionCode = i;
        this.zzdfk = i2;
        this.zzdfl = str;
        this.zzbnk = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzdfk);
        SafeParcelWriter.writeString(parcel, 2, this.zzdfl, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbnk);
        SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
