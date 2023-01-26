/*
 * CommercialCreditAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.experian.sandboxusapi;

import com.experian.sandboxusapi.controllers.CreditRiskCustomerInsightController;
import com.experian.sandboxusapi.controllers.OAuthAuthorizationController;
import com.experian.sandboxusapi.http.client.HttpCallback;
import com.experian.sandboxusapi.http.client.HttpClientConfiguration;
import com.experian.sandboxusapi.http.client.ReadonlyHttpClientConfiguration;
import com.experian.sandboxusapi.models.OAuthToken;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class CommercialCreditAPIClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private CreditRiskCustomerInsightController creditRiskCustomerInsight;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * ResourceOwnerAuthManager.
     */
    private ResourceOwnerAuthManager resourceOwnerAuthManager;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;


    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private CommercialCreditAPIClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, String oAuthClientId,
            String oAuthClientSecret, String oAuthUsername, String oAuthPassword,
            OAuthToken oAuthToken, Map<String, Authentication> authentications,
            HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        if (this.authentications.containsKey("global")) {
            this.resourceOwnerAuthManager =
                    (ResourceOwnerAuthManager) this.authentications.get("global");
        }

        if (!this.authentications.containsKey("global")
                || !getResourceOwnerAuth().equals(oAuthClientId, oAuthClientSecret, oAuthUsername,
                        oAuthPassword, oAuthToken)) {
            this.resourceOwnerAuthManager = new ResourceOwnerAuthManager(oAuthClientId,
                    oAuthClientSecret, oAuthUsername, oAuthPassword, oAuthToken);
            this.authentications.put("global", resourceOwnerAuthManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .authentication(this.authentications).compatibilityFactory(compatibilityFactory)
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        this.resourceOwnerAuthManager.applyGlobalConfiguration(globalConfig);

        creditRiskCustomerInsight = new CreditRiskCustomerInsightController(globalConfig);
        oAuthAuthorization = new OAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of CreditRiskCustomerInsightController.
     * @return creditRiskCustomerInsight
     */
    public CreditRiskCustomerInsightController getCreditRiskCustomerInsightController() {
        return creditRiskCustomerInsight;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with ResourceOwnerAuth.
     * @return resourceOwnerAuth
     */
    public ResourceOwnerAuth getResourceOwnerAuth() {
        return resourceOwnerAuthManager;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://sandbox-us-api.experian.com";
            }
            if (server.equals(Server.AUTH)) {
                return "https://sandbox-us-api.experian.com";
            }
        }
        return "https://sandbox-us-api.experian.com";
    }

    /**
     * Converts this CommercialCreditAPIClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CommercialCreditAPIClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link CommercialCreditAPIClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link CommercialCreditAPIClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.oAuthClientId = getResourceOwnerAuth().getOAuthClientId();
        builder.oAuthClientSecret = getResourceOwnerAuth().getOAuthClientSecret();
        builder.oAuthUsername = getResourceOwnerAuth().getOAuthUsername();
        builder.oAuthPassword = getResourceOwnerAuth().getOAuthPassword();
        builder.oAuthToken = getResourceOwnerAuth().getOAuthToken();
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link CommercialCreditAPIClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private String oAuthClientId = "TODO: Replace";
        private String oAuthClientSecret = "TODO: Replace";
        private String oAuthUsername = "TODO: Replace";
        private String oAuthPassword = "TODO: Replace";
        private OAuthToken oAuthToken = null;
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for ResourceOwnerAuth.
         * @param oAuthClientId String value for oAuthClientId.
         * @param oAuthClientSecret String value for oAuthClientSecret.
         * @param oAuthUsername String value for oAuthUsername.
         * @param oAuthPassword String value for oAuthPassword.
         * @return Builder
         */
        public Builder resourceOwnerAuthCredentials(String oAuthClientId, String oAuthClientSecret,
                String oAuthUsername, String oAuthPassword) {
            if (oAuthClientId == null) {
                throw new NullPointerException("OAuthClientId cannot be null.");
            }
            if (oAuthClientSecret == null) {
                throw new NullPointerException("OAuthClientSecret cannot be null.");
            }
            if (oAuthUsername == null) {
                throw new NullPointerException("OAuthUsername cannot be null.");
            }
            if (oAuthPassword == null) {
                throw new NullPointerException("OAuthPassword cannot be null.");
            }
            this.oAuthClientId = oAuthClientId;
            this.oAuthClientSecret = oAuthClientSecret;
            this.oAuthUsername = oAuthUsername;
            this.oAuthPassword = oAuthPassword;
            return this;
        }

        /**
         * Credentials setter for ResourceOwnerAuth.
         * @param oAuthToken OAuthToken value for oAuthToken.
         * @return Builder
         */
        public Builder oAuthToken(OAuthToken oAuthToken) {
            this.oAuthToken = oAuthToken;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new CommercialCreditAPIClient object using the set fields.
         * @return CommercialCreditAPIClient
         */
        public CommercialCreditAPIClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new CommercialCreditAPIClient(environment, httpClient, httpClientConfig,
                    oAuthClientId, oAuthClientSecret, oAuthUsername, oAuthPassword, oAuthToken,
                    authentications, httpCallback);
        }
    }
}