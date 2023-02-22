package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdlp {
    private boolean zzbnu;
    private zzvj zzbpb;
    private zzadm zzdla;
    private zzair zzdrn;
    private zzxi zzhbs;
    private zzaac zzhbt;
    private zzvc zzhbu;
    private String zzhbv;
    private ArrayList<String> zzhbw;
    private ArrayList<String> zzhbx;
    private zzvm zzhby;
    private PublisherAdViewOptions zzhbz;
    private zzxc zzhca;
    private int zzgra = 1;
    private zzdlc zzhcc = new zzdlc();
    private boolean zzgso = false;

    public final zzdlp zzh(zzvc zzvcVar) {
        this.zzhbu = zzvcVar;
        return this;
    }

    public final zzvc zzasr() {
        return this.zzhbu;
    }

    public final zzdlp zze(zzvj zzvjVar) {
        this.zzbpb = zzvjVar;
        return this;
    }

    public final zzdlp zzbo(boolean z) {
        this.zzgso = z;
        return this;
    }

    public final zzvj zzke() {
        return this.zzbpb;
    }

    public final zzdlp zzc(zzxi zzxiVar) {
        this.zzhbs = zzxiVar;
        return this;
    }

    public final zzdlp zzgt(String str) {
        this.zzhbv = str;
        return this;
    }

    public final String zzass() {
        return this.zzhbv;
    }

    public final zzdlp zzc(zzaac zzaacVar) {
        this.zzhbt = zzaacVar;
        return this;
    }

    public final zzdlc zzast() {
        return this.zzhcc;
    }

    public final zzdlp zzbp(boolean z) {
        this.zzbnu = z;
        return this;
    }

    public final zzdlp zzec(int i) {
        this.zzgra = i;
        return this;
    }

    public final zzdlp zzc(ArrayList<String> arrayList) {
        this.zzhbw = arrayList;
        return this;
    }

    public final zzdlp zzd(ArrayList<String> arrayList) {
        this.zzhbx = arrayList;
        return this;
    }

    public final zzdlp zzb(zzadm zzadmVar) {
        this.zzdla = zzadmVar;
        return this;
    }

    public final zzdlp zzb(zzvm zzvmVar) {
        this.zzhby = zzvmVar;
        return this;
    }

    public final zzdlp zzb(zzair zzairVar) {
        this.zzdrn = zzairVar;
        this.zzhbt = new zzaac(false, true, false);
        return this;
    }

    public final zzdlp zzb(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzhbz = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zzbnu = publisherAdViewOptions.getManualImpressionsEnabled();
            this.zzhca = publisherAdViewOptions.zzjt();
        }
        return this;
    }

    public final zzdlp zzc(zzdln zzdlnVar) {
        this.zzhcc.zza(zzdlnVar.zzhcb);
        this.zzhbu = zzdlnVar.zzhbu;
        this.zzbpb = zzdlnVar.zzbpb;
        this.zzhbs = zzdlnVar.zzhbs;
        this.zzhbv = zzdlnVar.zzhbv;
        this.zzhbt = zzdlnVar.zzhbt;
        this.zzhbw = zzdlnVar.zzhbw;
        this.zzhbx = zzdlnVar.zzhbx;
        this.zzdla = zzdlnVar.zzdla;
        this.zzhby = zzdlnVar.zzhby;
        zzdlp zzb = zzb(zzdlnVar.zzhbz);
        zzb.zzgso = zzdlnVar.zzgso;
        return zzb;
    }

    public final zzdln zzasu() {
        Preconditions.checkNotNull(this.zzhbv, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzbpb, "ad size must not be null");
        Preconditions.checkNotNull(this.zzhbu, "ad request must not be null");
        return new zzdln(this);
    }

    public final boolean zzasv() {
        return this.zzgso;
    }

    public static /* synthetic */ zzvj zza(zzdlp zzdlpVar) {
        return zzdlpVar.zzbpb;
    }

    public static /* synthetic */ String zzb(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbv;
    }

    public static /* synthetic */ zzxi zzc(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbs;
    }

    public static /* synthetic */ ArrayList zzd(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbw;
    }

    public static /* synthetic */ ArrayList zze(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbx;
    }

    public static /* synthetic */ zzvm zzf(zzdlp zzdlpVar) {
        return zzdlpVar.zzhby;
    }

    public static /* synthetic */ int zzg(zzdlp zzdlpVar) {
        return zzdlpVar.zzgra;
    }

    public static /* synthetic */ PublisherAdViewOptions zzh(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbz;
    }

    public static /* synthetic */ zzxc zzi(zzdlp zzdlpVar) {
        return zzdlpVar.zzhca;
    }

    public static /* synthetic */ zzair zzj(zzdlp zzdlpVar) {
        return zzdlpVar.zzdrn;
    }

    public static /* synthetic */ zzdlc zzk(zzdlp zzdlpVar) {
        return zzdlpVar.zzhcc;
    }

    public static /* synthetic */ boolean zzl(zzdlp zzdlpVar) {
        return zzdlpVar.zzgso;
    }

    public static /* synthetic */ zzvc zzm(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbu;
    }

    public static /* synthetic */ boolean zzn(zzdlp zzdlpVar) {
        return zzdlpVar.zzbnu;
    }

    public static /* synthetic */ zzaac zzo(zzdlp zzdlpVar) {
        return zzdlpVar.zzhbt;
    }

    public static /* synthetic */ zzadm zzp(zzdlp zzdlpVar) {
        return zzdlpVar.zzdla;
    }
}
