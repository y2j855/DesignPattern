package com.tony.dp.observer.wechat.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 12:16
 * Description:
 */
@Data
@AllArgsConstructor
public class WeChatNotice {

    private String publisher;
    private String articleName;
}
