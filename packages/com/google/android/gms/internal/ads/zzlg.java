package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzlg implements zzjv {
    private static final zzka zzapf = new zzlf();
    private static final int zzaxh = zzpq.zzbl("seig");
    private static final byte[] zzaxi = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final int flags;
    private long zzaid;
    private final zzpk zzapm;
    private int zzarb;
    private int zzarc;
    private zzjx zzarf;
    private final zzln zzaxj;
    private final SparseArray<zzlh> zzaxk;
    private final zzpk zzaxl;
    private final zzpk zzaxm;
    private final zzpk zzaxn;
    private final zzpo zzaxo;
    private final zzpk zzaxp;
    private final byte[] zzaxq;
    private final Stack<zzku> zzaxr;
    private final LinkedList<zzli> zzaxs;
    private int zzaxt;
    private int zzaxu;
    private long zzaxv;
    private int zzaxw;
    private zzpk zzaxx;
    private long zzaxy;
    private int zzaxz;
    private long zzaya;
    private zzlh zzayb;
    private int zzayc;
    private boolean zzayd;
    private zzkg zzaye;
    private zzkg[] zzayf;
    private boolean zzayg;

    public zzlg() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void release() {
    }

    private zzlg(int i) {
        this(0, null);
    }

    private zzlg(int i, zzpo zzpoVar) {
        this(0, null, null);
    }

    private zzlg(int i, zzpo zzpoVar, zzln zzlnVar) {
        this.flags = i;
        this.zzaxo = null;
        this.zzaxj = null;
        this.zzaxp = new zzpk(16);
        this.zzapm = new zzpk(zzpf.zzbjn);
        this.zzaxl = new zzpk(5);
        this.zzaxm = new zzpk();
        this.zzaxn = new zzpk(1);
        this.zzaxq = new byte[16];
        this.zzaxr = new Stack<>();
        this.zzaxs = new LinkedList<>();
        this.zzaxk = new SparseArray<>();
        this.zzaid = -9223372036854775807L;
        this.zzaya = -9223372036854775807L;
        zzgz();
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        return zzlo.zzd(zzjyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zza(zzjx zzjxVar) {
        this.zzarf = zzjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzc(long j, long j2) {
        int size = this.zzaxk.size();
        for (int i = 0; i < size; i++) {
            this.zzaxk.valueAt(i).reset();
        }
        this.zzaxs.clear();
        this.zzaxz = 0;
        this.zzaxr.clear();
        zzgz();
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0004 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzjy r27, com.google.android.gms.internal.ads.zzkb r28) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlg.zza(com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzkb):int");
    }

    private final void zzgz() {
        this.zzaxt = 0;
        this.zzaxw = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0656  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzeb(long r53) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlg.zzeb(long):void");
    }

    private static void zza(zzpk zzpkVar, int i, zzlp zzlpVar) throws zzhv {
        zzpkVar.zzbo(i + 8);
        int zzar = zzkr.zzar(zzpkVar.readInt());
        if ((zzar & 1) != 0) {
            throw new zzhv("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzar & 2) != 0;
        int zzjd = zzpkVar.zzjd();
        if (zzjd != zzlpVar.zzawy) {
            int i2 = zzlpVar.zzawy;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(zzjd);
            sb.append(", ");
            sb.append(i2);
            throw new zzhv(sb.toString());
        }
        Arrays.fill(zzlpVar.zzbar, 0, zzjd, z);
        zzlpVar.zzaw(zzpkVar.zziy());
        zzpkVar.zze(zzlpVar.zzbau.data, 0, zzlpVar.zzbat);
        zzlpVar.zzbau.zzbo(0);
        zzlpVar.zzbav = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzjn zzb(java.util.List<com.google.android.gms.internal.ads.zzkt> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzkt r5 = (com.google.android.gms.internal.ads.zzkt) r5
            int r6 = r5.type
            int r7 = com.google.android.gms.internal.ads.zzkr.zzaui
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.google.android.gms.internal.ads.zzpk r5 = r5.zzawe
            byte[] r5 = r5.data
            com.google.android.gms.internal.ads.zzpk r6 = new com.google.android.gms.internal.ads.zzpk
            r6.<init>(r5)
            int r7 = r6.limit()
            r8 = 32
            if (r7 >= r8) goto L30
        L2e:
            r6 = r2
            goto L99
        L30:
            r6.zzbo(r1)
            int r7 = r6.readInt()
            int r8 = r6.zziy()
            int r8 = r8 + 4
            if (r7 == r8) goto L40
            goto L2e
        L40:
            int r7 = r6.readInt()
            int r8 = com.google.android.gms.internal.ads.zzkr.zzaui
            if (r7 == r8) goto L49
            goto L2e
        L49:
            int r7 = r6.readInt()
            int r7 = com.google.android.gms.internal.ads.zzkr.zzaq(r7)
            r8 = 1
            if (r7 <= r8) goto L6d
            r6 = 37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Unsupported pssh version: "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2e
        L6d:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.readLong()
            long r12 = r6.readLong()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L85
            int r7 = r6.zzjd()
            int r7 = r7 << 4
            r6.zzbp(r7)
        L85:
            int r7 = r6.zzjd()
            int r8 = r6.zziy()
            if (r7 == r8) goto L90
            goto L2e
        L90:
            byte[] r8 = new byte[r7]
            r6.zze(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzjn$zza r7 = new com.google.android.gms.internal.ads.zzjn$zza
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzjn r14 = new com.google.android.gms.internal.ads.zzjn
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlg.zzb(java.util.List):com.google.android.gms.internal.ads.zzjn");
    }
}
