package com.example.fragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.main_rv);
        //نعمل مصفوفة بسيطة
        ArrayList<Name>names = new ArrayList<>();
        names.add(new Name("Saif"));
        names.add(new Name("Ahmedf"));
        names.add(new Name("Ali"));
        names.add(new Name("hassain"));
        NameAdapter adapter = new NameAdapter(names, new OnItemClickListener(){
            @Override
            public  void OnItemClick(Name name){
                  Toast.makeText(MainActivity.this, name.getName(), Toast.LENGTH_SHORT).show();//يطبع الاسم الذي ضغطنا عليه

                //كود ارسال البينات من اكتفتي الى فراكمنت

                Bundle bundle = new Bundle();
                bundle.putString("name", name.getName());//عملية ارسال البيانت
                NameFragment fragment = new NameFragment();
                fragment.setArguments(bundle);
                //نهاية كود ارسال البينات من اكتفتي الى فراكمنت

                //كود عرض الفراكمنت فقط


                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                NameFragment fragmentx = new NameFragment();// نعمل اوبجكت
                ft.replace(R.id.main_fragment,fragmentx);
                ft.commit();

//                NameFragment fragmentx = new NameFragment();
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.main_fragment,fragmentx);
//                ft.commit();
//                //نهاية كود عرض الفراكمنت



            }
        });
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
