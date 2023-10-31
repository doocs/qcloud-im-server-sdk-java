package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核主动批量审核-请求参数
 *
 * @author bingo
 * @since 2023/10/31 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchContentModerationRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1971966887350107478L;

    /**
     * 表明送审策略，取值：C2C/Group/UserInfo/GroupInfo/GroupMemberInfo/RelationChain
     * {@link io.github.doocs.im.constant.AuditNameType}
     */
    @JsonProperty("AuditName")
    private String auditName;

    /**
     * 批量送审数组，最多支持10个内容批量送审。
     */
    @JsonProperty("Contents")
    private List<AuditContentItem> contents;

    public BatchContentModerationRequest() {
    }

    public BatchContentModerationRequest(String auditName, List<AuditContentItem> contents) {
        this.auditName = auditName;
        this.contents = contents;
    }

    private BatchContentModerationRequest(Builder builder) {
        this.auditName = builder.auditName;
        this.contents = builder.contents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public List<AuditContentItem> getContents() {
        return contents;
    }

    public void setContents(List<AuditContentItem> contents) {
        this.contents = contents;
    }


    public static final class Builder {
        private String auditName;
        private List<AuditContentItem> contents;

        private Builder() {
        }

        public BatchContentModerationRequest build() {
            return new BatchContentModerationRequest(this);
        }

        public Builder auditName(String auditName) {
            this.auditName = auditName;
            return this;
        }

        public Builder contents(List<AuditContentItem> contents) {
            this.contents = contents;
            return this;
        }
    }
}
