package com.github.armstrong.touchnews.view;

import com.github.armstrong.touchnews.javaBean.MusicEntity;

import java.util.List;

/**
 * Created by cchao on 2016/4/19.
 * E-mail:   cchao1024@163.com
 * Description:
 */
public interface IMusicView {
        void onMusicPlay();
        void onMusicPause();
        void onResumePlay();
        void onMusicPrepare ( MusicEntity curMusic );
        void setAlbum();
        void updateSearchList(List<String> result);
}
