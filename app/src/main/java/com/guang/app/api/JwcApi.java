package com.guang.app.api;

import com.guang.app.AppConfig;
import com.guang.app.model.HttpResult;
import com.guang.app.model.XiaoLi;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by xiaoguang on 2017/2/14.
 */
public interface JwcApi {

    @POST(AppConfig.Url.getXiaoLi)
    Observable<HttpResult<XiaoLi>> getXiaoLi();

//    Call<WrapperEntity<Score>> getScore(@Path("sno") String sno, @Path("pwd") String pwd);

}