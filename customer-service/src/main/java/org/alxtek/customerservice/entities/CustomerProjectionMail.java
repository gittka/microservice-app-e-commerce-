package org.alxtek.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mail", types = {Customer.class})
public interface CustomerProjectionMail {
    String getEmail();
}
