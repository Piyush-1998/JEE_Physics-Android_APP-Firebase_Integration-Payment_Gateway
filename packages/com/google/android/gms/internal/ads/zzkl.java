package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzjn;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzkl implements zzjv {
    private static final zzka zzapf = new zzko();
    private static final byte[] zzapg = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzaph = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzapi = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzaid;
    private final zzks zzaoz;
    private final zzkj zzapj;
    private final SparseArray<zzkq> zzapk;
    private final boolean zzapl;
    private final zzpk zzapm;
    private final zzpk zzapn;
    private final zzpk zzapo;
    private final zzpk zzapp;
    private final zzpk zzapq;
    private final zzpk zzapr;
    private final zzpk zzaps;
    private final zzpk zzapt;
    private final zzpk zzapu;
    private ByteBuffer zzapv;
    private long zzapw;
    private long zzapx;
    private long zzapy;
    private long zzapz;
    private zzkq zzaqa;
    private boolean zzaqb;
    private int zzaqc;
    private long zzaqd;
    private boolean zzaqe;
    private long zzaqf;
    private long zzaqg;
    private long zzaqh;
    private zzpe zzaqi;
    private zzpe zzaqj;
    private boolean zzaqk;
    private int zzaql;
    private long zzaqm;
    private long zzaqn;
    private int zzaqo;
    private int zzaqp;
    private int[] zzaqq;
    private int zzaqr;
    private int zzaqs;
    private int zzaqt;
    private int zzaqu;
    private boolean zzaqv;
    private boolean zzaqw;
    private boolean zzaqx;
    private boolean zzaqy;
    private byte zzaqz;
    private int zzara;
    private int zzarb;
    private int zzarc;
    private boolean zzard;
    private boolean zzare;
    private zzjx zzarf;

    public zzkl() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzan(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzao(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void release() {
    }

    private zzkl(int i) {
        this(new zzki(), 0);
    }

    private zzkl(zzkj zzkjVar, int i) {
        this.zzapx = -1L;
        this.zzapy = -9223372036854775807L;
        this.zzapz = -9223372036854775807L;
        this.zzaid = -9223372036854775807L;
        this.zzaqf = -1L;
        this.zzaqg = -1L;
        this.zzaqh = -9223372036854775807L;
        this.zzapj = zzkjVar;
        zzkjVar.zza(new zzkn(this, null));
        this.zzapl = true;
        this.zzaoz = new zzks();
        this.zzapk = new SparseArray<>();
        this.zzapo = new zzpk(4);
        this.zzapp = new zzpk(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzapq = new zzpk(4);
        this.zzapm = new zzpk(zzpf.zzbjn);
        this.zzapn = new zzpk(4);
        this.zzapr = new zzpk();
        this.zzaps = new zzpk();
        this.zzapt = new zzpk(8);
        this.zzapu = new zzpk();
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        return new zzkp().zza(zzjyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zza(zzjx zzjxVar) {
        this.zzarf = zzjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzc(long j, long j2) {
        this.zzaqh = -9223372036854775807L;
        this.zzaql = 0;
        this.zzapj.reset();
        this.zzaoz.reset();
        zzgs();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzjy r9, com.google.android.gms.internal.ads.zzkb r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.zzard = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.zzard
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.zzkj r2 = r8.zzapj
            boolean r2 = r2.zzb(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.zzaqe
            if (r5 == 0) goto L25
            r8.zzaqg = r3
            long r3 = r8.zzaqf
            r10.position = r3
            r8.zzaqe = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.zzaqb
            if (r3 == 0) goto L36
            long r3 = r8.zzaqg
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.position = r3
            r8.zzaqg = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zza(com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzkb):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzhv {
        if (i == 160) {
            this.zzare = false;
        } else if (i == 174) {
            this.zzaqa = new zzkq(null);
        } else if (i == 187) {
            this.zzaqk = false;
        } else if (i == 19899) {
            this.zzaqc = -1;
            this.zzaqd = -1L;
        } else if (i == 20533) {
            this.zzaqa.zzark = true;
        } else if (i == 21968) {
            this.zzaqa.zzarr = true;
        } else if (i == 408125543) {
            long j3 = this.zzapx;
            if (j3 != -1 && j3 != j) {
                throw new zzhv("Multiple Segment elements not supported");
            }
            this.zzapx = j;
            this.zzapw = j2;
        } else if (i == 475249515) {
            this.zzaqi = new zzpe();
            this.zzaqj = new zzpe();
        } else if (i == 524531317 && !this.zzaqb) {
            if (this.zzapl && this.zzaqf != -1) {
                this.zzaqe = true;
                return;
            }
            this.zzarf.zza(new zzkd(this.zzaid));
            this.zzaqb = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzap(int i) throws zzhv {
        zzke zzkdVar;
        zzpe zzpeVar;
        zzpe zzpeVar2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.zzaql != 2) {
                return;
            }
            if (!this.zzare) {
                this.zzaqt |= 1;
            }
            zza(this.zzapk.get(this.zzaqr), this.zzaqm);
            this.zzaql = 0;
        } else if (i == 174) {
            String str = this.zzaqa.zzari;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 1) != 0) {
                zzkq zzkqVar = this.zzaqa;
                zzkqVar.zza(this.zzarf, zzkqVar.number);
                this.zzapk.put(this.zzaqa.number, this.zzaqa);
            }
            this.zzaqa = null;
        } else if (i == 19899) {
            int i4 = this.zzaqc;
            if (i4 != -1) {
                long j = this.zzaqd;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.zzaqf = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzhv("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            if (this.zzaqa.zzark) {
                if (this.zzaqa.zzarm == null) {
                    throw new zzhv("Encrypted Track found but ContentEncKeyID was not found");
                }
                this.zzaqa.zzahb = new zzjn(new zzjn.zza(zzha.UUID_NIL, "video/webm", this.zzaqa.zzarm.zzaow));
            }
        } else if (i == 28032) {
            if (this.zzaqa.zzark && this.zzaqa.zzarl != null) {
                throw new zzhv("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.zzapy == -9223372036854775807L) {
                this.zzapy = 1000000L;
            }
            long j2 = this.zzapz;
            if (j2 != -9223372036854775807L) {
                this.zzaid = zzea(j2);
            }
        } else if (i != 374648427) {
            if (i == 475249515 && !this.zzaqb) {
                zzjx zzjxVar = this.zzarf;
                if (this.zzapx == -1 || this.zzaid == -9223372036854775807L || (zzpeVar = this.zzaqi) == null || zzpeVar.size() == 0 || (zzpeVar2 = this.zzaqj) == null || zzpeVar2.size() != this.zzaqi.size()) {
                    this.zzaqi = null;
                    this.zzaqj = null;
                    zzkdVar = new zzkd(this.zzaid);
                } else {
                    int size = this.zzaqi.size();
                    int[] iArr = new int[size];
                    long[] jArr = new long[size];
                    long[] jArr2 = new long[size];
                    long[] jArr3 = new long[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        jArr3[i5] = this.zzaqi.get(i5);
                        jArr[i5] = this.zzapx + this.zzaqj.get(i5);
                    }
                    while (true) {
                        i2 = size - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i6 = i3 + 1;
                        iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                        jArr2[i3] = jArr3[i6] - jArr3[i3];
                        i3 = i6;
                    }
                    iArr[i2] = (int) ((this.zzapx + this.zzapw) - jArr[i2]);
                    jArr2[i2] = this.zzaid - jArr3[i2];
                    this.zzaqi = null;
                    this.zzaqj = null;
                    zzkdVar = new zzjt(iArr, jArr, jArr2, jArr3);
                }
                zzjxVar.zza(zzkdVar);
                this.zzaqb = true;
            }
        } else if (this.zzapk.size() == 0) {
            throw new zzhv("No valid tracks were found");
        } else {
            this.zzarf.zzgp();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzhv {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new zzhv(sb.toString());
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new zzhv(sb2.toString());
        } else {
            switch (i) {
                case 131:
                    this.zzaqa.type = (int) j;
                    return;
                case 136:
                    this.zzaqa.zzask = j == 1;
                    return;
                case 155:
                    this.zzaqn = zzea(j);
                    return;
                case 159:
                    this.zzaqa.zzahi = (int) j;
                    return;
                case 176:
                    this.zzaqa.width = (int) j;
                    return;
                case 179:
                    this.zzaqi.add(zzea(j));
                    return;
                case 186:
                    this.zzaqa.height = (int) j;
                    return;
                case 215:
                    this.zzaqa.number = (int) j;
                    return;
                case 231:
                    this.zzaqh = zzea(j);
                    return;
                case 241:
                    if (this.zzaqk) {
                        return;
                    }
                    this.zzaqj.add(j);
                    this.zzaqk = true;
                    return;
                case 251:
                    this.zzare = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzhv(sb3.toString());
                case 17029:
                    if (j < 1 || j > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j);
                        sb4.append(" not supported");
                        throw new zzhv(sb4.toString());
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzhv(sb5.toString());
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzhv(sb6.toString());
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzhv(sb7.toString());
                case 21420:
                    this.zzaqd = j + this.zzapx;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzaqa.zzahf = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzaqa.zzahf = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzaqa.zzahf = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzaqa.zzahf = 3;
                        return;
                    }
                case 21680:
                    this.zzaqa.zzaro = (int) j;
                    return;
                case 21682:
                    this.zzaqa.zzarq = (int) j;
                    return;
                case 21690:
                    this.zzaqa.zzarp = (int) j;
                    return;
                case 21930:
                    this.zzaqa.zzasl = j == 1;
                    return;
                case 22186:
                    this.zzaqa.zzasi = j;
                    return;
                case 22203:
                    this.zzaqa.zzasj = j;
                    return;
                case 25188:
                    this.zzaqa.zzash = (int) j;
                    return;
                case 2352003:
                    this.zzaqa.zzarj = (int) j;
                    return;
                case 2807729:
                    this.zzapy = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.zzaqa.zzaru = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.zzaqa.zzaru = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.zzaqa.zzart = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.zzaqa.zzart = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.zzaqa.zzart = 3;
                            return;
                        case 21947:
                            this.zzaqa.zzarr = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                this.zzaqa.zzars = 1;
                                return;
                            } else if (i5 == 9) {
                                this.zzaqa.zzars = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                this.zzaqa.zzars = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzaqa.zzarv = (int) j;
                            return;
                        case 21949:
                            this.zzaqa.zzarw = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzaqa.zzahj = (int) d;
        } else if (i == 17545) {
            this.zzapz = (long) d;
        } else {
            switch (i) {
                case 21969:
                    this.zzaqa.zzarx = (float) d;
                    return;
                case 21970:
                    this.zzaqa.zzary = (float) d;
                    return;
                case 21971:
                    this.zzaqa.zzarz = (float) d;
                    return;
                case 21972:
                    this.zzaqa.zzasa = (float) d;
                    return;
                case 21973:
                    this.zzaqa.zzasb = (float) d;
                    return;
                case 21974:
                    this.zzaqa.zzasc = (float) d;
                    return;
                case 21975:
                    this.zzaqa.zzasd = (float) d;
                    return;
                case 21976:
                    this.zzaqa.zzase = (float) d;
                    return;
                case 21977:
                    this.zzaqa.zzasf = (float) d;
                    return;
                case 21978:
                    this.zzaqa.zzasg = (float) d;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzhv {
        if (i == 134) {
            this.zzaqa.zzari = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            zzkq.zza(this.zzaqa, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhv(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fc, code lost:
        throw new com.google.android.gms.internal.ads.zzhv("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(int r20, int r21, com.google.android.gms.internal.ads.zzjy r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkl.zza(int, int, com.google.android.gms.internal.ads.zzjy):void");
    }

    private final void zza(zzkq zzkqVar, long j) {
        int i;
        byte[] zzbk;
        if ("S_TEXT/UTF8".equals(zzkqVar.zzari)) {
            byte[] bArr = this.zzaps.data;
            long j2 = this.zzaqn;
            if (j2 == -9223372036854775807L) {
                zzbk = zzaph;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                zzbk = zzpq.zzbk(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * i)) / 1000))));
            }
            System.arraycopy(zzbk, 0, bArr, 19, 12);
            zzkg zzkgVar = zzkqVar.zzasm;
            zzpk zzpkVar = this.zzaps;
            zzkgVar.zza(zzpkVar, zzpkVar.limit());
            this.zzarc += this.zzaps.limit();
        }
        zzkqVar.zzasm.zza(j, this.zzaqt, this.zzarc, 0, zzkqVar.zzarm);
        this.zzard = true;
        zzgs();
    }

    private final void zzgs() {
        this.zzaqu = 0;
        this.zzarc = 0;
        this.zzarb = 0;
        this.zzaqv = false;
        this.zzaqw = false;
        this.zzaqy = false;
        this.zzara = 0;
        this.zzaqz = (byte) 0;
        this.zzaqx = false;
        this.zzapr.reset();
    }

    private final void zzb(zzjy zzjyVar, int i) throws IOException, InterruptedException {
        if (this.zzapo.limit() >= i) {
            return;
        }
        if (this.zzapo.capacity() < i) {
            zzpk zzpkVar = this.zzapo;
            zzpkVar.zzc(Arrays.copyOf(zzpkVar.data, Math.max(this.zzapo.data.length << 1, i)), this.zzapo.limit());
        }
        zzjyVar.readFully(this.zzapo.data, this.zzapo.limit(), i - this.zzapo.limit());
        this.zzapo.zzbn(i);
    }

    private final void zza(zzjy zzjyVar, zzkq zzkqVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzkqVar.zzari)) {
            int length = zzapg.length + i;
            if (this.zzaps.capacity() < length) {
                this.zzaps.data = Arrays.copyOf(zzapg, length + i);
            }
            zzjyVar.readFully(this.zzaps.data, zzapg.length, i);
            this.zzaps.zzbo(0);
            this.zzaps.zzbn(length);
            return;
        }
        zzkg zzkgVar = zzkqVar.zzasm;
        if (!this.zzaqv) {
            if (zzkqVar.zzark) {
                this.zzaqt &= -1073741825;
                if (!this.zzaqw) {
                    zzjyVar.readFully(this.zzapo.data, 0, 1);
                    this.zzaqu++;
                    if ((this.zzapo.data[0] & 128) == 128) {
                        throw new zzhv("Extension bit is set in signal byte");
                    }
                    this.zzaqz = this.zzapo.data[0];
                    this.zzaqw = true;
                }
                byte b = this.zzaqz;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzaqt |= 1073741824;
                    if (!this.zzaqx) {
                        zzjyVar.readFully(this.zzapt.data, 0, 8);
                        this.zzaqu += 8;
                        this.zzaqx = true;
                        this.zzapo.data[0] = (byte) ((z ? 128 : 0) | 8);
                        this.zzapo.zzbo(0);
                        zzkgVar.zza(this.zzapo, 1);
                        this.zzarc++;
                        this.zzapt.zzbo(0);
                        zzkgVar.zza(this.zzapt, 8);
                        this.zzarc += 8;
                    }
                    if (z) {
                        if (!this.zzaqy) {
                            zzjyVar.readFully(this.zzapo.data, 0, 1);
                            this.zzaqu++;
                            this.zzapo.zzbo(0);
                            this.zzara = this.zzapo.readUnsignedByte();
                            this.zzaqy = true;
                        }
                        int i3 = this.zzara << 2;
                        this.zzapo.reset(i3);
                        zzjyVar.readFully(this.zzapo.data, 0, i3);
                        this.zzaqu += i3;
                        short s = (short) ((this.zzara / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzapv;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.zzapv = ByteBuffer.allocate(i4);
                        }
                        this.zzapv.position(0);
                        this.zzapv.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.zzara;
                            if (i5 >= i2) {
                                break;
                            }
                            int zzjd = this.zzapo.zzjd();
                            if (i5 % 2 == 0) {
                                this.zzapv.putShort((short) (zzjd - i6));
                            } else {
                                this.zzapv.putInt(zzjd - i6);
                            }
                            i5++;
                            i6 = zzjd;
                        }
                        int i7 = (i - this.zzaqu) - i6;
                        if (i2 % 2 == 1) {
                            this.zzapv.putInt(i7);
                        } else {
                            this.zzapv.putShort((short) i7);
                            this.zzapv.putInt(0);
                        }
                        this.zzapu.zzc(this.zzapv.array(), i4);
                        zzkgVar.zza(this.zzapu, i4);
                        this.zzarc += i4;
                    }
                }
            } else if (zzkqVar.zzarl != null) {
                this.zzapr.zzc(zzkqVar.zzarl, zzkqVar.zzarl.length);
            }
            this.zzaqv = true;
        }
        int limit = i + this.zzapr.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzkqVar.zzari) && !"V_MPEGH/ISO/HEVC".equals(zzkqVar.zzari)) {
            while (true) {
                int i8 = this.zzaqu;
                if (i8 >= limit) {
                    break;
                }
                zza(zzjyVar, zzkgVar, limit - i8);
            }
        } else {
            byte[] bArr = this.zzapn.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = zzkqVar.zzasn;
            int i10 = 4 - zzkqVar.zzasn;
            while (this.zzaqu < limit) {
                int i11 = this.zzarb;
                if (i11 == 0) {
                    int min = Math.min(i9, this.zzapr.zziy());
                    zzjyVar.readFully(bArr, i10 + min, i9 - min);
                    if (min > 0) {
                        this.zzapr.zze(bArr, i10, min);
                    }
                    this.zzaqu += i9;
                    this.zzapn.zzbo(0);
                    this.zzarb = this.zzapn.zzjd();
                    this.zzapm.zzbo(0);
                    zzkgVar.zza(this.zzapm, 4);
                    this.zzarc += 4;
                } else {
                    this.zzarb = i11 - zza(zzjyVar, zzkgVar, i11);
                }
            }
        }
        if ("A_VORBIS".equals(zzkqVar.zzari)) {
            this.zzapp.zzbo(0);
            zzkgVar.zza(this.zzapp, 4);
            this.zzarc += 4;
        }
    }

    private final int zza(zzjy zzjyVar, zzkg zzkgVar, int i) throws IOException, InterruptedException {
        int zza;
        int zziy = this.zzapr.zziy();
        if (zziy > 0) {
            zza = Math.min(i, zziy);
            zzkgVar.zza(this.zzapr, zza);
        } else {
            zza = zzkgVar.zza(zzjyVar, i, false);
        }
        this.zzaqu += zza;
        this.zzarc += zza;
        return zza;
    }

    private final long zzea(long j) throws zzhv {
        long j2 = this.zzapy;
        if (j2 == -9223372036854775807L) {
            throw new zzhv("Can't scale timecode prior to timecodeScale being set.");
        }
        return zzpq.zza(j, j2, 1000L);
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }
}
