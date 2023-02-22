package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvc> CREATOR = new zzve();
    public final Bundle extras;
    public final int versionCode;
    public final int zzadj;
    public final int zzadk;
    public final String zzadl;
    public final boolean zzbnu;
    @Deprecated
    public final long zzcgv;
    @Deprecated
    public final int zzcgw;
    public final List<String> zzcgx;
    public final boolean zzcgy;
    public final String zzcgz;
    public final zzzy zzcha;
    public final String zzchb;
    public final Bundle zzchc;
    public final Bundle zzchd;
    public final List<String> zzche;
    public final String zzchf;
    public final String zzchg;
    @Deprecated
    public final boolean zzchh;
    public final zzuu zzchi;
    public final List<String> zzchj;
    public final Location zznb;

    public zzvc(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzzy zzzyVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzuu zzuuVar, int i4, String str5, List<String> list3) {
        this.versionCode = i;
        this.zzcgv = j;
        this.extras = bundle == null ? new Bundle() : bundle;
        this.zzcgw = i2;
        this.zzcgx = list;
        this.zzcgy = z;
        this.zzadj = i3;
        this.zzbnu = z2;
        this.zzcgz = str;
        this.zzcha = zzzyVar;
        this.zznb = location;
        this.zzchb = str2;
        this.zzchc = bundle2 == null ? new Bundle() : bundle2;
        this.zzchd = bundle3;
        this.zzche = list2;
        this.zzchf = str3;
        this.zzchg = str4;
        this.zzchh = z3;
        this.zzchi = zzuuVar;
        this.zzadk = i4;
        this.zzadl = str5;
        this.zzchj = list3 == null ? new ArrayList<>() : list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, this.zzcgv);
        SafeParcelWriter.writeBundle(parcel, 3, this.extras, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzcgw);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzcgx, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzcgy);
        SafeParcelWriter.writeInt(parcel, 7, this.zzadj);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbnu);
        SafeParcelWriter.writeString(parcel, 9, this.zzcgz, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzcha, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zznb, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzchb, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzchc, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzchd, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzche, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzchf, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzchg, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzchh);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzchi, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzadk);
        SafeParcelWriter.writeString(parcel, 21, this.zzadl, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzchj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzvc) {
            zzvc zzvcVar = (zzvc) obj;
            return this.versionCode == zzvcVar.versionCode && this.zzcgv == zzvcVar.zzcgv && Objects.equal(this.extras, zzvcVar.extras) && this.zzcgw == zzvcVar.zzcgw && Objects.equal(this.zzcgx, zzvcVar.zzcgx) && this.zzcgy == zzvcVar.zzcgy && this.zzadj == zzvcVar.zzadj && this.zzbnu == zzvcVar.zzbnu && Objects.equal(this.zzcgz, zzvcVar.zzcgz) && Objects.equal(this.zzcha, zzvcVar.zzcha) && Objects.equal(this.zznb, zzvcVar.zznb) && Objects.equal(this.zzchb, zzvcVar.zzchb) && Objects.equal(this.zzchc, zzvcVar.zzchc) && Objects.equal(this.zzchd, zzvcVar.zzchd) && Objects.equal(this.zzche, zzvcVar.zzche) && Objects.equal(this.zzchf, zzvcVar.zzchf) && Objects.equal(this.zzchg, zzvcVar.zzchg) && this.zzchh == zzvcVar.zzchh && this.zzadk == zzvcVar.zzadk && Objects.equal(this.zzadl, zzvcVar.zzadl) && Objects.equal(this.zzchj, zzvcVar.zzchj);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.versionCode), Long.valueOf(this.zzcgv), this.extras, Integer.valueOf(this.zzcgw), this.zzcgx, Boolean.valueOf(this.zzcgy), Integer.valueOf(this.zzadj), Boolean.valueOf(this.zzbnu), this.zzcgz, this.zzcha, this.zznb, this.zzchb, this.zzchc, this.zzchd, this.zzche, this.zzchf, this.zzchg, Boolean.valueOf(this.zzchh), Integer.valueOf(this.zzadk), this.zzadl, this.zzchj);
    }
}
