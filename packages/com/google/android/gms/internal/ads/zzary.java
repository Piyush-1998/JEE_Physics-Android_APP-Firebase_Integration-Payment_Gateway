package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzary extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzary> CREATOR = new zzasb();
    private final int errorCode;
    private final int orientation;
    private final int versionCode;
    private final zzasa zzbod;
    private final boolean zzboy;
    private final boolean zzboz;
    private final boolean zzbrc;
    private final boolean zzchp;
    private final boolean zzchq;
    private final List<String> zzdis;
    private final List<String> zzdit;
    private final List<String> zzdiu;
    private final List<String> zzdiw;
    private final boolean zzdix;
    private final long zzdiz;
    private final String zzdos;
    private final boolean zzdqd;
    private final boolean zzdqq;
    private String zzdqr;
    private final boolean zzdrd;
    private String zzdrq;
    private final long zzdrr;
    private final boolean zzdrs;
    private final long zzdrt;
    private final List<String> zzdru;
    private final String zzdrv;
    private final long zzdrw;
    private final String zzdrx;
    private final boolean zzdry;
    private final String zzdrz;
    private final String zzdsa;
    private final boolean zzdsb;
    private final boolean zzdsc;
    private final boolean zzdsd;
    private zzask zzdse;
    private String zzdsf;
    private final String zzdsg;
    private final zzaue zzdsh;
    private final List<String> zzdsi;
    private final List<String> zzdsj;
    private final boolean zzdsk;
    private final String zzdsl;
    private final zzavt zzdsm;
    private final String zzdsn;
    private final boolean zzdso;
    private Bundle zzdsp;
    private final int zzdsq;
    private final boolean zzdsr;
    private final String zzdss;
    private String zzdst;
    private boolean zzdsu;
    private boolean zzdsv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzary(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzask zzaskVar, String str7, String str8, boolean z8, boolean z9, zzaue zzaueVar, List<String> list4, List<String> list5, boolean z10, zzasa zzasaVar, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzavt zzavtVar, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12, String str13, boolean z18, boolean z19) {
        zzasr zzasrVar;
        this.versionCode = i;
        this.zzdos = str;
        this.zzdrq = str2;
        this.zzdis = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzdit = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzdrr = j;
        this.zzdrs = z;
        this.zzdrt = j2;
        this.zzdru = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.zzdiz = j3;
        this.orientation = i3;
        this.zzdrv = str3;
        this.zzdrw = j4;
        this.zzdrx = str4;
        this.zzdry = z2;
        this.zzdrz = str5;
        this.zzdsa = str6;
        this.zzdsb = z3;
        this.zzbrc = z4;
        this.zzdqd = z5;
        this.zzdsc = z6;
        this.zzdso = z13;
        this.zzdsd = z7;
        this.zzdse = zzaskVar;
        this.zzdsf = str7;
        this.zzdsg = str8;
        if (this.zzdrq == null && zzaskVar != null && (zzasrVar = (zzasr) zzaskVar.zza(zzasr.CREATOR)) != null && !TextUtils.isEmpty(zzasrVar.zzdti)) {
            this.zzdrq = zzasrVar.zzdti;
        }
        this.zzchp = z8;
        this.zzchq = z9;
        this.zzdsh = zzaueVar;
        this.zzdsi = list4;
        this.zzdsj = list5;
        this.zzdsk = z10;
        this.zzbod = zzasaVar;
        this.zzdqq = z11;
        this.zzdqr = str9;
        this.zzdiw = list6;
        this.zzdix = z12;
        this.zzdsl = str10;
        this.zzdsm = zzavtVar;
        this.zzdsn = str11;
        this.zzdrd = z14;
        this.zzdsp = bundle;
        this.zzboy = z15;
        this.zzdsq = i4;
        this.zzdsr = z16;
        this.zzdiu = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.zzboz = z17;
        this.zzdss = str12;
        this.zzdst = str13;
        this.zzdsu = z18;
        this.zzdsv = z19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzdos, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdrq, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzdis, false);
        SafeParcelWriter.writeInt(parcel, 5, this.errorCode);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdit, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzdrr);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdrs);
        SafeParcelWriter.writeLong(parcel, 9, this.zzdrt);
        SafeParcelWriter.writeStringList(parcel, 10, this.zzdru, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzdiz);
        SafeParcelWriter.writeInt(parcel, 12, this.orientation);
        SafeParcelWriter.writeString(parcel, 13, this.zzdrv, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzdrw);
        SafeParcelWriter.writeString(parcel, 15, this.zzdrx, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzdry);
        SafeParcelWriter.writeString(parcel, 19, this.zzdrz, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzdsa, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzdsb);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzbrc);
        SafeParcelWriter.writeBoolean(parcel, 24, this.zzdqd);
        SafeParcelWriter.writeBoolean(parcel, 25, this.zzdsc);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzdsd);
        SafeParcelWriter.writeParcelable(parcel, 28, this.zzdse, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.zzdsf, false);
        SafeParcelWriter.writeString(parcel, 30, this.zzdsg, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzchp);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzchq);
        SafeParcelWriter.writeParcelable(parcel, 33, this.zzdsh, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.zzdsi, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.zzdsj, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzdsk);
        SafeParcelWriter.writeParcelable(parcel, 37, this.zzbod, i, false);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdqq);
        SafeParcelWriter.writeString(parcel, 39, this.zzdqr, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.zzdiw, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdix);
        SafeParcelWriter.writeString(parcel, 43, this.zzdsl, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.zzdsm, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdsn, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.zzdso);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdrd);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdsp, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.zzboy);
        SafeParcelWriter.writeInt(parcel, 50, this.zzdsq);
        SafeParcelWriter.writeBoolean(parcel, 51, this.zzdsr);
        SafeParcelWriter.writeStringList(parcel, 52, this.zzdiu, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.zzboz);
        SafeParcelWriter.writeString(parcel, 54, this.zzdss, false);
        SafeParcelWriter.writeString(parcel, 55, this.zzdst, false);
        SafeParcelWriter.writeBoolean(parcel, 56, this.zzdsu);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdsv);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
