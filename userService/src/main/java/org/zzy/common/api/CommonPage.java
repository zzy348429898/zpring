package org.zzy.common.api;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 通用分页数据封装类
 */
@Data
public class CommonPage<T> {
    /**
     * 当前页码
     */
    private Integer pageNum;
    /**
     * 每页数量
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总条数
     */
    private Long total;
    /**
     * 分页数据
     */
    private List<T> list;

    /**
     * 将Page转换为CommonPage
     */
    public static <T> CommonPage<T> restPage(Page<T> page) {
        CommonPage<T> result = new CommonPage<>();
        result.setTotalPage(page.getTotalPages());
        result.setPageNum(page.getNumber() + 1);
        result.setPageSize(page.getSize());
        result.setTotal(page.getTotalElements());
        result.setList(page.getContent());
        return result;
    }
}