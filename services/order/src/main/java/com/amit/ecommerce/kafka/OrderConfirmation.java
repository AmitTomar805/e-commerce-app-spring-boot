package com.amit.ecommerce.kafka;
import com.amit.ecommerce.customer.CustomerResponse;
import com.amit.ecommerce.order.PaymentMethod;
import com.amit.ecommerce.product.PurchaseResponse;
import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
