package aybars.arslan.fragmentornek;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyFragment extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
        Log.i("-----", "onAttach methodu - FRAGMENT");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        Log.i("-----", "onCreate methodu - FRAGMENT");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        Log.i("-----", "onCreateView methodu - FRAGMENT");
        return inflater.inflate(R.layout.my_fragment_layout, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        Log.i("-----", "onActivityCreated methodu - FRAGMENT");
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.i("-----", "onStart methodu - FRAGMENT");
    }

    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.i("-----", "onResume methodu - FRAGMENT");
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.i("-----", "onPause methodu - FRAGMENT");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
        Log.i("-----", "onSaveInstanceState methodu - FRAGMENT");
    }

    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.i("-----", "onStop methodu - FRAGMENT");
    }

    @Override
    public void onDestroyView() {
        // TODO Auto-generated method stub
        super.onDestroyView();
        Log.i("-----", "onDestroyView methodu - FRAGMENT");
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.i("-----", "onDestroy methodu - FRAGMENT");
    }

}