package top.blogcode.user.service.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long userId;
    private String userAccount;
    private String avatar;
    private Integer userPhone;
    private LocalDateTime register_time;
    private Long roleId;
}
