package com.yupi.springbootinit.model.vo;

import lombok.Data;

/**
 * ClassName: BiResponse
 * Package: com.yupi.springbootinit.model.vo
 * Description: Bi的返回结果
 *
 * @Author lilray
 * @Create 2023/12/24 11:17
 * @Version 1.0
 */
@Data
public class BiResponse {
    private String genChart;

    private String genResult;

    private Long chartId;

}
