package top.blogcode.user.service.entity;

import top.blogcode.common.core.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 9999
 * @since 2019-09-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Permission extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long permissionId;

    private String permissionName;

    private Integer permissionStatus;

    private Integer permissionType;

    private Long roleId;


}
