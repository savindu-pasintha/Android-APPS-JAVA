package com.example.wts.utils;

import android.os.Environment;

import java.io.File;

public class Common {

        public static final int GRID_COUNT = 2;

        private static String pathApiLevel30 = "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses/";
        private static String pathApiLevel30Bellow = "/WhatsApp/Media/.Statuses/";
        public static String APP_DIR="/SavedStatus";

        public static String getCorrectPath(){
             String pc = Environment.getExternalStorageDirectory() + File.separator;
                String correctPath = null;
                if(new File(pc+pathApiLevel30).isDirectory()){
                    correctPath = pc+pathApiLevel30;
                }else if(new File(pc+pathApiLevel30Bellow).isDirectory()){
                        correctPath = pc+pathApiLevel30Bellow;
                }
                return correctPath;
        }

        public static final File STATUS_DIRECTORY = new File(getCorrectPath());
}

