package orgs.androidtown.basic2;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by JisangYou on 2017-10-31.
 */

public interface IRetro_ {
    // 리턴타입 함수명(인자)
    @POST("sendNotification")
    Call<ResponseBody> sendNotification(@Body RequestBody postdata);
}