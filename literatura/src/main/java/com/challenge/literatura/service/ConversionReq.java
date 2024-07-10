package literatura.src.main.java.com.challenge.literatura.service;

import com.google.gson.Gson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;

public class ConversionReq {

    public ConversionReq(String json) {


        Gson gson = new GsonBuilder()

                .create();

        ReqFilter reqfilter = gson.fromJson(json, ReqFilter.class);
        ReqFinal ok = new ReqFinal(reqfilter);


    }


}
