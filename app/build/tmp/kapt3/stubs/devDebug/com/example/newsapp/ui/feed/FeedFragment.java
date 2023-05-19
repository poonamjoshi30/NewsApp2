package com.example.newsapp.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/newsapp/ui/feed/FeedFragment;", "Lcom/example/newsapp/base/BaseFragment;", "Lcom/example/newsapp/databinding/FragmentFeedBinding;", "()V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "mainViewModel", "Lcom/example/newsapp/ui/main/MainViewModel;", "getMainViewModel", "()Lcom/example/newsapp/ui/main/MainViewModel;", "setMainViewModel", "(Lcom/example/newsapp/ui/main/MainViewModel;)V", "newsAdapter", "Lcom/example/newsapp/ui/adapter/NewsAdapter;", "onScrollListener", "Lcom/example/newsapp/utils/EndlessRecyclerOnScrollListener;", "hideBottomPadding", "", "hideErrorMessage", "hideProgressBar", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setBinding", "setupObservers", "setupRecyclerView", "setupUI", "showErrorMessage", "message", "showProgressBar", "app_devDebug"})
public final class FeedFragment extends com.example.newsapp.base.BaseFragment<com.example.newsapp.databinding.FragmentFeedBinding> {
    private com.example.newsapp.utils.EndlessRecyclerOnScrollListener onScrollListener;
    public com.example.newsapp.ui.main.MainViewModel mainViewModel;
    private com.example.newsapp.ui.adapter.NewsAdapter newsAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String countryCode = "us";
    
    public FeedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.newsapp.databinding.FragmentFeedBinding setBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.newsapp.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.ui.main.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupObservers() {
    }
    
    private final void showProgressBar() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showErrorMessage(java.lang.String message) {
    }
    
    private final void hideErrorMessage() {
    }
    
    private final void hideBottomPadding() {
    }
}