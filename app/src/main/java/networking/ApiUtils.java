package networking;

public class ApiUtils {

//    public static String BASE_URL = "http://192.168.5.143/diagnostic-app/index.php/";
    public static String BASE_URL = "http://tasolglobal.com/quiz_app/";


    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}

