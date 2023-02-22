package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsv> CREATOR = new zzsy();
    private ParcelFileDescriptor zzbuy;

    public zzsv() {
        this(null);
    }

    public zzsv(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbuy = parcelFileDescriptor;
    }

    public final synchronized boolean zzmu() {
        return this.zzbuy != null;
    }

    public final synchronized InputStream zzmv() {
        if (this.zzbuy == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zzbuy);
        this.zzbuy = null;
        return autoCloseInputStream;
    }

    private final synchronized ParcelFileDescriptor zzmw() {
        return this.zzbuy;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmw(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
