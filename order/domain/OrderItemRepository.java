package com.msa.shop.order.domain;//package com.msa.shop.order.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderLine, Long> {
}
