package msh.intercept;

import java.io.IOException;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2019/03/26
 * version: 1.0
 */

public class HelpInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request.setRequest(request.getRequest() + "HelpInterceptor------");
        Response response = chain.proceed(request);
        response.setResponse(response.getResponse() + "HelpInterceptor------");

        System.out.println( "HelpInterceptor------");
        return response;
    }
}
