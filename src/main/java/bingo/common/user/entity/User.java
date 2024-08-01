package bingo.common.user.entity;

import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * <p>
 * 
 * </p>
 *
 * @author Majiaju
 * @since 2024-08-01
 */
@Schema(name = "User", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "ID")
    private String id;

    @Schema(description = "名字")
    private String name;

    @Schema(description = "用户编码")
    private String code;

    @Schema(description = "密码")
    private String passwd;

    @Schema(description = "创建时间")
    private LocalDate createDate;

    @Schema(description = "更新时间")
    private LocalDate updateDate;

    @Schema(description = "操作人")
    private String operatorCode;

    @Schema(description = "操作人名称")
    private String operatorName;

    @Schema(description = "数据状态")
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
            "id = " + id +
            ", name = " + name +
            ", code = " + code +
            ", passwd = " + passwd +
            ", createDate = " + createDate +
            ", updateDate = " + updateDate +
            ", operatorCode = " + operatorCode +
            ", operatorName = " + operatorName +
            ", state = " + state +
        "}";
    }
}
