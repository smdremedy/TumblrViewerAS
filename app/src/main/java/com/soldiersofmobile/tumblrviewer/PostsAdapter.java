package com.soldiersofmobile.tumblrviewer;

import java.util.ArrayList;
import java.util.List;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.soldiersofmobile.tumblrviewer.model.Photo;
import com.soldiersofmobile.tumblrviewer.model.Post;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostsAdapter extends BaseAdapter {

    private List<Post> posts = new ArrayList<>();

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Post getItem(final int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(final int position) {
        return position;
    }

    @Override
    public View getView(
            final int position,
            final View convertView,
            final ViewGroup parent
    ) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.item_post, parent, false);
            view.setTag(new ViewHolder(view));
        }
        Post post = getItem(position);
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        viewHolder.itemText.setText(Html.fromHtml(post.getCaption()));
        List<Photo> photos = post.getPhotos();
        if (!photos.isEmpty()) {
            Glide.with(parent.getContext())
                    .load(photos.get(0).getOriginalSize().getUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(viewHolder.itemImage);
        }
        return view;
    }

    public void addAll(List<Post> newPosts) {
        posts.addAll(newPosts);
        notifyDataSetChanged();
    }

    static class ViewHolder {

        @BindView(R.id.item_image) ImageView itemImage;
        @BindView(R.id.item_text) TextView itemText;

        ViewHolder(View view) {ButterKnife.bind(this, view);}
    }
}
