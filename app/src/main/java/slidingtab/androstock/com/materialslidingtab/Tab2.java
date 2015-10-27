package slidingtab.androstock.com.materialslidingtab;

// This project was created by Ferdousur Rahman Shajib
// www.androstock.com
// You use this project anytime, anywhere. There is no copywrite issue.

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ferdousur Rahman Shajib on 27-10-2015.
 */
public class Tab2 extends Fragment {
    Activity activity;
    Button button2;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_2,container,false);

        activity = getActivity();
        button2 =(Button) v.findViewById(R.id.buttonTab2);
        button2.setText("www.google.com");



        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }

        });

        return v;
    }





}