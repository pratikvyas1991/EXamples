package networking;

import org.json.JSONObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface SOService {

    @GET("Url")
    Call<ResponseBody> getScoreBoardget(@Query("user") String str);

    @FormUrlEncoded
    @POST("webservice")
    Call<ResponseBody> getScoreBoard(@Field("reqObject") JSONObject jsonObject);

    @FormUrlEncoded
    @POST("webservice")
    Call<ResponseBody> addScore(@Field("reqObject") JSONObject jsonObject);

    /*@Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @GET("api/get_countries")
    Call<CountryPojo> getCountries();

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/login")
    Call<LoginPojo> getLogin(
            @Field("email") String email,
            @Field("password") String password,
            @Field("device_type") String device_type,
            @Field("device_id") String device_id);

    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @GET("api/get_login_user/{user_id}")
    Call<LoginPojo> getLoginUsersData(@Path("user_id") int user_id);

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/profile/profile_list")
    Call<ModelProfileList> getProfileList(
            @Field("user_id") int user_id);

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/get_user_detail_by_unique_code")
    Call<OtherUserProfilesPojo> getOtherUserProfile(
            @Field("unique_code") String unique_code,
            @Field("opposite_unique_code") String opposite_unique_code,
            @Field("timezone") String timezone);

    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @GET("api/scan_user_list/{user_id}")
    Call<ContactsPojo> getContactsList(
            @Path("user_id") int user_id,
            @Query("timezone") String timezone);

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/profile/followers_list")
    Call<ContactsPojo> getFollowersList(
            @Field("type") String type,
            @Field("user_id") int user_id,
            @Field("page") int page);

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/profile/followers_list")
    Call<ProfileFollowerPojo> getCompanyFollowersList(
            @Field("type") String type,
            @Field("profile_id") String user_id,
            @Field("user_id") int page);

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/member/member_list")
    Call<ProfileEmpPojo> getCompanyEmployeeList(
            @Field("profile_id") String profile_id,
            @Field("user_id") String user_id,
            @Field("page") int page);


    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/profile/education_profile_list")
    Call<SchoolListPojo> getSchoolList();

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/member/status")
    Call<StausMessage> AcceptEmployee(
            @Field("status") String status,
            @Field("user_id") String user_id,
            @Field("profile_id") String profileId,
            @Field("phone") JSONArray phone,
            @Field("email") JSONArray email,
            @Field("weblink") JSONArray web,
            @Field("fax") JSONArray fax);


    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/profile/profile_view")
    Call<EmployeeDetailView> getEmployeeInfo(
            @Field("profile_id") String profile_id,
            @Field("user_id") String user_id,
            @Field("type") String type);

    @FormUrlEncoded
    @Headers("abcd_ACCESS_KEY: " + ApiUtils.abcd_ACCESS_KEY)
    @POST("api/web/invite_employee")
    Call<InviteabcdPojo> invite_employee(
            @Field("email") String email,
            @Field("message") String message);*/
}