package myapp.tae.ac.uk.androidlifecyclechecker;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import junit.framework.Test;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karma on 01/02/16.
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {
    private List<String> list = new ArrayList<>();
    private Context context;

    public TestAdapter(Context context) {
        this.context = context;
        addListItems();
    }

    private void addListItems() {
        String listItem = "List item ";
        list.clear();
        for (int i = 0; i < 10; i++) {
            list.add(listItem + i);
        }
    }

    @Override
    public TestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TestAdapter.ViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivDetete;
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            ivDetete = (ImageView) itemView.findViewById(R.id.ivDelete);
            textView = (TextView) itemView.findViewById(R.id.tvListItem);
        }
    }
}
