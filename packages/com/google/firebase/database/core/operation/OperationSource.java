package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.view.QueryParams;

/* loaded from: classes.dex */
public class OperationSource {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final QueryParams queryParams;
    private final Source source;
    private final boolean tagged;
    public static final OperationSource USER = new OperationSource(Source.User, null, false);
    public static final OperationSource SERVER = new OperationSource(Source.Server, null, false);

    /* loaded from: classes.dex */
    private enum Source {
        User,
        Server
    }

    public static OperationSource forServerTaggedQuery(QueryParams queryParams) {
        return new OperationSource(Source.Server, queryParams, true);
    }

    public OperationSource(Source source, QueryParams queryParams, boolean z) {
        this.source = source;
        this.queryParams = queryParams;
        this.tagged = z;
    }

    public boolean isFromUser() {
        return this.source == Source.User;
    }

    public boolean isFromServer() {
        return this.source == Source.Server;
    }

    public boolean isTagged() {
        return this.tagged;
    }

    public String toString() {
        return "OperationSource{source=" + this.source + ", queryParams=" + this.queryParams + ", tagged=" + this.tagged + '}';
    }

    public QueryParams getQueryParams() {
        return this.queryParams;
    }
}
