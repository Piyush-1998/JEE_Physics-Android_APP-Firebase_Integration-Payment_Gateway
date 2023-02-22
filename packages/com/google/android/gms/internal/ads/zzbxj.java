package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbxj {
    private final zzdiw zzfpu;
    private final Set<zzbys<zzut>> zzftu;
    private final Set<zzbys<zzbsu>> zzftv;
    private final Set<zzbys<zzbtm>> zzftw;
    private final Set<zzbys<zzbuo>> zzftx;
    private final Set<zzbys<zzbuj>> zzfty;
    private final Set<zzbys<zzbsz>> zzftz;
    private final Set<zzbys<zzbti>> zzfua;
    private final Set<zzbys<AdMetadataListener>> zzfub;
    private final Set<zzbys<AppEventListener>> zzfuc;
    private final Set<zzbys<zzbuy>> zzfud;
    private zzbsx zzfue;
    private zzcud zzfuf;

    private zzbxj(zza zzaVar) {
        this.zzftu = zzaVar.zzftu;
        this.zzftw = zzaVar.zzftw;
        this.zzftx = zzaVar.zzftx;
        this.zzftv = zzaVar.zzftv;
        this.zzfty = zzaVar.zzfty;
        this.zzftz = zzaVar.zzftz;
        this.zzfua = zzaVar.zzfua;
        this.zzfub = zzaVar.zzfub;
        this.zzfuc = zzaVar.zzfuc;
        this.zzfud = zzaVar.zzfui;
        this.zzfpu = zzaVar.zzfpu;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzdiw zzfpu;
        private Set<zzbys<zzut>> zzftu = new HashSet();
        private Set<zzbys<zzbsu>> zzftv = new HashSet();
        private Set<zzbys<zzbtm>> zzftw = new HashSet();
        private Set<zzbys<zzbuo>> zzftx = new HashSet();
        private Set<zzbys<zzbuj>> zzfty = new HashSet();
        private Set<zzbys<zzbsz>> zzftz = new HashSet();
        private Set<zzbys<AdMetadataListener>> zzfub = new HashSet();
        private Set<zzbys<AppEventListener>> zzfuc = new HashSet();
        private Set<zzbys<zzbti>> zzfua = new HashSet();
        private Set<zzbys<zzbuy>> zzfui = new HashSet();

        public final zza zza(zzbsu zzbsuVar, Executor executor) {
            this.zzftv.add(new zzbys<>(zzbsuVar, executor));
            return this;
        }

        public final zza zza(zzbuj zzbujVar, Executor executor) {
            this.zzfty.add(new zzbys<>(zzbujVar, executor));
            return this;
        }

        public final zza zza(zzbsz zzbszVar, Executor executor) {
            this.zzftz.add(new zzbys<>(zzbszVar, executor));
            return this;
        }

        public final zza zza(zzbti zzbtiVar, Executor executor) {
            this.zzfua.add(new zzbys<>(zzbtiVar, executor));
            return this;
        }

        public final zza zza(AdMetadataListener adMetadataListener, Executor executor) {
            this.zzfub.add(new zzbys<>(adMetadataListener, executor));
            return this;
        }

        public final zza zza(AppEventListener appEventListener, Executor executor) {
            this.zzfuc.add(new zzbys<>(appEventListener, executor));
            return this;
        }

        public final zza zza(zzxc zzxcVar, Executor executor) {
            if (this.zzfuc != null) {
                zzcxl zzcxlVar = new zzcxl();
                zzcxlVar.zzb(zzxcVar);
                this.zzfuc.add(new zzbys<>(zzcxlVar, executor));
            }
            return this;
        }

        public final zza zza(zzut zzutVar, Executor executor) {
            this.zzftu.add(new zzbys<>(zzutVar, executor));
            return this;
        }

        public final zza zza(zzbtm zzbtmVar, Executor executor) {
            this.zzftw.add(new zzbys<>(zzbtmVar, executor));
            return this;
        }

        public final zza zza(zzbuo zzbuoVar, Executor executor) {
            this.zzftx.add(new zzbys<>(zzbuoVar, executor));
            return this;
        }

        public final zza zza(zzbuy zzbuyVar, Executor executor) {
            this.zzfui.add(new zzbys<>(zzbuyVar, executor));
            return this;
        }

        public final zza zza(zzdiw zzdiwVar) {
            this.zzfpu = zzdiwVar;
            return this;
        }

        public final zzbxj zzake() {
            return new zzbxj(this);
        }
    }

    public final Set<zzbys<zzbsu>> zzajt() {
        return this.zzftv;
    }

    public final Set<zzbys<zzbuj>> zzaju() {
        return this.zzfty;
    }

    public final Set<zzbys<zzbsz>> zzajv() {
        return this.zzftz;
    }

    public final Set<zzbys<zzbti>> zzajw() {
        return this.zzfua;
    }

    public final Set<zzbys<AdMetadataListener>> zzajx() {
        return this.zzfub;
    }

    public final Set<zzbys<AppEventListener>> zzajy() {
        return this.zzfuc;
    }

    public final Set<zzbys<zzut>> zzajz() {
        return this.zzftu;
    }

    public final Set<zzbys<zzbtm>> zzaka() {
        return this.zzftw;
    }

    public final Set<zzbys<zzbuo>> zzakb() {
        return this.zzftx;
    }

    public final Set<zzbys<zzbuy>> zzakc() {
        return this.zzfud;
    }

    public final zzdiw zzakd() {
        return this.zzfpu;
    }

    public final zzbsx zzc(Set<zzbys<zzbsz>> set) {
        if (this.zzfue == null) {
            this.zzfue = new zzbsx(set);
        }
        return this.zzfue;
    }

    public final zzcud zza(Clock clock, zzcuf zzcufVar) {
        if (this.zzfuf == null) {
            this.zzfuf = new zzcud(clock, zzcufVar);
        }
        return this.zzfuf;
    }
}
