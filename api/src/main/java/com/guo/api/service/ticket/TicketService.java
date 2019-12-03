package com.guo.api.service.ticket;

import java.util.List;

public interface TicketService {
    Long createTicket(String key, Object... objects);
    List<Object> sellTicket(String key, Long sum);
}
