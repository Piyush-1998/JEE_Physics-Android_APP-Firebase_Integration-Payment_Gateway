package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzmc;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzlk {
    private static final int zzayt = zzpq.zzbl("nam");
    private static final int zzayu = zzpq.zzbl("trk");
    private static final int zzayv = zzpq.zzbl("cmt");
    private static final int zzayw = zzpq.zzbl("day");
    private static final int zzayx = zzpq.zzbl("ART");
    private static final int zzayy = zzpq.zzbl("too");
    private static final int zzayz = zzpq.zzbl("alb");
    private static final int zzaza = zzpq.zzbl("com");
    private static final int zzazb = zzpq.zzbl("wrt");
    private static final int zzazc = zzpq.zzbl("lyr");
    private static final int zzazd = zzpq.zzbl("gen");
    private static final int zzaze = zzpq.zzbl("covr");
    private static final int zzazf = zzpq.zzbl("gnre");
    private static final int zzazg = zzpq.zzbl("grp");
    private static final int zzazh = zzpq.zzbl("disk");
    private static final int zzazi = zzpq.zzbl("trkn");
    private static final int zzazj = zzpq.zzbl("tmpo");
    private static final int zzazk = zzpq.zzbl("cpil");
    private static final int zzazl = zzpq.zzbl("aART");
    private static final int zzazm = zzpq.zzbl("sonm");
    private static final int zzazn = zzpq.zzbl("soal");
    private static final int zzazo = zzpq.zzbl("soar");
    private static final int zzazp = zzpq.zzbl("soaa");
    private static final int zzazq = zzpq.zzbl("soco");
    private static final int zzazr = zzpq.zzbl("rtng");
    private static final int zzazs = zzpq.zzbl("pgap");
    private static final int zzazt = zzpq.zzbl("sosn");
    private static final int zzazu = zzpq.zzbl("tvsh");
    private static final int zzazv = zzpq.zzbl("----");
    private static final String[] zzazw = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static zzmc.zza zzd(zzpk zzpkVar) {
        int position = zzpkVar.getPosition() + zzpkVar.readInt();
        int readInt = zzpkVar.readInt();
        int i = readInt >>> 24;
        zzmj zzmjVar = null;
        try {
            if (i == 169 || i == 65533) {
                int i2 = 16777215 & readInt;
                if (i2 == zzayv) {
                    int readInt2 = zzpkVar.readInt();
                    if (zzpkVar.readInt() == zzkr.zzavt) {
                        zzpkVar.zzbp(8);
                        String zzbq = zzpkVar.zzbq(readInt2 - 16);
                        zzmjVar = new zzmi("und", zzbq, zzbq);
                    } else {
                        String valueOf = String.valueOf(zzkr.zzas(readInt));
                        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return zzmjVar;
                }
                if (i2 != zzayt && i2 != zzayu) {
                    if (i2 != zzaza && i2 != zzazb) {
                        if (i2 == zzayw) {
                            return zza(readInt, "TDRC", zzpkVar);
                        }
                        if (i2 == zzayx) {
                            return zza(readInt, "TPE1", zzpkVar);
                        }
                        if (i2 == zzayy) {
                            return zza(readInt, "TSSE", zzpkVar);
                        }
                        if (i2 == zzayz) {
                            return zza(readInt, "TALB", zzpkVar);
                        }
                        if (i2 == zzazc) {
                            return zza(readInt, "USLT", zzpkVar);
                        }
                        if (i2 == zzazd) {
                            return zza(readInt, "TCON", zzpkVar);
                        }
                        if (i2 == zzazg) {
                            return zza(readInt, "TIT1", zzpkVar);
                        }
                    }
                    return zza(readInt, "TCOM", zzpkVar);
                }
                return zza(readInt, "TIT2", zzpkVar);
            } else if (readInt == zzazf) {
                int zze = zze(zzpkVar);
                String str = (zze <= 0 || zze > zzazw.length) ? null : zzazw[zze - 1];
                if (str != null) {
                    zzmjVar = new zzmm("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzmjVar;
            } else if (readInt == zzazh) {
                return zzb(readInt, "TPOS", zzpkVar);
            } else {
                if (readInt == zzazi) {
                    return zzb(readInt, "TRCK", zzpkVar);
                }
                if (readInt == zzazj) {
                    return zza(readInt, "TBPM", zzpkVar, true, false);
                }
                if (readInt == zzazk) {
                    return zza(readInt, "TCMP", zzpkVar, true, true);
                }
                if (readInt == zzaze) {
                    int readInt3 = zzpkVar.readInt();
                    if (zzpkVar.readInt() == zzkr.zzavt) {
                        int zzar = zzkr.zzar(zzpkVar.readInt());
                        String str2 = zzar == 13 ? "image/jpeg" : zzar == 14 ? "image/png" : null;
                        if (str2 == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(zzar);
                            Log.w("MetadataUtil", sb.toString());
                        } else {
                            zzpkVar.zzbp(4);
                            int i3 = readInt3 - 16;
                            byte[] bArr = new byte[i3];
                            zzpkVar.zze(bArr, 0, i3);
                            zzmjVar = new zzmg(str2, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzmjVar;
                } else if (readInt == zzazl) {
                    return zza(readInt, "TPE2", zzpkVar);
                } else {
                    if (readInt == zzazm) {
                        return zza(readInt, "TSOT", zzpkVar);
                    }
                    if (readInt == zzazn) {
                        return zza(readInt, "TSO2", zzpkVar);
                    }
                    if (readInt == zzazo) {
                        return zza(readInt, "TSOA", zzpkVar);
                    }
                    if (readInt == zzazp) {
                        return zza(readInt, "TSOP", zzpkVar);
                    }
                    if (readInt == zzazq) {
                        return zza(readInt, "TSOC", zzpkVar);
                    }
                    if (readInt == zzazr) {
                        return zza(readInt, "ITUNESADVISORY", zzpkVar, false, false);
                    }
                    if (readInt == zzazs) {
                        return zza(readInt, "ITUNESGAPLESS", zzpkVar, false, true);
                    }
                    if (readInt == zzazt) {
                        return zza(readInt, "TVSHOWSORT", zzpkVar);
                    }
                    if (readInt == zzazu) {
                        return zza(readInt, "TVSHOW", zzpkVar);
                    }
                    if (readInt == zzazv) {
                        String str3 = null;
                        String str4 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (zzpkVar.getPosition() < position) {
                            int position2 = zzpkVar.getPosition();
                            int readInt4 = zzpkVar.readInt();
                            int readInt5 = zzpkVar.readInt();
                            zzpkVar.zzbp(4);
                            if (readInt5 == zzkr.zzavr) {
                                str3 = zzpkVar.zzbq(readInt4 - 12);
                            } else if (readInt5 == zzkr.zzavs) {
                                str4 = zzpkVar.zzbq(readInt4 - 12);
                            } else {
                                if (readInt5 == zzkr.zzavt) {
                                    i4 = position2;
                                    i5 = readInt4;
                                }
                                zzpkVar.zzbp(readInt4 - 12);
                            }
                        }
                        if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i4 != -1) {
                            zzpkVar.zzbo(i4);
                            zzpkVar.zzbp(16);
                            zzmjVar = new zzmi("und", str4, zzpkVar.zzbq(i5 - 16));
                        }
                        return zzmjVar;
                    }
                }
            }
            String valueOf2 = String.valueOf(zzkr.zzas(readInt));
            Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            zzpkVar.zzbo(position);
        }
    }

    private static zzmm zza(int i, String str, zzpk zzpkVar) {
        int readInt = zzpkVar.readInt();
        if (zzpkVar.readInt() == zzkr.zzavt) {
            zzpkVar.zzbp(8);
            return new zzmm(str, null, zzpkVar.zzbq(readInt - 16));
        }
        String valueOf = String.valueOf(zzkr.zzas(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzmj zza(int i, String str, zzpk zzpkVar, boolean z, boolean z2) {
        int zze = zze(zzpkVar);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze >= 0) {
            if (z) {
                return new zzmm(str, null, Integer.toString(zze));
            }
            return new zzmi("und", str, Integer.toString(zze));
        }
        String valueOf = String.valueOf(zzkr.zzas(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzmm zzb(int i, String str, zzpk zzpkVar) {
        int readInt = zzpkVar.readInt();
        if (zzpkVar.readInt() == zzkr.zzavt && readInt >= 22) {
            zzpkVar.zzbp(10);
            int readUnsignedShort = zzpkVar.readUnsignedShort();
            if (readUnsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(readUnsignedShort);
                String sb2 = sb.toString();
                int readUnsignedShort2 = zzpkVar.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(readUnsignedShort2);
                    sb2 = sb3.toString();
                }
                return new zzmm(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzkr.zzas(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzpk zzpkVar) {
        zzpkVar.zzbp(4);
        if (zzpkVar.readInt() == zzkr.zzavt) {
            zzpkVar.zzbp(8);
            return zzpkVar.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
