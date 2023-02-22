package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcls {
    private List<Map<String, String>> zzgfs = new ArrayList();
    private boolean zzgft = false;
    private boolean zzgfu = false;
    private String zzgfv;
    private zzcln zzgfw;

    public zzcls(String str, zzcln zzclnVar) {
        this.zzgfv = str;
        this.zzgfw = zzclnVar;
    }

    public final synchronized void zzgj(String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            Map<String, String> zzaow = zzaow();
            zzaow.put("action", "adapter_init_started");
            zzaow.put("ancn", str);
            this.zzgfs.add(zzaow);
        }
    }

    public final synchronized void zzgk(String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            Map<String, String> zzaow = zzaow();
            zzaow.put("action", "adapter_init_finished");
            zzaow.put("ancn", str);
            this.zzgfs.add(zzaow);
        }
    }

    public final synchronized void zzr(String str, String str2) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            Map<String, String> zzaow = zzaow();
            zzaow.put("action", "adapter_init_finished");
            zzaow.put("ancn", str);
            zzaow.put("rqe", str2);
            this.zzgfs.add(zzaow);
        }
    }

    public final synchronized void zzaou() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            if (!this.zzgft) {
                Map<String, String> zzaow = zzaow();
                zzaow.put("action", "init_started");
                this.zzgfs.add(zzaow);
                this.zzgft = true;
            }
        }
    }

    public final synchronized void zzaov() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqc)).booleanValue()) {
            if (!this.zzgfu) {
                Map<String, String> zzaow = zzaow();
                zzaow.put("action", "init_finished");
                this.zzgfs.add(zzaow);
                for (Map<String, String> map : this.zzgfs) {
                    this.zzgfw.zzn(map);
                }
                this.zzgfu = true;
            }
        }
    }

    private final Map<String, String> zzaow() {
        Map<String, String> zzaos = this.zzgfw.zzaos();
        zzaos.put("tms", Long.toString(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime(), 10));
        zzaos.put("tid", this.zzgfv);
        return zzaos;
    }
}
