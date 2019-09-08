package top.blogcode.common.core;

import lombok.Data;

/**
 * 请求对象
 */
@Data
public class PageRequest {
    private Integer pageSize;
    private Integer currentPage;
}
