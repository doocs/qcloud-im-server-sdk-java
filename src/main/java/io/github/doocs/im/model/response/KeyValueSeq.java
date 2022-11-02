package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KV 结构体
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
public class KeyValueSeq {
    /**
     * 键值对的Key，最大为100字节
     */
    @JsonProperty("Key")
    private String key;

    /**
     * 键值对的Value，最大为1000字节
     */
    @JsonProperty("Value")
    private String value;

    /**
     * 该条KV的版本号。会话成员调用首次设置时为0，设置成功后为1。
     * 后续每次设置需要将该条扩展的最新Seq传回后台，后台将校验该条KV是否被其他人修改过，
     * 若Seq不匹配该条KV设置失败，同时返回错误码。App管理员调用时不校验Seq。
     */
    @JsonProperty("Seq")
    private Long seq;

    private KeyValueSeq(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
        this.seq = builder.seq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }


    @Override
    public String toString() {
        return "KeyValueSeq{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", seq=" + seq +
                '}';
    }

    public static final class Builder {
        private String key;
        private String value;
        private Long seq;

        private Builder() {
        }

        public KeyValueSeq build() {
            return new KeyValueSeq(this);
        }

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Builder seq(Long seq) {
            this.seq = seq;
            return this;
        }
    }
}
