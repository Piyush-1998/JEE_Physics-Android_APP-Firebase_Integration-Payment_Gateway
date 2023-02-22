package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvi();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzacx;
    public final boolean zzbrc;
    public final boolean zzchn;
    public final zzvj[] zzcho;
    public final boolean zzchp;
    public boolean zzchq;
    public boolean zzchr;
    private boolean zzchs;
    public boolean zzcht;
    public boolean zzchu;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (zzd(displayMetrics) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzvj zzpi() {
        return new zzvj("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
    }

    public static zzvj zzpj() {
        return new zzvj("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static zzvj zzpk() {
        return new zzvj("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
    }

    public zzvj() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static zzvj zzpl() {
        return new zzvj("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
    }

    public zzvj(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzvj(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvj.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvj(String str, int i, int i2, boolean z, int i3, int i4, zzvj[] zzvjVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.zzacx = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzchn = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzcho = zzvjVarArr;
        this.zzbrc = z2;
        this.zzchp = z3;
        this.zzchq = z4;
        this.zzchr = z5;
        this.zzchs = z6;
        this.zzcht = z7;
        this.zzchu = z8;
    }

    public final AdSize zzpm() {
        return com.google.android.gms.ads.zzb.zza(this.width, this.height, this.zzacx);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzacx, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzchn);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzcho, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbrc);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzchp);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzchq);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzchr);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzchs);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzcht);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzchu);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
