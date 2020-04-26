package com.ultimatepda.engine.util;

//import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
//import com.google.api.client.auth.oauth2.AuthorizationCodeResponseUrl;
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.extensions.appengine.auth.oauth2.AbstractAppEngineAuthorizationCodeCallbackServlet;
//import com.google.api.client.extensions.appengine.auth.oauth2.AbstractAppEngineAuthorizationCodeServlet;
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.http.GenericUrl;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.client.util.store.FileDataStoreFactory;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Collections;

public class GoogleApiAccess {
//    /** Global instance of the HTTP transport. */
//    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
//    /**
//     * Global instance of the {@link FileDataStoreFactory}. */
//    private static FileDataStoreFactory DATA_STORE_FACTORY;
//
//    /** Global instance of the JSON factory. */
//    private static final JsonFactory JSON_FACTORY =
//            JacksonFactory.getDefaultInstance();
//
//    public class CalendarAppEngineSample extends AbstractAppEngineAuthorizationCodeServlet {
//
//        @Override
//        protected void doGet(HttpServletRequest request, HttpServletResponse response)
//                throws IOException {
//            // do stuff
//        }
//
//        @Override
//        protected String getRedirectUri(HttpServletRequest req) throws ServletException, IOException {
//            return Utils.getRedirectUri(req);
//        }
//
//        @Override
//        protected AuthorizationCodeFlow initializeFlow() throws IOException {
//            return Utils.newFlow();
//        }
//    }
//
//    static class Utils {
//        static String getRedirectUri(HttpServletRequest req) {
//            GenericUrl url = new GenericUrl(req.getRequestURL().toString());
//            url.setRawPath("/oauth2callback");
//            return url.build();
//        }
//
//        static GoogleAuthorizationCodeFlow newFlow() throws IOException {
//            return new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
//                    null, null).setDataStoreFactory(
//                    DATA_STORE_FACTORY).setAccessType("offline").build();
//        }
////        static GoogleAuthorizationCodeFlow newFlow() throws IOException {
////            return new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
////                    getClientCredential(), Collections.singleton(CalendarScopes.CALENDAR)).setDataStoreFactory(
////                    DATA_STORE_FACTORY).setAccessType("offline").build();
////        }
//    }
//
//    public class OAuth2Callback extends AbstractAppEngineAuthorizationCodeCallbackServlet {
//
//        private static final long serialVersionUID = 1L;
//
//        @Override
//        protected void onSuccess(HttpServletRequest req, HttpServletResponse resp, Credential credential)
//                throws ServletException, IOException {
//            resp.sendRedirect("/");
//        }
//
////        @Override
////        protected void onError(
////                HttpServletRequest req, HttpServletResponse resp, AuthorizationCodeResponseUrl errorResponse)
////                throws ServletException, IOException {
////            String nickname = UserServiceFactory.getUserService().getCurrentUser().getNickname();
////            resp.getWriter().print("<h3>" + nickname + ", why don't you want to play with me?</h1>");
////            resp.setStatus(200);
////            resp.addHeader("Content-Type", "text/html");
////        }
//
//        @Override
//        protected String getRedirectUri(HttpServletRequest req) throws ServletException, IOException {
//            return Utils.getRedirectUri(req);
//        }
//
//        @Override
//        protected AuthorizationCodeFlow initializeFlow() throws IOException {
//            return Utils.newFlow();
//        }
//    }
}
