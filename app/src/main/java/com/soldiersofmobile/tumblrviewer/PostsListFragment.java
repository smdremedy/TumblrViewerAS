package com.soldiersofmobile.tumblrviewer;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import com.soldiersofmobile.tumblrviewer.model.Post;
import com.soldiersofmobile.tumblrviewer.model.PostsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsListFragment extends ListFragment {

    public static final String URL_ARG = "url";
    private PostsAdapter adapter;

    @Override
    public void onViewCreated(
            final View view,
            final Bundle savedInstanceState
    ) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new PostsAdapter();

        GlideBuilder glideBuilder = new GlideBuilder(getContext());
        glideBuilder.setDiskCache(new DiskLruCacheFactory("glide", 20000000));
        //glideBuilder.
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

    @Override
    public void onListItemClick(
            final ListView l,
            final View v,
            final int position,
            final long id
    ) {
        Post post = adapter.getItem(position);
        showPostListener.showPost(post.getPostUrl());
    }

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        showPostListener = (ShowPostListener) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        showPostListener = null;
    }

    public static PostsListFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString(URL_ARG, url);
        PostsListFragment fragment = new PostsListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private ShowPostListener showPostListener;


    interface ShowPostListener {
        void showPost(String url);
    }
}
