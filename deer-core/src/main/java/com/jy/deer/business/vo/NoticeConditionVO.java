package com.jy.deer.business.vo;

import com.jy.deer.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class NoticeConditionVO extends BaseConditionVO  implements Serializable {
	private static final long serialVersionUID = -1L;
	private String status;
}

