package ingenium.simplequizapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Yazdani on 4/8/2017.
 */

public class GridViewAdapter extends BaseAdapter {

    String[] mytext;
    int[] myimg;
    Context ct;

    private LayoutInflater inflater=null;

   public GridViewAdapter(MainActivity main,String[] text,int [] img){

       ct=main;
       mytext=text;
       myimg=img;
       inflater=(LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mytext.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class Myholder{

        ImageView ctimg;
        TextView cttext;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Myholder holder=new Myholder();
        View ctview=inflater.inflate(R.layout.custom_list,null);
        holder.cttext=(TextView)ctview.findViewById(R.id.easy_grid_text);
        holder.ctimg=(ImageView)ctview.findViewById(R.id.image_esy_card);
        holder.cttext.setText(mytext[i]);
        holder.ctimg.setImageResource(myimg[i]);
        return ctview;
    }



}
