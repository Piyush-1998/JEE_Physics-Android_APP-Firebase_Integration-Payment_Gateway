package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzavc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavc> CREATOR = new zzavf();
    public final String zzdve;
    public final String zzdvf;

    public zzavc(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public zzavc(String str, String str2) {
        this.zzdve = str;
        this.zzdvf = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdve, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzdvf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
