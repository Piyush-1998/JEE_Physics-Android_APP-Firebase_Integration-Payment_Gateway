package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeid<T> implements zzeiv<T> {
    private final int[] zziia;
    private final Object[] zziib;
    private final int zziic;
    private final int zziid;
    private final zzehz zziie;
    private final boolean zziif;
    private final boolean zziig;
    private final boolean zziih;
    private final boolean zziii;
    private final int[] zziij;
    private final int zziik;
    private final int zziil;
    private final zzeih zziim;
    private final zzehj zziin;
    private final zzejn<?, ?> zziio;
    private final zzege<?> zziip;
    private final zzehw zziiq;
    private static final int[] zzihz = new int[0];
    private static final Unsafe zzhop = zzejt.zzbie();

    private zzeid(int[] iArr, Object[] objArr, int i, int i2, zzehz zzehzVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzeih zzeihVar, zzehj zzehjVar, zzejn<?, ?> zzejnVar, zzege<?> zzegeVar, zzehw zzehwVar) {
        this.zziia = iArr;
        this.zziib = objArr;
        this.zziic = i;
        this.zziid = i2;
        this.zziig = zzehzVar instanceof zzegp;
        this.zziih = z;
        this.zziif = zzegeVar != null && zzegeVar.zzj(zzehzVar);
        this.zziii = false;
        this.zziij = iArr2;
        this.zziik = i3;
        this.zziil = i4;
        this.zziim = zzeihVar;
        this.zziin = zzehjVar;
        this.zziio = zzejnVar;
        this.zziip = zzegeVar;
        this.zziie = zzehzVar;
        this.zziiq = zzehwVar;
    }

    private static boolean zzhk(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.ads.zzeid<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.ads.zzehx r34, com.google.android.gms.internal.ads.zzeih r35, com.google.android.gms.internal.ads.zzehj r36, com.google.android.gms.internal.ads.zzejn<?, ?> r37, com.google.android.gms.internal.ads.zzege<?> r38, com.google.android.gms.internal.ads.zzehw r39) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Class, com.google.android.gms.internal.ads.zzehx, com.google.android.gms.internal.ads.zzeih, com.google.android.gms.internal.ads.zzehj, com.google.android.gms.internal.ads.zzejn, com.google.android.gms.internal.ads.zzege, com.google.android.gms.internal.ads.zzehw):com.google.android.gms.internal.ads.zzeid");
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final T newInstance() {
        return (T) this.zziim.newInstance(this.zziie);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzejt.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzejt.zzo(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.ads.zzeix.zzh(com.google.android.gms.internal.ads.zzejt.zzp(r10, r6), com.google.android.gms.internal.ads.zzejt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.ads.zzeix.zzh(com.google.android.gms.internal.ads.zzejt.zzp(r10, r6), com.google.android.gms.internal.ads.zzejt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.zzeix.zzh(com.google.android.gms.internal.ads.zzejt.zzp(r10, r6), com.google.android.gms.internal.ads.zzejt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.ads.zzeix.zzh(com.google.android.gms.internal.ads.zzejt.zzp(r10, r6), com.google.android.gms.internal.ads.zzejt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.ads.zzeix.zzh(com.google.android.gms.internal.ads.zzejt.zzp(r10, r6), com.google.android.gms.internal.ads.zzejt.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzm(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzm(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzk(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.ads.zzejt.zzl(r10, r6) == com.google.android.gms.internal.ads.zzejt.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzejt.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzejt.zzn(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.ads.zzeiv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final int hashCode(T t) {
        int i;
        int zzfr;
        int length = this.zziia.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzhi = zzhi(i3);
            int i4 = this.zziia[i3];
            long j = 1048575 & zzhi;
            int i5 = 37;
            switch ((zzhi & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzfr = zzegr.zzfr(Double.doubleToLongBits(zzejt.zzo(t, j)));
                    i2 = i + zzfr;
                    break;
                case 1:
                    i = i2 * 53;
                    zzfr = Float.floatToIntBits(zzejt.zzn(t, j));
                    i2 = i + zzfr;
                    break;
                case 2:
                    i = i2 * 53;
                    zzfr = zzegr.zzfr(zzejt.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 3:
                    i = i2 * 53;
                    zzfr = zzegr.zzfr(zzejt.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 4:
                    i = i2 * 53;
                    zzfr = zzejt.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 5:
                    i = i2 * 53;
                    zzfr = zzegr.zzfr(zzejt.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 6:
                    i = i2 * 53;
                    zzfr = zzejt.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 7:
                    i = i2 * 53;
                    zzfr = zzegr.zzbu(zzejt.zzm(t, j));
                    i2 = i + zzfr;
                    break;
                case 8:
                    i = i2 * 53;
                    zzfr = ((String) zzejt.zzp(t, j)).hashCode();
                    i2 = i + zzfr;
                    break;
                case 9:
                    Object zzp = zzejt.zzp(t, j);
                    if (zzp != null) {
                        i5 = zzp.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzfr = zzejt.zzp(t, j).hashCode();
                    i2 = i + zzfr;
                    break;
                case 11:
                    i = i2 * 53;
                    zzfr = zzejt.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 12:
                    i = i2 * 53;
                    zzfr = zzejt.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 13:
                    i = i2 * 53;
                    zzfr = zzejt.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 14:
                    i = i2 * 53;
                    zzfr = zzegr.zzfr(zzejt.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 15:
                    i = i2 * 53;
                    zzfr = zzejt.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 16:
                    i = i2 * 53;
                    zzfr = zzegr.zzfr(zzejt.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 17:
                    Object zzp2 = zzejt.zzp(t, j);
                    if (zzp2 != null) {
                        i5 = zzp2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzfr = zzejt.zzp(t, j).hashCode();
                    i2 = i + zzfr;
                    break;
                case 50:
                    i = i2 * 53;
                    zzfr = zzejt.zzp(t, j).hashCode();
                    i2 = i + zzfr;
                    break;
                case 51:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzfr(Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = Float.floatToIntBits(zzg(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzbu(zzj(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = ((String) zzejt.zzp(t, j)).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzejt.zzp(t, j).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzejt.zzp(t, j).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzegr.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzeid<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzejt.zzp(t, j).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zziio.zzax(t).hashCode();
        return this.zziif ? (hashCode * 53) + this.zziip.zzah(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zzg(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zziia.length; i += 3) {
            int zzhi = zzhi(i);
            long j = 1048575 & zzhi;
            int i2 = this.zziia[i];
            switch ((zzhi & 267386880) >>> 20) {
                case 0:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza(t, j, zzejt.zzo(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza((Object) t, j, zzejt.zzn(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zzb(t, j, zzejt.zzk(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zzb(t, j, zzejt.zzk(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza(t, j, zzejt.zzm(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza(t, j, zzejt.zzp(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza(t, j, zzejt.zzp(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zzb(t, j, zzejt.zzk(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zzb(t, j, zzejt.zzk(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zzb(t, j, zzejt.zzk(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zzb(t, j, zzejt.zzk(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zze((zzeid<T>) t2, i)) {
                        zzejt.zza((Object) t, j, zzejt.zzl(t2, j));
                        zzf((zzeid<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zziin.zza(t, t2, j);
                    break;
                case 50:
                    zzeix.zza(this.zziiq, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzeid<T>) t2, i2, i)) {
                        zzejt.zza(t, j, zzejt.zzp(t2, j));
                        zzb((zzeid<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzeid<T>) t2, i2, i)) {
                        zzejt.zza(t, j, zzejt.zzp(t2, j));
                        zzb((zzeid<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzeix.zza(this.zziio, t, t2);
        if (this.zziif) {
            zzeix.zza(this.zziip, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzhi = zzhi(i) & 1048575;
        if (zze((zzeid<T>) t2, i)) {
            Object zzp = zzejt.zzp(t, zzhi);
            Object zzp2 = zzejt.zzp(t2, zzhi);
            if (zzp != null && zzp2 != null) {
                zzejt.zza(t, zzhi, zzegr.zze(zzp, zzp2));
                zzf((zzeid<T>) t, i);
            } else if (zzp2 != null) {
                zzejt.zza(t, zzhi, zzp2);
                zzf((zzeid<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzhi = zzhi(i);
        int i2 = this.zziia[i];
        long j = zzhi & 1048575;
        if (zza((zzeid<T>) t2, i2, i)) {
            Object zzp = zzejt.zzp(t, j);
            Object zzp2 = zzejt.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzejt.zza(t, j, zzegr.zze(zzp, zzp2));
                zzb((zzeid<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzejt.zza(t, j, zzp2);
                zzb((zzeid<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzeiv
    public final int zzat(T t) {
        int i;
        int i2;
        long j;
        int zzk;
        int zzi;
        int zzaj;
        int zzai;
        int zzgq;
        int zzgs;
        int zzc;
        int zzai2;
        int zzgq2;
        int zzgs2;
        int i3 = 267386880;
        if (this.zziih) {
            Unsafe unsafe = zzhop;
            int i4 = 0;
            int i5 = 0;
            while (i4 < this.zziia.length) {
                int zzhi = zzhi(i4);
                int i6 = (zzhi & i3) >>> 20;
                int i7 = this.zziia[i4];
                long j2 = zzhi & 1048575;
                int i8 = (i6 < zzegj.DOUBLE_LIST_PACKED.id() || i6 > zzegj.SINT64_LIST_PACKED.id()) ? 0 : this.zziia[i4 + 2] & 1048575;
                switch (i6) {
                    case 0:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzc(i7, 0.0d);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 1:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzb(i7, 0.0f);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 2:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzk(i7, zzejt.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 3:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzl(i7, zzejt.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 4:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzaf(i7, zzejt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 5:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzn(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 6:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzai(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 7:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzi(i7, true);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 8:
                        if (zze((zzeid<T>) t, i4)) {
                            Object zzp = zzejt.zzp(t, j2);
                            if (zzp instanceof zzeff) {
                                zzc = zzefz.zzc(i7, (zzeff) zzp);
                                break;
                            } else {
                                zzc = zzefz.zzj(i7, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 9:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzeix.zzc(i7, zzejt.zzp(t, j2), zzhf(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 10:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzc(i7, (zzeff) zzejt.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 11:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzag(i7, zzejt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 12:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzak(i7, zzejt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 13:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzaj(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 14:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzo(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 15:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzah(i7, zzejt.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 16:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzm(i7, zzejt.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 17:
                        if (zze((zzeid<T>) t, i4)) {
                            zzc = zzefz.zzc(i7, (zzehz) zzejt.zzp(t, j2), zzhf(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 18:
                        zzc = zzeix.zzw(i7, zze(t, j2), false);
                        break;
                    case 19:
                        zzc = zzeix.zzv(i7, zze(t, j2), false);
                        break;
                    case 20:
                        zzc = zzeix.zzo(i7, zze(t, j2), false);
                        break;
                    case 21:
                        zzc = zzeix.zzp(i7, zze(t, j2), false);
                        break;
                    case 22:
                        zzc = zzeix.zzs(i7, zze(t, j2), false);
                        break;
                    case 23:
                        zzc = zzeix.zzw(i7, zze(t, j2), false);
                        break;
                    case 24:
                        zzc = zzeix.zzv(i7, zze(t, j2), false);
                        break;
                    case 25:
                        zzc = zzeix.zzx(i7, zze(t, j2), false);
                        break;
                    case 26:
                        zzc = zzeix.zzc(i7, zze(t, j2));
                        break;
                    case 27:
                        zzc = zzeix.zzc(i7, zze(t, j2), zzhf(i4));
                        break;
                    case 28:
                        zzc = zzeix.zzd(i7, zze(t, j2));
                        break;
                    case 29:
                        zzc = zzeix.zzt(i7, zze(t, j2), false);
                        break;
                    case 30:
                        zzc = zzeix.zzr(i7, zze(t, j2), false);
                        break;
                    case 31:
                        zzc = zzeix.zzv(i7, zze(t, j2), false);
                        break;
                    case 32:
                        zzc = zzeix.zzw(i7, zze(t, j2), false);
                        break;
                    case 33:
                        zzc = zzeix.zzu(i7, zze(t, j2), false);
                        break;
                    case 34:
                        zzc = zzeix.zzq(i7, zze(t, j2), false);
                        break;
                    case 35:
                        zzai2 = zzeix.zzai((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 36:
                        zzai2 = zzeix.zzah((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 37:
                        zzai2 = zzeix.zzaa((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 38:
                        zzai2 = zzeix.zzab((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 39:
                        zzai2 = zzeix.zzae((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 40:
                        zzai2 = zzeix.zzai((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 41:
                        zzai2 = zzeix.zzah((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 42:
                        zzai2 = zzeix.zzaj((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 43:
                        zzai2 = zzeix.zzaf((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 44:
                        zzai2 = zzeix.zzad((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 45:
                        zzai2 = zzeix.zzah((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 46:
                        zzai2 = zzeix.zzai((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 47:
                        zzai2 = zzeix.zzag((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 48:
                        zzai2 = zzeix.zzac((List) unsafe.getObject(t, j2));
                        if (zzai2 > 0) {
                            if (this.zziii) {
                                unsafe.putInt(t, i8, zzai2);
                            }
                            zzgq2 = zzefz.zzgq(i7);
                            zzgs2 = zzefz.zzgs(zzai2);
                            zzc = zzgq2 + zzgs2 + zzai2;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 49:
                        zzc = zzeix.zzd(i7, zze(t, j2), zzhf(i4));
                        break;
                    case 50:
                        zzc = this.zziiq.zzb(i7, zzejt.zzp(t, j2), zzhg(i4));
                        break;
                    case 51:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzc(i7, 0.0d);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 52:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzb(i7, 0.0f);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 53:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzk(i7, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 54:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzl(i7, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 55:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzaf(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 56:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzn(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 57:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzai(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 58:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzi(i7, true);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 59:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            Object zzp2 = zzejt.zzp(t, j2);
                            if (zzp2 instanceof zzeff) {
                                zzc = zzefz.zzc(i7, (zzeff) zzp2);
                                break;
                            } else {
                                zzc = zzefz.zzj(i7, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 60:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzeix.zzc(i7, zzejt.zzp(t, j2), zzhf(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 61:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzc(i7, (zzeff) zzejt.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 62:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzag(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 63:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzak(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 64:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzaj(i7, 0);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 65:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzo(i7, 0L);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 66:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzah(i7, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 67:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzm(i7, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    case 68:
                        if (zza((zzeid<T>) t, i7, i4)) {
                            zzc = zzefz.zzc(i7, (zzehz) zzejt.zzp(t, j2), zzhf(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                            i3 = 267386880;
                        }
                    default:
                        i4 += 3;
                        i3 = 267386880;
                }
                i5 += zzc;
                i4 += 3;
                i3 = 267386880;
            }
            return i5 + zza(this.zziio, t);
        }
        Unsafe unsafe2 = zzhop;
        int i9 = 0;
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zziia.length; i12 += 3) {
            int zzhi2 = zzhi(i12);
            int[] iArr = this.zziia;
            int i13 = iArr[i12];
            int i14 = (zzhi2 & 267386880) >>> 20;
            if (i14 <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                i2 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i11 = unsafe2.getInt(t, i16);
                    i10 = i16;
                }
                i = i15;
            } else {
                i = (!this.zziii || i14 < zzegj.DOUBLE_LIST_PACKED.id() || i14 > zzegj.SINT64_LIST_PACKED.id()) ? 0 : this.zziia[i12 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzhi2 & 1048575;
            switch (i14) {
                case 0:
                    j = 0;
                    if ((i11 & i2) != 0) {
                        i9 += zzefz.zzc(i13, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i11 & i2) != 0) {
                        i9 += zzefz.zzb(i13, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzk = zzefz.zzk(i13, unsafe2.getLong(t, j3));
                        i9 += zzk;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzk = zzefz.zzl(i13, unsafe2.getLong(t, j3));
                        i9 += zzk;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzk = zzefz.zzaf(i13, unsafe2.getInt(t, j3));
                        i9 += zzk;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i11 & i2) != 0) {
                        zzk = zzefz.zzn(i13, 0L);
                        i9 += zzk;
                    }
                    break;
                case 6:
                    if ((i11 & i2) != 0) {
                        i9 += zzefz.zzai(i13, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzi(i13, true);
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i11 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzeff) {
                            zzi = zzefz.zzc(i13, (zzeff) object);
                        } else {
                            zzi = zzefz.zzj(i13, (String) object);
                        }
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i11 & i2) != 0) {
                        zzi = zzeix.zzc(i13, unsafe2.getObject(t, j3), zzhf(i12));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzc(i13, (zzeff) unsafe2.getObject(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzag(i13, unsafe2.getInt(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzak(i13, unsafe2.getInt(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i11 & i2) != 0) {
                        zzaj = zzefz.zzaj(i13, 0);
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzo(i13, 0L);
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzah(i13, unsafe2.getInt(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzm(i13, unsafe2.getLong(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i11 & i2) != 0) {
                        zzi = zzefz.zzc(i13, (zzehz) unsafe2.getObject(t, j3), zzhf(i12));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 18:
                    zzi = zzeix.zzw(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 19:
                    zzi = zzeix.zzv(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 20:
                    zzi = zzeix.zzo(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 21:
                    zzi = zzeix.zzp(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 22:
                    zzi = zzeix.zzs(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 23:
                    zzi = zzeix.zzw(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 24:
                    zzi = zzeix.zzv(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 25:
                    zzi = zzeix.zzx(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 26:
                    zzi = zzeix.zzc(i13, (List) unsafe2.getObject(t, j3));
                    i9 += zzi;
                    j = 0;
                    break;
                case 27:
                    zzi = zzeix.zzc(i13, (List<?>) unsafe2.getObject(t, j3), zzhf(i12));
                    i9 += zzi;
                    j = 0;
                    break;
                case 28:
                    zzi = zzeix.zzd(i13, (List) unsafe2.getObject(t, j3));
                    i9 += zzi;
                    j = 0;
                    break;
                case 29:
                    zzi = zzeix.zzt(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 30:
                    zzi = zzeix.zzr(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 31:
                    zzi = zzeix.zzv(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 32:
                    zzi = zzeix.zzw(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 33:
                    zzi = zzeix.zzu(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 34:
                    zzi = zzeix.zzq(i13, (List) unsafe2.getObject(t, j3), false);
                    i9 += zzi;
                    j = 0;
                    break;
                case 35:
                    zzai = zzeix.zzai((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 36:
                    zzai = zzeix.zzah((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 37:
                    zzai = zzeix.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 38:
                    zzai = zzeix.zzab((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 39:
                    zzai = zzeix.zzae((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 40:
                    zzai = zzeix.zzai((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 41:
                    zzai = zzeix.zzah((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 42:
                    zzai = zzeix.zzaj((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 43:
                    zzai = zzeix.zzaf((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 44:
                    zzai = zzeix.zzad((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 45:
                    zzai = zzeix.zzah((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 46:
                    zzai = zzeix.zzai((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 47:
                    zzai = zzeix.zzag((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 48:
                    zzai = zzeix.zzac((List) unsafe2.getObject(t, j3));
                    if (zzai > 0) {
                        if (this.zziii) {
                            unsafe2.putInt(t, i, zzai);
                        }
                        zzgq = zzefz.zzgq(i13);
                        zzgs = zzefz.zzgs(zzai);
                        zzaj = zzgq + zzgs + zzai;
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 49:
                    zzi = zzeix.zzd(i13, (List) unsafe2.getObject(t, j3), zzhf(i12));
                    i9 += zzi;
                    j = 0;
                    break;
                case 50:
                    zzi = this.zziiq.zzb(i13, unsafe2.getObject(t, j3), zzhg(i12));
                    i9 += zzi;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzc(i13, 0.0d);
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzaj = zzefz.zzb(i13, 0.0f);
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzk(i13, zzi(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzl(i13, zzi(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzaf(i13, zzh(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzn(i13, 0L);
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzaj = zzefz.zzai(i13, 0);
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzi(i13, true);
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzeff) {
                            zzi = zzefz.zzc(i13, (zzeff) object2);
                        } else {
                            zzi = zzefz.zzj(i13, (String) object2);
                        }
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzeix.zzc(i13, unsafe2.getObject(t, j3), zzhf(i12));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzc(i13, (zzeff) unsafe2.getObject(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzag(i13, zzh(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzak(i13, zzh(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzaj = zzefz.zzaj(i13, 0);
                        i9 += zzaj;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzo(i13, 0L);
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzah(i13, zzh(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzm(i13, zzi(t, j3));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzeid<T>) t, i13, i12)) {
                        zzi = zzefz.zzc(i13, (zzehz) unsafe2.getObject(t, j3), zzhf(i12));
                        i9 += zzi;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
        }
        int i17 = 0;
        int zza = i9 + zza(this.zziio, t);
        if (this.zziif) {
            zzegi<?> zzah = this.zziip.zzah(t);
            for (int i18 = 0; i18 < zzah.zzict.zzbhq(); i18++) {
                Map.Entry<?, Object> zzhp = zzah.zzict.zzhp(i18);
                i17 += zzegi.zzb((zzegk) zzhp.getKey(), zzhp.getValue());
            }
            for (Map.Entry<?, Object> entry : zzah.zzict.zzbhr()) {
                i17 += zzegi.zzb((zzegk) entry.getKey(), entry.getValue());
            }
            return zza + i17;
        }
        return zza;
    }

    private static <UT, UB> int zza(zzejn<UT, UB> zzejnVar, T t) {
        return zzejnVar.zzat(zzejnVar.zzax(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzejt.zzp(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.ads.zzeiv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.ads.zzekk r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, com.google.android.gms.internal.ads.zzekk):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0495  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r18, com.google.android.gms.internal.ads.zzekk r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zzb(java.lang.Object, com.google.android.gms.internal.ads.zzekk):void");
    }

    private final <K, V> void zza(zzekk zzekkVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzekkVar.zza(i, this.zziiq.zzao(zzhg(i2)), this.zziiq.zzap(obj));
        }
    }

    private static <UT, UB> void zza(zzejn<UT, UB> zzejnVar, T t, zzekk zzekkVar) throws IOException {
        zzejnVar.zza((zzejn<UT, UB>) zzejnVar.zzax(t), zzekkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zza(T t, zzeip zzeipVar, zzegc zzegcVar) throws IOException {
        if (zzegcVar == null) {
            throw null;
        }
        zzejn zzejnVar = this.zziio;
        zzege<?> zzegeVar = this.zziip;
        zzegi<?> zzegiVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzber = zzeipVar.zzber();
                int zzhl = zzhl(zzber);
                if (zzhl >= 0) {
                    int zzhi = zzhi(zzhl);
                    switch ((267386880 & zzhi) >>> 20) {
                        case 0:
                            zzejt.zza(t, zzhi & 1048575, zzeipVar.readDouble());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 1:
                            zzejt.zza((Object) t, zzhi & 1048575, zzeipVar.readFloat());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 2:
                            zzejt.zza((Object) t, zzhi & 1048575, zzeipVar.zzbdv());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 3:
                            zzejt.zza((Object) t, zzhi & 1048575, zzeipVar.zzbdu());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 4:
                            zzejt.zzb(t, zzhi & 1048575, zzeipVar.zzbdw());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 5:
                            zzejt.zza((Object) t, zzhi & 1048575, zzeipVar.zzbdx());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 6:
                            zzejt.zzb(t, zzhi & 1048575, zzeipVar.zzbdy());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 7:
                            zzejt.zza(t, zzhi & 1048575, zzeipVar.zzbdz());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 8:
                            zza(t, zzhi, zzeipVar);
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 9:
                            if (zze((zzeid<T>) t, zzhl)) {
                                long j = zzhi & 1048575;
                                zzejt.zza(t, j, zzegr.zze(zzejt.zzp(t, j), zzeipVar.zza(zzhf(zzhl), zzegcVar)));
                                break;
                            } else {
                                zzejt.zza(t, zzhi & 1048575, zzeipVar.zza(zzhf(zzhl), zzegcVar));
                                zzf((zzeid<T>) t, zzhl);
                                continue;
                            }
                        case 10:
                            zzejt.zza(t, zzhi & 1048575, zzeipVar.zzbeb());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 11:
                            zzejt.zzb(t, zzhi & 1048575, zzeipVar.zzbec());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 12:
                            int zzbed = zzeipVar.zzbed();
                            zzegw zzhh = zzhh(zzhl);
                            if (zzhh != null && !zzhh.zzi(zzbed)) {
                                obj = zzeix.zza(zzber, zzbed, obj, zzejnVar);
                                break;
                            }
                            zzejt.zzb(t, zzhi & 1048575, zzbed);
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 13:
                            zzejt.zzb(t, zzhi & 1048575, zzeipVar.zzbee());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 14:
                            zzejt.zza((Object) t, zzhi & 1048575, zzeipVar.zzbef());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 15:
                            zzejt.zzb(t, zzhi & 1048575, zzeipVar.zzbeg());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 16:
                            zzejt.zza((Object) t, zzhi & 1048575, zzeipVar.zzbeh());
                            zzf((zzeid<T>) t, zzhl);
                            continue;
                        case 17:
                            if (zze((zzeid<T>) t, zzhl)) {
                                long j2 = zzhi & 1048575;
                                zzejt.zza(t, j2, zzegr.zze(zzejt.zzp(t, j2), zzeipVar.zzb(zzhf(zzhl), zzegcVar)));
                                break;
                            } else {
                                zzejt.zza(t, zzhi & 1048575, zzeipVar.zzb(zzhf(zzhl), zzegcVar));
                                zzf((zzeid<T>) t, zzhl);
                                continue;
                            }
                        case 18:
                            zzeipVar.zzk(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 19:
                            zzeipVar.zzl(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 20:
                            zzeipVar.zzn(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 21:
                            zzeipVar.zzm(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 22:
                            zzeipVar.zzo(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 23:
                            zzeipVar.zzp(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 24:
                            zzeipVar.zzq(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 25:
                            zzeipVar.zzr(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 26:
                            if (zzhk(zzhi)) {
                                zzeipVar.zzs(this.zziin.zza(t, zzhi & 1048575));
                                break;
                            } else {
                                zzeipVar.readStringList(this.zziin.zza(t, zzhi & 1048575));
                                continue;
                            }
                        case 27:
                            zzeipVar.zza(this.zziin.zza(t, zzhi & 1048575), zzhf(zzhl), zzegcVar);
                            continue;
                        case 28:
                            zzeipVar.zzt(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 29:
                            zzeipVar.zzu(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza = this.zziin.zza(t, zzhi & 1048575);
                            zzeipVar.zzv(zza);
                            obj = zzeix.zza(zzber, zza, zzhh(zzhl), obj, zzejnVar);
                            continue;
                        case 31:
                            zzeipVar.zzw(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 32:
                            zzeipVar.zzx(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 33:
                            zzeipVar.zzy(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 34:
                            zzeipVar.zzz(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 35:
                            zzeipVar.zzk(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 36:
                            zzeipVar.zzl(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 37:
                            zzeipVar.zzn(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 38:
                            zzeipVar.zzm(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 39:
                            zzeipVar.zzo(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 40:
                            zzeipVar.zzp(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 41:
                            zzeipVar.zzq(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 42:
                            zzeipVar.zzr(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 43:
                            zzeipVar.zzu(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza2 = this.zziin.zza(t, zzhi & 1048575);
                            zzeipVar.zzv(zza2);
                            obj = zzeix.zza(zzber, zza2, zzhh(zzhl), obj, zzejnVar);
                            continue;
                        case 45:
                            zzeipVar.zzw(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 46:
                            zzeipVar.zzx(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 47:
                            zzeipVar.zzy(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 48:
                            zzeipVar.zzz(this.zziin.zza(t, zzhi & 1048575));
                            continue;
                        case 49:
                            zzeipVar.zzb(this.zziin.zza(t, zzhi & 1048575), zzhf(zzhl), zzegcVar);
                            continue;
                        case 50:
                            Object zzhg = zzhg(zzhl);
                            long zzhi2 = zzhi(zzhl) & 1048575;
                            Object zzp = zzejt.zzp(t, zzhi2);
                            if (zzp == null) {
                                zzp = this.zziiq.zzas(zzhg);
                                zzejt.zza(t, zzhi2, zzp);
                            } else if (this.zziiq.zzaq(zzp)) {
                                Object zzas = this.zziiq.zzas(zzhg);
                                this.zziiq.zzf(zzas, zzp);
                                zzejt.zza(t, zzhi2, zzas);
                                zzp = zzas;
                            }
                            zzeipVar.zza(this.zziiq.zzan(zzp), this.zziiq.zzao(zzhg), zzegcVar);
                            continue;
                        case 51:
                            zzejt.zza(t, zzhi & 1048575, Double.valueOf(zzeipVar.readDouble()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 52:
                            zzejt.zza(t, zzhi & 1048575, Float.valueOf(zzeipVar.readFloat()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 53:
                            zzejt.zza(t, zzhi & 1048575, Long.valueOf(zzeipVar.zzbdv()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 54:
                            zzejt.zza(t, zzhi & 1048575, Long.valueOf(zzeipVar.zzbdu()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 55:
                            zzejt.zza(t, zzhi & 1048575, Integer.valueOf(zzeipVar.zzbdw()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 56:
                            zzejt.zza(t, zzhi & 1048575, Long.valueOf(zzeipVar.zzbdx()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 57:
                            zzejt.zza(t, zzhi & 1048575, Integer.valueOf(zzeipVar.zzbdy()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 58:
                            zzejt.zza(t, zzhi & 1048575, Boolean.valueOf(zzeipVar.zzbdz()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 59:
                            zza(t, zzhi, zzeipVar);
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 60:
                            if (zza((zzeid<T>) t, zzber, zzhl)) {
                                long j3 = zzhi & 1048575;
                                zzejt.zza(t, j3, zzegr.zze(zzejt.zzp(t, j3), zzeipVar.zza(zzhf(zzhl), zzegcVar)));
                            } else {
                                zzejt.zza(t, zzhi & 1048575, zzeipVar.zza(zzhf(zzhl), zzegcVar));
                                zzf((zzeid<T>) t, zzhl);
                            }
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 61:
                            zzejt.zza(t, zzhi & 1048575, zzeipVar.zzbeb());
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 62:
                            zzejt.zza(t, zzhi & 1048575, Integer.valueOf(zzeipVar.zzbec()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 63:
                            int zzbed2 = zzeipVar.zzbed();
                            zzegw zzhh2 = zzhh(zzhl);
                            if (zzhh2 != null && !zzhh2.zzi(zzbed2)) {
                                obj = zzeix.zza(zzber, zzbed2, obj, zzejnVar);
                                break;
                            }
                            zzejt.zza(t, zzhi & 1048575, Integer.valueOf(zzbed2));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 64:
                            zzejt.zza(t, zzhi & 1048575, Integer.valueOf(zzeipVar.zzbee()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 65:
                            zzejt.zza(t, zzhi & 1048575, Long.valueOf(zzeipVar.zzbef()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 66:
                            zzejt.zza(t, zzhi & 1048575, Integer.valueOf(zzeipVar.zzbeg()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 67:
                            zzejt.zza(t, zzhi & 1048575, Long.valueOf(zzeipVar.zzbeh()));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        case 68:
                            zzejt.zza(t, zzhi & 1048575, zzeipVar.zzb(zzhf(zzhl), zzegcVar));
                            zzb((zzeid<T>) t, zzber, zzhl);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzejnVar.zzbhy();
                                } catch (zzehc unused) {
                                    zzejnVar.zza(zzeipVar);
                                    if (obj == null) {
                                        obj = zzejnVar.zzay(t);
                                    }
                                    if (!zzejnVar.zza((zzejn) obj, zzeipVar)) {
                                        for (int i = this.zziik; i < this.zziil; i++) {
                                            obj = zza((Object) t, this.zziij[i], (int) obj, (zzejn<UT, int>) zzejnVar);
                                        }
                                        if (obj != null) {
                                            zzejnVar.zzj(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzejnVar.zza((zzejn) obj, zzeipVar)) {
                                for (int i2 = this.zziik; i2 < this.zziil; i2++) {
                                    obj = zza((Object) t, this.zziij[i2], (int) obj, (zzejn<UT, int>) zzejnVar);
                                }
                                if (obj != null) {
                                    zzejnVar.zzj(t, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zzber == Integer.MAX_VALUE) {
                    for (int i3 = this.zziik; i3 < this.zziil; i3++) {
                        obj = zza((Object) t, this.zziij[i3], (int) obj, (zzejn<UT, int>) zzejnVar);
                    }
                    if (obj != null) {
                        zzejnVar.zzj(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza3 = !this.zziif ? null : zzegeVar.zza(zzegcVar, this.zziie, zzber);
                    if (zza3 != null) {
                        if (zzegiVar == null) {
                            zzegiVar = zzegeVar.zzai(t);
                        }
                        zzegi<?> zzegiVar2 = zzegiVar;
                        obj = zzegeVar.zza(zzeipVar, zza3, zzegcVar, zzegiVar2, obj, zzejnVar);
                        zzegiVar = zzegiVar2;
                    } else {
                        zzejnVar.zza(zzeipVar);
                        if (obj == null) {
                            obj = zzejnVar.zzay(t);
                        }
                        if (!zzejnVar.zza((zzejn) obj, zzeipVar)) {
                            for (int i4 = this.zziik; i4 < this.zziil; i4++) {
                                obj = zza((Object) t, this.zziij[i4], (int) obj, (zzejn<UT, int>) zzejnVar);
                            }
                            if (obj != null) {
                                zzejnVar.zzj(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zziik; i5 < this.zziil; i5++) {
                    obj = zza((Object) t, this.zziij[i5], (int) obj, (zzejn<UT, int>) zzejnVar);
                }
                if (obj != null) {
                    zzejnVar.zzj(t, obj);
                }
                throw th;
            }
        }
    }

    private static zzejq zzau(Object obj) {
        zzegp zzegpVar = (zzegp) obj;
        zzejq zzejqVar = zzegpVar.zzifo;
        if (zzejqVar == zzejq.zzbhz()) {
            zzejq zzbia = zzejq.zzbia();
            zzegpVar.zzifo = zzbia;
            return zzbia;
        }
        return zzejqVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzeke zzekeVar, Class<?> cls, zzefa zzefaVar) throws IOException {
        switch (zzeig.zzicc[zzekeVar.ordinal()]) {
            case 1:
                int zzb = zzefb.zzb(bArr, i, zzefaVar);
                zzefaVar.zziay = Boolean.valueOf(zzefaVar.zziax != 0);
                return zzb;
            case 2:
                return zzefb.zze(bArr, i, zzefaVar);
            case 3:
                zzefaVar.zziay = Double.valueOf(zzefb.zzi(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzefaVar.zziay = Integer.valueOf(zzefb.zzg(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzefaVar.zziay = Long.valueOf(zzefb.zzh(bArr, i));
                return i + 8;
            case 8:
                zzefaVar.zziay = Float.valueOf(zzefb.zzj(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzefb.zza(bArr, i, zzefaVar);
                zzefaVar.zziay = Integer.valueOf(zzefaVar.zziaw);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzefb.zzb(bArr, i, zzefaVar);
                zzefaVar.zziay = Long.valueOf(zzefaVar.zziax);
                return zzb2;
            case 14:
                return zzefb.zza(zzeio.zzbhg().zzh(cls), bArr, i, i2, zzefaVar);
            case 15:
                int zza2 = zzefb.zza(bArr, i, zzefaVar);
                zzefaVar.zziay = Integer.valueOf(zzefq.zzgc(zzefaVar.zziaw));
                return zza2;
            case 16:
                int zzb3 = zzefb.zzb(bArr, i, zzefaVar);
                zzefaVar.zziay = Long.valueOf(zzefq.zzfh(zzefaVar.zziax));
                return zzb3;
            case 17:
                return zzefb.zzd(bArr, i, zzefaVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0236 -> B:116:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:67:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e8 -> B:96:0x01e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.zzefa r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzefa):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzefa zzefaVar) throws IOException {
        Unsafe unsafe = zzhop;
        Object zzhg = zzhg(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zziiq.zzaq(object)) {
            Object zzas = this.zziiq.zzas(zzhg);
            this.zziiq.zzf(zzas, object);
            unsafe.putObject(t, j, zzas);
            object = zzas;
        }
        zzehu<?, ?> zzao = this.zziiq.zzao(zzhg);
        Map<?, ?> zzan = this.zziiq.zzan(object);
        int zza = zzefb.zza(bArr, i, zzefaVar);
        int i4 = zzefaVar.zziaw;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzegz.zzbgb();
        }
        int i5 = i4 + zza;
        Object obj = (K) zzao.zzihv;
        Object obj2 = (V) zzao.zzckv;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = zzefb.zza(i7, bArr, i6, zzefaVar);
                i7 = zzefaVar.zziaw;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzao.zzihu.zzbij()) {
                    zza = zza(bArr, i8, i2, zzao.zzihu, (Class<?>) null, zzefaVar);
                    obj = (K) zzefaVar.zziay;
                } else {
                    zza = zzefb.zza(i7, bArr, i8, i2, zzefaVar);
                }
            } else {
                if (i9 == 2 && i10 == zzao.zzihw.zzbij()) {
                    zza = zza(bArr, i8, i2, zzao.zzihw, zzao.zzckv.getClass(), zzefaVar);
                    obj2 = zzefaVar.zziay;
                }
                zza = zzefb.zza(i7, bArr, i8, i2, zzefaVar);
            }
        }
        if (zza != i5) {
            throw zzegz.zzbgi();
        }
        zzan.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzefa zzefaVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzhop;
        long j2 = this.zziia[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzefb.zzi(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzefb.zzj(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzefb.zzb(bArr, i, zzefaVar);
                    unsafe.putObject(t, j, Long.valueOf(zzefaVar.zziax));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzefb.zza(bArr, i, zzefaVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzefaVar.zziaw));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzefb.zzh(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzefb.zzg(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzefb.zzb(bArr, i, zzefaVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzefaVar.zziax != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzefb.zza(bArr, i, zzefaVar);
                    int i9 = zzefaVar.zziaw;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzejw.zzm(bArr, zza, zza + i9)) {
                        throw zzegz.zzbgj();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzegr.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzefb.zza(zzhf(i8), bArr, i, i2, zzefaVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzefaVar.zziay);
                    } else {
                        unsafe.putObject(t, j, zzegr.zze(object, zzefaVar.zziay));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzefb.zze(bArr, i, zzefaVar);
                    unsafe.putObject(t, j, zzefaVar.zziay);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzefb.zza(bArr, i, zzefaVar);
                    int i10 = zzefaVar.zziaw;
                    zzegw zzhh = zzhh(i8);
                    if (zzhh == null || zzhh.zzi(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzau(t).zzd(i3, Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzefb.zza(bArr, i, zzefaVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzefq.zzgc(zzefaVar.zziaw)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzefb.zzb(bArr, i, zzefaVar);
                    unsafe.putObject(t, j, Long.valueOf(zzefq.zzfh(zzefaVar.zziax)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zzefb.zza(zzhf(i8), bArr, i, i2, (i3 & (-8)) | 4, zzefaVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzefaVar.zziay);
                    } else {
                        unsafe.putObject(t, j, zzegr.zze(object2, zzefaVar.zziay));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzeiv zzhf(int i) {
        int i2 = (i / 3) << 1;
        zzeiv zzeivVar = (zzeiv) this.zziib[i2];
        if (zzeivVar != null) {
            return zzeivVar;
        }
        zzeiv<T> zzh = zzeio.zzbhg().zzh((Class) this.zziib[i2 + 1]);
        this.zziib[i2] = zzh;
        return zzh;
    }

    private final Object zzhg(int i) {
        return this.zziib[(i / 3) << 1];
    }

    private final zzegw zzhh(int i) {
        return (zzegw) this.zziib[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04da, code lost:
        if (r6 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04dc, code lost:
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04e2, code lost:
        r1 = null;
        r2 = r9.zziik;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04e7, code lost:
        if (r2 >= r9.zziil) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e9, code lost:
        r1 = (com.google.android.gms.internal.ads.zzejq) r9.zza((java.lang.Object) r12, r9.zziij[r2], (int) r1, (com.google.android.gms.internal.ads.zzejn<UT, int>) r9.zziio);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04f8, code lost:
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04fa, code lost:
        r9.zziio.zzj(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04ff, code lost:
        if (r7 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0503, code lost:
        if (r0 != r31) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x050a, code lost:
        throw com.google.android.gms.internal.ads.zzegz.zzbgi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x050d, code lost:
        if (r0 > r31) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x050f, code lost:
        if (r3 != r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0511, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0517, code lost:
        throw com.google.android.gms.internal.ads.zzegz.zzbgi();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.zzefa r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzefa):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02dc, code lost:
        if (r0 == r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0323, code lost:
        if (r0 == r15) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
        if (r0 == r15) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0348, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzeiv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzefa r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeid.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzefa):void");
    }

    @Override // com.google.android.gms.internal.ads.zzeiv
    public final void zzaj(T t) {
        int i;
        int i2 = this.zziik;
        while (true) {
            i = this.zziil;
            if (i2 >= i) {
                break;
            }
            long zzhi = zzhi(this.zziij[i2]) & 1048575;
            Object zzp = zzejt.zzp(t, zzhi);
            if (zzp != null) {
                zzejt.zza(t, zzhi, this.zziiq.zzar(zzp));
            }
            i2++;
        }
        int length = this.zziij.length;
        while (i < length) {
            this.zziin.zzb(t, this.zziij[i]);
            i++;
        }
        this.zziio.zzaj(t);
        if (this.zziif) {
            this.zziip.zzaj(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzejn<UT, UB> zzejnVar) {
        zzegw zzhh;
        int i2 = this.zziia[i];
        Object zzp = zzejt.zzp(obj, zzhi(i) & 1048575);
        return (zzp == null || (zzhh = zzhh(i)) == null) ? ub : (UB) zza(i, i2, this.zziiq.zzan(zzp), zzhh, (zzegw) ub, (zzejn<UT, zzegw>) zzejnVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzegw zzegwVar, UB ub, zzejn<UT, UB> zzejnVar) {
        zzehu<?, ?> zzao = this.zziiq.zzao(zzhg(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzegwVar.zzi(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzejnVar.zzbhy();
                }
                zzefn zzfw = zzeff.zzfw(zzehr.zza(zzao, next.getKey(), next.getValue()));
                try {
                    zzehr.zza(zzfw.zzbds(), zzao, next.getKey(), next.getValue());
                    zzejnVar.zza((zzejn<UT, UB>) ub, i2, zzfw.zzbdr());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.zzeiv] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.zzeiv] */
    @Override // com.google.android.gms.internal.ads.zzeiv
    public final boolean zzav(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i5 >= this.zziik) {
                return !this.zziif || this.zziip.zzah(t).isInitialized();
            }
            int i6 = this.zziij[i5];
            int i7 = this.zziia[i6];
            int zzhi = zzhi(i6);
            int i8 = this.zziia[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzhop.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if (((268435456 & zzhi) != 0) && !zza((zzeid<T>) t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & zzhi) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zza((zzeid<T>) t, i6, i, i2, i10) && !zza(t, zzhi, zzhf(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zza((zzeid<T>) t, i7, i6) && !zza(t, zzhi, zzhf(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzap = this.zziiq.zzap(zzejt.zzp(t, zzhi & 1048575));
                            if (!zzap.isEmpty()) {
                                if (this.zziiq.zzao(zzhg(i6)).zzihw.zzbii() == zzekh.MESSAGE) {
                                    zzeiv<T> zzeivVar = 0;
                                    Iterator<?> it = zzap.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzeivVar == null) {
                                            zzeivVar = zzeio.zzbhg().zzh(next.getClass());
                                        }
                                        boolean zzav = zzeivVar.zzav(next);
                                        zzeivVar = zzeivVar;
                                        if (!zzav) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzejt.zzp(t, zzhi & 1048575);
                if (!list.isEmpty()) {
                    ?? zzhf = zzhf(i6);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!zzhf.zzav(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzeiv zzeivVar) {
        return zzeivVar.zzav(zzejt.zzp(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzekk zzekkVar) throws IOException {
        if (obj instanceof String) {
            zzekkVar.zzi(i, (String) obj);
        } else {
            zzekkVar.zza(i, (zzeff) obj);
        }
    }

    private final void zza(Object obj, int i, zzeip zzeipVar) throws IOException {
        if (zzhk(i)) {
            zzejt.zza(obj, i & 1048575, zzeipVar.zzbea());
        } else if (this.zziig) {
            zzejt.zza(obj, i & 1048575, zzeipVar.readString());
        } else {
            zzejt.zza(obj, i & 1048575, zzeipVar.zzbeb());
        }
    }

    private final int zzhi(int i) {
        return this.zziia[i + 1];
    }

    private final int zzhj(int i) {
        return this.zziia[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzejt.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzejt.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzejt.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzejt.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzejt.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zze((zzeid<T>) t, i) == zze((zzeid<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zze((zzeid<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zze(T t, int i) {
        int zzhj = zzhj(i);
        long j = zzhj & 1048575;
        if (j != 1048575) {
            return (zzejt.zzk(t, j) & (1 << (zzhj >>> 20))) != 0;
        }
        int zzhi = zzhi(i);
        long j2 = zzhi & 1048575;
        switch ((zzhi & 267386880) >>> 20) {
            case 0:
                return zzejt.zzo(t, j2) != 0.0d;
            case 1:
                return zzejt.zzn(t, j2) != 0.0f;
            case 2:
                return zzejt.zzl(t, j2) != 0;
            case 3:
                return zzejt.zzl(t, j2) != 0;
            case 4:
                return zzejt.zzk(t, j2) != 0;
            case 5:
                return zzejt.zzl(t, j2) != 0;
            case 6:
                return zzejt.zzk(t, j2) != 0;
            case 7:
                return zzejt.zzm(t, j2);
            case 8:
                Object zzp = zzejt.zzp(t, j2);
                if (zzp instanceof String) {
                    return !((String) zzp).isEmpty();
                } else if (zzp instanceof zzeff) {
                    return !zzeff.zzibd.equals(zzp);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzejt.zzp(t, j2) != null;
            case 10:
                return !zzeff.zzibd.equals(zzejt.zzp(t, j2));
            case 11:
                return zzejt.zzk(t, j2) != 0;
            case 12:
                return zzejt.zzk(t, j2) != 0;
            case 13:
                return zzejt.zzk(t, j2) != 0;
            case 14:
                return zzejt.zzl(t, j2) != 0;
            case 15:
                return zzejt.zzk(t, j2) != 0;
            case 16:
                return zzejt.zzl(t, j2) != 0;
            case 17:
                return zzejt.zzp(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzf(T t, int i) {
        int zzhj = zzhj(i);
        long j = 1048575 & zzhj;
        if (j == 1048575) {
            return;
        }
        zzejt.zzb(t, j, (1 << (zzhj >>> 20)) | zzejt.zzk(t, j));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzejt.zzk(t, (long) (zzhj(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzejt.zzb(t, zzhj(i2) & 1048575, i);
    }

    private final int zzhl(int i) {
        if (i < this.zziic || i > this.zziid) {
            return -1;
        }
        return zzao(i, 0);
    }

    private final int zzan(int i, int i2) {
        if (i < this.zziic || i > this.zziid) {
            return -1;
        }
        return zzao(i, i2);
    }

    private final int zzao(int i, int i2) {
        int length = (this.zziia.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zziia[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
