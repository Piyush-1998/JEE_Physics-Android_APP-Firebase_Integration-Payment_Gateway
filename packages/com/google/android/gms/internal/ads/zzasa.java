package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzasa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasa> CREATOR = new zzasd();
    public final boolean zzdsw;
    public final List<String> zzdsx;

    public zzasa() {
        this(false, Collections.emptyList());
    }

    public zzasa(boolean z, List<String> list) {
        this.zzdsw = z;
        this.zzdsx = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdsw);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzdsx, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
