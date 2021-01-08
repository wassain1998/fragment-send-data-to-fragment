package com.example.fragment2;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


//import android.support.v4.app.Fragment;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;




/**
 * A simple {@link Fragment} subclass.
 */
public class NameFragment extends Fragment {


    //ضمن عمليات الاستقبالX
    private String name;
    public  static final String AGR_NAME = "name";
    //Y


    public NameFragment() {
        // Required empty public constructor
    }




    //Xفتح
    //Yغلق



    //استقبال البينات المرسالة من الاكتفتي X
    //او عملية قراءة البينات


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle  bundle = getArguments();
        if(bundle !=null){
            name = bundle.getString(AGR_NAME);

        }
    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Bundle  bundle = getArguments();
//        if(bundle !=null){
//            name = bundle.getString(AGR_NAME);
//
//        }
//    }
    //y


    // تعبأة البيانت التي قرأتها من الدالة اعلاه x
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_name, container, false);
        TextView tv_name = v.findViewById(R.id.fragment_tv_name);
        tv_name.setText(name);
        return v;
    }
    //y

}
