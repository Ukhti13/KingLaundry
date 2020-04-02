package com.example.kinglaundry;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.security.PublicKey;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.icon_one,
            R.drawable.icon_two,
            R.drawable.icon_three,
    };

    public String[] slide_heading = {
            "MARI BERSINERGI DENGAN KING LAUNDRY",
            "SEGERA DAFTAR DAN NIKMATI BERBAGAI FITUR MENARIK",
            "TUNGGU APA LAGI? SEGERA DAFTAR KING LAUNDRY"
    };

    public String[] slide_desc = {
            "Aplikasi King Laundry dapat digunakan oleh Kasir\n" +
                    "Laundry , Aplikasi ini memedahkan transaksi\n" +
                    "Kasir dengan pelanggan",
            "Langkah Pertama. Silahkan Daftar sebagai Kasir \n" +
                    "Laundry. Sehingga Akun tersebut dapat digunakan\n" +
                    "oleh kasir laundry anda ",
            "Langkah Pertama. Silahkan Daftar sebagai Kasir \n" +
                    "Laundry. Sehingga Akun tersebut dapat digunakan\n" +
                    "oleh kasir laundry anda "

    };


    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView sLideImagesView = (ImageView) view.findViewById(R.id.slide_images);
        TextView sLideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView sLideDescription = (TextView) view.findViewById(R.id.slide_desc);

        sLideImagesView.setImageResource(slide_images[position]);
        sLideHeading.setText(slide_heading[position]);
        sLideDescription.setText(slide_desc[position]);

        container.addView(view);



        return view;
    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);

    }
}
