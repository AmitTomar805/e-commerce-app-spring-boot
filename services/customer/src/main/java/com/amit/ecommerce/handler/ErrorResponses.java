package com.amit.ecommerce.handler;

import java.util.Map;

public record ErrorResponses(
        Map<String,String> errors
) {
}
