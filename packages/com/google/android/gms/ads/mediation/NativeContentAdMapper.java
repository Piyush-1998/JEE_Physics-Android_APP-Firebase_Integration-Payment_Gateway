package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public class NativeContentAdMapper extends NativeAdMapper {
    private String zzdrq;
    private String zzeqj;
    private List<NativeAd.Image> zzeqk;
    private NativeAd.Image zzeql;
    private String zzeqm;
    private String zzeqn;

    public final void setHeadline(String str) {
        this.zzeqj = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzeqk = list;
    }

    public final void setBody(String str) {
        this.zzdrq = str;
    }

    public final void setLogo(NativeAd.Image image) {
        this.zzeql = image;
    }

    public final void setCallToAction(String str) {
        this.zzeqm = str;
    }

    public final void setAdvertiser(String str) {
        this.zzeqn = str;
    }

    public final String getHeadline() {
        return this.zzeqj;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzeqk;
    }

    public final String getBody() {
        return this.zzdrq;
    }

    public final NativeAd.Image getLogo() {
        return this.zzeql;
    }

    public final String getCallToAction() {
        return this.zzeqm;
    }

    public final String getAdvertiser() {
        return this.zzeqn;
    }
}
