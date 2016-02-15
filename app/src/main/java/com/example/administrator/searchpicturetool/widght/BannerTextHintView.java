package com.example.administrator.searchpicturetool.widght;

import android.content.Context;

import com.example.administrator.searchpicturetool.model.bean.Banner;
import com.jude.rollviewpager.hintview.TextHintView;

import java.util.List;

/**
 * Created by Administrator on 2016/2/15 0015.
 */
public class BannerTextHintView extends TextHintView{
    List<Banner> banners;
    public BannerTextHintView(Context context,List<Banner> banners) {
        super(context);
        this.banners =banners;
    }

    @Override
    public void setCurrent(int current) {
        setText(" "+(current+1)+"/"+banners.size()+"  "+banners.get(current).getIntroduce());
    }
}
