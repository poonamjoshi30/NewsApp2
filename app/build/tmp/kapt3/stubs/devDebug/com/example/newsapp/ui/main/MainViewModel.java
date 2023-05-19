package com.example.newsapp.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000fH\u0002J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nJ\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0006\u0010)\u001a\u00020!R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019\u00a8\u0006*"}, d2 = {"Lcom/example/newsapp/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/newsapp/network/repository/INewsRepository;", "networkHelper", "Lcom/example/newsapp/utils/NetworkHelper;", "coroutinesDispatcherProvider", "Lcom/example/newsapp/di/CoroutinesDispatcherProvider;", "(Lcom/example/newsapp/network/repository/INewsRepository;Lcom/example/newsapp/utils/NetworkHelper;Lcom/example/newsapp/di/CoroutinesDispatcherProvider;)V", "TAG", "", "_errorMessage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_newsResponse", "Lcom/example/newsapp/state/NetworkState;", "Lcom/example/newsapp/data/model/NewsResponse;", "errorMessage", "Lkotlinx/coroutines/flow/StateFlow;", "getErrorMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "feedNewsPage", "", "getFeedNewsPage", "()I", "setFeedNewsPage", "(I)V", "feedResponse", "newsResponse", "getNewsResponse", "totalPage", "getTotalPage", "setTotalPage", "convertPublishedDate", "", "currentResponse", "fetchNews", "countryCode", "formatDate", "strCurrentDate", "handleFeedNewsResponse", "response", "hideErrorToast", "app_devDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.newsapp.network.repository.INewsRepository repository = null;
    private final com.example.newsapp.utils.NetworkHelper networkHelper = null;
    private final com.example.newsapp.di.CoroutinesDispatcherProvider coroutinesDispatcherProvider = null;
    private final java.lang.String TAG = "MainViewModel";
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _errorMessage = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.newsapp.state.NetworkState<com.example.newsapp.data.model.NewsResponse>> _newsResponse = null;
    private com.example.newsapp.data.model.NewsResponse feedResponse;
    private int feedNewsPage = 1;
    private int totalPage = 1;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.network.repository.INewsRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.newsapp.utils.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.example.newsapp.di.CoroutinesDispatcherProvider coroutinesDispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.newsapp.state.NetworkState<com.example.newsapp.data.model.NewsResponse>> getNewsResponse() {
        return null;
    }
    
    public final int getFeedNewsPage() {
        return 0;
    }
    
    public final void setFeedNewsPage(int p0) {
    }
    
    public final int getTotalPage() {
        return 0;
    }
    
    public final void setTotalPage(int p0) {
    }
    
    public final void fetchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    private final com.example.newsapp.state.NetworkState<com.example.newsapp.data.model.NewsResponse> handleFeedNewsResponse(com.example.newsapp.state.NetworkState<com.example.newsapp.data.model.NewsResponse> response) {
        return null;
    }
    
    private final void convertPublishedDate(com.example.newsapp.data.model.NewsResponse currentResponse) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String strCurrentDate) {
        return null;
    }
    
    public final void hideErrorToast() {
    }
}