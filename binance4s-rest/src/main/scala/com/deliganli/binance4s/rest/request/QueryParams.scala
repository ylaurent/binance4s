package com.deliganli.binance4s.rest.request

import com.deliganli.binance4s.common.consts._
import org.http4s._
import org.joda.time.{DateTime, Instant}

object QueryParams {

  object Formatters {
    // format: off
    implicit val dateTimeEncoder: QueryParamEncoder[DateTime]                        = QueryParamEncoder[String].contramap(_.getMillis.toString)
    implicit val depthLimitEncoder: QueryParamEncoder[DepthLimit]                    = QueryParamEncoder[String].contramap(_.value.toString)
    implicit val klineIntervalEncoder: QueryParamEncoder[KlineInterval]              = QueryParamEncoder[String].contramap(_.entryName)
    implicit val instantEncoder: QueryParamEncoder[Instant]                          = QueryParamEncoder[String].contramap(_.getMillis.toString)
    implicit val orderSideEncoder: QueryParamEncoder[OrderSide]                      = QueryParamEncoder[String].contramap(_.entryName)
    implicit val orderTypeEncoder: QueryParamEncoder[OrderType]                      = QueryParamEncoder[String].contramap(_.entryName)
    implicit val timeInForceEncoder: QueryParamEncoder[TimeInForce]                  = QueryParamEncoder[String].contramap(_.entryName)
    implicit val bigDecimalEncoder: QueryParamEncoder[BigDecimal]                    = QueryParamEncoder[String].contramap(_.toString)
    // format: on
  }

  object Keys {
    val symbol               = "symbol"
    val limit                = "limit"
    val interval             = "interval"
    val startTime            = "startTime"
    val endTime              = "endTime"
    val recvWindow           = "recvWindow"
    val fromId               = "fromId"
    val timestamp            = "timestamp"
    val side                 = "side"
    val orderType            = "type"
    val timeInForce          = "timeInForce"
    val quantity             = "quantity"
    val quoteOrderQty        = "quoteOrderQty"
    val price                = "price"
    val orderId              = "orderId"
    val orderClientId        = "orderClientId"
    val newClientOrderId     = "newClientOrderId"
    val origClientOrderId    = "origClientOrderId"
    val listClientOrderId    = "listClientOrderId"
    val limitClientOrderId   = "limitClientOrderId"
    val limitIcebergQty      = "limitIcebergQty"
    val orderListId          = "orderListId"
    val stopClientOrderId    = "stopClientOrderId"
    val stopLimitPrice       = "stopLimitPrice"
    val stopIcebergQty       = "stopIcebergQty"
    val stopLimitTimeInForce = "stopLimitTimeInForce"
    val stopPrice            = "stopPrice"
    val icebergQty           = "icebergQty"
    val newOrderRespType     = "newOrderRespType"
    val listenKey            = "listenKey"
    val signature            = "signature"
  }
}
