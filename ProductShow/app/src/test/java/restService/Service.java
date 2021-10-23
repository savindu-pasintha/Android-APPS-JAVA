package restService;

import android.util.Log;

import java.io.IOException;

import modelsPkg.EndPointsUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Service {
    OkHttpClient client = new OkHttpClient();

    public String dataGetRequest(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        Log.i("two",new Service().dataGetRequest(new EndPointsUrl().getAllProductsDetailsUrl()));
        Log.i("one",new Service().dataGetRequest(new EndPointsUrl().getSingleProductDetailsUrl()));
    }
}
