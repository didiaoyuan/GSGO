package top.blogcode.user.service.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import top.blogcode.common.core.BaseEntity;

import java.time.LocalDateTime;

@Data
@TableName("user")
public class User extends BaseEntity {
    @TableId(value = "user_id",type = IdType.ID_WORKER)
    private Long user_id;
    @TableField(value = "user_account")
    private String user_account;
    private String user_pass;
    private String user_avatar;
    private Integer user_phone;
    @TableField(value = "role_id")
    private Long role_id;
}
