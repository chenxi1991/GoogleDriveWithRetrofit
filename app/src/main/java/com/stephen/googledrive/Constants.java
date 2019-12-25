package com.stephen.googledrive;

import android.os.Environment;

public interface Constants {

    int DIALOG_SHOW = 0x1;
    int DIALOG_CANCEL = 0x2;
    int DIALOG_SWITCH = 0x3;

    /**
     * OAuth：https://developers.google.com/identity/protocols/OpenIDConnect
     */
    String AUTH_URL = "https://accounts.google.com/o/oauth2/v2/auth?" +
            "client_id=%s&" +
            "response_type=code&" +
            "scope=https://www.googleapis.com/auth/drive+https://www.googleapis.com/auth/userinfo.profile&" +
            "redirect_uri=https://localhost/";
    String BASE_URL_API = "https://www.googleapis.com";
    String BASE_URL_ACCOUNT = "https://accounts.google.com";
    /**
     * 创建凭据：https://console.developers.google.com/apis/credentials
     */
    String CLIENT_ID = "106487215422-gleo6gspehspo9qgge56ilecta3gacif.apps.googleusercontent.com";
    String CLIENT_SECRET = "xcu4_5IUBvu-VwuxrieIgaox";
    String REDIRECT_URI = "https://localhost/";
    String AUTH_TOKEN = "Bearer %s";
    String ROOT_DRIVE_ID = "root";

    String SDCARD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();
}
