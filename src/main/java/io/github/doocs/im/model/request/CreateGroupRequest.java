package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.doocs.im.model.group.GroupInfo;

/**
 * @author bingo
 * @since 2021/8/1 11:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGroupRequest extends GroupInfo {

}
