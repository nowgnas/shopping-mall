package com.bit.shop.sql;

public interface CouponQuery {
    String INSERT = "INSERT INTO coupon (member_id, name, discount_policy, discount_value, is_used) VALUES (?,?,?,?,?)";
    String SELECTALL = "SELECT * FROM coupon";
    String DELETE = "DELETE FROM coupon where id=?";
}
