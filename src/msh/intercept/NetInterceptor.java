package msh.intercept;

import java.io.IOException;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2019/03/26
 * version: 1.0
 */

public class NetInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request.setRequest(request.getRequest() + "NetInterceptor------");
        Response response = chain.proceed(request);
        response.setResponse(response.getResponse() + "NetInterceptor------");
        System.out.println("NetInterceptor------");
        return response;
    }
}
