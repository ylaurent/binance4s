package com.deliganli.binance4s.rest.http

import java.net.http.HttpClient
import java.time.Duration

object JDKHttpClient {

  def default: HttpClient = {
    HttpClient
      .newBuilder()
      .connectTimeout(Duration.ofSeconds(20))
      .build()
  }
}
