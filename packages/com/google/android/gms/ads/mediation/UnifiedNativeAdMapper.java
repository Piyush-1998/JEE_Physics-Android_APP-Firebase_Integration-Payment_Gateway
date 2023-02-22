package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class UnifiedNativeAdMapper {
    private Bundle extras = new Bundle();
    private VideoController zzcjj;
    private String zzdrq;
    private View zzeqh;
    private boolean zzeqi;
    private String zzeqj;
    private List<NativeAd.Image> zzeqk;
    private String zzeqm;
    private String zzeqn;
    private NativeAd.Image zzeqo;
    private String zzeqq;
    private String zzeqr;
    private Double zzeqv;
    private View zzeqw;
    private Object zzeqx;
    private boolean zzeqy;
    private boolean zzeqz;
    private float zzera;

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void setHeadline(String str) {
        this.zzeqj = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzeqk = list;
    }

    public final void setBody(String str) {
        this.zzdrq = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzeqo = image;
    }

    public final void setCallToAction(String str) {
        this.zzeqm = str;
    }

    public final void setAdvertiser(String str) {
        this.zzeqn = str;
    }

    public final void setStarRating(Double d) {
        this.zzeqv = d;
    }

    public final void setStore(String str) {
        this.zzeqq = str;
    }

    public final void setPrice(String str) {
        this.zzeqr = str;
    }

    public final void zza(VideoController videoController) {
        this.zzcjj = videoController;
    }

    public void setHasVideoContent(boolean z) {
        this.zzeqi = z;
    }

    public void setAdChoicesContent(View view) {
        this.zzeqw = view;
    }

    public void setMediaView(View view) {
        this.zzeqh = view;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzera = f;
    }

    public final void zzn(Object obj) {
        this.zzeqx = obj;
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzeqy = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzeqz = z;
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

    public final NativeAd.Image getIcon() {
        return this.zzeqo;
    }

    public final String getCallToAction() {
        return this.zzeqm;
    }

    public final String getAdvertiser() {
        return this.zzeqn;
    }

    public final Double getStarRating() {
        return this.zzeqv;
    }

    public final String getStore() {
        return this.zzeqq;
    }

    public final String getPrice() {
        return this.zzeqr;
    }

    public final VideoController getVideoController() {
        return this.zzcjj;
    }

    public boolean hasVideoContent() {
        return this.zzeqi;
    }

    public View getAdChoicesContent() {
        return this.zzeqw;
    }

    public final View zzadd() {
        return this.zzeqh;
    }

    public float getMediaContentAspectRatio() {
        return this.zzera;
    }

    public final Object zzjv() {
        return this.zzeqx;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzeqy;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzeqz;
    }
}
