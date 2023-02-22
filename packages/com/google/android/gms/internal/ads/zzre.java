package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzre {
    private int score;
    private final int zzbsb;
    private final int zzbsc;
    private final int zzbsd;
    private final boolean zzbse;
    private final zzrp zzbsf;
    private final zzsa zzbsg;
    private final Object lock = new Object();
    private ArrayList<String> zzbsh = new ArrayList<>();
    private ArrayList<String> zzbsi = new ArrayList<>();
    private ArrayList<zzrn> zzbsj = new ArrayList<>();
    private int zzbsk = 0;
    private int zzbsl = 0;
    private int zzbsm = 0;
    private String zzbsn = "";
    private String zzbso = "";
    private String zzbsp = "";

    public zzre(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zzbsb = i;
        this.zzbsc = i2;
        this.zzbsd = i3;
        this.zzbse = z;
        this.zzbsf = new zzrp(i4);
        this.zzbsg = new zzsa(i5, i6, i7);
    }

    public final boolean zzlw() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbsm == 0;
        }
        return z;
    }

    public final String zzlx() {
        return this.zzbsn;
    }

    public final String zzly() {
        return this.zzbso;
    }

    public final String zzlz() {
        return this.zzbsp;
    }

    public final void zzma() {
        synchronized (this.lock) {
            this.score -= 100;
        }
    }

    public final void zzmb() {
        synchronized (this.lock) {
            this.zzbsm--;
        }
    }

    public final void zzmc() {
        synchronized (this.lock) {
            this.zzbsm++;
        }
    }

    public final void zza(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
        synchronized (this.lock) {
            if (this.zzbsm < 0) {
                zzaxy.zzef("ActivityContent: negative number of WebViews.");
            }
            zzme();
        }
    }

    public final void zzb(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
    }

    private final void zzc(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.zzbsd) {
            return;
        }
        synchronized (this.lock) {
            this.zzbsh.add(str);
            this.zzbsk += str.length();
            if (z) {
                this.zzbsi.add(str);
                this.zzbsj.add(new zzrn(f, f2, f3, f4, this.zzbsi.size() - 1));
            }
        }
    }

    public final void zzmd() {
        synchronized (this.lock) {
            int zzh = zzh(this.zzbsk, this.zzbsl);
            if (zzh > this.score) {
                this.score = zzh;
            }
        }
    }

    public final void zzme() {
        synchronized (this.lock) {
            int zzh = zzh(this.zzbsk, this.zzbsl);
            if (zzh > this.score) {
                this.score = zzh;
                if (!com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzwy()) {
                    this.zzbsn = this.zzbsf.zza(this.zzbsh);
                    this.zzbso = this.zzbsf.zza(this.zzbsi);
                }
                if (!com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxa()) {
                    this.zzbsp = this.zzbsg.zza(this.zzbsi, this.zzbsj);
                }
            }
        }
    }

    private final int zzh(int i, int i2) {
        if (this.zzbse) {
            return this.zzbsc;
        }
        return (i * this.zzbsb) + (i2 * this.zzbsc);
    }

    public final int getScore() {
        return this.score;
    }

    public final void zzbw(int i) {
        this.zzbsl = i;
    }

    private static String zza(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList2.get(i2);
            i2++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final String toString() {
        int i = this.zzbsl;
        int i2 = this.score;
        int i3 = this.zzbsk;
        String zza = zza(this.zzbsh, 100);
        String zza2 = zza(this.zzbsi, 100);
        String str = this.zzbsn;
        String str2 = this.zzbso;
        String str3 = this.zzbsp;
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 165 + String.valueOf(zza2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(zza);
        sb.append("\n viewableText");
        sb.append(zza2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzmf() {
        return this.zzbsk;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzre) {
            if (obj == this) {
                return true;
            }
            String str = ((zzre) obj).zzbsn;
            return str != null && str.equals(this.zzbsn);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbsn.hashCode();
    }
}
