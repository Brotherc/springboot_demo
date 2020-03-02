package com.brotherc.springbootweb.config;

//@Configuration
//@ConditionalOnClass({HttpClient.class})
//@EnableConfigurationProperties(HttpClientProperties.class)
//public class HttpClientAutoConfiguration {
//
//	private final HttpClientProperties properties;
//
//	public HttpClientAutoConfiguration(HttpClientProperties properties){
//		this.properties = properties;
//	}
//
//	/**
//	 * httpclient bean 的定义
//	 * @return
//	 */
//	@Bean
//	@ConditionalOnMissingBean(HttpClient.class)
//	public HttpClient httpClient(){
//		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(properties.getConnectTimeOut())
//				.setSocketTimeout(properties.getSocketTimeOut()).build();//构建requestConfig
//		HttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).setUserAgent(properties.getAgent())
//				.setMaxConnPerRoute(properties.getMaxConnPerRoute()).setConnectionReuseStrategy(new NoConnectionReuseStrategy()).build();
//		return client;
//	}
//}
