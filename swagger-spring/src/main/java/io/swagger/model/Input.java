package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Input
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-13T16:07:57.515Z[GMT]")
public class Input   {
  @JsonProperty("a")
  private BigDecimal a = null;

  @JsonProperty("b")
  private BigDecimal b = null;

  @JsonProperty("op")
  private String op = null;

  public Input a(BigDecimal a) {
    this.a = a;
    return this;
  }

  /**
   * Get a
   * @return a
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getA() {
    return a;
  }

  public void setA(BigDecimal a) {
    this.a = a;
  }

  public Input b(BigDecimal b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * @return b
  **/
  @ApiModelProperty(value = "")

  @Valid
  public BigDecimal getB() {
    return b;
  }

  public void setB(BigDecimal b) {
    this.b = b;
  }

  public Input op(String op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
  **/
  @ApiModelProperty(value = "")

  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.a, input.a) &&
        Objects.equals(this.b, input.b) &&
        Objects.equals(this.op, input.op);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, op);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
