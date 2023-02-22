package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzilq uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzeke {
    public static final zzeke zzili = new zzeke("DOUBLE", 0, zzekh.DOUBLE, 1);
    public static final zzeke zzilj = new zzeke("FLOAT", 1, zzekh.FLOAT, 5);
    public static final zzeke zzilk = new zzeke("INT64", 2, zzekh.LONG, 0);
    public static final zzeke zzill = new zzeke("UINT64", 3, zzekh.LONG, 0);
    public static final zzeke zzilm = new zzeke("INT32", 4, zzekh.INT, 0);
    public static final zzeke zziln = new zzeke("FIXED64", 5, zzekh.LONG, 1);
    public static final zzeke zzilo = new zzeke("FIXED32", 6, zzekh.INT, 5);
    public static final zzeke zzilp = new zzeke("BOOL", 7, zzekh.BOOLEAN, 0);
    public static final zzeke zzilq;
    public static final zzeke zzilr;
    public static final zzeke zzils;
    public static final zzeke zzilt;
    public static final zzeke zzilu;
    public static final zzeke zzilv;
    public static final zzeke zzilw;
    public static final zzeke zzilx;
    public static final zzeke zzily;
    public static final zzeke zzilz;
    private static final /* synthetic */ zzeke[] zzimc;
    private final zzekh zzima;
    private final int zzimb;

    public static zzeke[] values() {
        return (zzeke[]) zzimc.clone();
    }

    private zzeke(String str, int i, zzekh zzekhVar, int i2) {
        this.zzima = zzekhVar;
        this.zzimb = i2;
    }

    public final zzekh zzbii() {
        return this.zzima;
    }

    public final int zzbij() {
        return this.zzimb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeke(String str, int i, zzekh zzekhVar, int i2, zzekb zzekbVar) {
        this(str, i, zzekhVar, i2);
    }

    static {
        final zzekh zzekhVar = zzekh.STRING;
        zzilq = new zzeke("STRING", 8, zzekhVar, 2) { // from class: com.google.android.gms.internal.ads.zzekd
        };
        final zzekh zzekhVar2 = zzekh.MESSAGE;
        zzilr = new zzeke("GROUP", 9, zzekhVar2, 3) { // from class: com.google.android.gms.internal.ads.zzekg
        };
        final zzekh zzekhVar3 = zzekh.MESSAGE;
        zzils = new zzeke("MESSAGE", 10, zzekhVar3, 2) { // from class: com.google.android.gms.internal.ads.zzekf
        };
        final zzekh zzekhVar4 = zzekh.BYTE_STRING;
        zzilt = new zzeke("BYTES", 11, zzekhVar4, 2) { // from class: com.google.android.gms.internal.ads.zzeki
        };
        zzilu = new zzeke("UINT32", 12, zzekh.INT, 0);
        zzilv = new zzeke("ENUM", 13, zzekh.ENUM, 0);
        zzilw = new zzeke("SFIXED32", 14, zzekh.INT, 5);
        zzilx = new zzeke("SFIXED64", 15, zzekh.LONG, 1);
        zzily = new zzeke("SINT32", 16, zzekh.INT, 0);
        zzeke zzekeVar = new zzeke("SINT64", 17, zzekh.LONG, 0);
        zzilz = zzekeVar;
        zzimc = new zzeke[]{zzili, zzilj, zzilk, zzill, zzilm, zziln, zzilo, zzilp, zzilq, zzilr, zzils, zzilt, zzilu, zzilv, zzilw, zzilx, zzily, zzekeVar};
    }
}
