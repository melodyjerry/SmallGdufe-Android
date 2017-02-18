package com.guang.app.api;

import com.guang.app.AppConfig;
import com.guang.app.model.HttpResult;
import com.guang.app.model.Score;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by xiaoguang on 2017/2/14.
 */
public interface JwApi {

    @POST(AppConfig.Url.getScore)
    Observable<HttpResult< List<Score> >> getScore();

//    Call<WrapperEntity<Score>> getScore(@Path("sno") String sno, @Path("pwd") String pwd);

}