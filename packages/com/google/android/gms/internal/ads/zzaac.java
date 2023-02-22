package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaac> CREATOR = new zzaab();
    public final boolean zzadr;
    public final boolean zzads;
    public final boolean zzadt;

    public zzaac(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzaac(boolean z, boolean z2, boolean z3) {
        this.zzadr = z;
        this.zzads = z2;
        this.zzadt = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzadr);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzads);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzadt);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
