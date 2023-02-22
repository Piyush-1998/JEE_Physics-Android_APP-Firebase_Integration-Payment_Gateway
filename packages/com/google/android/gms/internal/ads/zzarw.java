package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzarw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarw> CREATOR = new zzarz();
    private final ApplicationInfo applicationInfo;
    private final int versionCode;
    private final zzbbg zzbpa;
    private final zzvj zzbpb;
    private final float zzbrw;
    private final String zzbuo;
    private final String zzciq;
    private final boolean zzdix;
    private final zzadm zzdla;
    private final List<String> zzdlb;
    private final int zzdng;
    private final int zzdnh;
    private final Bundle zzdpv;
    private final zzvc zzdpw;
    private final PackageInfo zzdpx;
    private final String zzdpy;
    private final String zzdpz;
    private final Bundle zzdqa;
    private final int zzdqb;
    private final Bundle zzdqc;
    private final boolean zzdqd;
    private final String zzdqe;
    private final long zzdqf;
    private final String zzdqg;
    private final List<String> zzdqh;
    private final String zzdqi;
    private final List<String> zzdqj;
    private final long zzdqk;
    private final String zzdql;
    private final float zzdqm;
    private final int zzdqn;
    private final int zzdqo;
    private final boolean zzdqp;
    private final boolean zzdqq;
    private final String zzdqr;
    private final boolean zzdqs;
    private final String zzdqt;
    private final int zzdqu;
    private final Bundle zzdqv;
    private final String zzdqw;
    private final zzym zzdqx;
    private final boolean zzdqy;
    private final Bundle zzdqz;
    private final String zzdra;
    private final String zzdrb;
    private final String zzdrc;
    private final boolean zzdrd;
    private final List<Integer> zzdre;
    private final String zzdrf;
    private final List<String> zzdrg;
    private final int zzdrh;
    private final boolean zzdri;
    private final boolean zzdrj;
    private final boolean zzdrk;
    private final ArrayList<String> zzdrl;
    private final String zzdrm;
    private final zzair zzdrn;
    private final String zzdro;
    private final Bundle zzdrp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarw(int i, Bundle bundle, zzvc zzvcVar, zzvj zzvjVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbbg zzbbgVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzadm zzadmVar, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzym zzymVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzair zzairVar, String str17, Bundle bundle6) {
        List<String> unmodifiableList;
        List<String> unmodifiableList2;
        this.versionCode = i;
        this.zzdpv = bundle;
        this.zzdpw = zzvcVar;
        this.zzbpb = zzvjVar;
        this.zzbuo = str;
        this.applicationInfo = applicationInfo;
        this.zzdpx = packageInfo;
        this.zzdpy = str2;
        this.zzdpz = str3;
        this.zzciq = str4;
        this.zzbpa = zzbbgVar;
        this.zzdqa = bundle2;
        this.zzdqb = i2;
        this.zzdlb = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.zzdqj = unmodifiableList;
        this.zzdqc = bundle3;
        this.zzdqd = z;
        this.zzdng = i3;
        this.zzdnh = i4;
        this.zzbrw = f;
        this.zzdqe = str5;
        this.zzdqf = j;
        this.zzdqg = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.zzdqh = unmodifiableList2;
        this.zzdqi = str7;
        this.zzdla = zzadmVar;
        this.zzdqk = j2;
        this.zzdql = str8;
        this.zzdqm = f2;
        this.zzdqs = z2;
        this.zzdqn = i5;
        this.zzdqo = i6;
        this.zzdqp = z3;
        this.zzdqq = z4;
        this.zzdqr = str9;
        this.zzdqt = str10;
        this.zzdix = z5;
        this.zzdqu = i7;
        this.zzdqv = bundle4;
        this.zzdqw = str11;
        this.zzdqx = zzymVar;
        this.zzdqy = z6;
        this.zzdqz = bundle5;
        this.zzdra = str12;
        this.zzdrb = str13;
        this.zzdrc = str14;
        this.zzdrd = z7;
        this.zzdre = list4;
        this.zzdrf = str15;
        this.zzdrg = list5;
        this.zzdrh = i8;
        this.zzdri = z8;
        this.zzdrj = z9;
        this.zzdrk = z10;
        this.zzdrl = arrayList;
        this.zzdrm = str16;
        this.zzdrn = zzairVar;
        this.zzdro = str17;
        this.zzdrp = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdpv, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdpw, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbpb, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbuo, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.applicationInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdpx, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdpy, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdpz, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzciq, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzbpa, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzdqa, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdqb);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzdlb, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzdqc, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzdqd);
        SafeParcelWriter.writeInt(parcel, 18, this.zzdng);
        SafeParcelWriter.writeInt(parcel, 19, this.zzdnh);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzbrw);
        SafeParcelWriter.writeString(parcel, 21, this.zzdqe, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzdqf);
        SafeParcelWriter.writeString(parcel, 26, this.zzdqg, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzdqh, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzdqi, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzdla, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzdqj, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzdqk);
        SafeParcelWriter.writeString(parcel, 33, this.zzdql, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzdqm);
        SafeParcelWriter.writeInt(parcel, 35, this.zzdqn);
        SafeParcelWriter.writeInt(parcel, 36, this.zzdqo);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzdqp);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdqq);
        SafeParcelWriter.writeString(parcel, 39, this.zzdqr, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzdqs);
        SafeParcelWriter.writeString(parcel, 41, this.zzdqt, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdix);
        SafeParcelWriter.writeInt(parcel, 43, this.zzdqu);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzdqv, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdqw, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzdqx, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdqy);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdqz, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzdra, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzdrb, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzdrc, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzdrd);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzdre, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzdrf, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzdrg, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzdrh);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdri);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzdrj);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzdrk);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzdrl, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzdrm, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzdrn, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzdro, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzdrp, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
