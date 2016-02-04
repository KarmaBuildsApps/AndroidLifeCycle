package myapp.tae.ac.uk.androidlifecyclechecker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Karma on 02/02/16.
 */
public class FragmentMain extends Fragment {
    RecyclerView rcList;
    TestAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_holder, container, false);
        adapter = new TestAdapter(getActivity());
        rcList = (RecyclerView) view.findViewById(R.id.rcSwipeToDelete);
        rcList.setLayoutManager(new LinearLayoutManager(getContext()));
        rcList.setAdapter(adapter);
        return view;
    }
}
