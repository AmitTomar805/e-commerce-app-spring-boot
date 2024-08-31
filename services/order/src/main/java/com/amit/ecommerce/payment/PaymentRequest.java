package com.amit.ecommerce.payment;

import com.amit.ecommerce.customer.CustomerResponse;
import com.amit.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}