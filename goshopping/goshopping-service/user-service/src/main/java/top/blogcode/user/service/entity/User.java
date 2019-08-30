package top.blogcode.user.service.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("user")
public class User {
    @TableId(value = "user_id",type = IdType.ID_WORKER)
    private Long user_id;
    private String user_account;
    private String user_pass;
    private String user_avatar;
    private Integer user_Phone;
    @TableField(value = "register_time",fill= FieldFill.INSERT)
    private LocalDateTime register_time;
    private Long role_id;
}
