package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();
    public final boolean zzbor;
    public final boolean zzbos;
    private final String zzbot;
    public final boolean zzbou;
    public final float zzbov;
    public final int zzbow;
    public final boolean zzbox;
    public final boolean zzboy;
    public final boolean zzboz;

    public zzi(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(false, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzbor = z;
        this.zzbos = z2;
        this.zzbot = str;
        this.zzbou = z3;
        this.zzbov = f;
        this.zzbow = i;
        this.zzbox = z4;
        this.zzboy = z5;
        this.zzboz = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbor);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbos);
        SafeParcelWriter.writeString(parcel, 4, this.zzbot, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbou);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzbov);
        SafeParcelWriter.writeInt(parcel, 7, this.zzbow);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbox);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzboy);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzboz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
