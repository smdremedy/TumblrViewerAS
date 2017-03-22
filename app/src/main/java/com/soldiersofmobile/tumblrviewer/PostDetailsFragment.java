package com.soldiersofmobile.tumblrviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostDetailsFragment extends Fragment {

    public static final String POST_URL_ARGS = "url";
    @BindView(R.id.webview) WebView webview;

    public PostDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post_details, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(
            final View view,
            @Nullable final Bundle savedInstanceState
    ) {
        webview.loadUrl(getArguments().getString(POST_URL_ARGS));
    }

    public static PostDetailsFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString(POST_URL_ARGS, url);
        PostDetailsFragment fragment = new PostDetailsFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
