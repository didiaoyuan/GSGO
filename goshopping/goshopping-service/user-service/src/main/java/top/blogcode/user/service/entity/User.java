package top.blogcode.user.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("user")
public class User {
    private Long user_id;
    private String user_account;
    private String user_pass;
    private String user_avatar;
    private Integer user_Phone;
    private LocalDateTime register_time;
    private Long role_id;
}
