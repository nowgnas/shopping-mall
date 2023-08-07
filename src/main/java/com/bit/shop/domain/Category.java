package com.bit.shop.domain;

import com.bit.shop.domain.keys.SingleKey;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class Category extends BaseEntity<SingleKey<Long>> {

    private final String name;
    private final int level;
    private final Long parentId;
}
