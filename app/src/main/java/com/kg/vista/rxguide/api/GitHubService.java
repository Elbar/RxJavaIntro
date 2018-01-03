package com.kg.vista.rxguide.api;

import com.kg.vista.rxguide.model.GitHubRepo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

        @GET("users/{user}/starred")
        Observable<List<GitHubRepo>>
        getStarredRepositories(@Path("user") String userName);
    }