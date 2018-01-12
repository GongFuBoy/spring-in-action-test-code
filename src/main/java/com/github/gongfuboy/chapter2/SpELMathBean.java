package com.github.gongfuboy.chapter2;

/**
 * @author GongFuBoy
 * @date 2018/1/12
 * @time 16:21
 */
public class SpELMathBean {

    private String add;

    private String device;

    private String multiply;

    private String subtract;

    private boolean equal;

    private boolean conditionalExpression;

    private boolean grep;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getMultiply() {
        return multiply;
    }

    public void setMultiply(String multiply) {
        this.multiply = multiply;
    }

    public String getSubtract() {
        return subtract;
    }

    public void setSubtract(String subtract) {
        this.subtract = subtract;
    }

    public boolean isEqual() {
        return equal;
    }

    public void setEqual(boolean equal) {
        this.equal = equal;
    }

    public boolean isConditionalExpression() {
        return conditionalExpression;
    }

    public void setConditionalExpression(boolean conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
    }

    @Override
    public String toString() {
        return "SpELMathBean{" +
                "add='" + add + '\'' +
                ", device='" + device + '\'' +
                ", multiply='" + multiply + '\'' +
                ", subtract='" + subtract + '\'' +
                ", equal=" + equal +
                ", conditionalExpression=" + conditionalExpression +
                ", grep=" + grep +
                '}';
    }

    public boolean isGrep() {
        return grep;
    }

    public void setGrep(boolean grep) {
        this.grep = grep;
    }
}
