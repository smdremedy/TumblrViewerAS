package com.soldiersofmobile.tumblrviewer;

import com.soldiersofmobile.tumblrviewer.model.PostsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TumblrApi {

    @GET("/v2/blog/{blogUrl}/posts?api_key=fD0HOvNDa2z10uyozPZNnjeb4fEFGVGm58zttH6cXSe4K0qC64")
    Call<PostsResponse> getPosts(@Path("blogUrl") String blogUrl,
                                 @Query("limit") int limit,
                                 @Query("offset") int offset);

}
