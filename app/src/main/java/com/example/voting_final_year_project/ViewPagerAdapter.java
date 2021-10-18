package com.example.voting_final_year_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int images[] ={

            R.drawable.admin_logo,
            R.drawable.registration_logo,
            R.drawable.login_logo,
            R.drawable.voting_logo
    };

    int headings[] = {

            R.string.heading_one,
            R.string.heading_two,
            R.string.heading_three,
            R.string.heading_fourth
    };

    int description[] = {
            R.string.desc_one,
            R.string.desc_two,
            R.string.desc_three,
            R.string.desc_fourth
    };
    private Object object;

    public ViewPagerAdapter(Context context){

        this.context = context;

    }

    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view , @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container , int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService ( context.LAYOUT_INFLATER_SERVICE );
        View view = layoutInflater.inflate ( R.layout.slider_layout,container,false );

        ImageView slidetitleimage = (ImageView) view.findViewById ( R.id.titleImage );
        TextView slideHeading = (TextView) view.findViewById ( R.id.texttitle );
        TextView slideDescription = (TextView) view.findViewById ( R.id.textdescription );

        slidetitleimage.setImageResource ( images [position] );
        slideHeading.setText ( headings[position] );
        slideDescription.setText ( description[position] );

        container.addView ( view );
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container , int position , @NonNull Object object) {
        container.removeView (( LinearLayout ) object);
    }
}
