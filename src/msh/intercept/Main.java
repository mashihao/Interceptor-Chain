package msh.intercept;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2019/03/26
 * version: 1.0
 */

public class Main {

    public static void main(String[] args) throws IOException {


        List<Interceptor> interceptors = new ArrayList<>();

        interceptors.add(new LoginInterceptor());
        interceptors.add(new HelpInterceptor());
        interceptors.add(new NetInterceptor());

        Request request = new Request();
        request.setRequest("hello first");
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(interceptors, 0, request);

        Response response = realInterceptorChain.proceed(request);
        if (response == null) {
            System.out.println("null");
        }

        System.out.println(response.toString() + " fdsafas");

    }
}
