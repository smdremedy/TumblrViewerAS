package com.soldiersofmobile.tumblrviewer;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

import com.soldiersofmobile.tumblrviewer.model.Post;
import com.soldiersofmobile.tumblrviewer.model.PostsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsListFragment extends ListFragment {

    public static final String URL_ARG = "url";

    @Override
    public void onViewCreated(
            final View view,
            final Bundle savedInstanceState
    ) {
        super.onViewCreated(view, savedInstanceState);

        setEmptyText("No posts found!");
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.tumblr.com")
                .build();
        TumblrApi tumblrApi = retrofit.create(TumblrApi.class);
        String blogUrl = getArguments().getString(URL_ARG);
        Call<PostsResponse> call = tumblrApi.getPosts(blogUrl, 20, 0);
        call.enqueue(new Callback<PostsResponse>() {
            @Override
            public void onResponse(
                    final Call<PostsResponse> call,
                    final Response<PostsResponse> response
            ) {

                if (response.isSuccessful()) {
                    PostsResponse postsResponse = response.body();
                    for (Post post : postsResponse.getResponse().getPosts()) {
                        Log.d("TAG", post.toString());
                    }
                    PostsAdapter adapter = new PostsAdapter();
                    adapter.addAll(postsResponse.getResponse().getPosts());

                    setListAdapter(adapter);
                }
            }

            @Override
            public void onFailure(
                    final Call<PostsResponse> call,
                    final Throwable t
            ) {

            }
        });
    }

    public static PostsListFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString(URL_ARG, url);
        PostsListFragment fragment = new PostsListFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
